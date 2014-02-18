package com.kovitad.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class AbstractShoppingCartDao <T>{

	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEM(){
		return entityManager;
	}
	public abstract T save(T object);

}
