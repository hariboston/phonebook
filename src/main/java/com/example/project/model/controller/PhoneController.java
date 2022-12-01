package com.example.project.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.entity.PhoneBook;
import com.example.project.model.service.PhoneService;

@Controller
@RequestMapping(value="/phone")
public class PhoneController {

	@Autowired
	PhoneService phoneService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("phone_list");
	  List<PhoneBook> phoneList = phoneService.getAllPhoneBooks();
	  model.addObject("phoneList", phoneList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addPhone/", method=RequestMethod.GET)
	 public ModelAndView addPhone() {
		 
	  ModelAndView model = new ModelAndView();
	  PhoneBook phone = new PhoneBook();
	  model.addObject("phoneForm", phone);
	  model.setViewName("phone_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editPhone/{id}", method=RequestMethod.GET)
	 public ModelAndView editPhone(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  PhoneBook phone = phoneService.getPhoneBookById(id);
	  model.addObject("phoneForm", phone);
	  model.setViewName("phone_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addPhone", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("phoneForm") PhoneBook phonebook) {
		 
	  phoneService.addPhoneBook(phonebook);
	  return new ModelAndView("redirect:/phone/list");
	  
	 }
	 
	 @RequestMapping(value="/deletePhone/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  phoneService.deletePhoneBook(id);
	  return new ModelAndView("redirect:/phone/list");
	  
	 }
	
	
	
}