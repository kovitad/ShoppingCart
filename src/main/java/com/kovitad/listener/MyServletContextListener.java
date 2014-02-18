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
        
    }
    public void contextInitialized(ServletContextEvent context) {
    	File xmlfile = new File(context.getServletContext().getRealPath("WEB-INF/products.xml"));
    	XMLReader reader = new XMLReader(xmlfile);
    	List<Product> product_list = reader.parsexml(); //read the products from the xml file products.xml
    	context.getServletContext().setAttribute("product_list", product_list);//Add product list to attribute products
    }
    public void contextDestroyed(ServletContextEvent event) {
        
    }
	
}
