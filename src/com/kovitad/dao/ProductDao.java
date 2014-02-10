package com.kovitad.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kovitad.domain.Product;


@Repository
@Transactional(value="txManager")
public class ProductDao extends AbstractShoppingCartDao<Product> {
	@Override
	public Product save(Product object) {
		
		return this.getEM().merge(object);
	}

	public List<Product> queryAllProduct(){
		//CriteriaQuery<Product> criteriaQuery = this.getEM().getCriteriaBuilder().createQuery(Product.class);
		final TypedQuery<Product> query = this.getEM().createQuery("from com.kovitad.domain.Product", Product.class);
		List<Product> result = query.getResultList();
		//Base64Coder.decode(in)
//		for(Product item : result) {
//			item.setImage(Base64.decodeBase64(item.getImage()));
//		}
		
		return result;
		
	}
	
}
