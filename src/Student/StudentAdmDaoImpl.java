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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aarav
 */
public class StudentAdmDaoImpl implements StudentAdmDao {

    @Override
    public Student getStudentData(String Regno) {
        Student student = new Student();
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT `studentID`, `Name`, `Father`, `Mother`,"
                        + " `At`, `PO`, `PS`, `Dist`, `State`, `Pin`, `ph1`, "
                        + "`ph2`, `Nationality`, `Gender`, `DOB`, `Religion`,"
                        + " `Caste`, `refByID`, `RegID`, `create_at` FROM "
                        + "`studenttable` WHERE RegID = '"+Regno+"'";
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){                    
                    
                    student.setStudentID(Integer.valueOf(rs.getString("studentID")));
                    student.setRegID(rs.getString("RegID"));
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
//                    cls.setId(rs.getInt("ClassID"));
//                    cls.setName(rs.getString("Name"));
//                    cls.setTutionFee(rs.getInt("Fee"));
//                    cls.setComputer(rs.getInt("computer"));
                    

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
       
        return student;
    }

    @Override
    public int updateStudent( Student student,int regno) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "UPDATE `studenttable` SET "
                        + "`Name`=?,"
                        + "`Father`=?,"
                        + "`Mother`=?,"
                        + "`At`=?,"
                        + "`PO`=?,"
                        + "`PS`=?,"
                        + "`Dist`=?,"
                        + "`State`=?,"
                        + "`Pin`=?,"
                        + "`ph1`=?,"
                        + "`ph2`=?,"
                        + "`Nationality`=?,"
                        + "`Gender`=?,"
                        + "`DOB`=?,"
                        + "`Religion`=?,"
                        + "`Caste`=?,"
                        + "`refByID`=?,"
                        + "`RegID`=?"
                        + "WHERE studentID = "+regno;
                
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
                System.out.print(sql);
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
    public int insertNewAdmission(int StudID,String regno,String studroll,int studstudclass,String studsec) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `admissiontable`( `StudentID`,"
                        + " `RegNo`, `ClassID`, `Sec`, `Roll`, `TransportID`, "
                        + "`Status`, `Session`) "
                        + "VALUES (?,?,?,?,?,?,?,(SELECT COALESCE(max(sessionID),0) FROM `sessiontable`) )";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setInt(1,StudID);
                stm.setString(2,regno);
                stm.setInt(3,studstudclass);
                stm.setString(4,studsec);
                stm.setString(5,studroll);
                stm.setString(6,"0");
                stm.setString(7,"1");

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
        List<Integer> arrIdList = new ArrayList<Integer>();
               List<String> arrNameList = new ArrayList<String>();
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT * FROM `classtable`";
               Statement stmt=con.createStatement(); 
               
               
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                   arrNameList.add(rs.getString("name"));
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
       
        return arrNameList;
    }
}


