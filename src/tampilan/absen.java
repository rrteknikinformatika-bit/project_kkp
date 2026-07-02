/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author SAIF FATIH D
 */
public class absen extends javax.swing.JInternalFrame {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private String sql;
    /**
     * Creates new form absen
     */
    public absen() {
        initComponents();
        
            bcetak.setContentAreaFilled(false);
            bcetak.setFocusPainted(false);
            bcetak.setBorderPainted(false);
            bcetak.setOpaque(false);
            bcetak.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            bcariadmin.setContentAreaFilled(false);
            bcariadmin.setFocusPainted(false);
            bcariadmin.setBorderPainted(false);
            bcariadmin.setOpaque(false);
            bcariadmin.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            bcariabsen.setContentAreaFilled(false);
            bcariabsen.setFocusPainted(false);
            bcariabsen.setBorderPainted(false);
            bcariabsen.setOpaque(false);
            bcariabsen.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
        datatable();
        rdgroup.add(rhadir);
        rdgroup.add(rnhadir);
        
    }
    
    public void cetak() {
        try{
            String path="./src/report/reportabsen.jasper";
            HashMap parameter = new HashMap();
            parameter.put("kd_admin", labnip.getText());
            JasperPrint print = JasperFillManager.fillReport(path, parameter,conn);
            JasperViewer.viewReport(print, false);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen tidak ada" +ex);
        }
    }
    
    protected void kosong(){
        labnip.setText("");
        labnama.setText("");
        labtelp.setText("");
        rdgroup.clearSelection();
    }
    
protected void datatable(){
    // Menyesuaikan isi header tabel dengan data yang dipanggil (NIP, Nama, No Telp, Tgl, Kehadiran, Keterangan)
    Object[] Baris = {"ID Admin", "Nama Admin", "No. Telepon", "Tanggal", "Kehadiran", "Keterangan"};
    tabmode = new DefaultTableModel(null, Baris);
    tblabsn.setModel(tabmode); 

    try {
        // Pembenaran Query: Menggunakan LEFT JOIN agar data admin yang belum absen tetap muncul di tabel
        String sql = "SELECT a.kd_admin, a.nm_admin, a.no_telepon, b.tgl, b.kehadiran, b.keterangan " +
                     "FROM admin a " +
                     "LEFT JOIN absen_admin b ON a.kd_admin = b.kd_admin";

        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);

        while (hasil.next()) {
            // Mengambil data berdasarkan alias query yang benar
            tabmode.addRow(new Object[]{
                hasil.getString("kd_admin"),
                hasil.getString("nm_admin"),
                hasil.getString("no_telepon"),                     // Menampilkan No Telepon di tabel
                hasil.getString("tgl") == null ? "-" : hasil.getString("tgl"), // Jika belum absen, tulis "-"
                hasil.getString("kehadiran") == null ? "-" : hasil.getString("kehadiran"),
                hasil.getString("keterangan") == null ? "-" : hasil.getString("keterangan")
            });
        }
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,"data gagal dipanggil: " + e.getMessage());
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

        rdgroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblabsn = new javax.swing.JTable();
        rhadir = new javax.swing.JRadioButton();
        rnhadir = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txttidakhadir = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bbatal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtcariabsen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bcariabsen = new javax.swing.JButton();
        labnip = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labnama = new javax.swing.JLabel();
        bcariadmin = new javax.swing.JButton();
        labtelp = new javax.swing.JLabel();
        bcetak = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 249, 235));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("ABSEN");

        tblabsn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblabsn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblabsnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblabsn);

        rhadir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rhadir.setText("Hadir");
        rhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhadirActionPerformed(evt);
            }
        });

        rnhadir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rnhadir.setText("Tidak Hadir");
        rnhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnhadirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("DATA ABSEN");

        txttidakhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttidakhadirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("NIP               :");

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Nama            :");

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("No.Telpon    :");

        txtcariabsen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariabsenKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Kehadiran   :");

        bcariabsen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcariabsen.setText("Cari");
        bcariabsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariabsenActionPerformed(evt);
            }
        });

        labnip.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labnip.setText("----------");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Keterangan :");

        labnama.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnama.setText("------------------------------------");

        bcariadmin.setForeground(new java.awt.Color(255, 255, 255));
        bcariadmin.setText("Cari");
        bcariadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariadminActionPerformed(evt);
            }
        });

        labtelp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtelp.setText("------------------------------------");

        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(738, 738, 738)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcetak))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txttidakhadir)
                        .addComponent(labtelp, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rhadir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rnhadir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(labnip, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcariadmin))
                            .addComponent(labnama, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(bcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(labnip)
                                    .addComponent(bcariadmin))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(labnama)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labtelp))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rhadir)
                            .addComponent(rnhadir))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bcetak))
                            .addComponent(txttidakhadir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(509, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rnhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnhadirActionPerformed
txttidakhadir.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_rnhadirActionPerformed

    private void txttidakhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttidakhadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttidakhadirActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
try {
        String nip = labnip.getText();
        String kehadiran = rhadir.isSelected() ? "Hadir" : "Tidak Hadir";
        String keterangan = txttidakhadir.getText();
        java.sql.Date tanggalSekarang = new java.sql.Date(System.currentTimeMillis());

        // Query INSERT ke tabel absen_admin
        String sql = "INSERT INTO absen_admin (kd_admin, tgl, kehadiran, keterangan) VALUES (?, ?, ?, ?)";

        java.sql.PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, nip);
        stat.setDate(2, tanggalSekarang);
        stat.setString(3, kehadiran);
        stat.setString(4, keterangan);

        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Absen Berhasil Disimpan!");

        // Panggil method untuk refresh tabel riwayat/view
        datatable(); 

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menyimpan: " + e.getMessage());
    }

    }//GEN-LAST:event_bsimpanActionPerformed

    private void rhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhadirActionPerformed
    txttidakhadir.setEnabled(false);
    }//GEN-LAST:event_rhadirActionPerformed

    private void txtcariabsenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariabsenKeyPressed
if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            datatable();
        }      // TODO a        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariabsenKeyPressed

    private void bcariabsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariabsenActionPerformed
datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bcariabsenActionPerformed

    private void bcariadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariadminActionPerformed
        popup_admin pop = new popup_admin(null, true);
    // Mengaitkan form absen saat ini ke dalam variabel pop-up
    pop.fAbsen = this;
    pop.setVisible(true);
    pop.setResizable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bcariadminActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        kosong();
    datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
        cetak();
    }//GEN-LAST:event_bcetakActionPerformed

    private void tblabsnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblabsnMouseClicked
        int bar = tblabsn.getSelectedRow();
        javax.swing.table.TableModel model = tblabsn.getModel();

        labnip.setText(model.getValueAt(bar, 0).toString());
        labnama.setText(model.getValueAt(bar, 1).toString());
        labtelp.setText(model.getValueAt(bar, 2).toString());
        if ("Laki-Laki".equals(3)) {
            rhadir.setSelected(true);
        } else {
            rnhadir.setSelected(true);
        }
        txttidakhadir.setText(model.getValueAt(bar, 4).toString());
    }//GEN-LAST:event_tblabsnMouseClicked

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
            java.util.logging.Logger.getLogger(absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(absen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new absen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcariabsen;
    private javax.swing.JButton bcariadmin;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labnama;
    public javax.swing.JLabel labnip;
    public javax.swing.JLabel labtelp;
    private javax.swing.ButtonGroup rdgroup;
    private javax.swing.JRadioButton rhadir;
    private javax.swing.JRadioButton rnhadir;
    private javax.swing.JTable tblabsn;
    private javax.swing.JTextField txtcariabsen;
    private javax.swing.JTextField txttidakhadir;
    // End of variables declaration//GEN-END:variables
}
