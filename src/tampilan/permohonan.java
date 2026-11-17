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
 * @author ADVAN
 */
public class permohonan extends javax.swing.JInternalFrame {
 private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public String idPemohonTerpilih;
    public String namaPemohonTerpilih;
    public String alamatPemohonTerpilih;
    public String telpPemohonTerpilih;
    public String idTanahTerpilih, kecamatanTerpilih, kelurahanTerpilih, volumeTerpilih, hakTerpilih;
    /**
     * Creates new form tugas
     */
    public void setPemohonKeForm(){
        labid.setText(idPemohonTerpilih);
        labnm.setText(namaPemohonTerpilih);
        labalm.setText(alamatPemohonTerpilih);
        labtelp.setText(telpPemohonTerpilih);
    }
    
    public void setTanahKeForm(){
    labidtnh.setText(idTanahTerpilih);
    labkec.setText(kecamatanTerpilih);
    labkel.setText(kelurahanTerpilih);
    labvlm.setText(volumeTerpilih);
    labhak.setText(hakTerpilih);
}
    public permohonan() {
        initComponents();
        polesDesainPermohonan();
        
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
            
            bcariid.setContentAreaFilled(false);
            bcariid.setFocusPainted(false);
            bcariid.setBorderPainted(false);
            bcariid.setOpaque(false);
            bcariid.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            
        boxjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        "Jenis Layanan",
        "Pengukuran dan Pemetaan kadastral",
        "penggabungan Bidang",
        "Pemisahan Bidang",
        "Penataan Batas"
    }));
        kosong();
        aktif();
        datatable();
    }
    public void cetak() {
        try{
            String path="./src/report/reportPermohonan.jasper";
            HashMap parameter = new HashMap();
            parameter.put("idprmhnn", txtidpermohonan.getText());
            String mohon = txtidpermohonan.getText();
            System.out.println("id permohonan"+ mohon);
            JasperPrint print = JasperFillManager.fillReport(path, parameter,conn);
            JasperViewer.viewReport(print, false);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Dokumen tidak ada" +ex);
        }
    }
        protected void aktif(){
        txtidpermohonan.requestFocus();
    }
        
    protected void kosong(){
        txtidpermohonan.setText("");
        tgl.setDate(null);
        boxjenis.setSelectedIndex(0);
        labid.setText("");
        labnm.setText("");
        labalm.setText("");
        labtelp.setText("");
        labidtnh.setText("");
        labkec.setText("");
        labkel.setText("");
        labvlm.setText("");
        labhak.setText("");
    }

    protected void datatable(){
    Object[] Baris = {"ID Permohonan", "Tgl Permohonan", "Jenis Layanan", "ID Pemohon","Nama Pemohon", "Alamat", "No. Telepon", "ID Tanah", "Kecamatan", "Kelurahan", "Volome", "Hak"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem = jTextField5.getText();
     try {
        String sql = "SELECT * FROM permohonan where idprmhnn like '%" + cariitem +
                "%' or idpmhn like '%" + cariitem + "%' order by idprmhnn asc";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5),
                hasil.getString(6),
                hasil.getString(7),
                hasil.getString(8),
                hasil.getString(9),
                hasil.getString(10),
                hasil.getString(11),
                hasil.getString(12)
            });
        }
        tblpermohonan.setModel(tabmode);
     }catch (Exception e){
         JOptionPane.showMessageDialog(null,"data gagal di panggil" +e);
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelCardKiri = new javax.swing.JPanel();
        bhapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labtelp = new javax.swing.JLabel();
        boxjenis = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tgl = new com.toedter.calendar.JDateChooser();
        bcetak = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labnm = new javax.swing.JLabel();
        labalm = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bcariid = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        txtidpermohonan = new javax.swing.JTextField();
        labid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelCardKanan = new javax.swing.JPanel();
        labhak = new javax.swing.JLabel();
        labvlm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpermohonan = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labidtnh = new javax.swing.JLabel();
        labkel = new javax.swing.JLabel();
        bcari = new javax.swing.JButton();
        labkec = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bcariidtn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("PERMOHONAN");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Jenis Layanan");

        labtelp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtelp.setText("jLabel17");

        boxjenis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        boxjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Layanan" }));
        boxjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxjenisActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Alamat");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("No. Telp");

        bcetak.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcetak.setForeground(new java.awt.Color(255, 255, 255));
        bcetak.setText("Cetak");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Nama Pemohon");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("ID Pemohon");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("ID Permohonan");

        labnm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnm.setText("jLabel6");

        labalm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labalm.setText("jLabel16");

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

        breset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        breset.setForeground(new java.awt.Color(255, 255, 255));
        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Tgl Permohonan");

        bcariid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcariid.setForeground(new java.awt.Color(255, 255, 255));
        bcariid.setText("Cari");
        bcariid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariidActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        txtidpermohonan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtidpermohonan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpermohonanActionPerformed(evt);
            }
        });

        labid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labid.setText("jLabel2");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText(":");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText(":");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText(":");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText(":");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText(":");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText(":");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText(":");

        javax.swing.GroupLayout panelCardKiriLayout = new javax.swing.GroupLayout(panelCardKiri);
        panelCardKiri.setLayout(panelCardKiriLayout);
        panelCardKiriLayout.setHorizontalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(47, 47, 47)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(31, 31, 31)
                                .addComponent(labid))
                            .addComponent(jLabel16)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bcariid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtidpermohonan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxjenis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCardKiriLayout.createSequentialGroup()
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labnm, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labtelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labalm, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelCardKiriLayout.setVerticalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(txtidpermohonan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9))
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labid)
                    .addComponent(bcariid)
                    .addComponent(jLabel20))
                .addGap(22, 22, 22)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labnm)
                    .addComponent(jLabel21))
                .addGap(27, 27, 27)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labalm)
                    .addComponent(jLabel22))
                .addGap(27, 27, 27)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(labtelp)
                    .addComponent(jLabel23))
                .addGap(29, 29, 29)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labhak.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labhak.setText("jLabel22");

        labvlm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labvlm.setText("jLabel21");

        tblpermohonan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpermohonan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpermohonanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpermohonan);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Kecamatan");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("ID Tanah");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Hak");

        labidtnh.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labidtnh.setText("jLabel18");

        labkel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkel.setText("jLabel20");

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

        labkec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkec.setText("jLabel19");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Volume");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Kelurahan");

        bcariidtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcariidtn.setText("Cari");
        bcariidtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariidtnActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText(":");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText(":");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setText(":");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText(":");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setText(":");

        javax.swing.GroupLayout panelCardKananLayout = new javax.swing.GroupLayout(panelCardKanan);
        panelCardKanan.setLayout(panelCardKananLayout);
        panelCardKananLayout.setHorizontalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(41, 41, 41)
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(54, 54, 54)
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labhak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labvlm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labkec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labidtnh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labkel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bcariidtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCardKananLayout.setVerticalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(bcariidtn))
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labidtnh)
                            .addComponent(jLabel24))
                        .addGap(9, 9, 9)
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCardKananLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labkec))
                            .addGroup(panelCardKananLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel13))))
                        .addGap(18, 18, 18)
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labkel)
                            .addComponent(jLabel26)
                            .addComponent(jLabel17))
                        .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCardKananLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(labvlm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labhak)
                                    .addComponent(jLabel28)))
                            .addGroup(panelCardKananLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)))))
                .addGap(21, 21, 21)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelCardKanan, panelCardKiri});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelCardKanan, panelCardKiri});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidpermohonanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpermohonanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpermohonanActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
    String sql = "insert into permohonan (idprmhnn, tggl, jns, idpmhn, nmpmhn, alm, notelp, idtnh, kec, kel, vlm, haktanah) values (?,?,?,?,?,?,?,?,?,?,?,?)";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtidpermohonan.getText());
        stat.setString(2, sdf.format(tgl.getDate()));
        stat.setString(3, boxjenis.getSelectedItem().toString());
        stat.setString(4, labid.getText());     // ID Pemohon
        stat.setString(5, labnm.getText());
        stat.setString(6, labalm.getText());
        stat.setString(7, labtelp.getText());
        stat.setString(8, labidtnh.getText());
        stat.setString(9, labkec.getText());
        stat.setString(10, labkel.getText());     // MENGAMBIL NAMA PEMOHON DARI LABNM
        stat.setString(11, labvlm.getText());
        stat.setString(12, labhak.getText());// ID Tanah
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        kosong();
        aktif();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "data gagal disimpan " + e);
    }
    datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void tblpermohonanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpermohonanMouseClicked
        int bar = tblpermohonan.getSelectedRow();
        String a = String.valueOf(tabmode.getValueAt(bar, 0));
        String b = String.valueOf(tabmode.getValueAt(bar, 1));
        String c = String.valueOf(tabmode.getValueAt(bar, 2));
        String d = String.valueOf(tabmode.getValueAt(bar, 3));
        String e = String.valueOf(tabmode.getValueAt(bar, 4));
        String f = String.valueOf(tabmode.getValueAt(bar, 5));
        String g = String.valueOf(tabmode.getValueAt(bar, 6));
        String h = String.valueOf(tabmode.getValueAt(bar, 7));
        String i = String.valueOf(tabmode.getValueAt(bar, 8));
        String j = String.valueOf(tabmode.getValueAt(bar, 9));
        String k = String.valueOf(tabmode.getValueAt(bar, 10));
        String l = String.valueOf(tabmode.getValueAt(bar, 11));

        txtidpermohonan.setText(a);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date tanggal = sdf.parse(b);
            tgl.setDate(tanggal);
        } catch (Exception t) {
            tgl.setDate(null);
        }
        boxjenis.setSelectedItem(c);
        labid.setText(d);
        labnm.setText(e);
        labalm.setText(f);
        labtelp.setText(g);
        labidtnh.setText(h);
        labkec.setText(i);
        labkel.setText(j);
        labvlm.setText(k);
        labhak.setText(l);
    }//GEN-LAST:event_tblpermohonanMouseClicked

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
        // Update mencakup id pemohon dan id tanah yang baru dipilih
        String sql = "update permohonan set tggl=?, jns=?, idpmhn=?, nmpmhn=?, alm=?, notelp=?, idtnh=?, kec=?, kel=?, vlm=?, haktanah=? where idprmhnn=?";
        PreparedStatement stat = conn.prepareStatement(sql);
        if (tgl.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Tanggal belum dipilih!");
            return;
        }
        java.sql.Date sqlDate = new java.sql.Date(tgl.getDate().getTime());
        stat.setDate(1, sqlDate);
        stat.setString(2, boxjenis.getSelectedItem().toString());
        stat.setString(3, labid.getText());
        stat.setString(4, labnm.getText());
        stat.setString(5, labalm.getText());
        stat.setString(6, labtelp.getText());
        stat.setString(7, labidtnh.getText());
        stat.setString(8, labkec.getText());
        stat.setString(9, labkel.getText());
        stat.setString(10, labvlm.getText());
        stat.setString(11, labhak.getText());
        stat.setString(12, txtidpermohonan.getText());
        
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

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
    int ok = JOptionPane.showConfirmDialog(null, "hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "delete from permohonan where idprmhnn ='" + txtidpermohonan.getText() + "'";
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

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bresetActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void bcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcariKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariKeyPressed

    private void boxjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxjenisActionPerformed

    private void bcariidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariidActionPerformed
    popup_pemohon pop = new popup_pemohon(null, true);
    pop.formPermohonan = this; // Menghubungkan form permohonan saat ini ke pop-up
    pop.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bcariidActionPerformed

    private void bcariidtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariidtnActionPerformed
    popup_tanah pop = new popup_tanah(null, true);
    pop.formPermohonan = this;
    pop.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_bcariidtnActionPerformed

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
            java.util.logging.Logger.getLogger(permohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permohonan().setVisible(true);
            }
        });
    }
    
    private void polesDesainPermohonan() {
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

    // 2. Poles Semua Tombol (Sesuaikan nama variabel 8 tombol kamu di baris bawah ini)
    // Urutan: {Simpan, Ubah, Hapus, Cetak, Reset, Cari Pemohon, Cari Tanah, Cari Tabel}
    javax.swing.JButton[] daftarTombol = {bsimpan, bubah, bhapus, bcetak, breset, bcariid, bcariidtn, bcari};
    java.awt.Color[] warnaTombol = {
        new java.awt.Color(30, 58, 95),    // Simpan: Navy Gelap
        new java.awt.Color(59, 130, 246),  // Ubah: Biru Cerah
        new java.awt.Color(220, 38, 38),   // Hapus: Merah Lembut
        new java.awt.Color(13, 148, 136),  // Cetak: Teal Modern
        new java.awt.Color(100, 116, 139), // Reset: Abu-abu Slate
        new java.awt.Color(30, 58, 95),    // Cari Pemohon: Navy Gelap
        new java.awt.Color(30, 58, 95),    // Cari Tanah: Navy Gelap
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
        btn.setIconTextGap(6);

        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(16, 16, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D gIkon = img.createGraphics();
        gIkon.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        gIkon.setColor(java.awt.Color.WHITE);
        gIkon.setStroke(new java.awt.BasicStroke(1.6f));
        if (jenisIkon == 0) { // Simpan (Disket)
            gIkon.drawRoundRect(2, 2, 11, 11, 2, 2);
            gIkon.fillRect(5, 2, 5, 4);
            gIkon.fillRect(4, 8, 7, 5);
        } else if (jenisIkon == 1) { // Ubah (Pensil)
            gIkon.drawLine(3, 13, 11, 5);
            gIkon.drawLine(11, 5, 13, 7);
            gIkon.drawLine(13, 7, 5, 15);
            gIkon.drawLine(3, 13, 5, 15);
        } else if (jenisIkon == 2) { // Hapus (Tempat Sampah)
            gIkon.drawLine(3, 4, 13, 4);
            gIkon.drawRect(4, 4, 8, 9);
            gIkon.drawLine(7, 7, 7, 11);
            gIkon.drawLine(9, 7, 9, 11);
        } else if (jenisIkon == 3) { // Cetak (Printer)
            gIkon.drawRect(4, 2, 8, 3);
            gIkon.drawRoundRect(2, 5, 12, 6, 2, 2);
            gIkon.fillRect(4, 9, 8, 5);
        } else if (jenisIkon == 4) { // Reset (Silang/Refresh)
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

    // 3. Poles Kotak Input (JTextField & JComboBox)
    java.util.List<javax.swing.JComponent> daftarInput = new java.util.ArrayList<>();
    for (java.awt.Component comp : panelCardKiri.getComponents()) {
        if (comp instanceof javax.swing.JTextField || comp instanceof javax.swing.JComboBox) {
            daftarInput.add((javax.swing.JComponent) comp);
        }
    }
    for (java.awt.Component comp : panelCardKanan.getComponents()) {
        if (comp instanceof javax.swing.JTextField) {
            daftarInput.add((javax.swing.JComponent) comp);
        }
    }

    for (final javax.swing.JComponent field : daftarInput) {
        field.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        field.setForeground(new java.awt.Color(15, 23, 42));
        field.setBackground(new java.awt.Color(248, 250, 252));

        if (field instanceof javax.swing.JTextField) {
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
        } else if (field instanceof javax.swing.JComboBox) {
            field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225), 1, true));
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bcariid;
    private javax.swing.JButton bcariidtn;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bhapus;
    private javax.swing.JComboBox<String> boxjenis;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JLabel labalm;
    public javax.swing.JLabel labhak;
    public javax.swing.JLabel labid;
    public javax.swing.JLabel labidtnh;
    public javax.swing.JLabel labkec;
    public javax.swing.JLabel labkel;
    public javax.swing.JLabel labnm;
    public javax.swing.JLabel labtelp;
    public javax.swing.JLabel labvlm;
    private javax.swing.JPanel panelCardKanan;
    private javax.swing.JPanel panelCardKiri;
    private javax.swing.JTable tblpermohonan;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextField txtidpermohonan;
    // End of variables declaration//GEN-END:variables
}
