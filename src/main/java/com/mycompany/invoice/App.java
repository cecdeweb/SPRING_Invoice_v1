package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoice.controller.web", "com.mycompany.invoice.service.prefix", "com.mycompany.invoice.repository.memory"})
@PropertySource("classpath:application.properties")
//@ImportResource("classpath:application.properties.xml")
public class App 
{
    public static void main( String[] args )
    {

        // instancie un conteneur léger qui se trouve dans mon classe path qui s'appel ApplicationContext.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        controller.createInvoice();


    }
}
