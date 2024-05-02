/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sandra
 */
public class MedicineDAL {
    
     private Connection connection;
     ResultSet resultSet;

    public MedicineDAL(Connection connection) {
        this.connection = connection;
    }

    public void createMedicine(Medicine medicine ) throws SQLException {
        String query = "INSERT INTO tblMedicine (medicine_bar_code,medcine_name,type,quantity,purchase_price,selling_price,com_lic,vet_ID) VALUES (????????)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,medicine.getMedicineBarCode());
        statement.setString(2, medicine.getMedicineName());
        statement.setString(3, medicine.getMedicineType());
        statement.setInt(4, medicine.getMedicineQuantity());
        statement.setInt(5, medicine.getMedicinePurchasePrice());
        statement.setInt(6, medicine.getMedicineSellPrice());
        statement.setString(7, medicine.getCompanyLisence());
        statement.setString(8, medicine.getVetrinaryID());

        statement.executeUpdate();
        statement.close();
    }
     public ResultSet getAllMedicine() throws SQLException {
        List<Medicine> medList = new ArrayList<>();
        String query = "SELECT * FROM tblMedicine";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
//        while (resultSet.next()) {
//            Medicine medicines = new Medicine();
//            medicines.setMedicineBarCode(resultSet.getString("medicine_bar_code"));
//            medicines.setMedicineName(resultSet.getString("medcine_name"));
//            medicines.setMedicineType(resultSet.getString("type"));
//            medicines.setMedicineQuantity(resultSet.getInt("quantity"));
//            medicines.setMedicinePurchasePrice(resultSet.getInt("purchase_price"));
//            medicines.setMedicineSellPrice(resultSet.getInt("selling_Price"));
//            medicines.setCompanyLisence(resultSet.getString("com_lic"));
//            medicines.setVetrinaryID(resultSet.getString("vet_ID"));
//            medList.add(medicines);
     //}
        //resultSet.close();
        //statement.close();
        return resultSet;
    }
     public Medicine getMedicineByMedicine_Bar_Code(String medicineBarCode) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE medicine_bar_code = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, medicineBarCode);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicineBarCode(resultSet.getString("medicine_bar_code"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
 public Medicine getMedicineByMedicine_Name(String medicineName) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE medicine_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, medicineName);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicineName(resultSet.getString("medicine_name"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
 public Medicine getMedicineByMedicine_Type(String medicineType) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE type = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, medicineType);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicineType(resultSet.getString("type"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public Medicine getMedicineByMedicine_Quantity(int medicineQuantity) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE quantity = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, medicineQuantity);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicineQuantity(resultSet.getInt("quantity"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public Medicine getMedicineByMedicine_Purchase_Price(int medicinePurchasePrice) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE purchase_price = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, medicinePurchasePrice);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicinePurchasePrice(resultSet.getInt("purchase_price"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public Medicine getMedicineByMedicine_Sell_Price(int medicineSellPrice) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE selling_price = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, medicineSellPrice);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setMedicineSellPrice(resultSet.getInt("selling_price"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public Medicine getMedicineByCompany_License(String companyLisence) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE com_lic = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, companyLisence);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setCompanyLisence(resultSet.getString("com_lic"));
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public Medicine getMedicineByVetrinaryID(String vetrinaryID) throws SQLException {
        String query = "SELECT * FROM tblMedicine WHERE vet_ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetrinaryID);
        ResultSet resultSet = statement.executeQuery();
        Medicine medicine = null;
        if (resultSet.next()) {
            medicine = new Medicine();
            medicine.setVetrinaryID(resultSet.getString("vet_ID"));
            
        }
        resultSet.close();
        statement.close();
        return medicine;
    }
  public void updateMedicine(Medicine medicine) throws SQLException {
        String query = "UPDATE tblMedicine SET medicine_name= ?, type=?,quantity=?,purchase_price=? ,selling_price=?,com_lic=?, vet_ID=? WHERE medicine_bar_code = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, medicine.getMedicineBarCode());
        statement.setString(2, medicine.getMedicineName());
        statement.setString(3, medicine.getMedicineType());
        statement.setInt(4, medicine.getMedicineQuantity());
        statement.setInt(5, medicine.getMedicinePurchasePrice());
        statement.setInt(6, medicine.getMedicineSellPrice());
        statement.setString(7, medicine.getMedicineBarCode());
        statement.setString(8, medicine.getVetrinaryID());
        statement.executeUpdate();
        statement.close();
    }
      public void deleteMedicine(String medicineBarCode )throws SQLException {
        String query = "DELETE FROM tblMedicine WHERE  medicine_bar_code";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, medicineBarCode);
        statement.executeUpdate();
        statement.close();
    }

}
