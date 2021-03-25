package controllers;

import Bean.IndividualMedicInfoBean;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import services.ChinhSuaThongTinService;

/**
 *
 * @author DAT
 */
public class ChinhSuaPanelController {

    private JPanel TimKiemJpn;
    private JPanel ChinhSuaJpn;
    private JTextField jtfSoCCCD;
    private JTextField jtfCachLy;
    private JTextField jtfHoTen;
    private JTextField jtfLamViec;
    private JTextField jtfThuongTru;
    private JTextField jtfCCCD;
    private JComboBox jcbDichTe;
    private IndividualMedicInfoBean chinhSua;
    private ChinhSuaThongTinService chinhSuaService;

    public ChinhSuaPanelController(JPanel TimKiemJpn, JPanel ChinhSuaJpn,
            JTextField jtfSoCCCD, JTextField jtfCachLy, JTextField jtfHoTen,
            JTextField jtfThuongTru, JTextField jtfLamViec, JTextField jtfCCCD,
            JComboBox jcbDichTe) {
        this.TimKiemJpn = TimKiemJpn;
        this.ChinhSuaJpn = ChinhSuaJpn;
        this.jtfSoCCCD = jtfSoCCCD;
        this.jtfCachLy = jtfCachLy;
        this.jtfHoTen = jtfHoTen;
        this.jtfLamViec = jtfLamViec;
        this.jtfThuongTru = jtfThuongTru;
        this.jtfCCCD = jtfCCCD;
        this.jcbDichTe = jcbDichTe;
        this.chinhSua = null;
        this.chinhSuaService = new ChinhSuaThongTinService();
    }

    public void timKiem() {
        ChinhSuaJpn.setVisible(false);
        if (jtfSoCCCD.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập số CCCD. Mời nhập lại!!!", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.chinhSua = this.chinhSuaService.getInfoByID(jtfSoCCCD.getText().trim());

        if (this.chinhSua.getChungMinhThuModel().getSoCMT() != null) {
            ChinhSuaJpn.setVisible(true);
            jtfHoTen.setText(this.chinhSua.getNhanKhauModel().getHoTen());
            jtfHoTen.setEditable(false);
            jtfThuongTru.setText(this.chinhSua.getNhanKhauModel().getNoiThuongTru());
            jtfThuongTru.setEditable(false);
            jtfLamViec.setText(this.chinhSua.getNhanKhauModel().getNoiLamViec());
            jtfLamViec.setEditable(false);
            jtfCCCD.setText(this.chinhSua.getChungMinhThuModel().getSoCMT());
            jtfCCCD.setEditable(false);
            jtfCachLy.setText(this.chinhSua.getKhaiBaoYTeModel().getTinhTrangCachLy());
            jcbDichTe.setSelectedItem(this.chinhSua.getKhaiBaoYTeModel().getTinhTrangDichTe());
        }
    }

    public void changeInfo() {
        String cachLy = jtfCachLy.getText().trim();
        String dichTe = jcbDichTe.getSelectedItem().toString();
        String soCCCD = jtfCCCD.getText().trim();
        this.chinhSuaService.editMedicInfo(soCCCD, dichTe, cachLy);
    }

}
