/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Feed {

    private String feedName;
    private String feedBarCode;
    private String feedSize;
    private int feedQuantity;
    private int feedPurchasePrice;
    private int feedSellPrice;
    private String factoryLisence;
    private String vetrinaryID;
    private DBConnection connect;

    public String getVetrinaryID() {
        return vetrinaryID;
    }

    public Feed(DBConnection connect) {
        this.connect = connect;
    }

    public void setVetrinaryID(String vetrinaryID) {
        this.vetrinaryID = vetrinaryID;
    }

    public Feed() {
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getFeedBarCode() {
        return feedBarCode;
    }

    public void setFeedBarCode(String feedBarCode) {
        this.feedBarCode = feedBarCode;
    }

    public String getFeedSize() {
        return feedSize;
    }

    public void setFeedSize(String feedSize) {
        this.feedSize = feedSize;
    }

    public int getFeedQuantity() {
        return feedQuantity;
    }

    public void setFeedQuantity(int feedQuantity) {
        this.feedQuantity = feedQuantity;
    }

    public int getFeedPurchasePrice() {
        return feedPurchasePrice;
    }

    public void setFeedPurchasePrice(int feedPurchasePrice) {
        this.feedPurchasePrice = feedPurchasePrice;
    }

    public int getFeedSellPrice() {
        return feedSellPrice;
    }

    public void setFeedSellPrice(int feedSellPrice) {
        this.feedSellPrice = feedSellPrice;
    }

    public String getFactoryLisence() {
        return factoryLisence;
    }

    public void setFactoryLisence(String factoryLisence) {
        this.factoryLisence = factoryLisence;
    }

}
