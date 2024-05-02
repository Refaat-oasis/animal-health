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
public class Medicine {

    private String medicineName;
    private String medicineBarCode;
    private String medicineType;
    private int medicineQuantity;
    private int medicinePurchasePrice;
    private int medicineSellPrice;
    private String companyLisence;
    private String vetrinaryID;
     private DBConnection connect;
      public Medicine() {
    }
    public String getVetrinaryID() {
        return vetrinaryID;
    }
    public Medicine(DBConnection connect) {
        this.connect = connect;
    }

    public void setVetrinaryID(String vetrinaryID) {
        this.vetrinaryID = vetrinaryID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineBarCode() {
        return medicineBarCode;
    }

    public void setMedicineBarCode(String medicineBarCode) {
        this.medicineBarCode = medicineBarCode;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public int getMedicinePurchasePrice() {
        return medicinePurchasePrice;
    }

    public void setMedicinePurchasePrice(int medicinePurchasePrice) {
        this.medicinePurchasePrice = medicinePurchasePrice;
    }

    public int getMedicineSellPrice() {
        return medicineSellPrice;
    }

    public void setMedicineSellPrice(int medicineSellPrice) {
        this.medicineSellPrice = medicineSellPrice;
    }

    public String getCompanyLisence() {
        return companyLisence;
    }

    public void setCompanyLisence(String companyLisence) {
        this.companyLisence = companyLisence;
    }

}
