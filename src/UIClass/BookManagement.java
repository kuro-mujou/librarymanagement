package UIClass;

import UIComponent.BookDetail;
import event.TableActionEvent;
import javax.swing.table.DefaultTableModel;
import swing.TableActionCellEditor;
import databaseClass.Sach;
import databaseClass.SachCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class BookManagement extends javax.swing.JPanel
{
    private SachCRUD sachDAO = new SachCRUD();
    private int idSach = -1;

    public BookManagement()
    {
        initComponents();
        init();
        fillDataTable();
    }

    private void init()
    {
        TableActionEvent event = new TableActionEvent()
        {
            @Override
            public void onEdit(int row)
            {
                BookDetail update = new BookDetail(true, BookManagement.this);
                idSach = (Integer) Table.getValueAt(row, 0);
                Sach sach = sachDAO.findSachById(idSach);
                if (sach != null)
                {
                    update.setModel(sach);
                    resetDataTable();
                    fillDataTable();
                    update.setVisible(true);
                } else
                {
                    JOptionPane.showMessageDialog(Table, "khong co sach nay trong database");
                }
            }

            @Override
            public void onDelete(int row)
            {
                if (Table.isEditing())
                {
                    Table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                idSach = (Integer) Table.getValueAt(row, 0);;
                if (sachDAO.delete(idSach) > 0)
                {
                    model.removeRow(row);
                }
            }

            @Override
            public void onView(int row)
            {
                BookDetail a = new BookDetail(false, BookManagement.this);
                idSach = (Integer) Table.getValueAt(row, 0);
                Sach sach = sachDAO.findSachById(idSach);
                if (sach != null)
                {
                    a.setModel(sach);
                    a.setVisible(true);
                } else
                {
                    JOptionPane.showMessageDialog(Table, "khong tim duoc gia tri can tim");
                }
            }
        };
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellEditor(new TableActionCellEditor(event, Table.getColorSelection()));
        Table.fixTable(jScrollPane1);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        AddTableItem = new swing.Button();
        SearchTable = new swing.Button();
        textFind = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new swing.TableWhite();

        setOpaque(false);

        AddTableItem.setText("ADD NEW BOOK");
        AddTableItem.setColor(new java.awt.Color(255, 204, 0));
        AddTableItem.setRadius(15);
        AddTableItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddTableItemActionPerformed(evt);
            }
        });

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

        textFind.setLabelText("Search");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Ten Sach", "Tac Gia", "So Luong", "The Loai", "Nam XB", "Mo Ta", "Menu"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setRowHeight(45);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFind, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void fillDataTable()
    {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        for (Sach b : sachDAO.getAll())
        {
            Object dataRow[] = new Object[7];
            dataRow[0] = b.getBookID();
            dataRow[1] = b.getNameBook();
            dataRow[2] = b.getWriting();
            dataRow[3] = b.getQuantity();
            dataRow[4] = b.getType();
            dataRow[5] = b.getYearRelease();
            dataRow[6] = b.getDescription();
            tbModel.addRow(dataRow);
        }
    }

    public void fillOneDataTable(Sach b)
    {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        Object dataRow[] = new Object[7];
        dataRow[0] = b.getBookID();
        dataRow[1] = b.getNameBook();
        dataRow[2] = b.getWriting();
        dataRow[3] = b.getQuantity();
        dataRow[4] = b.getType();
        dataRow[5] = b.getYearRelease();
        dataRow[6] = b.getDescription();
        tbModel.addRow(dataRow);
    }

    public void resetDataTable()
    {
        DefaultTableModel dm = (DefaultTableModel) Table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        idSach = Integer.parseInt(textFind.getText());
        Sach sach = sachDAO.findSachById(idSach);
        if (sach != null)
        {
            resetDataTable();
            fillOneDataTable(sach);
        } else
        {
            JOptionPane.showMessageDialog(Table, "khong tim duoc gia tri can tim");
        }
    }//GEN-LAST:event_SearchTableActionPerformed

    private void AddTableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTableItemActionPerformed
        BookDetail addbook = new BookDetail(true, this);
        addbook.setVisible(true);
    }//GEN-LAST:event_AddTableItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddTableItem;
    private swing.Button SearchTable;
    private swing.TableWhite Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField textFind;
    // End of variables declaration//GEN-END:variables
}
