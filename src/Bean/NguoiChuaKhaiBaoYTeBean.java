package Bean;

import models.ChungMinhThuModel;
import models.NhanKhauModel;

/**
 *
 * @author Kuuhaku
 */
public class NguoiChuaKhaiBaoYTeBean {

    private ChungMinhThuModel chungMinhThuModel;
    private NhanKhauModel nhanKhauModel;

    public NguoiChuaKhaiBaoYTeBean(ChungMinhThuModel chungMinhThuModel,
            NhanKhauModel nhanKhauModel) {
        this.chungMinhThuModel = chungMinhThuModel;
        this.nhanKhauModel = nhanKhauModel;
    }

    public ChungMinhThuModel getChungMinhThuModel() {
        return chungMinhThuModel;
    }

    public void setChungMinhThuModel(ChungMinhThuModel chungMinhThuModel) {
        this.chungMinhThuModel = chungMinhThuModel;
    }

    public NhanKhauModel getNhanKhauModel() {
        return nhanKhauModel;
    }

    public void setNhanKhauModel(NhanKhauModel nhanKhauModel) {
        this.nhanKhauModel = nhanKhauModel;
    }

    public NguoiChuaKhaiBaoYTeBean() {
        this.chungMinhThuModel = new ChungMinhThuModel();
        this.nhanKhauModel = new NhanKhauModel();
    }

    @Override
    public String toString() {
        String s = chungMinhThuModel.getSoCMT() + " - "
                + nhanKhauModel.getHoTen() + " - "
                + nhanKhauModel.getDiaChiHienNay();
        return s;
    }

}