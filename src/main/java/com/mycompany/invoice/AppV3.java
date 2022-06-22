package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppV3 {
	
	
	
	
	
		public static void main( String[] args )
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextV5.xml");
			
			
			
			// InvoiceControllerInterface controller1 = (InvoiceControllerInterface) context.getBean("controller");
			
			InvoiceControllerInterface controller2 = context.getBean(InvoiceControllerInterface.class);
			
			controller2.createInvoice();
			
			
			
		}
	}
	

