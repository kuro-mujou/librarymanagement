package UIClass;

import javax.swing.JPanel;

public class SettingPanel extends JPanel
{
    MainInterface main;

    public SettingPanel(MainInterface main)
    {
        this.main = main;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combobox1 = new swing.Combobox();
        buttonver21 = new swing.Buttonver2();

        setOpaque(false);

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Comingsoon..." }));
        combobox1.setFocusable(false);
        combobox1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        combobox1.setRequestFocusEnabled(false);
        combobox1.setVerifyInputWhenFocusTarget(false);

        buttonver21.setText("Terms Of Use");
        buttonver21.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonver21, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(buttonver21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Buttonver2 buttonver21;
    private swing.Combobox combobox1;
    // End of variables declaration//GEN-END:variables
}
