package UIClass;

import databaseClass.NhanVien;
import databaseClass.NhanVienCRUD;
import javax.swing.JPanel;

public class MainPanel extends JPanel
{
    MainInterface main;

    public MainPanel(MainInterface m)
    {
        main = m;
        initComponents();

    }

    private void initcustom()
    {
        main.getBackButton().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new swing.Button();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 23)); // NOI18N
        jLabel1.setText("Version Beta");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 40)); // NOI18N
        jLabel2.setText("Library Management");

        loginBtn.setBackground(new java.awt.Color(0, 0, 0));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setColor(new java.awt.Color(0, 0, 0));
        loginBtn.setColorClick(new java.awt.Color(94, 94, 94));
        loginBtn.setColorOver(new java.awt.Color(128, 128, 128));
        loginBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        NhanVienCRUD nhanVienCRUD = new NhanVienCRUD();
        NhanVien nhanVien = nhanVienCRUD.findUser();
        LoginPanel login = new LoginPanel(main,nhanVien);
        JPanel p = main.getPanel();
        p.removeAll();
        p.add(login);
        main.LoadChange();

        p.validate();
        p.repaint();

    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.Button loginBtn;
    // End of variables declaration//GEN-END:variables

}
