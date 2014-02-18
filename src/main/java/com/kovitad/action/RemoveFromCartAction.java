package com.kovitad.action;

import javax.servlet.http.HttpSession;

import com.kovitad.model.Cart;

public class RemoveFromCartAction extends BaseApplicationAction  {

	private static final long serialVersionUID = 4248825420575740777L;
	
	
	@Override
	public void prepare() throws Exception {
		
	}
	
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
	
	
}
