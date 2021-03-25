/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Bean.IndividualMedicInfoBean;
import Bean.NhanKhauBean;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import services.TimKiemService;
import views.ClassTableModel;

/**
 *
 * @author PHONG
 */
public class TimKiemPanelController {

    private JPanel jUserinfor;
    private JPanel jView;
    private JTextField tenFJtf;
    private JTextField soCCCDFJtf;
    private JTextField nhaRiengFJtf;
    private JTextField lamViecFJtf;
    private JTextField dichTeFJtf;
    private JTextField hoTenJtf;
    private JTextField soCCCDJtf;
    private JTextField doTuoiJtf;
    private JTextField diaChiJtf;
    private JTextField toiJtf;
    private JComboBox tinhTrangJcb;
    private JRadioButton timKiemCovidJrb;
    private List<IndividualMedicInfoBean> listFn;
    private NhanKhauBean inforF;
    private ClassTableModel classTableModel;
    private TimKiemService timKiemService;
    private final String[] COLUMNF = {"Họ & tên", "Số CMT/CCCD", "Ngày sinh",
        "Địa chỉ nhà riêng", "Địa chỉ làm việc", "Tình trạng dịch tễ",
        "Tình trạng cách ly"};
    private final String[] COLUMNFn = {"Họ tên", "Số CMT/CCCD", "Ngày sinh",
        "Địa chỉ nhà riêng", "Địa chỉ làm việc", "Tình trạng dịch tễ dự đoán"};

    public TimKiemPanelController(JPanel jUser, JPanel jp, JTextField hoTenJtf,
            JTextField soCCCDJtf, JTextField doTuoiJtf, JTextField diaChiJtf,
            JTextField toiJtf, JComboBox tinhTrangJcb, JTextField tenFJtf,
            JTextField soCCCDFJtf, JTextField nhaRiengFJtf, JTextField lamViecFJtf,
            JTextField dichTeFJtf,
            JRadioButton timKiemCovidJrb) {
        this.jUserinfor = jUser;
        this.jView = jp;
        this.hoTenJtf = hoTenJtf;
        this.soCCCDJtf = soCCCDJtf;
        this.diaChiJtf = diaChiJtf;
        this.doTuoiJtf = doTuoiJtf;
        this.toiJtf = toiJtf;
        this.tinhTrangJcb = tinhTrangJcb;
        this.tenFJtf = tenFJtf;
        this.nhaRiengFJtf = nhaRiengFJtf;
        this.soCCCDFJtf = soCCCDFJtf;
        this.lamViecFJtf = lamViecFJtf;
        this.dichTeFJtf = dichTeFJtf;
        this.timKiemCovidJrb = timKiemCovidJrb;
        this.listFn = null;
        this.inforF = null;
        this.classTableModel = new ClassTableModel();
        this.timKiemService = new TimKiemService();
    }

    public void showRS() {
        if (timKiemCovidJrb.isSelected()) {
            showUserInfor();
        } else {
            showDanhSachTKChung();
        }
    }

