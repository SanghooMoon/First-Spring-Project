package com.sanghoo.toyLMS.member;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO mDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public Member login(String id, String pwd) {
		// TODO Auto-generated method stub
		
		
		return mDAO.loginDAO(sqlSession, id, pwd);
	}
	
}
