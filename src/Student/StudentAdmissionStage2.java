/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.awt.Dimension;
import java.util.List;

/**
 *
 * @author kumar
 */
public class StudentAdmissionStage2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form StudentAdmissionStage2
     */

    public StudentAdmissionStage2() {
        initComponents();
        
    }
    
     public StudentAdmissionStage2(Dimension size) {
        initComponents();
        setBounds(0,0,size.width-10, size.height-10);
      setVisible(true);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ph2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        regID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        refByID = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mother = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        po = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        at = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dist = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        religion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ph1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        studclass = new javax.swing.JComboBox<>();
        sec = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setNextFocusableComponent(jButton1);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 35, 206, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Reg. No. :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 38, 62, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(326, 34, 90, 30);

        ph2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ph2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ph2ActionPerformed(evt);
            }
        });
        getContentPane().add(ph2);
        ph2.setBounds(480, 420, 251, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 23, 17);

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setText("---------");
        getContentPane().add(id);
        id.setBounds(100, 80, 54, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Reg. No.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 80, 53, 17);

        regID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(regID);
        regID.setBounds(250, 80, 251, 23);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Reff. By :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(540, 80, 57, 17);

        getContentPane().add(refByID);
        refByID.setBounds(600, 80, 244, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(550, 130, 67, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Male");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(480, 130, 51, 25);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Gender :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 130, 60, 17);

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(name);
        name.setBounds(100, 120, 251, 23);

        father.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(father);
        father.setBounds(100, 160, 251, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 44, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Father :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 48, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mother :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 52, 17);

        mother.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherActionPerformed(evt);
            }
        });
        getContentPane().add(mother);
        mother.setBounds(100, 200, 251, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("DOB :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(420, 170, 37, 17);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(470, 170, 200, 30);

        po.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(po);
        po.setBounds(480, 250, 251, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("P. O. :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 250, 39, 17);

        at.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(at);
        at.setBounds(100, 240, 251, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("AT :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 250, 25, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("P. S. :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 270, 37, 17);

        ps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ps);
        ps.setBounds(100, 270, 251, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Dist. :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 290, 36, 17);

        dist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dist);
        dist.setBounds(480, 290, 251, 23);

        nationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nationality);
        nationality.setBounds(480, 330, 251, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Nationality :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 330, 80, 17);

        state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(state);
        state.setBounds(100, 330, 251, 23);

        pin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        getContentPane().add(pin);
        pin.setBounds(100, 300, 251, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pin. Code. :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 300, 71, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("State :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 330, 41, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Caste :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 370, 43, 17);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(100, 370, 251, 23);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Religion :");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(390, 370, 70, 17);

        religion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(religion);
        religion.setBounds(480, 370, 251, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mobile No. 2 : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 420, 87, 17);

        roll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(roll);
        roll.setBounds(110, 520, 251, 23);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Class :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 570, 83, 17);

        ph1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ph1);
        ph1.setBounds(100, 420, 251, 23);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Mobile No. 1 :");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 420, 83, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Roll No.  :");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 520, 59, 17);

        studclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(studclass);
        studclass.setBounds(110, 570, 250, 23);

        sec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", " " }));
        getContentPane().add(sec);
        sec.setBounds(460, 570, 250, 23);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Sec. :");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(400, 570, 83, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 633, 110, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 635, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ph2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ph2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ph2ActionPerformed

    private void motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motherActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed
    int studentID = 0 ;
    String RegNo = "0";
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        StudentDaoImpl sdi = new StudentDaoImpl();
        List nonTeachingList = sdi.getNonTeachingList();
        System.out.print("getting list"+nonTeachingList.size());
        for(int i = 0 ; i < nonTeachingList.size(); i++){
            System.out.print( nonTeachingList.get(i).toString());
            refByID.addItem(nonTeachingList.get(i).toString());
        }
        
        StudentAdmDaoImpl sadi = new StudentAdmDaoImpl();
        List classList = sadi.getNonTeachingList();
        System.out.print("getting list"+classList.size());
        for(int i = 0 ; i < classList.size(); i++){
            System.out.print( classList.get(i).toString());
            studclass.addItem(classList.get(i).toString());
        }
        
        System.out.print("Form open studien admsjion steg 2 Form opened");
    }//GEN-LAST:event_formInternalFrameOpened
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentAdmDaoImpl sadi = new StudentAdmDaoImpl();;
        RegNo = jTextField1.getText();
        Student student = sadi.getStudentData(RegNo);
        
        refByID.setSelectedIndex(Integer.valueOf(student.getRefBy()));
        if(student.getGender() == "1"){
            jRadioButton2.isSelected();
        }else if(student.getGender() == "2"){
            jRadioButton1.isSelected();
        }
        jDateChooser1.setDate(student.getDob());            
        
        studentID = student.getStudentID();
        id.setText(String.valueOf(studentID));
        regID.setText(student.getRegID());
        name.setText(student.getName());
        father.setText(student.getFather());            
        mother.setText(student.getMother());            
        at.setText(student.getAt());            
        po.setText(student.getPo());            
        ps.setText(student.getPs());            
        dist.setText(student.getDist());            
        pin.setText(student.getPin());            
        state.setText(student.getState());            
        nationality.setText(student.getNationality());            
        jTextField9.setText(student.getCaste());            
        religion.setText(student.getReligion());            
        ph1.setText(student.getPh1());
        ph2.setText(student.getPh2());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        StudentAdmDaoImpl sadi = new StudentAdmDaoImpl();;

        Student student = new Student();

        student.setRegID(regID.getText());
        student.setRefBy(refByID.getSelectedItem().toString());
        String studGender = null;
        if(jRadioButton2.isSelected()){
            studGender = "1";
        }else if(jRadioButton1.isSelected()){
            studGender = "2";
        }
        student.setGender(studGender);
        student.setName(name.getText());
        student.setFather(father.getText());

        java.util.Date studdob = jDateChooser1.getDate();
//            java.sql.Date studsqldob = new java.sql.Date(studdob.getTime());
        student.setDob(studdob);

        String studmother = mother.getText();
        student.setMother(studmother);

        String studat = at.getText();
        student.setAt(studat);

        String studpo = po.getText();
        student.setPo(studpo);

        String studps = ps.getText();
        student.setPs(studps);

        String studdist = dist.getText();
        student.setDist(studdist);

        String studpin = pin.getText();
        student.setPin(studpin);

        String studstate = state.getText();
        student.setState(studstate);

        String studnationality = nationality.getText();
        student.setNationality(studnationality);

        String studcast = jTextField9.getText();
        student.setCaste(studcast);

        String studreligion = religion.getText();
        student.setReligion(studreligion);

        String studph1 = ph1.getText();
        student.setPh1(studph1);

        String studph2 = ph2.getText();
        student.setPh2(studph2);
        
        String studroll = roll.getText();
        int studstudclass = studclass.getSelectedIndex();
        String studsec = sec.getSelectedItem().toString();

//        sadi.updateStudent(student, studentID );
        sadi.insertNewAdmission(studentID, RegNo, studroll,studstudclass,studsec);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        roll.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField at;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dist;
    private javax.swing.JTextField father;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField mother;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField ph1;
    private javax.swing.JTextField ph2;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField po;
    private javax.swing.JTextField ps;
    private javax.swing.JComboBox<String> refByID;
    private javax.swing.JTextField regID;
    private javax.swing.JTextField religion;
    private javax.swing.JTextField roll;
    private javax.swing.JComboBox<String> sec;
    private javax.swing.JTextField state;
    private javax.swing.JComboBox<String> studclass;
    // End of variables declaration//GEN-END:variables
}
