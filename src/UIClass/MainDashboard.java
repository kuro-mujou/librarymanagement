package UIClass;

import event.EventMenuSelected;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class MainDashboard extends javax.swing.JFrame
{
    ReaderManagement readerManagement = new ReaderManagement();
    BookManagement bookManagement = new BookManagement();
    TransactionHistory transactionManagement = new TransactionHistory();
    Setting setting = new Setting(this);

    public MainDashboard()
    {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        init();
    }

    private void init()
    {
        ImageIcon icon = new ImageIcon("src/Image/StackOfBooksIcon.png");
        setIconImage(icon.getImage());
        winButton1.initEvent(this, background1);
        Menu.addEventMenuSelect(new EventMenuSelected()
        {
            @Override
            public void selected(int index)
            {
                switch (index)
                {
                    case 1:
                        updatePanel(bookManagement);
                        bookManagement.resetDataTable();
                        bookManagement.fillDataTable();
                        break;
                    case 2:
                        updatePanel(readerManagement);
                        readerManagement.resetDataTable();
                        readerManagement.fillDataTable();
                        readerManagement.checkStatus();
                        break;
                    case 3:
                        Transaction transaction = new Transaction();
                        updatePanel(transaction);
                        break;
                    case 4:
                        updatePanel(transactionManagement);
                        transactionManagement.resetDataTable();
                        transactionManagement.fillDataTable();
                        break;
                    case 6:
                        updatePanel(setting);
                        setting.updateUI(true);
                        break;
                    default:
                        updatePanel(bookManagement);
                }
            }

        });
    }

    private void updatePanel(JComponent com)
    {
        MainPanel.removeAll();
        MainPanel.add(com);
        MainPanel.validate();
        MainPanel.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        background1 = new swing.Background();
        Menu = new UIComponent.Menu();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        winButton1 = new win_button.WinButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background1.setRound(15);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(new java.awt.BorderLayout());

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setOpaque(false);

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 1032, Short.MAX_VALUE)
                .addComponent(winButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(winButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private UIComponent.Menu Menu;
    private swing.Background background1;
    private win_button.WinButton winButton1;
    // End of variables declaration//GEN-END:variables
}
