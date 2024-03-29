/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.mainmenu;

import deu.cse.team.booking.Booking;
import deu.cse.team.checkin.CheckIn;
import deu.cse.team.checkout.CheckOut;
import deu.cse.team.login.Login;
import deu.cse.team.management.Management;
import deu.cse.team.service.ServiceSelect;

/**
 *
 * @author CHANG
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Main");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BookingButt = new javax.swing.JButton();
        CheckInButt = new javax.swing.JButton();
        CheckOutButt = new javax.swing.JButton();
        ServiceButt = new javax.swing.JButton();
        ManageButt = new javax.swing.JButton();
        AccessorLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("메인메뉴");

        BookingButt.setText("예약");
        BookingButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingButtActionPerformed(evt);
            }
        });

        CheckInButt.setText("체크인");
        CheckInButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInButtActionPerformed(evt);
            }
        });

        CheckOutButt.setText("체크아웃");
        CheckOutButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtActionPerformed(evt);
            }
        });

        ServiceButt.setText("호텔 서비스");
        ServiceButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceButtActionPerformed(evt);
            }
        });

        ManageButt.setText("관리");
        ManageButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageButtActionPerformed(evt);
            }
        });

        AccessorLable.setForeground(new java.awt.Color(255, 0, 0));
        AccessorLable.setText("jLabel2");

        jLabel2.setText("접속자 :");

        SignOutButton.setText("로그아웃");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BookingButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckInButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckOutButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ServiceButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageButt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SignOutButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccessorLable)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccessorLable)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(BookingButt)
                .addGap(35, 35, 35)
                .addComponent(CheckInButt)
                .addGap(35, 35, 35)
                .addComponent(CheckOutButt)
                .addGap(33, 33, 33)
                .addComponent(ServiceButt)
                .addGap(40, 40, 40)
                .addComponent(ManageButt)
                .addGap(18, 18, 18)
                .addComponent(SignOutButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingButtActionPerformed
        // TODO add your handling code here:
        new Booking().setVisible(true);
    }//GEN-LAST:event_BookingButtActionPerformed

    private void CheckInButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInButtActionPerformed
        // TODO add your handling code here:
        new CheckIn().setVisible(true);
    }//GEN-LAST:event_CheckInButtActionPerformed

    private void CheckOutButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtActionPerformed
        // TODO add your handling code here:
        new CheckOut().setVisible(true);
    }//GEN-LAST:event_CheckOutButtActionPerformed

    private void ServiceButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceButtActionPerformed
        // TODO add your handling code here:
        new ServiceSelect().setVisible(true);
    }//GEN-LAST:event_ServiceButtActionPerformed

    private void ManageButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageButtActionPerformed
        // TODO add your handling code here:
        new Management().setVisible(true);
    }//GEN-LAST:event_ManageButtActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_SignOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AccessorLable;
    private javax.swing.JButton BookingButt;
    private javax.swing.JButton CheckInButt;
    private javax.swing.JButton CheckOutButt;
    public javax.swing.JButton ManageButt;
    private javax.swing.JButton ServiceButt;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
