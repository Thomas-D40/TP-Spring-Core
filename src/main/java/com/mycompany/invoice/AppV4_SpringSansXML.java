package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class AppV4_SpringSansXML {
	
	
		public static void main( String[] args )
		{
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertiesSource.class);
			
			InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);
			
			controller.createInvoice();
			
		}
	}
	

