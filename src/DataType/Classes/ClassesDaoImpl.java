/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Classes;

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
public class ClassesDaoImpl implements ClassesDao{

    @Override
    public int insertClasses(Classes classes) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `classtable`(`Name`, `examFee`, `computer`,annual,code,`session`) VALUES (?,?,?,?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,classes.getName());
                stm.setInt(2,classes.getExameFee());
                stm.setInt(3,classes.getComputer());
                stm.setInt(4,classes.getAnnualFee());
                stm.setString(5,classes.getCode());
                stm.setInt(6, classes.getSession());
                i = stm.executeUpdate();
               
                
            } catch (SQLException ex) {
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
     @Override
    public Classes[] selectClasses(int id) {
       int i = -1;
        Classes[] cls =null ;
       // Vector
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                Statement stmtr=con.createStatement(); 
                
                String sqlrow = "SELECT COUNT(*) as num FROM `classtable` Where `session` ="+id;
                
                ResultSet rsr = stmtr.executeQuery(sqlrow);
                rsr.next();
                int rowcount =rsr.getInt("num"); 
                cls = new Classes[rowcount];
                
                String sql = "SELECT `ClassID`, `Name`, `examFee`, `computer`,annual,code FROM `classtable` Where `session` ="+id;
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
               
                
                while(rs.next()){
                   i+=1;
                    cls[i] =new Classes();
                    
                    cls[i].setId(rs.getInt("ClassID"));
                    cls[i].setName(rs.getString("Name"));
                    cls[i].setExameFee(rs.getInt("examFee"));
                    cls[i].setComputer(rs.getInt("computer"));
                    cls[i].setAnnualFee(rs.getInt("annual"));
                    cls[i].setCode(rs.getString("code"));
                    
                }
               
                
            } catch (SQLException ex) {
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return cls;
    }
    
     @Override
    public int updateClasses(Classes classes) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `classtable` SET `Name`=?,`examFee`=?,`computer`=?,annual=? WHERE  `ClassID`=? And `session` =?";
                
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,classes.getName());
                stm.setInt(2,classes.getExameFee());
                stm.setInt(3,classes.getComputer());
                stm.setInt(4,classes.getAnnualFee());
                stm.setInt(5,classes.getId());
                stm.setInt(6,classes.getSession());
                System.out.printf("\n Update code : %s",stm);
                i = stm.executeUpdate();
               i=1;
                
            } catch (SQLException ex) {
                System.out.print("\n\nError during update");
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                  System.out.print("\n\nError during update");
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
    /** particular class */
     @Override
    public Classes selectParticularClasses(Classes classes) {
        int i=0;
        Classes cls=null;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                Statement stmtr=con.createStatement();  
               cls = new Classes();
                String sqlrow = "SELECT Count(`ClassID`) as num,`ClassID`, `Name`, `examFee`, `computer`,annual,code,session FROM `classtable` Where `session` ="+classes.getSession()+" and `ClassID` ="+classes.getId();
              
                 ResultSet rsr = stmtr.executeQuery(sqlrow);
                rsr.next();
                int rowcount =rsr.getInt("num"); 
                cls.setAnnualFee(rsr.getInt("annual"));
                cls.setCode(rsr.getString("code"));
                cls.setComputer(rsr.getInt("computer"));
                cls.setExameFee(rsr.getInt("examFee"));
                cls.setId(rsr.getInt("ClassID"));
                cls.setName(rsr.getString("Name"));
                cls.setSession(rsr.getInt("session"));
                
            } catch (SQLException ex) {
                System.out.print("\n\nError during update");
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);                
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                  System.out.print("\n\nError during update");
                Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return cls;
    }
    
}
