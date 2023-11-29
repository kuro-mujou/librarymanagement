package swing;

import UIModel.ModelMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel
{
    private boolean selected;
    private boolean over;

    public MenuItem(ModelMenu data)
    {
        initComponents();
        setOpaque(false);
        if (data.getType() == ModelMenu.MenuType.MENU)
        {
            lbIcon.setImage(data.toIcon());
            lbName.setText(data.getName());
        } else if (data.getType() == ModelMenu.MenuType.TITLE)
        {
            lbIcon.setVisible(false);
            lbName.setFont(new Font("sansserif", 1, 12));
            lbName.setText(data.getName());
        } else
        {
            lbName.setText(" ");
        }
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
        repaint();
    }

    public void setOver(boolean over)
    {
        this.over = over;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lbName = new javax.swing.JLabel();
        lbIcon = new swing.PictureBox();

        lbName.setText("ITEM NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics g)
    {
        if (selected || over)
        {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected)
            {
                g2.setColor(new Color(255, 255, 255, 80));
            } else
            {
                g2.setColor(new Color(255, 255, 255, 40));
            }
            g2.fillRoundRect(10, 5, getWidth() - 20, getHeight() - 10, 5, 5);
        }
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PictureBox lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
