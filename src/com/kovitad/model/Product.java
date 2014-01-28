package com.kovitad.model;

public class Product {
	private int id;
	private String description;
	private String img;
	private double price;
	private int amount;

	public Product() {
		this.setImg("");
		this.setId(-1);
		this.setDescription("");
		this.setPrice(-1);
		this.setAmount(-1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
