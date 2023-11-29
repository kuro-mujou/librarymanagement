package UIClass;

import databaseClass.DocGia;
import databaseClass.DocGiaCRUD;
import databaseClass.Sach;
import databaseClass.SachCRUD;
import databaseClass.transactions;
import databaseClass.transactionsCRUD;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Transaction extends javax.swing.JPanel
{

    private DocGiaCRUD readerCRUD = new DocGiaCRUD();
    private SachCRUD sachCRUD = new SachCRUD();
    private transactionsCRUD transCRUD = new transactionsCRUD();
    private Sach sach;
    private DocGia docgia;

    public Transaction()
    {
        initComponents();
        init();

    }

    private void init()
    {
        bookInfoPanel.setVisible(false);
        readerInfoPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        readerInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReadName = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        bookInfoPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SearchBookTXT = new swing.TextField_noLabel();
        SearchBookBtn = new swing.Button();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mess_err = new javax.swing.JLabel();
        textMaSach = new swing.TextField_noLabel();
        textTenSach = new swing.TextField_noLabel();
        textTheLoai = new swing.TextField_noLabel();
        textTacGia = new swing.TextField_noLabel();
        textSoLuong = new swing.TextField_noLabel();
        textNamXuatBan = new swing.TextField_noLabel();
        textGhiChu = new swing.TextField_noLabel();
        jLabel16 = new javax.swing.JLabel();
        Minus = new swing.Button();
        quantity = new javax.swing.JLabel();
        Plus = new swing.Button();
        jLabel17 = new javax.swing.JLabel();
        ConfirmBorrow = new swing.Button();
        LableNgayTra = new swing.TextField_noLabel();
        jLabel19 = new javax.swing.JLabel();
        IDtransactions = new swing.TextField_noLabel();
        jPanel1 = new javax.swing.JPanel();
        SearchReaderBtn = new swing.Button();
        SearchReaderTXT = new swing.TextField_noLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        readerInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Reader Name:");

        jLabel3.setText("Phone Number:");

        ReadName.setText("???");

        Phone.setText("???");
        Phone.setToolTipText("");

        jLabel6.setText("Status:");

        Status.setText("???");
        Status.setToolTipText("");

        javax.swing.GroupLayout readerInfoPanelLayout = new javax.swing.GroupLayout(readerInfoPanel);
        readerInfoPanel.setLayout(readerInfoPanelLayout);
        readerInfoPanelLayout.setHorizontalGroup(
            readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ReadName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        readerInfoPanelLayout.setVerticalGroup(
            readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReadName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Status))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Book name");

        SearchBookTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SearchBookBtn.setText("Search");
        SearchBookBtn.setColor(new java.awt.Color(255, 204, 0));
        SearchBookBtn.setRadius(15);
        SearchBookBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchBookBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel9.setText("Book ID");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel10.setText("Book Title");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel11.setText("Category");

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel12.setText("Author");

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel13.setText("Quantity");

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel14.setText("Publication year");

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel15.setText("Description");

        textMaSach.setEditable(false);

        textTenSach.setEditable(false);

        textTheLoai.setEditable(false);

        textTacGia.setEditable(false);

        textSoLuong.setEditable(false);

        textNamXuatBan.setEditable(false);

        textGhiChu.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel16.setText("Borrow quantity");

        Minus.setText("-");
        Minus.setColor(new java.awt.Color(255, 204, 0));
        Minus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minus.setRadius(5);
        Minus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MinusActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity.setText("1");

        Plus.setText("+");
        Plus.setColor(new java.awt.Color(255, 204, 0));
        Plus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Plus.setRadius(5);
        Plus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PlusActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel17.setText("Return day");

        ConfirmBorrow.setText("Confirm");
        ConfirmBorrow.setColor(new java.awt.Color(255, 204, 0));
        ConfirmBorrow.setRadius(15);
        ConfirmBorrow.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConfirmBorrowActionPerformed(evt);
            }
        });

        LableNgayTra.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel19.setText("Transactions ID ");

        IDtransactions.setEditable(false);

        javax.swing.GroupLayout bookInfoPanelLayout = new javax.swing.GroupLayout(bookInfoPanel);
        bookInfoPanel.setLayout(bookInfoPanelLayout);
        bookInfoPanelLayout.setHorizontalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(mess_err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookInfoPanelLayout.createSequentialGroup()
                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                .addComponent(SearchBookTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textNamXuatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textGhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LableNgayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(IDtransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(bookInfoPanelLayout.createSequentialGroup()
                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ConfirmBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        bookInfoPanelLayout.setVerticalGroup(
            bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookInfoPanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBookTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDtransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTenSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LableNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mess_err))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SearchReaderBtn.setText("Search");
        SearchReaderBtn.setColor(new java.awt.Color(255, 204, 0));
        SearchReaderBtn.setRadius(15);
        SearchReaderBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchReaderBtnActionPerformed(evt);
            }
        });

        SearchReaderTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter reader ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchReaderTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchReaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchReaderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchReaderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SearchReaderTXT.getAccessibleContext().setAccessibleName("ReaderID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(readerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(readerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MinusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MinusActionPerformed
    {//GEN-HEADEREND:event_MinusActionPerformed
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num > 1)
            {
                num -= 1;
                quantity.setText(String.valueOf(num));
            } else
            {
                JOptionPane.showMessageDialog(this, "minimum quantity is 1");
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PlusActionPerformed
    {//GEN-HEADEREND:event_PlusActionPerformed

        int max = Integer.parseInt(textSoLuong.getText());
        try
        {
            int num = Integer.parseInt(quantity.getText());
            if (num < max)
            {
                num += 1;
                quantity.setText(String.valueOf(num));
            } else if (num == max)
            {
                JOptionPane.showMessageDialog(this, "reach maximum quantity");
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_PlusActionPerformed

    private void SearchReaderBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchReaderBtnActionPerformed
    {//GEN-HEADEREND:event_SearchReaderBtnActionPerformed
        try
        {
            docgia = readerCRUD.findReaderById(Integer.parseInt(SearchReaderTXT.getText()));
            if (docgia != null)
            {
                if (docgia.getStatus() == DocGia.ReaderStatus.READY_TO_BORROW)
                {
                    ReadName.setText(docgia.getName());
                    Phone.setText(docgia.getPhone());
                    Status.setText("READY");
                    readerInfoPanel.setVisible(true);
                    bookInfoPanel.setVisible(true);
                } else
                {
                    JOptionPane.showMessageDialog(this, "Reader nay dang co sach chua tra");
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "No reader found!");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "No reader found!");
        }
    }//GEN-LAST:event_SearchReaderBtnActionPerformed

    private void ConfirmBorrowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmBorrowActionPerformed
    {//GEN-HEADEREND:event_ConfirmBorrowActionPerformed
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate now = LocalDate.now();
            LocalDate future = LocalDate.now().plusDays(14);

            LableNgayTra.setText(dtf.format(future));

            int bookquantity = Integer.parseInt(quantity.getText());
            int bookID = Integer.parseInt(textMaSach.getText());
            int userID = Integer.parseInt(SearchReaderTXT.getText());
            int transID = transCRUD.getIdTransactions() + 1;
            String startDay = now.toString();
            String endDay = future.toString();
            transactions T = new transactions(transID, startDay, endDay, bookquantity, bookID, userID);
            docgia.setStatus(DocGia.ReaderStatus.CURRENT_BORROWING);
            readerCRUD.update(docgia);
            int checked = transCRUD.addNewTransaction(T);
            if (checked > 0)
            {
                transactions tras = transCRUD.getTransactionsByID(transID);
                IDtransactions.setText(String.valueOf(tras.getTransactionID()));
                sach.setQuantity(sach.getQuantity()-bookquantity);
                sachCRUD.update(sach);
                JOptionPane.showMessageDialog(this, "SUCCESS");
            }
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_ConfirmBorrowActionPerformed

    private void SearchBookBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchBookBtnActionPerformed
    {//GEN-HEADEREND:event_SearchBookBtnActionPerformed
        try
        {
            sach = sachCRUD.findSachByName(SearchBookTXT.getText());
            if(sach!=null)
            {
                if(Integer.valueOf(sach.getQuantity())> 0)
                {
                    textMaSach.setText(String.valueOf(sach.getBookID()));
                    textTenSach.setText(sach.getNameBook());
                    textTheLoai.setText(sach.getType());
                    textTacGia.setText(sach.getWriting());
                    textSoLuong.setText(String.valueOf(sach.getQuantity()));
                    textNamXuatBan.setText(String.valueOf(sach.getYearRelease()));
                    textGhiChu.setText(sach.getDescription());
                }
                else
                    JOptionPane.showMessageDialog(this, "this book is out of stock");
            }
            else
                JOptionPane.showMessageDialog(this, "No book found!");
        } catch (Exception e)
        {
            
        }

    }//GEN-LAST:event_SearchBookBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button ConfirmBorrow;
    private swing.TextField_noLabel IDtransactions;
    private swing.TextField_noLabel LableNgayTra;
    private swing.Button Minus;
    private javax.swing.JLabel Phone;
    private swing.Button Plus;
    private javax.swing.JLabel ReadName;
    private swing.Button SearchBookBtn;
    private swing.TextField_noLabel SearchBookTXT;
    private swing.Button SearchReaderBtn;
    private swing.TextField_noLabel SearchReaderTXT;
    private javax.swing.JLabel Status;
    private javax.swing.JPanel bookInfoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mess_err;
    private javax.swing.JLabel quantity;
    private javax.swing.JPanel readerInfoPanel;
    private swing.TextField_noLabel textGhiChu;
    private swing.TextField_noLabel textMaSach;
    private swing.TextField_noLabel textNamXuatBan;
    private swing.TextField_noLabel textSoLuong;
    private swing.TextField_noLabel textTacGia;
    private swing.TextField_noLabel textTenSach;
    private swing.TextField_noLabel textTheLoai;
    // End of variables declaration//GEN-END:variables
}
