package win_button;

import swing.Background;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class WinButton extends javax.swing.JPanel {
    
    
    public WinButton() {
        initComponents();
        setOpaque(false);
        
    }

    public void initEvent(JFrame frame, Background panel) {
        cmdClose.addActionListener((ActionEvent ae) ->
        {
            System.exit(0);
        });
        cmdMi.addActionListener((ActionEvent ae) ->
        {
            frame.setState(JFrame.ICONIFIED);
        });
        cmdRe.addActionListener((ActionEvent ae) ->
        {
            if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                panel.setRound(20);
                frame.setExtendedState(JFrame.NORMAL);
            } else {
                panel.setRound(0);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cmdMi = new win_button.Button();
        cmdRe = new win_button.Button();
        cmdClose = new win_button.Button();

        cmdMi.setBackground(new java.awt.Color(227, 226, 68));

        cmdRe.setBackground(new java.awt.Color(67, 199, 51));

        cmdClose.setBackground(new java.awt.Color(240, 61, 61));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private win_button.Button cmdClose;
    private win_button.Button cmdMi;
    private win_button.Button cmdRe;
    // End of variables declaration//GEN-END:variables
}
