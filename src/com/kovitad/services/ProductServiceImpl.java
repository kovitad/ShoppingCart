package com.kovitad.services;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.kovitad.dao.ProductDao;
import com.kovitad.domain.Product;

@Path("/productListing")
@Component(value="productClass")
public class ProductServiceImpl implements ProductService {
	Logger logger = Logger.getLogger(ProductServiceImpl.class);
	@Resource
	private ProductDao productDao;

	@Override
	public List<Product> listAll() {
		if (productDao != null) {
			logger.info("Query product");
			return productDao.queryAllProduct();
		} else {
			return null;
		}
	}

	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> test() {
		List<Product> test = productDao.queryAllProduct();
		return test;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Product> test2() {
		List<Product> test = productDao.queryAllProduct();
		return test;
	}
	
	@PUT
	@Consumes
	public Product getProduct(@QueryParam("productId") int minyear) {
		return null;
	}

}
