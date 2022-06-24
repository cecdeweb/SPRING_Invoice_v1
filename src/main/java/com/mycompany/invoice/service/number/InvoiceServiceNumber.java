package com.mycompany.invoice.service.number;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber = 0L;

    @Autowired
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

    @Override
    public List<Invoice> getInvoiceList() {
        throw new UnsupportedOperationException();
    }

}
