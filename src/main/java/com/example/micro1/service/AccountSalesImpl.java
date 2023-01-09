package com.example.micro1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.micro1.models.AccountSales;
import com.example.micro1.repository.AccountSalesRepository;

public class AccountSalesImpl implements AccountSalesInterface {

	
	@Autowired
	private AccountSalesRepository repository;
	
	@Override
	public AccountSales getById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse(null);
	}

	@Override
	public AccountSales saveAccount(AccountSales s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public String updateAccount(AccountSales s) {
		// TODO Auto-generated method stub
		AccountSales newObj = repository.findById(s.getId()).orElse(null);
		newObj.setBuyPrice(s.getBuyPrice());
		newObj.setSellPrice(s.getSellPrice());
		newObj.setItem(s.getItem());
		
		return "Account with id" + s.getId() + " Deleted Successfully!";
	}

	@Override
	public String deleteAccount(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Account with id" + id + " Deleted Successfully!";
	}
	
	

}