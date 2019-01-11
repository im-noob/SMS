/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import DataType.Expence.ExpenceDaoImpl;
import Database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class ResponseDaoImpl {
    /**calculate today calculation */
    public Collection[] todayCollection(Collection collection){
           int i = -1;
        Collection[] cls = new Collection[100];
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT `feetransactiontable`.`feeTransID`,`feetransactiontable`.`FeeType`,"
                        + "`feetransactiontable`.`feePaid`,`feetransactiontable`.`created_at`,"
                        + "`studenttable`.`Name`,`admissiontable`.`AdmissionSlNo`"
                        + " from `feetransactiontable` INNER JOIN `studenttable` ON "
                        + "`feetransactiontable`.`RegNo` = `studenttable`.`studentID`  LEFT  JOIN "
                        + "`admissiontable` ON `feetransactiontable`.`RegNo` = `admissiontable`.`RegNo` "
                        + "WHERE `create_at` ='"+new java.sql.Date(collection.getDate().getTime())+"'";
                System.out.printf(sql);
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                
                while(rs.next()){
                   i+=1;
                    cls[i] =new Collection();
                    
                    cls[i].setCollectionID(rs.getInt("feeTransID"));
                    cls[i].setTitle(rs.getString("Fee Paid"));
                    cls[i].setPrice(rs.getInt("feePaid"));
                    cls[i].setRemark(rs.getString("Name"));
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
            return cls;
    }

}
