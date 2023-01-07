package com.example.awsrds.dao;


import java.util.List;




public interface SalesDao<Sales> {

	Sales get(int id);
    List<Sales> getAll();
    int save(Sales sale);
    void update(Sales sale);
    void delete(Sales sale);
}
