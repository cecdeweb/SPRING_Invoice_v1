package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

import java.io.File;

public class InvoiceServicePrefix implements InvoiceServiceInterface {

    // j'aimerais biensetter des valeurs à ces deux attributs
    // en passant par la config de mon applicationContext-v2.xml
    private static long lastNumber = 0L;
    private String prefix;

    private File file;


    private InvoiceRepositoryInterface repository;

    public void createInvoice(Invoice invoice) {
        // donner un numéro à ma facture
        invoice.setNumber("INV_" + String.valueOf(++lastNumber));
        // appeler le repository pour l'enregistrer
        repository.createInvoice(invoice);
    }

    public InvoiceRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(InvoiceRepositoryInterface repository) {
        this.repository = repository;
    }

    public static long getLastNumber() {
        return lastNumber;
    }

    public static void setLastNumber(long lastNumber) {
        InvoiceServicePrefix.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
