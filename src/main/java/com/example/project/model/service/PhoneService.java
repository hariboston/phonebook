package com.example.project.model.service;

import java.util.List;

import com.example.project.model.entity.PhoneBook;

public interface PhoneService {

	
	 public List<PhoneBook> getAllPhoneBooks();
	 
	 public PhoneBook getPhoneBookById(int id);
	 
	 public void addPhoneBook(PhoneBook phonebook);
	 
	 public void deletePhoneBook(int id);
	

}