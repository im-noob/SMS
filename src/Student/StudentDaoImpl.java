/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class StudentDaoImpl implements StudentDao {
//    @Override
//    public Student[] selectStudent() {
//        int i = -1;
//        Student[] cls = new Student[30];
//        Connection con =new DBConnection().connectDB();
//        if(con !=null ){
//            try {
//                String sql = "SELECT `ClassID`, `Name`, `Fee`, `computer` FROM `classtable`";
//               Statement stmt=con.createStatement();  
//                ResultSet rs=stmt.executeQuery(sql);
//                while(rs.next()){
//                   i+=1;
//                    cls[i] =new Student();
//                    
////                    cls[i].setId(rs.getInt("ClassID"));
////                    cls[i].setName(rs.getString("Name"));
////                    cls[i].setTutionFee(rs.getInt("Fee"));
////                    cls[i].setComputer(rs.getInt("computer"));
//                    
//                }
//               
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.print("Select Me error");
//                System.out.print(ex);
//            }
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.print(ex);
//            }
//         }
//       
//        return cls;
//    }

//    @Override
//    public int updateStudent(Student student) {
//        int i=0;
//        Connection con =new DBConnection().connectDB();
//        if(con !=null ){
//            try {
//                String sql = "UPDATE `classtable` SET `Name`=?,`Fee`=?,`computer`=? WHERE  `ClassID`=?";
//                PreparedStatement stm=con.prepareStatement(sql);
//                stm.setString(1,student.getName());
////                stm.setInt(2,student.getTutionFee());
////                stm.setInt(3,student.getComputer());
////                stm.setInt(4,student.getId());
//                i = stm.executeUpdate();
//               
//                
//            } catch (SQLException ex) {
//                System.out.print("\n\nError during update");
//                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//                
//                System.out.print(ex);
//            }
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                  System.out.print("\n\nError during update");
//                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.print(ex);
//            }
//         }
//        return i;
//    }

    @Override
    public int insertStudent(Student student) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `studenttable`"
                        + "( `Name`, `Father`, `Mother`, `At`, `PO`, `PS`,"
                        + " `Dist`, `State`, `Pin`, `ph1`, `ph2`, `Nationality`,"
                        + " `Gender`, `DOB`, `Religion`, `Caste`, `refByID`,"
                        + " `RegID`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setString(1,student.getName());
                stm.setString(2,student.getFather());
                stm.setString(3,student.getMother());
                stm.setString(4,student.getAt());
                stm.setString(5,student.getPo());
                stm.setString(6,student.getPs());
                stm.setString(7,student.getDist());
                stm.setString(8,student.getState());
                stm.setString(9,student.getPin());
                stm.setString(10,student.getPh1());
                stm.setString(11,student.getPh2());
                stm.setString(12,student.getNationality());
                stm.setString(13,student.getGender());
                Date dob = student.getDob();
                java.sql.Date studsqldob = new java.sql.Date(dob.getTime());
                stm.setDate(14,studsqldob);

                stm.setString(15,student.getReligion());
                stm.setString(16,student.getCaste());
                stm.setString(17,student.getRefBy());

                stm.setString(18,student.getRegID());
                i = stm.executeUpdate();
                
                return(i);
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
        }
        return i;
    }

    @Override
    public int getIDForNewAdmission() {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `classtable`(`Name`, `Fee`, `computer`) VALUES (?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql);
                i = stm.executeUpdate();  
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }

    List getNonTeachingList() {
        int i = -1;
        List<Map<Integer, String>> maps = new ArrayList<Map<Integer, String>>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `employtable` WHERE type = \"Non-Teaching\"";
                Statement stmt=con.createStatement(); 
        
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                   Map<Integer, String> Data = new HashMap<>();
                   Data.put( rs.getInt("EmpID"), rs.getString("name"));
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
