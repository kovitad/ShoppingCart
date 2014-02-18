package com.kovitad.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class ProductListingAction extends BaseApplicationAction {

	private List<String> products = new ArrayList<>();
	private String abc = "TESTER";

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	private static final long serialVersionUID = 1284366614123402110L;

	public void init() {
		products.add("test1");
		products.add("test2");
	}

	@Override
	public void prepare() throws Exception {

	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	public String execute() {
		return "success";

	}
}
