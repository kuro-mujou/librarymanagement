
package UIClass;

import UIComponent.UserEmailChange;
import UIComponent.UserPasswordChange;
import databaseClass.NhanVien;
import databaseClass.NhanVienCRUD;

public class Setting extends javax.swing.JPanel
{
    private MainDashboard main;
    NhanVienCRUD nhanVienCRUD = new NhanVienCRUD();
    NhanVien nhanVien = nhanVienCRUD.findUser();
    public Setting(MainDashboard mainDashboard)
    {
        initComponents();
        this.main = mainDashboard;
        initData();
        initUI(false);
    }
    public void updateUI(boolean req)
    {
        UpdateInfoBtn.setEnabled(req);
        ChangeEmailBtn.setEnabled(req);
        ChangePasswordBtn.setEnabled(req);
        LogoutButton.setEnabled(req);
        revalidate();
        repaint();
    }
    private void initData()
    {
        txtUserAddress.setText(nhanVien.getDiaChi());
        txtUserGender.setText(nhanVien.getGioiTinh());
        txtUserID.setText(String.valueOf(nhanVien.getMaNhanVien()));
        txtUserName.setText(nhanVien.getTen());
        txtUserPhone.setText(nhanVien.getSoDienThoai());
        txtUserID.setEditable(false);
    }
    private void initUI(boolean request)
    {
        txtUserAddress.setEditable(request);
        txtUserGender.setEditable(request);
        txtUserName.setEditable(request);
        txtUserPhone.setEditable(request);
        Confirm.setVisible(request);
        Cancel.setVisible(request);
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        LogoutButton = new swing.Button();
        jLabel6 = new javax.swing.JLabel();
        txtUserGender = new swing.TextField_noLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new swing.TextField_noLabel();
        txtUserID = new swing.TextField_noLabel();
        txtUserAddress = new swing.TextField_noLabel();
        txtUserPhone = new swing.TextField_noLabel();
        jLabel4 = new javax.swing.JLabel();
        ChangePasswordBtn = new swing.Button();
        UpdateInfoBtn = new swing.Button();
        Confirm = new swing.Button();
        Cancel = new swing.Button();
        ChangeEmailBtn = new swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        LogoutButton.setText("Log out");
        LogoutButton.setColor(new java.awt.Color(255, 204, 0));
        LogoutButton.setRadius(15);
        LogoutButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LogoutButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("User Name");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel7.setText("Phone");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Address");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER INFORMATION");

        ChangePasswordBtn.setText("Change Password");
        ChangePasswordBtn.setColor(new java.awt.Color(255, 204, 0));
        ChangePasswordBtn.setRadius(15);
        ChangePasswordBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ChangePasswordBtnActionPerformed(evt);
            }
        });

        UpdateInfoBtn.setText("Update Info");
        UpdateInfoBtn.setColor(new java.awt.Color(255, 204, 0));
        UpdateInfoBtn.setRadius(15);
        UpdateInfoBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateInfoBtnActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm");
        Confirm.setColor(new java.awt.Color(255, 204, 0));
        Confirm.setRadius(15);
        Confirm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConfirmActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.setColor(new java.awt.Color(255, 204, 0));
        Cancel.setRadius(15);
        Cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CancelActionPerformed(evt);
            }
        });

        ChangeEmailBtn.setText("Change Email");
        ChangeEmailBtn.setColor(new java.awt.Color(255, 204, 0));
        ChangeEmailBtn.setRadius(15);
        ChangeEmailBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ChangeEmailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUserGender, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(UpdateInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangeEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUserGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_LogoutButtonActionPerformed
    {//GEN-HEADEREND:event_LogoutButtonActionPerformed
        main.dispose();
        new MainInterface().setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ChangePasswordBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChangePasswordBtnActionPerformed
    {//GEN-HEADEREND:event_ChangePasswordBtnActionPerformed
        UserPasswordChange userpasschange = new UserPasswordChange(nhanVien,this);
        userpasschange.setVisible(true);
        updateUI(false);
    }//GEN-LAST:event_ChangePasswordBtnActionPerformed

    private void UpdateInfoBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateInfoBtnActionPerformed
    {//GEN-HEADEREND:event_UpdateInfoBtnActionPerformed
        initUI(true);
        updateUI(false);
    }//GEN-LAST:event_UpdateInfoBtnActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmActionPerformed
    {//GEN-HEADEREND:event_ConfirmActionPerformed
        nhanVien.setDiaChi(txtUserAddress.getText());
        nhanVien.setGioiTinh(txtUserGender.getText());
        nhanVien.setMaNhanVien(Integer.parseInt(txtUserID.getText()));
        nhanVien.setTen(txtUserName.getText());
        nhanVien.setSoDienThoai(txtUserPhone.getText());
        nhanVienCRUD.updateBasicInfo(nhanVien);
        initUI(false);
        updateUI(true);
    }//GEN-LAST:event_ConfirmActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CancelActionPerformed
    {//GEN-HEADEREND:event_CancelActionPerformed
        initUI(false);
        updateUI(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void ChangeEmailBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChangeEmailBtnActionPerformed
    {//GEN-HEADEREND:event_ChangeEmailBtnActionPerformed
        UserEmailChange emailChange = new UserEmailChange(nhanVien,this);
        emailChange.setVisible(true);
        updateUI(false);
    }//GEN-LAST:event_ChangeEmailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button Cancel;
    private swing.Button ChangeEmailBtn;
    private swing.Button ChangePasswordBtn;
    private swing.Button Confirm;
    private swing.Button LogoutButton;
    private swing.Button UpdateInfoBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private swing.TextField_noLabel txtUserAddress;
    private swing.TextField_noLabel txtUserGender;
    private swing.TextField_noLabel txtUserID;
    private swing.TextField_noLabel txtUserName;
    private swing.TextField_noLabel txtUserPhone;
    // End of variables declaration//GEN-END:variables
}
