/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Bean.IndividualMedicInfoBean;
import Bean.NhanKhauBean;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import services.ThemMoiService;
import services.ChinhSuaThongTinService;

/**
 *
 * @author Nguyen
 */
public class ThemMoiPanelController {

    private JPanel khaiBaoJpn;
    private JPanel hienThiJpn;
    private JTextField hoTenJtf;
    private JTextField soCCCDJtf;
    private JTextField tinhTrangCachLyJtf;
    private JTextField hoTenJtf2;
    private JTextField soCCCDJtf2;
    private JTextField cachLyJtf2;
    private JTextField thuongTruJtf2;
    private JTextField lamViecJtf2;
    private JTextField dichTeJtf2;
    private JComboBox jComboBox1;
    private JButton cancelBtn;
    private JButton okBtn;
    private JButton backBtn;
    private ThemMoiService themMoiService;
    private IndividualMedicInfoBean chinhSua2;
    private ChinhSuaThongTinService chinhSuaService2;
    private NhanKhauBean inforF;
    private IndividualMedicInfoBean caNhan = new IndividualMedicInfoBean();

    public ThemMoiPanelController(JPanel khaiBaoJpn, JPanel hienThiJpn,
            JTextField hoTenJtf, JTextField soCCCDJtf, JTextField tinhTrangCachLyJtf,
            JTextField hoTenJtf2, JTextField soCCCDJtf2, JTextField thuongTruJtf2,
            JTextField lamViecJtf2, JTextField cachLyJtf2, JTextField dichTeJtf2,
            JComboBox jComboBox1, JButton cancelBtn, JButton okBtn, JButton backBtn) {

        this.khaiBaoJpn = khaiBaoJpn;
        this.hienThiJpn = hienThiJpn;
        this.hoTenJtf = hoTenJtf;
        this.soCCCDJtf = soCCCDJtf;
        this.tinhTrangCachLyJtf = tinhTrangCachLyJtf;
        this.hoTenJtf2 = hoTenJtf2;
        this.soCCCDJtf2 = soCCCDJtf2;
        this.thuongTruJtf2 = thuongTruJtf2;
        this.lamViecJtf2 = lamViecJtf2;
        this.cachLyJtf2 = cachLyJtf2;
        this.dichTeJtf2 = dichTeJtf2;
        this.jComboBox1 = jComboBox1;
        this.okBtn = okBtn;
        this.cancelBtn = cancelBtn;
        this.backBtn = backBtn;
        this.chinhSua2 = null;
        this.chinhSuaService2 = new ChinhSuaThongTinService();
        this.themMoiService = new ThemMoiService();
        this.inforF = null;
    }

    private void setDataCaNhan() {
        this.caNhan.getNhanKhauModel().setHoTen(this.hoTenJtf.getText().trim());
        this.caNhan.getChungMinhThuModel()
                .setSoCMT(this.soCCCDJtf.getText().trim());
        this.caNhan.getKhaiBaoYTeModel()
                .setTinhTrangCachLy(this.tinhTrangCachLyJtf.getText().trim());
        this.caNhan.getKhaiBaoYTeModel()
                .setTinhTrangDichTe(this.jComboBox1.getSelectedItem().toString());

    }

    public void addNewMedicRecord() {
        try {
            setDataCaNhan();
            hienThiJpn.setVisible(false);
            this.themMoiService.addNewMedicRecord(caNhan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showInfo2() {
        this.chinhSua2 = this.chinhSuaService2.getInfoByID(soCCCDJtf.getText().trim());
        if (this.chinhSua2.getChungMinhThuModel().getSoCMT() != null) {
            hienThiJpn.setVisible(true);
            hoTenJtf2.setText(this.chinhSua2.getNhanKhauModel().getHoTen());
            hoTenJtf2.setEditable(false);
            thuongTruJtf2.setText(this.chinhSua2.getNhanKhauModel().getNoiThuongTru());
            thuongTruJtf2.setEditable(false);
            lamViecJtf2.setText(this.chinhSua2.getNhanKhauModel().getNoiLamViec());
            lamViecJtf2.setEditable(false);
            soCCCDJtf2.setText(this.chinhSua2.getChungMinhThuModel().getSoCMT());
            soCCCDJtf2.setEditable(false);
            cachLyJtf2.setText(this.chinhSua2.getKhaiBaoYTeModel().getTinhTrangCachLy());
            cachLyJtf2.setEditable(false);
            dichTeJtf2.setText(this.chinhSua2.getKhaiBaoYTeModel().getTinhTrangDichTe());
            dichTeJtf2.setEditable(false);
        }
    }

}
