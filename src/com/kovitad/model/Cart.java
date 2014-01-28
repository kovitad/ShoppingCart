package com.kovitad.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {

	List<Product> items;
	private double total_price;

	public Cart() {
		items = new ArrayList<Product>();
		this.total_price = 0;
	}

	public void addToCart(Product prod) {
		this.items.add(prod);
		this.total_price = this.total_price + prod.getPrice()
				* prod.getAmount();
	}

	public void removeFromCart(Product prod) {

		this.items.remove(prod);
		this.total_price = this.total_price - prod.getPrice();
		if (this.items.size() == 0) {
			this.total_price = 0;
		}
	}
	
	public void calculate_total()
	{
		Product current;
		this.total_price = 0;
		for(Iterator<Product> prod = items.iterator(); prod.hasNext();)
		{
			current = prod.next();
			this.total_price = this.total_price + current.getAmount() * current.getPrice();
		}
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double totalPrice) {
		this.total_price = totalPrice;
	}
	//Epistrefei ton arithmo twn monadikwn stoiheiwn poy yparxoun sto kalathi
	public int getnumOfItems() {
		return this.getItems().size();
	}

	//Epilegei to proion me vasi to id
	public Product selectProductById(int id) {
		Product prod = null;
		for (Iterator<Product> it = items.iterator(); it.hasNext();) {
			prod = it.next();
			if (prod.getId() == id) {
				return prod;
			}
		}
		return null;
	}

}
