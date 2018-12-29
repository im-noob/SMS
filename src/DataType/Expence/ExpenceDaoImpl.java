/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Expence;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class ExpenceDaoImpl implements ExpenceDao{

    @Override
    public int insertExpence(Expence expence) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
           
            try {
                
                String sql = "INSERT INTO `ExpanseTable`(`Title`, `Price`, `Remark`, `create_at`) VALUES (?,?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,expence.getTitle());
                stm.setInt(2,expence.getPrice());
                stm.setString(3,expence.getRemark());
                stm.setDate(4,new java.sql.Date(expence.getDate().getTime()));
                i = stm.executeUpdate();
                
                
                
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExpenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.print(ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ExpenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        return i; }

    @Override
    public Expence[] selectExpence(Expence expence) {
        int i = -1;
        Expence[] cls = new Expence[100];
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT `ExpenseID`, `Title`, `Price`, `Remark`, `create_at` FROM `ExpanseTable` WHERE `create_at` ='"+new java.sql.Date(expence.getDate().getTime())+"'";
                System.out.printf(sql);
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                
                while(rs.next()){
                   i+=1;
                    cls[i] =new Expence();
                    
                    cls[i].setExpenceID(rs.getInt("ExpenseID"));
                    cls[i].setTitle(rs.getString("Title"));
                    cls[i].setPrice(rs.getInt("Price"));
                    cls[i].setRemark(rs.getString("Remark"));
                    cls[i].setDate(rs.getDate("create_at"));
                   
                    
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(ExpenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ExpenceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
      
        return cls;  }

    @Override
    public int updateExpence(Expence expence) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
