/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.FeeType;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumar
 */
public class FeeBookDaoImpl implements FeeBookDao {

    @Override
    public int insertFeeBook(FeeBook[] feeBooks) {
         int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            for(FeeBook feeBook: feeBooks ){
                try {
                    String sql = "INSERT INTO `feereceiptmanagertable`(`MonthCode`, `feeType`, `ClassID`, `SessionID`) VALUES (?,?,?,?)";
                    PreparedStatement stm=con.prepareStatement(sql);
                    stm.setInt(1,feeBook.getMonth());
                    stm.setString(2,feeBook.getFeeType());
                    stm.setInt(3, feeBook.getClassID());
                    stm.setInt(4,feeBook.getSession());
                    i = stm.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FeeBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.print(ex);
                }
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeeBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }

    @Override
    public FeeBook[] selectFeeBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateFeeBook(FeeBook[] feeBook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
