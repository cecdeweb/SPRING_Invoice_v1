package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // instancie un conteneur léger qui se trouve dans mon classe path qui s'appel ApplicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-v2.xml");

        // pour récupérer mon controller je peux pas soit par son id soit par son interface
        // context.getBean("controller"); mais je n'ai pas d'id pour mon controller

        // en précisant l'interface, je vais récupérer InvoiceControllerWeb car c'est celui que j'ai déclaré dans mon applicationContext-v2.xml
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        controller.createInvoice();


    }
}
