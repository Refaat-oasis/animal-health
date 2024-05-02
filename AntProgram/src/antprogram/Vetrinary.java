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
public class Vetrinary {

    private String vetID;
    private String vetFirstName;
    private String vetLastName;
    private String vetPhone;
    private String vetAddress;
    private String vetPassword;
    private String vetCity;
    private DBConnection connect;

    public Vetrinary() {
    }

    public Vetrinary(DBConnection connect) {
        this.connect = connect;
    }

    public String getVetID() {
        return vetID;
    }

    public void setVetID(String vetID) {
        this.vetID = vetID;
    }

    public String getVetFirstName() {
        return vetFirstName;
    }

    public void setVetFirstName(String vetFirstName) {
        this.vetFirstName = vetFirstName;
    }

    public String getVetLastName() {
        return vetLastName;
    }

    public void setVetLastName(String vetLastName) {
        this.vetLastName = vetLastName;
    }

    public String getVetPhone() {
        return vetPhone;
    }

    public void setVetPhone(String vetPhone) {
        this.vetPhone = vetPhone;
    }

    public String getVetAddress() {
        return vetAddress;
    }

    public void setVetAddress(String vetAddress) {
        this.vetAddress = vetAddress;
    }

    public String getVetPassword() {
        return vetPassword;
    }

    public void setVetPassword(String vetPassword) {
        this.vetPassword = vetPassword;
    }

    public String getVetCity() {
        return vetCity;
    }

    public void setVetCity(String vetCity) {
        this.vetCity = vetCity;
    }

}
