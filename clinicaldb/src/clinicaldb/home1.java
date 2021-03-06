/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinicaldb;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author raksh
 */
public class home1 extends javax.swing.JFrame {

    /**
     * Creates new form home1
     */
    public home1() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("ico.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientAdd = new javax.swing.JButton();
        MedRec = new javax.swing.JButton();
        App = new javax.swing.JButton();
        DocInfo = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Bills = new javax.swing.JButton();
        CliDel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientAdd.setBackground(new java.awt.Color(204, 255, 255));
        PatientAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        PatientAdd.setText("1. Add New Patient Record");
        PatientAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientAddActionPerformed(evt);
            }
        });
        getContentPane().add(PatientAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        MedRec.setBackground(new java.awt.Color(204, 255, 255));
        MedRec.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        MedRec.setText("2. Medical Record");
        MedRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedRecActionPerformed(evt);
            }
        });
        getContentPane().add(MedRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        App.setBackground(new java.awt.Color(204, 255, 255));
        App.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        App.setText("3. Appointments");
        App.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppActionPerformed(evt);
            }
        });
        getContentPane().add(App, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        DocInfo.setBackground(new java.awt.Color(204, 255, 255));
        DocInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        DocInfo.setText("4. Doctors Information");
        DocInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocInfoActionPerformed(evt);
            }
        });
        getContentPane().add(DocInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Logout.setBackground(new java.awt.Color(204, 255, 255));
        Logout.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaldb/logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 40));

        Bills.setBackground(new java.awt.Color(204, 255, 255));
        Bills.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Bills.setText("5. Bills");
        Bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillsActionPerformed(evt);
            }
        });
        getContentPane().add(Bills, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        CliDel.setBackground(new java.awt.Color(204, 255, 255));
        CliDel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        CliDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaldb/clinic.png"))); // NOI18N
        CliDel.setText("Clinic Details");
        CliDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliDelActionPerformed(evt);
            }
        });
        getContentPane().add(CliDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 230, 40));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("SERENITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 390, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaldb/whiteback.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicaldb/blackback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientAddActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newpatient1().setVisible(true);
    }//GEN-LAST:event_PatientAddActionPerformed

    private void MedRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedRecActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new medicalrecords().setVisible(true);
    }//GEN-LAST:event_MedRecActionPerformed

    private void AppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new appointment().setVisible(true);
    }//GEN-LAST:event_AppActionPerformed

    private void DocInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocInfoActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DoctorMain1().setVisible(true);

    }//GEN-LAST:event_DocInfoActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        int  a;
        a = JOptionPane.showConfirmDialog(null,"Do you reall want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login1().setVisible(true);
        }

    }//GEN-LAST:event_LogoutActionPerformed

    private void BillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            new bill1().setVisible(true);
    }//GEN-LAST:event_BillsActionPerformed

    private void CliDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliDelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new clinicDetails().setVisible(true);
    }//GEN-LAST:event_CliDelActionPerformed

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
            java.util.logging.Logger.getLogger(home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton App;
    private javax.swing.JButton Bills;
    private javax.swing.JButton CliDel;
    private javax.swing.JButton DocInfo;
    private javax.swing.JButton Logout;
    private javax.swing.JButton MedRec;
    private javax.swing.JButton PatientAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
