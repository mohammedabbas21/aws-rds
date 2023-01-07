package com.example.awsrds.dao;


import java.util.List;

import com.example.awsrds.entities.Sales;


public interface SalesDao {

	Sales get(int id);
    List<Sales> getAll();
    Sales save(Sales sale);
    Sales update(Sales sale);
    String delete(int id);
}
