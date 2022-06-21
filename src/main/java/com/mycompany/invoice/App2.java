package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {

        // principe de reflexivité
        // Cela correspond au fait d’instancier un objet sur la base d’un nom de classe.
        // Donc plus besoin de switch case !

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la classe controller que tu souhaites utiliser?");
        String controlerName = scanner.nextLine();

        System.out.println("Quelle est la classe du service que tu souhaites utiliser?");
        String serviceName = scanner.nextLine();

        System.out.println("Quelle est la classe du repository que tu souhaites utiliser?");
        String repoName = scanner.nextLine();

        InvoiceControllerInterface controller = null;
        InvoiceServiceInterface service = null;
        InvoiceRepositoryInterface repository = null;

        // le nom des classes :
        // com.mycompany.invoice.controller.InvoiceControllerKeyBoard
        // com.mycompany.invoice.service.InvoiceServiceNumber
        // com.mycompany.invoice.repository.InvoiceRepositoryMemory

        try {

            controller = (InvoiceControllerInterface) Class.forName(controlerName).getDeclaredConstructor().newInstance();
            service = (InvoiceServiceInterface) Class.forName(serviceName).getDeclaredConstructor().newInstance();
            repository = (InvoiceRepositoryInterface) Class.forName(repoName).getDeclaredConstructor().newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // l'injectiond de dépendances

        controller.setService(service);
        service.setRepository(repository);
        controller.createInvoice();

    }
}
