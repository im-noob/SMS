/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.FeeType;

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
public class FeeCalcDaoImpl implements FeeCalcDao{

    @Override
    public FeeCalc[] selectFeeCalc(FeeCalc feecalc) {
            FeeCalc[] obj=null;
          int i = -1;
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                String sql = "SELECT `feeBookID`, `MonthCode`, `feeType`, `SessionID`, `ClassID`, `created_at` FROM `feereceiptmanagertable` WHERE `ClassID` = "+feecalc.getClassId();
               
                Statement stmt=con.createStatement(); 
                
                String sqlrow = "SELECT COUNT(*) as num FROM `feereceiptmanagertable` WHERE `ClassID` = "+feecalc.getClassId();
               
                ResultSet rs = stmt.executeQuery(sqlrow);
                rs.next();
                int rowcount =rs.getInt("num"); 
                
                obj =new FeeCalc[rowcount];
                System.out.printf("Total Row count : %d",rowcount);
                rs=stmt.executeQuery(sql);
                String[] feeTypeArray ={"Old Fee","Annual Fee","Tuition  Fee","Computer Fee","Examination Fee","Late Fine","Transport Fee","Other Fee"};
                
                while(rs.next()){
                   i+=1;
                    obj[i] =new FeeCalc();
                    
                    obj[i].setClassId(rs.getInt("ClassID"));
                    obj[i].setMonth(rs.getInt("MonthCode"));
                    obj[i].setFeeTypeName(feeTypeArray[Integer.parseInt(rs.getString("feeType"))-1]);
                    obj[i].setSession(rs.getInt("SessionID"));
                    obj[i].setFeebookid(rs.getInt("feeBookID"));
                    
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(FeeCalcDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeeCalcDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }   
        return obj;
    }
    
}