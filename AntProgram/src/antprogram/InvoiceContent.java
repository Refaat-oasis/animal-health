/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

/**
 *
 * @author Administrator
 */
public class InvoiceContent {
    private String medBarCode;
    private String fedBarCode;
    private int invoiceNumber;
    public InvoiceContent() {
     
    }

    public String getMedBarCode() {
        return medBarCode;
    }

    public String getFedBarCode() {
        return fedBarCode;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setMedBarCode(String medBarCode) {
        this.medBarCode = medBarCode;
    }

    public void setFedBarCode(String fedBarCode) {
        this.fedBarCode = fedBarCode;
    }

    public void setInvoiceNumber(int InvoiceNumber) {
        this.invoiceNumber = InvoiceNumber;
    }
    
    
    
}
