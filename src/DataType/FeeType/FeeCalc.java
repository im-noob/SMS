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
public class FeeCalc {
    private int month;
    private String feeTypeName;
    private int feeTypeId;
    private int session;
    private String className;
    private int classId;
    private int feebookid;

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the fee
     */
    public String getFeeTypeName() {
        return feeTypeName;
    }

    /**
     * @param fee the fee to set
     */
    public void setFeeTypeName(String feeTypeName) {
        this.feeTypeName = feeTypeName;
    }

    /**
     * @return the session
     */
    public int getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(int session) {
        this.session = session;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the classId
     */
    public int getClassId() {
        return classId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(int classId) {
        this.classId = classId;
    }

    /**
     * @return the feebookid
     */
    public int getFeebookid() {
        return feebookid;
    }

    /**
     * @param feebookid the feebookid to set
     */
    public void setFeebookid(int feebookid) {
        this.feebookid = feebookid;
    }

    /**
     * @return the feeTypeId
     */
    public int getFeeTypeId() {
        return feeTypeId;
    }

    /**
     * @param feeTypeId the feeTypeId to set
     */
    public void setFeeTypeId(int feeTypeId) {
        this.feeTypeId = feeTypeId;
    }
}
