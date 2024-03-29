/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.service;

/**
 *
 * @author KYG
 */
public class ServiceSelect extends javax.swing.JFrame {

    /**
     * Creates new form Service
     */
    public ServiceSelect() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Select Service");
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
        ServiceSelectCancelBtn = new javax.swing.JButton();
        CheckServiceConfirmBtn = new javax.swing.JButton();
        SelectRoomServiceBtn = new javax.swing.JButton();
        SelectRestaurantBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림체", 0, 24)); // NOI18N
        jLabel1.setText("호텔 서비스");

        ServiceSelectCancelBtn.setText("이전");
        ServiceSelectCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceSelectCancelBtnActionPerformed(evt);
            }
        });

        CheckServiceConfirmBtn.setText("주문확인");
        CheckServiceConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckServiceConfirmBtnActionPerformed(evt);
            }
        });

        SelectRoomServiceBtn.setText("룸서비스");
        SelectRoomServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRoomServiceBtnActionPerformed(evt);
            }
        });

        SelectRestaurantBtn.setText("레스토랑");
        SelectRestaurantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRestaurantBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(SelectRoomServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(SelectRestaurantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ServiceSelectCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(CheckServiceConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectRoomServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectRestaurantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(CheckServiceConfirmBtn)
                .addGap(35, 35, 35)
                .addComponent(ServiceSelectCancelBtn)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceSelectCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceSelectCancelBtnActionPerformed
        // TODO add your handling code here: 
        dispose();
    }//GEN-LAST:event_ServiceSelectCancelBtnActionPerformed

    private void CheckServiceConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckServiceConfirmBtnActionPerformed
        // TODO add your handling code here:
        ServiceConfirm serviceConfirm = new ServiceConfirm();
        serviceConfirm.setVisible(true);
    }//GEN-LAST:event_CheckServiceConfirmBtnActionPerformed

    private void SelectRoomServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoomServiceBtnActionPerformed
        // TODO add your handling code here:
       RoomService roomService = new RoomService();
        roomService.setVisible(true);
    }//GEN-LAST:event_SelectRoomServiceBtnActionPerformed

    private void SelectRestaurantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRestaurantBtnActionPerformed
        // TODO add your handling code here:
        RestaurantService restaurantService = new RestaurantService();
        restaurantService.setVisible(true);
    }//GEN-LAST:event_SelectRestaurantBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckServiceConfirmBtn;
    private javax.swing.JButton SelectRestaurantBtn;
    private javax.swing.JButton SelectRoomServiceBtn;
    private javax.swing.JButton ServiceSelectCancelBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
