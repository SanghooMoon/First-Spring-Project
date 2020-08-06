package com.sanghoo.toyLMS.member;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	public Member loginDAO(SqlSessionTemplate sqlSession, String id, String pwd) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("id", id);
		hs.put("pwd", pwd);
		
		return sqlSession.selectOne("memberMapper.login", hs);
	}
	
	
	
}
