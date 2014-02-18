package com.kovitad.services;

import javax.annotation.Resource;


import org.springframework.stereotype.Component;

import com.kovitad.dao.MemberDAO;
import com.kovitad.model.Member;

@Component
public class MemberServiceImpl implements MemberService{
	@Resource
	private MemberDAO memberDao;

	@Override
	public Member register(Member member) {
		
		return memberDao.save(member);
	}
}
