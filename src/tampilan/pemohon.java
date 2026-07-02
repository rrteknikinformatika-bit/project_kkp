/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Fajar Abdi
 */
public class pemohon extends javax.swing.JInternalFrame {
 private Connection conn = new koneksi().connect() ;
    private DefaultTableModel tabmode;
    /**
     * Creates new form tampilan
     */
    public pemohon() {
        initComponents();
        
            bsimpan.setContentAreaFilled(false);
            bsimpan.setFocusPainted(false);
            bsimpan.setBorderPainted(false);
            bsimpan.setOpaque(false);
            bsimpan.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        // Mengaktifkan anti-aliasing supaya pinggiran bulatnya halus tidak patah-patah
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengambil warna krem secara otomatis dari jPanel5 (panel kiri kamu)
        g2.setColor(new java.awt.Color(0,51,102));
        
        // Menggambar bentuk kapsul oval penuh sesuai ukuran tombol asli
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), c.getHeight(), c.getHeight());
        
        g2.dispose();
        super.paint(g, c);
    }
});
            
            bubah.setContentAreaFilled(false);
            bubah.setFocusPainted(false);
            bubah.setBorderPainted(false);
            bubah.setOpaque(false);
            bubah.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        // Mengaktifkan anti-aliasing supaya pinggiran bulatnya halus tidak patah-patah
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengambil warna krem secara otomatis dari jPanel5 (panel kiri kamu)
        g2.setColor(new java.awt.Color(0,51,102));
        
        // Menggambar bentuk kapsul oval penuh sesuai ukuran tombol asli
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), c.getHeight(), c.getHeight());
        
        g2.dispose();
        super.paint(g, c);
    }
});
            
            bbatal.setContentAreaFilled(false);
            bbatal.setFocusPainted(false);
            bbatal.setBorderPainted(false);
            bbatal.setOpaque(false);
            bbatal.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        // Mengaktifkan anti-aliasing supaya pinggiran bulatnya halus tidak patah-patah
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengambil warna krem secara otomatis dari jPanel5 (panel kiri kamu)
        g2.setColor(new java.awt.Color(0,51,102));
        
        // Menggambar bentuk kapsul oval penuh sesuai ukuran tombol asli
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), c.getHeight(), c.getHeight());
        
        g2.dispose();
        super.paint(g, c);
    }
});
            
            bhapus.setContentAreaFilled(false);
            bhapus.setFocusPainted(false);
            bhapus.setBorderPainted(false);
            bhapus.setOpaque(false);
            bhapus.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        // Mengaktifkan anti-aliasing supaya pinggiran bulatnya halus tidak patah-patah
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengambil warna krem secara otomatis dari jPanel5 (panel kiri kamu)
        g2.setColor(new java.awt.Color(0,51,102));
        
        // Menggambar bentuk kapsul oval penuh sesuai ukuran tombol asli
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), c.getHeight(), c.getHeight());
        
        g2.dispose();
        super.paint(g, c);
    }
});
            
            bcari.setContentAreaFilled(false);
            bcari.setFocusPainted(false);
            bcari.setBorderPainted(false);
            bcari.setOpaque(false);
            bcari.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        // Mengaktifkan anti-aliasing supaya pinggiran bulatnya halus tidak patah-patah
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengambil warna krem secara otomatis dari jPanel5 (panel kiri kamu)
        g2.setColor(new java.awt.Color(0,51,102));
        
        // Menggambar bentuk kapsul oval penuh sesuai ukuran tombol asli
        g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), c.getHeight(), c.getHeight());
        
        g2.dispose();
        super.paint(g, c);
    }
});
        
        kosong();
        aktif();
        datatable();
    }
    
     protected void aktif(){
        txtpemohon.requestFocus();
    }
     
     protected void kosong(){
        txtpemohon.setText("");
        txtnama.setText("");
        txtnik.setText("");
        txtalamat.setText("");
        txttlpn.setText("");
        txtcari.setText("");
    }
     
     protected void datatable(){
    Object[] Baris = {"ID Pemohon", "Nama Pemohon", "NIK", "Alamat", "No Telpon"};
    tabmode = new DefaultTableModel(null, Baris);
    tblpemohon.setModel(tabmode); // penting (reset tabel)

    String cariitem = txtcari.getText();

    try {
        String sql = "SELECT * FROM pemohon WHERE idpmhn LIKE '%" + cariitem +
                     "%' OR nmpmhn LIKE '%" + cariitem + "%' ORDER BY idpmhn ASC";

        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);

        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString("idpmhn"),
                hasil.getString("nmpmhn"),
                hasil.getString("nik"),
                hasil.getString("alm"),
                hasil.getString("notlp")
            });
        }

    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"data gagal dipanggil: " + e);
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
        txtnik = new javax.swing.JTextField();
        txttlpn = new javax.swing.JTextField();
        bbatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        txtpemohon = new javax.swing.JTextField();
        bubah = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        bhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpemohon = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Form Pemohon");

        txtnik.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });

        txttlpn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        txtalamat.setColumns(20);
        txtalamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ID Pemohon");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("NIK");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("No Tlpn");

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        txtnama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        tblpemohon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Pemohon", "Nama", "NIK", "Alamat", "No Tlpn"
            }
        ));
        tblpemohon.setGridColor(new java.awt.Color(0, 51, 102));
        tblpemohon.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tblpemohon.setSelectionForeground(new java.awt.Color(0, 51, 102));
        tblpemohon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpemohonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpemohon);

        txtcari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        bcari.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcari.setForeground(new java.awt.Color(255, 255, 255));
        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Daftar Pemohon Terdaftar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Input Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtpemohon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnik, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttlpn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bhapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel8)))
                .addGap(373, 373, 373)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 342, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(682, 682, 682)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bsimpan)
                                    .addComponent(bubah)
                                    .addComponent(bbatal)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(bhapus)
                .addContainerGap(453, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
    datatable();     // TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
       String sql = "INSERT INTO pemohon (idpmhn, nmpmhn, nik, alm, notlp) VALUES (?,?,?,?,?)";
    
    try{
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtpemohon.getText());
        stat.setString(2, txtnama.getText());
        stat.setString(3, txtnik.getText());
        stat.setString(4, txtalamat.getText());
        stat.setString(5, txttlpn.getText());

        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        
        kosong();
        txtpemohon.requestFocus();
        
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + e.getMessage());
    }
    
    datatable();  // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
         try{
            
        String sql = "UPDATE pemohon SET nmpmhn=?, nik=?, alm=?, notlp=? WHERE nmpmhn=?";
        PreparedStatement stat = conn.prepareStatement(sql);
        
        stat.setString(1, txtnama.getText());
        stat.setString(2, txtnik.getText());
        stat.setString(3, txtalamat.getText());
        stat.setString(4, txttlpn.getText());
        stat.setString(5, txtpemohon.getText());

        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        
        kosong();
        txtpemohon.requestFocus();
        
    } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Data gagal diubah: " + e.getMessage());
    }
    
    datatable();// TODO add your handling code here:
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
      int ok = JOptionPane.showConfirmDialog(null, "hapus", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
    if (ok == 0) {
        String sql = "delete from pemohon where idpmhn='" + txtpemohon.getText() + "'";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil dihapus");
            kosong();
            txtpemohon.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
        }
        datatable();
    }
    }//GEN-LAST:event_bhapusActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariKeyPressed

    private void tblpemohonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpemohonMouseClicked
    int bar = tblpemohon.getSelectedRow();
String a = tabmode.getValueAt(bar, 0).toString();
String b = tabmode.getValueAt(bar, 1).toString();
String c = tabmode.getValueAt(bar, 2).toString();
String d = tabmode.getValueAt(bar, 3).toString();
String e = tabmode.getValueAt(bar, 4).toString();

txtpemohon.setText(a);
txtnama.setText(b);
txtnik.setText(c);
txttlpn.setText(d);
txtalamat.setText (e);// TODO add your handling code here:
    }//GEN-LAST:event_tblpemohonMouseClicked

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
    kosong();
    datatable();// TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

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
            java.util.logging.Logger.getLogger(pemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemohon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpemohon;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtpemohon;
    private javax.swing.JTextField txttlpn;
    // End of variables declaration//GEN-END:variables
}
