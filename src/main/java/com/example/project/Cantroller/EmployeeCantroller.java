package com.example.project.Cantroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Employee;
import com.example.project.service.EmpService;



@RestController
public class EmployeeCantroller {
	
	@Autowired
	private EmpService service;
	
	@PostMapping("/save-employee")
	@Transactional
	public String registerEmployee(@RequestBody Employee employee) {
		service.saveMyEmployee(employee);
		return "Hello, "+employee.getUsername()+"your registration is done";
		
	
		
		
	}

}
