package com.sanghoo.toyLMS.admin;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.sanghoo.toyLMS.member.Member;

@Repository
public class AdminDAO {

	public ArrayList<Member> management(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		
		return (ArrayList)sqlSession.selectList("adminMapper.management");
	}

}
