package UIClass;

import databaseClass.DocGia;
import databaseClass.DocGiaCRUD;
import databaseClass.transactions;
import databaseClass.transactionsCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class TransactionHistory extends javax.swing.JPanel {

    private transactionsCRUD transactionCRUD = new transactionsCRUD();
    private DocGiaCRUD readerCRUD = new DocGiaCRUD();
    public TransactionHistory() {

        initComponents();
        init();
        resetDataTable();
        fillDataTable();
    }

    private void init() 
    {
        Table.fixTable(jScrollPane2);
        JTableHeader header = Table.getTableHeader();
        header.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int columnIndex = header.columnAtPoint(e.getPoint());
                if (columnIndex != Table.getColumnModel().getColumnCount() - 1)
                {
                    sort(columnIndex);
                }
            }
        });
    }
    public void checkTransactionStatus()
    {
        for (transactions b : transactionCRUD.getTransactionsByStatus("BORROWING"))
        {
            if (b != null)
            {
                LocalDate now = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate endDate = LocalDate.parse(b.getEndDay(), formatter);
                if (now.compareTo(endDate) > 0)
                {
                    transactionCRUD.updateTransactionStatus(b.getTransactionID(),"NOT RETURNED");
                    readerCRUD.updateTransactionStatus(b.getReaderID(), 3);
                }
                else
                {
                    readerCRUD.updateTransactionStatus(b.getReaderID(), 2);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        SearchTable = new swing.Button();
        val_searchTrans = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new swing.TableWhite();

        setOpaque(false);

        SearchTable.setText("Search");
        SearchTable.setColor(new java.awt.Color(255, 204, 0));
        SearchTable.setRadius(15);
        SearchTable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchTableActionPerformed(evt);
            }
        });

        val_searchTrans.setLabelText("Search");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Start Day", "End Day", "Quantity", "Book ID", "User ID", "Status"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setIsTransactionHistory(true);
        Table.setRowHeight(45);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(val_searchTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(val_searchTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void sort(int columnIndex)
    {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Object[][] data = new Object[model.getRowCount()][model.getColumnCount()];

        for (int i = 0; i < model.getRowCount(); i++)
        {
            for (int j = 0; j < model.getColumnCount(); j++)
            {
                data[i][j] = model.getValueAt(i, j);
            }
        }
        Comparator<Object[]> comparator = Comparator.comparing(o -> o[columnIndex].toString());
        Arrays.sort(data, comparator);
        model.getDataVector().removeAllElements();
        model.setRowCount(0);
        for (Object[] row : data)
        {
            model.addRow(row);
        }
    }
    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        // TODO add your handling code here:
        
        transactionsCRUD trans = new transactionsCRUD();
        int id = Integer.parseInt(val_searchTrans.getText());
        transactions transac = trans.getTransactionsByID(id);
        
        resetDataTable();
        fillOneDataTable(transac);

    }//GEN-LAST:event_SearchTableActionPerformed

    public void resetDataTable() {
        DefaultTableModel dm = (DefaultTableModel) Table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    public void fillOneDataTable(transactions b) {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        DocGia docgia = readerCRUD.findReaderByReaderId(b.getReaderID());
        Object dataRow[] = new Object[7];
        dataRow[0] = b.getTransactionID();
        dataRow[1] = b.getStartDay();
        dataRow[2] = b.getEndDay();
        dataRow[3] = b.getQuantity();
        dataRow[4] = b.getBookID();
        dataRow[5] = b.getReaderID();
        dataRow[6] = b.getTransactionstatus();
        tbModel.addRow(dataRow);
    }

    public void fillDataTable() {
        transactionsCRUD trans = new transactionsCRUD();
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        for (transactions b : trans.getAllTransactions()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = b.getTransactionID();
            dataRow[1] = b.getStartDay();
            dataRow[2] = b.getEndDay();
            dataRow[3] = b.getQuantity();
            dataRow[4] = b.getBookID();
            dataRow[5] = b.getReaderID();
            dataRow[6] = b.getTransactionstatus();
            tbModel.addRow(dataRow);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button SearchTable;
    private swing.TableWhite Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.TextField val_searchTrans;
    // End of variables declaration//GEN-END:variables
}
