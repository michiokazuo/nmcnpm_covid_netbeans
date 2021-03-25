package views;

import Bean.IndividualMedicInfoBean;
import Bean.NhanKhauBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.NhanKhauModel;
import models.ChungMinhThuModel;
import models.KhaiBaoYTeModel;

/**
 *
 * class dinh nghia cac dang table co trong phan mem
 */
public class ClassTableModel {
    // bang cho main frame
//    public DefaultTableModel setTableNhanKhau(List<NhanKhauModel> listItem, String[] listColumn) {
//        final int columns = listColumn.length;
//        DefaultTableModel dtm = new DefaultTableModel()  {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
//            }
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnIndex == 5 ? Boolean.class : String.class;
//            }
//        };
//        dtm.setColumnIdentifiers(listColumn);
//        Object[] obj;
//        obj = new Object[columns];
//        listItem.forEach((NhanKhauModel item) -> {
//            obj[0] = item.getID();
//            obj[1] = item.getHoTen();
//            obj[2] = item.getNamSinh();
//            obj[3] = item.getGioiTinh();
//            obj[4] = item.getDiaChiHienNay();
//            dtm.addRow(obj);
//        });
//        return dtm;
//    }

    public DefaultTableModel setTableDanhSachNhungNguoiChuaKhaiBaoYTe(List<ChungMinhThuModel> listChungMinhThuModel, List<NhanKhauModel> listNhanKhauModel, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 3 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        for (int i = 0; i < listChungMinhThuModel.size(); i++) {
            obj[0] = listNhanKhauModel.get(i).getHoTen();
            obj[1] = listChungMinhThuModel.get(i).getSoCMT();
            obj[2] = listNhanKhauModel.get(i).getDiaChiHienNay();
            dtm.addRow(obj);
        }
        return dtm;
    }

    public DefaultTableModel setTableDanhSachNhungNguoiDaKhaiBaoYTe(List<NhanKhauModel> listNhanKhauModel, List<ChungMinhThuModel> listChungMinhThuModel, List<KhaiBaoYTeModel> listKhaiBaoYTeModel, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        for (int i = 0; i < listChungMinhThuModel.size(); i++) {
            obj[0] = listNhanKhauModel.get(i).getHoTen();
            obj[1] = listChungMinhThuModel.get(i).getSoCMT();
            obj[2] = listNhanKhauModel.get(i).getNamSinh();
            obj[3] = listNhanKhauModel.get(i).getDiaChiHienNay();
            obj[4] = listKhaiBaoYTeModel.get(i).getTinhTrangDichTe();
            obj[5] = listKhaiBaoYTeModel.get(i).getTinhTrangCachLy();
            obj[6] = listKhaiBaoYTeModel.get(i).getLastTimeModified();
            dtm.addRow(obj);
        }
        return dtm;
    }

    public DefaultTableModel setTableDanhSachNguoiTiepXuc(List<NhanKhauBean> beans, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        for (int i = 0; i < beans.size(); i++) {
            obj[0] = beans.get(i).getNhanKhauModel().getHoTen();
            obj[1] = beans.get(i).getChungMinhThuModel().getSoCMT();
            obj[2] = beans.get(i).getNhanKhauModel().getNamSinh();
            obj[3] = beans.get(i).getNhanKhauModel().getDiaChiHienNay();
            obj[4] = beans.get(i).getNhanKhauModel().getNoiLamViec();
            obj[5] = beans.get(i).getTinhTrangDichTe();
            System.out.println(beans.toString());
            dtm.addRow(obj);
        }
        return dtm;
    }

    public DefaultTableModel setTableDanhSachTimKiem(List<IndividualMedicInfoBean> beans, String[] listColumn) {
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        for (int i = 0; i < beans.size(); i++) {
            obj[0] = beans.get(i).getNhanKhauModel().getHoTen();
            obj[1] = beans.get(i).getChungMinhThuModel().getSoCMT();
            obj[2] = beans.get(i).getNhanKhauModel().getNamSinh();
            obj[3] = beans.get(i).getNhanKhauModel().getDiaChiHienNay();
            obj[4] = beans.get(i).getNhanKhauModel().getNoiLamViec();
            obj[5] = beans.get(i).getKhaiBaoYTeModel().getTinhTrangDichTe();
            obj[6] = beans.get(i).getKhaiBaoYTeModel().getTinhTrangCachLy();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
