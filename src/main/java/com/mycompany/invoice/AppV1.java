package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerWithKeyboard;
import com.mycompany.invoice.controller.InvoiceControllerWeb;
import com.mycompany.invoice.repository.InvoiceRepositoryMemory;
import com.mycompany.invoice.service.InvoiceServiceWithOnlyDigit;
import com.mycompany.invoice.service.InvoiceServiceWithPrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class AppV1
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Etes-vous le client 1 ou 2?");
        int response = scan.nextInt();
        
        if (response == 1) {
    
            InvoiceControllerWithKeyboard controller = new InvoiceControllerWithKeyboard();
            
            // Injection dans le controller le service associé
            InvoiceServiceWithOnlyDigit service = new InvoiceServiceWithOnlyDigit();
            controller.setService(service);
            
            // Injection du repo dans le service
            InvoiceRepositoryMemory repository = new InvoiceRepositoryMemory();
            service.setRepository(repository);
            
            controller.createInvoice();
            
        } else if (response == 2) {
            InvoiceControllerWeb controller = new InvoiceControllerWeb();
    
            // Injection dans le controller le service associé
            InvoiceServiceWithPrefix service = new InvoiceServiceWithPrefix();
            controller.setService(service);
    
            // Injection du repo dans le service
            InvoiceRepositoryMemory repository = new InvoiceRepositoryMemory();
            service.setRepository(repository);
            
            controller.createInvoice();
        }
    }
}
