/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aarav
 */
public class StudentACImpl implements StudentACDao {

    @Override
    public List getStudentListByName(String name, String classID, String sec) {
        int i = -1;
        List<Student> maps = new ArrayList<Student>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `studenttable` "
                        + "JOIN admissiontable on "
                        + "studenttable.studentID = admissiontable.StudentID "
                        + "WHERE admissiontable.ClassID = '"+classID+"' and "
                        + "admissiontable.Sec = '"+sec+"' and "
                        + "Name LIKE '%"+name+"%'";
                System.out.println(sql);
                Statement stmt=con.createStatement(); 
        
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                   Student Data = new Student();
                   Data.setRegID(String.valueOf(rs.getInt("studentID")));
                   Data.setName(rs.getString("Name"));
                   maps.add(Data);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return maps;  
    }

    @Override
    public List getStudentListByRegno(String regno) {
        int i = -1;
        List<Student> maps = new ArrayList<Student>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT studentID,Name FROM `studenttable` WHERE RegID = '"+regno+"'";
                Statement stmt=con.createStatement(); 
        
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                   Student Data = new Student();
                   Data.setRegID(String.valueOf(rs.getInt("studentID")));
                   Data.setName(rs.getString("Name"));
                   maps.add(Data);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print("Select Me error");
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
       
        return maps;
    }
    
}
