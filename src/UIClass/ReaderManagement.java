package UIClass;

import UIComponent.ReaderDetail;
import databaseClass.DocGiaCRUD;
import databaseClass.DocGia;
import databaseClass.transactionsCRUD;
import event.TableActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import swing.TableActionCellEditor;

public class ReaderManagement extends javax.swing.JPanel
{
    private DocGiaCRUD docgiaDAO = new DocGiaCRUD();
    private transactionsCRUD transCRUD = new transactionsCRUD();
    private int idUser = -1;

    public ReaderManagement()
    {
        initComponents();
        fillDataTable();
        init();
    }

    private void init()
    {
        TableActionEvent event = new TableActionEvent()
        {
            @Override
            public void onEdit(int row)
            {
                ReaderDetail readerDetail = new ReaderDetail(true, false, ReaderManagement.this);
                idUser = (Integer) Table.getValueAt(row, 0);
                DocGia docGia = docgiaDAO.findReaderByReaderId(idUser);
                if (docGia != null)
                {
                    readerDetail.setModel(docGia);
                    readerDetail.setVisible(true);
                } else
                {
                    JOptionPane.showMessageDialog(null, "khong tim duoc gia tri can tim");
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
                idUser = (Integer) Table.getValueAt(row, 0);
                int status = transCRUD.getTransactionsStatus(idUser);

                switch (status)
                {
                    case 0:
                        docgiaDAO.delete(idUser);
                        model.removeRow(row);
                        break;
                    case 1:
                        if(JOptionPane.showConfirmDialog(null, "delete this reader will delete all relative transactions, confirm to delete?") == 0)
                        {    
                            docgiaDAO.delete(idUser);
                            transCRUD.deleteTransactionsByReaderID(idUser);
                            model.removeRow(row);
                        } 
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "this reader aren't returning all books, can't delete");
                        break;
                }
            }

            @Override
            public void onView(int row)
            {
                ReaderDetail readerDetail = new ReaderDetail(false, false, ReaderManagement.this);
                idUser = (Integer) Table.getValueAt(row, 0);
                DocGia docGia = docgiaDAO.findReaderByReaderId(idUser);
                if (docGia != null)
                {
                    readerDetail.setModel(docGia);
                    checkStatus(idUser);
                    readerDetail.setVisible(true);
                } else
                {
                    JOptionPane.showMessageDialog(null, "khong tim duoc gia tri can tim");
                }
            }
        };
        Table.getColumnModel().getColumn(Table.getColumnModel().getColumnCount() - 1).setCellEditor(new TableActionCellEditor(event, Table.getColorSelection()));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        AddTableItem = new swing.Button();
        SearchTable = new swing.Button();
        textFind = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new swing.TableWhite();

        setOpaque(false);

        AddTableItem.setText("ADD NEW READER");
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

        textFind.setLabelText("Search by Reader ID");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SearchIcon.png"))); // NOI18N

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Ten", "Dien Thoai", "Dia Chi", "Email", "Gioi Tinh", "Tuoi", "Status", "Menu"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, true
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
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddTableItem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
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

    public void checkStatus(int id)
    {
        try
        {
            int status = transCRUD.getTransactionsStatus(id);
            docgiaDAO.updateTransactionStatus(id, status);
        } catch (Exception e)
        {
        }
    }

    public void fillDataTable()
    {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        for (DocGia b : docgiaDAO.getAll())
        {
            Object dataRow[] = new Object[8];
            dataRow[0] = b.getUserID();
            dataRow[1] = b.getName();
            dataRow[2] = b.getPhone();
            dataRow[3] = b.getAdrress();
            dataRow[4] = b.getEmail();
            dataRow[5] = b.getGender();
            dataRow[6] = b.getAge();
            dataRow[7] = b.ENUM_TO_STRING(b.getStatus());
            tbModel.addRow(dataRow);
        }
    }

    public void fillOneDataTable(DocGia b)
    {
        DefaultTableModel tbModel = (DefaultTableModel) Table.getModel();
        tbModel.setRowCount(0);
        Object dataRow[] = new Object[8];
        dataRow[0] = b.getUserID();
        dataRow[1] = b.getName();
        dataRow[2] = b.getPhone();
        dataRow[3] = b.getAdrress();
        dataRow[4] = b.getEmail();
        dataRow[5] = b.getGender();
        dataRow[6] = b.getAge();
        dataRow[7] = b.ENUM_TO_STRING(b.getStatus());
        tbModel.addRow(dataRow);
    }

    public void resetDataTable()
    {
        DefaultTableModel dm = (DefaultTableModel) Table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }
    private void AddTableItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddTableItemActionPerformed
    {//GEN-HEADEREND:event_AddTableItemActionPerformed
        ReaderDetail readerDetail = new ReaderDetail(true, true, this);
        readerDetail.setVisible(true);
    }//GEN-LAST:event_AddTableItemActionPerformed

    private void SearchTableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchTableActionPerformed
    {//GEN-HEADEREND:event_SearchTableActionPerformed
        try
        {
            idUser = Integer.parseInt(textFind.getText());
            DocGia docGia = docgiaDAO.findReaderByReaderId(idUser);
            if (docGia != null)
            {
                resetDataTable();
                fillOneDataTable(docGia);
            } else
            {
                JOptionPane.showMessageDialog(null, "khong tim duoc gia tri can tim");
                resetDataTable();
                fillDataTable();
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "vui long nhap reader ID");
        }
    }//GEN-LAST:event_SearchTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button AddTableItem;
    private swing.Button SearchTable;
    private swing.TableWhite Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.TextField textFind;
    // End of variables declaration//GEN-END:variables
}
