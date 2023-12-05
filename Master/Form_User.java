/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import Main.UserSession;
import config.Koneksi;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.ClassNotFoundException;
import java.util.Arrays;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Lenovo
 */
public class Form_User extends javax.swing.JPanel {
    
    private DefaultTableModel DftTblModel_barang;
    private String SQL; 
    private Connection conn;
    
    UserSession UserSession = new UserSession();
    public Form_User() throws ClassNotFoundException {
        initComponents();
        conn = Koneksi.getConnection(); //mendapatkan connection dari sql
        txttemp_username.hide();
        GetData();
        BtnEnabled(false);
        txt_password.setVisible(true);
        jLabel7.setVisible(true);
        txt_id.setEditable(false);
    }
    
    
     private void TxtEmpty(){
        txt_id.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_telp.setText("");
        txt_username.setText("");
        txt_password.setText("");
        cb_status.setSelectedItem("AKTIF");
        cb_level.setSelectedItem("KARYAWAN");
        txttemp_username.setText("");
    }
    
    private void BtnEnabled(boolean x) {
        btn_edit.setEnabled(x);
        btn_hapus.setEnabled(x);
    }
    
    private void GetData() {
        try {
            Connection conn = Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tableusers");
            tbl_user.setModel(DbUtils.resultSetToTableModel(sql));
            tbl_user.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbl_user.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_user.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbl_user.getColumnModel().getColumn(3).setPreferredWidth(80);

            //sql.last();
            String count_rows = String.valueOf(tbl_user.getRowCount());
            lblcount_rows.setText("Jumlah Data : " + count_rows);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void GetData_View(){
        int row = tbl_user.getSelectedRow();
        String row_id = (tbl_user.getModel().getValueAt(row, 0).toString());
        txt_id.setText(row_id);
        BtnEnabled(true);
        if(row_id.equals(Integer.toString(UserSession.getU_id()))){
            btn_hapus.setEnabled(false);
        }
    }
    
    private void cariBarang() {
        try {
            Connection conn = Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM tableusers"
            + " WHERE tableusers.user_Id LIKE '%" + txt_cariUser.getText() 
                    + "%' || tableusers.nama_user LIKE '%" + txt_cariUser.getText() 
                    + "%' || tableusers.alamat_user LIKE '%" + txt_cariUser.getText() 
                    + "%' || tableusers.username_user LIKE '%" + txt_cariUser.getText()
                    + "%' || tableusers.level_user LIKE '%" + txt_cariUser.getText() 
                    + "%' || tableusers.telp_user LIKE '%" + txt_cariUser.getText() 
                    + "%' || tableusers.status_user LIKE '%" + txt_cariUser.getText() + "%'");
            tbl_user.setModel(DbUtils.resultSetToTableModel(sql));
            tbl_user.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbl_user.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_user.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbl_user.getColumnModel().getColumn(3).setPreferredWidth(80);

            //sql.last();
            String count_rows = String.valueOf(tbl_user.getRowCount());
            lblcount_rows.setText("Jumlah Data : " + count_rows);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        lblcount_rows = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_id = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_level = new javax.swing.JComboBox<>();
        cb_status = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_telp = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        txttemp_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_cariUser = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(210, 218, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_tambah.setBackground(new java.awt.Color(0, 204, 51));
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btn_hapus.setBackground(new java.awt.Color(255, 0, 0));
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btn_edit.setBackground(new java.awt.Color(255, 0, 0));
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });
        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyReleased(evt);
            }
        });

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_userMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_userMouseReleased(evt);
            }
        });
        tbl_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_userKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 940, 200));

        lblcount_rows.setText("Jumlah Data");
        jPanel1.add(lblcount_rows, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel9.setText("Terpilih :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        jScrollPane2.setViewportView(txt_id);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 90, 20));

        jLabel2.setText("level pengguna :");

        cb_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KARYAWAN", "PEMILIK" }));
        cb_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_levelActionPerformed(evt);
            }
        });

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AKTIF", "NON-AKTIF" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });

        jLabel6.setText("status :");

        txt_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telpActionPerformed(evt);
            }
        });
        txt_telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telpKeyTyped(evt);
            }
        });

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });

        jLabel3.setText("nama pengguna :");

        jLabel5.setText("alamat pengguna :");

        jLabel4.setText("nomer telephone :");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        jLabel7.setText("password :");

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });

        jLabel8.setText("username :");

        btn_simpan.setBackground(new java.awt.Color(0, 204, 51));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 0, 0));
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_batal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19)
                                .addComponent(txt_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(363, 363, 363))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5))
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_batal)
                    .addComponent(btn_simpan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 940, 180));
        jPanel1.add(txttemp_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 23, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setText("Segarkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        txt_cariUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariUserActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cariUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 220, -1));

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/image/search.png"))); // NOI18N
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telpActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_statusActionPerformed

    private void cb_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_levelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_levelActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        tbl_user.clearSelection();
        TxtEmpty();
        BtnEnabled(false);
        txt_password.setVisible(true);
        jLabel7.setVisible(true);
        btn_simpan.setText("Simpan");
        txt_nama.requestFocus();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
         String row_id = txt_id.getText();
        if(!"0".equals(row_id)){
            try {
                btn_simpan.setText("Simpan Perubahan");
                txt_password.setVisible(false);
                jLabel7.setVisible(false);
                Connection conn = Koneksi.getConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM users WHERE user_Id='"+row_id+"'");
                if(sql.next()){
                    txt_id.setText(sql.getString("user_Id"));
                    String kode = sql.getString("username_user");
                    txt_nama.setText(sql.getString("nama_user"));
                    txt_username.setText(sql.getString("username_user"));
                    txt_alamat.setText(sql.getString("alamat_user"));
                    txt_telp.setText(sql.getString("telp_user"));
                    cb_status.setSelectedItem(sql.getString("status_user"));
                    cb_level.setSelectedItem(sql.getString("level_user"));
                    txttemp_username.setText(kode);
                    txt_nama.requestFocus();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan id null!");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void jScrollPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyReleased
        
    }//GEN-LAST:event_jScrollPane1KeyReleased

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String row_id = txt_id.getText();
        String row_txttemp_username = txttemp_username.getText();
        String row_txtnama = txt_nama.getText();
        String row_txtalamat = txt_alamat.getText();
        String row_txttelp = txt_telp.getText();
        String row_txtusername = txt_username.getText();
        String row_txtpassword = txt_password.getText();
        String row_txtstatus = cb_status.getSelectedItem().toString();
        String row_txtlevel = cb_level.getSelectedItem().toString();
        int c_kode = 0;

if (!"".equals(row_txtnama) && !"".equals(row_txtusername)) {
    try {
        Connection conn = Koneksi.getConnection();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet sql = stm.executeQuery("SELECT COUNT(user_Id) as count FROM users WHERE username_user='" + row_txtusername + "'");
        sql.next();
        c_kode = sql.getInt("count");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
    }

    if ("".equals(row_id)) {
        if (c_kode == 0) {
            try {
                Connection conn = Koneksi.getConnection();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("INSERT INTO users(nama_user, alamat_user, telp_user, username_user, password_user, level_user, status_user) VALUES ('" + row_txtnama + "', '" + row_txtalamat + "','" + row_txttelp + "','" + row_txtusername + "', '" + row_txtpassword + "','" + row_txtlevel + "','" + row_txtstatus + "')");
                JOptionPane.showMessageDialog(null, "Berhasil menyimpan data.");
                btn_tambah.doClick();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        if (c_kode == 0 || row_txtusername.equals(row_txttemp_username)) {
            try {
                Connection conn = Koneksi.getConnection();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("UPDATE users SET nama_user ='" + row_txtnama + "',alamat_user= '" + row_txtalamat 
                        + "',telp_user= '" + row_txttelp + "',username_user= '" + row_txtusername + "',level_user= '" 
                        + row_txtlevel + "',status_user='" + row_txtstatus + "' WHERE user_Id = '" + row_id + "'");
                JOptionPane.showMessageDialog(null, "Berhasil mengubah data.");
                btn_tambah.doClick();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong.");
}

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(ok==0) {
            try {
                String row_id = txt_id.getText();
                Connection conn = Koneksi.getConnection();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM users WHERE user_Id = '" + row_id + "'");
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data.");
                btn_tambah.doClick();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Form_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        char c = evt.getKeyChar();
        if(c == KeyEvent.VK_SPACE){
            JOptionPane.showMessageDialog(null, "Inputan tidak boleh menganduk spasi", "Ilegal Input", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_usernameKeyTyped

    private void tbl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseClicked
        GetData_View();
    }//GEN-LAST:event_tbl_userMouseClicked

    private void tbl_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_userKeyReleased
        GetData_View();
    }//GEN-LAST:event_tbl_userKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GetData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        btn_tambah.doClick();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_userMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseReleased
        GetData_View();
    }//GEN-LAST:event_tbl_userMouseReleased

    private void txt_telpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telpKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) && !(c == KeyEvent.VK_BACK_SPACE)){
            JOptionPane.showMessageDialog(null, "Inputan hanya boleh angka", "Ilegal Input", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_telpKeyTyped

    private void txt_cariUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariUserActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        cariBarang();
    }//GEN-LAST:event_btn_cariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cb_level;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcount_rows;
    private javax.swing.JTable tbl_user;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cariUser;
    private javax.swing.JTextPane txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_telp;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txttemp_username;
    // End of variables declaration//GEN-END:variables



}
