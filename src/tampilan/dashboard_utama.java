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
 private Connection conn = new koneksi().connect() ;
    /**
     * Creates new form dashboard_utama
     */
    public dashboard_utama() {
        initComponents();
        
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
         setResizable(true);
        desktop.setPreferredSize(
        java.awt.Toolkit.getDefaultToolkit().getScreenSize()
    );

         

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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        bjadwal = new javax.swing.JButton();
        btugas = new javax.swing.JButton();
        bpenugas = new javax.swing.JButton();
        prmhn = new javax.swing.JButton();
        btanah = new javax.swing.JButton();
        bpemohon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        desktop = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

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

        btugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btugas.setText("tugas");
        btugas.setMaximumSize(new java.awt.Dimension(105, 105));
        btugas.setMinimumSize(new java.awt.Dimension(105, 105));
        btugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btugasActionPerformed(evt);
            }
        });

        bpenugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpenugas.setText("penugasan");
        bpenugas.setMaximumSize(new java.awt.Dimension(105, 105));
        bpenugas.setMinimumSize(new java.awt.Dimension(105, 105));
        bpenugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpenugasActionPerformed(evt);
            }
        });

        prmhn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        prmhn.setText("permohonan");
        prmhn.setMaximumSize(new java.awt.Dimension(105, 105));
        prmhn.setMinimumSize(new java.awt.Dimension(105, 105));
        prmhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prmhnActionPerformed(evt);
            }
        });

        btanah.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btanah.setText("tanah");
        btanah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanahActionPerformed(evt);
            }
        });

        bpemohon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpemohon.setText("pemohon");
        bpemohon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bpemohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpemohonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 574, Short.MAX_VALUE)
                .addComponent(bpemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(prmhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btanah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btugas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bpenugas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
            .addComponent(desktop)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bjadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bpenugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prmhn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btanah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bpemohon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bpemohonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpemohonActionPerformed
        desktop.removeAll();
        desktop.repaint();
        pemohon pn = new pemohon();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(pn);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        pn.setVisible(true); 
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        pn.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
    }//GEN-LAST:event_bpemohonActionPerformed

    private void btanahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanahActionPerformed
        desktop.removeAll();
        desktop.repaint();
        tanah mt = new tanah();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(mt);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        mt.setVisible(true);   // TODO add your handling code here:
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        mt.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
    }//GEN-LAST:event_btanahActionPerformed

    private void prmhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prmhnActionPerformed
        desktop.removeAll();
        desktop.repaint();
        permohonan ph = new permohonan();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(ph);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        ph.setVisible(true);
        // TODO add your handling code here:
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        ph.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
    }//GEN-LAST:event_prmhnActionPerformed

    private void bpenugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpenugasActionPerformed
        // TODO add your hdesktop.removeAll();
        desktop.repaint();
        desktop.removeAll();
        penugasan pgs = new penugasan();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(pgs);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        pgs.setVisible(true);
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        pgs.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
    }//GEN-LAST:event_bpenugasActionPerformed

    private void btugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btugasActionPerformed
        desktop.removeAll();
        desktop.repaint();
        tugas ts = new tugas();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(ts);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        ts.setVisible(true);
        try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        ts.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btugasActionPerformed

    private void bjadwalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bjadwalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bjadwalKeyPressed

    private void bjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjadwalActionPerformed
        desktop.removeAll();
        desktop.repaint();
        jadwal mj = new jadwal();

        // 2. Memasukkan JInternalFrame ke dalam JDesktopPane
        desktop.add(mj);

        // 3. Mengatur agar JInternalFrame tampil ke depan/fokusmenu
        mj.setVisible(true);
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
try {
        // 5. Buat form otomatis memenuhi seluruh area desktop (Full Screen di dalam panel)
        mj.setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        // Jika gagal dimaksimalkan, tampilkan pesan error di console
        System.err.println("Gagal memaksimalkan Internal Frame: " + e.getMessage());
    }// Agar muncul di tengah la TODO add your handling code here:
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
    private javax.swing.JButton bjadwal;
    private javax.swing.JButton bpemohon;
    private javax.swing.JButton bpenugas;
    private javax.swing.JButton btanah;
    private javax.swing.JButton btugas;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton prmhn;
    // End of variables declaration//GEN-END:variables
}
