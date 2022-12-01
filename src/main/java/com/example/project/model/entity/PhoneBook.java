package com.example.project.model.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table
public class PhoneBook {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")
	 private int id;
	 
	 @Column(name="name")
	 private String name;
	 
	 @Column(name="mobile")
	 private String mobile;
	 
	 @Column(name="email")
	 private String email;
	 
	//getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
	
}