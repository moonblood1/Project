package com.member.add.model;

import java.util.List;

public interface MemberDAO {
		//��ü����
		List<MemberVO> getMemberList();
		//�߰�
		void insert(MemberVO user);
		//�󼼺���
		MemberVO findById(String id);
		//����
		void Update(MemberVO user);
		//����
		void delete(String id);
}
