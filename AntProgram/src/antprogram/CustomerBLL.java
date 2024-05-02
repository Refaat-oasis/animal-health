/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fatma
 */
public class CustomerBLL {

    private CustomerDAL customerDAL;

    public CustomerBLL() {
    }

    public CustomerBLL(CustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void createCustomer(Customer customer) throws BusinessException {
        if (customer.getCustomerID() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER ID");
        }
        if (customer.getCustomerFirstName() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR NAME");
        }
        if (customer.getCustomerPhone() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR PHONE");
        }
        if (customer.getCustomerPassword() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER YOUR PASSWORD");
        }

        try {
            customerDAL.createCustomer(customer);
        } catch (Exception e) {
            throw new BusinessException("Failed to singUp . ", e);
        }

    }

    public List<Customer> getAllCustomer() throws BusinessException, SQLException {
        List<Customer> cust = customerDAL.getAllcustomer();
        try {
            for (Customer c : cust) {
                System.out.println(c.getCustomerID() + ", " + c.getCustomerFirstName());
            }
        } catch (Exception e) {
            throw new BusinessException("Failed to Retrieve All Customers ", e);
        }
        return cust;

    }

    public Customer getCustomerById(String customerId) throws BusinessException {
        if (customerId == null) {
            JOptionPane.showMessageDialog(null, "Please Enter ID");
        }
        try {
            return customerDAL.getCustomerByID(customerId);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by ID.", e);
        }
    }

    public Customer getCustomerByFirstName(String customerFirstName) throws BusinessException {
        if (customerFirstName == null) {
            JOptionPane.showMessageDialog(null, "Please Enter First Name");
        }
        try {
            return customerDAL.getCustomerByFirstName(customerFirstName);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by First Name.", e);
        }
    }

    public Customer getCustomerByLastName(String customerLastName) throws BusinessException {
        if (customerLastName == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Last Name");
        }
        try {
            return customerDAL.getCustomerByLastName(customerLastName);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by Last Name.", e);
        }
    }

    public Customer getCustomerByPhone(String CustomerPhone) throws BusinessException {
        if (CustomerPhone == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Phone ");
        }
        try {
            return customerDAL.getCustomerByPhone(CustomerPhone);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by Phone .", e);
        }
    }

    public Customer getCustomerByAddress(String CustomerAddress) throws BusinessException {
        if (CustomerAddress == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Address ");
        }
        try {
            return customerDAL.getCustomerByAddress(CustomerAddress);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by Address .", e);
        }
    }

    public Customer getCustomerByCity(String CustomerCity) throws BusinessException {
        if (CustomerCity == null) {
            JOptionPane.showMessageDialog(null, "Please Enter City ");
        }
        try {
            return customerDAL.getCustomerByCity(CustomerCity);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by City .", e);
        }
    }

    public Customer getCustomerByPassword(String CustomerPassword) throws BusinessException {
        if (CustomerPassword == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Password ");
        }
        try {
            return customerDAL.getCustomerByPassword(CustomerPassword);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve Customer by Password.", e);
        }
    }

    public void updateCustomer(Customer customer) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Customer Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            customerDAL.updateCustomer(customer);
        } catch (Exception e) {
            throw new BusinessException("Failed to update Customer.", e);
        }
    }

    public void deleteCustomer(String CustomerID) throws BusinessException {
        if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Customer deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
        try {
            customerDAL.deleteCustomer(CustomerID);
        } catch (Exception e) {
            throw new BusinessException("Failed to delete Customer .", e);
        }
    }

}
