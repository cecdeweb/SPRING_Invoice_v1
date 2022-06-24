package com.mycompany.invoice.repository.database;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Override
    public void createInvoice(Invoice invoice) {

    }

    @Override
    public List<Invoice> List() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("1");
        invoice1.setCustomerInvoice("Apple");

        Invoice invoice2 = new Invoice();
        invoice2.setNumber("2");
        invoice2.setCustomerInvoice("Epson");

        return List.of(invoice1, invoice2); // retourne une liste immuable
    }
}
