package controllers;

import javax.swing.JLabel;
import services.ThongKeService;

/**
 *
 */
public class HomeCotroller {

    private JLabel tongNhanKhauLb;
    private JLabel tongKBYT;
    private JLabel pctKBYT;

    public HomeCotroller(JLabel tongNhanKhauLb, JLabel tongHoKhau, JLabel nhanKhauTamTruLb) {
        this.tongNhanKhauLb = tongNhanKhauLb;
        this.tongKBYT = tongHoKhau;
        this.pctKBYT = nhanKhauTamTruLb;
    }

    public void setData() {
        ThongKeService tool = new ThongKeService();
        Integer tongNhanKhau = tool.getNumOfNhanKhau();
        Integer tongKBYT = tool.getNumOfNguoiKhaiBaoYTe();
        Integer pctKBYT = tool.getPctOfNguoiKhaiBaoYTe();
        this.tongNhanKhauLb.setText(tongNhanKhau.toString());
        this.tongKBYT.setText(tongKBYT.toString());
        this.pctKBYT.setText(pctKBYT.toString() + "%");
    }

    public JLabel getTongNhanKhauLb() {
        return tongNhanKhauLb;
    }

    public void setTongNhanKhauLb(JLabel tongNhanKhauLb) {
        this.tongNhanKhauLb = tongNhanKhauLb;
    }

    public JLabel getTongKBYT() {
        return tongKBYT;
    }

    public void setTongHoKhau(JLabel tongHoKhauLb) {
        this.tongKBYT = tongHoKhauLb;
    }

    public JLabel getPctKBYT() {
        return pctKBYT;
    }

    public void setPctKBYT(JLabel pctKBYT) {
        this.pctKBYT = pctKBYT;
    }

}
