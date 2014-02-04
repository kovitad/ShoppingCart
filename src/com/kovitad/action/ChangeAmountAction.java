package com.kovitad.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kovitad.model.Cart;

public class ChangeAmountAction extends BaseApplicationAction {


	private static final long serialVersionUID = 7746405764436655826L;

	private int amount;
	private int id;


	@Override
	public void prepare() throws Exception {
		
	}
	
	public String execute() throws Exception {

		int amount = Integer.parseInt(request.getParameter("amount"));
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
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
