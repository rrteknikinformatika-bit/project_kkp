/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import koneksi.koneksi; 
/**
 *
 * @author User
 */
public class halaman_utama extends javax.swing.JInternalFrame {

    /**
     * Creates new form halaman_utama
     */
    public halaman_utama() {
        initComponents();
        aturKartuStatistik();
        tampilkanStatistikLive();
        aturKartuFitur();
        aturGrafikDashboard();
        
        panelBanner.setOpaque(false);
        panelBanner.setBorder(null);
        panelBanner.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        int w = c.getWidth();
        int h = c.getHeight();
        int arc = 24;

        // Sudut melengkung mulus tanpa pinggiran putih
        java.awt.Shape bentuk = new java.awt.geom.RoundRectangle2D.Float(0, 0, w, h, arc, arc);
        g2.setClip(bentuk);

        // Gradasi biru gelap ke biru cerah modern
        java.awt.GradientPaint gradasi = new java.awt.GradientPaint(
            0, 0, new java.awt.Color(15, 36, 92),
            w, h, new java.awt.Color(29, 78, 216)
        );
        g2.setPaint(gradasi);
        g2.fill(bentuk);

        // Aksen lingkaran transparan modern di sisi kanan
        g2.setColor(new java.awt.Color(255, 255, 255, 18));
        g2.fillOval(w - 260, -60, 340, 340);
        g2.setColor(new java.awt.Color(56, 189, 248, 28));
        g2.fillOval(w - 190, 30, 260, 260);

        g2.dispose();
        super.paint(g, c);
    }
});
        
        tampilkanTanggalLive();
        tampilkanAkunLogin();

        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
    
        
    }
    
    private void tampilkanTanggalLive() {
    java.util.Locale lokalIndo = new java.util.Locale("id", "ID");
    final java.text.SimpleDateFormat formatTgl = new java.text.SimpleDateFormat("EEEE, dd MMMM yyyy", lokalIndo);

    // Tampilkan tanggal hari ini saat beranda pertama kali terbuka
    lblTanggal.setText(formatTgl.format(new java.util.Date()));

    // Perbarui otomatis setiap 1 detik agar live
    javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            lblTanggal.setText(formatTgl.format(new java.util.Date()));
        }
    });
    timer.start();
}

