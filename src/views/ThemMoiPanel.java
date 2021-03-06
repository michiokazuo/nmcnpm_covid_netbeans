/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ThemMoiPanelController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen
 */
public class ThemMoiPanel extends javax.swing.JPanel {

    private JFrame parentFrame;
    private ThemMoiPanelController controller;

    /**
     * Creates new form ThemMoiPanel
     */
    public ThemMoiPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        khaiBaoJpn.setVisible(true);
        hienThiJpn.setVisible(false);
        this.controller = new ThemMoiPanelController(khaiBaoJpn, hienThiJpn,
            hoTenJtf, soCCCDJtf, tinhTrangCachLyJtf,
            hoTenJtf2, soCCCDJtf2, thuongTruJtf2,
            lamViecJtf2, cachLyJtf2, dichTeJtf2,
            jComboBox1,cancelBtn, okBtn, backBtn);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        khaiBaoJpn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hoTenJlb = new javax.swing.JLabel();
        hoTenJtf = new javax.swing.JTextField();
        soCCCDJtf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        tinhTrangDichTeJlb = new javax.swing.JLabel();
        tinhTrangCachLyJlb = new javax.swing.JLabel();
        tinhTrangCachLyJtf = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        soCCCDJlb = new javax.swing.JLabel();
        hienThiJpn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hoTenJtf2 = new javax.swing.JTextField();
        soCCCDJtf2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        thuongTruJtf2 = new javax.swing.JTextField();
        lamViecJtf2 = new javax.swing.JTextField();
        cachLyJtf2 = new javax.swing.JTextField();
        dichTeJtf2 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        khaiBaoJpn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("KHAI B??O Y T???");

        hoTenJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hoTenJlb.setText("H??? v?? t??n:");

        hoTenJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hoTenJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoTenJtfActionPerformed(evt);
            }
        });

        soCCCDJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        soCCCDJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soCCCDJtfActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NULL", "F0", "F1", "F2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tinhTrangDichTeJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tinhTrangDichTeJlb.setText("T??nh tr???ng d???ch t???:");

        tinhTrangCachLyJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tinhTrangCachLyJlb.setText("T??nh tr???ng c??ch ly:");

        tinhTrangCachLyJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tinhTrangCachLyJtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhTrangCachLyJtfActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(0, 204, 204));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        okBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        okBtn.setForeground(new java.awt.Color(255, 0, 102));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        soCCCDJlb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        soCCCDJlb.setText("S??? CCCD:");

        javax.swing.GroupLayout khaiBaoJpnLayout = new javax.swing.GroupLayout(khaiBaoJpn);
        khaiBaoJpn.setLayout(khaiBaoJpnLayout);
        khaiBaoJpnLayout.setHorizontalGroup(
            khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tinhTrangCachLyJlb)
                            .addComponent(hoTenJlb)
                            .addComponent(soCCCDJlb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soCCCDJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoTenJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tinhTrangCachLyJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tinhTrangDichTeJlb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(khaiBaoJpnLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        khaiBaoJpnLayout.setVerticalGroup(
            khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khaiBaoJpnLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoTenJlb)
                    .addComponent(hoTenJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soCCCDJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soCCCDJlb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinhTrangCachLyJlb)
                    .addComponent(tinhTrangCachLyJtf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinhTrangDichTeJlb))
                .addGap(41, 41, 41)
                .addGroup(khaiBaoJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(cancelBtn))
                .addGap(25, 25, 25))
        );

        hienThiJpn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("TH??NG TIN NG?????I KHAI B??O");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("H??? v?? t??n: ");

        hoTenJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hoTenJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoTenJtf2ActionPerformed(evt);
            }
        });

        soCCCDJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        soCCCDJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soCCCDJtf2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("S??? CCCD:");

        thuongTruJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thuongTruJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuongTruJtf2ActionPerformed(evt);
            }
        });

        lamViecJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lamViecJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamViecJtf2ActionPerformed(evt);
            }
        });

        cachLyJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cachLyJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cachLyJtf2ActionPerformed(evt);
            }
        });

        dichTeJtf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dichTeJtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dichTeJtf2ActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("?????a ch??? th?????ng tr??:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("?????a ch??? n??i l??m vi???c:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("T??nh tr???ng c??ch ly:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("T??nh tr???ng d???ch t???:");

        javax.swing.GroupLayout hienThiJpnLayout = new javax.swing.GroupLayout(hienThiJpn);
        hienThiJpn.setLayout(hienThiJpnLayout);
        hienThiJpnLayout.setHorizontalGroup(
            hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienThiJpnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hienThiJpnLayout.createSequentialGroup()
                        .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hienThiJpnLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(hoTenJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(soCCCDJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hienThiJpnLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cachLyJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dichTeJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thuongTruJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lamViecJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hienThiJpnLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hienThiJpnLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hienThiJpnLayout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338))))))
        );
        hienThiJpnLayout.setVerticalGroup(
            hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienThiJpnLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoTenJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(soCCCDJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thuongTruJtf2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lamViecJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cachLyJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(hienThiJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dichTeJtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khaiBaoJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hienThiJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(khaiBaoJpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienThiJpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        if (this.hoTenJtf.getText().trim().isEmpty()
            || this.soCCCDJtf.getText().trim().isEmpty()
            || this.tinhTrangCachLyJtf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p h???t c??c th??ng tin b???t bu???c", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            controller.addNewMedicRecord();
            controller.showInfo2();
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.hoTenJtf.setText("  ");
        this.soCCCDJtf.setText("  ");
        this.tinhTrangCachLyJtf.setText(" ");
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void tinhTrangCachLyJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhTrangCachLyJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinhTrangCachLyJtfActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void hoTenJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoTenJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoTenJtfActionPerformed

    private void soCCCDJtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soCCCDJtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soCCCDJtfActionPerformed

    private void hoTenJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoTenJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoTenJtf2ActionPerformed

    private void cachLyJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cachLyJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cachLyJtf2ActionPerformed

    private void dichTeJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dichTeJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dichTeJtf2ActionPerformed

    private void lamViecJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamViecJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamViecJtf2ActionPerformed

    private void thuongTruJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuongTruJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thuongTruJtf2ActionPerformed

    private void soCCCDJtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soCCCDJtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soCCCDJtf2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //TODO add your handling code here:
        hienThiJpn.setVisible(false);
        this.hoTenJtf.setText("  ");
        this.soCCCDJtf.setText("  ");
        this.tinhTrangCachLyJtf.setText(" ");
        this.jComboBox1.setSelectedItem("NULL");
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cachLyJtf2;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField dichTeJtf2;
    private javax.swing.JPanel hienThiJpn;
    private javax.swing.JLabel hoTenJlb;
    private javax.swing.JTextField hoTenJtf;
    private javax.swing.JTextField hoTenJtf2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel khaiBaoJpn;
    private javax.swing.JTextField lamViecJtf2;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel soCCCDJlb;
    private javax.swing.JTextField soCCCDJtf;
    private javax.swing.JTextField soCCCDJtf2;
    private javax.swing.JTextField thuongTruJtf2;
    private javax.swing.JLabel tinhTrangCachLyJlb;
    private javax.swing.JTextField tinhTrangCachLyJtf;
    private javax.swing.JLabel tinhTrangDichTeJlb;
    // End of variables declaration//GEN-END:variables
}
