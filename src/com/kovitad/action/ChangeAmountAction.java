package com.kovitad.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.kovitad.model.Cart;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeAmountAction extends ActionSupport implements
		ServletRequestAware {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private int amount;
	private int id;


	
	public String execute() throws Exception {

		int amount = Integer.parseInt(request.getParameter("amount"));
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		int total_price = 0;
		
		if (this.amount <= 0) {
			return ERROR;
		}
		// change product amount
		cart.selectProductById(id).setAmount(amount);
		// Calculate the new total price
		cart.calculate_total();
		return SUCCESS;
	}
	public void validate()
	{

		if(getAmount() <= 0)
		{
			addFieldError("amount", "Amount must be greater than zero");
		}
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
