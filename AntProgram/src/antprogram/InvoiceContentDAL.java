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
 * @author Administrator
 */
public class InvoiceContentDAL {
    private Connection connection;

    public InvoiceContentDAL(Connection connection) {
        this.connection = connection;
    }

    public void createInvoiceContentDAL(InvoiceContent invCon) throws SQLException {
        String query = "INSERT INTO tblInvoiceContent (med_bar_code,feed_bar_code,invoice_num) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, invCon.getMedBarCode());
        statement.setString(2, invCon.getFedBarCode());
        statement.setInt(3, invCon.getInvoiceNumber());
        statement.executeUpdate();
        statement.close();
    }

    public List<InvoiceContent> getAllInvoiceContent() throws SQLException {
        List<InvoiceContent> list = new ArrayList<>();
        String query = "SELECT * FROM tblInvoiceContent";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            InvoiceContent inv = new InvoiceContent();
            inv.setMedBarCode(resultSet.getString("med_bar_code"));
            inv.setFedBarCode(resultSet.getString("feed_bar_code"));
            inv.setInvoiceNumber(resultSet.getInt("invoice_num"));
        
            list.add(inv);
        }
        resultSet.close();
        statement.close();
        return list;
    }

//        public InvoiceContent getInvoiceContentByInvoiceNumber(int invNumber) throws SQLException {
//        String query = "SELECT * FROM tblInvoiceContent WHERE invoice_num = ?";
//        PreparedStatement statement = connection.prepareStatement(query);
//        statement.setInt(1,invNumber);
//        ResultSet resultSet = statement.executeQuery();
//        InvoiceContent invCon = null;
//        if (resultSet.next()) {
//            invCon = new FeedFactory();
//            invCon.setFactoryLicense(resultSet.getString("factory_license"));
//        }
//        resultSet.close();
//        statement.close();
//        return factory;
//}
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
