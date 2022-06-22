package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class InvoiceControllerWithKeyboard implements InvoiceControllerInterface{
	@Autowired
	InvoiceServiceInterface service;
	
	public void createInvoice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Customer name:");
		String customerName = input.nextLine();
		
		// Générer la facture
		Invoice newInvoice = new Invoice();
		newInvoice.setCustomerInvoice(customerName);
		
		
		service.createInvoice(newInvoice);
	}
	
	public InvoiceServiceInterface getService() {
		return service;
	}
	
	public void setService(InvoiceServiceInterface service) {
		this.service = service;
	}
}
