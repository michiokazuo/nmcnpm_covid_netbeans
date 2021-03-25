package services;

import java.util.ArrayList;
import java.util.List;
import Bean.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;
import models.NhanKhauModel;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kuuhaku
 */
public class TimKiemService {

    //--Đưa ra danh sách nguoi duoc tim kiem theo cac tieu chi
    public List<IndividualMedicInfoBean> getListTimKiemChung(String hoTen, String soCMT,
            String diaChiHienNay, int tuTuoi, int denTuoi, String tinhTrangDichTe) {
        List<IndividualMedicInfoBean> list = new ArrayList<>();

        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT* FROM ((nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau) \n"
                    + "INNER JOIN khai_bao_y_te ON khai_bao_y_te.soCMT = chung_minh_thu.soCMT)"
                    + "WHERE nhan_khau.hoTen LIKE ? AND chung_minh_thu.soCMT LIKE ? "
                    + "AND ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) >= ? "
                    + "AND ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) <= ? "
                    + "AND nhan_khau.diaChiHienNay LIKE ?";
            if (!tinhTrangDichTe.equalsIgnoreCase("Toan Bo")) {
                query += " AND khai_bao_y_te.tinhTrangDichTe LIKE '%" + tinhTrangDichTe + "%'";
            }
            query += " ORDER BY khai_bao_y_te.lastTimeModified DESC";

            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + hoTen + "%");
            preparedStatement.setString(2, "%" + soCMT + "%");
            preparedStatement.setInt(3, tuTuoi);
            preparedStatement.setInt(4, denTuoi);
            preparedStatement.setString(5, "%" + diaChiHienNay + "%");
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
                nhanKhau.setNoiLamViec(rs.getString("noiLamViec"));

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
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return list;
    }

