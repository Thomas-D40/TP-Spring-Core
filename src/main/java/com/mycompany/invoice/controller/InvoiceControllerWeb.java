package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceControllerWeb implements InvoiceControllerInterface {
	
	@Autowired
	InvoiceServiceInterface service;
	
	public void createInvoice() {
		String customerName = "Mike";
		
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
