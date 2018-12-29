/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Expence;

/**
 *
 * @author kumar
 */
public interface ExpenceDao {
     int insertExpence(Expence expence);
     Expence[] selectExpence(Expence expence);
    int updateExpence(Expence expence);
}
