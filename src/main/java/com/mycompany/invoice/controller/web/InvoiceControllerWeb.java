package com.mycompany.invoice.controller.web;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
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

//    @RequestMapping("/home")
//    public String displayHome(){
//        System.out.println("Home Display !");
//        return "index";
//    }
    @RequestMapping("/invoice-home")
    public @ModelAttribute ("invoices") List<Invoice> displayHome(){
        System.out.println("Home Display !");
        List<Invoice> listInvoice = service.getInvoiceList();
        return listInvoice;
    }
}
