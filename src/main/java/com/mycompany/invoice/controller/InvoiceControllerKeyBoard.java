package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceControllerKeyBoard implements InvoiceControllerInterface {

    private InvoiceServiceInterface service;

    public void createInvoice() {

        // je permets à l'utilisateur de faire une saisie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer name :");
        String customerName = scanner.nextLine();

        // génerer une facture
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
