/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Employ;

/**
 *
 * @author kumar
 */
public interface EmployDao {
    int insertEmploy(Employ employ);
     Employ[] selectEmploy();
    int updateEmploy(Employ employ);
}
