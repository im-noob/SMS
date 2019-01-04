/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import DataType.FeeType.FeeCalc;
import DataType.FeeType.FeeCalcDaoImpl;
import Database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                        + "studenttable.studentID = admissiontable.RegNo "
                        + "WHERE admissiontable.ClassID = '"+classID+"' and "
                        + "admissiontable.Sec = '"+sec+"' and "
                        + "Name LIKE '%"+name+"%'";
                System.out.println("ql studentlist by name :"+sql);
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
                String sql = "SELECT studentID,Name FROM `studenttable` WHERE studentID = '"+regno+"'";
                System.out.println("ql studentlist by reg no :"+sql);
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

    List getUniqueAddressList() {
        int i = -1;
        List<String> maps = new ArrayList<String>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "SELECT DISTINCT CONCAT( At,', ',PO,', ',ps,', ',Dist,', ',State) as Address FROM `studenttable` ORDER BY `studentID` ASC";
                System.out.println("ql studentlist by reg no :"+sql);
                Statement stmt=con.createStatement(); 
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                   maps.add(rs.getString("Address"));
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
       
        return maps;    }

    List getStudentListByFatherName(String fname, String address) {
        int i = -1;
        List<Student> maps = new ArrayList<Student>();

        
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "select studentID,Name FROM studenttable WHERE CONCAT( At,', ',PO,', ',ps,', ',Dist,', ',State) = '"+address+"' and Father LIKE '%"+fname+"%'";
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

    FeeTypeClass getAllFee(String regID) {
        int i = -1;

        FeeTypeClass Data = new FeeTypeClass();
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                String sqlSupplyOld = "SELECT * FROM `cart_table` WHERE RegID = "+regID+" and session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                
                String sqlSales = "SELECT COALESCE(SUM(Dues),0) AS SalesFee FROM cart_table WHERE RegID = "+regID+" AND session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                String sqlTrans = "SELECT transportFee *  TIMESTAMPDIFF(MONTH, created_at, CURRENT_TIMESTAMP()) as TransFee FROM `admissiontable` WHERE RegNo = "+regID+" and Session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                String sqlclassID = "SELECT ClassID,tutionFee FROM admissiontable WHERE RegNo = "+regID+" and Session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                String sqlAllOhterFee = "";
               
//                for sales
                Statement stmtSales=con.createStatement(); 
                ResultSet rsSales = stmtSales.executeQuery(sqlSales);
                rsSales.next();
                Data.setsupplyFee(rsSales.getInt("SalesFee"));
                
//                for tranport 
                Statement stmtTrans=con.createStatement(); 
                ResultSet rsTrans = stmtTrans.executeQuery(sqlTrans);
                rsTrans.next();
                Data.setTransFee(rsTrans.getInt("TransFee"));
               
                
                // for other fee calulation
                
                Statement stmtClassID=con.createStatement(); 
                ResultSet rsClassID = stmtClassID.executeQuery(sqlclassID);
                rsClassID.next();
                int classIDIS = rsClassID.getInt("ClassID");
                int tutionFee = rsClassID.getInt("tutionFee");
                FeeCalc fc = new FeeCalc();
                System.out.println("seidngin classs:"+classIDIS);
                fc.setClassId(classIDIS);
                FeeCalcDaoImpl fcdi = new FeeCalcDaoImpl();
                FeeCalc fcList [] = fcdi.selectFeeCalc(fc);
                int idExamC = 0,idCompFeeC = 0,idAnulC = 0,idTutFeeC = 0;
                System.out.println("row count of fee list revcied in student acimpl :"+fcList.length);
                for(int j = 0 ; j < fcList.length ; j++){
                    String feeType = fcList[j].getFeeTypeName();
                    System.out.println("feetype each row in studenacimpl:"+feeType+" feeetype name:"+fcList[j].getFeeTypeName());
                    if(feeType.equals("Examination Fee")) 
                        idExamC++;
                    else if(feeType.equals("Computer Fee")) 
                        idCompFeeC++;
                    else if(feeType.equals("Annual Fee")) 
                        idAnulC++;
                    else if(feeType.equals("Tuition  Fee"))
                        idTutFeeC++;

                }
                
                System.out.println("idExamC:"+idExamC+" idcomfeeC:"+idCompFeeC+" idAnualc:"+idAnulC+" idtuic:"+idTutFeeC);
                System.out.println("Exam feec out:"+idExamC+" Computer fec outn:"+idCompFeeC+" anl fee count:"+idAnulC);
                
                sqlAllOhterFee = "SELECT examFee AS EF ,computer AS CF, annual as AF FROM classtable WHERE ClassID = "+classIDIS+" and session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                
                System.out.println("other sql:"+sqlAllOhterFee);
                Statement stmtAllOhterFee=con.createStatement(); 
                ResultSet rsAllOhterFee = stmtAllOhterFee.executeQuery(sqlAllOhterFee);
                rsAllOhterFee.next();
                int examFee = rsAllOhterFee.getInt("EF");
                int compFee = rsAllOhterFee.getInt("CF");
                int annualFee = rsAllOhterFee.getInt("AF");
                
                
                
                System.out.println("examFeeC:"+examFee+" compFeeC:"+compFee+" cnnualfeeC:"+annualFee+" tutinfeeC:"+tutionFee);
                Data.settutionFee(idTutFeeC*tutionFee);                
                Data.setexamFee(idExamC*examFee);                
                Data.setcompFee(idCompFeeC*compFee);                
                Data.setannualFee(idAnulC*annualFee);      
                
                System.out.println("tranFe:"+Data.getTransFee()+" support:"+Data.getsupplyFee()+" supply:"+Data.getsupplyFee()+" TutionFee:"+Data.gettutionFee()+" Examfe:"+Data.getexamFee()+" compFee:"+Data.getcompFee()+" anualfee:"+Data.getannualFee());
                
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
       
        return Data;  
    }

    int paidTheFee(int discAMT, int PaidAMT) {
        String sqlInsertPaid = "INSERT INTO `feetransactiontable`(`RegNo`, `sessionID`, `FeeType`, `feePaid`, `discount`) VALUES ('Regno','sessin','feetype','fpaid','dues');";
        int i = 0;
        try{
            Connection con =new DBConnection().connectDB();
            Statement stmtInsertPaid = con.createStatement(); 
            i = stmtInsertPaid.executeUpdate(sqlInsertPaid);
            
        }catch(Exception e){
            System.out.println("Excpetion paidthefEe:"+e.getMessage());
        }
        return(i);
    }

   
}
