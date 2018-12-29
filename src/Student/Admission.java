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
public class Admission {
    private int StudentID;
    private String admissionID;
    private int roll;
    private int tutionFee;
    private int transportFee;

    /**
     * @return the StudentID
     */
    public int getStudentID() {
        return StudentID;
    }

    /**
     * @param StudentID the StudentID to set
     */
    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    /**
     * @return the admissionID
     */
    public String getAdmissionID() {
        return admissionID;
    }

    /**
     * @param admissionID the admissionID to set
     */
    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    /**
     * @return the tutionFee
     */
    public int getTutionFee() {
        return tutionFee;
    }

    /**
     * @param tutionFee the tutionFee to set
     */
    public void setTutionFee(int tutionFee) {
        this.tutionFee = tutionFee;
    }

    /**
     * @return the transportFee
     */
    public int getTransportFee() {
        return transportFee;
    }

    /**
     * @param transportFee the transportFee to set
     */
    public void setTransportFee(int transportFee) {
        this.transportFee = transportFee;
    }

    /**
     * @return the roll
     */
    public int getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(int roll) {
        this.roll = roll;
    }
    
}
