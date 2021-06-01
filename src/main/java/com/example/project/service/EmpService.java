package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Employee;
import com.example.project.repository.EmployeeRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	
	public EmpService() {}

	public EmpService(EmployeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}
	
	public void saveMyEmployee(Employee employee) {
		emprepo.save(employee);
		
	}
	
	

}
