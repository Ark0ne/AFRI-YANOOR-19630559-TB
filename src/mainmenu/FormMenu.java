/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu;

import akun.FormUser;
import datadiri.FormDataDiri;
import jabatan.FormJabatan;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import login.FormLogin;
import mutasi.FormMutasi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
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
        mainMenu = new javax.swing.JMenuBar();
        log = new javax.swing.JMenu();
        logIn = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        admin = new javax.swing.JMenu();
        akun = new javax.swing.JMenuItem();
        pegawai = new javax.swing.JMenu();
        dataDiri = new javax.swing.JMenuItem();
        Jabatan = new javax.swing.JMenuItem();
        mutasi = new javax.swing.JMenuItem();
        laporan = new javax.swing.JMenu();
        lapJabatan = new javax.swing.JMenuItem();
        lapMutasi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        mainMenu.setBackground(new java.awt.Color(51, 204, 255));
        mainMenu.setForeground(new java.awt.Color(51, 204, 255));

        log.setBackground(new java.awt.Color(0, 204, 204));
        log.setText("Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        logIn.setBackground(new java.awt.Color(0, 153, 204));
        logIn.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        logIn.setForeground(new java.awt.Color(0, 0, 0));
        logIn.setText("Log In");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        log.add(logIn);

        logOut.setBackground(new java.awt.Color(0, 153, 204));
        logOut.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        logOut.setForeground(new java.awt.Color(0, 0, 0));
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        log.add(logOut);

        exit.setBackground(new java.awt.Color(51, 102, 255));
        exit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        log.add(exit);

        mainMenu.add(log);

        admin.setBackground(new java.awt.Color(51, 204, 255));
        admin.setText("Admin");

        akun.setBackground(new java.awt.Color(153, 255, 255));
        akun.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        akun.setForeground(new java.awt.Color(51, 51, 51));
        akun.setText("Akun");
        akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunActionPerformed(evt);
            }
        });
        admin.add(akun);

        mainMenu.add(admin);

        pegawai.setBackground(new java.awt.Color(0, 102, 255));
        pegawai.setText("Data Pegawai");

        dataDiri.setBackground(new java.awt.Color(204, 255, 0));
        dataDiri.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        dataDiri.setForeground(new java.awt.Color(51, 51, 51));
        dataDiri.setText("Data Diri Pegawai");
        dataDiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDiriActionPerformed(evt);
            }
        });
        pegawai.add(dataDiri);

        Jabatan.setBackground(new java.awt.Color(51, 255, 51));
        Jabatan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Jabatan.setForeground(new java.awt.Color(51, 51, 51));
        Jabatan.setText("Data Jabatan");
        Jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JabatanActionPerformed(evt);
            }
        });
        pegawai.add(Jabatan);

        mutasi.setBackground(new java.awt.Color(0, 255, 255));
        mutasi.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        mutasi.setForeground(new java.awt.Color(51, 51, 51));
        mutasi.setText("Data Mutasi");
        mutasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutasiActionPerformed(evt);
            }
        });
        pegawai.add(mutasi);

        mainMenu.add(pegawai);

        laporan.setBackground(new java.awt.Color(0, 102, 153));
        laporan.setText("Laporan");

        lapJabatan.setBackground(new java.awt.Color(255, 153, 153));
        lapJabatan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lapJabatan.setForeground(new java.awt.Color(51, 51, 51));
        lapJabatan.setText("Laporan Jabatan");
        lapJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapJabatanActionPerformed(evt);
            }
        });
        laporan.add(lapJabatan);

        lapMutasi.setBackground(new java.awt.Color(255, 204, 204));
        lapMutasi.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lapMutasi.setForeground(new java.awt.Color(51, 51, 51));
        lapMutasi.setText("Laporan Mutasi");
        lapMutasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapMutasiActionPerformed(evt);
            }
        });
        laporan.add(lapMutasi);

        mainMenu.add(laporan);

        setJMenuBar(mainMenu);

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

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar", "Confrim",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
        System.exit(0);
        }

    }//GEN-LAST:event_exitActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunActionPerformed
        // TODO add your handling code here:
        new FormUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_akunActionPerformed

    private void dataDiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDiriActionPerformed
        // TODO add your handling code here:
        new FormDataDiri().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataDiriActionPerformed

    private void JabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JabatanActionPerformed
        // TODO add your handling code here:
        new FormJabatan().setVisible(true);
        dispose();
    }//GEN-LAST:event_JabatanActionPerformed

    private void mutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutasiActionPerformed
        // TODO add your handling code here:
        new FormMutasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_mutasiActionPerformed

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_logInActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        logOut.enable(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void lapJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapJabatanActionPerformed
        // TODO add your handling code here:
         try{
            HashMap parameter = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:" + "///db_kepegawaian", "root", "");
            File file = new File("src\\mainmenu/LaporanJabatan.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, cn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Data tidak dapat di Cetak !!!" + "\n" + e.getMessage(), "Cetak Data", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lapJabatanActionPerformed

    private void lapMutasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapMutasiActionPerformed
        // TODO add your handling code here:
        try{
            HashMap parameter = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:" + "///db_kepegawaian", "root", "");
            File file = new File("src\\mainmenu/LaporanMutasi.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, cn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Data tidak dapat di Cetak !!!" + "\n" + e.getMessage(), "Cetak Data", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lapMutasiActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Jabatan;
    public javax.swing.JMenu admin;
    private javax.swing.JMenuItem akun;
    private javax.swing.JMenuItem dataDiri;
    private javax.swing.JMenuItem exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem lapJabatan;
    private javax.swing.JMenuItem lapMutasi;
    public javax.swing.JMenu laporan;
    public javax.swing.JMenu log;
    public javax.swing.JMenuItem logIn;
    public javax.swing.JMenuItem logOut;
    public javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenuItem mutasi;
    public javax.swing.JMenu pegawai;
    // End of variables declaration//GEN-END:variables
}