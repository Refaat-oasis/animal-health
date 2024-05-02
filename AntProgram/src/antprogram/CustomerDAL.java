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
 * @author Belal Center
 */
public class CustomerDAL {

    private Connection connection;

    public CustomerDAL(Connection connection) {
        this.connection = connection;
    }

    public void createCustomer(Customer Customer) throws SQLException {
        String query = "INSERT INTO tblCustomer (customer_ID,  first_name  ,last_name,  phone_number,  address,   city,  password) VALUES (???????)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, Customer.getCustomerID());
        statement.setString(2, Customer.getCustomerFirstName());
        statement.setString(3, Customer.getCustomerLastName());
        statement.setString(4, Customer.getCustomerPhone());
        statement.setString(5, Customer.getCustomerAddress());
        statement.setString(6, Customer.getCustomerCity());
        statement.setString(7, Customer.getCustomerPassword());
        statement.executeUpdate();
        statement.close();
    }

    public List<Customer> getAllcustomer() throws SQLException {
        List<Customer> Customer = new ArrayList<>();
        String query = "SELECT * FROM tblCustomer";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Customer Cust = new Customer();
            Cust.setCustomerID(resultSet.getString("customer_ID"));
            Cust.setCustomerFirstname(resultSet.getString("first_name"));
            Cust.setCustomerLastName(resultSet.getString("last_name"));
            Cust.setCustomerPhone(resultSet.getString("phone_number"));
            Cust.setCustomerAddress(resultSet.getString("address"));
            Cust.setCustomerCity(resultSet.getString("city"));
            Cust.setCustomerPassword(resultSet.getString("password"));
            Customer.add(Cust);
        }
        resultSet.close();
        statement.close();
        return Customer;
    }

    public Customer getCustomerByID(String CustomerId) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE customer_ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, CustomerId);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public Customer getCustomerByFirstName(String CustomerFirstName) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE first_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(2, CustomerFirstName);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;

    }

    public Customer getCustomerByLastName(String CustomerLastName) throws SQLException {
        String query = "SELECT * FROM Customer WHERE last_name= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(3, CustomerLastName);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public Customer getCustomerByPhone(String CustomerPhone) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE phone_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(4, CustomerPhone);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public Customer getCustomerByAddress(String CustomerAddress) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE address = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(5, CustomerAddress);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public Customer getCustomerByCity(String CustomerCity) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE city = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(6, CustomerCity);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public Customer getCustomerByPassword(String CustomerPassword) throws SQLException {
        String query = "SELECT * FROM tblCustomer WHERE password = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(7, CustomerPassword);
        ResultSet resultSet = statement.executeQuery();
        Customer customer_1 = null;
        if (resultSet.next()) {
            customer_1 = new Customer();
            customer_1.setCustomerID(resultSet.getString("customer_ID"));
            customer_1.setCustomerFirstname(resultSet.getString("first_name"));
            customer_1.setCustomerLastName(resultSet.getString("last_name"));
            customer_1.setCustomerPhone(resultSet.getString("phone_number"));
            customer_1.setCustomerAddress(resultSet.getString("address"));
            customer_1.setCustomerCity(resultSet.getString("city"));
            customer_1.setCustomerPassword(resultSet.getString("password"));

        }
        resultSet.close();
        statement.close();
        return customer_1;
    }

    public void updateCustomer(Customer Customer) throws SQLException {
        String query = "UPDATE tblCustomer SET first_name  = ?, last_name = ? , phone_number =?, address = ? , city =?, password =? WHERE customer_ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, Customer.getCustomerID());
        statement.setString(2, Customer.getCustomerFirstName());
        statement.setString(3, Customer.getCustomerLastName());
        statement.setString(4, Customer.getCustomerPhone());
        statement.setString(5, Customer.getCustomerAddress());
        statement.setString(6, Customer.getCustomerCity());
        statement.setString(7, Customer.getCustomerPassword());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteCustomer(String CustomerID) throws SQLException {
        String query = "DELETE FROM blCustomer WHERE customer_ID = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, CustomerID);
        statement.executeUpdate();
        statement.close();
    }
}
