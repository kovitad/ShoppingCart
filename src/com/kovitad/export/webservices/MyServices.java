package com.kovitad.export.webservices;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import com.kovitad.services.ProductServiceImpl;



public class MyServices extends ResourceConfig{
	public MyServices(){
		
		register(ProductServiceImpl.class).
		register(JacksonFeature.class);		
	}
}
