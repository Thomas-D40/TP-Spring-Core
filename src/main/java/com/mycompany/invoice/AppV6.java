package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppV6 {
	
	
		public static void main( String[] args )
		{
			ApplicationContext context = new SpringApplication().run(AppV6.class);
		
			InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);
			
			controller.createInvoice();
			
		}
	}
	

