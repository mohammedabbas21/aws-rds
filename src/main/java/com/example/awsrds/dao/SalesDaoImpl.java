package com.example.awsrds.dao;

import java.beans.JavaBean;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.awsrds.entities.Sales;

@Component
public class SalesDaoImpl implements SalesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private static final String GET_SALE_BY_ID = "SELECT * FROM SALES WHERE ID=?";
	private static final String DELETE_SALE_BY_ID = "DELETE FROM SALES WHERE ID=?";
	private static final String UPDATE_SALE_BY_ID = "UPDATE SALES SET item=? WHERE ID=?";
	private static final String GET_ALLSALES = "SELECT * FROM SALES";
	private static final String INSERT_SALE = "INSERT INTO SALES(ID,ITEM,COUNTRY,QUANTITY,AMOUNT) VALUES (?,?,?,?,?)";
//	public SalesDaoImpl(JdbcTemplate jdbcTemplate) {
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public Sales get(int id) {
		// TODO Auto-generated method stub
		
		String q = "SELECT * FROM SALES WHERE ID="+id;
		return jdbcTemplate.queryForObject(q, (rs,rowNum)->{
			return new Sales(rs.getInt("id"),rs.getString("item"),rs.getString("country"),rs.getInt("quantity"),rs.getFloat("amount"));
		});
	}

	@Override
	public List<Sales> getAll() {
		// TODO Auto-generated method stub

		return  jdbcTemplate.query(GET_ALLSALES, (rs,rowNum)->{
			return new Sales(rs.getInt("id"),rs.getString("item"),rs.getString("country"),rs.getInt("quantity"),rs.getFloat("amount"));
		});
	}



	@Override
	public String update(Sales sale) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update(UPDATE_SALE_BY_ID, sale.getItem(),sale.getId());
		return "Update successful!";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update(DELETE_SALE_BY_ID,id);
		return "Sale deleted succesfully!";
	}

	@Override
	public Sales save(Sales sale) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update(INSERT_SALE, sale.getId(),sale.getItem(),sale.getCountry(),sale.getQuantity(),sale.getAmount());
		return sale;
	}

}
