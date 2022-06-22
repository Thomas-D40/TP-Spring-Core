package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class InvoiceServiceWithPrefix implements InvoiceServiceInterface{
	
	@Autowired
	private InvoiceRepositoryInterface repository;
	@Value("${invoice.lastId}")
	private long lastId;
	@Value("${invoice.prefix}")
	private String prefix;
	
	
	public void createInvoice(Invoice invoice) {
		// donner une numéro à ma facture (le ++ altère effectivement lastId)
		invoice.setNumber(prefix + String.valueOf(++lastId));
		
		// appelle le repository pour l'enregistrer
		repository.createInvoice(invoice);
	};
	
	public InvoiceRepositoryInterface getRepository() {
		return repository;
	}
	
	public void setRepository(InvoiceRepositoryInterface repository) {
		this.repository = repository;
	}
	
	
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public long getLastId() {
		return lastId;
	}
	
	public void setLastId(long lastId) {
		this.lastId = lastId;
	}
}


