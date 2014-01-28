package com.kovitad.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.kovitad.model.Cart;
import com.opensymphony.xwork2.ActionSupport;
public class RemoveFromCartAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {

	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request;

	private HttpServletResponse response;
	
	public String execute() throws Exception
	{
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if( cart.getItems().size() != 0 )
		{
			cart.removeFromCart(cart.selectProductById(Integer.parseInt(request.getParameter("id"))));
			session.setAttribute("cart", cart);
		}
		return SUCCESS;
	}
	
	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}
	
	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;
	}
}
