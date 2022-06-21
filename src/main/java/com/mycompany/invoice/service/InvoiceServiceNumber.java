package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber = 0L;

    private InvoiceRepositoryInterface repository;

    public void createInvoice(Invoice invoice) {
        // donner un numéro à ma facture
        invoice.setNumber(String.valueOf(++lastNumber));
        // appeler le repository pour l'enregistrer
        repository.createInvoice(invoice);
    }

    public InvoiceRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(InvoiceRepositoryInterface repository) {
        this.repository = repository;
    }
}
