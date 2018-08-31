package com.rstone.web.service.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rstone.web.common.Calc;
import com.rstone.web.domain.MemberDTO;
import com.rstone.web.mapper.MemberMapper;
import com.rstone.web.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberMapper mapper;
	@Autowired Calc calc;
	@Override
	public void add(MemberDTO p) {
		String ssn = p.getSsn();
		p.setAge(calc.age(ssn));
		p.setGender((ssn.split("-")[1].equals("1"))?"남":"여");
		mapper.insert(p);
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
		return mapper.selectOne(p); 
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO p) {
		mapper.update(p);
		
	}

	@Override
	public void remove(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(MemberDTO p) {
		return (mapper.selectOne(p) != null);
	}

}
