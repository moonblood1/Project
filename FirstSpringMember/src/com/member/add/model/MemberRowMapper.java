package com.member.add.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper  implements RowMapper <MemberVO>{

	@Override
	public MemberVO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		MemberVO user = new MemberVO();
		user.setId(rs.getString(1));
		user.setPass(rs.getString(2));
		user.setName(rs.getString(3));
		user.setAddr(rs.getString(4));
		user.setMemo(rs.getString(5));
		user.setReg_date(rs.getString(6));
		return user;
	}
}
