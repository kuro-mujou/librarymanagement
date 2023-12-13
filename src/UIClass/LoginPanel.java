package UIClass;

import databaseClass.NhanVien;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginPanel extends JPanel
{
    MainInterface main;
    NhanVien nhanvien = new NhanVien();
    
    public LoginPanel(MainInterface m,NhanVien nhanvien)
    {
        initComponents();
        this.nhanvien = nhanvien;
        main = m;
    }
    private void login()
    {
        String userID =UsernameTXT.getText();
        String password = String.valueOf(PasswordTXT.getPassword());
        String email = nhanvien.getEmail();
        String pass = nhanvien.getPassword();
        if(userID.equals(email))
        {
            if(password.equals(pass))
            {
                JOptionPane.showMessageDialog(null, "login successful");
                main.dispose();
                MainDashboard mainDashboard = new MainDashboard();
                mainDashboard.setVisible(true);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "wrong password");
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "user not found");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        UsernameTXT = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PasswordTXT = new swing.PasswordField();
        loginBtn = new swing.Button();

        setOpaque(false);

        UsernameTXT.setLabelText("username@gmail.com");

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        PasswordTXT.setLabelText("password");
        PasswordTXT.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                PasswordTXTKeyPressed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setColor(new java.awt.Color(0, 0, 0));
        loginBtn.setColorClick(new java.awt.Color(94, 94, 94));
        loginBtn.setColorOver(new java.awt.Color(128, 128, 128));
        loginBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                loginBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        login();
//        MainDashboard mainDashboard = new MainDashboard();
//        mainDashboard.setVisible(true);
    }//GEN-LAST:event_loginBtnMouseClicked

    private void PasswordTXTKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_PasswordTXTKeyPressed
    {//GEN-HEADEREND:event_PasswordTXTKeyPressed
        try {
            int keycode = evt.getKeyCode();
            if(keycode == KeyEvent.VK_ENTER)
            {
                login();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PasswordTXTKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PasswordField PasswordTXT;
    private swing.TextField UsernameTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.Button loginBtn;
    // End of variables declaration//GEN-END:variables
}
