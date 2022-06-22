package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoice.service.prefix", "com.mycompany.invoice.controller.web", "com.mycompany.invoice.repository"})
@ImportResource("classpath:applicationContextV6.xml")
public class AppV5 {
	
	
		public static void main( String[] args )
		{
			ApplicationContext context = new AnnotationConfigApplicationContext(AppV5.class);
		
			InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);
			
			controller.createInvoice();
			
		}
	}
	

