
package UIComponent;

import UIModel.ModelMenu;
import event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Menu extends javax.swing.JPanel
{
    private EventMenuSelected event;
    
    public void addEventMenuSelect(EventMenuSelected event){
        this.event = event;
        listMenu1.addEventMenuSelect(event);
    }
    public Menu()
    {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    private void init()
    {
        listMenu1.addItem(new ModelMenu("","Menu",ModelMenu.MenuType.TITLE));
        listMenu1.addItem(new ModelMenu("1","Book Management",ModelMenu.MenuType.MENU));
        listMenu1.addItem(new ModelMenu("2","Reader Management",ModelMenu.MenuType.MENU));
        listMenu1.addItem(new ModelMenu("3","New Transaction",ModelMenu.MenuType.MENU));
        listMenu1.addItem(new ModelMenu("4","Transaction History",ModelMenu.MenuType.MENU));
        listMenu1.addItem(new ModelMenu("","Option",ModelMenu.MenuType.TITLE));
        listMenu1.addItem(new ModelMenu("5","Setting",ModelMenu.MenuType.MENU));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        listMenu1 = new swing.ListMenu<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0,0,Color.decode("#F2994A"),0,getHeight(),Color.decode("#F2C94C"));
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(),getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(g); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
