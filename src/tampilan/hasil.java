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
            volumeTerpilih, lokasiTerpilih,
            hakTanahTerpilih, namaPetugasTerpilih, nipTerpilih, tanggalUkurTerpilih;
    
    public void setPermohonanKeForm(){
        labidpngsn.setText(idPenugasanTerpilih);
        labnm.setText(namaPemohonTerpilih);
        labjl.setText(jenisLayananTerpilih);
        labvlm.setText(volumeTerpilih);
        lablks.setText(lokasiTerpilih);
        labhak.setText(hakTanahTerpilih);
        labnmptgs.setText(namaPetugasTerpilih);
        labnip.setText(nipTerpilih);
        labtggl.setText(tanggalUkurTerpilih);
    }/**
     * Creates new form hasil
     */
   public hasil() {
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
        labvlm.setText("");
        lablks.setText("");
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
        "Volume Tanah", "Lokasi Tanah", "Hak Tanah", "Nama Petugas", "NIP", "Tanggal Ukur", 
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
                hasil.getString("vlm"),
                hasil.getString("lks"),      
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

        jPanel10 = new javax.swing.JPanel();
        lablks = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
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

        jPanel10.setBackground(new java.awt.Color(252, 249, 235));

        lablks.setText("jLabel11");

        jLabel183.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel183.setText("Form Hasil");

        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Cetak");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel184.setText("Hak Tanah");

        jLabel185.setText("Hasil Ukur");

        labhak.setText("jLabel13");

        jLabel186.setText("Id Penugasan");

        jLabel187.setText("Nama Petugas");

        labidpngsn.setText("jLabel2");

        labnmptgs.setText("jLabel15");

        cbprgs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Ukur", "Proses Ukur", "Selesai Ukur" }));
        cbprgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprgsActionPerformed(evt);
            }
        });

        jLabel188.setText("NIP");

        jLabel189.setText("Progres");

        labnip.setText("jLabel17");

        poppenugasan.setForeground(new java.awt.Color(255, 255, 255));
        poppenugasan.setText("Cari");
        poppenugasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poppenugasanActionPerformed(evt);
            }
        });

        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jLabel190.setText("Id Hasil");

        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        jLabel191.setText("Nama Pemohon");

        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        labnm.setText("jLabel5");

        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel192.setText("Jenis Layanan");

        labjl.setText("jLabel7");

        jLabel193.setText("Volume");

        labvlm.setText("jLabel9");

        jLabel194.setText("Lokasi Tanah");

        jLabel195.setText("Tanggal Ukur");

        labtggl.setText("jLabel19");

        tblhasil.setModel(new javax.swing.table.DefaultTableModel(
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
        tblhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhasilMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblhasil);

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

        bcari.setForeground(new java.awt.Color(255, 255, 255));
        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(693, 693, 693)
                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel191, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel192, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel193, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel194, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel184, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel187, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel195, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel185)
                            .addComponent(jLabel189))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthsl)
                            .addComponent(labtggl)
                            .addComponent(labnip)
                            .addComponent(labnmptgs)
                            .addComponent(labhak)
                            .addComponent(lablks)
                            .addComponent(labvlm)
                            .addComponent(labjl)
                            .addComponent(labnm)
                            .addComponent(txtidhsl)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(labidpngsn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(poppenugasan))
                            .addComponent(cbprgs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(448, 448, 448)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(360, 360, 360))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 339, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidhsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel190)
                            .addComponent(bsimpan))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel186)
                                    .addComponent(labidpngsn)
                                    .addComponent(poppenugasan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel191)
                                    .addComponent(labnm)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(bubah)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel192)
                                    .addComponent(labjl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(bhapus)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel193)
                            .addComponent(labvlm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel194)
                            .addComponent(lablks)
                            .addComponent(bbatal))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel184)
                                    .addComponent(labhak))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel187)
                                    .addComponent(labnmptgs)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(print)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel188)
                            .addComponent(labnip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel195)
                            .addComponent(labtggl))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbprgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel189))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel185)
                            .addComponent(txthsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bcari)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 920, Short.MAX_VALUE)
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
        String sql = "INSERT INTO hasil (idhasil, idpngsn, nmpmhn, jns, vlm, lks, haktanah, nmptgs, nip, tggl, progres, hslukur)"
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stat = conn.prepareStatement(sql);

            // PETAKKAN KOMPONEN UI SESUAI KOLOM SQL DI ATAS
            stat.setString(1, txtidhsl.getText());  // idpngsn
            stat.setString(2, labidpngsn.getText());       // tggl
            stat.setString(3, labnm.getText());        // idprmhnn
            stat.setString(4, labjl.getText());    // idjdwl
            stat.setString(5, labvlm.getText());     // idptgs
            stat.setString(6, lablks.getText());
            stat.setString(7, labhak.getText());      // nmpmhn
            stat.setString(8, labnmptgs.getText());      // notelp
            stat.setString(9, labnip.getText());    // alm
            stat.setString(10, labtggl.getText());    // lks
            stat.setString(11, cbprgs.getSelectedItem().toString());   // vlm
            stat.setString(12, txthsl.getText());   // haktanah

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
            String sql = "update hasil set  idpngsn=?, nmpmhn=?, jns=?, vlm=?, lks=?, haktanah=?, nmptgs=?, nip=?, tggl=?, progres=?, hslukur=? where idhasil = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //stat.setString(1, txtidhsl.getText());
            stat.setString(1, labidpngsn.getText());
            stat.setString(2, labnm.getText());
            stat.setString(3, labjl.getText());
            stat.setString(4, labvlm.getText());
            stat.setString(5, lablks.getText());
            stat.setString(6, labhak.getText());
            stat.setString(7, labnmptgs.getText());
            stat.setString(8, labnip.getText());
            stat.setString(9,labtggl.getText());
            stat.setString(10, cbprgs.getSelectedItem().toString());
            stat.setString(11,txthsl.getText());
            stat.setString(12,txtidhsl.getText());
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
        labvlm.setText(model.getValueAt(bar, 4).toString());
        lablks.setText(model.getValueAt(bar, 5).toString());
        labhak.setText(model.getValueAt(bar, 6).toString());
        labnmptgs.setText(model.getValueAt(bar, 7).toString());
        labnip.setText(model.getValueAt(bar, 8).toString());
        labtggl.setText(model.getValueAt(bar, 9).toString());
        String progresValue = model.getValueAt(bar, 10).toString();
        cbprgs.setSelectedItem(progresValue);
        txthsl.setText(model.getValueAt(bar,11).toString());
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
    private javax.swing.JLabel jLabel183;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JLabel labhak;
    public javax.swing.JLabel labidpngsn;
    public javax.swing.JLabel labjl;
    public javax.swing.JLabel lablks;
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
