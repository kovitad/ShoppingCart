package com.kovitad.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.kovitad.model.Cart;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
public class MySessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
        
        
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent event) {
    	//Dhmiourgia enos kalathiou gia kathe session kai prosthiki san attrribute
    	Cart cart = new Cart();
    	event.getSession().setAttribute("cart", cart);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event) {
    	//An to session termatistei den exei noima na iparxei to kalathi
        event.getSession().removeAttribute("cart");
    }
	
}
