package services;

import Bean.IndividualMedicInfoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import models.NhanKhauModel;
import java.util.InputMismatchException;

/**
 *
 * @author Kuuhaku
 */
public class ThemMoiService {

    public void addNewMedicRecord(IndividualMedicInfoBean individualMedicInfo) {
        NhanKhauModel nhanKhau = individualMedicInfo.getNhanKhauModel();
        ChungMinhThuModel chungMinhThu = individualMedicInfo.getChungMinhThuModel();
        KhaiBaoYTeModel khaiBaoYTe = individualMedicInfo.getKhaiBaoYTeModel();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            Date modifiedTime = new Date();
            String query = "SELECT* FROM nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau "
                    + "WHERE chung_minh_thu.soCMT = " + chungMinhThu.getSoCMT()
                    + " AND nhan_khau.hoTen LIKE '%" + nhanKhau.getHoTen() + "%'";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            int idNhanKhau = -1;
            while (rs.next()) {
                idNhanKhau = rs.getInt("idNhanKhau");
            }
            preparedStatement.close();

            if (idNhanKhau <= 0) {
                throw new InputMismatchException("Người khai báo không ở trong khu vực quản lý");
            }

            query = "SELECT* FROM khai_bao_y_te INNER JOIN chung_minh_thu ON khai_bao_y_te.soCMT = chung_minh_thu.soCMT\n"
                    + "WHERE chung_minh_thu.soCMT = " + chungMinhThu.getSoCMT();
            preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            idNhanKhau = -1;
            Date thoiGianKhaiBao = new Date();
            while (rs.next()) {
                idNhanKhau = rs.getInt("idNhanKhau");
                thoiGianKhaiBao = rs.getDate("lastTimeModified");

            }
            preparedStatement.close();

            if (idNhanKhau > 0) {
                throw new InputMismatchException("Người khai báo đã từng khai báo y tế vào ngày " + thoiGianKhaiBao.toString());
            }

            query = "INSERT INTO khai_bao_y_te (soCMT, tinhTrangDichTe, tinhTrangCachLy, lastTimeModified)"
                    + " values (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, chungMinhThu.getSoCMT());
            preparedStatement.setString(2, khaiBaoYTe.getTinhTrangDichTe());
            preparedStatement.setString(3, khaiBaoYTe.getTinhTrangCachLy());
            java.sql.Date lastTimeModified = new java.sql.Date(modifiedTime.getTime());
            preparedStatement.setDate(4, lastTimeModified);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            connection.close();
            JOptionPane.showMessageDialog(null, "Khai báo thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }

    }

    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }

}
