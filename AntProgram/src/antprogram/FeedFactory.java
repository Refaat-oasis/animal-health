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
public class FeedFactory {

    private String factoryLicense;
    private String factoryName;
    private String factoryPhone;
    private String factoryAddress;
    private String factoryCity;
    private DBConnection connect;

    public FeedFactory() {
    }

    public FeedFactory(DBConnection connect) {
        this.connect = connect;
    }

    public String getFactoryLicense() {
        return factoryLicense;
    }

    public void setFactoryLicense(String factoryLicense) {
        this.factoryLicense = factoryLicense;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryPhone() {
        return factoryPhone;
    }

    public void setFactoryPhone(String factoryPhone) {
        this.factoryPhone = factoryPhone;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public String getFactoryCity() {
        return factoryCity;
    }

    public void setFactoryCity(String factoryCity) {
        this.factoryCity = factoryCity;
    }

}
