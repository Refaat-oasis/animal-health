/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

/**
 *
 * @author Administrator
 */
public class Invoice {

    private String invoiceNumber;
    private String invoiceCustomerID;
    private int invoiceProductTotalPrice;
    private int invoiceDiscount;
    private int invoiceFairValue;
    private int invoicePaid;
    private int invoiceRemaining;
    private String invoiceVetID;
    private DBConnection connect;

    public Invoice() {
    }

    public Invoice(DBConnection connect) {
        this.connect = connect;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceCustomerID() {
        return invoiceCustomerID;
    }

    public void setInvoiceCustomerID(String invoiceCustomerID) {
        this.invoiceCustomerID = invoiceCustomerID;
    }

    public int getInvoiceProductTotalPrice() {
        return invoiceProductTotalPrice;
    }

    public void setInvoiceProductTotalPrice(int invoiceProductTotalPrice) {
        this.invoiceProductTotalPrice = invoiceProductTotalPrice;
    }

    public int getInvoiceDiscount() {
        return invoiceDiscount;
    }

    public void setInvoiceDiscount(int invoiceDiscount) {
        this.invoiceDiscount = invoiceDiscount;
    }

    public int getInvoiceFairValue() {
        return invoiceFairValue;
    }

    public void setInvoiceFairValue(int invoiceFairValue) {
        this.invoiceFairValue = invoiceFairValue;
    }

    public int getInvoicePaid() {
        return invoicePaid;
    }

    public void setInvoicePaid(int invoicePaid) {
        this.invoicePaid = invoicePaid;
    }

    public int getInvoiceRemaining() {
        return invoiceRemaining;
    }

    public void setInvoiceRemaining(int invoiceRemaining) {
        this.invoiceRemaining = invoiceRemaining;
    }

    public String getInvoiceVetID() {
        return invoiceVetID;
    }

    public void setInvoiceVetID(String invoiceVetID) {
        this.invoiceVetID = invoiceVetID;
    }

}
