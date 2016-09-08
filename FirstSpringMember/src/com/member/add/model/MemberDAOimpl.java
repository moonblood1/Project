package com.member.add.model;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class MemberDAOimpl implements MemberDAO{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		String sql = "select * from springmember";
		List<MemberVO> userlist = template.query(sql, new MemberRowMapper());
		return userlist;
	}

	@Override
	public void insert(MemberVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(MemberVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
