/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author kumar 
 */
public interface StudentDao {
    int insertStudent(Student classes);
//     Student[] selectStudent();
//    int updateStudent(Student classes);
    int getIDForNewAdmission();
}
