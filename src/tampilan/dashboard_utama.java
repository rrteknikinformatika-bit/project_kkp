/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.awt.Component;
import java.awt.Image;
import static java.awt.SystemColor.desktop;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import koneksi.koneksi;
public class dashboard_utama extends javax.swing.JFrame {
     
    public void tampilkanForm(javax.swing.JInternalFrame f) {
    desktop.removeAll();
    desktop.repaint();
    
    // 1. Matikan Border (ini yang menghilangkan garis sisa)
    f.setBorder(null); 
    
    // 2. Tambahkan ke desktop
    desktop.add(f);
    
    // 3. Munculkan
    f.setVisible(true);
    
    // 4. Hilangkan Header (NorthPane)
    javax.swing.plaf.basic.BasicInternalFrameUI ui = 
        (javax.swing.plaf.basic.BasicInternalFrameUI) f.getUI();
    f.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
    ui.setNorthPane(null);
    
    // 5. Maksimalkan
    try {
        f.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
}
   
    public void tampilkanHalamanUtama() {
    // 1. Bersihkan desktop pane agar tidak menumpuk (opsional)
    desktop.removeAll();
    desktop.repaint();
    
    // 2. Buat objek halaman utama
    halaman_utama hu = new halaman_utama();
    
    // 3. Tambahkan ke JDesktopPane (pastikan nama variabelnya 'desktop')
    desktop.add(hu);
    
    // 4. Tampilkan form
    hu.setVisible(true);
    
    // 5. Buat menjadi full screen di dalam panel
    try {
        hu.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }
}
    
private Connection conn = new koneksi().connect() ;
    /**
     * Creates new form dashboard_utama
     */
    public dashboard_utama() {
        initComponents();
        
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
         setResizable(true);
        desktop.setPreferredSize(
        java.awt.Toolkit.getDefaultToolkit().getScreenSize()
    );
        halaman_utama hu = new halaman_utama();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(hu);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        hu.setVisible(true);   // TODO add your handling code here:
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        hu.setMaximum(true);
        
        hu.setBorder(null); // Hilangkan garis pinggir
    ((javax.swing.plaf.basic.BasicInternalFrameUI)hu.getUI()).setNorthPane(null);
    
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }
         hu.setVisible(true);

    bpemohon.setIcon(new ImageIcon(
        new ImageIcon(getClass().getResource("/source/pemohon.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));

         
        bpemohon.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/pemohon.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
        // Taruh ini di bawah kode pengesetan icon tombol Anda
bpemohon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
bpemohon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btanah.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/tanah.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
btanah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
btanah.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

bjadwal.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/jadwal.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
bjadwal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
bjadwal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

btugas.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/tugas.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
btugas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
btugas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

prmhn.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/permohonan.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
prmhn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
prmhn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

bpenugas.setIcon(new ImageIcon(
    new ImageIcon(getClass().getResource("/source/penugasan.png"))
        .getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH)));
bpenugas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
bpenugas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bjadwal = new javax.swing.JButton();
        btugas = new javax.swing.JButton();
        bpenugas = new javax.swing.JButton();
        prmhn = new javax.swing.JButton();
        btanah = new javax.swing.JButton();
        bpemohon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        absen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 249, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bjadwal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bjadwal.setText("jadwal");
        bjadwal.setMaximumSize(new java.awt.Dimension(105, 105));
        bjadwal.setMinimumSize(new java.awt.Dimension(105, 105));
        bjadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bjadwalMouseClicked(evt);
            }
        });
        bjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjadwalActionPerformed(evt);
            }
        });
        bjadwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bjadwalKeyPressed(evt);
            }
        });
        jPanel1.add(bjadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 80, 80));

        btugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btugas.setText("tugas");
        btugas.setMaximumSize(new java.awt.Dimension(105, 105));
        btugas.setMinimumSize(new java.awt.Dimension(105, 105));
        btugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btugasActionPerformed(evt);
            }
        });
        jPanel1.add(btugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 70, 80));

        bpenugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpenugas.setText("penugasan");
        bpenugas.setMaximumSize(new java.awt.Dimension(105, 105));
        bpenugas.setMinimumSize(new java.awt.Dimension(105, 105));
        bpenugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpenugasActionPerformed(evt);
            }
        });
        jPanel1.add(bpenugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 100, 80));

        prmhn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        prmhn.setText("permohonan");
        prmhn.setMaximumSize(new java.awt.Dimension(105, 105));
        prmhn.setMinimumSize(new java.awt.Dimension(105, 105));
        prmhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prmhnActionPerformed(evt);
            }
        });
        jPanel1.add(prmhn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 120, 80));

        btanah.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btanah.setText("tanah");
        btanah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanahActionPerformed(evt);
            }
        });
        jPanel1.add(btanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 70, 80));

        bpemohon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpemohon.setText("pemohon");
        bpemohon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bpemohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpemohonActionPerformed(evt);
            }
        });
        jPanel1.add(bpemohon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 100, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logo uk 150 X 150.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("JAKARTA TIMUR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NASIONAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("BADAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PERTANAHAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1920, 10));

        absen.setText("absen");
        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        jPanel1.add(absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, 70));

        jButton1.setText("admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 70, 80));

        jPanel4.setBackground(new java.awt.Color(252, 249, 235));

        jLabel1.setText("© 2024 Badan Pertanahan Nasional Jakarta Timur. Seluruh Hak Cipta Dilindungi.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desktop)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tampilkanForm(new admin());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
       tampilkanForm(new absen());
    }//GEN-LAST:event_absenActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

       tampilkanForm(new halaman_utama());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void bpemohonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpemohonActionPerformed
       
       tampilkanForm(new pemohon());       
    }//GEN-LAST:event_bpemohonActionPerformed

    private void btanahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanahActionPerformed

        tampilkanForm(new tanah());
    }//GEN-LAST:event_btanahActionPerformed

    private void prmhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prmhnActionPerformed

    tampilkanForm(new permohonan());    
    }//GEN-LAST:event_prmhnActionPerformed

    private void bpenugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpenugasActionPerformed

        tampilkanForm(new penugasan());
    }//GEN-LAST:event_bpenugasActionPerformed

    private void btugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btugasActionPerformed

        tampilkanForm(new tugas());
    }//GEN-LAST:event_btugasActionPerformed

    private void bjadwalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bjadwalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bjadwalKeyPressed

    private void bjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjadwalActionPerformed

        tampilkanForm(new jadwal());
    }//GEN-LAST:event_bjadwalActionPerformed

    private void bjadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bjadwalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bjadwalMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absen;
    private javax.swing.JButton bjadwal;
    private javax.swing.JButton bpemohon;
    private javax.swing.JButton bpenugas;
    private javax.swing.JButton btanah;
    private javax.swing.JButton btugas;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton prmhn;
    // End of variables declaration//GEN-END:variables
}
