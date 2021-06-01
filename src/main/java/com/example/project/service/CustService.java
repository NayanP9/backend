package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Customer;
import com.example.project.repository.CustomerRepository;

@Service
public class CustService {
	
	@Autowired
	private CustomerRepository custrepo;
	
	public CustService() {}
	
	public CustService(CustomerRepository custrepo) {
		super();
		this.custrepo = custrepo;
	}
	
	public void saveMyCustomer(Customer customer) {
		custrepo.save(customer);
	}

}
