/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author beeru
 */
public class StockDaoImpl implements StockDao {

    @Override
    public int InsertStock(Stock stk) {
        int i=0;
        Connection con =new DBConnection().connectDB();
        if(con !=null ){
            try {
                String sql = "INSERT INTO `productstocktable`(`ProductID`, `SellPrice`, `Size`, `Price`, `Quantity`, `Rate`, `Flag`, `RQuantity`) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement stm=con.prepareStatement(sql);
                stm.setInt(1,stk.getPid());
                stm.setDouble(2,stk.getSellPrice());
                stm.setString(3, stk.getSize());
                stm.setDouble(4, stk.getPrice());
                stm.setInt(5, stk.getQuantity());
                stm.setDouble(6, stk.getRate());
                stm.setInt(7, stk.getFlag());
                stm.setInt(8, stk.getRQuantity());
                i = stm.executeUpdate();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(ClassesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex);
            }
         }
        return i;
    }
    
}
