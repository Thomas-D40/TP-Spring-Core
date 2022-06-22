package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.prefix.InvoiceServiceWithPrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoice.controller.web", "com.mycompany.invoice.repository"})
@ImportResource("classpath:applicationContextV6.xml")
public class AppV5_ConfigDansApp {
	
	
		public static void main( String[] args )
		{
			ApplicationContext context = new AnnotationConfigApplicationContext(AppV5_ConfigDansApp.class);
			
		
			InvoiceControllerInterface controller = context.getBean(InvoiceControllerInterface.class);
			
			controller.createInvoice();
			
		}
		
		@Bean
		// Le @Bean permet d'informer Spring que cela fait parti du contexte
		// Vu qu'il s'agit d'une méthode, cela peut permettre notamment la mise en place de conditions
		public InvoiceServiceInterface configureInfoService() {
			return new InvoiceServiceWithPrefix();
		}
}
	

