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
public class FeeBook {
  private int feeBookID;
  private String feeType;
  private int month;
  private int classID;
  private int session;

    /**
     * @return the feeBookID
     */
    public int getFeeBookID() {
        return feeBookID;
    }

    /**
     * @param feeBookID the feeBookID to set
     */
    public void setFeeBookID(int feeBookID) {
        this.feeBookID = feeBookID;
    }

    /**
     * @return the FeeType
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * @param feeType
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

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
     * @return the classID
     */
    public int getClassID() {
        return classID;
    }

    /**
     * @param classID the classID to set
     */
    public void setClassID(int classID) {
        this.classID = classID;
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
}