private void tampilkanAkunLogin() {
    String nama = login.namaUserLogin;
    if (nama == null || nama.trim().isEmpty()) {
        nama = "Admin";
    }
    lblNamaAdmin.setText(nama);

    // Ambil 2 huruf depan untuk inisial lingkaran (contoh: "Admin" menjadi "AD")
    String inisial = nama.length() >= 2
            ? nama.substring(0, 2).toUpperCase()
            : nama.toUpperCase();
    lblInisial.setText(inisial);

    panelAvatar.setOpaque(false);
    panelAvatar.setBorder(null);
    lblInisial.setOpaque(false);
    panelAvatar.setLayout(new java.awt.BorderLayout());
    lblInisial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblInisial.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    panelAvatar.add(lblInisial, java.awt.BorderLayout.CENTER);
    panelAvatar.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
    @Override
    public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new java.awt.Color(30, 41, 59));
        int ukuran = Math.min(c.getWidth(), c.getHeight());
        int x = (c.getWidth() - ukuran) / 2;
        int y = (c.getHeight() - ukuran) / 2;
        g2.fillOval(x, y, ukuran, ukuran);
        g2.dispose();
        super.paint(g, c);
    }
});

    
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelBanner = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        panelAvatar = new javax.swing.JPanel();
        lblInisial = new javax.swing.JLabel();
        lblNamaAdmin = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        stat1 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        lblTotalPemohon = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        stat3 = new javax.swing.JPanel();
        jlabel3 = new javax.swing.JLabel();
        lblJadwalHariIni = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        stat4 = new javax.swing.JPanel();
        jlabel4 = new javax.swing.JLabel();
        lblPetugasAktif = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        stat2 = new javax.swing.JPanel();
        jlabel2 = new javax.swing.JLabel();
        lblBerkasDiproses = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fitur1 = new javax.swing.JPanel();
        fitur2 = new javax.swing.JPanel();
        fitur3 = new javax.swing.JPanel();
        fitur4 = new javax.swing.JPanel();
        fitur5 = new javax.swing.JPanel();
        fitur7 = new javax.swing.JPanel();
        fitur6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        grafik1 = new javax.swing.JPanel();
        grafik2 = new javax.swing.JPanel();

        jLabel26.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel26.setText("Pengelolaan Pemohon");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("secara lengkap dan terstruktur");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("kelola data pemohon");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setMaximumSize(null);
        setMinimumSize(null);

        jPanel2.setBackground(new java.awt.Color(252, 249, 235));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Halaman Utama / Beranda");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 22)); // NOI18N
        jLabel11.setText("Fitur Utama Sistem");

        panelBanner.setBackground(new java.awt.Color(0, 51, 102));
        panelBanner.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISTEM ADMINISTRASI PENGUKURAN");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selamat Datang di");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BPN Jakarta Timur");

        jLabel12.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sistem informasi untuk mengelola data pemohon, permohonan, tugas, penugasan,");

        jLabel13.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jadwal dan tanah secara terintegrasi.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logo bpn warna.png"))); // NOI18N

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBannerLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBannerLayout.createSequentialGroup()
                        .addGroup(panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(56, 56, 56))
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBannerLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13))
                    .addComponent(jLabel1))
                .addGap(33, 33, 33))
        );

        lblTanggal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTanggal.setText("Minggu, 15 November 2026");

        panelAvatar.setBackground(new java.awt.Color(30, 41, 59));
        panelAvatar.setPreferredSize(new java.awt.Dimension(50, 50));

        lblInisial.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblInisial.setForeground(new java.awt.Color(255, 255, 255));
        lblInisial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInisial.setText("AD");
        lblInisial.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout panelAvatarLayout = new javax.swing.GroupLayout(panelAvatar);
        panelAvatar.setLayout(panelAvatarLayout);
        panelAvatarLayout.setHorizontalGroup(
            panelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAvatarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInisial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAvatarLayout.setVerticalGroup(
            panelAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvatarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInisial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNamaAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNamaAdmin.setForeground(new java.awt.Color(15, 23, 42));
        lblNamaAdmin.setText("Admin");

        lblStatus.setFont(new java.awt.Font("Yu Gothic", 1, 17)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(22, 163, 74));
        lblStatus.setText("Aktif");

        jlabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel1.setText("Total Pemohon");

        lblTotalPemohon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTotalPemohon.setText("0");

        javax.swing.GroupLayout stat1Layout = new javax.swing.GroupLayout(stat1);
        stat1.setLayout(stat1Layout);
        stat1Layout.setHorizontalGroup(
            stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel1)
                    .addComponent(lblTotalPemohon))
                .addContainerGap())
        );
        stat1Layout.setVerticalGroup(
            stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat1Layout.createSequentialGroup()
                .addGroup(stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stat1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabel1))
                    .addGroup(stat1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblIcon1)))
                .addGap(0, 0, 0)
                .addComponent(lblTotalPemohon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel3.setText("Jadwal Hari Ini");

        lblJadwalHariIni.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblJadwalHariIni.setText("0");

        javax.swing.GroupLayout stat3Layout = new javax.swing.GroupLayout(stat3);
        stat3.setLayout(stat3Layout);
        stat3Layout.setHorizontalGroup(
            stat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIcon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(stat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel3)
                    .addComponent(lblJadwalHariIni))
                .addContainerGap())
        );
        stat3Layout.setVerticalGroup(
            stat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblIcon3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stat3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel3)
                .addGap(0, 0, 0)
                .addComponent(lblJadwalHariIni)
                .addContainerGap())
        );

        jlabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel4.setText("Petugas Aktif");

        lblPetugasAktif.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPetugasAktif.setText("0");

        javax.swing.GroupLayout stat4Layout = new javax.swing.GroupLayout(stat4);
        stat4.setLayout(stat4Layout);
        stat4Layout.setHorizontalGroup(
            stat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIcon4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(stat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel4)
                    .addComponent(lblPetugasAktif))
                .addContainerGap())
        );
        stat4Layout.setVerticalGroup(
            stat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat4Layout.createSequentialGroup()
                .addGroup(stat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stat4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabel4))
                    .addGroup(stat4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblIcon4)))
                .addGap(0, 0, 0)
                .addComponent(lblPetugasAktif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel2.setText("Berkas Diproses");

        lblBerkasDiproses.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBerkasDiproses.setText("0");

        javax.swing.GroupLayout stat2Layout = new javax.swing.GroupLayout(stat2);
        stat2.setLayout(stat2Layout);
        stat2Layout.setHorizontalGroup(
            stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIcon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stat2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblBerkasDiproses))
                    .addComponent(jlabel2))
                .addContainerGap())
        );
        stat2Layout.setVerticalGroup(
            stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stat2Layout.createSequentialGroup()
                .addGroup(stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stat2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabel2))
                    .addGroup(stat2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblIcon2)))
                .addGap(0, 0, 0)
                .addComponent(lblBerkasDiproses)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/gmbar gedung.jpeg"))); // NOI18N

        javax.swing.GroupLayout fitur1Layout = new javax.swing.GroupLayout(fitur1);
        fitur1.setLayout(fitur1Layout);
        fitur1Layout.setHorizontalGroup(
            fitur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        fitur1Layout.setVerticalGroup(
            fitur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur2Layout = new javax.swing.GroupLayout(fitur2);
        fitur2.setLayout(fitur2Layout);
        fitur2Layout.setHorizontalGroup(
            fitur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        fitur2Layout.setVerticalGroup(
            fitur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur3Layout = new javax.swing.GroupLayout(fitur3);
        fitur3.setLayout(fitur3Layout);
        fitur3Layout.setHorizontalGroup(
            fitur3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        fitur3Layout.setVerticalGroup(
            fitur3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur4Layout = new javax.swing.GroupLayout(fitur4);
        fitur4.setLayout(fitur4Layout);
        fitur4Layout.setHorizontalGroup(
            fitur4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        fitur4Layout.setVerticalGroup(
            fitur4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur5Layout = new javax.swing.GroupLayout(fitur5);
        fitur5.setLayout(fitur5Layout);
        fitur5Layout.setHorizontalGroup(
            fitur5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        fitur5Layout.setVerticalGroup(
            fitur5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur7Layout = new javax.swing.GroupLayout(fitur7);
        fitur7.setLayout(fitur7Layout);
        fitur7Layout.setHorizontalGroup(
            fitur7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        fitur7Layout.setVerticalGroup(
            fitur7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fitur6Layout = new javax.swing.GroupLayout(fitur6);
        fitur6.setLayout(fitur6Layout);
        fitur6Layout.setHorizontalGroup(
            fitur6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        fitur6Layout.setVerticalGroup(
            fitur6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        javax.swing.GroupLayout grafik1Layout = new javax.swing.GroupLayout(grafik1);
        grafik1.setLayout(grafik1Layout);
        grafik1Layout.setHorizontalGroup(
            grafik1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        grafik1Layout.setVerticalGroup(
            grafik1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grafik2Layout = new javax.swing.GroupLayout(grafik2);
        grafik2.setLayout(grafik2Layout);
        grafik2Layout.setHorizontalGroup(
            grafik2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        grafik2Layout.setVerticalGroup(
            grafik2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTanggal))
                            .addComponent(panelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(panelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaAdmin)
                            .addComponent(lblStatus)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(stat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(stat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(stat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(stat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fitur4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fitur6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fitur5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fitur7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(fitur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(fitur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(fitur3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(grafik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grafik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addGap(65, 65, 65))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {stat1, stat2, stat3, stat4});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fitur1, fitur2, fitur3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblTanggal))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNamaAdmin)
                        .addGap(1, 1, 1)
                        .addComponent(lblStatus))
                    .addComponent(panelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fitur2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fitur1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(fitur3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fitur4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fitur6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fitur5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fitur7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(grafik1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grafik2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {stat1, stat2, stat3, stat4});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new halaman_utama().setVisible(true);
            }
        });
        
    }

    private void aturKartuStatistik() {
    javax.swing.JPanel[] daftarKartu = {stat1, stat2, stat3, stat4};
    javax.swing.JLabel[] daftarIkon = {lblIcon1, lblIcon2, lblIcon3, lblIcon4};
    String[] daftarJudul = {"Total Pemohon", "Berkas Diproses", "Jadwal Hari Ini", "Petugas Aktif"};
    javax.swing.JLabel[] daftarAngka = {lblTotalPemohon, lblBerkasDiproses, lblJadwalHariIni, lblPetugasAktif};

    for (int i = 0; i < daftarKartu.length; i++) {
        javax.swing.JPanel kartu = daftarKartu[i];
        javax.swing.JLabel ikon = daftarIkon[i];
        javax.swing.JLabel angka = daftarAngka[i];

        kartu.setOpaque(false);
        kartu.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 14, 10, 14));
        kartu.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                int w = c.getWidth();
                int h = c.getHeight();
                int arc = 20;

                g2.setColor(java.awt.Color.WHITE);
                g2.fillRoundRect(0, 0, w - 1, h - 1, arc, arc);

                g2.setColor(new java.awt.Color(226, 232, 240));
                g2.drawRoundRect(0, 0, w - 1, h - 1, arc, arc);
                g2.dispose();
                super.paint(g, c);
            }
        });

        kartu.removeAll();
        kartu.setLayout(new java.awt.BorderLayout(12, 0));

        ikon.setText("");
        ikon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ikon.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        ikon.setPreferredSize(new java.awt.Dimension(54, 54));
        kartu.add(ikon, java.awt.BorderLayout.WEST);

        javax.swing.JPanel panelTeks = new javax.swing.JPanel(new java.awt.GridLayout(2, 1, 0, 1));
        panelTeks.setOpaque(false);

        javax.swing.JLabel lblJudul = new javax.swing.JLabel(daftarJudul[i]);
        lblJudul.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        lblJudul.setForeground(new java.awt.Color(71, 85, 105));
        lblJudul.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        angka.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
        angka.setForeground(new java.awt.Color(15, 23, 42));
        angka.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panelTeks.add(lblJudul);
        panelTeks.add(angka);
        kartu.add(panelTeks, java.awt.BorderLayout.CENTER);
    }
    pasangIkonStatistik();
}

private void pasangIkonStatistik() {
    lblIcon1.setIcon(buatIkonKartu(1));
    lblIcon2.setIcon(buatIkonKartu(2));
    lblIcon3.setIcon(buatIkonKartu(3));
    lblIcon4.setIcon(buatIkonKartu(4));
}

    private javax.swing.ImageIcon buatIkonKartu(int jenis) {
        int s = 50;
        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(s, s, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        if (jenis == 1) {
            // Ikon Total Pemohon (ungu & oranye)
            g2.setColor(new java.awt.Color(245, 158, 11));
            g2.fillOval(27, 11, 11, 11);
            g2.fillArc(23, 24, 19, 16, 0, 180);
            g2.setColor(new java.awt.Color(147, 51, 234));
            g2.fillOval(11, 9, 14, 14);
            g2.fillArc(5, 24, 26, 19, 0, 180);
        } else if (jenis == 2) {
            // Ikon Berkas Diproses (dokumen hijau)
            g2.setColor(new java.awt.Color(34, 197, 94));
            g2.fillRoundRect(10, 7, 30, 36, 8, 8);
            g2.setColor(java.awt.Color.WHITE);
            g2.fillRect(16, 17, 18, 3);
            g2.fillRect(16, 24, 18, 3);
            g2.fillRect(16, 31, 11, 3);
        } else if (jenis == 3) {
            // Ikon Jadwal Hari Ini (kalender indigo)
            g2.setColor(new java.awt.Color(99, 102, 241));
            g2.fillRoundRect(8, 10, 34, 32, 8, 8);
            g2.setColor(java.awt.Color.WHITE);
            g2.fillRect(12, 19, 26, 19);
            g2.setColor(new java.awt.Color(99, 102, 241));
            g2.fillRect(16, 23, 4, 4);
            g2.fillRect(23, 23, 4, 4);
            g2.fillRect(30, 23, 4, 4);
            g2.fillRect(16, 30, 4, 4);
            g2.fillRect(23, 30, 4, 4);
        } else if (jenis == 4) {
            // Ikon Petugas Aktif (biru tua + centang hijau)
            g2.setColor(new java.awt.Color(30, 58, 95));
            g2.fillOval(14, 8, 15, 15);
            g2.fillArc(7, 25, 29, 18, 0, 180);
            g2.setColor(new java.awt.Color(34, 197, 94));
            g2.fillOval(28, 26, 16, 16);
            g2.setColor(java.awt.Color.WHITE);
            g2.setStroke(new java.awt.BasicStroke(2.5f));
            g2.drawLine(32, 34, 35, 37);
            g2.drawLine(35, 37, 40, 31);
        }
        g2.dispose();
        return new javax.swing.ImageIcon(img);
    }

private void tampilkanStatistikLive() {
    muatAngkaDariDatabase();
    // Perbarui otomatis setiap 5 detik agar data selalu live
    javax.swing.Timer timerStat = new javax.swing.Timer(5000, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            muatAngkaDariDatabase();
        }
    });
    timerStat.start();
}

private void muatAngkaDariDatabase() {
    java.text.DecimalFormatSymbols simbol = new java.text.DecimalFormatSymbols();
    simbol.setGroupingSeparator('.');
    java.text.DecimalFormat formatAngka = new java.text.DecimalFormat("#,###", simbol);

    try (java.sql.Connection conn = new koneksi().connect();
         java.sql.Statement st = conn.createStatement()) {

        // 1. Total Pemohon
        try (java.sql.ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM pemohon")) {
            if (rs.next()) lblTotalPemohon.setText(formatAngka.format(rs.getInt(1)));
        } catch (Exception e) { /* Sesuaikan nama tabel jika berbeda */ }

        // 2. Berkas Diproses (dari tabel permohonan)
        try (java.sql.ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM permohonan")) {
            if (rs.next()) lblBerkasDiproses.setText(formatAngka.format(rs.getInt(1)));
        } catch (Exception e) { /* Sesuaikan nama tabel jika berbeda */ }

        // 3. Jadwal Hari Ini (dari tabel jadwal)
        try (java.sql.ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM jadwal")) {
            if (rs.next()) lblJadwalHariIni.setText(formatAngka.format(rs.getInt(1)));
        } catch (Exception e) { /* Sesuaikan nama tabel jika berbeda */ }

        // 4. Petugas Aktif (sesuaikan 'tugas' dengan nama tabel petugas di database kamu)
        try (java.sql.ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM tugas")) {
            if (rs.next()) lblPetugasAktif.setText(formatAngka.format(rs.getInt(1)));
        } catch (Exception e) { /* Sesuaikan nama tabel jika berbeda */ }

    } catch (Exception e) {
        System.out.println("Error hitung tugas: " + e.getMessage());
    }
}
    
private void aturKartuFitur() {
    javax.swing.JPanel[] daftarFitur = {fitur1, fitur2, fitur3, fitur4, fitur5, fitur6, fitur7};
    String[] daftarJudul = {
        "Pengelolaan Pemohon",
        "Pengelolaan Permohonan",
        "Jadwal Pengukuran",
        "Data Petugas Ukur",
        "Penugasan Lapangan",
        "Absensi & Hasil Ukur",
        "Pengelolaan Admin"
    };
    String[] daftarDeskripsi = {
        "Kelola data pemohon dan verifikasi berkas.",
        "Pantau status permohonan pengukuran tanah.",
        "Atur jadwal survei dan pengukuran lapangan.",
        "Kelola data petugas ukur dan status aktif.",
        "Distribusi surat tugas tim pengukuran.",
        "Rekap absensi petugas dan hasil ukur.",
        "Manajemen akun dan hak akses admin."
    };

    for (int i = 0; i < daftarFitur.length; i++) {
        final javax.swing.JPanel kartu = daftarFitur[i];
        kartu.setOpaque(false);
        kartu.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        kartu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kartu.putClientProperty("hover", Boolean.FALSE);

        kartu.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
            @Override
            public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
                int w = c.getWidth();
                int h = c.getHeight();
                int arc = 20;
                boolean isHover = Boolean.TRUE.equals(c.getClientProperty("hover"));

                g2.setColor(isHover ? new java.awt.Color(248, 250, 252) : java.awt.Color.WHITE);
                g2.fillRoundRect(0, 0, w - 1, h - 1, arc, arc);

                g2.setColor(isHover ? new java.awt.Color(59, 130, 246) : new java.awt.Color(226, 232, 240));
                g2.drawRoundRect(0, 0, w - 1, h - 1, arc, arc);
                g2.dispose();
                super.paint(g, c);
            }
        });

        kartu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                kartu.putClientProperty("hover", Boolean.TRUE);
                kartu.repaint();
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                kartu.putClientProperty("hover", Boolean.FALSE);
                kartu.repaint();
            }
        });

        java.awt.Dimension ukuranDesain = kartu.getPreferredSize();
        kartu.setPreferredSize(ukuranDesain);
        kartu.setMinimumSize(ukuranDesain);

        kartu.removeAll();
        kartu.setLayout(new java.awt.BorderLayout(10, 0));

        javax.swing.JLabel lblIkon = new javax.swing.JLabel(buatIkonFitur(i + 1));
        lblIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIkon.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lblIkon.setPreferredSize(new java.awt.Dimension(46, 46));
        kartu.add(lblIkon, java.awt.BorderLayout.WEST);

        javax.swing.JPanel panelTeks = new javax.swing.JPanel(new java.awt.BorderLayout(0, 2));
        panelTeks.setOpaque(false);

        javax.swing.JLabel lblJudul = new javax.swing.JLabel(daftarJudul[i]);
        lblJudul.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
        lblJudul.setForeground(new java.awt.Color(15, 23, 42));

        javax.swing.JLabel lblDesc = new javax.swing.JLabel("<html>" + daftarDeskripsi[i] + "</html>");
        lblDesc.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        lblDesc.setForeground(new java.awt.Color(100, 116, 139));
        lblDesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panelTeks.add(lblJudul, java.awt.BorderLayout.NORTH);
        panelTeks.add(lblDesc, java.awt.BorderLayout.CENTER);
        kartu.add(panelTeks, java.awt.BorderLayout.CENTER);
    }
}

private javax.swing.ImageIcon buatIkonFitur(int jenis) {
    int s = 44;
    java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(s, s, java.awt.image.BufferedImage.TYPE_INT_ARGB);
    java.awt.Graphics2D g2 = img.createGraphics();
    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

    if (jenis == 1) {
        // Pemohon (ungu & oranye)
        g2.setColor(new java.awt.Color(245, 158, 11));
        g2.fillOval(24, 9, 10, 10);
        g2.fillArc(20, 21, 17, 14, 0, 180);
        g2.setColor(new java.awt.Color(147, 51, 234));
        g2.fillOval(9, 7, 13, 13);
        g2.fillArc(4, 21, 23, 17, 0, 180);
    } else if (jenis == 2) {
        // Permohonan (dokumen hijau)
        g2.setColor(new java.awt.Color(34, 197, 94));
        g2.fillRoundRect(8, 6, 28, 32, 7, 7);
        g2.setColor(java.awt.Color.WHITE);
        g2.fillRect(14, 14, 16, 2);
        g2.fillRect(14, 21, 16, 2);
        g2.fillRect(14, 28, 11, 2);
    } else if (jenis == 3) {
        // Jadwal (kalender indigo)
        g2.setColor(new java.awt.Color(99, 102, 241));
        g2.fillRoundRect(7, 8, 30, 28, 7, 7);
        g2.setColor(java.awt.Color.WHITE);
        g2.fillRect(11, 16, 22, 17);
        g2.setColor(new java.awt.Color(99, 102, 241));
        g2.fillRect(14, 20, 3, 3);
        g2.fillRect(20, 20, 3, 3);
        g2.fillRect(26, 20, 3, 3);
        g2.fillRect(14, 26, 3, 3);
        g2.fillRect(20, 26, 3, 3);
    } else if (jenis == 4 || jenis == 7) {
        // Petugas & Admin (biru tua + centang hijau)
        g2.setColor(new java.awt.Color(30, 58, 95));
        g2.fillOval(12, 6, 14, 14);
        g2.fillArc(6, 22, 26, 16, 0, 180);
        g2.setColor(new java.awt.Color(34, 197, 94));
        g2.fillOval(24, 23, 15, 15);
        g2.setColor(java.awt.Color.WHITE);
        g2.setStroke(new java.awt.BasicStroke(2.2f));
        g2.drawLine(28, 30, 30, 33);
        g2.drawLine(30, 33, 35, 27);
    } else if (jenis == 5) {
        // Penugasan (clipboard biru)
        g2.setColor(new java.awt.Color(71, 105, 171));
        g2.fillRoundRect(8, 8, 28, 30, 7, 7);
        g2.setColor(new java.awt.Color(148, 163, 184));
        g2.fillRoundRect(15, 4, 14, 7, 4, 4);
        g2.setColor(java.awt.Color.WHITE);
        g2.setStroke(new java.awt.BasicStroke(2.5f));
        g2.drawLine(15, 23, 19, 27);
        g2.drawLine(19, 27, 29, 18);
    } else if (jenis == 6) {
        // Absensi & Hasil Ukur (lingkaran centang emerald)
        g2.setColor(new java.awt.Color(16, 185, 129));
        g2.fillOval(7, 7, 30, 30);
        g2.setColor(java.awt.Color.WHITE);
        g2.setStroke(new java.awt.BasicStroke(2.8f));
        g2.drawLine(15, 22, 19, 26);
        g2.drawLine(19, 26, 29, 17);
    }
    g2.dispose();
    return new javax.swing.ImageIcon(img);
}

private void aturGrafikDashboard() {
    // Kunci ukuran dari tab Design biar kotaknya nggak menyusut
    javax.swing.JPanel[] daftarGrafik = {grafik1, grafik2};
    for (javax.swing.JPanel gPanel : daftarGrafik) {
        java.awt.Dimension ukuran = gPanel.getPreferredSize();
        gPanel.setPreferredSize(ukuran);
        gPanel.setMinimumSize(ukuran);
        gPanel.setOpaque(false);
        gPanel.removeAll();
    }

    // 1. Grafik Kiri: Jenis Permohonan (Donut Chart)
    grafik1.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
        @Override
        public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            int w = c.getWidth();
            int h = c.getHeight();

            // Background kartu putih melengkung
            g2.setColor(java.awt.Color.WHITE);
            g2.fillRoundRect(0, 0, w - 1, h - 1, 20, 20);
            g2.setColor(new java.awt.Color(226, 232, 240));
            g2.drawRoundRect(0, 0, w - 1, h - 1, 20, 20);

            // Judul kartu
            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            g2.setColor(new java.awt.Color(15, 23, 42));
            g2.drawString("Jenis Permohonan", 14, 24);

            // Hitung posisi & ukuran donat
            int diameter = Math.min(w - 44, h - 68);
            if (diameter < 60) diameter = 60;
            int x = (w - diameter) / 2;
            int y = 34 + ((h - 62 - diameter) / 2);

            // Warna & proporsi kategori permohonan
            java.awt.Color[] warna = {
                new java.awt.Color(30, 86, 160),   // Ukur Ulang (Biru Tua)
                new java.awt.Color(38, 147, 201),  // Pemecahan (Biru Muda)
                new java.awt.Color(200, 51, 51)    // Penggabungan (Merah)
            };
            int[] sudut = {150, 125, 85}; // Total 360 derajat
            int mulai = 90;

            for (int i = 0; i < sudut.length; i++) {
                g2.setColor(warna[i]);
                g2.fillArc(x, y, diameter, diameter, mulai, -(sudut[i] - 3));
                mulai -= sudut[i];
            }

            // Lubang tengah donat
            int lubang = (int) (diameter * 0.54);
            int xLubang = x + (diameter - lubang) / 2;
            int yLubang = y + (diameter - lubang) / 2;
            g2.setColor(java.awt.Color.WHITE);
            g2.fillOval(xLubang, yLubang, lubang, lubang);

            // Keterangan ringkas bawah
            String[] label = {"Ukur", "Pecah", "Gabung"};
            int lx = 14;
            int ly = h - 12;
            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 10));
            for (int i = 0; i < label.length; i++) {
                g2.setColor(warna[i]);
                g2.fillOval(lx, ly - 7, 7, 7);
                g2.setColor(new java.awt.Color(71, 85, 105));
                g2.drawString(label[i], lx + 10, ly);
                lx += (w - 24) / 3;
            }
            g2.dispose();
        }
    });

    // 2. Grafik Kanan: Statistik Permohonan (Bar Chart)
    grafik2.setUI(new javax.swing.plaf.basic.BasicPanelUI() {
        @Override
        public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
            g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
            int w = c.getWidth();
            int h = c.getHeight();

            // Background kartu putih melengkung
            g2.setColor(java.awt.Color.WHITE);
            g2.fillRoundRect(0, 0, w - 1, h - 1, 20, 20);
            g2.setColor(new java.awt.Color(226, 232, 240));
            g2.drawRoundRect(0, 0, w - 1, h - 1, 20, 20);

            // Judul kartu
            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            g2.setColor(new java.awt.Color(15, 23, 42));
            g2.drawString("Statistik Permohonan", 14, 24);

            int kiri = 16;
            int atas = 38;
            int lebarArea = w - 32;
            int tinggiArea = h - 62;

            // Garis bantu horizontal tipis
            g2.setColor(new java.awt.Color(226, 232, 240));
            for (int i = 0; i <= 3; i++) {
                int gy = atas + (tinggiArea * i / 3);
                g2.drawLine(kiri, gy, kiri + lebarArea, gy);
            }

            // Data batang 6 bulan terakhir (persentase tinggi)
            int[] nilai = {72, 85, 58, 38, 55, 68};
            String[] bulan = {"Jun", "Jul", "Agu", "Sep", "Okt", "Nov"};
            int jumlah = nilai.length;
            int slot = lebarArea / jumlah;
            int lebarBatang = Math.max(10, slot - 8);

            g2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 9));
            for (int i = 0; i < jumlah; i++) {
                int tinggiBatang = (tinggiArea * nilai[i]) / 100;
                int bx = kiri + (i * slot) + ((slot - lebarBatang) / 2);
                int by = atas + tinggiArea - tinggiBatang;

                // Batang terakhir diberi warna merah sebagai highlight bulan berjalan
                if (i == jumlah - 1) {
                    g2.setColor(new java.awt.Color(200, 51, 51));
                } else {
                    g2.setColor(new java.awt.Color(30, 86, 160));
                }
                g2.fillRect(bx, by, lebarBatang, tinggiBatang);

                // Label bulan di bawah batang
                g2.setColor(new java.awt.Color(100, 116, 139));
                g2.drawString(bulan[i], bx + 1, atas + tinggiArea + 13);
            }
            g2.dispose();
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fitur1;
    private javax.swing.JPanel fitur2;
    private javax.swing.JPanel fitur3;
    private javax.swing.JPanel fitur4;
    private javax.swing.JPanel fitur5;
    private javax.swing.JPanel fitur6;
    private javax.swing.JPanel fitur7;
    private javax.swing.JPanel grafik1;
    private javax.swing.JPanel grafik2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel lblBerkasDiproses;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblInisial;
    private javax.swing.JLabel lblJadwalHariIni;
    private javax.swing.JLabel lblNamaAdmin;
    private javax.swing.JLabel lblPetugasAktif;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTotalPemohon;
    private javax.swing.JPanel panelAvatar;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel stat1;
    private javax.swing.JPanel stat2;
    private javax.swing.JPanel stat3;
    private javax.swing.JPanel stat4;
    // End of variables declaration//GEN-END:variables
}
