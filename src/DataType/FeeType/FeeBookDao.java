/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.FeeType;

/**
 *
 * @author kumar
 */
public interface FeeBookDao {
     int insertFeeBook(FeeBook[] feeBook);
     FeeBook[] selectFeeBook();
    int updateFeeBook(FeeBook[] feeBook);
}
