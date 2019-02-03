/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class ReportIFrameIncome extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

   
    /**
     * Creates new form ReportIFrame
     */
    public ReportIFrameIncome() {
        initComponents();
    }

    public ReportIFrameIncome(Dimension size) {
        initComponents();
      
        setBounds(0,0,size.width-10, size.height-10);
        setVisible(true);
        
        DateFormat df = new SimpleDateFormat("d MMM, yyyy");
        this.date.setDate(new Date());
      this.jMonthChooser1.setMonth(new Date().getMonth());
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
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        monthTable = new javax.swing.JTable();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        etable2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Expence");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(null);

        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Price", "Date", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(etable);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 70, 1000, 430);

        date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateFocusGained(evt);
            }
        });
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateMouseExited(evt);
            }
        });
        jPanel2.add(date);
        date.setBounds(80, 20, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("-----------");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(440, 30, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 40, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total Expence :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(340, 30, 110, 17);

        jTabbedPane1.addTab("On Date", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(null);

        jLabel7.setText("Date :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 30, 40, 14);

        jLabel8.setText("Total Expence :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(360, 30, 90, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total Expence :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(440, 30, 120, 17);

        monthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Price", "Date", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(monthTable);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 70, 1000, 430);

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jMonthChooser1);
        jMonthChooser1.setBounds(70, 20, 156, 30);

        jTabbedPane1.addTab("Month", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(null);

        jLabel11.setText("Total Expence :");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(360, 30, 90, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total Expence :");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(440, 30, 120, 17);

        etable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Price", "Date", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(etable2);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(10, 70, 1000, 430);

        jTabbedPane1.addTab("Session", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFocusGained

    private void dateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dateMouseExited
    
     /** Get all expence of today */
    public void todayExpence(){
         int totalExpence = 0;
             Collection collection = new Collection();
            
            collection.setDate(date.getDate());

         ResponseDaoImpl cls =new ResponseDaoImpl();
        Collection[] collectionListVector = null;
        collectionListVector = cls.todayCollection(collection);
        
        if(collectionListVector==null) {
            System.out.printf("Null");
        }
        
          DefaultTableModel modeal =(DefaultTableModel) this.etable.getModel(); 
          while(modeal.getRowCount()>0)
              modeal.removeRow(0);
               try{System.out.printf(collectionListVector[0].getTitle());
                    for(int i = 0;collectionListVector.length>i;i++){
                         
        modeal.addRow(new Object[]{collectionListVector[i].getTitle(),collectionListVector[i].getPrice(),collectionListVector[i].getDate(),collectionListVector[i].getRemark()});
                    totalExpence += collectionListVector[i].getPrice();                         
                    }
           }
        catch(Exception ex){
            //  Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
              
            System.out.print(ex);
        }
          this.jLabel4.setText(" "+totalExpence);
       // this.classList.setListData(str);
     
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTable etable;
    private javax.swing.JTable etable2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable monthTable;
    // End of variables declaration//GEN-END:variables
}
