package com.example.awsrds.service;

import java.util.List;

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
	
	public List<Sales> getAll(){
		
		return salesDao.getAll();
	}
	
	public Sales newsale(Sales s) {
		
		return salesDao.save(s);
	}
	
	public String update(Sales s) {
		return salesDao.update(s);
	}
	
	public String delete(int id) {
		return salesDao.delete(id);
	}
	
}
