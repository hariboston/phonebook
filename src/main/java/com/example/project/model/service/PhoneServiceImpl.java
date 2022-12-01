package com.example.project.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.entity.PhoneBook;
import com.example.project.model.repo.PhoneRepository;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	PhoneRepository phoneRepository;
	
	
	@Override
	public List<PhoneBook> getAllPhoneBooks() {
		return (List<PhoneBook>) phoneRepository.findAll();
	}

	@Override
	public PhoneBook getPhoneBookById(int id) {
		return phoneRepository.findById(id).get();
	}

	@Override
	public void addPhoneBook(PhoneBook phonebook) {
		phoneRepository.save(phonebook);
	}

	@Override
	public void deletePhoneBook(int id) {
		phoneRepository.deleteById(id);
	}

}