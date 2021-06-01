package com.example.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custtable")
public class Customer {
	
	@Id
	private int id;
	private String username;
	private String dob;
	private String gender;
	private String email;
	private String password;
	
	
	public Customer() {}


	public Customer(int id, String username, String dob, String gender, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
