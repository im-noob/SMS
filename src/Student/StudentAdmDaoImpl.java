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
                        + "`studenttable` WHERE studentID = '"+Regno+"'";
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery(sql);
                int i = 0 ;
                while(rs.next()){                    
                    i++;
                    System.out.println("retriving student infomration by regno :"+i);
//                    student.setStudentID(Integer.valueOf(rs.getString("studentID")));
//                    student.setRegID(rs.getString("RegID"));
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
//                    cls.setId(rs.getInt("ClassID"));
//                    cls.setName(rs.getString("Name"));
//                    cls.setTutionFee(rs.getInt("Fee"));
//                    cls.setComputer(rs.getInt("computer"));
                    

                }
                if(i == 0)
                    student = null;
               
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Select Me error");
                System.out.println(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
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
                System.out.println(sql);
                i = stm.executeUpdate();
                
//                return(i);
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        return i;
    }

    
    
    
    
    @Override
    public String insertNewAdmission(String regno,int studstudclass,String studsec,int TransID,Admission adm,int SessionId) {
        
        int i=0;
        int admno = 0 ;
        int rollNo = 0 ;
        int lastInsertID = 0 ;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                //Before Inserting checking for the dublicate entry..
                String sqlCheckExist = "SELECT EXISTS(SELECT * FROM admissiontable WHERE RegNo = "+regno+" and Session = "+SessionId+") as EXISTSRow";
                System.out.println("sqlCheckExist:"+sqlCheckExist);
                Statement stmtCheckExist=con.createStatement(); 
                ResultSet rsCheckExist = stmtCheckExist.executeQuery(sqlCheckExist);
                rsCheckExist.next();
                if(rsCheckExist.getInt("EXISTSRow") == 1){
                    System.out.println("check exists:"+rsCheckExist.getInt("EXISTSRow"));
                    return("-485:");
                }
                    
               
                
                
                String sqlFirst = "SELECT COUNT(*) as count from admissiontable WHERE ClassID = "+studstudclass+" and Session = "+SessionId+"";
                Statement stmt=con.createStatement(); 
               
               System.out.println("getting count for all student for next reg no:"+sqlFirst);
                ResultSet rs=stmt.executeQuery(sqlFirst);
                int NoOfStudent = 0 ;
                while(rs.next()){
                   NoOfStudent = rs.getInt("count");
                }
                
                
                String sqlSec = "SELECT COUNT(*) as count from admissiontable WHERE ClassID = "+studstudclass+" and Session = "+SessionId+" and Sec ='"+studsec+"'";
               
                System.out.println("getting count for all student for roll"+sqlSec);
                ResultSet rssec=stmt.executeQuery(sqlSec);
                int nexRoll = 0 ;
                while(rssec.next()){
                   nexRoll = rssec.getInt("count");
                }
                nexRoll++;
                System.out.println("noof nexRoll:"+nexRoll);
                
                
                String sql = "INSERT INTO `admissiontable`(  `RegNo`,`AdmissionSlNo`, `ClassID`, `Sec`, `Roll`, `TransportID`, "
                        + "`Status`, `Session`, `transportFee`, `tutionFee`) "
                        + "VALUES (?,(select classtable.code FROM classtable WHERE ClassID = ?) + ?+1,?,?,?,?,?,"+SessionId+",?,? )";
                System.out.println("this is sql :"+sql);
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setInt(1,Integer.valueOf(regno));
                stm.setInt(2, studstudclass);
                stm.setInt(3, NoOfStudent);
                stm.setInt(4,studstudclass);
                stm.setString(5,studsec);
                stm.setString(6,String.valueOf(nexRoll));
                stm.setInt(7,TransID);
                stm.setString(8,"1");
                stm.setInt(9, adm.getTransportFee());
                stm.setInt(10, adm.getTutionFee());

                i = stm.executeUpdate();
                ResultSet rsGetInsId = stm.executeQuery("select last_insert_id() as last_id from admissiontable");
                rsGetInsId.next();
                lastInsertID = rsGetInsId.getInt("last_id");
                System.out.println("lastInsertID:"+lastInsertID);
                System.out.println("I in admion stage 2 :"+i);
                if(TransID != 0){
                    String sqlrouteTrans = "INSERT INTO `transportfeetable`("
                        + " `RegNo`, `session`, `routeID`) "
                        + "VALUES ('"+regno+"','"+SessionId+"','"+TransID+"')";
                  
                    System.out.println("routesql:"+sqlrouteTrans);
                    
                    Statement stmtTrans=con.createStatement(); 
                    stmtTrans.executeUpdate(sqlrouteTrans);
       
                }
                if(i!=0){
                     String sqlGetAdmndRoll = "SELECT AdmissionSlNo,Roll FROM "
                            + "admissiontable WHERE "
                            + "AdmissionID = "+lastInsertID ;
                    System.out.println("sql amdion nd roll no "+sqlGetAdmndRoll);
                    ResultSet rsGetrollAdm = stm.executeQuery(sqlGetAdmndRoll);
                    while(rsGetrollAdm.next()){
                        admno = rsGetrollAdm.getInt("AdmissionSlNo");
                        rollNo = rsGetrollAdm.getInt("Roll");
                    }  
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
         }
        return(i+":"+admno+":"+rollNo); 
    }

    List getNonTeachingList() {//getting class list
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
                System.out.println("Select Me error");
                System.out.println(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
         }
       
        return arrNameList;
    }
}


