package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Bean.IndividualMedicInfoBean;
import java.sql.Statement;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import models.NhanKhauModel;
import java.util.InputMismatchException;
import java.util.Date;

/**
 *
 * @author Kuuhaku
 */
public class ChinhSuaThongTinService {

    public IndividualMedicInfoBean getInfoByID(String cmt) {
        IndividualMedicInfoBean individualMedicInfo = new IndividualMedicInfoBean();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT* FROM ((nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau) \n"
                    + "INNER JOIN khai_bao_y_te ON khai_bao_y_te.soCMT = chung_minh_thu.soCMT)\n"
                    + "WHERE khai_bao_y_te.soCMT = " + cmt;
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            int idNhanKhau = -1;
            while (rs.next()) {
                NhanKhauModel nhanKhau = individualMedicInfo.getNhanKhauModel();
                ChungMinhThuModel chungMinhThuModel = individualMedicInfo.getChungMinhThuModel();
                KhaiBaoYTeModel khaiBaoYTeModel = individualMedicInfo.getKhaiBaoYTeModel();
                idNhanKhau = rs.getInt("idNhanKhau");
                nhanKhau.setID(idNhanKhau);
                nhanKhau.setBietDanh(rs.getString("bietDanh"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNguyenQuan(rs.getString("nguyenQuan"));
                nhanKhau.setTonGiao(rs.getString("tonGiao"));
                nhanKhau.setDanToc(rs.getString("danToc"));
                nhanKhau.setQuocTich(rs.getString("quocTich"));
                nhanKhau.setSoHoChieu(rs.getString("soHoChieu"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                nhanKhau.setDiaChiHienNay(rs.getString("diaChiHienNay"));
                nhanKhau.setNoiLamViec(rs.getString("noiLamViec"));
                // con nhieu nua
                chungMinhThuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

                khaiBaoYTeModel.setID(rs.getString("soCMT"));
                khaiBaoYTeModel.setTinhTrangDichTe(rs.getString("tinhTrangDichTe"));
                khaiBaoYTeModel.setTinhTrangCachLy(rs.getString("tinhTrangCachLy"));
                khaiBaoYTeModel.setLastTimeModified(rs.getDate("lastTimeModified"));
            }
            preparedStatement.close();

            if (idNhanKhau <= 0) {
                throw new InputMismatchException("SỐ CMT/CCCD NHẬP VÀO KHÔNG CÓ TRONG CƠ SỞ DỮ LIỆU\nNguyên nhân có thể gây ra lỗi:\n"
                        + "1. Số CMT/CCCD nhập vào không đúng.\n2. Người đang tìm kiếm chưa khai báo y tế\n3. Người đang tìm kiếm không ở trong khu vực quản lý");
            }

            connection.close();
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }

        return individualMedicInfo;
    }

    public void editMedicInfo(String soCMT, String tinhTrangDichTe, String tinhTrangCachLy) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            Date modifiedTime = new Date();

            String query = "UPDATE khai_bao_y_te SET tinhTrangDichTe = ?, tinhTrangCachLy = ?, lastTimeModified =? WHERE soCMT = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, tinhTrangDichTe);
            preparedStatement.setString(2, tinhTrangCachLy);
            java.sql.Date lastTimeModified = new java.sql.Date(modifiedTime.getTime());
            preparedStatement.setDate(3, lastTimeModified);
            preparedStatement.setString(4, soCMT);
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();

            connection.close();
            JOptionPane.showMessageDialog(null, "Thay đổi thông tin thành công!!!",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }

    }

    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }

}
