package Bean;

import models.ChungMinhThuModel;
import models.NhanKhauModel;

/**
 *
 * @author Hai
 */
public class NhanKhauBean {

    private NhanKhauModel nhanKhauModel;
    private ChungMinhThuModel chungMinhThuModel;
    private String tinhTrangDichTe;

    public NhanKhauBean(NhanKhauModel nhanKhauModel,
            ChungMinhThuModel chungMinhThuModel) {
        this.nhanKhauModel = nhanKhauModel;
        this.chungMinhThuModel = chungMinhThuModel;
        this.tinhTrangDichTe = new String();
    }

    public NhanKhauBean(NhanKhauModel nhanKhauModel,
            ChungMinhThuModel chungMinhThuModel, String tinhTrangDichTe) {
        this.nhanKhauModel = nhanKhauModel;
        this.chungMinhThuModel = chungMinhThuModel;
        this.tinhTrangDichTe = tinhTrangDichTe;
    }

    public NhanKhauBean() {
        this.nhanKhauModel = new NhanKhauModel();
        this.chungMinhThuModel = new ChungMinhThuModel();
        this.tinhTrangDichTe = new String();
    }

    public String getTinhTrangDichTe() {
        return tinhTrangDichTe;
    }

    public void setTinhTrangDichTe(String tinhTrangDichTe) {
        this.tinhTrangDichTe = tinhTrangDichTe;
    }

    public NhanKhauModel getNhanKhauModel() {
        return nhanKhauModel;
    }

    public void setNhanKhauModel(NhanKhauModel nhanKhauModel) {
        this.nhanKhauModel = nhanKhauModel;
    }

    public ChungMinhThuModel getChungMinhThuModel() {
        return chungMinhThuModel;
    }

    public void setChungMinhThuModel(ChungMinhThuModel chungMinhThuModel) {
        this.chungMinhThuModel = chungMinhThuModel;
    }

    @Override
    public String toString() {
        String s = chungMinhThuModel.getSoCMT() + " - "
                + nhanKhauModel.getHoTen() + " - "
                + nhanKhauModel.getDiaChiHienNay() + " - "
                + nhanKhauModel.getNoiLamViec() + " - "
                + tinhTrangDichTe;
        return s;

    }
}
