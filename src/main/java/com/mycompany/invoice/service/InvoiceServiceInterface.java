package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

    public void createInvoice(Invoice invoice);

    public void setRepository(InvoiceRepositoryInterface repository);

}
