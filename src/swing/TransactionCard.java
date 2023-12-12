package swing;

import UIClass.ReaderManagement;
import UIClass.TransactionHistory;
import databaseClass.Sach;
import databaseClass.SachCRUD;
import databaseClass.transactions;
import databaseClass.transactionsCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TransactionCard extends javax.swing.JPanel
{
    private transactions trans;
    private transactionsCRUD transCRUD;
    private SachCRUD sachCRUD;
    private boolean isEditRequest;

    TransactionHistory transactionManagement = new TransactionHistory();
    ReaderManagement readerManagement = new ReaderManagement();

    public TransactionCard(transactions trans, boolean isEditRequest)
    {
        sachCRUD = new SachCRUD();
        transCRUD = new transactionsCRUD();
        initComponents();
        this.trans = trans;
        this.isEditRequest = isEditRequest;
        init();
        initUI();
        statusCombobx.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                transCRUD.updateTransactionStatus(trans.getTransactionID(), statusCombobx.getSelectedItem().toString());
                transactionManagement.checkTransactionStatus();
                readerManagement.checkStatus(trans.getReaderID());
            }
        });
    }

    private void init()
    {
        Sach sach = sachCRUD.findSachById(trans.getBookID());
        textTransactionID.setText(String.valueOf(trans.getTransactionID()));
        textTenSach.setText(sach.getNameBook());
        textBorrowDay.setText(trans.getStartDay());
        textReturnDay.setText(trans.getEndDay());
        textSoLuong.setText(String.valueOf(trans.getQuantity()));
        statusCombobx.setSelectedIndex(STATUS_TO_INT(trans.getTransactionstatus()));
    }

    private void initUI()
    {
        textTenSach.setEditable(isEditRequest);
        textSoLuong.setEditable(isEditRequest);
        statusCombobx.setEditable(isEditRequest);
        statusCombobx.setEnabled(isEditRequest);
        confirmbutton.setVisible(isEditRequest);
        revalidate();
        repaint();
    }

    public int STATUS_TO_INT(String status)
    {
        return switch (status)
        {
            case "RETURNED" ->
                0;
            case "BORROWING" ->
                1;
            case "NOT RETURNED" ->
                2;
            default ->
                -1;
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        background1 = new swing.Background();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        statusCombobx = new swing.ComboBoxSuggestion();
        textReturnDay = new javax.swing.JTextField();
        textBorrowDay = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        textTransactionID = new javax.swing.JTextField();
        confirmbutton = new swing.Button();
        textTenSach = new swing.TextField_noLabel();
        textSoLuong = new swing.TextField_noLabel();

        setBackground(new java.awt.Color(255, 204, 102));

        background1.setRound(25);

        jLabel23.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel23.setText("Status");

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel19.setText("Book Title");

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel20.setText("Quantity");

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel18.setText("Borrow day");

        jLabel24.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel24.setText("Return day");

        statusCombobx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RETURNED", "BORROWING", "NOT RETURNED" }));

        textReturnDay.setEditable(false);
        textReturnDay.setBorder(null);

        textBorrowDay.setEditable(false);
        textBorrowDay.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel21.setText("ID");

        textTransactionID.setEditable(false);
        textTransactionID.setBorder(null);

        confirmbutton.setText("Confirm");
        confirmbutton.setColor(new java.awt.Color(255, 204, 0));
        confirmbutton.setRadius(15);
        confirmbutton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confirmbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textReturnDay)
                            .addComponent(textBorrowDay)
                            .addComponent(statusCombobx, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(textTransactionID)
                            .addComponent(textTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTransactionID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBorrowDay)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textReturnDay)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusCombobx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmbuttonActionPerformed
    {//GEN-HEADEREND:event_confirmbuttonActionPerformed

        try
        {
            Sach oldSach = sachCRUD.findSachById(trans.getBookID());
            Sach newSach = sachCRUD.findSachByName(textTenSach.getText());
            int oldbookID = trans.getBookID();
            int newbookID = newSach.getBookID();
            int oldquantity = trans.getQuantity();
            int newquantity = Integer.parseInt(textSoLuong.getText());
            if (oldbookID != newbookID)
            {
                sachCRUD.UpdateQuantity(oldbookID, oldquantity + oldSach.getQuantity());
                sachCRUD.UpdateQuantity(newbookID, newSach.getQuantity() - newquantity);
                transCRUD.updateTransactionDetail(trans.getTransactionID(), newbookID, newquantity);
            } else
            {
                if (oldquantity != newquantity)
                {
                    sachCRUD.UpdateQuantity(oldbookID, oldquantity + oldSach.getQuantity() - newquantity);
                    transCRUD.updateTransactionDetail(trans.getTransactionID(), oldbookID, newquantity);
                }
            }
            

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "wrong input");
        }
    }//GEN-LAST:event_confirmbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Background background1;
    private swing.Button confirmbutton;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private swing.ComboBoxSuggestion statusCombobx;
    private javax.swing.JTextField textBorrowDay;
    private javax.swing.JTextField textReturnDay;
    private swing.TextField_noLabel textSoLuong;
    private swing.TextField_noLabel textTenSach;
    private javax.swing.JTextField textTransactionID;
    // End of variables declaration//GEN-END:variables
}
