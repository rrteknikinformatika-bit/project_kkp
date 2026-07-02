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

    public String idPermohonanTerpilih, namaPemohonTerpilih, noTelpTerpilih, alamatTerpilih, jenisLayananTerpilih, volumeTerpilih, lokasiTerpilih, hakTanahTerpilih;
    public String idJadwalTerpilih, tglJadwalTerpilih;
    public String idPetugasTerpilih, namaPetugasTerpilih, NIPTerpilih, noKontakTerpilih;
   

    public void isiDataPermohonan(String id, String nama, String telp, String alamat, String jenisLayanan, String volume, String lokasi, String hakTanah) {
        this.labid.setText(id);
        this.labnama.setText(nama);
        this.labtelp.setText(telp);
        this.labalamat.setText(alamat);
        this.labjl.setText(jenisLayanan);
        this.labvtanah.setText(volume);
        this.lablokasi.setText(lokasi);
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
        labvtanah.setText("");
        lablokasi.setText("");
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
        "Volume Tanah", "Lokasi Tanah", "Hak Tanah", "ID Jadwal", "Tanggal", 
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
                hasil.getString("lks"),      // Kolom 6
                hasil.getString("vlm"),      // Kolom 7
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
        jLabel1 = new javax.swing.JLabel();
        labjl = new javax.swing.JLabel();
        lablokasi = new javax.swing.JLabel();
        labvtanah = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        idpenugasan = new javax.swing.JTextField();
        labhtanah = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        bubah = new javax.swing.JButton();
        labpetu = new javax.swing.JLabel();
        bhapus = new javax.swing.JButton();
        labnip = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labkontak = new javax.swing.JLabel();
        bcari = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpenugasan = new javax.swing.JTable();
        labtgl = new javax.swing.JLabel();
        popjadwal = new javax.swing.JButton();
        poppemohon = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        poppetugas = new javax.swing.JButton();
        labnama = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labidjdwl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labidptg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labtelp = new javax.swing.JLabel();
        labalamat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bcetak = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(252, 249, 235));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("PENUGASAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 13, -1, -1));

        labjl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labjl.setText("jLabel12");
        jPanel1.add(labjl, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 434, -1, -1));

        lablokasi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lablokasi.setText("jLabel14");
        jPanel1.add(lablokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 565, -1, -1));

        labvtanah.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labvtanah.setText("jLabel15");
        jPanel1.add(labvtanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PETUGAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jLabel18.setText("Hak Tanah");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 651, -1, -1));

        idpenugasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenugasanActionPerformed(evt);
            }
        });
        jPanel1.add(idpenugasan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 230, -1));

        labhtanah.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labhtanah.setText("jLabel19");
        jPanel1.add(labhtanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 648, -1, -1));

        jLabel20.setText("Nama Petugas");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        breset.setBackground(new java.awt.Color(255, 255, 255));
        breset.setForeground(new java.awt.Color(255, 255, 255));
        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        jPanel1.add(breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 779, 110, -1));

        jLabel21.setText("NIP");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 80, -1));

        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 724, 110, -1));

        jLabel22.setText("No Kontak");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, -1));

        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });
        jPanel1.add(bubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 724, 110, -1));

        labpetu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labpetu.setText("jLabel23");
        jPanel1.add(labpetu, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel1.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 779, 110, -1));

        labnip.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labnip.setText("jLabel24");
        jPanel1.add(labnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cari Penugasan :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 488, -1, -1));

        labkontak.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labkontak.setText("jLabel25");
        jPanel1.add(labkontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, -1, -1));

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
        jPanel1.add(bcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 528, 202, -1));

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 529, 437, -1));

        jLabel26.setText("ID Jadwal");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        jLabel27.setText("Tgl Jadwal");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        tblpenugasan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 1030, 257));

        labtgl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labtgl.setText("jLabel28");
        jPanel1.add(labtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, -1, -1));

        popjadwal.setForeground(new java.awt.Color(255, 255, 255));
        popjadwal.setText("Cari");
        popjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popjadwalActionPerformed(evt);
            }
        });
        jPanel1.add(popjadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 137, 90, -1));

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
        jPanel1.add(poppemohon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 90, -1));

        jLabel11.setText("Nama Pemohon");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 223, -1, -1));

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
        jPanel1.add(poppetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 247, 90, -1));

        labnama.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labnama.setText("jLabel12");
        jPanel1.add(labnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 220, -1, -1));

        jLabel7.setText("No. Telepon");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 283, 113, -1));

        labidjdwl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labidjdwl.setText("jLabel9");
        jPanel1.add(labidjdwl, new org.netbeans.lib.awtextra.AbsoluteConstraints(967, 141, -1, -1));

        jLabel8.setText("Alamat");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 377, -1, -1));

        labidptg.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labidptg.setText("jLabel12");
        jPanel1.add(labidptg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, -1, -1));

        jLabel10.setText("Lokasi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 568, -1, -1));

        labid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labid.setText("jLabel9");
        jPanel1.add(labid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel3.setText("Volume Tanah");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 493, -1, -1));

        jLabel9.setText("Jenis Layanan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 439, -1, -1));

        labtelp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labtelp.setText("jLabel11");
        jPanel1.add(labtelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 280, -1, -1));

        labalamat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        labalamat.setText("jLabel12");
        jPanel1.add(labalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 374, -1, -1));

        jLabel2.setText("ID Penugasan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("ID Permohonan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });
        jPanel1.add(bcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 730, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("PERMOHONAN");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("JADWAL");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        jLabel13.setText("ID Petugas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        labvtanah.setText(model.getValueAt(bar, 6).toString());
        lablokasi.setText(model.getValueAt(bar, 7).toString());
        labhtanah.setText(model.getValueAt(bar, 8).toString());
        labidjdwl.setText(model.getValueAt(bar, 9).toString());
        labtgl.setText(model.getValueAt(bar, 10).toString());
        labidptg.setText(model.getValueAt(bar, 11).toString());
        labpetu.setText(model.getValueAt(bar, 12).toString());
        labnip.setText(model.getValueAt(bar, 13).toString());
        labkontak.setText(model.getValueAt(bar, 14).toString());
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
            String sql = "update penugasan set idpngsn=?, idprmhnn=?, nmpmhn=?, notelp=?, alm=?, jns=?, vlm=?, lks=?, haktanah=?, idjdwl=?, tggl=?, idptgs=?, nmptgs=?, nip=?, notlp=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            stat.setString(1, idpenugasan.getText());
            stat.setString(2, labid.getText());
            stat.setString(3, labnama.getText());
            stat.setString(4, labtelp.getText());
            stat.setString(5, labalamat.getText());
            stat.setString(6, labjl.getText());
            stat.setString(7, labvtanah.getText());
            stat.setString(8, lablokasi.getText());
            stat.setString(9, labhtanah.getText());
            stat.setString(10,labidjdwl.getText());
            stat.setString(11,labtgl.getText());
            stat.setString(12,labidptg.getText());
            stat.setString(13,labpetu.getText());
            stat.setString(14,labnip.getText());
            stat.setString(15,labkontak.getText());

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
        String sql = "INSERT INTO penugasan (idpngsn, idprmhnn, nmpmhn, notelp, alm, jns, vlm, lks, haktanah, idjdwl, tggl, idptgs, nmptgs, nip, notlp)"
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);

            // PETAKKAN KOMPONEN UI SESUAI KOLOM SQL DI ATAS
            stat.setString(1, idpenugasan.getText());  // idpngsn
            stat.setString(2, labid.getText());       // tggl
            stat.setString(3, labnama.getText());        // idprmhnn
            stat.setString(4, labtelp.getText());    // idjdwl
            stat.setString(5, labalamat.getText());     // idptgs
            stat.setString(6, labjl.getText());
            stat.setString(7, labvtanah.getText());      // nmpmhn
            stat.setString(8, lablokasi.getText());      // notelp
            stat.setString(9, labhtanah.getText());    // alm
            stat.setString(10, labidjdwl.getText());    // lks
            stat.setString(11, labtgl.getText());   // vlm
            stat.setString(12, labidptg.getText());   // haktanah
            stat.setString(13, labpetu.getText());     // nmptgs
            stat.setString(14, labnip.getText());      // nip
            stat.setString(15, labkontak.getText());   // notlp

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bcari1;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField idpenugasan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labalamat;
    public javax.swing.JLabel labhtanah;
    public javax.swing.JLabel labid;
    public javax.swing.JLabel labidjdwl;
    public javax.swing.JLabel labidptg;
    public javax.swing.JLabel labjl;
    public javax.swing.JLabel labkontak;
    public javax.swing.JLabel lablokasi;
    public javax.swing.JLabel labnama;
    public javax.swing.JLabel labnip;
    public javax.swing.JLabel labpetu;
    public javax.swing.JLabel labtelp;
    public javax.swing.JLabel labtgl;
    public javax.swing.JLabel labvtanah;
    private javax.swing.JButton popjadwal;
    private javax.swing.JButton poppemohon;
    private javax.swing.JButton poppetugas;
    private javax.swing.JTable tblpenugasan;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
