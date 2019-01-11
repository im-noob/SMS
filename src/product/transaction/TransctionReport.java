/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.transaction;

import DataType.Session.Session;
import java.awt.Dimension;
import java.lang.reflect.Array;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import product.*;
import setting.ComboBoxFiter;

/**
 *
 * @author kumar
 */
public class TransctionReport extends javax.swing.JInternalFrame {
   
    private TransactionDaoImpl tdi = new TransactionDaoImpl();
    Stock[] data;
    Transaction[] trns = new Transaction[20];
    Cart[] crt;
    Session[] ses;
    int sl =0;
    private String session;
    private int sid;
    private int admid;
    private int regNo;
    /**
     * Creates new form StudentAdmissionStage2
     */
    public TransctionReport() {
        initComponents();
        setData();
    }
    
     public TransctionReport(Dimension size) {
        initComponents();
        this.setData();
        setBounds(0,0,size.width-10, size.height-10);
        setVisible(true);
        for(int i = 0; i<19 ;i++){
            trns[i] = new Transaction();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        PList = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        stClass = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stRoll = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stSec = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        stSession = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        admissionNo = new javax.swing.JTextField();
        sessionList = new javax.swing.JComboBox<>();
        SearchAS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);
        setForeground(new java.awt.Color(153, 51, 0));
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        PList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(PList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 180, 250);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Submit");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(350, 580, 110, 30);

        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Class :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 140, 39, 22);

        stClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stClass.setForeground(new java.awt.Color(153, 51, 0));
        stClass.setText("....");
        jPanel1.add(stClass);
        stClass.setBounds(170, 130, 130, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Roll  :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(100, 170, 40, 30);

        stRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stRoll.setForeground(new java.awt.Color(153, 51, 0));
        stRoll.setText("....");
        jPanel1.add(stRoll);
        stRoll.setBounds(170, 170, 100, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Sec   :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(350, 140, 39, 30);

        stSec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stSec.setForeground(new java.awt.Color(153, 51, 0));
        stSec.setText("....");
        jPanel1.add(stSec);
        stSec.setBounds(420, 140, 130, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Session :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(340, 180, 70, 20);

        stSession.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stSession.setForeground(new java.awt.Color(153, 51, 0));
        stSession.setText("....");
        jPanel1.add(stSession);
        stSession.setBounds(410, 170, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Admission No: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 30, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Session : ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(80, 80, 58, 20);

        admissionNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admissionNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                admissionNoKeyTyped(evt);
            }
        });
        jPanel1.add(admissionNo);
        admissionNo.setBounds(150, 30, 130, 30);

        sessionList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sessionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(sessionList);
        sessionList.setBounds(150, 80, 130, 30);

        SearchAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchAS.setText("Search");
        SearchAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchASActionPerformed(evt);
            }
        });
        jPanel1.add(SearchAS);
        SearchAS.setBounds(320, 60, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 690, 230);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/L No.", "P Name", "Quantity", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 270, 490, 270);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Cart List");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 260, 50, 15);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Delivered ");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(140, 580, 110, 25);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S/L", "Product Name", "Size", "Remains", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(740, 20, 530, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PListValueChanged
        String pname1 = PList.getSelectedValue();
        int i = PList.getSelectedIndex();
        sl = 0;
        this.jCheckBox1.setSelected(false);
        trns = tdi.selectTransaction(crt[i].getcId());
        System.out.println("Length:"+Array.getLength(trns));
        if(trns.length > 0){
            //trns = tdi.
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            try{
                for(Transaction trn:trns){
                    System.out.print(trn.getName());
                    model.addRow(new Object[]{++sl,trn.getName(),trn.getQuntity(),trn.getPrice(),trn.getStatus()});
                }
            }
            catch(Exception e){
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No Record Found.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PListValueChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int i=0;
        try{
            for(Transaction trn:trns){
                System.out.print(trn.getName());
                i = tdi.UpdateTransactionStatus(trn);
                if(i==0){
                    System.out.println("Something wrong");
                }
                else
                {
                    System.out.println("Updated..");
                }
            }
        }
        catch(Exception e){

        }    
    }//GEN-LAST:event_addButtonActionPerformed

    private void SearchASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchASActionPerformed
        String value = admissionNo.getText();
        System.out.print(value);
        if(value.length() != 0){
            int ind = this.sessionList.getSelectedIndex();
            crt = tdi.selectCart();   
            DefaultListModel<String> model = new DefaultListModel<>();
            this.PList.setModel(model);
            
            String[] str = tdi.selectStudent1(Integer.parseInt(value),ses[ind].getId());
            if(str[0].length() != 0){
                stClass.setText(str[6]);
                stRoll.setText(str[3]);
                stSession.setText(str[7]);
                stSec.setText(str[4]);
                admid = Integer.parseInt(str[0]);
                session = str[7];
                sid = Integer.parseInt(str[5]);
                regNo = Integer.parseInt(value);
                if(crt.length > 0){
                    try{
                        for (Cart data1 : crt) {
                            System.out.println(data1.getcId());
                            model.addElement(data1.getcId()+" (" +data1.getCreated_at() + ")");
                        }    
                    }catch(Exception ex){
                        System.out.print(ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "No Cart Found.", "", JOptionPane.INFORMATION_MESSAGE);
                    stClass.setText("");
                    stRoll.setText("");
                    stSession.setText("");
                    stSec.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No Record Found.", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Input Box is Empty.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SearchASActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row= this.jTable1.rowAtPoint(evt.getPoint());
        int value = (int) this.jTable1.getValueAt(row, 4);
        if(value == 1){
            
            this.jCheckBox1.setSelected(true);
        }
        else {
            this.jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int row= this.jTable1.getSelectedRow();
        if(row >= 0){
            if(this.jCheckBox1.isSelected() == true){
                this.jTable1.setValueAt(1, row, 4);
                trns[row].setStatus(1);
            }
            else {
                this.jTable1.setValueAt(0, row, 4);
                trns[row].setStatus(0);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Select any item.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void admissionNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admissionNoKeyTyped
         ComboBoxFiter.numberValidation(evt);
    }//GEN-LAST:event_admissionNoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> PList;
    private javax.swing.JButton SearchAS;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField admissionNo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> sessionList;
    private javax.swing.JLabel stClass;
    private javax.swing.JLabel stRoll;
    private javax.swing.JLabel stSec;
    private javax.swing.JLabel stSession;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unchecked")
    private void setData() {
        System.out.println("Mehod Called");
        try{
            ses =  tdi.selectSession();
            DefaultComboBoxModel dcm = new DefaultComboBoxModel<>();
            this.sessionList.setModel(dcm);
            for (Session ses1 : ses) {
                System.out.println(ses1.getName());
                dcm.addElement(ses1.getName());
            }    
        }catch(Exception ex){
            System.out.print(ex);
        }
        
        
        try{
            ReportList[] rpt = tdi.report();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            int i =0;
            for(ReportList rpl:rpt){
                System.out.print(rpl.getName());
                model.addRow(new Object[]{++i,rpl.getName(),rpl.getSize(),rpl.getQuantity(),rpl.getDate()});
            }
        }catch(Exception ex){
            System.out.print(ex);
        }
    }
}
