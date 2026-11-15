/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import tampilan.*;
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

public class hasil extends javax.swing.JInternalFrame {
private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    public String idPenugasanTerpilih, namaPemohonTerpilih, jenisLayananTerpilih, 
            kecamatanTerpilih, kelurahanTerpilih, volumeTerpilih,
            hakTanahTerpilih, namaPetugasTerpilih, nipTerpilih, tanggalUkurTerpilih;
    
    public void setPermohonanKeForm(){
        labidpngsn.setText(idPenugasanTerpilih);
        labnm.setText(namaPemohonTerpilih);
        labjl.setText(jenisLayananTerpilih);
        labkec.setText(kecamatanTerpilih);
        labkel.setText(kelurahanTerpilih);
        labvlm.setText(volumeTerpilih);
        labhak.setText(hakTanahTerpilih);
        labnmptgs.setText(namaPetugasTerpilih);
        labnip.setText(nipTerpilih);
        labtggl.setText(tanggalUkurTerpilih);
    }/**
     * Creates new form hasil
     */
   public hasil() {
        initComponents();
        
        javax.swing.JScrollPane scrollUtama = new javax.swing.JScrollPane(getContentPane());
    scrollUtama.setBorder(null);
    scrollUtama.getVerticalScrollBar().setUnitIncrement(16);
    setContentPane(scrollUtama);
        
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
        
            print.setContentAreaFilled(false);
            print.setFocusPainted(false);
            print.setBorderPainted(false);
            print.setOpaque(false);
            print.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
            
            poppenugasan.setContentAreaFilled(false);
            poppenugasan.setFocusPainted(false);
            poppenugasan.setBorderPainted(false);
            poppenugasan.setOpaque(false);
            poppenugasan.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
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
        txtidhsl.requestFocus();
    }
    
    protected void kosong(){
        txtidhsl.setText("");
        labidpngsn.setText("");
        labnm.setText("");
        labjl.setText("");
        labkec.setText("");
        labkel.setText("");
        labvlm.setText("");
        labhak.setText("");
        labnmptgs.setText("");
        labnip.setText("");
        labtggl.setText("");
        cbprgs.setSelectedIndex(0);
        txthsl.setText("");
    }
    
    protected void datatable() {
    Object[] Baris = {
        "ID Hasil", "ID Penugasan", "Nama Pemohon", "Jenis Layanan",  
        "Kecamatan", "Kelurahan", "Volume Tanah", "Hak Tanah", "Nama Petugas", "NIP", "Tanggal Ukur", 
        "Progres", "Hasil Ukur"
    };
    
    DefaultTableModel tabmode = new DefaultTableModel(null, Baris);
    String cariitem = txtcari.getText(); 
    
    try {
        String sql = "SELECT * FROM hasil WHERE idhasil LIKE '%" + cariitem + "%' OR nmpmhn LIKE '%" + cariitem + "%'";
        Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        
        while (hasil.next()) {
            tabmode.addRow(new Object[]{
                hasil.getString("idhasil"),     
                hasil.getString("idpngsn"),        
                hasil.getString("nmpmhn"),    
                hasil.getString("jns"),
                hasil.getString("kec"),
                hasil.getString("kel"),
                hasil.getString("vlm"),      
                hasil.getString("haktanah"),      
                hasil.getString("nmptgs"),      
                hasil.getString("nip"),         
                hasil.getString("tggl"),         
                hasil.getString("progres"),         
                hasil.getString("hslukur"),    
            });
        }
        tblhasil.setModel(tabmode); // Pastikan nama JTable Anda benar
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal dipanggil: " + e);
    }
}
    
