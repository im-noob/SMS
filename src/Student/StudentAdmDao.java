/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author aarav
 */
public interface StudentAdmDao {
    Student getStudentData(String Regno);
    int updateStudent(Student Student,int regno);
    int insertNewAdmission(int studID, String regno, String studroll,int studstudclass,String studsec);
}