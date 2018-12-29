/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

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
public class TransportDaoImpl implements TransportDao {

    @Override
    public int insertTrans(Transport trans) {
          int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `transporttable`(`Route`, `Price`, `busno`) VALUES (?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                
                stm.setString(1, trans.getRoute());
                stm.setInt(2, trans.getPrice());
                stm.setString(3, trans.getBusno());
                
                stm.executeUpdate();
               ResultSet rs = stm.getGeneratedKeys();
               rs.next();
               i =rs.getInt(1);
                
            } catch (SQLException ex) {
                Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.print(ex);
                }
         }
        else{
            System.out.printf("Integer value is not connect");
        }
        System.out.printf("Integer value is %d", i);
        return i;
    }

    @Override
    public Transport[] selectTrans() {
       int i = -1;
        Transport[] cls = new Transport[30];
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT `TransportID`, `Route`, `Price`, `busno` FROM `transporttable`";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                
                while(rs.next()){
                   i+=1;
                    cls[i] =new Transport();
                    
                    cls[i].setId(rs.getInt("TransportID"));
                    cls[i].setRoute(rs.getString("Route"));
                    cls[i].setBusno(rs.getString("busno"));
                    cls[i].setPrice(rs.getInt("Price"));
                    
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return cls;
    }

    @Override
    public int updateTrans(Transport trans) {
      int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `transporttable` SET `Route`=?,`Price`=?,`busno`=? WHERE `TransportID`=?";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,trans.getRoute());
                
                stm.setInt(2,trans.getPrice());
                stm.setString(3,trans.getBusno());
                stm.setInt(4, trans.getId());
                i = stm.executeUpdate();
               
                
            } catch (SQLException ex) {
                System.out.print("\n\nError during update");
                Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                  System.out.print("\n\nError during update");
                Logger.getLogger(TransportDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
}
