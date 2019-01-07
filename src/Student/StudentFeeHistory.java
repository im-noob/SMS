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
class StudentFeeHistory {
    private String feeTransID;
    private String SessionName;
    private String  FeeType; 
    private String feePaid;
    private String  discount;
    private String  created_at;
    
    public String getfeeTransID(){
        return feeTransID;
    }
    public void setfeeTransId(String feeTransID){
        this.feeTransID = feeTransID;
    }
    
    public String getSessionName(){
        return SessionName;
    }
    public void setSessionName(String SessionName){
        this.SessionName = SessionName;
    }
    
    public String getFeeType(){
        return FeeType;
    }
    public void setFeeType(String FeeType){
        this.FeeType = FeeType;
    }
    
    public String getdiscount(){
        return discount;
    }
    public void setdiscount(String discount){
        this.discount = discount;
    }
    
    public String getfeePaid(){
        return feePaid;
    }
    public void setfeePaid(String feePaid){
        this.feePaid = feePaid;
    }
    
    public String getcreated_at(){
        return created_at;
    }
    public void setcreated_at(String created_at){
        this.created_at = created_at;
    }
    
}
