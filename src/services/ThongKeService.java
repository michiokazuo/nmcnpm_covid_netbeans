package services;

import Bean.IndividualMedicInfoBean;
import Bean.NguoiChuaKhaiBaoYTeBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import models.NhanKhauModel;

/**
 *
 * @author Kuuhaku
 */
public class ThongKeService {

    public int getNumOfNguoiKhaiBaoYTe() {
        int numOfPeople = 0;
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
//            Date modifiedTime = new Date();
            String query = "SELECT COUNT(*) AS 'tongSoNguoiKhaiBao' FROM khai_bao_y_te";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                numOfPeople = rs.getInt("tongSoNguoiKhaiBao");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }
        return numOfPeople;
    }

    public int getNumOfNhanKhau() {
        int numOfPeople = 0;
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
//            Date modifiedTime = new Date();
            String query = "SELECT COUNT(*) AS 'tongNhanKhau' FROM nhan_khau";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                numOfPeople = rs.getInt("tongNhanKhau");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }
        return numOfPeople;
    }

    public int getPctOfNguoiKhaiBaoYTe() {
        int SoLuongKBYT = getNumOfNguoiKhaiBaoYTe();
        int SoLuongNhanKhau = getNumOfNhanKhau();
        int numOfPeople = (SoLuongKBYT * 100 / SoLuongNhanKhau);
        return numOfPeople;
    }

    public List<NguoiChuaKhaiBaoYTeBean> getListNguoiChuaKhaiBaoYTe() {
        List<NguoiChuaKhaiBaoYTeBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT *\n"
                    + "FROM nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau\n"
                    + "WHERE chung_minh_thu.soCMT NOT IN (SELECT soCMT FROM khai_bao_y_te)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NguoiChuaKhaiBaoYTeBean nguoiChuaKhaiBaoYTe = new NguoiChuaKhaiBaoYTeBean();
                NhanKhauModel nhanKhauModel = nguoiChuaKhaiBaoYTe.getNhanKhauModel();
                nhanKhauModel.setHoTen(rs.getString("hoTen"));
                nhanKhauModel.setDiaChiHienNay(rs.getString("diaChiHienNay"));

                ChungMinhThuModel chungMinhThuModel = nguoiChuaKhaiBaoYTe.getChungMinhThuModel();
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));

                list.add(nguoiChuaKhaiBaoYTe);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<IndividualMedicInfoBean> getListNguoiKhaiBaoYTe(Date tuNgay, Date denNgay, String tinhTrangDichTe) {
        List<IndividualMedicInfoBean> list = new ArrayList<>();

        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT* FROM ((nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau) \n"
                    + "INNER JOIN khai_bao_y_te ON khai_bao_y_te.soCMT = chung_minh_thu.soCMT)\n"
                    + "WHERE khai_bao_y_te.lastTimeModified >= ? AND khai_bao_y_te.lastTimeModified <= ?";
            if (!tinhTrangDichTe.equalsIgnoreCase("Toan Bo")) {
                query += " AND khai_bao_y_te.tinhTrangDichTe LIKE '%" + tinhTrangDichTe + "%'";
            }
            query += " ORDER BY lastTimeModified DESC";

            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            java.sql.Date tuNgaySQL = new java.sql.Date(tuNgay.getTime());
            preparedStatement.setDate(1, tuNgaySQL);
            java.sql.Date denNgaySQL = new java.sql.Date(denNgay.getTime());
            preparedStatement.setDate(2, denNgaySQL);
            ResultSet rs = preparedStatement.executeQuery();
            int idNhanKhau = -1;
            while (rs.next()) {
                IndividualMedicInfoBean individualMedicInfo = new IndividualMedicInfoBean();
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

                chungMinhThuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

                khaiBaoYTeModel.setID(rs.getString("soCMT"));
                khaiBaoYTeModel.setTinhTrangDichTe(rs.getString("tinhTrangDichTe"));
                khaiBaoYTeModel.setTinhTrangCachLy(rs.getString("tinhTrangCachLy"));
                khaiBaoYTeModel.setLastTimeModified(rs.getDate("lastTimeModified"));

                list.add(individualMedicInfo);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }

}
