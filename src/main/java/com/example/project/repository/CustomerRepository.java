package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.project.Model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
