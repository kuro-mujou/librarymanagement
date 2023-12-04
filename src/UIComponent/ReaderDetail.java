package UIComponent;

import UIClass.ReaderManagement;
import databaseClass.DocGiaCRUD;
import databaseClass.DocGia;
import databaseClass.DocGia.ReaderStatus;
import databaseClass.transactionsCRUD;

public class ReaderDetail extends javax.swing.JFrame
{
    private DocGiaCRUD docgiaDAO = new DocGiaCRUD();
    private transactionsCRUD transCRUD = new transactionsCRUD();
    private int idUser = -1;
    private boolean isEditRequest;
    private ReaderManagement rd;

    public ReaderDetail(boolean request, ReaderManagement rd)
    {
        this.isEditRequest = request;
        this.rd = rd;
        initComponents();
        initUI();
    }

    private void initUI()
    {
        confirm.setVisible(isEditRequest);
        textReaderID.setEditable(isEditRequest);
        textReaderName.setEditable(isEditRequest);
        textAge.setEditable(isEditRequest);
        textGender.setEditable(isEditRequest);
        textPhone.setEditable(isEditRequest);
        textAddresss.setEditable(isEditRequest);
        textEmail.setEditable(isEditRequest);
        statusCombobx.setFocusable(isEditRequest);
        statusCombobx.setEnabled(isEditRequest);
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textReaderID = new swing.TextField_noLabel();
        textReaderName = new swing.TextField_noLabel();
        textPhone = new swing.TextField_noLabel();
        textAddresss = new swing.TextField_noLabel();
        textEmail = new swing.TextField_noLabel();
        textGender = new swing.TextField_noLabel();
        textAge = new swing.TextField_noLabel();
        confirm = new swing.Button();
        jLabel23 = new javax.swing.JLabel();
        statusCombobx = new swing.ComboBoxSuggestion();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reader Infomation");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel6.setText("GioiTinh");
        jLabel6.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setText("Ten");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel5.setText("Email");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel7.setText("DiaChi");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setText("ReaderID");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel4.setText("DienThoai");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel8.setText("Age");

        confirm.setBackground(new java.awt.Color(204, 204, 0));
        confirm.setText("Confirm");
        confirm.setColor(new java.awt.Color(204, 204, 0));
        confirm.setRadius(20);
        confirm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confirmActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel23.setText("Status");

        statusCombobx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "READY", "BORROWING", "NOT RETURNED" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textReaderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textReaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textAddresss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusCombobx, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textReaderID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textReaderName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAddresss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(statusCombobx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textAddresss, textAge, textEmail, textGender, textPhone, textReaderID, textReaderName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmActionPerformed
    {//GEN-HEADEREND:event_confirmActionPerformed
        try
        {
            DocGia docGia = getModelId();
            DocGia docgiatim = docgiaDAO.findReaderById(docGia.getUserID());
            if (docgiatim == null)
            {
                docgiaDAO.add(docGia);
            } else
            {
                docGia.setTransactionID(docgiatim.getTransactionID());
                if(statusCombobx.getSelectedIndex()==0)
                    docGia.setTransactionID(0);
                docgiaDAO.update(docGia);
                transCRUD.updateTransactionStatus(docgiatim.getTransactionID(), docGia.ENUM_TO_STATUS_TRANSACTION(docGia.getStatus()));
            }
            rd.resetDataTable();
            rd.fillDataTable();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_confirmActionPerformed
    public DocGia getModel()
    {
        DocGia b = new DocGia();
        b.setUserID(Integer.parseInt(textReaderID.getText()));
        b.setName(textReaderName.getText());
        b.setPhone(textPhone.getText());
        b.setEmail(textEmail.getText());
        b.setAdrress(textAddresss.getText());
        b.setGender(textGender.getText());
        b.setAge(Integer.parseInt(textAge.getText()));
        b.setStatus(STATUS_TO_ENUM((String)statusCombobx.getSelectedItem()));
        return b;
    }

    public DocGia getModelId()
    {
        DocGia b = new DocGia();
        b.setUserID(Integer.parseInt(textReaderID.getText()));
        b.setName(textReaderName.getText());
        b.setPhone(textPhone.getText());
        b.setEmail(textEmail.getText());
        b.setAdrress(textAddresss.getText());
        b.setGender(textGender.getText());
        b.setAge(Integer.parseInt(textAge.getText()));
        b.setStatus(STATUS_TO_ENUM((String)statusCombobx.getSelectedItem()));
        return b;
    }

    public void setModel(DocGia b)
    {
        textReaderID.setText(String.valueOf(b.getUserID()));
        textReaderName.setText(b.getName());
        textPhone.setText(b.getPhone());
        textEmail.setText(b.getEmail());
        textAge.setText(String.valueOf(b.getAge()));
        textGender.setText(b.getGender());
        textAddresss.setText(b.getAdrress());
        statusCombobx.setSelectedIndex(ENUM_TO_INT(b.getStatus()));
    }
    public DocGia.ReaderStatus STATUS_TO_ENUM(String status)
    {
        return switch (status)
        {
            case "READY" ->
                DocGia.ReaderStatus.READY_TO_BORROW;
            case "BORROWING" ->
                DocGia.ReaderStatus.CURRENT_BORROWING;
            case "NOT RETURNED" ->
                DocGia.ReaderStatus.CURRENT_NOT_RETURN;
            default ->
                null;
        };
    }
    public int ENUM_TO_INT(ReaderStatus status)
    {
        return switch (status)
        {
            case READY_TO_BORROW ->
                0;
            case CURRENT_BORROWING ->
                1;
            case CURRENT_NOT_RETURN ->
                2;
            default ->
                -1;
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private swing.ComboBoxSuggestion statusCombobx;
    private swing.TextField_noLabel textAddresss;
    private swing.TextField_noLabel textAge;
    private swing.TextField_noLabel textEmail;
    private swing.TextField_noLabel textGender;
    private swing.TextField_noLabel textPhone;
    private swing.TextField_noLabel textReaderID;
    private swing.TextField_noLabel textReaderName;
    // End of variables declaration//GEN-END:variables
}
