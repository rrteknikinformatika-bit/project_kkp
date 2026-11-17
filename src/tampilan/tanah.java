/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import koneksi.koneksi;
/**
 *
 * @author anwar
 */
public class tanah extends javax.swing.JInternalFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private String sql;
    private HashMap<String, String[]> dataKel = new HashMap<>();

    private void isiDataWilayah() {
    dataKel.put("Cakung", new String[]{"Cakung Barat", "Cakung Timur", "Jatinegara", "Penggilingan", "Pulo Gebang", "Rawa Terate", "Ujung Menteng"});
    dataKel.put("Cipayung", new String[]{"Bambu Apus", "Ceger", "Cilangkap", "Cipayung", "Lubang Buaya", "Munjul", "Pondok Ranggon", "Setu"});
    dataKel.put("Ciracas", new String[]{"Cibubur", "Ciracas", "Kelapa Dua Wetan", "Rambutan", "Susukan"});
    dataKel.put("Duren Sawit", new String[]{"Duren Sawit", "Klender", "Malaka Jaya", "Malaka Sari", "Pondok Bambu", "Pondok Kelapa", "Pondok Kopi"});
    dataKel.put("Jatinegara", new String[]{"Bali Mester", "Bidara Cina", "Cipinang Besar Selatan", "Cipinang Besar Utara", "Cipinang Cempedak", "Cipinang Muara", "Kampung Melayu", "Rawa Bunga"});
    dataKel.put("Kramat Jati", new String[]{"Balekambang", "Batu Ampar", "Cawang", "Cililitan", "Dukuh", "Kramat Jati", "Tengah"});
    dataKel.put("Makasar", new String[]{"Cipinang Melayu", "Halim Perdana Kusuma", "Kebon Pala", "Makasar", "Pinang Ranti"});
    dataKel.put("Matraman", new String[]{"Kayu Manis", "Kebon Manggis", "Pal Meriam", "Pisangan Baru", "Utan Kayu Selatan", "Utan Kayu Utara"});
    dataKel.put("Pasar Rebo", new String[]{"Baru", "Cijantung", "Gedong", "Kalisari", "Pekayon"});
    dataKel.put("Pulogadung", new String[]{"Cipinang", "Jati", "Jatinegara Kaum", "Kayu Putih", "Pisangan Timur", "Pulo Gadung", "Rawamangun"});
}

    private void isiKelurahan(String kec) {
    String[] daftar = dataKel.get(kec);
    if (daftar != null) {
        boxkel.setModel(new DefaultComboBoxModel<>(daftar));
    }
}
    public tanah() {
        initComponents();
        polesDesainTanah();
        isiDataWilayah();                                   
        isiKelurahan(boxkec.getSelectedItem().toString());
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
        txtid.requestFocus();
    }
 protected void kosong(){
        txtid.setText("");
    txtluas.setText("");
    boxstatus.setSelectedIndex(0);
    boxhak.setSelectedIndex(0);
    boxkec.setSelectedIndex(0);
    boxkel.setSelectedIndex(0);
    txtcari.setText("");
    }
 protected void datatable(){
        Object[] Baris = {"ID_Tanah", "Kecamatan", "Kelurahan", "VOLUME", "Status_Tanah", "HAK_TANAH"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem = txtcari.getText();
    try {
        String sql = "SELECT * FROM tanah WHERE idtnh LIKE '%" + cariitem +
                "%' OR kec LIKE '%" + cariitem +
                "%' OR kel LIKE '%" + cariitem + "%' ORDER BY idtnh ASC";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString("idtnh"),
                hasil.getString("kec"),
                hasil.getString("kel"),
                hasil.getString("vlm"),
                hasil.getString("stts"),
                hasil.getString("haktanah")
            });
        }
        tbltanah.setModel(tabmode);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "data gagal di panggil" + e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelCardKiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boxhak = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bbatal = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        bhapus = new javax.swing.JButton();
        boxkec = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        boxkel = new javax.swing.JComboBox<>();
        txtluas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bubah = new javax.swing.JButton();
        boxstatus = new javax.swing.JComboBox<>();
        bsimpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelCardKanan = new javax.swing.JPanel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltanah = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("ID Tanah");

        boxhak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hak Tanah", "Hak Milik", "Hak Guna bangunan", "Hak Guna usaha", "Hak Pakai", "Hak Pengelolaan", "Hak wakaf", "Hak Milik satuan rumah susun" }));
        boxhak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxhakActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Status Tanah");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Kecamatan");

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        boxkec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kecamatan", "Cakung", "Jatinegara", "Duren Sawit", "Makasar", "Pasar Rebo", "Ciracas", "Cipayung", "Kramat Jati", "Matraman", "Pulogadung" }));
        boxkec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkecActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Kelurahan");

        boxkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelurahan", "Cakung Barat", "Cakung Timur", "Jatinegara", "Penggilingan", "Pulo Gebang", "Rawa Terate", "Ujung Menteng", "Bambu Apus", "Ceger", "Cilangkap", "Cipayung", "Lubang Buaya", "Munjul", "Pondok Ranggon", "Setu", "Cibubur", "Ciracas", "Kelapa Dua Wetan", "Rambutan", "Susukan", "Duren Sawit", "Klender", "Malaka Jaya", "Malaka Sari", "Pondok Bambu", "Pondok Kelapa", "Pondok Kopi", "Bali Mester", "Bidara Cina", "Cipinang Besar Selatan", "Cipinang Besar Utara", "Cipinang Cempedak", "Cipinang Muara", "Kampung Melayu", "Rawa Bunga", "Balekambang", "Batu Ampar", "Cawang", "Cililitan", "Dukuh", "Kramat Jati", "Tengah", "Cipinang Melayu", "Halim Perdana Kusuma", "Kebon Pala", "Makasar", "Pinang Ranti", "Kayu Manis", "Kebon Manggis", "Pal Meriam", "Pisangan Baru", "Utan Kayu Selatan", "Utan Kayu Utara", "Baru", "Cijantung", "Gedong", "Kalisari", "Pekayon", "Cipinang", "Jati", "Jatinegara Kaum", "Kayu Putih", "Pisangan Timur", "Pulo Gadung", "Rawamangun" }));
        boxkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkelActionPerformed(evt);
            }
        });

        txtluas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtluas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Volume");

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        bubah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("UBAH");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Tanah Negara", "Tanah Adat" }));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Hak Tanah");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText(":");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText(":");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText(":");

        javax.swing.GroupLayout panelCardKiriLayout = new javax.swing.GroupLayout(panelCardKiri);
        panelCardKiri.setLayout(panelCardKiriLayout);
        panelCardKiriLayout.setHorizontalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCardKiriLayout.createSequentialGroup()
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCardKiriLayout.createSequentialGroup()
                            .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(94, 94, 94)
                            .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCardKiriLayout.createSequentialGroup()
                                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16))
                                    .addGap(65, 65, 65)
                                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boxhak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boxstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(panelCardKiriLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtluas, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCardKiriLayout.createSequentialGroup()
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCardKiriLayout.createSequentialGroup()
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(111, 111, 111))
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(65, 65, 65)
                                .addComponent(boxkel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCardKiriLayout.createSequentialGroup()
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(39, 39, 39)
                                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boxkec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelCardKiriLayout.setVerticalGroup(
            panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxkec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxkel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCardKiriLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxhak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelCardKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtcari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        bcari.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bcari.setForeground(new java.awt.Color(255, 255, 255));
        bcari.setText("CARI");
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

        tbltanah.setModel(new javax.swing.table.DefaultTableModel(
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
        tbltanah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltanahMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbltanah);

        javax.swing.GroupLayout panelCardKananLayout = new javax.swing.GroupLayout(panelCardKanan);
        panelCardKanan.setLayout(panelCardKananLayout);
        panelCardKananLayout.setHorizontalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelCardKananLayout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCardKananLayout.setVerticalGroup(
            panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardKananLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelCardKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/garis judul 1.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("TANAH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelCardKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCardKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCardKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
         if (boxstatus.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "Pilih jenis dulu!");
        return;
    }
    String sql = "INSERT INTO tanah (idtnh, kec, kel, vlm, stts, haktanah) VALUES (?,?,?,?,?,?)";
    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtid.getText());
        stat.setString(2, boxkec.getSelectedItem().toString());
        stat.setString(3, boxkel.getSelectedItem().toString());
        stat.setString(4, txtluas.getText());
        stat.setString(5, boxstatus.getSelectedItem().toString());
        stat.setString(6, boxhak.getSelectedItem().toString());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        kosong();
        aktif();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "data gagal disimpan " + e);
    }
    datatable(); // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        if (boxstatus.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "Pilih jenis dulu!");
        return;
    }
    try {
        String sql = "UPDATE tanah SET kec=?, kel=?, vlm=?, stts=?, haktanah=? WHERE idtnh=?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, boxkec.getSelectedItem().toString());
        stat.setString(2, boxkel.getSelectedItem().toString());
        stat.setString(3, txtluas.getText());
        stat.setString(4, boxstatus.getSelectedItem().toString());
        stat.setString(5, boxhak.getSelectedItem().toString());
        stat.setString(6, txtid.getText());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "data berhasil diubah");
        kosong();
        aktif();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "data gagal diubah " + e);
    }
    datatable(); 
 // TODO add your handling code here:
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "delete from tanah where idtnh ='" + txtid.getText() + "'";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                aktif();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus " + e);
            }
            datatable();
        } // TODO add your handling code here:
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        kosong();
        datatable(); // TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();// TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed

    private void tbltanahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltanahMouseClicked
        int bar = tbltanah.getSelectedRow();
    if (bar < 0) return;

    javax.swing.table.TableModel model = tbltanah.getModel();

    txtid.setText(model.getValueAt(bar, 0).toString());
    boxkec.setSelectedItem(model.getValueAt(bar, 1).toString());  // kecamatan dulu
    boxkel.setSelectedItem(model.getValueAt(bar, 2).toString());  // baru kelurahan
    txtluas.setText(model.getValueAt(bar, 3).toString());
    boxstatus.setSelectedItem(model.getValueAt(bar, 4).toString());
    boxhak.setSelectedItem(model.getValueAt(bar, 5).toString());// TODO add your handling code here:
    }//GEN-LAST:event_tbltanahMouseClicked

    private void bcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcariKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariKeyPressed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
           datatable();
       } // TODO add your handling code here:
    }//GEN-LAST:event_txtcariKeyPressed

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

    private void boxhakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxhakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxhakActionPerformed

    private void boxkecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxkecActionPerformed
        if (boxkec.getSelectedItem() != null) {
        isiKelurahan(boxkec.getSelectedItem().toString());
    }
    }//GEN-LAST:event_boxkecActionPerformed

    private void boxkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxkelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxkelActionPerformed

    private void txtluasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluasActionPerformed

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
            java.util.logging.Logger.getLogger(tanah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tanah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tanah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tanah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tanah().setVisible(true);
            }
        });
    }

    private void polesDesainTanah() {
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
    // Urutan: {SIMPAN, UBAH, HAPUS, BATAL, CARI}
    javax.swing.JButton[] daftarTombol = {bsimpan, bubah, bhapus, bbatal, bcari};
    java.awt.Color[] warnaTombol = {
        new java.awt.Color(30, 58, 95),    // SIMPAN: Navy Gelap
        new java.awt.Color(59, 130, 246),  // UBAH: Biru Cerah
        new java.awt.Color(220, 38, 38),   // HAPUS: Merah Lembut
        new java.awt.Color(100, 116, 139), // BATAL: Abu-abu Slate
        new java.awt.Color(30, 58, 95)     // CARI: Navy Gelap
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
        } else if (jenisIkon == 3) { // Batal (Silang)
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
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JComboBox<String> boxhak;
    private javax.swing.JComboBox<String> boxkec;
    private javax.swing.JComboBox<String> boxkel;
    private javax.swing.JComboBox<String> boxstatus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCardKanan;
    private javax.swing.JPanel panelCardKiri;
    private javax.swing.JTable tbltanah;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtluas;
    // End of variables declaration//GEN-END:variables
}