    // Lây thông tin người F0/F1 để tìm kiếm F1, F2 
    // --> yêu cầu thông tin đầu vào chỉ xác định duy nhất một người
    public NhanKhauBean getInfoByInput(String hoTen, String soCMT,
            String diaChiHienNay, int tuTuoi, int denTuoi, String tinhTrangDichTe) throws Exception {
        NhanKhauBean nguoiCanTim = new NhanKhauBean();
        if (tinhTrangDichTe.compareTo("F0") == 0 || tinhTrangDichTe.compareTo("F1") == 0) {
            nguoiCanTim.setTinhTrangDichTe(tinhTrangDichTe);

            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT *, COUNT(*) AS result FROM(nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau) \n"
                    + "WHERE nhan_khau.hoTen LIKE ? AND chung_minh_thu.soCMT LIKE ? "
                    + "AND ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) >= ? "
                    + "AND ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) <= ? "
                    + "AND nhan_khau.diaChiHienNay LIKE ? ";

            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + hoTen + "%");
            preparedStatement.setString(2, "%" + soCMT + "%");
            preparedStatement.setInt(3, tuTuoi);
            preparedStatement.setInt(4, denTuoi);
            preparedStatement.setString(5, "%" + diaChiHienNay + "%");
            ResultSet rs = preparedStatement.executeQuery();
            int slkq = -1;
            int idNhanKhau = -1;
            while (rs.next()) {
                slkq = rs.getInt("result");
                NhanKhauModel nhanKhau = nguoiCanTim.getNhanKhauModel();
                ChungMinhThuModel chungMinhThuModel = nguoiCanTim.getChungMinhThuModel();
                idNhanKhau = rs.getInt("idNhanKhau");
                nhanKhau.setID(idNhanKhau);
                nhanKhau.setBietDanh(rs.getString("bietDanh"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNguyenQuan(rs.getString("nguyenQuan"));
                nhanKhau.setSoHoChieu(rs.getString("soHoChieu"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                nhanKhau.setDiaChiHienNay(rs.getString("diaChiHienNay"));
                nhanKhau.setNoiLamViec(rs.getString("noiLamViec"));
                // con nhieu nua
                chungMinhThuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
            }
            preparedStatement.close();

            if (slkq != 1) {
                throw new InputMismatchException("NGƯỜI ĐƯA VÀO PHẢI TỒN TẠI VÀ LÀ DUY NHẤT!");
            }

            connection.close();

        } else {
            throw new Exception("TÌNH TRẠNG DỊCH TỄ PHẢI LÀ F0 HOẶC F1!");
        }

        return nguoiCanTim;
    }

    // Tìm kiếm những người tiếp xúc gần với một người
    public List<NhanKhauBean> getListNguoiTiepXucGan(NhanKhauBean personInput) throws Exception {

        List<NhanKhauBean> list = new ArrayList<>();
        String inputCMT = personInput.getChungMinhThuModel().getSoCMT();

        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "SELECT* FROM(nhan_khau INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau) \n"
                + "WHERE nhan_khau.ID NOT IN (SELECT idNhanKhau FROM chung_minh_thu WHERE chung_minh_thu.soCMT = ?) \n"
                + "AND ((nhan_khau.diaChiHienNay IN (SELECT nhan_khau.diaChiHienNay FROM (nhan_khau INNER JOIN chung_minh_thu \n"
                + "ON nhan_khau.ID = chung_minh_thu.idNhanKhau) WHERE chung_minh_thu.soCMT = ?)) \n"
                + "OR (nhan_khau.noiLamViec IN (SELECT nhan_khau.noiLamViec FROM (nhan_khau INNER JOIN chung_minh_thu \n"
                + "ON nhan_khau.ID = chung_minh_thu.idNhanKhau) WHERE chung_minh_thu.soCMT = ?)))";

        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
        preparedStatement.setString(1, inputCMT);
        preparedStatement.setString(2, inputCMT);
        preparedStatement.setString(3, inputCMT);

        ResultSet rs = preparedStatement.executeQuery();
        int idNhanKhau = -1;
        while (rs.next()) {
            NhanKhauBean nhanKhauBean = new NhanKhauBean();
            NhanKhauModel nhanKhau = nhanKhauBean.getNhanKhauModel();
            ChungMinhThuModel chungMinhThuModel = nhanKhauBean.getChungMinhThuModel();

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

            chungMinhThuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
            chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
            chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
            chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

            list.add(nhanKhauBean);
        }
        preparedStatement.close();
        connection.close();

        return list;
    }

    // Xóa người b nếu có ở listA
    public List<NhanKhauBean> subList(List<NhanKhauBean> listA, NhanKhauBean b) {
        List<NhanKhauBean> listC = listA;
        String soCMT = b.getChungMinhThuModel().getSoCMT();
        for (int i = 0; i < listC.size(); i++) {
            if (listC.get(i).getChungMinhThuModel().getSoCMT().compareTo(soCMT) == 0) {
                NhanKhauBean bRemoved = listC.remove(i);
            }
        }
        return listC;
    }

    // Xóa bỏ những người ở listA đã có ở listB
    public List<NhanKhauBean> subList(List<NhanKhauBean> listA, List<NhanKhauBean> listB) {
        List<NhanKhauBean> listC = listA;
        for (int i = 0; i < listB.size(); i++) {
            subList(listC, listB.get(i));
        }
        return listC;
    }

    // hợp 2 list thành một list, loại bỏ trùng lặp
    public List<NhanKhauBean> unionList(List<NhanKhauBean> listA, List<NhanKhauBean> listB) {
        List<NhanKhauBean> listC = listA;
        for (int i = 0; i < listB.size(); i++) {
            String soCMT = listB.get(i).getChungMinhThuModel().getSoCMT();
            boolean has = false;
            for (int j = 0; j < listC.size(); j++) {
                if (listC.get(j).getChungMinhThuModel().getSoCMT().compareTo(soCMT) == 0) {
                    has = true;
                }
            }
            if (!has) {
                listC.add(listB.get(i));
            }
        }
        return listC;
    }

    // --> Đưa ra danh sách F1, F2 từ F0/F1 ở đầu vào
    public List<NhanKhauBean> listF1F2(NhanKhauBean inputPerson) throws Exception {
        List<NhanKhauBean> dsF1F2 = new ArrayList<>();
        List<NhanKhauBean> dsF1 = new ArrayList<>();
        List<NhanKhauBean> dsF2 = new ArrayList<>();
        String Fx = inputPerson.getTinhTrangDichTe();
        if (Fx.compareTo("F0") == 0) {
            dsF1 = getListNguoiTiepXucGan(inputPerson);
            for (int i = 0; i < dsF1.size(); i++) {
                dsF1.get(i).setTinhTrangDichTe("F1");
                dsF2 = unionList(dsF2, getListNguoiTiepXucGan(dsF1.get(i)));
            }
            dsF2 = subList(dsF2, dsF1);
            dsF2 = subList(dsF2, inputPerson);
            for (int i = 0; i < dsF2.size(); i++) {
                dsF2.get(i).setTinhTrangDichTe("F2");
            }
            dsF1F2 = unionList(dsF1, dsF2);
        } else if (Fx.compareTo("F1") == 0) {
            dsF2 = getListNguoiTiepXucGan(inputPerson);
            for (int i = 0; i < dsF2.size(); i++) {
                dsF2.get(i).setTinhTrangDichTe("F2");
            }
            dsF1F2 = dsF2;
        }
        return dsF1F2;
    }

    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }

}
