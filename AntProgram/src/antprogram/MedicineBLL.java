/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author fatma
 */
public class MedicineBLL {

    ResultSet resultset;
    private MedicineDAL medicineDAL;

    public MedicineBLL() {
    }

    public MedicineBLL(MedicineDAL medicineDAL) {
        this.medicineDAL = medicineDAL;
    }

    public void createMedicine(Medicine medicine) throws BusinessException {
if (medicine.getMedicineBarCode()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Bar Code");
        }
        if (medicine.getMedicineName()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Medicine NAME");
        }
        if (medicine.getMedicineQuantity()== 0) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER The Quantity");
        }
        if (medicine.getMedicineType()== null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Medicine Type");
        }
        try {
            medicineDAL.createMedicine(medicine);
        } catch (Exception e) {
            throw new BusinessException("Failed to Add Medicine", e);
        }
    }

    public ResultSet getAllMedicine() throws BusinessException, SQLException {
        resultset = medicineDAL.getAllMedicine();
//        try {
//            for (Medicine m : med) {
//                System.out.println(m.getMedicineBarCode() + ", " + m.getMedicineName());
//            }
//        } catch (Exception e) {
//            throw new BusinessException("Failed to Retrive All Medicines. ", e);
//        }
        return resultset;
    }

    public Medicine getMedicineByMedicine_Bar_Code(String medicineBarCode) throws BusinessException {
         if (medicineBarCode == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Bar Code");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Bar_Code(medicineBarCode);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Medicine by ID.", e);
        }

    }

    public Medicine getMedicineByMedicine_Name(String medicineName)  throws BusinessException  {
         if (medicineName == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Medicine Name");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Name(medicineName);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Medicine by Name." , e);
        }

    }

    public Medicine getMedicineByMedicine_Type(String medicineType)  throws BusinessException  {
         if (medicineType == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Medicine Type");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Type(medicineType);
        } catch (Exception e) {
         throw new BusinessException   ("Failed to retrieve Medicine by Type." ,e);
        }
      
    }

    public Medicine getMedicineByMedicine_Quantity(int medicineQuantity) throws BusinessException{
         if (medicineQuantity == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Medicine Quntity");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Quantity(medicineQuantity);
        } catch (Exception e) {
             throw new BusinessException("Failed to retrieve Medicine by Quantity." ,e);
        }
        
    }

    public Medicine getMedicineByMedicine_Purchase_Price(int medicinePurchasePrice) throws BusinessException {
         if (medicinePurchasePrice == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Medicine Purchase Price");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Purchase_Price(medicinePurchasePrice);
        } catch (Exception e) {
             throw new BusinessException("Failed to retrieve Medicine by Purchase_Price." , e);
        }

    }

    public Medicine getMedicineByMedicine_Sell_Price(int medicineSellPrice) throws BusinessException {
        if (medicineSellPrice == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Medicine Seeling Price");
        }

        try {
            return medicineDAL.getMedicineByMedicine_Sell_Price(medicineSellPrice);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Medicine by Sell_Price." , e);
        }
    
    }

    public Medicine getMedicineByCompany_License(String companyLisence) throws BusinessException{
         if (companyLisence == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Company Lisence");
        }

        try {
            return medicineDAL.getMedicineByCompany_License(companyLisence);
        } catch (Exception e) {
           throw new BusinessException("Failed to retrieve Medicine by Company_License." , e);
        }
       
    }

    public Medicine getMedicineByVetrinaryID(String vetrinaryID) throws BusinessException {
        if (vetrinaryID == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Vetrinary ID");
        }

        try {
            return medicineDAL.getMedicineByVetrinaryID(vetrinaryID);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Medicine by Vetrinary_ID." , e);
        }

    }

    public void updateMedicine(Medicine medicine) throws BusinessException{
         if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Medicine Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            medicineDAL.updateMedicine(medicine);
        } catch (Exception e) {
             throw new BusinessException("Failed to Update Medicine ." ,e);
        }
    }

    public void deleteMedicine(String medicine) throws BusinessException {
         if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Medicine deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            medicineDAL.deleteMedicine(medicine);
        } catch (Exception e) {
             throw new BusinessException("Failed to Update Medicine ." , e);
        }
    }

}
