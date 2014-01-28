package com.kovitad.listener;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.kovitad.model.Product;
import com.xmlreader.XMLReader;

/**
 * Application Lifecycle Listener implementation class MyServletContextListener
 *
 */
public class MyServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	File xmlfile = new File(arg0.getServletContext().getRealPath("WEB-INF/products.xml"));
    	XMLReader reader = new XMLReader(xmlfile);
    	List<Product> product_list = reader.parsexml(); //read the products from the xml file products.xml
    	arg0.getServletContext().setAttribute("product_list", product_list);//Add product list to attribute products
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
