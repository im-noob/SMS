/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

<<<<<<< HEAD
import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

=======
>>>>>>> a161e0a11ec6663c0afb5fb7169fda1a011f334a
/**
 *
 * @author kumar
 */
<<<<<<< HEAD
public class ProductDaoImpl implements ProductDao{
     
    @Override
    public int InsetProduct(Product prd) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `product`(`Name`) VALUES (?)";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,prd.getName());
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
    public int updateProduct(Product prd) {
        System.out.println(prd.getId());
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `product` SET Name=?  where productID=?";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,prd.getName());
                stm.setInt(2,prd.getId());
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

    @Override
    @SuppressWarnings("unchecked")
    public Product[] getProduct() {
          int i=0;
        Product[] cl = new Product[200]; 
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `product`";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                
               
                while(rs.next()){
                    cl[i] = new Product();
                    System.out.println(rs.getInt(1)+":"+rs.getString("Name"));
                    cl[i].setId(rs.getInt("productID"));
                    cl[i++].setName(rs.getString("Name"));
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
=======
public class ProductDaoImpl {
    
>>>>>>> a161e0a11ec6663c0afb5fb7169fda1a011f334a
}
