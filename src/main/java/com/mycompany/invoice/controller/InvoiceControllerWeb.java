package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

public class InvoiceControllerWeb implements InvoiceControllerInterface {

    private InvoiceServiceInterface service;

    public void createInvoice() {

        String customerName = "Nike"; // je simule que j'ai reçu cette donnée depuis mon formulaire
        Invoice newInvoice = new Invoice();
        newInvoice.setCustomerInvoice(customerName);

        service.createInvoice(newInvoice);
    }

    public InvoiceServiceInterface getService() {
        return service;
    }

    public void setService(InvoiceServiceInterface service) {
        this.service = service;
    }
}
