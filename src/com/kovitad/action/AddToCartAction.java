package com.kovitad.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.kovitad.model.Cart;
import com.kovitad.model.Product;
import com.opensymphony.xwork2.ActionSupport;

public class AddToCartAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 1446375720940600904L;

	public static final String CART_SESSION_KEY = "cart";
	
	private HttpServletRequest request;

	public String execute() throws Exception {
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute(CART_SESSION_KEY);
		if (cart == null) {
			cart = new Cart();
		}
	
		if (cart.selectProductById(Integer.parseInt(request.getParameter("id"))) != null) {
			return SUCCESS;
		}
	
		Product prod = new Product();
		prod.setId(Integer.parseInt(request.getParameter("id")));
		prod.setImg(request.getParameter("img"));
		prod.setDescription(request.getParameter("description"));
		prod.setPrice(Double.parseDouble(request.getParameter("price")));
		prod.setAmount(1);
		cart.addToCart(prod);
		session.setAttribute("cart", cart);
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