    public void cetak() {
        try{
            String path="./src/report/reportHasil.jasper";
            HashMap parameter = new HashMap();
            String hasil = txtidhsl.getText();
            parameter.put("idhasil", txtidhsl.getText());
            System.out.println(hasil);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        labkec = new javax.swing.JLabel();
        txthsl = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        txtidhsl = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        labhak = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        labidpngsn = new javax.swing.JLabel();
        labnmptgs = new javax.swing.JLabel();
        cbprgs = new javax.swing.JComboBox<>();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        labnip = new javax.swing.JLabel();
        poppenugasan = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        jLabel190 = new javax.swing.JLabel();
        bubah = new javax.swing.JButton();
        jLabel191 = new javax.swing.JLabel();
        bhapus = new javax.swing.JButton();
        labnm = new javax.swing.JLabel();
        bbatal = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        labjl = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        labvlm = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        labtggl = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblhasil = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        labkel = new javax.swing.JLabel();

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

        setMaximumSize(null);
        setMinimumSize(null);

        jPanel10.setBackground(new java.awt.Color(252, 249, 235));

        labkec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkec.setText("jLabel11");

        txthsl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        print.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Cetak");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel184.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel184.setText("Hak Tanah");

        jLabel185.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel185.setText("Hasil Ukur");

        labhak.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labhak.setText("jLabel13");

        jLabel186.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel186.setText("Id Penugasan");

        jLabel187.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel187.setText("Nama Petugas");

        labidpngsn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labidpngsn.setText("jLabel2");

        labnmptgs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnmptgs.setText("jLabel15");

        cbprgs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cbprgs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Ukur", "Proses Ukur", "Selesai Ukur" }));
        cbprgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprgsActionPerformed(evt);
            }
        });

        jLabel188.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel188.setText("NIP");

        jLabel189.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel189.setText("Progres");

        labnip.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnip.setText("jLabel17");

        poppenugasan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        poppenugasan.setForeground(new java.awt.Color(255, 255, 255));
        poppenugasan.setText("Cari");
        poppenugasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poppenugasanActionPerformed(evt);
            }
        });

        bsimpan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jLabel190.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel190.setText("Id Hasil");

        bubah.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        jLabel191.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel191.setText("Nama Pemohon");

        bhapus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        labnm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labnm.setText("jLabel5");

        bbatal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel192.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel192.setText("Jenis Layanan");

        labjl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labjl.setText("jLabel7");

        jLabel193.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel193.setText("Kecamatan");

        labvlm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labvlm.setText("jLabel9");

        jLabel194.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel194.setText("Volume");

        jLabel195.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel195.setText("Tanggal Ukur");

        labtggl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labtggl.setText("jLabel19");

        tblhasil.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhasilMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblhasil);

        txtcari.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
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

        bcari.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bcari.setForeground(new java.awt.Color(255, 255, 255));
        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("HASIL");

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel196.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel196.setText("Kelurahan");

        labkel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labkel.setText("jLabel20");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel191, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel192, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel193, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel190, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel196, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labjl)
                                            .addComponent(labnm)
                                            .addComponent(cbprgs, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(labidpngsn)
                                                .addGap(101, 101, 101)
                                                .addComponent(poppenugasan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtidhsl)
                                            .addComponent(labkec)
                                            .addComponent(labkel)))
                                    .addComponent(jLabel189))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel185)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txthsl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel194)
                                            .addComponent(jLabel184)
                                            .addComponent(jLabel187)
                                            .addComponent(jLabel188)
                                            .addComponent(jLabel195))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labtggl)
                                            .addComponent(labnip)
                                            .addComponent(labnmptgs)
                                            .addComponent(labhak)
                                            .addComponent(labvlm))))))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(78, 78, 78)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel190)
                                    .addComponent(txtidhsl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel186)
                                    .addComponent(labidpngsn)
                                    .addComponent(poppenugasan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel191)
                                    .addComponent(labnm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel192)
                                    .addComponent(labjl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel193)
                                    .addComponent(labkec))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel196)
                                    .addComponent(labkel))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbprgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel189)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel194)
                                    .addComponent(labvlm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel184)
                                    .addComponent(labhak))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel187)
                                    .addComponent(labnmptgs))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel188)
                                    .addComponent(labnip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel195)
                                    .addComponent(labtggl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel185)
                                    .addComponent(txthsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcari))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1722, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        cetak();
    }//GEN-LAST:event_printActionPerformed

    private void cbprgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprgsActionPerformed
        if (cbprgs.getSelectedItem().toString().equalsIgnoreCase("Belum Ukur")) {
            txthsl.setEnabled(false);
            txthsl.setText(""); // Menghapus tulisan jika ada isi sebelumnya
        } else if (cbprgs.getSelectedItem().toString().equalsIgnoreCase("Proses Ukur")) {
            txthsl.setEnabled(false);
            txthsl.setText("");
        }else {
            txthsl.setEnabled(true);
        }
    }//GEN-LAST:event_cbprgsActionPerformed

    private void poppenugasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poppenugasanActionPerformed
        popup_penugasan popup = new popup_penugasan(null, true);
        popup.formHasil = this;
        popup.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_poppenugasanActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        //if (cbprgs.getSelectedIndex() == 0){
            //  JOptionPane.showMessageDialog(null, "Pilih jenis dulu!");
            //return;}
        String sql = "INSERT INTO hasil (idhasil, idpngsn, nmpmhn, jns, kec, kel, vlm, haktanah, nmptgs, nip, tggl, progres, hslukur)"
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);

            // PETAKKAN KOMPONEN UI SESUAI KOLOM SQL DI ATAS
            stat.setString(1, txtidhsl.getText());  // idpngsn
            stat.setString(2, labidpngsn.getText());       // tggl
            stat.setString(3, labnm.getText());        // idprmhnn
            stat.setString(4, labjl.getText());    // idjdwl
            stat.setString(5, labkec.getText());
            stat.setString(6, labkel.getText());
            stat.setString(7, labvlm.getText());     // idptgs
            stat.setString(8, labhak.getText());      // nmpmhn
            stat.setString(9, labnmptgs.getText());      // notelp
            stat.setString(10, labnip.getText());    // alm
            stat.setString(11, labtggl.getText());    // lks
            stat.setString(12, cbprgs.getSelectedItem().toString());   // vlm
            stat.setString(13, txthsl.getText());   // haktanah

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");

            kosong();
            aktif();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan " + e);
        }
        datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        //if (cbprgs.getSelectedIndex() == 0){
            //JOptionPane.showMessageDialog(null, "Pilih progress dulu!");
            //return;
            //}
        try {
            String sql = "update hasil set  idpngsn=?, nmpmhn=?, jns=?, kec=?, kel=?, vlm=?, haktanah=?, nmptgs=?, nip=?, tggl=?, progres=?, hslukur=? where idhasil = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //stat.setString(1, txtidhsl.getText());
            stat.setString(1, labidpngsn.getText());
            stat.setString(2, labnm.getText());
            stat.setString(3, labjl.getText());
            stat.setString(4, labkec.getText());
            stat.setString(5, labkel.getText());
            stat.setString(6, labvlm.getText());
            stat.setString(7, labhak.getText());
            stat.setString(8, labnmptgs.getText());
            stat.setString(9, labnip.getText());
            stat.setString(11,labtggl.getText());
            stat.setString(12, cbprgs.getSelectedItem().toString());
            stat.setString(13,txthsl.getText());
            stat.setString(14,txtidhsl.getText());
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
        datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "delete from hasil where idhasil ='" + txtidhsl.getText() + "'";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                aktif();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus " + e);
            }
            datatable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        kosong();
        datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

    private void tblhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhasilMouseClicked
        int bar = tblhasil.getSelectedRow();
        javax.swing.table.TableModel model = tblhasil.getModel();

        txtidhsl.setText(model.getValueAt(bar, 0).toString());
        labidpngsn.setText(model.getValueAt(bar, 1).toString());
        labnm.setText(model.getValueAt(bar, 2).toString());
        labjl.setText(model.getValueAt(bar, 3).toString());
        labkec.setText(model.getValueAt(bar, 4).toString());
        labkel.setText(model.getValueAt(bar, 5).toString());
        labvlm.setText(model.getValueAt(bar, 6).toString());
        labhak.setText(model.getValueAt(bar, 7).toString());
        labnmptgs.setText(model.getValueAt(bar, 8).toString());
        labnip.setText(model.getValueAt(bar, 9).toString());
        labtggl.setText(model.getValueAt(bar, 10).toString());
        String progresValue = model.getValueAt(bar, 11).toString();
        cbprgs.setSelectedItem(progresValue);
        txthsl.setText(model.getValueAt(bar,12).toString());
    }//GEN-LAST:event_tblhasilMouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            datatable();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtcariKeyPressed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();        // TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JComboBox<String> cbprgs;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JLabel labhak;
    public javax.swing.JLabel labidpngsn;
    public javax.swing.JLabel labjl;
    public javax.swing.JLabel labkec;
    public javax.swing.JLabel labkel;
    public javax.swing.JLabel labnip;
    public javax.swing.JLabel labnm;
    public javax.swing.JLabel labnmptgs;
    public javax.swing.JLabel labtggl;
    public javax.swing.JLabel labvlm;
    private javax.swing.JButton poppenugasan;
    private javax.swing.JButton print;
    private javax.swing.JTable tblhasil;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthsl;
    private javax.swing.JTextField txtidhsl;
    // End of variables declaration//GEN-END:variables
}
