package com.member.add.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.member.add.model.MemberDAOimpl;
import com.member.add.model.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAOimpl dao;
	
	@RequestMapping("test")
	public String test(){
		return "testResult";
	}
	
	@RequestMapping("member_insert")
	public String insert(){
		return "insert";
	}
	
	@RequestMapping(value="member_insert",method=RequestMethod.POST)
	public ModelAndView insert(MemberVO vo){
		dao.insert(vo);
		return new ModelAndView("redirect:member_list");
	}
	
	@RequestMapping("member_list")
	public ModelAndView list(){
		ModelAndView mv= new ModelAndView();
		List<MemberVO> userlist = dao.getMemberList();
		mv.addObject("userlist",userlist);
		mv.setViewName("list");
		return mv;
	}
	
}
