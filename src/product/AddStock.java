/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author kumar
 */
public class AddStock extends javax.swing.JInternalFrame {
   
    private ProductDaoImpl pdi = new ProductDaoImpl();
    private Product prd = new Product();
    Product[] data;
    /**
     * Creates new form StudentAdmissionStage2
     */
    public AddStock() {
        initComponents();
    }
    
     public AddStock(Dimension size) {
        initComponents();
        this.setData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        PList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellPrice = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        PList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Notebook", "Books", "Tie", "Belt", "Watch" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(PList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 70, 230, 380);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Product :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 70, 60, 30);

        pname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pname.setForeground(new java.awt.Color(153, 0, 0));
        pname.setText("......");
        getContentPane().add(pname);
        pname.setBounds(420, 70, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sell Price :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 160, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Size :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 200, 40, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 240, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rate   :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 290, 90, 17);

        sellPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(sellPrice);
        sellPrice.setBounds(430, 160, 150, 30);

        size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(size);
        size.setBounds(430, 200, 150, 30);

        quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(quantity);
        quantity.setBounds(430, 240, 150, 30);

        rate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(rate);
        rate.setBounds(430, 290, 150, 30);

        ResetButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton);
        ResetButton.setBounds(360, 370, 100, 25);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(490, 370, 110, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Price  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 130, 60, 17);

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(price);
        price.setBounds(430, 120, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PListValueChanged
            String pname1 = PList.getSelectedValue();
            pname.setText(pname1);
//            prd.setName(pname1);
//            int id = PList.getSelectedIndex();
//            prd.setId(id+1);
    }//GEN-LAST:event_PListValueChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Stock stk = new Stock();
        StockDaoImpl sdi = new StockDaoImpl();
        
        String SPValue = sellPrice.getText();
        String Quantity = quantity.getText();
        String Rate = rate.getText();
        String Size = size.getText();
        String Price = price.getText();
        int ind = PList.getSelectedIndex();
        if(data[ind].getId() == 0) {
            JOptionPane.showMessageDialog(null, "Product is not Selected", "", JOptionPane.INFORMATION_MESSAGE);
             pname.setFocusable(true);
        }else if(SPValue == ""){
             JOptionPane.showMessageDialog(null, "sell Price is empty", "", JOptionPane.INFORMATION_MESSAGE);
             sellPrice.setFocusable(true);
        }else if(Size == ""){
             JOptionPane.showMessageDialog(null, "Size is empty", "", JOptionPane.INFORMATION_MESSAGE);
             size.setFocusable(true);
        }else if(Quantity == ""){
             JOptionPane.showMessageDialog(null, "Quantity is empty", "", JOptionPane.INFORMATION_MESSAGE);
             quantity.setFocusable(true);
        }else if(Rate == ""){
             JOptionPane.showMessageDialog(null, "Rate is empty", "", JOptionPane.INFORMATION_MESSAGE);
             rate.setFocusable(true);
        }else if(Price == ""){
             JOptionPane.showMessageDialog(null, "Price is empty", "", JOptionPane.INFORMATION_MESSAGE);
             price.setFocusable(true);
        }else{
            stk.setFlag(1);
            stk.setPid(data[ind].getId());
            stk.setSellPrice(Double.parseDouble(SPValue));
            stk.setRate(Double.parseDouble(Rate));
            stk.setQuantity(Integer.parseInt(Quantity));
            stk.setRQuantity(Integer.parseInt(Quantity));
            stk.setPrice(Double.parseDouble(Price));
            stk.setSize(Size);
            int i = sdi.InsertStock(stk);
            if(i != 0){
                JOptionPane.showMessageDialog(null, "Added Successfully", "", JOptionPane.INFORMATION_MESSAGE);
                pname.setText("");
                this.ResetData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went wrong", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
       this.ResetData();
    }//GEN-LAST:event_ResetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> PList;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField sellPrice;
    private javax.swing.JTextField size;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        System.out.println("Mehod Called");
        data = pdi.getProduct();
        DefaultListModel<String> model = new DefaultListModel<>();
        this.PList.setModel(model);
        try{
            for (Product data1 : data) {
                System.out.println(data1.getName());
                model.addElement(data1.getName());
            }    
        }catch(Exception ex){
            System.out.print(ex);
        }
    }
    private void ResetData() {
        price.setText("");
        size.setText("");
        rate.setText("");
        sellPrice.setText("");
        quantity.setText("");
        price.setFocusable(true);
    }  
}
