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
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltanah = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtluas = new javax.swing.JTextField();
        boxstatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxhak = new javax.swing.JComboBox<>();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        boxkec = new javax.swing.JComboBox<>();
        boxkel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

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

        txtid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("ID TANAH                   :");

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("KECAMATAN            :");

        txtluas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Tanah Negara", "Tanah Adat" }));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("VOLUME                     :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("STATUS TANAH         :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("HAK TANAH               :");

        boxhak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hak Tanah", "Hak Milik", "Hak Guna bangunan", "Hak Guna usaha", "Hak Pakai", "Hak Pengelolaan", "Hak wakaf", "Hak Milik satuan rumah susun" }));
        boxhak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxhakActionPerformed(evt);
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

        bubah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("UBAH");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("TANAH");

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

        boxkec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kecamatan", "Cakung", "Jatinegara", "Duren Sawit", "Makasar", "Pasar Rebo", "Ciracas", "Cipayung", "Kramat Jati", "Matraman", "Pulogadung" }));
        boxkec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkecActionPerformed(evt);
            }
        });

        boxkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelurahan", "Cakung Barat", "Cakung Timur", "Jatinegara", "Penggilingan", "Pulo Gebang", "Rawa Terate", "Ujung Menteng", "Bambu Apus", "Ceger", "Cilangkap", "Cipayung", "Lubang Buaya", "Munjul", "Pondok Ranggon", "Setu", "Cibubur", "Ciracas", "Kelapa Dua Wetan", "Rambutan", "Susukan", "Duren Sawit", "Klender", "Malaka Jaya", "Malaka Sari", "Pondok Bambu", "Pondok Kelapa", "Pondok Kopi", "Bali Mester", "Bidara Cina", "Cipinang Besar Selatan", "Cipinang Besar Utara", "Cipinang Cempedak", "Cipinang Muara", "Kampung Melayu", "Rawa Bunga", "Balekambang", "Batu Ampar", "Cawang", "Cililitan", "Dukuh", "Kramat Jati", "Tengah", "Cipinang Melayu", "Halim Perdana Kusuma", "Kebon Pala", "Makasar", "Pinang Ranti", "Kayu Manis", "Kebon Manggis", "Pal Meriam", "Pisangan Baru", "Utan Kayu Selatan", "Utan Kayu Utara", "Baru", "Cijantung", "Gedong", "Kalisari", "Pekayon", "Cipinang", "Jati", "Jatinegara Kaum", "Kayu Putih", "Pisangan Timur", "Pulo Gadung", "Rawamangun" }));
        boxkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxkelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("KELURAHAN            :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(48, 48, 48)
                            .addComponent(boxhak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(txtluas, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxkel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxkec, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxkec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxkel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtluas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxhak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltanah;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtluas;
    // End of variables declaration//GEN-END:variables
}
