/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

import DataType.Classes.Classes;
import DataType.Classes.ClassesDaoImpl;
import DataType.Session.Session;
import DataType.Session.SessionDaoImpl;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import transport.Transport;
import transport.TransportDaoImpl;

/**
 *
 * @author kumar
 */
public class SettingIFrame extends javax.swing.JInternalFrame {
    Classes[] classListVector = null;
    Session[] sessionListVector = null;
    Transport[] transListVector = null;
    /**
     * Creates new form SettingIFrame
     */
    public SettingIFrame() {
        initComponents();
    }

    public SettingIFrame(Dimension size) {
        initComponents();
      
        setBounds(0,0,size.width-10, size.height-10);
        setVisible(true);
       ListRefresh();
       clearField();
     sessionListRefresh();
     transportListRefresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        examFee = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        classList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComputerFee = new javax.swing.JTextField();
        className = new javax.swing.JTextField();
        cID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        annualFee = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        feeSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        feeTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        sessionSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sessionTxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        sessionList = new javax.swing.JList<>();
        sID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rID = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        transList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        rName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rBno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rFee = new javax.swing.JTextField();
        rSave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        feeClassList = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        feeFeeTypeList = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        jTabbedPane1.setBackground(new java.awt.Color(102, 255, 51));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Class :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(358, 68, 39, 23);

        examFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        examFee.setText("jTextField1");
        examFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examFeeActionPerformed(evt);
            }
        });
        jPanel1.add(examFee);
        examFee.setBounds(420, 100, 180, 23);

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(490, 250, 121, 30);

        classList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        classList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "t" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        classList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        classList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                classListPropertyChange(evt);
            }
        });
        classList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                classListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(classList);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 44, 260, 401);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Exam Fee :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(324, 100, 69, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Computer Fee :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(301, 135, 96, 17);

        ComputerFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComputerFee.setText("jTextField1");
        ComputerFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerFeeActionPerformed(evt);
            }
        });
        jPanel1.add(ComputerFee);
        ComputerFee.setBounds(420, 130, 180, 23);

        className.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        className.setText("jTextField1");
        className.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classNameActionPerformed(evt);
            }
        });
        jPanel1.add(className);
        className.setBounds(420, 70, 180, 23);

        cID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cID.setText("0");
        jPanel1.add(cID);
        cID.setBounds(360, 10, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 10, 23, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Annual Fee :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 160, 80, 17);

        annualFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annualFee.setText("jTextField1");
        annualFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualFeeActionPerformed(evt);
            }
        });
        jPanel1.add(annualFee);
        annualFee.setBounds(420, 160, 180, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Code :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 190, 50, 17);

        code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        code.setText("jTextField1");
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        jPanel1.add(code);
        code.setBounds(420, 190, 180, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(You can’t update this code) ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(620, 200, 180, 14);

        jTabbedPane1.addTab("Class", jPanel1);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(null);

        feeSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feeSave.setText("Save");
        jPanel3.add(feeSave);
        feeSave.setBounds(408, 240, 128, 33);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fee Type :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(312, 187, 65, 23);

        feeTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feeTxt.setText("jTextField1");
        feeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeTxtActionPerformed(evt);
            }
        });
        jPanel3.add(feeTxt);
        feeTxt.setBounds(408, 187, 199, 23);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(36, 80, 217, 342);

        jTabbedPane1.addTab("Fee Type", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(null);

        sessionSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sessionSave.setText("Save");
        sessionSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionSaveMouseClicked(evt);
            }
        });
        jPanel4.add(sessionSave);
        sessionSave.setBounds(408, 240, 128, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Session :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(312, 187, 54, 23);

        sessionTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sessionTxt.setText("jTextField1");
        sessionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionTxtActionPerformed(evt);
            }
        });
        jPanel4.add(sessionTxt);
        sessionTxt.setBounds(408, 187, 199, 23);

        sessionList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sessionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sessionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sessionListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(sessionList);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(36, 80, 217, 342);

        sID.setText("jLabel7");
        jPanel4.add(sID);
        sID.setBounds(340, 30, 34, 14);

        jTabbedPane1.addTab("Session", jPanel4);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(251, 55, 33, 17);

        rID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rID.setText("----------");
        jPanel2.add(rID);
        rID.setBounds(302, 55, 86, 17);

        transList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        transList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        transList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                transListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(transList);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(10, 78, 290, 420);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Rout Name :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(320, 120, 80, 20);

        rName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rName.setText("jTextField1");
        jPanel2.add(rName);
        rName.setBounds(420, 120, 250, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Bus No. :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(340, 160, 80, 20);

        rBno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rBno.setText("jTextField1");
        jPanel2.add(rBno);
        rBno.setBounds(420, 160, 250, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fee :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(370, 200, 40, 20);

        rFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rFee.setText("jTextField1");
        jPanel2.add(rFee);
        rFee.setBounds(420, 200, 250, 23);

        rSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSave.setText("Save");
        rSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSaveMouseClicked(evt);
            }
        });
        jPanel2.add(rSave);
        rSave.setBounds(430, 250, 180, 30);

        jTabbedPane1.addTab("Transport", jPanel2);

        jPanel5.setBackground(new java.awt.Color(102, 255, 102));
        jPanel5.setLayout(null);

        feeClassList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        feeClassList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        feeClassList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                feeClassListValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(feeClassList);

        jPanel5.add(jScrollPane6);
        jScrollPane6.setBounds(10, 30, 180, 420);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Chose class ");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(30, 10, 150, 17);

        jPanel6.setLayout(null);

        feeFeeTypeList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        feeFeeTypeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tuition  Fee", "Computer Fee", "Examination Fee", "Late Fine  ", "Other Fee" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        feeFeeTypeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                feeFeeTypeListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(feeFeeTypeList);

        jPanel6.add(jScrollPane7);
        jScrollPane7.setBounds(20, 60, 180, 340);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Chose Month :");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(200, 30, 100, 17);

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(jMonthChooser1);
        jMonthChooser1.setBounds(320, 20, 130, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Chose fee Type");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(30, 30, 150, 17);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title", "Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable1);

        jPanel6.add(jScrollPane8);
        jScrollPane8.setBounds(230, 100, 452, 110);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(210, 30, 720, 480);

        jTabbedPane1.addTab("Fee Book", jPanel5);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sessionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sessionListValueChanged
        String vl = this.sessionList.getSelectedValue();
        this.selectSessionSelectedID(vl);
    }//GEN-LAST:event_sessionListValueChanged

    private void sessionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionTxtActionPerformed

    private void sessionSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessionSaveMouseClicked
        // TODO add your handling code here:
        if("Save" == this.sessionSave.getText()){
            // System.out.printf("\nerror during save %d",Integer.parseInt(tutionFee.getText()));
            Session clas = new Session();
            clas.setName(this.sessionTxt.getText());

            int i = new SessionDaoImpl().insertSession(clas);
            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                this.sessionClearField();
            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        else if("Update" == sessionSave.getText()){
            System.out.printf("\n--->Under update");
            Session clas = new Session();
            clas.setName(sessionTxt.getText());
            clas.setId(Integer.parseInt(this.sID.getText()));
            int i = new SessionDaoImpl().updateSession(clas);

            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                this.sessionSave.setText("Save");
                clearField();
            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        sessionListRefresh();

    }//GEN-LAST:event_sessionSaveMouseClicked

    private void feeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeTxtActionPerformed

    private void classNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameActionPerformed

    private void ComputerFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComputerFeeActionPerformed

    private void classListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_classListValueChanged

        String vl = this.classList.getSelectedValue();

        selectSelectedID(vl);
    }//GEN-LAST:event_classListValueChanged

    private void classListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_classListPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_classListPropertyChange

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
        if("Save" == save.getText()){
            
            // System.out.printf("\nerror during save %d",Integer.parseInt(tutionFee.getText()));
            Classes clas = new Classes();
            clas.setName(className.getText());
            clas.setExameFee(Integer.parseInt(examFee.getText()));
            clas.setComputer(Integer.parseInt(ComputerFee.getText()));
            clas.setAnnualFee(Integer.parseInt(this.annualFee.getText()));
            clas.setCode(this.code.getText());
            int i = new ClassesDaoImpl().insertClasses(clas);
            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                clearField();

            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        else if("Update" == save.getText()){
            
            System.out.printf("\n--->Under update");
            Classes clas = new Classes();
            clas.setName(className.getText());
            clas.setExameFee(Integer.parseInt(examFee.getText()));
            clas.setComputer(Integer.parseInt(ComputerFee.getText()));
            clas.setAnnualFee(Integer.parseInt(this.annualFee.getText()));
            clas.setCode(this.code.getText());
            clas.setId(Integer.parseInt(cID.getText()));
            int i = new ClassesDaoImpl().updateClasses(clas);

            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                save.setText("Save");
                this.code.enable();
                clearField();
            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        ListRefresh();
    }//GEN-LAST:event_saveMouseClicked

    private void examFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examFeeActionPerformed

    private void transListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_transListValueChanged
        String vl = this.transList.getSelectedValue();
        this.selectTransportSelectedID(vl);
    }//GEN-LAST:event_transListValueChanged

    private void rSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSaveMouseClicked
          // TODO add your handling code here:
        if("Save" == this.rSave.getText()){
            // System.out.printf("\nerror during save %d",Integer.parseInt(tutionFee.getText()));
            Transport trans = new Transport();
            trans.setRoute(this.rName.getText());
            trans.setPrice(Integer.parseInt(this.rFee.getText()));
            trans.setBusno(this.rBno.getText());
          
            int i = new TransportDaoImpl().insertTrans(trans);
            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                clearField();

            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        else if("Update" == this.rSave.getText()){
            Transport trans = new Transport();
            trans.setRoute(this.rName.getText());
            trans.setPrice(Integer.parseInt(this.rFee.getText()));
            trans.setBusno(this.rBno.getText());
            trans.setId(Integer.parseInt(this.rID.getText()));
            int i = new TransportDaoImpl().updateTrans(trans);

            if(i!=0){
                System.out.print("Data inserted");
                JOptionPane.showMessageDialog(this,"Data Save...");
                this.rSave.setText("Save");
                clearField();
            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
            }
        }
        transportListRefresh();
    }//GEN-LAST:event_rSaveMouseClicked

    private void feeClassListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_feeClassListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_feeClassListValueChanged

    private void feeFeeTypeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_feeFeeTypeListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_feeFeeTypeListValueChanged

    private void annualFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualFeeActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed
