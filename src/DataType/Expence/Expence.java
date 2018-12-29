/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType.Expence;

import java.util.Date;

/**
 *
 * @author kumar
 */
public class Expence {
   private int expenceID;
   private String title;
   private int price;
   private String remark;
   private Date date;

    /**
     * @return the expenceID
     */
    public int getExpenceID() {
        return expenceID;
    }

    /**
     * @param expenceID the expenceID to set
     */
    public void setExpenceID(int expenceID) {
        this.expenceID = expenceID;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
