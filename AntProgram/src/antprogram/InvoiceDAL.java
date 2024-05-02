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
public class InvoiceDAL {
    private Connection connection;

    public InvoiceDAL(Connection connection) {
        this.connection = connection;
    }

    public void createInvoice(Invoice invoice) throws SQLException {
        String query = "INSERT INTO tblInvoice (invoice_number,cust_ID,products_total_price,discount,products_fair_value,amount_paid,remining,vet_id) VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, invoice.getInvoiceNumber());
        statement.setString(2, invoice.getInvoiceCustomerID());
        statement.setInt(3, invoice.getInvoiceProductTotalPrice());
        statement.setInt(4, invoice.getInvoiceDiscount());
        statement.setInt(5, invoice.getInvoiceFairValue());
        statement.setInt(6, invoice.getInvoicePaid());
        statement.setInt(7, invoice.getInvoiceRemaining());
        statement.setString(8, invoice.getInvoiceVetID());
        statement.executeUpdate();
        statement.close();
    }

    public List<Invoice> getAllInvoices() throws SQLException {
        List<Invoice> invoice = new ArrayList<>();
        String query = "SELECT * FROM tblInvoice";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Invoice invc = new Invoice();
            invc.setInvoiceNumber(resultSet.getString("invoice_number"));
            invc.setInvoiceCustomerID(resultSet.getString("cust_ID"));
            invc.setInvoiceProductTotalPrice(resultSet.getInt("products_total_price"));
            invc.setInvoiceDiscount(resultSet.getInt("discount"));
            invc.setInvoiceFairValue(resultSet.getInt("products_fair_value"));
            invc.setInvoicePaid(resultSet.getInt("amount_paid")); 
            invc.setInvoiceRemaining(resultSet.getInt("remaning")); 
            invc.setInvoiceVetID(resultSet.getString("vet_id")); 
            invoice.add(invc);
        }
        resultSet.close();
        statement.close();
        return invoice;
    }

    public Invoice getInvoicebyInvoice_Number(String number) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,number);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceNumber(resultSet.getString("invoice_number"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
     public Invoice getInvoiceByCustomerID(String customerID) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(2,customerID);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceCustomerID(resultSet.getString("cust_ID"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
      public Invoice getInvoicebyproducts_total_price(int products_total_price) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(3,products_total_price);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceProductTotalPrice(resultSet.getInt("products_total_price"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
       public Invoice getInvoicebyDiscount(int discount) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE factory_license = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(4,discount);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceDiscount(resultSet.getInt("discount"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
         public Invoice getInvoicebyInvoiceAmountPaid(int amount_paid) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(5,amount_paid);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoicePaid(resultSet.getInt("amount_paid"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
           public Invoice getInvoicebyRemaning(int remaning) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(7,remaning);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceRemaining(resultSet.getInt("remaning"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
        public Invoice getInvoicebyVet_ID(String vet_id) throws SQLException {
        String query = "SELECT * FROM tblInvoice WHERE invoice_number = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(8,vet_id);
        ResultSet resultSet = statement.executeQuery();
        Invoice invoice = null;
        if (resultSet.next()) {
            invoice = new Invoice();
            invoice.setInvoiceVetID(resultSet.getString("vet_id"));
        }
        resultSet.close();
        statement.close();
        return invoice;
    }
         
       

    public void updateInvoice(Invoice invoice) throws SQLException {
        String query = "UPDATE tblInvoice SET cust_ID = ? , products_total_price = ? , discount = ? , products_fair_value = ? , amount_paid = ? , remaning = ? , vet_id = ? , WHERE invoice_ = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, invoice.getInvoiceNumber());
        statement.setString(2,invoice.getInvoiceCustomerID());
        statement.setInt(3,invoice.getInvoiceProductTotalPrice());
        statement.setInt(4,invoice.getInvoiceDiscount());
        statement.setInt(5,invoice.getInvoiceFairValue());
        statement.setInt(6,invoice.getInvoicePaid());
        statement.setInt(7,invoice.getInvoiceRemaining());
        statement.setString(8,invoice.getInvoiceVetID());
        statement.executeUpdate();
        statement.close();
    }

    public void deleteInvoice(String invoice_number) throws SQLException {
        String query = "DELETE FROM tblInvoice WHERE invoice_number= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, invoice_number);
        statement.executeUpdate();
        statement.close();
    }
}
