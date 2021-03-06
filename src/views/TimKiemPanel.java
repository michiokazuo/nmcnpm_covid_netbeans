/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.TimKiemPanelController;
import javax.swing.JFrame;

/**
 *
 * @author Phong
 */
public class TimKiemPanel extends javax.swing.JPanel {

    private JFrame parentFrame;
    private TimKiemPanelController controller;

    /**
     * Creates new form TimKiemPanel
     */
    public TimKiemPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        this.controller = new TimKiemPanelController(userInforJpn, aa,
                HoTenJtf, SoCCCDJtf, DoTuoiJtf, DiaChiJtf, ToiJtf, jComboBox1, tenFJtf,
                soCCCDFJtf, nhaRiengFJtf, lamViecFJtf, dichTeFJtf, jRadioButton1);
        userInforJpn.setVisible(false);
        userInforJpn.setSize(-1, -1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlJpn = new javax.swing.JPanel();
        ToiJlb = new javax.swing.JLabel();
        ToiJtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        HoTenJlb = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        HoTenJtf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        DiaChiJlb = new javax.swing.JLabel();
        TimKiemBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DoTuoiJlb = new javax.swing.JLabel();
        DiaChiJtf = new javax.swing.JTextField();
        SoCCCDJtf = new javax.swing.JTextField();
        DoTuoiJtf = new javax.swing.JTextField();
        aa = new javax.swing.JPanel();
        rsJTF = new javax.swing.JLabel();
        tableRSFindJpn = new javax.swing.JPanel();
        userInforJpn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tenFJtf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaRiengFJtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dichTeFJtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        soCCCDFJtf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lamViecFJtf = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setEnabled(false);

        ToiJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ToiJlb.setText("t???i:");

        ToiJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ToiJtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ToiJtf.setText("100");
        ToiJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToiJtfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("T??nh tr???nh d???ch t???:");

        HoTenJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HoTenJlb.setText("H??? t??n:");

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButton1.setText("<html>T??m ki???m th??ng tin nh???ng ng?????i <br> c?? quan h??? v??? COVID</html>");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        HoTenJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HoTenJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoTenJtfActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toan Bo", "NULL", "F0", "F1", "F2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        DiaChiJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DiaChiJlb.setText("?????a ch???:");

        TimKiemBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        TimKiemBtn.setText("T??m ki???m");
        TimKiemBtn.setMargin(new java.awt.Insets(2, 0, 2, 0));
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("S??? CCCD:");

        DoTuoiJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DoTuoiJlb.setText("????? tu???i:");

        DiaChiJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiaChiJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiJtfActionPerformed(evt);
            }
        });

        SoCCCDJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        DoTuoiJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DoTuoiJtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DoTuoiJtf.setText("0");
        DoTuoiJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoTuoiJtfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJpnLayout = new javax.swing.GroupLayout(controlJpn);
        controlJpn.setLayout(controlJpnLayout);
        controlJpnLayout.setHorizontalGroup(
            controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpnLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJpnLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlJpnLayout.createSequentialGroup()
                        .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(controlJpnLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlJpnLayout.createSequentialGroup()
                                .addComponent(DiaChiJlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiaChiJtf))
                            .addGroup(controlJpnLayout.createSequentialGroup()
                                .addComponent(HoTenJlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HoTenJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(controlJpnLayout.createSequentialGroup()
                                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(controlJpnLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpnLayout.createSequentialGroup()
                                        .addComponent(DoTuoiJlb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(controlJpnLayout.createSequentialGroup()
                                        .addComponent(DoTuoiJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ToiJlb)
                                        .addGap(12, 12, 12)
                                        .addComponent(ToiJtf))
                                    .addComponent(SoCCCDJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        controlJpnLayout.setVerticalGroup(
            controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HoTenJtf, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(SoCCCDJtf, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(HoTenJlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJpnLayout.createSequentialGroup()
                        .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ToiJtf)
                            .addComponent(DoTuoiJtf)
                            .addComponent(ToiJlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DiaChiJtf, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(DiaChiJlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpnLayout.createSequentialGroup()
                        .addComponent(DoTuoiJlb)
                        .addGap(18, 18, 18)))
                .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(controlJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rsJTF.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rsJTF.setForeground(new java.awt.Color(255, 0, 0));
        rsJTF.setText("K???T QU??? T??M KI???M");

        javax.swing.GroupLayout tableRSFindJpnLayout = new javax.swing.GroupLayout(tableRSFindJpn);
        tableRSFindJpn.setLayout(tableRSFindJpnLayout);
        tableRSFindJpnLayout.setHorizontalGroup(
            tableRSFindJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        tableRSFindJpnLayout.setVerticalGroup(
            tableRSFindJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout aaLayout = new javax.swing.GroupLayout(aa);
        aa.setLayout(aaLayout);
        aaLayout.setHorizontalGroup(
            aaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableRSFindJpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aaLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(rsJTF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aaLayout.setVerticalGroup(
            aaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(rsJTF)
                .addGap(18, 18, 18)
                .addComponent(tableRSFindJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userInforJpn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("H??? & T??n");

        tenFJtf.setEditable(false);
        tenFJtf.setBackground(new java.awt.Color(255, 255, 255));
        tenFJtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tenFJtf.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tenFJtf.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("?????a ch??? nh?? ri??ng");

        nhaRiengFJtf.setEditable(false);
        nhaRiengFJtf.setBackground(new java.awt.Color(255, 255, 255));
        nhaRiengFJtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nhaRiengFJtf.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        nhaRiengFJtf.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("T??nh tr???ng d???ch t??? ");

        dichTeFJtf.setEditable(false);
        dichTeFJtf.setBackground(new java.awt.Color(255, 255, 255));
        dichTeFJtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dichTeFJtf.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        dichTeFJtf.setEnabled(false);
        dichTeFJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dichTeFJtfActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("S??? CCCD");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("?????a ch??? l??m vi???c");

        soCCCDFJtf.setEditable(false);
        soCCCDFJtf.setBackground(new java.awt.Color(255, 255, 255));
        soCCCDFJtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soCCCDFJtf.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        soCCCDFJtf.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("D??? LI???U ?????U V??O");

        lamViecFJtf.setEditable(false);
        lamViecFJtf.setBackground(new java.awt.Color(255, 255, 255));
        lamViecFJtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lamViecFJtf.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        lamViecFJtf.setEnabled(false);

        javax.swing.GroupLayout userInforJpnLayout = new javax.swing.GroupLayout(userInforJpn);
        userInforJpn.setLayout(userInforJpnLayout);
        userInforJpnLayout.setHorizontalGroup(
            userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInforJpnLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhaRiengFJtf)
                    .addComponent(lamViecFJtf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userInforJpnLayout.createSequentialGroup()
                        .addComponent(dichTeFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(userInforJpnLayout.createSequentialGroup()
                        .addComponent(tenFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(soCCCDFJtf)))
                .addGap(43, 43, 43))
        );
        userInforJpnLayout.setVerticalGroup(
            userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInforJpnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userInforJpnLayout.createSequentialGroup()
                        .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tenFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(soCCCDFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nhaRiengFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lamViecFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(userInforJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(dichTeFJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userInforJpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(controlJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(controlJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInforJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HoTenJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoTenJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoTenJtfActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void DiaChiJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiJtfActionPerformed

    private void DoTuoiJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoTuoiJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoTuoiJtfActionPerformed

    private void ToiJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToiJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToiJtfActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
        controller.showRS();
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    private void dichTeFJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dichTeFJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dichTeFJtfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiaChiJlb;
    private javax.swing.JTextField DiaChiJtf;
    private javax.swing.JLabel DoTuoiJlb;
    private javax.swing.JTextField DoTuoiJtf;
    private javax.swing.JLabel HoTenJlb;
    private javax.swing.JTextField HoTenJtf;
    private javax.swing.JTextField SoCCCDJtf;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JLabel ToiJlb;
    private javax.swing.JTextField ToiJtf;
    private javax.swing.JPanel aa;
    private javax.swing.JPanel controlJpn;
    private javax.swing.JTextField dichTeFJtf;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField lamViecFJtf;
    private javax.swing.JTextField nhaRiengFJtf;
    private javax.swing.JLabel rsJTF;
    private javax.swing.JTextField soCCCDFJtf;
    private javax.swing.JPanel tableRSFindJpn;
    private javax.swing.JTextField tenFJtf;
    private javax.swing.JPanel userInforJpn;
    // End of variables declaration//GEN-END:variables
}
