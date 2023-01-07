package com.example.awsrds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.awsrds.dao.SalesDaoImpl;
import com.example.awsrds.entities.Sales;

@Service
public class SalesService {

	@Autowired
	private SalesDaoImpl salesDao;
	
	public Sales getById(int id) {
		
		return salesDao.get(id);
	}
	
	
	
}