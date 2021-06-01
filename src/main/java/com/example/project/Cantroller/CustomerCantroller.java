package com.example.project.Cantroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Customer;
import com.example.project.service.CustService;

@RestController
public class CustomerCantroller {

	@Autowired
	private CustService service;
	
	@PostMapping("/save-customer")
	@Transactional
	public String registerCustomer(@RequestBody Customer customer ) {
		service.saveMyCustomer(customer);
		return "Hello, "+ customer.getUsername()+"your Customer registration is done";	
		
	}
	
	
}
