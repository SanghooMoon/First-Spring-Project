package com.sanghoo.toyLMS.admin;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanghoo.toyLMS.member.Member;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO aDAO;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<Member> management() {
		// TODO Auto-generated method stub
		
		return aDAO.management(sqlSession);
	}

}
