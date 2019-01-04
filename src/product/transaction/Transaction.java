/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.transaction;

/**
 *
 * @author beeru
 */
public class Transaction {
    private int Tid;
    private int AdmissionID =0;
    private int RegNo;
    private int ProductID;
    private int Quntity;
    private double Price;
    private String Session;
    private int sid;
    private int status;
    private int cart_id;
    private String name;

    /**
     * @return the AdmissionID
     */
    public int getAdmissionID() {
        return AdmissionID;
    }

    /**
     * @param AdmissionID the AdmissionID to set
     */
    public void setAdmissionID(int AdmissionID) {
        this.AdmissionID = AdmissionID;
    }

    /**
     * @return the RegNo
     */
    public int getRegNo() {
        return RegNo;
    }

    /**
     * @param RegNo the RegNo to set
     */
    public void setRegNo(int RegNo) {
        this.RegNo = RegNo;
    }

    /**
     * @return the ProductID
     */
    public int getProductID() {
        return ProductID;
    }

    /**
     * @param ProductID the ProductID to set
     */
    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * @return the Quntity
     */
    public int getQuntity() {
        return Quntity;
    }

    /**
     * @param Quntity the Quntity to set
     */
    public void setQuntity(int Quntity) {
        this.Quntity = Quntity;
    }

    /**
     * @return the Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getSession() {
        return Session;
    }

    /**
     * @param Session the Session to set
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the cart_id
     */
    public int getCart_id() {
        return cart_id;
    }

    /**
     * @param cart_id the cart_id to set
     */
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Tid
     */
    public int getTid() {
        return Tid;
    }

    /**
     * @param Tid the Tid to set
     */
    public void setTid(int Tid) {
        this.Tid = Tid;
    }
}
