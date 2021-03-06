/*
 Navicat Premium Data Transfer

 Source Server         : Local Host
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : quan_ly_nhan_khau

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 25/03/2021 21:58:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chung_minh_thu
-- ----------------------------
DROP TABLE IF EXISTS `chung_minh_thu`;
CREATE TABLE `chung_minh_thu`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int(0) NULL DEFAULT NULL,
  `soCMT` varchar(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ngayCap` date NULL DEFAULT NULL,
  `noiCap` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNhanKhau`(`idNhanKhau`) USING BTREE,
  FULLTEXT INDEX `soCMT`(`soCMT`),
  CONSTRAINT `chung_minh_thu_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chung_minh_thu
-- ----------------------------
INSERT INTO `chung_minh_thu` VALUES (13, 26, '000000000001', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (14, 27, '000000000002', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (15, 28, '000000000003', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (16, 29, '000000000004', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (17, 30, '000000000005', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (18, 31, '000000000006', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (19, 32, '000000000007', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (20, 33, '000000000008', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (21, 34, '000000000009', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (22, 35, '100000000001', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (23, 36, '100000000002', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (24, 37, '000000000010', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (25, 38, '000000000011', NULL, NULL);
INSERT INTO `chung_minh_thu` VALUES (26, 39, '030200001111', NULL, NULL);

-- ----------------------------
-- Table structure for dinh_chinh
-- ----------------------------
DROP TABLE IF EXISTS `dinh_chinh`;
CREATE TABLE `dinh_chinh`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idHoKhau` int(0) NULL DEFAULT NULL,
  `thongTinThayDoi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `thayDoiTu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `thayDoiThanh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngayThayDoi` date NULL DEFAULT NULL,
  `nguoiThayDoi` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idHoKhau`(`idHoKhau`) USING BTREE,
  INDEX `nguoiThayDoi`(`nguoiThayDoi`) USING BTREE,
  CONSTRAINT `dinh_chinh_ibfk_1` FOREIGN KEY (`idHoKhau`) REFERENCES `ho_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `dinh_chinh_ibfk_2` FOREIGN KEY (`nguoiThayDoi`) REFERENCES `users` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dinh_chinh
-- ----------------------------

-- ----------------------------
-- Table structure for gia_dinh
-- ----------------------------
DROP TABLE IF EXISTS `gia_dinh`;
CREATE TABLE `gia_dinh`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int(0) NULL DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `namSinh` date NULL DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `quanHeVoiNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `diaChiHienTai` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNhanKhau`(`idNhanKhau`) USING BTREE,
  CONSTRAINT `gia_dinh_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gia_dinh
-- ----------------------------
INSERT INTO `gia_dinh` VALUES (2, 27, 'Nguy???n Minh Qu??n', '1995-05-31', 'Nam', 'Ch???ng', 'K??? s??', 'S??? 2 T??? Quang B???u, Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (3, 28, 'Tr???n Thanh Duy??n', '1997-12-23', 'N???', 'V???', 'Nh??n vi??n v??n ph??ng', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (4, 29, 'V?? M??? Linh', '1965-12-06', 'N???', 'V???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (5, 29, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Con trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (6, 29, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Con g??i', 'Lu???t s??', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (7, 30, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'Ch???ng', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (8, 30, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Con trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (9, 30, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Con G??i', 'Lu???t s??', '');
INSERT INTO `gia_dinh` VALUES (10, 31, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'B???', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (11, 31, 'V?? M??? Linh', '1965-12-06', 'N???', 'M???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (12, 31, 'Nguy???n Tr?? My', '1997-12-12', 'N???', 'Em g??i', 'Lu???t s??', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (13, 32, 'Nguy???n Ti???n D??ng', '1964-06-03', 'Nam', 'B???', 'Ph?? gi??m ?????c', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (14, 32, 'V?? M??? Linh', '1965-12-06', 'N???', 'M???', 'N???i tr???', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (15, 32, 'Nguy???n Ti???n ?????t', '1990-09-09', 'Nam', 'Anh trai', 'K??? s?? ??i???n', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (16, 33, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N???', 'V???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (17, 33, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Con trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (18, 33, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Con g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (19, 34, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Con trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (20, 34, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Con g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (21, 34, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'Ch???ng', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (22, 35, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'B???', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (23, 35, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N???', 'M???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (24, 35, 'Tr???n Th??y Ng???c', '2013-01-15', 'N???', 'Em g??i', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (25, 36, 'Tr???n V??n Nam', '1980-07-09', 'Nam', 'B???', 'Gi???ng vi??n ?????i h???c', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (26, 36, 'Nguy???n Minh Tuy???t', '1985-09-02', 'N??? ', 'M???', 'B??c s??', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (27, 36, 'Tr???n Trung Ki??n', '2008-12-25', 'Nam', 'Anh trai', 'H???c sinh', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (28, 37, 'B??i Th??? H??', '1948-02-03', 'N???', 'V???', 'N???i tr???', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (29, 37, 'L?? Th??nh Nam', '1968-06-12', 'Nam', 'Con Trai', 'C??ng nh??n', 'S??? 89, ng?? 98 Tr?????ng Chinh, H?? N???i');
INSERT INTO `gia_dinh` VALUES (30, 37, 'L?? Thu Th???y', '1971-03-05', 'N???', 'Con G??i', 'Nh??n vi??n v??n ph??ng', 'S??? 3, ng?? 568 ???????ng L??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (31, 38, 'L?? V??n C??ng', '1945-06-04', 'Nam', 'Ch???ng', 'B??? ?????i v??? h??u', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i');
INSERT INTO `gia_dinh` VALUES (32, 38, 'L?? Th??nh Nam', '1968-06-12', 'Nam', 'Con trai', 'C??ng nh??n', 'S??? 89, ng?? 98 Tr?????ng Chinh, H?? N???i');
INSERT INTO `gia_dinh` VALUES (33, 38, 'L?? Thu Th???y', '1971-03-05', 'N???', 'Con g??i', 'Nh??n vi??n v??n ph??ng', 'S??? 3, ng?? 568 ???????ng L??ng, H?? N???i');

-- ----------------------------
-- Table structure for ho_khau
-- ----------------------------
DROP TABLE IF EXISTS `ho_khau`;
CREATE TABLE `ho_khau`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `maHoKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `idChuHo` int(0) NULL DEFAULT NULL,
  `maKhuVuc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngayLap` date NULL DEFAULT NULL,
  `ngayChuyenDi` date NULL DEFAULT NULL,
  `lyDoChuyen` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `nguoiThucHien` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idChuHo`(`idChuHo`) USING BTREE,
  FULLTEXT INDEX `maHoKhau`(`maHoKhau`),
  CONSTRAINT `ho_khau_ibfk_1` FOREIGN KEY (`idChuHo`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ho_khau
-- ----------------------------
INSERT INTO `ho_khau` VALUES (13, 'TQB002', 28, 'HN03', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL);
INSERT INTO `ho_khau` VALUES (14, 'TQB001', 26, 'HN03', 'S??? 1 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL);
INSERT INTO `ho_khau` VALUES (15, 'TQB003', 29, 'HN03', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL);
INSERT INTO `ho_khau` VALUES (16, 'TQB004', 33, 'HN03', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '2019-12-08', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for khai_bao_y_te
-- ----------------------------
DROP TABLE IF EXISTS `khai_bao_y_te`;
CREATE TABLE `khai_bao_y_te`  (
  `soCMT` varchar(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tinhTrangDichTe` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tinhTrangCachLy` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `lastTimeModified` date NULL DEFAULT NULL,
  PRIMARY KEY (`soCMT`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khai_bao_y_te
-- ----------------------------
INSERT INTO `khai_bao_y_te` VALUES ('000000000001', 'NULL', '', '2020-12-26');
INSERT INTO `khai_bao_y_te` VALUES ('000000000002', 'F1', 'c??ch ly t???i nh?? ri??ng 15 ng??y t??? ng??y 01/11/2020', '2020-12-28');
INSERT INTO `khai_bao_y_te` VALUES ('000000000003', 'F0', '???????c ??i???u tr??? t??ch c???c t??? ng??y 12/09/2020', '2020-09-15');
INSERT INTO `khai_bao_y_te` VALUES ('000000000004', 'F2', 'c??ch ly t???i nh?? ri??ng 15 ng??y t??? ng??y 20/11/2020', '2020-12-03');
INSERT INTO `khai_bao_y_te` VALUES ('000000000005', 'NULL', 'aaa', '2020-12-28');
INSERT INTO `khai_bao_y_te` VALUES ('000000000007', 'NULL', 'b??nh th?????ng', '2020-12-28');
INSERT INTO `khai_bao_y_te` VALUES ('000000000008', 'NULL', 'ko sao ca', '2020-12-28');
INSERT INTO `khai_bao_y_te` VALUES ('000000000010', 'F0', '??ang ??i???u tr??? d????i s??? h?????ng d???n c???a b??c s?? t???i khu c??ch ly t???p trung', '2020-12-27');
INSERT INTO `khai_bao_y_te` VALUES ('000000000011', 'F1', 'c??ch ly t???p trung alo', '2020-12-27');

-- ----------------------------
-- Table structure for khai_tu
-- ----------------------------
DROP TABLE IF EXISTS `khai_tu`;
CREATE TABLE `khai_tu`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `soGiayKhaiTu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `idNguoiKhai` int(0) NULL DEFAULT NULL,
  `idNguoiChet` int(0) NULL DEFAULT NULL,
  `ngayKhai` date NULL DEFAULT NULL,
  `ngayChet` date NULL DEFAULT NULL,
  `lyDoChet` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNguoiKhai`(`idNguoiKhai`) USING BTREE,
  INDEX `idNguoiChet`(`idNguoiChet`) USING BTREE,
  CONSTRAINT `khai_tu_ibfk_1` FOREIGN KEY (`idNguoiKhai`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `khai_tu_ibfk_2` FOREIGN KEY (`idNguoiChet`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of khai_tu
-- ----------------------------

-- ----------------------------
-- Table structure for nhan_khau
-- ----------------------------
DROP TABLE IF EXISTS `nhan_khau`;
CREATE TABLE `nhan_khau`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `maNhanKhau` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `hoTen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `bietDanh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `namSinh` date NULL DEFAULT NULL,
  `gioiTinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noiSinh` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `nguyenQuan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `danToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tonGiao` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `quocTich` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `soHoChieu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noiThuongTru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `diaChiHienNay` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `trinhDoHocVan` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `TrinhDoChuyenMon` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `bietTiengDanToc` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `trinhDoNgoaiNgu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tienAn` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngayChuyenDen` date NULL DEFAULT NULL,
  `lyDoChuyenDen` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngayChuyenDi` date NULL DEFAULT NULL,
  `lyDoChuyenDi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `diaChiMoi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngayTao` date NULL DEFAULT NULL,
  `idNguoiTao` int(0) NULL DEFAULT NULL,
  `ngayXoa` date NULL DEFAULT NULL,
  `idNguoiXoa` int(0) NULL DEFAULT NULL,
  `lyDoXoa` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ghiChu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNguoiTao`(`idNguoiTao`) USING BTREE,
  INDEX `idNguoiXoa`(`idNguoiXoa`) USING BTREE,
  FULLTEXT INDEX `hoTen`(`hoTen`, `bietDanh`),
  CONSTRAINT `nhan_khau_ibfk_1` FOREIGN KEY (`idNguoiTao`) REFERENCES `users` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `nhan_khau_ibfk_2` FOREIGN KEY (`idNguoiXoa`) REFERENCES `users` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nhan_khau
-- ----------------------------
INSERT INTO `nhan_khau` VALUES (26, NULL, 'Trinh V??n An', '', '1990-12-07', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 1 T??? Quang B??u, Hai B?? Tr??ng, H?? N???i', 'S??? 1 T??? Quang B??u, Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? B', 'Gi??o Vi??n', 'Tr?????ng THCS Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (27, NULL, 'Tr???n Thanh Duy??n', '', '1997-12-23', 'N???', NULL, 'H???i Ph??ng', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 3, ???????ng ????nh ????ng, ph?????ng ????nh ????ng, qu???n Ng?? Quy???n, H???i Ph??ng', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'Nh??n vi??n v??n ph??ng', 'C??ng ty ABC', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (28, NULL, 'Nguy???n Minh Qu??n', '', '1995-05-31', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 2 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'K??? s??', 'Viettel', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (29, NULL, 'Nguy???n Ti???n D??ng', '', '1964-06-03', 'Nam', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'K??? s??', 'Kh??ng', 'Kh??ng', 'Ph?? gi??m ?????c', 'C??ng ty EXE', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (30, NULL, 'V?? M??? Linh', '', '1965-12-06', 'N???', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12', 'C??? Nh??n', 'Kh??ng', 'Kh??ng', 'N???i tr???', 'T???i nh??', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (31, NULL, 'Nguy???n Ti???n ?????t', '', '1990-09-09', 'Nam', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'K??? s??', 'kh??ng', 'Anh tr??nh ????? C', 'K??? s?? ??i???n', 'C??ng ty ??i???n EVN', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (32, NULL, 'Nguy???n Tr?? My', '', '1997-12-12', 'N???', NULL, 'H???i D????ng', 'Kinh', 'Thi??n ch??a gi??o', 'Vi???t Nam', '', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'kh??ng', 'Anh tr??nh ????? D', 'Lu???t s??', 'V??n ph??ng lu???t s?? 123', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (33, NULL, 'Tr???n V??n Nam', '', '1980-07-09', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Ti???n s??', 'Kh??ng', 'Anh tr??nh ????? D', 'Gi???ng vi??n ?????i h???c', '?????i h???c B??ch khoa H?? N???i', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (34, NULL, 'Nguy???n Minh Tuy???t', '', '1985-09-02', 'N???', NULL, 'Nam ?????nh', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '12/12 ch??nh quy', 'Th???c s??', 'Kh??ng', 'Anh tr??nh ????? D', 'B??c s??', 'B???nh vi???n qu???c t??? HJK', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (35, NULL, 'Tr???n Trung Ki??n', '', '2008-12-25', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '6/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'H???c sinh', 'Tr?????ng THCS Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (36, NULL, 'Tr???n Th??y Ng???c', '', '2013-01-15', 'N???', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '1/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'H???c sinh', 'Tr?????ng ti???u h???c Chu V??n An', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (37, NULL, 'L?? V??n C??ng', '', '1945-06-04', 'Nam', NULL, 'H?? N???i', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '10/12 ch??nh quy', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'V??? h??u', 'Kh??ng', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (38, NULL, 'B??i Th??? H??', '', '1948-02-03', 'N???', NULL, 'H???i Ph??ng', 'Kinh', 'Kh??ng', 'Vi???t Nam', '', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'S??? 5 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', '10/12', 'Kh??ng', 'Kh??ng', 'Kh??ng', 'N???i tr???', 'T???i nh??', NULL, NULL, NULL, NULL, NULL, NULL, '2019-12-08', 1, NULL, NULL, NULL, NULL);
INSERT INTO `nhan_khau` VALUES (39, NULL, 'Nguy???n M???nh D??ng', '', '2020-09-05', 'Nam', NULL, 'TP Qu???ng Ninh', 'Kinh', 'Kh??ng', 'VN', '0001', 'asdfasd', '??dasdfas', '??sdfas', 'ADFASD', '???D', '??DF', '??DFAS', '??DASDF', NULL, NULL, NULL, NULL, NULL, NULL, '2020-11-25', 1, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tam_tru
-- ----------------------------
DROP TABLE IF EXISTS `tam_tru`;
CREATE TABLE `tam_tru`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int(0) NULL DEFAULT NULL,
  `maGiayTamtru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `soDienThoaiNguoiDangKy` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tuNgay` date NOT NULL,
  `denNgay` date NOT NULL,
  `lyDo` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNhanKhau`(`idNhanKhau`) USING BTREE,
  CONSTRAINT `tam_tru_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tam_tru
-- ----------------------------

-- ----------------------------
-- Table structure for tam_vang
-- ----------------------------
DROP TABLE IF EXISTS `tam_vang`;
CREATE TABLE `tam_vang`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int(0) NULL DEFAULT NULL,
  `maGiayTamVang` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noiTamtru` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `tuNgay` date NULL DEFAULT NULL,
  `denNgay` date NULL DEFAULT NULL,
  `lyDo` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNhanKhau`(`idNhanKhau`) USING BTREE,
  CONSTRAINT `tam_vang_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tam_vang
-- ----------------------------

-- ----------------------------
-- Table structure for thanh_vien_cua_ho
-- ----------------------------
DROP TABLE IF EXISTS `thanh_vien_cua_ho`;
CREATE TABLE `thanh_vien_cua_ho`  (
  `idNhanKhau` int(0) NOT NULL,
  `idHoKhau` int(0) NOT NULL,
  `quanHeVoiChuHo` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idNhanKhau`, `idHoKhau`) USING BTREE,
  INDEX `idHoKhau`(`idHoKhau`) USING BTREE,
  CONSTRAINT `thanh_vien_cua_ho_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `thanh_vien_cua_ho_ibfk_2` FOREIGN KEY (`idHoKhau`) REFERENCES `ho_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of thanh_vien_cua_ho
-- ----------------------------
INSERT INTO `thanh_vien_cua_ho` VALUES (26, 14, 'Ch??? h???');
INSERT INTO `thanh_vien_cua_ho` VALUES (27, 13, 'V???');
INSERT INTO `thanh_vien_cua_ho` VALUES (29, 15, 'Ch??? h???');
INSERT INTO `thanh_vien_cua_ho` VALUES (30, 15, 'V???');
INSERT INTO `thanh_vien_cua_ho` VALUES (31, 15, 'Con trai');
INSERT INTO `thanh_vien_cua_ho` VALUES (32, 15, 'Con g??i');
INSERT INTO `thanh_vien_cua_ho` VALUES (33, 16, 'Ch??? h???');
INSERT INTO `thanh_vien_cua_ho` VALUES (34, 16, 'V???');
INSERT INTO `thanh_vien_cua_ho` VALUES (35, 16, 'Con trai');
INSERT INTO `thanh_vien_cua_ho` VALUES (36, 16, 'Con g??i');

-- ----------------------------
-- Table structure for tieu_su
-- ----------------------------
DROP TABLE IF EXISTS `tieu_su`;
CREATE TABLE `tieu_su`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `idNhanKhau` int(0) NULL DEFAULT NULL,
  `tuNgay` date NULL DEFAULT NULL,
  `denNgay` date NULL DEFAULT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ngheNghiep` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `noiLamViec` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `idNhanKhau`(`idNhanKhau`) USING BTREE,
  CONSTRAINT `tieu_su_ibfk_1` FOREIGN KEY (`idNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tieu_su
-- ----------------------------
INSERT INTO `tieu_su` VALUES (2, 27, '2015-09-05', '2015-09-05', 'S??? 45, ng?? 56, Nguy???n Khang, C???u Gi???y, H?? N???i', 'Sinh Vi??n', '?????i h???c Th????ng m???i');
INSERT INTO `tieu_su` VALUES (3, 28, '2012-09-05', '2017-09-05', '556 La Th??nh, H?? N???i', 'Sinh Vi??n', '?????i h???c B??ch khoa H?? N???i');
INSERT INTO `tieu_su` VALUES (4, 29, '1989-05-10', '2000-08-25', 'S??? 5 Nguy???n Khuy???n, H?? N???i', 'Qu???n l?? nh???n s???', 'C??ng ty BCC');
INSERT INTO `tieu_su` VALUES (5, 30, '1987-05-23', '1997-03-01', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Nh??n vi??n v??n ph??ng', 'C??ng ty Zezs');
INSERT INTO `tieu_su` VALUES (6, 31, '2008-09-05', '2013-09-05', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Sinh vi??n', '?????i h???c B??ch khoa H?? N???i');
INSERT INTO `tieu_su` VALUES (7, 32, '2015-09-05', '2019-09-05', 'S??? 3 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Sinh vi??n', '?????i h???c Lu???t H?? N???i');
INSERT INTO `tieu_su` VALUES (8, 33, '1998-09-05', '2003-09-05', 'S??? 66, ng?? 445 Nguy???n Khang, C???u Gi???y, H?? N???i', 'Sinh Vv??n', '?????i h???c B??ch khoa H?? N???i');
INSERT INTO `tieu_su` VALUES (9, 33, '2003-10-03', '2018-08-06', 'S??? 4 T??? Quang B???u, qu???n Hai B?? Tr??ng, H?? N???i', 'Gi???ng vi??n', '?????i h???c C??ng ngi???p H?? N???i');
INSERT INTO `tieu_su` VALUES (10, 34, '2003-09-05', '2011-09-05', 'S??? 8 T??n Th???t T??ng, H?? N???i', 'Sinh vi??n', '?????i h???c Y H?? N???i');
INSERT INTO `tieu_su` VALUES (11, 34, '2011-10-03', '2015-08-09', 'S??? 8 T??n Th???t T??ng, H?? N???i', 'B??c s?? n???i tr??', 'B???nh vi???n B???ch Mai');
INSERT INTO `tieu_su` VALUES (12, 37, '1961-01-01', '1963-01-01', 'Kh??ng r??', 'B??? ?????i', 'H?? N???i');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `passwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', '1');

SET FOREIGN_KEY_CHECKS = 1;
