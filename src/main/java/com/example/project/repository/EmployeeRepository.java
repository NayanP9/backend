package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.project.Model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	 

}
