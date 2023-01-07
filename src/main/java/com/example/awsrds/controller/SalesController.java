package com.example.awsrds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.awsrds.entities.Sales;
import com.example.awsrds.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

	@Autowired
	private SalesService service;
	
	
	@RequestMapping("/")
	public String hello() {
		
		return "hello";
	}
	
	@GetMapping("/{id}")
	public Sales get(@PathVariable int id) {
		  
		return service.getById(id);
		
	}
	
	
}
