/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.List;

/**
 *
 * @author aarav
 */

public interface StudentACDao {
    List getStudentListByName(String name,String classID,String sec);
    List getStudentListByRegno(String regno);
    
}