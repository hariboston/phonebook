package com.example.project.model.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.project.model.entity.PhoneBook;

public interface PhoneRepository extends CrudRepository<PhoneBook, Integer> {

}