//Update Code
   private void selectSelectedID(String string){
         try{
                    for(int i = 0;classListVector.length>i;i++){
                        if(string == classListVector[i].getName()){
                             this.ComputerFee.setText(String.valueOf(classListVector[i].getComputer()));
                            this.className.setText(classListVector[i].getName());
                            this.examFee.setText(String.valueOf(classListVector[i].getExameFee()));
                            this.cID.setText(String.valueOf(classListVector[i].getId()));
                            this.annualFee.setText(String.valueOf(classListVector[i].getAnnualFee()));
                            this.code.setText(classListVector[i].getCode());
                             
                            save.setText("Update");
                            this.code.disable();
                            return;
                        }
                    }
           }
        catch(Exception ex){
              Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Eroor in selected id");  
            System.out.print(ex);
        }
    }
   
   //Session Update Code
   private void selectSessionSelectedID(String string){
         try{
                    for(int i = 0;sessionListVector.length>i;i++){
                        if(string == sessionListVector[i].getName()){
                            this.sessionTxt.setText(sessionListVector[i].getName());
                            this.sID.setText(String.valueOf(classListVector[i].getId()));
                            this.sessionSave.setText("Update");
                            return;
                        }
                    }
           }
        catch(Exception ex){
              Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Eroor in selected id");  
            System.out.print(ex);
        }
    }    
   
     //transport Update Code
   private void selectTransportSelectedID(String string){
         try{
                    for(int i = 0;this.transListVector.length>i;i++){
                        if(string == transListVector[i].getRoute()){
                            this.rName.setText(transListVector[i].getRoute());
                            this.rFee.setText(String.valueOf(transListVector[i].getPrice()));
                            this.rID.setText(String.valueOf(transListVector[i].getId()));
                            this.rBno.setText(transListVector[i].getBusno());
                            this.rSave.setText("Update");
                            return;
                        }
                    }
           }
        catch(Exception ex){
              Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Eroor in selected id");  
            System.out.print(ex);
        }
    }    
    //classList
    private void ListRefresh(){
        //this.classList
        ClassesDaoImpl cls =new ClassesDaoImpl();
        classListVector =cls.selectClasses();
         System.out.printf("Select => %s",classListVector[3].getName());
        if(classListVector==null) {
            System.out.printf("Null");
        }
         String[] str = new String[classListVector.length];
          DefaultListModel<String> l1 = new DefaultListModel<>(); 
           classList.setModel(l1);
           this.feeClassList.setModel(l1);
            
           System.out.printf("\nPrint size ==>%d",classListVector.length);
            l1.addElement(classListVector[3].getName());
           try{
                    for(int i = 0;classListVector.length>i;i++){
                         System.out.printf("\n==>%d",i);
                         l1.addElement(classListVector[i].getName());
                        
                         str[i] = classListVector[i].getName();
                    }
           }
        catch(Exception ex){
              Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
              
            System.out.print(ex);
        }
       // this.classList.setListData(str);
     
        this.repaint();
    }
    
    //session List
    private void sessionListRefresh(){
        //this.classList
        SessionDaoImpl cls =new SessionDaoImpl();
       sessionListVector =cls.selectSession();
         
        if(sessionListVector==null) {
            System.out.printf("Null");
        }
         String[] str = new String[sessionListVector.length];
          DefaultListModel<String> l1 = new DefaultListModel<>(); 
           this.sessionList.setModel(l1);
            
           System.out.printf("\nPrint size ==>%d",sessionListVector.length);
            
           try{
                    for(int i = 0;sessionListVector.length>i;i++){
                         System.out.printf("\n==>%d",i);
                         l1.addElement(sessionListVector[i].getName());
                        
                         str[i] = sessionListVector[i].getName();
                    }
           }
        catch(Exception ex){
              Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
              
            System.out.print(ex);
        }
       // this.classList.setListData(str);
     
        this.repaint();
    }
    
    //Transport List
     private void transportListRefresh(){
        //this.classList
        TransportDaoImpl cls =new TransportDaoImpl();
       transListVector =cls.selectTrans();
         
        if(transListVector==null) {
            System.out.printf("Null");
        }
        
          DefaultListModel<String> l1 = new DefaultListModel<>(); 
           this.transList.setModel(l1);
            
          // System.out.printf("\nPrint size ==>%d",sessionListVector.length);
            
           try{
                    for(int i = 0;transListVector.length>i;i++){
                         System.out.printf("\n==>%d",i);
                         l1.addElement(transListVector[i].getRoute());
                        
                        
                    }
           }
        catch(Exception ex){
              Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
              
            System.out.print(ex);
        }
       // this.classList.setListData(str);
     
        this.repaint();
    }
    
    //class field
    private void clearField(){
        this.ComputerFee.setText("0");
        this.className.setText("");
        this.examFee.setText("0");
        this.cID.setText("0");
        this.annualFee.setText("0");
        this.code.setText("0");
         
    }
    
    //session field
     private void sessionClearField(){
       
        this.sessionTxt.setText("");
       
        this.sID.setText("0");
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ComputerFee;
    private javax.swing.JTextField annualFee;
    private javax.swing.JLabel cID;
    private javax.swing.JList<String> classList;
    private javax.swing.JTextField className;
    private javax.swing.JTextField code;
    private javax.swing.JTextField examFee;
    private javax.swing.JList<String> feeClassList;
    private javax.swing.JList<String> feeFeeTypeList;
    private javax.swing.JButton feeSave;
    private javax.swing.JTextField feeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rBno;
    private javax.swing.JTextField rFee;
    private javax.swing.JLabel rID;
    private javax.swing.JTextField rName;
    private javax.swing.JButton rSave;
    private javax.swing.JLabel sID;
    private javax.swing.JButton save;
    private javax.swing.JList<String> sessionList;
    private javax.swing.JButton sessionSave;
    private javax.swing.JTextField sessionTxt;
    private javax.swing.JList<String> transList;
    // End of variables declaration//GEN-END:variables
}
