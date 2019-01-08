/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Session;

import DataType.Classes.Classes;
import DataType.Classes.ClassesDaoImpl;
import Database.DBConnection;
import Student.Admission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class SessionDaoImpl implements SessionDao {
   
   @Override
    public int insertSession(Session session) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
           
            try {
                
                String sql = "INSERT INTO `sessiontable`(`Name`) VALUES (?)";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,session.getName());
                i = stm.executeUpdate();
                
                
                
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.print(ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        return i;
    }
    
     @Override
    public Session[] selectSession() {
       int i = -1;
        Session[] cls = null;
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                Statement stmtr=con.createStatement(); 
                
                String sqlrow = "SELECT COUNT(*) as num FROM `classtable`";
               
                ResultSet rsr = stmtr.executeQuery(sqlrow);
                rsr.next();
                int rowcount =rsr.getInt("num"); 
                cls  = new Session[rowcount];
                
               String sql = "SELECT `sessionID`, `Name` FROM `sessiontable`";
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                
                while(rs.next()){
                   i+=1;
                    cls[i] =new Session();
                    
                    cls[i].setId(rs.getInt("sessionID"));
                    cls[i].setName(rs.getString("Name"));  
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return cls;
    }
    
     @Override
    public int updateSession(Session session) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `sessiontable` SET `Name`=? WHERE `sessionID`=?";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,session.getName());
                
                stm.setInt(2,session.getId());
                i = stm.executeUpdate();
               
                
            } catch (SQLException ex) {
                System.out.print("\n\nError during update");
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                  System.out.print("\n\nError during update");
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }

    /**SELECT `Session`  FROM `admissiontable` WHERE `RegNo` = 1*/
    @Override
    public Session[] calculateFeeInSessionChange(int id) {
        int i = -1;
        Session[] cls = null;
       // Vector
        Connection con = new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                Statement stmtr=con.createStatement(); 
                
                String sqlrow = "SELECT COUNT(*) as num FROM `admissiontable` WHERE `RegNo` = "+id;
               
                ResultSet rsr = stmtr.executeQuery(sqlrow);
                rsr.next();
                int rowcount =rsr.getInt("num"); 
                cls  = new Session[rowcount];
                
               String sql = "SELECT `Session`,`created_at`  FROM `admissiontable` WHERE `RegNo` = "+id;
               Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                while(rs.next()){
                   i+=1;
                    cls[i] =new Session();
                    
                    cls[i].setId(rs.getInt("Session"));
                     
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            calculateFeeNow(cls,id,con);
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return cls;
    }
    
   @Override
    public int calculateFeeNow(Session[] sessions,int id,Connection con){
        
        int cid =0;
        Date date = null;
        int totalFee = 0;
        int totalPaidFee = 0;
       
        if(con !=null ){
            try {
                for(Session session : sessions){
                    
                
                    Statement stmtr=con.createStatement(); 

                    String sqlrow = "SELECT COUNT(*) as num FROM `admissiontable` WHERE `RegNo` ="+id+" AND `Session` = "+session.getId();

                    ResultSet rsr = stmtr.executeQuery(sqlrow);
                    rsr.next();
                    int rowcount =rsr.getInt("num"); 
                   Admission[] admission  = new Admission[rowcount];
                   int a=0;

                   String sql = "SELECT `AdmissionID`,"
                           + " `AdmissionSlNo`,"
                           + " `StudentID`,"
                           + " `RegNo`,"
                           + " `ClassID`,"
                           + "`Sec`,"
                           + " `Roll`,"
                           + " `TransportID`,"
                           + " `Status`,"
                           + " `Session`,"
                           + " `transportFee`, "
                           + "`tutionFee`,"
                           + " `created_at`,"
                           + " `oldFee`"
                           + " FROM "
                           + "`admissiontable`"
                           + " WHERE `RegNo` = "+id
                           + " AND `Session` = "+session.getId();
                    
                   System.out.printf("Sql ! : %s", sql);
                    Statement stmt=con.createStatement();  
                    ResultSet rs=stmt.executeQuery(sql);
                    
                     rs.next(); 
                     
                     date =rs.getDate("created_at");
                     cid = rs.getInt("ClassID");
                     
                      Statement stmt2=con.createStatement(); 

                    
        String sqlrows = "SELECT COUNT(`feeBookID`) as num,`feeBookID`,"
                + " `MonthCode`,"
                + " `feeType`, "
                + "`SessionID`, "
                + "`ClassID`, "
                + "`created_at` "
                + "FROM `feereceiptmanagertable` WHERE "
                + "`MonthCode` <= "+date
                + " AND `SessionID` = "+session.getId()
                + " AND `ClassID` = "+cid;
        System.out.printf("\nSql 2 : %s", sqlrows);
                ResultSet rsr2 = stmt2.executeQuery(sqlrows);
                rsr2.next();
                int row =rsr2.getInt("num");  
                
                  String feeTypesql = "SELECT `feeBookID`,"
                + " `MonthCode`,"
                + " `feeType`, "
                + "`SessionID`, "
                + "`ClassID`, "
                + "`created_at` "
                + "FROM `feereceiptmanagertable` WHERE "
                + "`MonthCode` <= "+date
                + " AND `SessionID` = "+session.getId()
                + " AND `ClassID` = "+cid;
         
                Statement stmt1=con.createStatement();  
                ResultSet rs1=stmt1.executeQuery(feeTypesql);
                
                String[] ary = {"Old Fee","Annual Fee","Tuition  Fee","Computer Fee","Examination Fee","Other Fee"};
               
                int OldFee = 0;
                int AnnualFee = 0;
                int TuitionFee =0;
                int ComputerFee = 0;
                int ExaminationFee = 0;
                
                 while(rs1.next()){
                     if(ary[1] == rs1.getString("feeType"))
                         AnnualFee++;
                else if(ary[2] == rs1.getString("feeType"))
                         TuitionFee++;
                else if(ary[2] == rs1.getString("feeType"))
                         ComputerFee++;
                else if(ary[2] == rs1.getString("feeType"))
                         ExaminationFee++;   
                 } 
                 
                 /** calculate  fee of student */
                 Classes classes = new Classes();
                 classes.setSession(session.getId());
                 classes.setId(cid);
                 
                 ClassesDaoImpl classesDaoImpl = new ClassesDaoImpl();
               Classes obj =  classesDaoImpl.selectParticularClasses(classes);
               totalFee += (obj.getAnnualFee()*AnnualFee)+(obj.getComputer()*ComputerFee)+(obj.getExameFee()*ExaminationFee)+(rs.getInt("tutionFee")*TuitionFee);
               
               String paidsumsql ="SELECT SUM(`feePaid`) as paidValue\n" +
                                    " FROM `feetransactiontable` WHERE `RegNo` = "+id
                       + " And `sessionID` ="
                       + session.getId();
               
               System.out.printf("Sql 3 : %s", paidsumsql);
                Statement stmt3=con.createStatement();  
                ResultSet rs3=stmt3.executeQuery(paidsumsql);
                rs3.next();
               totalPaidFee += rs3.getInt("paidValue");
                
                String discountsumsql ="SELECT SUM(`discount`) as discountValue\n" +
                                    " FROM `feetransactiontable` WHERE `RegNo` = "+id
                       + " And `sessionID` = "
                       + session.getId();
                
                 System.out.printf("Sql 4 : %s", discountsumsql);
                Statement stmt4=con.createStatement();  
                ResultSet rs5=stmt4.executeQuery(discountsumsql);
                rs5.next();
                
                totalPaidFee += rs3.getInt("discountValue");
               
               }
                
            } catch (SQLException ex) {
                Logger.getLogger(SessionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
           
         }
       
        /** Calculate old Duse*/
        
        int dues = totalFee - totalPaidFee;
        System.out.printf("\nTotal Dues : %d",dues);
        return cid;
    }
    
    
    
}
