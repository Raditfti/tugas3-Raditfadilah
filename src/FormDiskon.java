import javax.swing.JOptionPane;
public class FormDiskon extends javax.swing.JFrame {

    
    public FormDiskon() {
        initComponents();
        cmbDiskon.addItem("10%");
        cmbDiskon.addItem("20%");
        cmbDiskon.addItem("30%");
        sldDiskon.setMinimum(0);
        sldDiskon.setMaximum(50);
        sldDiskon.setMajorTickSpacing(10);
        sldDiskon.setPaintTicks(true);
        sldDiskon.setPaintLabels(true);
        
        txtRiwayat.setLineWrap(true);
        txtRiwayat.setWrapStyleWord(true);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblHargaAsli = new javax.swing.JLabel();
        txtHargaAsli = new javax.swing.JTextField();
        lblDiskon = new javax.swing.JLabel();
        cmbDiskon = new javax.swing.JComboBox<>();
        sldDiskon = new javax.swing.JSlider();
        lblKupon = new javax.swing.JLabel();
        txtKupon = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        lblPenghematan = new javax.swing.JLabel();
        lblNilaiPenghematan = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        lblNilaiHasil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setBackground(new java.awt.Color(240, 248, 255));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJudul.setText("APLIKASI PERHITUNGAN DISKON");

        lblHargaAsli.setText("Harga Asli");

        lblDiskon.setText("Diskon (%)");

        cmbDiskon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiskonItemStateChanged(evt);
            }
        });

        sldDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDiskonStateChanged(evt);
            }
        });

        lblKupon.setText("Kode Kupon");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        lblPenghematan.setText("Jumlah Penghematan");

        lblNilaiPenghematan.setText("Nilai Penghematan");

        lblHasil.setText("Harga Akhir");

        lblNilaiHasil.setText("Nilai Hasil");

        txtRiwayat.setEditable(false);
        txtRiwayat.setColumns(20);
        txtRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtRiwayat);

        jLabel1.setText("Riwayat Perhitungan :");

        jLabel2.setText(":");

        jLabel3.setText(":");

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel6.setText(":");

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                                .addComponent(lblDiskon)
                                .addGap(31, 31, 31))
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(lblKupon)
                                .addGap(22, 22, 22)))
                        .addGap(42, 42, 42)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKupon))))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(lblHargaAsli)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(cmbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(txtHargaAsli)))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHitung)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPenghematan)
                                    .addComponent(lblHasil))
                                .addGap(18, 18, 18)
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNilaiPenghematan)
                                    .addComponent(lblNilaiHasil)))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHargaAsli)
                    .addComponent(txtHargaAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiskon))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKupon)
                    .addComponent(txtKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPenghematan)
                    .addComponent(lblNilaiPenghematan)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasil)
                    .addComponent(lblNilaiHasil)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDiskonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiskonItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selected = cmbDiskon.getSelectedItem().toString().replace("%", "");
            try {
                int diskon = Integer.parseInt(selected);
                sldDiskon.setValue(diskon);
            } catch (NumberFormatException e) {
                // abaikan jika nilai tidak valid
            }
        }
    }//GEN-LAST:event_cmbDiskonItemStateChanged

    private void sldDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDiskonStateChanged
            int nilai = sldDiskon.getValue();
    
            // Jika nilai yang dipilih cocok dengan item di ComboBox, sinkronkan
            for (int i = 0; i < cmbDiskon.getItemCount(); i++) {
                String item = cmbDiskon.getItemAt(i).replace("%", "");
                if (Integer.parseInt(item) == nilai) {
                    cmbDiskon.setSelectedIndex(i);
                    break;
                }
            }
    }//GEN-LAST:event_sldDiskonStateChanged

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        try {
            if (txtHargaAsli.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harga tidak boleh kosong!");
                return;
            }

            double hargaAsli = Double.parseDouble(txtHargaAsli.getText());
            if (hargaAsli < 0) {
                JOptionPane.showMessageDialog(this, "Harga tidak boleh negatif!");
                return;
            }

            int diskonPersen = Integer.parseInt(cmbDiskon.getSelectedItem().toString().replace("%", ""));
            int diskonSlider = sldDiskon.getValue();
            if (diskonSlider != 0) diskonPersen = diskonSlider;

            // Cek kode kupon, Kode kupon = "HEMAT5"
            double tambahanDiskon = 0;
            if (txtKupon.getText().equalsIgnoreCase("HEMAT5")) {
                tambahanDiskon = 5;
            }

            // Hitung diskon total
            double totalDiskon = diskonPersen + tambahanDiskon;
            double jumlahDiskon = hargaAsli * totalDiskon / 100;
            double hargaAkhir = hargaAsli - jumlahDiskon;

            // Tampilkan hasil
            lblNilaiPenghematan.setText(String.format("Rp %.2f", jumlahDiskon));
            lblNilaiHasil.setText(String.format("Rp %.2f", hargaAkhir));

            // Tambahkan ke riwayat
            txtRiwayat.append(
                String.format(
                    "Harga: Rp%.2f | Diskon: %d%% + %.0f%% | Hemat: Rp%.2f | Akhir: Rp%.2f\n----------------------------------------------------\n",
                    hargaAsli, diskonPersen, tambahanDiskon, jumlahDiskon, hargaAkhir
                )
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk harga!");
        }


    }//GEN-LAST:event_btnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(FormDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Gagal mengatur tampilan sistem");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDiskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiskon;
    private javax.swing.JLabel lblHargaAsli;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKupon;
    private javax.swing.JLabel lblNilaiHasil;
    private javax.swing.JLabel lblNilaiPenghematan;
    private javax.swing.JLabel lblPenghematan;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JSlider sldDiskon;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtKupon;
    private javax.swing.JTextArea txtRiwayat;
    // End of variables declaration//GEN-END:variables
}
