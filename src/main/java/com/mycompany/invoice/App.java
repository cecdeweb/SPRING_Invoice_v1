package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

//@Configuration
//@ComponentScan(basePackages = {"com.mycompany.invoice"})
//@PropertySource("classpath:application.properties")
@SpringBootApplication
//@EnableAutoConfiguration
public class App
{
    public static void main( String[] args )
    {

        // ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class);
        InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);

        controller.createInvoice();

    }


}
