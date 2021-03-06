/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambyarcoffee;

import java.util.Date;

/**
 *
 * @author Rizki
 */
public class JFrameTransaksi extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    CoffeeShop cs = new CoffeeShop();
    Date date = new Date();
    /**
     * Creates new form NewJFramemainclass
     */
    public JFrameTransaksi(CoffeeShop cs) {
        this.cs = cs;
        initComponents();
        this.reset();
        jTextFieldIdTransaksi.setEnabled(false);
    }
    
    public JFrameTransaksi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBoxKopiHitam = new javax.swing.JCheckBox();
        jLabelQty1 = new javax.swing.JLabel();
        jSpinnerQty1 = new javax.swing.JSpinner();
        jCheckBoxKopiSusu = new javax.swing.JCheckBox();
        jLabelQty2 = new javax.swing.JLabel();
        jSpinnerQty2 = new javax.swing.JSpinner();
        jCheckBoxMoccacino = new javax.swing.JCheckBox();
        jLabelQty3 = new javax.swing.JLabel();
        jSpinnerQty3 = new javax.swing.JSpinner();
        jCheckBoxCapuccino = new javax.swing.JCheckBox();
        jLabelQty4 = new javax.swing.JLabel();
        jSpinnerQty4 = new javax.swing.JSpinner();
        jButtonPesan = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelIdTransaksi = new javax.swing.JLabel();
        jTextFieldIdTransaksi = new javax.swing.JTextField();
        jLabelIdPegawai = new javax.swing.JLabel();
        jTextFieldIdPegawai = new javax.swing.JTextField();
        jScrollPaneOutput = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jButtonLaporan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AMBYAR COFFEE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jCheckBoxKopiHitam.setText("Kopi Hitam");
        jCheckBoxKopiHitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxKopiHitamActionPerformed(evt);
            }
        });

        jLabelQty1.setText("Qty:");

        jSpinnerQty1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQty1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerQty1.setEnabled(false);

        jCheckBoxKopiSusu.setText("Kopi Susu");
        jCheckBoxKopiSusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxKopiSusuActionPerformed(evt);
            }
        });

        jLabelQty2.setText("Qty:");

        jSpinnerQty2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQty2.setEnabled(false);

        jCheckBoxMoccacino.setText("Moccacino");
        jCheckBoxMoccacino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMoccacinoActionPerformed(evt);
            }
        });

        jLabelQty3.setText("Qty:");

        jSpinnerQty3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQty3.setEnabled(false);

        jCheckBoxCapuccino.setText("Capucino");
        jCheckBoxCapuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCapuccinoActionPerformed(evt);
            }
        });

        jLabelQty4.setText("Qty:");

        jSpinnerQty4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQty4.setEnabled(false);

        jButtonPesan.setText("PESAN");
        jButtonPesan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesanActionPerformed(evt);
            }
        });

        jButtonReset.setText("RESET");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelIdTransaksi.setText("ID Transaksi");

        jTextFieldIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTransaksiActionPerformed(evt);
            }
        });

        jLabelIdPegawai.setText("ID Pegawai Yang Melayani");

        jTextAreaOutput.setEditable(false);
        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setLineWrap(true);
        jTextAreaOutput.setRows(5);
        jTextAreaOutput.setWrapStyleWord(true);
        jScrollPaneOutput.setViewportView(jTextAreaOutput);

        jButtonLaporan.setText("LAPORAN");
        jButtonLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBoxKopiHitam, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jCheckBoxMoccacino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelQty3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerQty3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelQty1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerQty1)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCheckBoxKopiSusu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabelQty2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerQty2)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabelQty4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerQty4))
                                        .addComponent(jCheckBoxCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelIdTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIdPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIdPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jTextFieldIdTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jButtonPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jButtonLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxKopiHitam)
                            .addComponent(jCheckBoxKopiSusu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQty1)
                            .addComponent(jSpinnerQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQty2)
                            .addComponent(jSpinnerQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jButtonPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMoccacino)
                            .addComponent(jCheckBoxCapuccino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQty3)
                            .addComponent(jSpinnerQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQty4)
                            .addComponent(jSpinnerQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdTransaksi)
                            .addComponent(jTextFieldIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdPegawai)
                            .addComponent(jTextFieldIdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxCapuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCapuccinoActionPerformed
        if (jCheckBoxCapuccino.isSelected()){
            jSpinnerQty4.setEnabled(true);
        }
        else {
            jSpinnerQty4.setValue(1);
            jSpinnerQty4.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxCapuccinoActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
       
        new JFrameMainMenu(cs).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesanActionPerformed
        if (jCheckBoxKopiHitam.isSelected() == false && jCheckBoxKopiSusu.isSelected() == false & jCheckBoxMoccacino.isSelected() == false && jCheckBoxCapuccino.isSelected() == false){
            jTextAreaOutput.setText("SILAHKAN PILIH MINIMAL 1 MENU!");
        }
        else if (jTextFieldIdTransaksi.getText().equals("")){
            jTextAreaOutput.setText("MASUKKAN ID TRANSAKSI TERLEBIH DAHULU!");
        }
        else if (jTextFieldIdPegawai.getText().equals("")){
            jTextAreaOutput.setText("MASUKKAN ID PEGAWAI TERLEBIH DAHULU!");
        }
        else if (cs.cariTransaksi(jTextFieldIdTransaksi.getText()) != null){
            jTextAreaOutput.setText("TRANSAKSI DENGAN ID TRANSAKSI TERSEBUT SUDAH TERDAFTAR!");
        }
        else if (cs.cariPegawai(jTextFieldIdPegawai.getText()) == null){
            jTextAreaOutput.setText("PEGAWAI YANG ANDA INPUTKAN TIDAK TERDAFTAR!");
        }
        else {
            Transaksi trs = new Transaksi();
            trs.setIdTransaksi(jTextFieldIdTransaksi.getText());
            trs.setPegawai(cs.cariPegawai(jTextFieldIdPegawai.getText()));
            if(jCheckBoxKopiHitam.isSelected()){
                MenuPesanan mp = new MenuPesanan();
                mp.setNamaMenu(Menu.KOPI_HITAM);
                mp.setQty(Integer.parseInt(String.valueOf(jSpinnerQty1.getValue())));
                trs.tambahMenu(mp);
            }
            if(jCheckBoxKopiSusu.isSelected()){
                MenuPesanan mp = new MenuPesanan();
                mp.setNamaMenu(Menu.KOPI_SUSU);
                mp.setQty(Integer.parseInt(String.valueOf(jSpinnerQty2.getValue())));
                trs.tambahMenu(mp);
            }
            if(jCheckBoxMoccacino.isSelected()){
                MenuPesanan mp = new MenuPesanan();
                mp.setNamaMenu(Menu.MOCCACINO);
                mp.setQty(Integer.parseInt(String.valueOf(jSpinnerQty3.getValue())));
                trs.tambahMenu(mp);
            }
            if(jCheckBoxCapuccino.isSelected()){
                MenuPesanan mp = new MenuPesanan();
                mp.setNamaMenu(Menu.CAPUCCINO);
                mp.setQty(Integer.parseInt(String.valueOf(jSpinnerQty4.getValue())));
                trs.tambahMenu(mp);
            }
            trs.setTs(date.getTime());
            trs.setTotalHarga();
            cs.tambahTransaksi(trs);
            jTextAreaOutput.setText("Transaksi " + jTextFieldIdTransaksi.getText() + " berhasil dibuat." +
                                    "\n\nTanggal : "+trs.getTs()+
                                    "\n--------------------------------------------------------------------\n" +
                                    trs.cetakMenu(Menu.KOPI_HITAM) + 
                                    trs.cetakMenu(Menu.KOPI_SUSU) + 
                                    trs.cetakMenu(Menu.CAPUCCINO) + 
                                    trs.cetakMenu(Menu.MOCCACINO) +
                                    
                                    "--------------------------------------------------------------------" +
                                    "\nTOTAL HARGA:\t\t" + trs.getTotalHarga() +
                                    "\nPegawai yang menangani:\t" + trs.getPegawai().getNamaPegawai() + " (" + trs.getPegawai().getIdPegawai() + ")"
                                    );
            this.reset();
        }
    }//GEN-LAST:event_jButtonPesanActionPerformed

    private void jTextFieldIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTransaksiActionPerformed
    
    }//GEN-LAST:event_jTextFieldIdTransaksiActionPerformed

    private void jCheckBoxKopiHitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxKopiHitamActionPerformed
        if (jCheckBoxKopiHitam.isSelected()){
            jSpinnerQty1.setEnabled(true);
        }
        else {
            jSpinnerQty1.setValue(1);
            jSpinnerQty1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxKopiHitamActionPerformed

    private void jCheckBoxKopiSusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxKopiSusuActionPerformed
        if (jCheckBoxKopiSusu.isSelected()){
            jSpinnerQty2.setEnabled(true);
        }
        else {
            jSpinnerQty2.setValue(1);
            jSpinnerQty2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxKopiSusuActionPerformed

    private void jCheckBoxMoccacinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMoccacinoActionPerformed
        if (jCheckBoxMoccacino.isSelected()){
            jSpinnerQty3.setEnabled(true);
        }
        else {
            jSpinnerQty3.setValue(1);
            jSpinnerQty3.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxMoccacinoActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        this.reset();
        jTextAreaOutput.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLaporanActionPerformed
        // TODO add your handling code here:
        new JFrameLaporan(cs).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLaporanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTransaksi().setVisible(true);
            }
        });
    }
    
    private void reset(){
        jCheckBoxKopiHitam.setSelected(false);
        jSpinnerQty1.setValue(1);
        jSpinnerQty1.setEnabled(false);
        jCheckBoxKopiSusu.setSelected(false);
        jSpinnerQty2.setValue(1);
        jSpinnerQty2.setEnabled(false);
        jCheckBoxMoccacino.setSelected(false);
        jSpinnerQty3.setValue(1);
        jSpinnerQty3.setEnabled(false);
        jCheckBoxCapuccino.setSelected(false);
        jSpinnerQty4.setValue(1);
        jSpinnerQty4.setEnabled(false);
        jTextFieldIdTransaksi.setText(String.valueOf(this.cs.getIdTransaksi()));
        jTextFieldIdPegawai.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonLaporan;
    private javax.swing.JButton jButtonPesan;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxCapuccino;
    private javax.swing.JCheckBox jCheckBoxKopiHitam;
    private javax.swing.JCheckBox jCheckBoxKopiSusu;
    private javax.swing.JCheckBox jCheckBoxMoccacino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIdPegawai;
    private javax.swing.JLabel jLabelIdTransaksi;
    private javax.swing.JLabel jLabelQty1;
    private javax.swing.JLabel jLabelQty2;
    private javax.swing.JLabel jLabelQty3;
    private javax.swing.JLabel jLabelQty4;
    private javax.swing.JScrollPane jScrollPaneOutput;
    private javax.swing.JSpinner jSpinnerQty1;
    private javax.swing.JSpinner jSpinnerQty2;
    private javax.swing.JSpinner jSpinnerQty3;
    private javax.swing.JSpinner jSpinnerQty4;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextField jTextFieldIdPegawai;
    private javax.swing.JTextField jTextFieldIdTransaksi;
    // End of variables declaration//GEN-END:variables
}
