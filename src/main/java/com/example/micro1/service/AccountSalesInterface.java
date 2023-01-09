package com.example.micro1.service;

import com.example.micro1.models.AccountSales;

public interface AccountSalesInterface {

	public AccountSales getById(int id);
	public AccountSales saveAccount(AccountSales s);
	public String updateAccount(AccountSales s);
	public String deleteAccount(int id);
}
