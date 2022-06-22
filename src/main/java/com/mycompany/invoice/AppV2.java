package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import java.util.Scanner;

public class AppV2 {
	
	
	
	
	
		public static void main( String[] args )
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Quelle est la classe controller que tu souhaites utiliser?");
			String controllerName = scan.nextLine();
			
			System.out.println("Quelle est la classe service que tu souhaites utiliser?");
			String serviceName = scan.nextLine();
			
			System.out.println("Quelle est la classe repository que tu souhaites utiliser?");
			String repoName = scan.nextLine();
			
			InvoiceControllerInterface controller = null;
			InvoiceServiceInterface service = null;
			InvoiceRepositoryInterface repository = null;
			
			String controllerFullName = "com.mycompany.invoice.controller." + controllerName;
			String serviceFullName = "com.mycompany.invoice.service." + serviceName;
			String repoFullName = "com.mycompany.invoice.repository." + repoName;
			
			
			try {
				controller = (InvoiceControllerInterface)	Class.forName(controllerFullName).getDeclaredConstructor().newInstance();
				service = (InvoiceServiceInterface)	Class.forName(serviceFullName).getDeclaredConstructor().newInstance();
				repository = (InvoiceRepositoryInterface) 	Class.forName(repoFullName).getDeclaredConstructor().newInstance();
				
			} catch (Exception e) {
				System.out.println("Une erreur est survenue");
				e.printStackTrace();
			}
			
			// l'injection des dépendances
			controller.setService(service);
			service.setRepository(repository);
			
			controller.createInvoice();
			
			
			
		}
	}
	

