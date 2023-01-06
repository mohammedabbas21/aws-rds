package com.example.awsrds.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressResource {

	ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap();
	
	@RequestMapping(path="/{id}",method = RequestMethod.GET)
	public Contact getContact(@PathVariable String id) {
		
		return contacts.get(id);
		
	}
	
	@RequestMapping(path="/",method = RequestMethod.GET)
	public List<Contact> getAllContacts(){
		
		return new ArrayList<Contact>(contacts.values());
	}
	
	@RequestMapping(path="/",method = RequestMethod.POST)
	public Contact addContact(@RequestBody Contact contact) {
		
		contacts.put(contact.getId(), contact);
		return contact;
		
		
	}
	
	
}
