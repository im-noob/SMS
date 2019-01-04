/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.transaction;

import DataType.Session.Session;
import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import product.Stock;

/**
 *
 * @author beeru
 */
public class TransactionDaoImpl implements TransactionDao {

    @Override
    public Stock[] selectStock() {
        int i=0;
        Stock[] cl = new Stock[200]; 
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT productstocktable.*,product.* FROM productstocktable " +
                             "inner join product ON product.productID = productstocktable.ProductID " +
                             "WHERE productstocktable.Flag = 1;";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                
               
                while(rs.next()){
                    cl[i] = new Stock();
                    System.out.println(rs.getInt(1)+":"+rs.getString("Name"));
                    cl[i].setPid(rs.getInt("productID"));
                    cl[i].setId(rs.getInt("ProductStockID"));
                    cl[i].setQuantity(rs.getInt("Quantity"));
                    cl[i].setRQuantity(rs.getInt("RQuantity"));
                    cl[i].setSize(rs.getString("Size"));
                    cl[i].setRate(rs.getDouble("Rate")); 
                    cl[i++].setPName(rs.getString("Name"));
                    
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    public Session[] selectSession() {
        int i=0;
        Session[] cl = new Session[30]; 
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "Select * from sessiontable ORDER BY sessionID DESC";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                    cl[i] = new Session();
                    System.out.println(rs.getInt(1)+":"+rs.getString(2));
                    cl[i].setId(rs.getInt(1));
                    cl[i].setName(rs.getString(2));
                    
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    @Override
    public String[] selectStudent(String str) { 
       // Vector
       String[] cl = new String[10];
       cl[0] = new String();
       cl[1] = new String();
       cl[2] = new String();
       cl[3] = new String();
       cl[4] = new String();
       cl[5] = new String();
       cl[6] = new String();
       cl[7] = new String();
       cl[8] = new String();
                    
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT admissiontable.*,classtable.Name As Name1, sessiontable.* from admissiontable INNER JOIN classtable on classtable.ClassID = admissiontable.ClassID " +
                            "INNER JOIN sessiontable ON admissiontable.Session = sessiontable.sessionID " +
                            "WHERE admissiontable.RegNo = ?";
               PreparedStatement stmt= con.prepareStatement(sql); 
               stmt.setString(1, str);
               ResultSet rs=stmt.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getInt(1)+":"+rs.getString("Name"));
                    cl[0] = String.valueOf(rs.getInt("AdmissionID"));
                    cl[1] = String.valueOf(rs.getInt("StudentID"));
                    cl[2] = String.valueOf(rs.getInt("ClassID"));
                    cl[3] = String.valueOf(rs.getInt("Roll"));
                    cl[4] = rs.getString("Sec");
                    cl[5] = rs.getString("Session");
                    cl[6] = rs.getString("Name1");
                    cl[7] = rs.getString("Name");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    public String[] selectStudent1(int str,int sid) { 
       // Vector
       String[] cl = new String[10];
       cl[0] = new String();
       cl[1] = new String();
       cl[2] = new String();
       cl[3] = new String();
       cl[4] = new String();
       cl[5] = new String();
       cl[6] = new String();
       cl[7] = new String();
       cl[8] = new String();
                    
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT admissiontable.*,classtable.Name As Name1, sessiontable.* from admissiontable INNER JOIN classtable on classtable.ClassID = admissiontable.ClassID " +
                            "INNER JOIN sessiontable ON admissiontable.Session = sessiontable.sessionID " +
                            "WHERE admissiontable.AdmissionID = ? and admissiontable.Session = ?";
               PreparedStatement stmt= con.prepareStatement(sql); 
               stmt.setInt(1, str);
               stmt.setInt(2, sid); 
               ResultSet rs=stmt.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getInt(1)+":"+rs.getString("Name"));
                    cl[0] = String.valueOf(rs.getInt("AdmissionID"));
                    cl[1] = String.valueOf(rs.getInt("StudentID"));
                    cl[2] = String.valueOf(rs.getInt("ClassID"));
                    cl[3] = String.valueOf(rs.getInt("Roll"));
                    cl[4] = rs.getString("Sec");
                    cl[5] = rs.getString("Session");
                    cl[6] = rs.getString("Name1");
                    cl[7] = rs.getString("Name");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    
    
    public int selectCartId() { 
       // Vector
       int cl =0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT MAX(cart_id) AS Id FROM cart_table;";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                rs.next();
                
                cl = rs.getInt("Id");
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }
    
    public Cart[] selectCart() { 
       // Vector
       Cart[] cl = new Cart[20];
       int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT cart_id,created_at FROM cart_table WHERE status = 0";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                    cl[i] = new Cart();
                    cl[i].setcId(rs.getInt("cart_id"));
                    cl[i].setCreated_at(rs.getDate("created_at").toString());
                    i++;
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    
    public Transaction[] selectTransaction(int cart_id) { 
       // Vector
       Transaction[] cl = new Transaction[20];
       int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT producttransactiontable.*,product.Name FROM `producttransactiontable` INNER join product ON producttransactiontable.ProductID = product.productID WHERE cart_id = ?";
                PreparedStatement stmt= con.prepareStatement(sql); 
                stmt.setInt(1, cart_id);
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                    cl[i] = new Transaction();
                    cl[i].setName(rs.getString("Name"));
                    cl[i].setPrice(rs.getDouble("Price"));
                    cl[i].setQuntity(rs.getInt("Quntity"));
                    cl[i].setStatus(rs.getInt("status"));
                    cl[i].setTid(rs.getInt("producttrID"));   
                }
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cl;
    }

    @Override
    public int insertTransaction(Transaction trn) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql2 = "INSERT INTO `producttransactiontable`(`RegNo`, `ProductID`, `Quntity`, `Price`, `Session`,`status`,`cart_id`) VALUES(?,?,?,?,?,?,? )";
                PreparedStatement stm=con.prepareStatement(sql2);
                stm.setInt(1, trn.getRegNo());
                stm.setInt(2, trn.getProductID());
                stm.setInt(3,trn.getQuntity());
                stm.setDouble(4, trn.getPrice());
                stm.setInt(5, trn.getSid());
                stm.setInt(6, trn.getStatus());
                stm.setInt(7, trn.getCart_id());
                i = stm.executeUpdate();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
    public int insertCart(Cart crt) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql1 = "INSERT INTO `cart_table`(`Price`, `Discount`, `Dues`, `status`,`admission_id`,`session`)VALUES (?,?,?,?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql1);
                stm.setDouble(1, crt.getPrice());
                stm.setDouble(2, crt.getDiscount());
                stm.setDouble(3, crt.getDues());
                stm.setInt(4,crt.getStatus());
                stm.setInt(5,crt.getAdmissionId());
                stm.setInt(6,crt.getSession());
                i = stm.executeUpdate();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }

    @Override
    public int UpdateStock(Stock stk) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `productstocktable` SET RQuantity=?  where ProductStockID=?";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setInt(1,stk.getRQuantity());
                stm.setInt(2,stk.getId());
                i = stm.executeUpdate();
            } catch (SQLException ex) {
               // Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
    public int UpdateStockStatus(Stock stk) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `productstocktable` SET status=?  where ProductStockID=?";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setInt(1,stk.getStatus());
                stm.setInt(2,stk.getId());
                i = stm.executeUpdate();
            } catch (SQLException ex) {
               // Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
}
