package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerKeyBoard;
import com.mycompany.invoice.controller.InvoiceControllerWeb;
import com.mycompany.invoice.repository.InvoiceRepositoryMemory;
import com.mycompany.invoice.service.InvoiceServicePrefix;
import com.mycompany.invoice.service.InvoiceServiceNumber;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {

        System.out.println("Dans quelle scenario etons?");
        Scanner scanner = new Scanner(System.in);

        int scenario = scanner.nextInt();

        if(scenario == 1) {

            InvoiceControllerKeyBoard controller = new InvoiceControllerKeyBoard();

            // j'injecte dans mon controller mon service au niveau de l'attribut de type interface
            InvoiceServiceNumber service = new InvoiceServiceNumber();
            controller.setService(service);

            // j'injecte dans mon service le repository
            InvoiceRepositoryMemory repository = new InvoiceRepositoryMemory();
            service.setRepository(repository);

            controller.createInvoice();

        } else if (scenario == 2) {
            InvoiceControllerWeb controller = new InvoiceControllerWeb();

            // j'injecte dans mon controller mon service au niveau de l'attribut de type interface
            InvoiceServicePrefix service = new InvoiceServicePrefix();
            controller.setService(service);

            // j'injecte dans mon service le repository
            InvoiceRepositoryMemory repository = new InvoiceRepositoryMemory();
            service.setRepository(repository);

            controller.createInvoice();
        }

    }
}
