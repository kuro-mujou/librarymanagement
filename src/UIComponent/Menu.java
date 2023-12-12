
package UIComponent;

import UIModel.ModelMenu;
import event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

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
        jPanel1 = new javax.swing.JPanel();
        pictureBox1 = new swing.PictureBox();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Image/StackOfBooksIcon.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Library Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private int x;
    private int y;
    public void initMoveFrame(JFrame frame)
    {
        jPanel1.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
            }
        });
        jPanel1.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e)
            {
                frame.setLocation(e.getXOnScreen()-x, e.getYOnScreen()-y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private swing.ListMenu<String> listMenu1;
    private swing.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