    private void showUserInfor() {
        try {
            jUserinfor.setVisible(true);
            tenFJtf.setText(null);
            soCCCDFJtf.setText(null);
            nhaRiengFJtf.setText(null);
            lamViecFJtf.setText(null);
            dichTeFJtf.setText(null);
            jView.removeAll();
            jView.repaint();
            // tìm kiếm đầu vào
            Integer tu = doTuoiJtf.getText().trim().equals("")
                    ? 0 : Integer.parseInt(doTuoiJtf.getText().trim());
            Integer toi = toiJtf.getText().trim().equals("")
                    ? 1000 : Integer.parseInt(toiJtf.getText().trim());
            inforF = timKiemService.getInfoByInput(hoTenJtf.getText().trim(),
                    soCCCDJtf.getText().trim(), diaChiJtf.getText().trim(), tu,
                    toi, tinhTrangJcb.getSelectedItem().toString());

            if (inforF == null) {
                throw new Exception("Không tìm thấy nguồn nhiễm!!!");
            } else {
                // điền thông tin đầu vào
                tenFJtf.setText(inforF.getNhanKhauModel().getHoTen());
                soCCCDFJtf.setText(inforF.getChungMinhThuModel().getSoCMT());
                nhaRiengFJtf.setText(inforF.getNhanKhauModel().getDiaChiHienNay());
                lamViecFJtf.setText(inforF.getNhanKhauModel().getNoiLamViec());
                dichTeFJtf.setText(inforF.getTinhTrangDichTe());

                // điền thông tin Fx
                setDataTable(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showDanhSachTKChung() {
        try {
            jUserinfor.setVisible(false);
            jView.removeAll();
            jView.repaint();
            setDataTable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setDataTable(boolean check) throws Exception {
        JTable table = new JTable();
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        jView.removeAll();
        jView.repaint();
        if (check) {
            List<NhanKhauBean> beans = timKiemService.listF1F2(inforF);
            if (beans == null || beans.isEmpty()) {
                throw new Exception("Không tìm thấy người nghi lây nhiễm!!!");
            } else {
                DefaultTableModel model = classTableModel
                        .setTableDanhSachNguoiTiepXuc(beans, COLUMNFn);
                table.setModel(model);
                table.getTableHeader().setPreferredSize(new Dimension(100, 50));
                table.setRowHeight(50);
                table.validate();
                table.repaint();
                table.setFont(new Font("Arial", Font.PLAIN, 14));
                table.setModel(model);
                table.getColumnModel().getColumn(0).setMaxWidth(200);
                table.getColumnModel().getColumn(0).setMinWidth(50);
                table.getColumnModel().getColumn(0).setPreferredWidth(135);
                table.getColumnModel().getColumn(1).setMinWidth(30);
                table.getColumnModel().getColumn(1).setMaxWidth(100);
                table.getColumnModel().getColumn(1).setPreferredWidth(100);
                table.getColumnModel().getColumn(2).setMinWidth(30);
                table.getColumnModel().getColumn(2).setMaxWidth(85);
                table.getColumnModel().getColumn(2).setPreferredWidth(85);
                table.getColumnModel().getColumn(3).setMinWidth(50);
                table.getColumnModel().getColumn(3).setMaxWidth(150);
                table.getColumnModel().getColumn(3).setPreferredWidth(120);
                table.getColumnModel().getColumn(4).setMinWidth(50);
                table.getColumnModel().getColumn(4).setMaxWidth(150);
                table.getColumnModel().getColumn(4).setPreferredWidth(120);
            }

        } else {
            Integer tu = doTuoiJtf.getText().trim().equals("")
                    ? 0 : Integer.parseInt(doTuoiJtf.getText().trim());
            Integer toi = toiJtf.getText().trim().equals("")
                    ? 1000 : Integer.parseInt(toiJtf.getText().trim());

            List<IndividualMedicInfoBean> beans = timKiemService
                    .getListTimKiemChung(hoTenJtf.getText().trim(),
                            soCCCDJtf.getText().trim(), diaChiJtf.getText().trim(),
                            tu, toi, tinhTrangJcb.getSelectedItem().toString());
            if (beans == null || beans.isEmpty()) {
                throw new Exception("Không tìm thấy người theo yêu cầu!!!");
            } else {
                DefaultTableModel model = classTableModel
                        .setTableDanhSachTimKiem(beans, COLUMNF);
                table.setModel(model);
                table.getTableHeader().setPreferredSize(new Dimension(100, 50));
                table.setRowHeight(50);
                table.validate();
                table.repaint();
                table.setFont(new Font("Arial", Font.PLAIN, 14));
                table.setModel(model);
                table.getColumnModel().getColumn(0).setMaxWidth(200);
                table.getColumnModel().getColumn(0).setMinWidth(50);
                table.getColumnModel().getColumn(0).setPreferredWidth(135);
                table.getColumnModel().getColumn(1).setMinWidth(30);
                table.getColumnModel().getColumn(1).setMaxWidth(100);
                table.getColumnModel().getColumn(1).setPreferredWidth(100);
                table.getColumnModel().getColumn(2).setMinWidth(30);
                table.getColumnModel().getColumn(2).setMaxWidth(85);
                table.getColumnModel().getColumn(2).setPreferredWidth(85);
                table.getColumnModel().getColumn(3).setMinWidth(50);
                table.getColumnModel().getColumn(3).setMaxWidth(150);
                table.getColumnModel().getColumn(3).setPreferredWidth(120);
                table.getColumnModel().getColumn(4).setMinWidth(50);
                table.getColumnModel().getColumn(4).setMaxWidth(150);
                table.getColumnModel().getColumn(4).setPreferredWidth(120);
                table.getColumnModel().getColumn(5).setMinWidth(10);
                table.getColumnModel().getColumn(5).setMaxWidth(100);
                table.getColumnModel().getColumn(5).setPreferredWidth(75);
            }

        }
        // thiet ke bang
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jView.removeAll();
        jView.setLayout(new CardLayout());
        jView.add(scroll);
        jView.validate();
        jView.repaint();
    }

}
