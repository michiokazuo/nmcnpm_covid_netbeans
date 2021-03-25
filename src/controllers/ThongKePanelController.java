package controllers;

import Bean.NguoiChuaKhaiBaoYTeBean;
import Bean.IndividualMedicInfoBean;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.NhanKhauModel;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import views.ClassTableModel;
import services.ThongKeService;

/**
 *
 * @author Tinh
 */
public class ThongKePanelController {

    private JPanel jpnView;
    private com.toedter.calendar.JDateChooser tuNgayJdc;
    private com.toedter.calendar.JDateChooser denNgayJdc;
    private JComboBox jcbTinhTrangDichTe;
    private ThongKeService thongKeService;
    private List<NguoiChuaKhaiBaoYTeBean> listNguoiChuaKhaiBaoYTeBeans;
    private List<IndividualMedicInfoBean> listNguoiDaKhaiBaoYTeBeans;
    private ClassTableModel classTableModel;
    private final String[] COLUMNSCHUAKHAIBAO = {"Họ tên", "Số CMT/CCCD",
        "Địa chỉ hiện nay"};
    private final String[] COLUMNSDAKHAIBAO = {"Họ tên", "Số CMT/CCCD", "Ngày sinh",
        "Địa chỉ hiện nay", "Tình trạng dịch tễ", "Tình trạng cách ly",
        "Thời gian cập nhật lần cuối"};

    public ThongKePanelController(com.toedter.calendar.JDateChooser jdcTuNgay,
            com.toedter.calendar.JDateChooser jdcDenNgay,
            JComboBox jcbTinhTrangDichTe, JPanel jpnView) {
        this.jpnView = jpnView;
        this.tuNgayJdc = jdcTuNgay;
        this.denNgayJdc = jdcDenNgay;
        this.thongKeService = new ThongKeService();
        this.jcbTinhTrangDichTe = jcbTinhTrangDichTe;
        this.listNguoiChuaKhaiBaoYTeBeans = new ArrayList<>();
        this.listNguoiChuaKhaiBaoYTeBeans = this.thongKeService
                .getListNguoiChuaKhaiBaoYTe();
        this.listNguoiDaKhaiBaoYTeBeans = new ArrayList<>();
        this.classTableModel = new ClassTableModel();
    }

    public JPanel getJpnView() {
        return jpnView;
    }

    public void setJpnView(JPanel jpnView) {
        this.jpnView = jpnView;
    }

    public String setSoNguoiKhaiBao() {
        int NumOfNguoiKhaiBaoYTe = this.thongKeService.getNumOfNguoiKhaiBaoYTe();
        int NumOfNhanKhau = this.thongKeService.getNumOfNhanKhau();
        float ratio = (float) 100 * NumOfNguoiKhaiBaoYTe / NumOfNhanKhau;
        return (NumOfNguoiKhaiBaoYTe + "/" + NumOfNhanKhau + " ("
                + String.format("%.2f", ratio) + "%)");
    }

    public void setData(int i) {
        if (i == 0) {
            this.listNguoiChuaKhaiBaoYTeBeans = this.thongKeService
                    .getListNguoiChuaKhaiBaoYTe();
        } else {
            System.out.printf((String) this.jcbTinhTrangDichTe.getSelectedItem());
            this.listNguoiDaKhaiBaoYTeBeans = this.thongKeService
                    .getListNguoiKhaiBaoYTe(this.tuNgayJdc.getDate(),
                            this.denNgayJdc.getDate(),
                            (String) this.jcbTinhTrangDichTe.getSelectedItem());
        }
        setDataTable(i);
    }

    public void setDataTable(int i) {
        JTable table;
        if (i == 0) {
            List<NhanKhauModel> listNhanKhauModel = new ArrayList<>();
            List<ChungMinhThuModel> listChungMinhThuModel = new ArrayList<>();
            this.listNguoiChuaKhaiBaoYTeBeans.forEach(nhankhau -> {
                listNhanKhauModel.add(nhankhau.getNhanKhauModel());
                listChungMinhThuModel.add(nhankhau.getChungMinhThuModel());
            });
            DefaultTableModel model = classTableModel
                    .setTableDanhSachNhungNguoiChuaKhaiBaoYTe(listChungMinhThuModel,
                            listNhanKhauModel, COLUMNSCHUAKHAIBAO);
            table = new JTable(model);
            table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
            table.getTableHeader().setPreferredSize(new Dimension(100, 50));
            table.setRowHeight(50);
            table.validate();
            table.repaint();
            table.setFont(new Font("Arial", Font.PLAIN, 14));
            table.getColumnModel().getColumn(0).setMaxWidth(200);
            table.getColumnModel().getColumn(0).setMinWidth(200);
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            table.getColumnModel().getColumn(1).setMaxWidth(150);
            table.getColumnModel().getColumn(1).setMinWidth(150);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
        } else {
            List<NhanKhauModel> listNhanKhauModel = new ArrayList<>();
            List<ChungMinhThuModel> listChungMinhThuModel = new ArrayList<>();
            List<KhaiBaoYTeModel> listKhaiBaoYTeModel = new ArrayList<>();
            this.listNguoiDaKhaiBaoYTeBeans.forEach(nhankhau -> {
                listNhanKhauModel.add(nhankhau.getNhanKhauModel());
                listChungMinhThuModel.add(nhankhau.getChungMinhThuModel());
                listKhaiBaoYTeModel.add(nhankhau.getKhaiBaoYTeModel());
            });
            DefaultTableModel model = classTableModel
                    .setTableDanhSachNhungNguoiDaKhaiBaoYTe(listNhanKhauModel,
                            listChungMinhThuModel, listKhaiBaoYTeModel,
                            COLUMNSDAKHAIBAO);
            table = new JTable(model);
            table.getTableHeader().setPreferredSize(new Dimension(100, 50));
            table.setRowHeight(50);
            table.validate();
            table.repaint();
            table.setFont(new Font("Arial", Font.PLAIN, 14));
            table.getColumnModel().getColumn(0).setMaxWidth(200);
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(135);
            table.getColumnModel().getColumn(1).setMinWidth(30);
            table.getColumnModel().getColumn(1).setMaxWidth(100);
            table.getColumnModel().getColumn(1).setPreferredWidth(100);
            table.getColumnModel().getColumn(2).setMinWidth(30);
            table.getColumnModel().getColumn(2).setMaxWidth(85);
            table.getColumnModel().getColumn(2).setPreferredWidth(85);
            table.getColumnModel().getColumn(4).setMinWidth(10);
            table.getColumnModel().getColumn(4).setMaxWidth(100);
            table.getColumnModel().getColumn(4).setPreferredWidth(75);
        }

        // thiet ke bang
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }

}
