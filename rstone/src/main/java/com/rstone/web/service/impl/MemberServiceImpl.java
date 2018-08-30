package com.rstone.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rstone.web.domain.MemberDTO;
import com.rstone.web.mapper.MemberMapper;
import com.rstone.web.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mapper;
	@Override
	public void add(MemberDTO p) {
		
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
	
		return null;
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		System.out.println("Param Id is "+p.getUserid());
		MemberDTO m = mapper.selectOne(p); 
		System.out.println("Result Id is "+m.getUserid());
		return m;
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(MemberDTO p) {
		// TODO Auto-generated method stub
		return false;
	}

}
