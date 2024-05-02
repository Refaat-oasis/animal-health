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
public class VetCompanyDAL {

    private Connection connection;

    public VetCompanyDAL(Connection connection) {
        this.connection = connection;
    }

    public void createVetCompany(VetCompany vetCompany) throws SQLException {
        String query = "INSERT INTO tblVetCompany (company_License,company_name,city,phone_number,address) VALUES (?????)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vetCompany.getCompanyLicense());
        statement.setString(2, vetCompany.getCompanyName());
        statement.setString(3, vetCompany.getCompanyCity());
        statement.setString(4, vetCompany.getCompanyPhone());
        statement.setString(5, vetCompany.getCompanyAddress());
        
        statement.executeUpdate();
        statement.close();
    }

    public List<VetCompany> getAllVetCompany() throws SQLException {
        List<VetCompany> vetList = new ArrayList<>();
        String query = "SELECT * FROM tblVetCompany";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            VetCompany vetCompanys = new VetCompany();
            vetCompanys.setCompanyLicense(resultSet.getString("company_License"));
            vetCompanys.setCompanyName(resultSet.getString("company_name"));
            vetCompanys.setCompanyCity(resultSet.getString("city"));
            vetCompanys.setCompanyPhone(resultSet.getString("phone_number"));
            vetCompanys.setCompanyAddress(resultSet.getString("address"));
            vetList.add(vetCompanys);
        }
        resultSet.close();
        statement.close();
        return vetList;
    }

    public VetCompany getVetCompanyByCompanyLicense(String companylicense) throws SQLException {
        String query = "SELECT * FROM tblVetCompany WHERE company_License = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, companylicense);
        ResultSet resultSet = statement.executeQuery();
        VetCompany vetCompany = null;
        if (resultSet.next()) {
            vetCompany = new VetCompany();
            vetCompany.setCompanyLicense(resultSet.getString("company_License"));
        }
        resultSet.close();
        statement.close();
        return vetCompany;
    }
 public VetCompany getVetCompanyByCompanyName(String companyName) throws SQLException {
        String query = "SELECT * FROM tblVetCompany WHERE company_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(2, companyName);
        ResultSet resultSet = statement.executeQuery();
        VetCompany vetCompany = null;
        if (resultSet.next()) {
            vetCompany = new VetCompany();
            vetCompany.setCompanyName(resultSet.getString("company_name"));
        }
        resultSet.close();
        statement.close();
        return vetCompany;
    }
 public VetCompany getVetCompanyByCompanyCity(String companyCity) throws SQLException {
        String query = "SELECT * FROM tblVetCompany WHERE city = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(3, companyCity);
        ResultSet resultSet = statement.executeQuery();
        VetCompany vetCompany = null;
        if (resultSet.next()) {
            vetCompany = new VetCompany();
            vetCompany.setCompanyCity(resultSet.getString("city"));
        }
        
        resultSet.close();
        statement.close();
        return vetCompany;
    }
  public VetCompany getVetCompanyByCompanyPhone(String companyPhone) throws SQLException {
        String query = "SELECT * FROM tblVetCompany WHERE phone_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(4, companyPhone);
        ResultSet resultSet = statement.executeQuery();
        VetCompany vetCompany = null;
        if (resultSet.next()) {
            vetCompany = new VetCompany();
            vetCompany.setCompanyPhone(resultSet.getString("phone_number"));
        }
        resultSet.close();
        statement.close();
        return vetCompany;
    }
 public VetCompany getVetCompanyByCompanyAddress(String companyAddress) throws SQLException {
        String query = "SELECT * FROM tblVetCompany WHERE address = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(5, companyAddress);
        ResultSet resultSet = statement.executeQuery();
        VetCompany VetCompany = null;
        if (resultSet.next()) {
            VetCompany = new VetCompany();
            VetCompany.setCompanyAddress(resultSet.getString("address"));
        }
        resultSet.close();
        statement.close();
        return VetCompany;
    }
public void updateVetCompany(VetCompany VetCompany) throws SQLException {
        String query = "UPDATE tblVetCompany SET company_name= ?, city=?,phone_number=?,address=? WHERE company_License = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, VetCompany.getCompanyLicense());
        statement.setString(2, VetCompany.getCompanyName());
        statement.setString(3,VetCompany.getCompanyCity());
        statement.setString(4, VetCompany.getCompanyPhone());
        statement.setString(5, VetCompany.getCompanyAddress());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteVetCompany(String companylicense )throws SQLException {
        String query = "DELETE FROM VetCompany WHERE  company_License";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, companylicense);
        statement.executeUpdate();
        statement.close();
    }

}
