/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import config.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Form_DasbordPemilik extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;
    Date tanggal = new Date();

    public Form_DasbordPemilik() {
        initComponents();

        p_notifikasi.hide();
        totalPenjualan();
        totalKeuntungan();
        totalProduk();
        notifikasi();
        stok();
        terlaris();
        tampilLaporan();
        totalPendapatan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalBarang = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lb_totalPenjualan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_totalKeuntungan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lb_totalProduk = new javax.swing.JLabel();
        p_notifikasi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_stok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_caristok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_stok = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_favorit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_laporan = new javax.swing.JTable();
        txt_terlaris = new javax.swing.JTextField();
        btn_cariterlaris = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lb_pendapatan = new javax.swing.JLabel();

        totalBarang.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        totalBarang.setForeground(new java.awt.Color(255, 255, 255));
        totalBarang.setText("0");
        totalBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Banyak Barang");

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(210, 218, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Dasboard");

        jPanel2.setBackground(new java.awt.Color(245, 235, 224));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Penjualan Hari Ini");

        lb_totalPenjualan.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lb_totalPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_totalPenjualan.setText("0");
        lb_totalPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_totalPenjualan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_totalPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(245, 235, 224));

        lb_totalKeuntungan.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lb_totalKeuntungan.setText("0");
        lb_totalKeuntungan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Keuntungan Hari Ini");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Rp");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_totalKeuntungan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_totalKeuntungan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(245, 235, 224));

        jLabel10.setText("Produk Dapat Dijual");

        lb_totalProduk.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lb_totalProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_totalProduk.setText("0");
        lb_totalProduk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_totalProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lb_totalProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(30, 30, 30))
        );

        p_notifikasi.setBackground(new java.awt.Color(255, 0, 0));
        p_notifikasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        p_notifikasi.setForeground(new java.awt.Color(255, 255, 255));
        p_notifikasi.setPreferredSize(new java.awt.Dimension(900, 56));
        p_notifikasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_notifikasiMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Peringatan!! terdapat stok produk kurang dari 3 buah");

        javax.swing.GroupLayout p_notifikasiLayout = new javax.swing.GroupLayout(p_notifikasi);
        p_notifikasi.setLayout(p_notifikasiLayout);
        p_notifikasiLayout.setHorizontalGroup(
            p_notifikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_notifikasiLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_notifikasiLayout.setVerticalGroup(
            p_notifikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        txt_stok.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stok.setText("3");

        jLabel4.setText("stok produk kurang dari :");

        btn_caristok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/image/search.png"))); // NOI18N
        btn_caristok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_caristokActionPerformed(evt);
            }
        });

        tb_stok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tb_stok);

        jLabel5.setText("produk favorit");

        tb_favorit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tb_favorit);

        jLabel6.setText("Penjualan hari ini");

        tb_laporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(tb_laporan);

        txt_terlaris.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_terlaris.setText("5");

        btn_cariterlaris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/image/search.png"))); // NOI18N
        btn_cariterlaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariterlarisActionPerformed(evt);
            }
        });

        jLabel11.setText("baris :");

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));
        jPanel5.setMaximumSize(new java.awt.Dimension(899, 87));
        jPanel5.setMinimumSize(new java.awt.Dimension(899, 87));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel12.setText("Total Pendapatan Hari Ini :  Rp");

        lb_pendapatan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lb_pendapatan.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_pendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lb_pendapatan))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_stok, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_caristok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_terlaris, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cariterlaris, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(p_notifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_notifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_stok)
                            .addComponent(txt_terlaris)
                            .addComponent(btn_caristok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cariterlaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void p_notifikasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_notifikasiMouseClicked
        p_notifikasi.hide();
    }//GEN-LAST:event_p_notifikasiMouseClicked

    private void btn_caristokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_caristokActionPerformed
        stok();
    }//GEN-LAST:event_btn_caristokActionPerformed

    private void btn_cariterlarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariterlarisActionPerformed
        terlaris();
    }//GEN-LAST:event_btn_cariterlarisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_caristok;
    private javax.swing.JButton btn_cariterlaris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_pendapatan;
    private javax.swing.JLabel lb_totalKeuntungan;
    private javax.swing.JLabel lb_totalPenjualan;
    private javax.swing.JLabel lb_totalProduk;
    private javax.swing.JPanel p_notifikasi;
    private javax.swing.JTable tb_favorit;
    private javax.swing.JTable tb_laporan;
    private javax.swing.JTable tb_stok;
    private javax.swing.JLabel totalBarang;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField txt_terlaris;
    // End of variables declaration//GEN-END:variables

    private void totalPenjualan() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalPenjualan = dateFormat.format(tanggal);

            String jumlahPenjualan = "CALL JumlahPenjualan('" + tanggalPenjualan + "', @JumlahPenjualan);";
            String selectJumlahPenjualan = "SELECT @JumlahPenjualan;";

            // Eksekusi perintah CALL JumlahPenjualan
            ps = Koneksi.getConnection().prepareStatement(jumlahPenjualan);
            ps.execute();

            // Eksekusi perintah SELECT untuk mengambil nilai @JumlahPenjualan
            ps = Koneksi.getConnection().prepareStatement(selectJumlahPenjualan);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb_totalPenjualan.setText(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Periksa kembali " + e.getMessage());
        }
    }

    private void totalKeuntungan() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalPenjualan = dateFormat.format(tanggal);

            String totalKeuntungan = "CALL Keuntungan('" + tanggalPenjualan + "', @totalKeuntungan)";
            String selectTotalKeuntungan = "SELECT @totalKeuntungan;";

            // Eksekusi perintah CALL Keuntungan
            ps = Koneksi.getConnection().prepareStatement(totalKeuntungan);
            ps.execute();

            // Eksekusi perintah SELECT untuk mengambil nilai @totalKeuntungan
            ps = Koneksi.getConnection().prepareStatement(selectTotalKeuntungan);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb_totalKeuntungan.setText(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Periksa kembali " + e.getMessage());
        }
    }
    
    
    private void totalPendapatan() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalPenjualan = dateFormat.format(tanggal);

            String totalPendapatan = "CALL TotalPendapatan('" + tanggalPenjualan + "', @totalHargaPenjualan)";
            String selectTotalPendapatan = "SELECT @totalHargaPenjualan;";

            // Eksekusi perintah CALL TotalPendapatan
            ps = Koneksi.getConnection().prepareStatement(totalPendapatan);
            ps.execute();

            // Eksekusi perintah SELECT untuk mengambil nilai @totalHargaPenjualan
            ps = Koneksi.getConnection().prepareStatement(selectTotalPendapatan);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb_pendapatan.setText(Integer.toString(rs.getInt(1)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Periksa kembali " + e.getMessage());
        }
    }

    private void totalProduk() {
        try {
            String Produk = "SELECT COUNT(*) AS JumlahProduk \n"
                    + "FROM produk \n"
                    + "WHERE stok_produk > 0;";
            ps = Koneksi.getConnection().prepareStatement(Produk);
            rs = ps.executeQuery();
            if (rs.next()) {
                lb_totalProduk.setText(Integer.toString(rs.getInt(1)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "di cek Kembali " + e + "");
        }
    }

    private void notifikasi() {
        try {
            String Produk = "SELECT stok_produk FROM produk ";
            ps = Koneksi.getConnection().prepareStatement(Produk);
            rs = ps.executeQuery();
            while (rs.next()) {
                int stok = rs.getInt(1);
                if (stok < 3) {
                    p_notifikasi.setVisible(true);
                }
            }

            // Menutup koneksi ke database
            rs.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cek kembali: " + e.getMessage());
        }
    }

    private void stok() {
        String stok = txt_stok.getText();

        DefaultTableModel LaporanStok = new DefaultTableModel();
        LaporanStok.addColumn("Kode Produk");
        LaporanStok.addColumn("Nama Produk");
        LaporanStok.addColumn("Stok Produk");

        try {
            String cari = "CALL ProdukKurangDari('" + stok + "');";
            ps = Koneksi.getConnection().prepareStatement(cari);
            rs = ps.executeQuery();

            boolean dataFound = false;

            while (rs.next()) {
                dataFound = true;
                LaporanStok.addRow(new Object[]{
                    rs.getString("kode_produk"),
                    rs.getString("nama_produk"),
                    rs.getString("stok_produk")
                });
            }

            if (dataFound) {
                tb_stok.setModel(LaporanStok);
            } else {
                // Jika tidak ada data ditemukan, kosongkan tabel
                LaporanStok.setRowCount(0);
                tb_stok.setModel(LaporanStok);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cek kembali " + e + "");
        }
    }

    private void terlaris() {
     String favorit = txt_terlaris.getText();

        DefaultTableModel LaporanLaris = new DefaultTableModel();
        LaporanLaris.addColumn("Kode Produk");
        LaporanLaris.addColumn("Nama Produk");
        LaporanLaris.addColumn("harga_jual");

        try {
            String cari = "CALL TopProduk('" + favorit + "');";
            ps = Koneksi.getConnection().prepareStatement(cari);
            rs = ps.executeQuery();

            boolean dataFound = false;

            while (rs.next()) {
                dataFound = true;
                LaporanLaris.addRow(new Object[]{
                    rs.getString("kode_produk"),
                    rs.getString("nama_produk"),
                    rs.getString("harga_jual")
                });
            }

            if (dataFound) {
                tb_favorit.setModel(LaporanLaris);
            } else {
                // Jika tidak ada data ditemukan, kosongkan tabel
                LaporanLaris.setRowCount(0);
                tb_favorit.setModel(LaporanLaris);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cek kembali " + e + "");
        }   
    }
    
    private void tampilLaporan() {
        try {
            String tampilBarang = "SELECT * FROM laporan_penjualan WHERE tanggal_penjualan = CURRENT_DATE;";
            ps = Koneksi.getConnection().prepareStatement(tampilBarang);
            rs = ps.executeQuery();

            DefaultTableModel laporan = new DefaultTableModel();
            laporan.addColumn("Kode Transaksi");
            laporan.addColumn("Total Harga");
            laporan.addColumn("Kasir");

            laporan.getDataVector().removeAllElements();
            laporan.fireTableDataChanged();
            laporan.setRowCount(0);

            while (rs.next()) {
                laporan.addRow(new Object[]{
                    rs.getString("penjualan_Id"),
                    rs.getString("total_pembayaran"),
                    rs.getString("nama_user")
                });
                tb_laporan.setModel(laporan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cek Kembali " + e + "");
        }
    }

}
