package com.kovitad.services;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Component;

import com.kovitad.dao.ProductDao;
import com.kovitad.domain.Product;

@WebService(serviceName="ProductWs")
@SOAPBinding(style=Style.RPC)
@Component(value="exportProductServiceClass")
public class ProductWebServiceExample {
	
	@Resource
	private ProductDao productDAO;

	public List<Product> listAll(){
		return productDAO.queryAllProduct();
	}
}
