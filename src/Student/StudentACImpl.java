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
import java.util.Arrays;
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
        FeeTypeClass newPureData = new FeeTypeClass();//for sending after subtracacting paided fee

        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                
                String sqlSupplyOld = "SELECT * FROM `cart_table` WHERE RegID = "+regID+" and session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                
                String sqlSales = "SELECT COALESCE(SUM(Dues),0) AS SalesFee FROM cart_table WHERE RegID = "+regID+" AND session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
//                String sqlTrans = "SELECT transportFee *  TIMESTAMPDIFF(MONTH, created_at, CURRENT_TIMESTAMP()) as TransFee FROM `admissiontable` WHERE RegNo = "+regID+" and Session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                String sqlTrans = " SELECT transportFee as TransFee FROM `admissiontable` WHERE RegNo = "+regID+" and Session = (SELECT COALESCE(max(sessionID),0) FROM `sessiontable`)";
                String sqlTransCalc = "";
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
                int TransMothlyFee = rsTrans.getInt("TransFee");
                Statement stmtTrnasCalc = con.createStatement();
                
                sqlTransCalc = "SELECT TIMESTAMPDIFF"
                        + "(MONTH, created_id, CURRENT_TIMESTAMP()) as TransFee"
                        + " FROM transportfeetable WHERE RegNo = "+regID+" and "
                        + "Session = (SELECT COALESCE(max(sessionID),0) "
                        + "FROM `sessiontable`)";
                System.out.println("sqlTransCalc:"+sqlTransCalc);
                ResultSet rsTransCalc = stmtTrnasCalc.executeQuery(sqlTransCalc);
                int TranRate = 0 ;
                while(rsTransCalc.next()){
                    TranRate =  (rsTransCalc.getInt("TransFee"));
                }
                System.out.println("all trnas fee:"+TranRate*TransMothlyFee);
                
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
                Data.setOldFee(0);
                
                //now subtracting all paided fee after retriving
                String sqlAllPaid = "SELECT FeeType,"
                        + "SUM(feePaid+discount) as allfee FROM "
                        + "`feetransactiontable` "
                        + "WHERE RegNo = "+regID+" and "
                        + "sessionID = ("
                            + "SELECT COALESCE(max(sessionID),0) "
                            + "FROM `sessiontable`"
                        + ") "
                        + "GROUP BY FeeType";
                Statement stmtAllPaid=con.createStatement(); 
                ResultSet rsAllPaid = stmtAllPaid.executeQuery(sqlAllPaid);
                System.out.println("retrive paid data sql:"+sqlAllPaid);
                while(rsAllPaid.next()){
                    
                    String tempFeeType = rsAllPaid.getString("FeeType");
                    int tempFee = rsAllPaid.getInt("allfee");
                    System.out.println("feePaidDta: fetype:"+tempFeeType+" tmepfee:"+tempFee);
                    if(tempFeeType.equals("Computer Fee")){
                        Data.setcompFee(Data.getcompFee() - tempFee); 
                        System.out.println("comfe:"+(Data.getcompFee() - tempFee)+" fee:"+Data.getcompFee()+" paid fee:"+tempFee);

                    }else if(tempFeeType.equals("Old Fee")){
                        Data.setOldFee(Data.getOldFee() - tempFee);
                    }else if(tempFeeType.equals("Supply Fee")){
                        Data.setsupplyFee(Data.getsupplyFee() - tempFee);
                    }else if(tempFeeType.equals("Transport Fee")){
                        Data.setTransFee(Data.getTransFee() - tempFee);
                    }else if(tempFeeType.equals("Other Fee")){
//                        Data.setOldFee(Data.getOldFee()- tempFee);
                    }else if(tempFeeType.equals("Tuition  Fee")){
                        Data.settutionFee(Data.gettutionFee() - tempFee);  
                    }else if(tempFeeType.equals("Annual Fee")){
                        Data.setannualFee(Data.getannualFee() - tempFee);
                    }else if(tempFeeType.equals("Examination Fee")){
                        Data.setexamFee(Data.getexamFee() - tempFee);
                    }
                        
                        
                                      
                                        
                                       
                              
                        
                }
                
                System.out.println("tranFe:"+Data.getTransFee()+" support:"+Data.getsupplyFee()+" supply:"+Data.getsupplyFee()+" TutionFee:"+Data.gettutionFee()+" Examfe:"+Data.getexamFee()+" compFee:"+Data.getcompFee()+" anualfee:"+Data.getannualFee());
