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
        desktop = new javax.swing.JDesktopPane();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

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
        jPanel1.add(bjadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 58, 58));

        btugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btugas.setText("tugas");
        btugas.setMaximumSize(new java.awt.Dimension(105, 105));
        btugas.setMinimumSize(new java.awt.Dimension(105, 105));
        btugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btugasActionPerformed(evt);
            }
        });
        jPanel1.add(btugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 61, 58));

        bpenugas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpenugas.setText("penugasan");
        bpenugas.setMaximumSize(new java.awt.Dimension(105, 105));
        bpenugas.setMinimumSize(new java.awt.Dimension(105, 105));
        bpenugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpenugasActionPerformed(evt);
            }
        });
        jPanel1.add(bpenugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 60, 58));

        prmhn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        prmhn.setText("permohonan");
        prmhn.setMaximumSize(new java.awt.Dimension(105, 105));
        prmhn.setMinimumSize(new java.awt.Dimension(105, 105));
        prmhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prmhnActionPerformed(evt);
            }
        });
        jPanel1.add(prmhn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 60, 57));

        btanah.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btanah.setText("tanah");
        btanah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanahActionPerformed(evt);
            }
        });
        jPanel1.add(btanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 61, 60));

        bpemohon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bpemohon.setText("pemohon");
        bpemohon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bpemohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpemohonActionPerformed(evt);
            }
        });
        jPanel1.add(bpemohon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 61, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logo uk 150 X 150.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 120, 90));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1150, 10));

        jPanel4.setBackground(new java.awt.Color(252, 249, 235));

        jLabel1.setText("© 2024 Badan Pertanahan Nasional Jakarta Timur. Seluruh Hak Cipta Dilindungi.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(321, 321, 321))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
            .addComponent(desktop)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton prmhn;
    // End of variables declaration//GEN-END:variables
}
