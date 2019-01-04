/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.transaction;

import product.Stock;

/**
 *
 * @author beeru
 */
public interface TransactionDao {
    public Stock[] selectStock();
    public String[] selectStudent(String str);
    public int insertTransaction(Transaction trn);
    public int UpdateStock(Stock stk);
}
