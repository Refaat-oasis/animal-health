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
public class InvoiceBLL {

    private InvoiceDAL invoiceDAL;

    public InvoiceBLL(InvoiceDAL invoiceDAL) {
        this.invoiceDAL = invoiceDAL;
    }

    public void createInvoice(Invoice invoice) throws BusinessException {
        if (invoice.getInvoiceNumber() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Invoice Number");
        }
        if (invoice.getInvoiceCustomerID() == null) {
            JOptionPane.showMessageDialog(null, "pLEASE ENTER Customer ID");
        }

        try {
            invoiceDAL.createInvoice(invoice);
        } catch (Exception e) {
            throw new BusinessException("Failed to create invoice", e);
        }
    }

    public List<Invoice> getAllInvoices() throws BusinessException, SQLException {
        List<Invoice> inv = invoiceDAL.getAllInvoices();
        try {
            for (Invoice in : inv) {
                System.out.println(in.getInvoiceCustomerID() + ", " + in.getInvoiceNumber());
            }
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve All Invoices ", e);
        }
        return inv;
    }

    public Invoice getInvoicebyInvoice_Number(String number) throws BusinessException {
        if (number == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Invoice Number");
        }

        try {
            return invoiceDAL.getInvoicebyInvoice_Number(number);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by number", e);
        }
    }

    public Invoice getInvoicebyCustomerID(String CustomerID) throws BusinessException {
        if (CustomerID == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Customer ID");
        }

        try {
            return invoiceDAL.getInvoiceByCustomerID(CustomerID);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by customer id", e);
        }
    }

    public Invoice getInvoicebyproducts_total_price(int products_total_price) throws BusinessException {
        if (products_total_price == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter total_price");
        }

        try {
            return invoiceDAL.getInvoicebyproducts_total_price(products_total_price);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by total price", e);
        }
    }

    public Invoice getInvoicebyDiscount(int discount) throws BusinessException {
       if (discount == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Discount");
        }
        try {
            return invoiceDAL.getInvoicebyDiscount(discount);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by discount", e);
        }
    }

    public Invoice getInvoicebyInvoiceAmountPaid(int amount_paid) throws BusinessException {
        if (amount_paid == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Amount Paid");
        }
        try {
            return invoiceDAL.getInvoicebyInvoiceAmountPaid(amount_paid);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by amount paid", e);
        }
    }

    public Invoice getInvoicebyRemaning(int remaning) throws BusinessException {
       if (remaning == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Remaining");
        }
        try {
            return invoiceDAL.getInvoicebyRemaning(remaning);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by remaning", e);
        }
    }

    public Invoice getInvoicebyVet_ID(String vet_id) throws BusinessException {
       if (vet_id == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Vet ID");
        }
        try {
            return invoiceDAL.getInvoicebyVet_ID(vet_id);
        } catch (Exception e) {
            throw new BusinessException("Failed to retrieve invoice by vet id", e);
        }

    }

    public void updateInvoice(Invoice invoice) throws BusinessException {
       if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Invoice Updated", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            invoiceDAL.updateInvoice(invoice);
        } catch (Exception e) {
            throw new BusinessException("Failed to update invoice", e);
        }
    }

    public void deleteInvoice(String invoice_number) throws BusinessException {
      if (JOptionPane.showConfirmDialog(null, "Are you sure ?", "Invoice deleted", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        System.exit(0);
        try {
            invoiceDAL.deleteInvoice(invoice_number);
        } catch (Exception e) {
            throw new BusinessException("Failed to delete invoice", e);
        }
    }
}
