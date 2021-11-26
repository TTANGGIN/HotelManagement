/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.management;

import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.ModifyUserList;
import deu.cse.team.source.UserInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KYG
 */
public class MgmtUser extends javax.swing.JFrame {

    /**
     * Creates new form Manage5
     */
    public MgmtUser() {
        initComponents();
        setLocationRelativeTo(this);
        loadUserData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MgmtAddUserDlg = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddUserNameField = new javax.swing.JTextField();
        AddUserIdField = new javax.swing.JTextField();
        AddUserPwField = new javax.swing.JPasswordField();
        AddUserVerifyPwField = new javax.swing.JPasswordField();
        AddUserOkBtn = new javax.swing.JButton();
        AddUserCancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MgmtAddUserBtn = new javax.swing.JButton();
        MgmtDeleteUserBtn = new javax.swing.JButton();
        MgmtUserModifyOkBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        MgmtUserModifyCancelBtn = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel2.setText("관리자 추가");

        jLabel3.setText("이름 :");

        jLabel4.setText("아이디 :");

        jLabel5.setText("비밀번호 :");

        jLabel6.setText("비밀번호 확인 :");

        AddUserOkBtn.setText("확인");
        AddUserOkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserOkBtnActionPerformed(evt);
            }
        });

        AddUserCancelBtn.setText("취소");
        AddUserCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MgmtAddUserDlgLayout = new javax.swing.GroupLayout(MgmtAddUserDlg.getContentPane());
        MgmtAddUserDlg.getContentPane().setLayout(MgmtAddUserDlgLayout);
        MgmtAddUserDlgLayout.setHorizontalGroup(
            MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MgmtAddUserDlgLayout.createSequentialGroup()
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MgmtAddUserDlgLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddUserIdField)
                            .addComponent(AddUserPwField)
                            .addComponent(AddUserVerifyPwField)
                            .addComponent(AddUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MgmtAddUserDlgLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2))
                    .addGroup(MgmtAddUserDlgLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(AddUserOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(AddUserCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        MgmtAddUserDlgLayout.setVerticalGroup(
            MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MgmtAddUserDlgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AddUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AddUserPwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AddUserVerifyPwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(MgmtAddUserDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUserOkBtn)
                    .addComponent(AddUserCancelBtn))
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel1.setText("사용자 관리");

        MgmtAddUserBtn.setText("관리자 추가");
        MgmtAddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtAddUserBtnActionPerformed(evt);
            }
        });

        MgmtDeleteUserBtn.setText("관리자 삭제");
        MgmtDeleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtDeleteUserBtnActionPerformed(evt);
            }
        });

        MgmtUserModifyOkBtn.setText("확인");
        MgmtUserModifyOkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtUserModifyOkBtnActionPerformed(evt);
            }
        });

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "아이디", "비밀번호"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setResizable(false);
            UserTable.getColumnModel().getColumn(1).setResizable(false);
            UserTable.getColumnModel().getColumn(2).setResizable(false);
        }

        MgmtUserModifyCancelBtn.setText("취소");
        MgmtUserModifyCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtUserModifyCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MgmtAddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MgmtUserModifyOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MgmtUserModifyCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MgmtDeleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MgmtAddUserBtn)
                    .addComponent(MgmtDeleteUserBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MgmtUserModifyOkBtn)
                    .addComponent(MgmtUserModifyCancelBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MgmtAddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtAddUserBtnActionPerformed
        // TODO add your handling code here:
        MgmtAddUserDlg.setVisible(true);
        MgmtAddUserDlg.setLocationRelativeTo(this);
        MgmtAddUserDlg.setSize(400, 450);
    }//GEN-LAST:event_MgmtAddUserBtnActionPerformed

    private void MgmtDeleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtDeleteUserBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.removeRow(UserTable.getSelectedRow());
    }//GEN-LAST:event_MgmtDeleteUserBtnActionPerformed

    private void AddUserOkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserOkBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        String name = AddUserNameField.getText();
        String id = AddUserIdField.getText();
        String pw = AddUserPwField.getText();
        String vpw = AddUserVerifyPwField.getText();
        if (name.equals("") || id.equals("") || pw.equals("") || vpw.equals("")) {
            JOptionPane.showMessageDialog(null, "빈 항목이 있습니다.");
        } else {
            if (!isDuplicateId(id) && pw.equals(vpw)) {
                model.addRow(new Object[] {name, id, pw});
                JOptionPane.showMessageDialog(null, "추가 완료");
                MgmtAddUserDlg.dispose();
            } else if (id.equals("admin") || isDuplicateId(id)){
                JOptionPane.showMessageDialog(null, "사용할 수 없는 아이디 입니다.");
            } else {
                JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
            }
        }
    }//GEN-LAST:event_AddUserOkBtnActionPerformed

    private void AddUserCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserCancelBtnActionPerformed
        // TODO add your handling code here:
        MgmtAddUserDlg.dispose();
    }//GEN-LAST:event_AddUserCancelBtnActionPerformed

    private void MgmtUserModifyOkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtUserModifyOkBtnActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "변경사항을 저장하시겠습니까?", "", JOptionPane.YES_NO_OPTION) == 0) {
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            new ModifyUserList(model);
            dispose();
        }
    }//GEN-LAST:event_MgmtUserModifyOkBtnActionPerformed

    private void MgmtUserModifyCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtUserModifyCancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_MgmtUserModifyCancelBtnActionPerformed
    
    private boolean isDuplicateId(String id) {
        if (!id.equals("admin")) {
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).equals(id))
                    return true;
            }
            return false;
        } else
            return true;
    }
    
    private void loadUserData() {
        ArrayList<UserInfo> userInfo = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        FileMgmt fileMgmt = new FileMgmt();
        try {
            fileMgmt.readFileData("C:\\DB\\UserList.txt");
            fileMgmt.splitFileData();
            userInfo = fileMgmt.returnUserInfo();
        } catch (IOException ex) {
            Logger.getLogger(MgmtUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < userInfo.size(); i++) {
            model.addRow(new Object[]{
                userInfo.get(i).getName(), 
                userInfo.get(i).getId(), 
                userInfo.get(i).getPw()});
        }
    }
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
            java.util.logging.Logger.getLogger(MgmtUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MgmtUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MgmtUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MgmtUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgmtUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserCancelBtn;
    private javax.swing.JTextField AddUserIdField;
    private javax.swing.JTextField AddUserNameField;
    private javax.swing.JButton AddUserOkBtn;
    private javax.swing.JPasswordField AddUserPwField;
    private javax.swing.JPasswordField AddUserVerifyPwField;
    private javax.swing.JButton MgmtAddUserBtn;
    private javax.swing.JDialog MgmtAddUserDlg;
    private javax.swing.JButton MgmtDeleteUserBtn;
    private javax.swing.JButton MgmtUserModifyCancelBtn;
    private javax.swing.JButton MgmtUserModifyOkBtn;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
