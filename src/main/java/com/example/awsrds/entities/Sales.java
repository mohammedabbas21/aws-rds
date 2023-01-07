package com.example.awsrds.entities;

public class Sales {

	private int id;
	private String item;
	private String country;
	private int quantity;
	private float amount;
	
	public Sales() {
		
	}
	
	public Sales(int id, String item, String country, int quantity, float amount) {
	
		this.id = id;
		this.item = item;
		this.country = country;
		this.quantity = quantity;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
	
}
