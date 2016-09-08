package com.member.add.model;

import java.util.List;

public interface MemberDAO {
		//전체보기
		List<MemberVO> getMemberList();
		//추가
		void insert(MemberVO user);
		//상세보기
		MemberVO findById(String id);
		//수정
		void Update(MemberVO user);
		//삭제
		void delete(String id);
}