//                System.out.println("New data after paid cal: tranFe:"+newPureData.getTransFee()+" support:"+newPureData.getsupplyFee()+" supply:"+newPureData.getsupplyFee()+" TutionFee:"+newPureData.gettutionFee()+" Examfe:"+newPureData.getexamFee()+" compFee:"+newPureData.getcompFee()+" anualfee:"+newPureData.getannualFee());

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

    int paidTheFee(int discAMT, int PaidAMT,String selectedRegNO,FeeTypeClass ftc) {
        
        int PaidAMTC = PaidAMT;
        int discAMTC = discAMT;
        int []feeDUES = new int[8];
        
        int feeDis[] = new int[8];
        Arrays.fill(feeDis,0);
        int feePaid[] = new int[8];
        Arrays.fill(feePaid, 0);
        String[] feeTypeOrder ={"Old Fee","Supply Fee","Transport Fee"
                ,"Other Fee","Tuition  Fee","Annual Fee","Examination Fee",
            "Computer Fee"};
        // OldFee
                feeDUES[0] = ftc.getOldFee();
        // supplyFee 
                feeDUES[1] = ftc.getsupplyFee();
        // TransFee 
                feeDUES[2]= ftc.getTransFee();

        // otherFee 
                feeDUES[3] = ftc.getotherFee();
        // tutionFee 
                feeDUES[4] = ftc.gettutionFee();
        // annualFee 
                feeDUES[5] = ftc.getannualFee();
        // examFee 
                feeDUES[6] = ftc.getexamFee();
        // compFee = 
                feeDUES[7] = ftc.getcompFee();

        
        for(int i = 0 ; i < 8 ; i++){
            if(discAMT>0){
                if(discAMT>feeDUES[i]){
                    discAMT -= feeDUES[i];
                    feeDis[i] = feeDUES[i];                     
                    feeDUES[i] = 0;
                }else{
                    feeDUES[i] = feeDUES[i] - discAMT;
                    feeDis[i] = discAMT;
                    break;
                } 
            }
        }
        
        for(int i = 0 ; i < 8 ; i++){
            if(PaidAMT>0){
                if(PaidAMT>feeDUES[i]){
                    PaidAMT -= feeDUES[i];
                    feePaid[i] = feeDUES[i];                     
                    feeDUES[i] = 0;
                }else{
                    feeDUES[i] = feeDUES[i] - PaidAMT;
                    feePaid[i] = PaidAMT;
                    break;
                } 
            }
        }
        
        System.out.println("disc:"+discAMTC+" paid:"+PaidAMTC);
        int sDis = 0 ;        
        int sPaid = 0 ;

//        for(int i = 0 ; i<8 ; i++){
//            sDis += feeDis[i];
//            sPaid += feePaid[i];
//            System.out.println("type:"+feeTypeOrder[i]+" disc:"+feeDis[i]+" paid:"+feePaid[i]);
//        }        
        System.out.println("totaldis:"+sDis+" ttal paid:"+sPaid);
        int i = 0;
        try{
            for(int j = 0 ; j<8 ; j++){
                if(feePaid[j]==0 && feeDis[j]==0)
                    continue;
                String sqlInsertPaid = "INSERT INTO `feetransactiontable`"
                        + "(`RegNo`, `sessionID`, `FeeType`, `feePaid`,"
                        + " `discount`) "
                        + "VALUES ('"+selectedRegNO+"',"
                        + "(SELECT COALESCE(max(sessionID),0) FROM `sessiontable`),"
                        + "'"+feeTypeOrder[j]+"',"
                        + "'"+feePaid[j]+"','"+feeDis[j]+"');";
                System.out.println("sql in insert paid:"+sqlInsertPaid);
                Connection con =new DBConnection().connectDB();
                Statement stmtInsertPaid = con.createStatement(); 
                i = stmtInsertPaid.executeUpdate(sqlInsertPaid);
                i+=i;
                con.close();
            }
            
            
        }catch(Exception e){
            System.out.println("Excpetion paidthefEe:"+e.getMessage());
        }
        return(i);
    }

    List getAllHistory(String regID) {
        Connection con =new DBConnection().connectDB();
            
        String sqlHist = "SELECT feeTransID,sessiontable.Name as sn,FeeType,"
                + "feePaid,discount,created_at "
                + "FROM `feetransactiontable` "
                + "JOIN sessiontable on "
                + "sessiontable.sessionID = feetransactiontable.sessionID "
                + " WHERE RegNo = "+regID+" ORDER BY `created_at` DESC";
        System.out.println("get historysql:"+sqlHist);

        List<StudentFeeHistory> Data = new ArrayList<StudentFeeHistory>();
        
        try {
            
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sqlHist);
            while(rs.next()){
                StudentFeeHistory sfh = new StudentFeeHistory();
                sfh.setFeeType(rs.getString("FeeType"));
                sfh.setSessionName(rs.getString("sn"));
                sfh.setcreated_at(rs.getString("created_at"));
                sfh.setdiscount(rs.getString("discount"));
                sfh.setfeePaid(rs.getString("feePaid"));
                sfh.setfeeTransId(rs.getString("feeTransID"));
                Data.add(sfh);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentACImpl.class.getName()).log(Level.SEVERE, null, ex);
            return(null);
        }
        return(Data);
    }   
    

   
}
