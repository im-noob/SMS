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
public class Cart {
    
    private int cId;
    private double price;
    private double dues;
    private double discount;
    private int status;
    private int admissionId;
    private int session;
    private String created_at;

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the dues
     */
    public double getDues() {
        return dues;
    }

    /**
     * @param dues the dues to set
     */
    public void setDues(double dues) {
        this.dues = dues;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
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
     * @return the admissionId
     */
    public int getAdmissionId() {
        return admissionId;
    }

    /**
     * @param admissionId the admissionId to set
     */
    public void setAdmissionId(int admissionId) {
        this.admissionId = admissionId;
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
     * @return the cId
     */
    public int getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(int cId) {
        this.cId = cId;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    
}
