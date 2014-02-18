package com.kovitad.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.kovitad.model.Member;

@Repository
public class MemberDAO extends AbstractShoppingCartDao<Member>{

	@Override
	public Member save(Member object) {
		return this.getEM().merge(object);
	}
	
	@SuppressWarnings("unchecked")
	public List<Member> getAllMembers() {
		return this.getEM().createQuery("from com.kovitad.model.Member m where m.active=true").getResultList();
	}
	
	public Member getMember(final String userName) {
		Query query = this.getEM().createQuery("from com.kovitad.model.Member m where m.active=true and m.userName=?");
		query.setParameter(0, userName);
		return (Member) query.getSingleResult();
	}

}
