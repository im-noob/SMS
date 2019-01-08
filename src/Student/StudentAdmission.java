/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import DataType.Employ.Employ;
import Database.DBConnection;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kumar
 */
public class StudentAdmission extends javax.swing.JInternalFrame {

    /**
     * Creates new form StudentAdmission
     */

    public StudentAdmission() {
        initComponents();
        
        
    }
    List nonTeachingList = null;
     public StudentAdmission(Dimension size) {
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

        gender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        father = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        at = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        po = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dist = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ph1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ph2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        regID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        refByID = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel17 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        father1 = new javax.swing.JTextField();
        mother1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        at1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        po1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ps1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dist1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        pin1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ph3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ph4 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        state1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        regID1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        refByID1 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        nationality1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        religion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        setMinimumSize(getMinimumSize());
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(87, 25, 23, 17);

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setText("---------");
        getContentPane().add(id);
        id.setBounds(128, 25, 54, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(66, 63, 44, 17);

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(name);
        name.setBounds(128, 60, 251, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Father :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(62, 104, 48, 17);

        father.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(father);
        father.setBounds(128, 101, 251, 23);

        mother.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherActionPerformed(evt);
            }
        });
        getContentPane().add(mother);
        mother.setBounds(128, 142, 251, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mother :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(62, 145, 52, 17);

        at.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(at);
        at.setBounds(130, 180, 251, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("AT :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 190, 25, 17);

        po.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(po);
        po.setBounds(510, 190, 251, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("P. O. :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 190, 39, 17);

        ps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ps);
        ps.setBounds(130, 210, 251, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("P. S. :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 210, 37, 17);

        dist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dist);
        dist.setBounds(510, 230, 251, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Dist. :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 230, 36, 17);

        pin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        getContentPane().add(pin);
        pin.setBounds(130, 240, 251, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pin. Code. :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 240, 71, 17);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(130, 310, 251, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Caste :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 310, 43, 17);

        ph1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ph1);
        ph1.setBounds(130, 360, 251, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Mobile No. 1 :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(62, 363, 83, 17);

        ph2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ph2);
        ph2.setBounds(510, 360, 251, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mobile No. 2 : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(410, 360, 87, 17);

        state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(state);
        state.setBounds(130, 270, 251, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("State :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 270, 41, 17);

        regID.setEditable(false);
        regID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(regID);
        regID.setBounds(281, 19, 251, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Reg. No.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(220, 20, 53, 17);

        gender.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(580, 70, 67, 25);

        gender.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Male");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(510, 70, 51, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Reff. By :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(570, 20, 57, 17);

        getContentPane().add(refByID);
        refByID.setBounds(630, 22, 244, 20);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(504, 111, 200, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Gender :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(427, 70, 60, 17);

        nationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nationality);
        nationality.setBounds(510, 270, 251, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Nationality :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 270, 80, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("DOB :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(449, 114, 37, 17);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setAutoscrolls(true);
        jInternalFrame1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jInternalFrame1.setMinimumSize(getMinimumSize());
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ID :");
        jInternalFrame1.getContentPane().add(jLabel17);
        jLabel17.setBounds(87, 25, 23, 17);

        id1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id1.setText("---------");
        jInternalFrame1.getContentPane().add(id1);
        id1.setBounds(128, 25, 54, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Name :");
        jInternalFrame1.getContentPane().add(jLabel20);
        jLabel20.setBounds(66, 63, 44, 17);

        name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(name1);
        name1.setBounds(128, 60, 251, 23);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Father :");
        jInternalFrame1.getContentPane().add(jLabel21);
        jLabel21.setBounds(62, 104, 48, 17);

        father1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(father1);
        father1.setBounds(128, 101, 251, 23);

        mother1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mother1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mother1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(mother1);
        mother1.setBounds(128, 142, 251, 23);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Mother :");
        jInternalFrame1.getContentPane().add(jLabel22);
        jLabel22.setBounds(62, 145, 52, 17);

        at1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(at1);
        at1.setBounds(130, 180, 251, 23);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("AT :");
        jInternalFrame1.getContentPane().add(jLabel23);
        jLabel23.setBounds(80, 190, 25, 17);

        po1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(po1);
        po1.setBounds(510, 190, 251, 23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("P. O. :");
        jInternalFrame1.getContentPane().add(jLabel24);
        jLabel24.setBounds(440, 190, 39, 17);

        ps1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(ps1);
        ps1.setBounds(130, 210, 251, 23);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("P. S. :");
        jInternalFrame1.getContentPane().add(jLabel25);
        jLabel25.setBounds(70, 210, 37, 17);

        dist1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(dist1);
        dist1.setBounds(510, 230, 251, 23);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Dist. :");
        jInternalFrame1.getContentPane().add(jLabel26);
        jLabel26.setBounds(440, 230, 36, 17);

        pin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(pin1);
        pin1.setBounds(130, 240, 251, 23);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Pin. Code. :");
        jInternalFrame1.getContentPane().add(jLabel27);
        jLabel27.setBounds(40, 240, 71, 17);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(jTextField10);
        jTextField10.setBounds(128, 306, 251, 23);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Caste :");
        jInternalFrame1.getContentPane().add(jLabel28);
        jLabel28.setBounds(70, 310, 43, 17);

        ph3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(ph3);
        ph3.setBounds(130, 360, 251, 23);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Mobile No. 1 :");
        jInternalFrame1.getContentPane().add(jLabel29);
        jLabel29.setBounds(62, 363, 83, 17);

        ph4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ph4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ph4ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(ph4);
        ph4.setBounds(520, 360, 251, 23);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Mobile No. 2 : ");
        jInternalFrame1.getContentPane().add(jLabel30);
        jLabel30.setBounds(420, 360, 87, 17);

        state1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(state1);
        state1.setBounds(130, 270, 251, 23);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("State :");
        jInternalFrame1.getContentPane().add(jLabel31);
        jLabel31.setBounds(70, 270, 41, 17);

        regID1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(regID1);
        regID1.setBounds(281, 19, 251, 23);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Reg. No.");
        jInternalFrame1.getContentPane().add(jLabel32);
        jLabel32.setBounds(220, 20, 53, 17);

        gender.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Female");
        jInternalFrame1.getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(580, 70, 67, 25);

        gender.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("Male");
        jInternalFrame1.getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(510, 70, 51, 25);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Reff. By :");
        jInternalFrame1.getContentPane().add(jLabel33);
        jLabel33.setBounds(570, 20, 57, 17);

        refByID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jInternalFrame1.getContentPane().add(refByID1);
        refByID1.setBounds(630, 22, 244, 20);

        jDateChooser2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(504, 111, 200, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Gender :");
        jInternalFrame1.getContentPane().add(jLabel34);
        jLabel34.setBounds(427, 70, 60, 17);

        nationality1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(nationality1);
        nationality1.setBounds(510, 270, 251, 23);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Nationality :");
        jInternalFrame1.getContentPane().add(jLabel35);
        jLabel35.setBounds(410, 270, 80, 17);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("DOB :");
        jInternalFrame1.getContentPane().add(jLabel36);
        jLabel36.setBounds(449, 114, 37, 17);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 60, 50);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Religion :");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(423, 310, 70, 17);

        religion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(religion);
        religion.setBounds(510, 310, 251, 23);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 463, 220, 30);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 463, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motherActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void mother1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mother1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mother1ActionPerformed

    private void pin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin1ActionPerformed

    private void ph4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ph4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ph4ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new DBConnection().connectDB();
    }//GEN-LAST:event_jButton2MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        StudentDaoImpl sdi = new StudentDaoImpl();
        nonTeachingList = sdi.getNonTeachingList();
       // System.out.print("getting list"+nonTeachingList.size());
        for(int i = 0 ; i < nonTeachingList.size(); i++){
            Employ Data = (Employ) nonTeachingList.get(i);
            refByID.addItem(Data.getName());
            
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        System.out.print("Form open studien admsjion steg 1 Form Activated");
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            StudentDaoImpl sdi = new StudentDaoImpl();;

            Student student = new Student();
            student.setRegID("");
            
//          student.setRegID(regID.getText());

            String selected_refid = refByID.getSelectedItem().toString();
            Integer Selected_refIDint = 0 ;
            
            for(int i = 0 ; i < nonTeachingList.size(); i++){
                Employ Data = (Employ) nonTeachingList.get(i);
                if(selected_refid == Data.getName())
                    Selected_refIDint = Data.getId();                    
            }
            
            student.setRefBy(String.valueOf(Selected_refIDint));
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
            
           int i = sdi.insertStudent(student);
          if(i!=0){
                System.out.print("Data inserted New Reg. .......");
                JOptionPane.showMessageDialog(this,"Data Save...");
                jButton1.doClick();
            }
            else{
                System.out.print("error during save");
                JOptionPane.showMessageDialog(this,"Error during save Retry..");
               
            }
            
        }
        catch(Exception e){
            System.out.print("erro in takign iniput:"+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        regID.setText("");
        name.setText("");
        father.setText("");
        jDateChooser1.getDate();
        jDateChooser1.setDateFormatString("");
        at.setText("");
        po.setText("");
        ps.setText("");
        dist.setText("");
        pin.setText("");
        state.setText("");
        nationality.setText("");
        jTextField9.setText("");
        religion.setText("");
        ph1.setText("");
        ph2.setText("");
        mother.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField at;
    private javax.swing.JTextField at1;
    private javax.swing.JTextField dist;
    private javax.swing.JTextField dist1;
    private javax.swing.JTextField father;
    private javax.swing.JTextField father1;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField mother;
    private javax.swing.JTextField mother1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField nationality1;
    private javax.swing.JTextField ph1;
    private javax.swing.JTextField ph2;
    private javax.swing.JTextField ph3;
    private javax.swing.JTextField ph4;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField pin1;
    private javax.swing.JTextField po;
    private javax.swing.JTextField po1;
    private javax.swing.JTextField ps;
    private javax.swing.JTextField ps1;
    private javax.swing.JComboBox<String> refByID;
    private javax.swing.JComboBox<String> refByID1;
    private javax.swing.JTextField regID;
    private javax.swing.JTextField regID1;
    private javax.swing.JTextField religion;
    private javax.swing.JTextField state;
    private javax.swing.JTextField state1;
    // End of variables declaration//GEN-END:variables
}
