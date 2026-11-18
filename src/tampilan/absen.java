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
        polesDesainAbsen();
        
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
            String reportPath = "/report/reportabsenKKP.jasper";
        java.io.InputStream is = getClass().getResourceAsStream(reportPath);
        java.util.HashMap param = new java.util.HashMap();
        koneksi kon = new koneksi();
        net.sf.jasperreports.engine.JasperPrint print = net.sf.jasperreports.engine.JasperFillManager.fillReport(is, param, kon.connect());
        net.sf.jasperreports.view.JasperViewer.viewReport(print, false);
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Cetak Laporan Absen Gagal: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelCardKanan = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblabsn = new javax.swing.JTable();
        txtcariabsen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bcariabsen = new javax.swing.JButton();
        panelCardKiri = new javax.swing.JPanel();
        labnama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bcetak = new javax.swing.JButton();
        bcariadmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labtelp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttidakhadir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        rnhadir = new javax.swing.JRadioButton();
        bbatal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labnip = new javax.swing.JLabel();
        rhadir = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("ADMIN");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        jPanel3.setBackground(new java.awt.Color(252, 249, 235));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("ABSEN");

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

        txtcariabsen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariabsenKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Data Absen");

        bcariabsen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcariabsen.setForeground(new java.awt.Color(255, 255, 255));
        bcariabsen.setText("Cari");
        bcariabsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariabsenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCardKananLayout = new javax.swing.GroupLayout(panelCardKanan);
        panelCardKanan.setLayout(panelCardKananLayout);
        panelCardKananLayout.setHorizontalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(bcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCardKananLayout.setVerticalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bcariabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtcariabsen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labnama.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnama.setText("------------------------------------");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Kehadiran   :");

        bcetak.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        bcariadmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcariadmin.setForeground(new java.awt.Color(255, 255, 255));
        bcariadmin.setText("Cari");
        bcariadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariadminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("NIP               :");

        labtelp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtelp.setText("------------------------------------");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Keterangan :");

        txttidakhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttidakhadirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Nama            :");

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        rnhadir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rnhadir.setText("Tidak Hadir");
        rnhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnhadirActionPerformed(evt);
            }
        });

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("No.Telpon    :");

        labnip.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labnip.setText("------------------------------------");

        rhadir.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rhadir.setText("Hadir");
        rhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhadirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCardKiriLayout = new javax.swing.GroupLayout(panelCardKiri);
        panelCardKiri.setLayout(panelCardKiriLayout);
        panelCardKiriLayout.setHorizontalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labnama, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labnip)
                            .addComponent(txttidakhadir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(rhadir)
                                .addGap(18, 18, 18)
                                .addComponent(rnhadir))
                            .addComponent(labtelp, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCardKiriLayout.createSequentialGroup()
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(bcariadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panelCardKiriLayout.setVerticalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labnip))
                    .addComponent(bcariadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labnama))
                .addGap(25, 25, 25)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labtelp))
                .addGap(31, 31, 31)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rhadir)
                    .addComponent(rnhadir))
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txttidakhadir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelCardKanan, panelCardKiri});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void polesDesainAbsen() {
    // 1. Poles 2 Panel Utama (Kartu Warm Sand Melengkung)
    javax.swing.JPanel[] kartu = {panelCardKiri, panelCardKanan};
    for (javax.swing.JPanel p : kartu) {
        p.setOpaque(false);
        p.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new java.awt.Color(253, 250, 243)); // Warm Sand
                g2.fillRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 20, 20);
                g2.setColor(new java.awt.Color(226, 218, 200)); // Garis tepi krem hangat
                g2.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 20, 20);
                g2.dispose();
                super.paint(g, c);
            }
        });
    }

    // 2. Poles Semua Tombol (Sesuaikan nama variabel tombol kamu di baris bawah ini)
    // Urutan: {Tombol Simpan, Tombol Cetak, Tombol Batal, Tombol Cari NIP, Tombol Cari Tabel}
    javax.swing.JButton[] daftarTombol = {bsimpan, bcetak, bbatal, bcariadmin, bcariabsen};
    java.awt.Color[] warnaTombol = {
        new java.awt.Color(30, 58, 95),    // Simpan: Navy Gelap
        new java.awt.Color(59, 130, 246),  // Cetak: Biru Terang
        new java.awt.Color(239, 68, 68),   // Batal: Merah Lembut
        new java.awt.Color(30, 58, 95),    // Cari NIP: Navy Gelap
        new java.awt.Color(30, 58, 95)     // Cari Tabel: Navy Gelap
    };

    for (int i = 0; i < daftarTombol.length; i++) {
        final javax.swing.JButton btn = daftarTombol[i];
        final java.awt.Color bgWarna = warnaTombol[i];
        final int jenisIkon = i;

        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setForeground(java.awt.Color.WHITE);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.setIconTextGap(8);

        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(16, 16, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D gIkon = img.createGraphics();
        gIkon.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        gIkon.setColor(java.awt.Color.WHITE);
        gIkon.setStroke(new java.awt.BasicStroke(1.6f));
        if (jenisIkon == 0) { // Simpan (Disket)
            gIkon.drawRoundRect(2, 2, 11, 11, 2, 2);
            gIkon.fillRect(5, 2, 5, 4);
            gIkon.fillRect(4, 8, 7, 5);
        } else if (jenisIkon == 1) { // Cetak (Printer)
            gIkon.drawRect(4, 2, 8, 3);
            gIkon.drawRoundRect(2, 5, 12, 6, 2, 2);
            gIkon.fillRect(4, 9, 8, 5);
        } else if (jenisIkon == 2) { // Batal (Silang)
            gIkon.drawLine(4, 4, 12, 12);
            gIkon.drawLine(12, 4, 4, 12);
        } else { // Cari (Kaca Pembesar)
            gIkon.drawOval(2, 2, 8, 8);
            gIkon.drawLine(9, 9, 13, 13);
        }
        gIkon.dispose();
        btn.setIcon(new javax.swing.ImageIcon(img));

        btn.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                if (btn.getModel().isPressed()) {
                    g2.setColor(bgWarna.darker());
                } else if (btn.getModel().isRollover()) {
                    g2.setColor(bgWarna.brighter());
                } else {
                    g2.setColor(bgWarna);
                }
                g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 22, 22);
                g2.dispose();
                super.paint(g, c);
            }
        });
    }

    // 3. Poles Kotak Input (TextField & TextArea Keterangan)
    java.util.List<javax.swing.JComponent> daftarInput = new java.util.ArrayList<>();
    for (java.awt.Component comp : panelCardKiri.getComponents()) {
        if (comp instanceof javax.swing.JTextField || comp instanceof javax.swing.JScrollPane) {
            daftarInput.add((javax.swing.JComponent) comp);
        }
    }
    for (java.awt.Component comp : panelCardKanan.getComponents()) {
        if (comp instanceof javax.swing.JTextField) {
            daftarInput.add((javax.swing.JComponent) comp);
        }
    }

    for (final javax.swing.JComponent field : daftarInput) {
        if (field instanceof javax.swing.JTextField) {
            field.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
            field.setForeground(new java.awt.Color(15, 23, 42));
            field.setOpaque(false);
            field.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 12, 5, 12));
            ((javax.swing.JTextField) field).setUI(new javax.swing.plaf.basic.BasicTextFieldUI() {
                @Override
                protected void paintSafely(java.awt.Graphics g) {
                    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                    int w = field.getWidth();
                    int h = field.getHeight();
                    boolean fokus = field.isFocusOwner();

                    g2.setColor(fokus ? java.awt.Color.WHITE : new java.awt.Color(248, 250, 252));
                    g2.fillRoundRect(0, 0, w - 1, h - 1, 12, 12);

                    g2.setColor(fokus ? new java.awt.Color(59, 130, 246) : new java.awt.Color(203, 213, 225));
                    g2.setStroke(new java.awt.BasicStroke(fokus ? 1.5f : 1f));
                    g2.drawRoundRect(0, 0, w - 1, h - 1, 12, 12);
                    g2.dispose();
                    super.paintSafely(g);
                }
            });
            field.addFocusListener(new java.awt.event.FocusAdapter() {
                @Override
                public void focusGained(java.awt.event.FocusEvent e) { field.repaint(); }
                @Override
                public void focusLost(java.awt.event.FocusEvent e) { field.repaint(); }
            });
        } else if (field instanceof javax.swing.JScrollPane) {
            // Untuk kotak Keterangan (JTextArea di dalam JScrollPane)
            field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225), 1, true));
            java.awt.Component view = ((javax.swing.JScrollPane) field).getViewport().getView();
            if (view instanceof javax.swing.JTextArea) {
                view.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
                view.setBackground(new java.awt.Color(248, 250, 252));
            }
        }
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcariabsen;
    private javax.swing.JButton bcariadmin;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bsimpan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labnama;
    public javax.swing.JLabel labnip;
    public javax.swing.JLabel labtelp;
    private javax.swing.JPanel panelCardKanan;
    private javax.swing.JPanel panelCardKiri;
    private javax.swing.ButtonGroup rdgroup;
    private javax.swing.JRadioButton rhadir;
    private javax.swing.JRadioButton rnhadir;
    private javax.swing.JTable tblabsn;
    private javax.swing.JTextField txtcariabsen;
    private javax.swing.JTextField txttidakhadir;
    // End of variables declaration//GEN-END:variables
}
