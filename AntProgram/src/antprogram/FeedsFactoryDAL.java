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
 * @author Compu Market
 */
public class FeedsFactoryDAL {
    private Connection connection;

    public FeedsFactoryDAL(Connection connection) {
        this.connection = connection;
    }

    public void createFeedsFactory(FeedFactory factory) throws SQLException {
        String query = "INSERT INTO tblFeedsFactory (factory_license,factory_name,address,phone_number,city) VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, factory.getFactoryLicense());
        statement.setString(2, factory.getFactoryName());
        statement.setString(3, factory.getFactoryPhone());
        statement.setString(4, factory.getFactoryAddress());
        statement.setString(5, factory.getFactoryCity());
        statement.executeUpdate();
        statement.close();
    }

    public List<FeedFactory> getAllFeedsFactory() throws SQLException {
        List<FeedFactory> factory = new ArrayList<>();
        String query = "SELECT * FROM tblFeedsFactory";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            FeedFactory fact = new FeedFactory();
            fact.setFactoryLicense(resultSet.getString("factory_license"));
            fact.setFactoryName(resultSet.getString("factory_name"));
            fact.setFactoryAddress(resultSet.getString("address"));
            fact.setFactoryPhone(resultSet.getString("phone_number"));
            fact.setFactoryCity(resultSet.getString("city")); 
            factory.add(fact);
        }
        resultSet.close();
        statement.close();
        return factory;
    }

    public FeedFactory getFeedFactoryByLicense(String lisence) throws SQLException {
        String query = "SELECT * FROM tblFeedsFactory WHERE factory_license = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,lisence);
        ResultSet resultSet = statement.executeQuery();
        FeedFactory factory = null;
        if (resultSet.next()) {
            factory = new FeedFactory();
            factory.setFactoryLicense(resultSet.getString("factory_license"));
        }
        resultSet.close();
        statement.close();
        return factory;
    }
     public FeedFactory getFeedFactoryByName(String name) throws SQLException {
        String query = "SELECT * FROM tblFeedsFactory WHERE factory_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(2,name);
        ResultSet resultSet = statement.executeQuery();
        FeedFactory factory = null;
        if (resultSet.next()) {
            factory = new FeedFactory();
            factory.setFactoryName(resultSet.getString("factory_name"));
        }
        resultSet.close();
        statement.close();
        return factory;
    }
      public FeedFactory getFeedFactoryByAddress(String address) throws SQLException {
        String query = "SELECT * FROM tblFeedsFactory WHERE address = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(3,address);
        ResultSet resultSet = statement.executeQuery();
        FeedFactory factory = null;
        if (resultSet.next()) {
            factory = new FeedFactory();
            factory.setFactoryAddress(resultSet.getString("address"));
        }
        resultSet.close();
        statement.close();
        return factory;
    }
       public FeedFactory getFeedFactoryByPhoneNumber(String phonenumber) throws SQLException {
        String query = "SELECT * FROM tblFeedsFactory WHERE phone_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(4,phonenumber);
        ResultSet resultSet = statement.executeQuery();
        FeedFactory factory = null;
        if (resultSet.next()) {
            factory = new FeedFactory();
            factory.setFactoryPhone(resultSet.getString("phone_number"));
        }
        resultSet.close();
        statement.close();
        return factory;
    }
         public FeedFactory getFeedFactoryByCity(String city) throws SQLException {
        String query = "SELECT * FROM tblFeedsFactory WHERE city = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(5,city);
        ResultSet resultSet = statement.executeQuery();
        FeedFactory factory = null;
        if (resultSet.next()) {
            factory = new FeedFactory();
            factory.setFactoryCity(resultSet.getString("city"));
        }
        resultSet.close();
        statement.close();
        return factory;
    }
       

    public void updateFeedFactory(FeedFactory factory) throws SQLException {
        String query = "UPDATE tblFeedsFactory SET factory_name = ? , address = ? , phone_number = ? , city= ? , WHERE factory_license = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, factory.getFactoryLicense());
        statement.setString(2,factory.getFactoryName());
        statement.setString(3,factory.getFactoryAddress());
        statement.setString(2,factory.getFactoryPhone());
        statement.setString(5,factory.getFactoryCity());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteFeedFactory(String license) throws SQLException {
        String query = "DELETE FROM tblFeedsFactory WHERE factory_license = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, license);
        statement.executeUpdate();
        statement.close();
    }
    
}
