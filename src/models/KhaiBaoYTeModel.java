package models;

import java.util.Date;

/**
 *
 * @author Kuuhaku
 */
public class KhaiBaoYTeModel {

    private String ID;
    private String tinhTrangDichTe;
    private String tinhTrangCachLy;
    private Date lastTimeModified;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTinhTrangDichTe() {
        return tinhTrangDichTe;
    }

    public void setTinhTrangDichTe(String tinhTrangDichTe) {
        this.tinhTrangDichTe = tinhTrangDichTe;
    }

    public String getTinhTrangCachLy() {
        return tinhTrangCachLy;
    }

    public void setTinhTrangCachLy(String tinhTrangCachLy) {
        this.tinhTrangCachLy = tinhTrangCachLy;
    }

    public Date getLastTimeModified() {
        return lastTimeModified;
    }

    public void setLastTimeModified(Date lastTimeModified) {
        this.lastTimeModified = lastTimeModified;
    }

}
