package com.mycompany.invoice.controller.keyboard;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyBoard implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface service;

    public void createInvoice() {

        // je permets à l'utilisateur de faire une saisie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer name :");
        String customerName = scanner.nextLine();

        // générer une facture
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
