package com.mycompany.invoice.entity;

public class Invoice {

    private String number;
    private String customerInvoice;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerInvoice() {
        return customerInvoice;
    }

    public void setCustomerInvoice(String customerInvoice) {
        this.customerInvoice = customerInvoice;
    }
}
