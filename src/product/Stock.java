/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author beeru
 */
public class Stock {
    private int id;
    private int Pid;
    private String PName;
    private double SellPrice;
    private String Size;
    private double Price;
    private int Quantity;
    private double Rate;
    private int Flag;
    private int RQuantity;
    private int status;
    private boolean check = false;

    /**
     * @return the Pid
     */
    public int getPid() {
        return Pid;
    }

    /**
     * @param Pid the Pid to set
     */
    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    /**
     * @return the SellPrice
     */
    public double getSellPrice() {
        return SellPrice;
    }

    /**
     * @param SellPrice the SellPrice to set
     */
    public void setSellPrice(double SellPrice) {
        this.SellPrice = SellPrice;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
        this.Size = Size;
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

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the Rate
     */
    public double getRate() {
        return Rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    /**
     * @return the Flag
     */
    public int getFlag() {
        return Flag;
    }

    /**
     * @param Flag the Flag to set
     */
    public void setFlag(int Flag) {
        this.Flag = Flag;
    }

    /**
     * @return the RQuantity
     */
    public int getRQuantity() {
        return RQuantity;
    }

    /**
     * @param RQuantity the RQuantity to set
     */
    public void setRQuantity(int RQuantity) {
        this.RQuantity = RQuantity;
    }

    /**
     * @return the PName
     */
    public String getPName() {
        return PName;
    }

    /**
     * @param PName the PName to set
     */
    public void setPName(String PName) {
        this.PName = PName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the check
     */
    public boolean isCheck() {
        return check;
    }

    /**
     * @param check the check to set
     */
    public void setCheck(boolean check) {
        this.check = check;
    }
}
