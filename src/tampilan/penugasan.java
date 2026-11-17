/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author LightDen69
 */
public class penugasan extends javax.swing.JInternalFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;

    public String idPermohonanTerpilih, namaPemohonTerpilih, noTelpTerpilih, alamatTerpilih, jenisLayananTerpilih, kecamatanTerpilih, kelurahanTerpilih, volumeTerpilih, hakTanahTerpilih;
    public String idJadwalTerpilih, tglJadwalTerpilih;
    public String idPetugasTerpilih, namaPetugasTerpilih, NIPTerpilih, noKontakTerpilih;
   

    public void isiDataPermohonan(String id, String nama, String telp, String alamat, String jenisLayanan, String kecamatan, String kelurahan, String volume, String hakTanah) {
        this.labid.setText(id);
        this.labnama.setText(nama);
        this.labtelp.setText(telp);
        this.labalamat.setText(alamat);
        this.labjl.setText(jenisLayanan);
        this.labkec.setText(kecamatan);
        this.labkel.setText(kelurahan);
        this.labvtanah.setText(volume);
        this.labhtanah.setText(hakTanah);
    }
    
    // Method untuk jembatan data jadwal
    public void isiDataJadwal(String id, String tgl) {
        this.labidjdwl.setText(id);
        this.labtgl.setText(tgl);
    }

    // Method untuk jembatan data petugas
    public void isiDataPetugas(String id, String nama, String nip, String kontak) {
        this.labidptg.setText(id);
        this.labpetu.setText(nama);
        this.labnip.setText(nip);
        this.labkontak.setText(kontak);
    }
    /**
     * Creates new form penugasan
     */
    public penugasan() {
        initComponents();
        polesDesainPenugasan();
        
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
            
            breset.setContentAreaFilled(false);
            breset.setFocusPainted(false);
            breset.setBorderPainted(false);
            breset.setOpaque(false);
            breset.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            
            poppetugas.setContentAreaFilled(false);
            poppetugas.setFocusPainted(false);
            poppetugas.setBorderPainted(false);
            poppetugas.setOpaque(false);
            poppetugas.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            
            popjadwal.setContentAreaFilled(false);
            popjadwal.setFocusPainted(false);
            popjadwal.setBorderPainted(false);
            popjadwal.setOpaque(false);
            popjadwal.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            
            poppemohon.setContentAreaFilled(false);
            poppemohon.setFocusPainted(false);
            poppemohon.setBorderPainted(false);
            poppemohon.setOpaque(false);
            poppemohon.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
        idpenugasan.requestFocus();
    }
 protected void kosong(){
        idpenugasan.setText("");
        labid.setText("");
        labidptg.setText("");
        labnama.setText("");
        labtelp.setText("");
        labalamat.setText("");
        labjl.setText("");
        labkec.setText("");
        labkel.setText("");
        labvtanah.setText("");
        labhtanah.setText("");
        labidjdwl.setText("");
        labtgl.setText("");
        labidptg.setText("");
        labpetu.setText("");
        labnip.setText("");
        labkontak.setText("");
        txtcari.setText("");
    }
 protected void datatable() {
    Object[] Baris = {
        "ID Penugasan", "ID Permohonan", "Nama Pemohon", "No Telpon", "Alamat","Jenis Layanan",  
        "Kecamatan", "Kelurahan", "Volume Tanah", "Hak Tanah", "ID Jadwal", "Tanggal", 
        "ID Petugas", "Nama Petugas", "NIP", "No. Kontak"
    };
    
    DefaultTableModel tabmode = new DefaultTableModel(null, Baris);
    String cariitem = txtcari.getText(); 
    
    try {
        String sql = "SELECT * FROM penugasan WHERE idpngsn LIKE '%" + cariitem + "%' OR nmpmhn LIKE '%" + cariitem + "%'";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        
        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString("idpngsn"),     // Kolom 1
                hasil.getString("idprmhnn"),        // Kolom 2
                hasil.getString("nmpmhn"),    // Kolom 3
                hasil.getString("notelp"),      // Kolom 4
                hasil.getString("alm"),
                hasil.getString("jns"),      // Kolom 5
                hasil.getString("kec"),
                hasil.getString("kel"),
                hasil.getString("vlm"),      // Kolom 6      
                hasil.getString("haktanah"),         // Kolom 8
                hasil.getString("idjdwl"),         // Kolom 9
                hasil.getString("tggl"),         // Kolom 10
                hasil.getString("idptgs"),    // Kolom 11
                hasil.getString("nmptgs"),      // Kolom 12
                hasil.getString("nip"),         // Kolom 13
                hasil.getString("notlp")        // Kolom 14
            });
        }
        tblpenugasan.setModel(tabmode); // Pastikan nama JTable Anda benar
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal dipanggil: " + e);
    }
}
 
 public void cetak() {
        try{
            String path="./src/report/reportPenugasan.jasper";
            HashMap parameter = new HashMap();
            parameter.put("idpngsn", idpenugasan.getText());
            JasperPrint print = JasperFillManager.fillReport(path, parameter,conn);
            JasperViewer.viewReport(print, false);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen tidak ada" +ex);
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

        bcari1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelCardKiri = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        labalamat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        poppemohon = new javax.swing.JButton();
        labid = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labnama = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labtgl = new javax.swing.JLabel();
        idpenugasan = new javax.swing.JTextField();
        labjl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labhtanah = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labtelp = new javax.swing.JLabel();
        popjadwal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labidjdwl = new javax.swing.JLabel();
        labvtanah = new javax.swing.JLabel();
        labkec = new javax.swing.JLabel();
        labkel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        panelCardKanan = new javax.swing.JPanel();
        bcari = new javax.swing.JButton();
        bcetak = new javax.swing.JButton();
        poppetugas = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        labnip = new javax.swing.JLabel();
        labidptg = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpenugasan = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        labpetu = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labkontak = new javax.swing.JLabel();

        bcari1.setText("Cari");
        bcari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcari1ActionPerformed(evt);
            }
        });
        bcari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bcari1KeyPressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("PENUGASAN");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("ID Permohonan    :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Volume Tanah      :");

        jPanel18.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        labalamat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labalamat.setText("jLabel12");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("No. Telepon          :");

        poppemohon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        poppemohon.setForeground(new java.awt.Color(255, 255, 255));
        poppemohon.setText("Cari");
        poppemohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poppemohonActionPerformed(evt);
            }
        });
        poppemohon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poppemohonKeyPressed(evt);
            }
        });

        labid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labid.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Jenis Layanan      :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Kelurahan            :");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Hak Tanah           :");

        labnama.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnama.setText("jLabel12");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel12.setText("PERMOHONAN");

        labtgl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtgl.setText("jLabel28");

        idpenugasan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        idpenugasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenugasanActionPerformed(evt);
            }
        });

        labjl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labjl.setText("jLabel12");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("ID Penugasan        :");

        labhtanah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labhtanah.setText("jLabel19");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Nama Pemohon    :");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel28.setText("JADWAL");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Kecamatan           :");

        labtelp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtelp.setText("jLabel11");

        popjadwal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        popjadwal.setForeground(new java.awt.Color(255, 255, 255));
        popjadwal.setText("Cari");
        popjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popjadwalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Alamat                  :");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Tgl Jadwal");

        labidjdwl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labidjdwl.setText("jLabel9");

        labvtanah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labvtanah.setText("jLabel15");

        labkec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkec.setText("jLabel14");

        labkel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkel.setText("jLabel29");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setText("ID Jadwal");

        javax.swing.GroupLayout panelCardKiriLayout = new javax.swing.GroupLayout(panelCardKiri);
        panelCardKiri.setLayout(panelCardKiriLayout);
        panelCardKiriLayout.setHorizontalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labidjdwl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labtgl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(popjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                                        .addComponent(labid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(poppemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labalamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labjl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labtelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labnama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labkec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labkel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idpenugasan)))
                        .addContainerGap())
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel10)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labvtanah, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labhtanah, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(368, 383, Short.MAX_VALUE))))
        );
        panelCardKiriLayout.setVerticalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpenugasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labid))
                        .addGap(18, 18, 18)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(labnama))
                        .addGap(18, 18, 18)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(labtelp))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addComponent(poppemohon)
                        .addGap(94, 94, 94)
                        .addComponent(labalamat)))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labjl))
                .addGap(25, 25, 25)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labkec))
                .addGap(25, 25, 25)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labkel))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labvtanah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(labhtanah))
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labidjdwl)
                        .addComponent(popjadwal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(labtgl))
                .addContainerGap())
        );

        bcari.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcari.setForeground(new java.awt.Color(255, 255, 255));
        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });
        bcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bcariKeyPressed(evt);
            }
        });

        bcetak.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        poppetugas.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        poppetugas.setForeground(new java.awt.Color(255, 255, 255));
        poppetugas.setText("Cari");
        poppetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poppetugasActionPerformed(evt);
            }
        });
        poppetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poppetugasKeyPressed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        labnip.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnip.setText("jLabel24");

        labidptg.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labidptg.setText("jLabel12");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Nama Petugas     :");

        jPanel21.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        tblpenugasan.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpenugasan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpenugasanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpenugasan);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Cari Penugasan :");

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bubah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setText("PETUGAS");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("ID Petugas           :");

        breset.setBackground(new java.awt.Color(255, 255, 255));
        breset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        breset.setForeground(new java.awt.Color(255, 255, 255));
        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        labpetu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labpetu.setText("jLabel23");

        txtcari.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("No Kontak           :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("NIP                       :");

        labkontak.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkontak.setText("jLabel25");

        javax.swing.GroupLayout panelCardKananLayout = new javax.swing.GroupLayout(panelCardKanan);
        panelCardKanan.setLayout(panelCardKananLayout);
        panelCardKananLayout.setHorizontalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelCardKananLayout.createSequentialGroup()
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addGroup(panelCardKananLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(26, 26, 26)
                            .addComponent(labidptg)
                            .addGap(39, 39, 39)
                            .addComponent(poppetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCardKananLayout.createSequentialGroup()
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCardKananLayout.createSequentialGroup()
                            .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel20))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labkontak)
                                .addComponent(labnip)
                                .addComponent(labpetu))))
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelCardKananLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bcetak, bhapus, breset, bsimpan, bubah});

        panelCardKananLayout.setVerticalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labidptg)
                    .addComponent(jLabel13)
                    .addComponent(poppetugas))
                .addGap(28, 28, 28)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(labpetu))
                .addGap(18, 18, 18)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(labnip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(labkontak))
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset)
                    .addComponent(bhapus)
                    .addComponent(bcetak)
                    .addComponent(bsimpan)
                    .addComponent(bubah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCardKananLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bcetak, bhapus, breset, bsimpan, bubah});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel19)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelCardKanan, panelCardKiri});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelCardKanan, panelCardKiri});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void bcari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcari1ActionPerformed
        datatable(); 
    }//GEN-LAST:event_bcari1ActionPerformed

    private void bcari1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcari1KeyPressed
        
    }//GEN-LAST:event_bcari1KeyPressed

    private void poppetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poppetugasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_poppetugasKeyPressed

    private void poppetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poppetugasActionPerformed
        popup_tugas popup = new popup_tugas(null, true);
        popup.formPenugasan = this;
        popup.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_poppetugasActionPerformed

    private void poppemohonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poppemohonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_poppemohonKeyPressed

    private void poppemohonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poppemohonActionPerformed
        popup_permohonan popup = new popup_permohonan(null, true);
        popup.formPenugasan = this;
        popup.setVisible(true);

    }//GEN-LAST:event_poppemohonActionPerformed

    private void popjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popjadwalActionPerformed
        popup_jadwal popup = new popup_jadwal(null, true);
        popup.formPenugasan = this;
        popup.setVisible(true);
    }//GEN-LAST:event_popjadwalActionPerformed

    private void tblpenugasanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpenugasanMouseClicked
        int bar = tblpenugasan.getSelectedRow();
        javax.swing.table.TableModel model = tblpenugasan.getModel();

        idpenugasan.setText(model.getValueAt(bar, 0).toString());
        labid.setText(model.getValueAt(bar, 1).toString());
        labnama.setText(model.getValueAt(bar, 2).toString());
        labtelp.setText(model.getValueAt(bar, 3).toString());
        labalamat.setText(model.getValueAt(bar, 4).toString());
        labjl.setText(model.getValueAt(bar, 5).toString());
        labkec.setText(model.getValueAt(bar, 6).toString());
        labkel.setText(model.getValueAt(bar, 7).toString());
        labvtanah.setText(model.getValueAt(bar, 8).toString());
        labhtanah.setText(model.getValueAt(bar, 9).toString());
        labidjdwl.setText(model.getValueAt(bar, 10).toString());
        labtgl.setText(model.getValueAt(bar, 11).toString());
        labidptg.setText(model.getValueAt(bar, 12).toString());
        labpetu.setText(model.getValueAt(bar, 13).toString());
        labnip.setText(model.getValueAt(bar, 14).toString());
        labkontak.setText(model.getValueAt(bar, 15).toString());
    }//GEN-LAST:event_tblpenugasanMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void bcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcariKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariKeyPressed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "delete from penugasan where idpngsn ='" + idpenugasan.getText() + "'";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                aktif();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus " + e);
            }
            datatable();
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        try {
            String sql = "update penugasan set idprmhnn=?, nmpmhn=?, notelp=?, alm=?, jns=?, kec=?, kel=?, vlm=?, haktanah=?, idjdwl=?, tggl=?, idptgs=?, nmptgs=?, nip=?, notlp=? WHERE idpngsn=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            stat.setString(1, labid.getText());
            stat.setString(2, labnama.getText());
            stat.setString(3, labtelp.getText());
            stat.setString(4, labalamat.getText());
            stat.setString(5, labjl.getText());
            stat.setString(6, labkec.getText());
            stat.setString(7, labkel.getText());
            stat.setString(8, labvtanah.getText());
            stat.setString(9, labhtanah.getText());
            stat.setString(10,labidjdwl.getText());
            stat.setString(11,labtgl.getText());
            stat.setString(12,labidptg.getText());
            stat.setString(13,labpetu.getText());
            stat.setString(14,labnip.getText());
            stat.setString(15,labkontak.getText());
            stat.setString(16, idpenugasan.getText());

            int result = stat.executeUpdate();

            if(result > 0){
                JOptionPane.showMessageDialog(null, "data berhasil diubah");
            } else {
                JOptionPane.showMessageDialog(null, "data tidak ditemukan");
            }

            kosong();
            aktif();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal diubah " + e);
        }
        datatable();
    }//GEN-LAST:event_bubahActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String sql = "INSERT INTO penugasan (idpngsn, idprmhnn, nmpmhn, notelp, alm, jns, kec, kel, vlm, haktanah, idjdwl, tggl, idptgs, nmptgs, nip, notlp)"
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);

            // PETAKKAN KOMPONEN UI SESUAI KOLOM SQL DI ATAS
            stat.setString(1, idpenugasan.getText());  // idpngsn
            stat.setString(2, labid.getText());       // tggl
            stat.setString(3, labnama.getText());        // idprmhnn
            stat.setString(4, labtelp.getText());    // idjdwl
            stat.setString(5, labalamat.getText());     // idptgs
            stat.setString(6, labjl.getText());
            stat.setString(7, labkec.getText());      
            stat.setString(8, labkel.getText());      // nmpmhn
            stat.setString(9, labvtanah.getText());      // nmpmhn
            stat.setString(10, labhtanah.getText());    // alm
            stat.setString(11, labidjdwl.getText());    // lks
            stat.setString(12, labtgl.getText());   // vlm
            stat.setString(13, labidptg.getText());   // haktanah
            stat.setString(14, labpetu.getText());     // nmptgs
            stat.setString(15, labnip.getText());      // nip
            stat.setString(16, labkontak.getText());   // notlp

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");

            kosong();
            aktif();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan " + e);
        }
        datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bresetActionPerformed

    private void idpenugasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenugasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenugasanActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
        cetak();
    }//GEN-LAST:event_bcetakActionPerformed

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
            java.util.logging.Logger.getLogger(penugasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penugasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penugasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penugasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penugasan().setVisible(true);
            }
        });
    }
    
    private void polesDesainPenugasan() {
    // 1. Otomatis cari & ubah semua panel pembungkus (Kiri & Kanan) ke tema Warm Sand
    java.util.List<javax.swing.JPanel> semuaPanel = new java.util.ArrayList<>();
    for (java.awt.Component comp : getContentPane().getComponents()) {
        if (comp instanceof javax.swing.JPanel) {
            semuaPanel.add((javax.swing.JPanel) comp);
            for (java.awt.Component sub : ((javax.swing.JPanel) comp).getComponents()) {
                if (sub instanceof javax.swing.JPanel) {
                    semuaPanel.add((javax.swing.JPanel) sub);
                }
            }
        }
    }

    for (javax.swing.JPanel p : semuaPanel) {
        if (p.getComponentCount() >= 2) {
            p.setOpaque(false);
            p.setBorder(null);
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
    }

    // 2. Poles Semua Tombol (Sesuaikan nama & jumlah variabel tombol di baris bawah ini)
    // Urutan warna: Simpan (Navy), Ubah (Biru), Hapus (Merah), Batal (Abu), Cetak (Teal), Cari (Navy)
    javax.swing.JButton[] daftarTombol = {bsimpan, bubah, bhapus, breset, bcetak, bcari1, poppemohon, poppetugas};
    java.awt.Color[] warnaTombol = {
        new java.awt.Color(30, 58, 95),    // Simpan: Navy Gelap
        new java.awt.Color(59, 130, 246),  // Ubah: Biru Cerah
        new java.awt.Color(220, 38, 38),   // Hapus: Merah Lembut
        new java.awt.Color(100, 116, 139), // Batal: Abu-abu Slate
        new java.awt.Color(13, 148, 136),  // Cetak: Teal Modern
        new java.awt.Color(30, 58, 95),    // Cari 1: Navy Gelap
        new java.awt.Color(30, 58, 95),    // Cari 2: Navy Gelap
        new java.awt.Color(30, 58, 95)     // Cari 3: Navy Gelap
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

        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(16, 16, 2);
        java.awt.Graphics2D gIkon = img.createGraphics();
        gIkon.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        gIkon.setColor(java.awt.Color.WHITE);
        gIkon.setStroke(new java.awt.BasicStroke(1.6f));
        if (jenisIkon == 0) { // Simpan
            gIkon.drawRoundRect(2, 2, 11, 11, 2, 2);
            gIkon.fillRect(5, 2, 5, 4);
            gIkon.fillRect(4, 8, 7, 5);
        } else if (jenisIkon == 1) { // Ubah
            gIkon.drawLine(3, 13, 11, 5);
            gIkon.drawLine(11, 5, 13, 7);
            gIkon.drawLine(13, 7, 5, 15);
            gIkon.drawLine(3, 13, 5, 15);
        } else if (jenisIkon == 2) { // Hapus
            gIkon.drawLine(3, 4, 13, 4);
            gIkon.drawRect(4, 4, 8, 9);
            gIkon.drawLine(7, 7, 7, 11);
            gIkon.drawLine(9, 7, 9, 11);
        } else if (jenisIkon == 3) { // Batal
            gIkon.drawLine(4, 4, 12, 12);
            gIkon.drawLine(12, 4, 4, 12);
        } else if (jenisIkon == 4) { // Cetak
            gIkon.drawRect(4, 2, 8, 3);
            gIkon.drawRoundRect(2, 5, 12, 6, 2, 2);
            gIkon.fillRect(4, 9, 8, 5);
        } else { // Cari
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

    // 3. Otomatis poles semua JTextField, JComboBox, & Area Kosong Tabel (JScrollPane)
    java.util.Queue<java.awt.Container> antrean = new java.util.LinkedList<>();
    antrean.add(getContentPane());
    while (!antrean.isEmpty()) {
        java.awt.Container parent = antrean.poll();
        for (java.awt.Component comp : parent.getComponents()) {
            if (comp instanceof java.awt.Container) {
                antrean.add((java.awt.Container) comp);
            }
            if (comp instanceof javax.swing.JTextField) {
                final javax.swing.JTextField field = (javax.swing.JTextField) comp;
                field.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
                field.setForeground(new java.awt.Color(15, 23, 42));
                field.setOpaque(false);
                field.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 12, 5, 12));
                field.setUI(new javax.swing.plaf.basic.BasicTextFieldUI() {
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
            } else if (comp instanceof javax.swing.JComboBox) {
                javax.swing.JComboBox<?> cb = (javax.swing.JComboBox<?>) comp;
                cb.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
                cb.setBackground(new java.awt.Color(248, 250, 252));
                cb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225), 1, true));
            } else if (comp instanceof javax.swing.JScrollPane) {
                javax.swing.JScrollPane sp = (javax.swing.JScrollPane) comp;
                sp.getViewport().setBackground(new java.awt.Color(253, 250, 243));
                sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 218, 200), 1));
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bcari1;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField idpenugasan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labalamat;
    public javax.swing.JLabel labhtanah;
    public javax.swing.JLabel labid;
    public javax.swing.JLabel labidjdwl;
    public javax.swing.JLabel labidptg;
    public javax.swing.JLabel labjl;
    public javax.swing.JLabel labkec;
    public javax.swing.JLabel labkel;
    public javax.swing.JLabel labkontak;
    public javax.swing.JLabel labnama;
    public javax.swing.JLabel labnip;
    public javax.swing.JLabel labpetu;
    public javax.swing.JLabel labtelp;
    public javax.swing.JLabel labtgl;
    public javax.swing.JLabel labvtanah;
    private javax.swing.JPanel panelCardKanan;
    private javax.swing.JPanel panelCardKiri;
    private javax.swing.JButton popjadwal;
    private javax.swing.JButton poppemohon;
    private javax.swing.JButton poppetugas;
    private javax.swing.JTable tblpenugasan;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
