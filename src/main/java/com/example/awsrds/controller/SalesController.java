package com.example.awsrds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/getall")
	public List<Sales> getall(){
		return service.getAll();
	}
	
	@PostMapping("/newsale")
	public Sales save(@RequestBody Sales s) {
		
		return service.newsale(s);
	}
	
	@PutMapping("/update")
	public String updateSale(@RequestBody Sales s) {
		return service.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}
	
}
