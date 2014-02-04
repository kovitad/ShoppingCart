package com.kovitad.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kovitad.domain.Product;

@Repository
@Transactional
public class ProductDao extends AbstractShoppingCartDao<Product> {
	@Override
	public Product save(Product object) {
		
		return save(object);
	}

}
