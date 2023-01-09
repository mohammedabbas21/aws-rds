package com.example.micro1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro1.models.AccountSales;
import com.example.micro1.service.AccountSalesImpl;

@RestController
@RequestMapping("/account")
public class AccountController {

		@Autowired
		private AccountSalesImpl service;
	
		@GetMapping("/{id}")
		public AccountSales getAccount(@PathVariable int id) {
			return service.getById(id);
			
		}
		
		@PostMapping("/addaccount")
		public AccountSales saveAccount(@Valid @RequestBody AccountSales newSale) {
			
			return service.saveAccount(newSale);
		}
		
		@PutMapping("/addaccount")
		public String updatedAccount(@Valid @RequestBody AccountSales newSale) {
			
			return service.updateAccount(newSale);
		}
		
		@DeleteMapping("/deleteaccount/{id}")
		public String updatedAccount(@PathVariable int id) {
			
			return service.deleteAccount(id);
		}
}
