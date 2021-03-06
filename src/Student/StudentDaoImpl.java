/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import DataType.Employ.Employ;
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
        int LastID = -1;
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
                ResultSet rsGetInsId = stm.executeQuery("select last_insert_id() as last_id from studenttable");
                rsGetInsId.next();
                LastID = rsGetInsId.getInt("last_id");
                return(LastID);
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
        List<Employ> maps = new ArrayList<Employ>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `employtable` WHERE type = \"Non-Teaching\"";
                Statement stmt=con.createStatement(); 
        
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                   Employ Data = new Employ();
                   Data.setName(rs.getString("name"));
                   Data.setId(rs.getInt("EmpID"));
//                   Data.put( rs.getInt("EmpID"), rs.getString("name"));
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
    
    List getStudentbyClass(String classDe) {
        int i = -1;
        List<Student> maps = new ArrayList<Student>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `studenttable` "
                        + "JOIN admissiontable "
                        + "on admissiontable.RegNo = studenttable.studentID "
                        + "WHERE admissiontable.ClassID = '"+classDe+"'";
                Statement stmt=con.createStatement(); 
        
                ResultSet rs=stmt.executeQuery(sql);
                
                while(rs.next()){
                    Student student = new Student();
                    student.setRegID(rs.getString("studentID"));

                    student.setRefBy(rs.getString("refByID"));
                    student.setName(rs.getString("Name"));
                    student.setFather(rs.getString("Father"));
                    student.setDob(rs.getDate("DOB"));
                    student.setMother(rs.getString("Mother"));
                    student.setAt(rs.getString("At"));
                    student.setPo(rs.getString("PO"));
                    student.setPs(rs.getString("PS"));
                    student.setDist(rs.getString("Dist"));
                    student.setPin(rs.getString("Pin"));
                    student.setState(rs.getString("State"));
                    student.setNationality(rs.getString("Nationality"));
                    student.setCaste(rs.getString("Caste"));
                    student.setReligion(rs.getString("Religion"));
                    student.setPh1(rs.getString("ph1"));
                    student.setPh2(rs.getString("ph2"));
                    student.setGender(String.valueOf(rs.getInt("Gender")));
//                  
                    maps.add(student);
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
