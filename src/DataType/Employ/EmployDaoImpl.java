/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Employ;

import DataType.Classes.ClassesDaoImpl;
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
public class EmployDaoImpl implements EmployDao{

    @Override
    public int insertEmploy(Employ employ) {
           int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `employtable`(`Name`, `address`,  `ph1`, `ph2`, `email`, `type`,  `cast`, `religion`, `father`, `mother`, `DOB`, `Gender`, `ph3`, `aadhar`, `salary`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                stm.setString(1,employ.getName());
                stm.setString(2, employ.getAddress());
                stm.setString(3, employ.getPh1());
                stm.setString(4, employ.getPh2());
                stm.setString(5, employ.getEmail());
                stm.setString(6, employ.getType());
                stm.setString(7, employ.getCast());
                stm.setString(8,employ.getReligion());
                stm.setString(9, employ.getFather());
                stm.setString(10,employ.getMother());
                stm.setDate(11,new java.sql.Date(employ.getDob().getTime()));
                stm.setInt(12,employ.getGender());
                stm.setString(13,employ.getPh3());
                stm.setString(14,employ.getAadhar());
                stm.setInt(15,employ.getSalary());
                stm.executeUpdate();
               ResultSet rs = stm.getGeneratedKeys();
               rs.next();
               i =rs.getInt(1);
                
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
        else{
            System.out.printf("Integer value is not connect");
        }
        System.out.printf("Integer value is %d", i);
        return i;
    }

    @Override
    public Employ[] selectEmploy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateEmploy(Employ employ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
