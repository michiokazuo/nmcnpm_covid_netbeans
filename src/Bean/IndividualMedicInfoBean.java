package Bean;

import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import models.NhanKhauModel;

/**
 *
 * @author Kuuhaku
 */
public class IndividualMedicInfoBean {

    private ChungMinhThuModel chungMinhThuModel;
    private KhaiBaoYTeModel khaiBaoYTeModel;
    private NhanKhauModel nhanKhauModel;

    public IndividualMedicInfoBean(ChungMinhThuModel chungMinhThuModel,
            KhaiBaoYTeModel khaiBaoYTeModel, NhanKhauModel nhanKhauModel) {
        this.chungMinhThuModel = chungMinhThuModel;
        this.khaiBaoYTeModel = khaiBaoYTeModel;
        this.nhanKhauModel = nhanKhauModel;
    }

    public IndividualMedicInfoBean() {
        this.chungMinhThuModel = new ChungMinhThuModel();
        this.khaiBaoYTeModel = new KhaiBaoYTeModel();
        this.nhanKhauModel = new NhanKhauModel();
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

    public KhaiBaoYTeModel getKhaiBaoYTeModel() {
        return khaiBaoYTeModel;
    }

    public void setKhaiBaoYTeModel(KhaiBaoYTeModel khaiBaoYTeModel) {
        this.khaiBaoYTeModel = khaiBaoYTeModel;
    }

    @Override
    public String toString() {
        String s = chungMinhThuModel.getSoCMT() + " - "
                + nhanKhauModel.getHoTen() + " - "
                + khaiBaoYTeModel.getTinhTrangDichTe()
                + " - " + khaiBaoYTeModel.getTinhTrangCachLy()
                + " - " + khaiBaoYTeModel.getLastTimeModified().toString();
        return s;
    }

}
