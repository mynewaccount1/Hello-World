package com.rsr.entity;

public class Order {

	private Long orderId;
	private String prodName;
	private String userName;
	private double amount;
	
	public Order() {}
	
	public Order(String prodName, String userName, double amount) {
		super();
		this.prodName = prodName;
		this.userName = userName;
		this.amount = amount;
	}

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
