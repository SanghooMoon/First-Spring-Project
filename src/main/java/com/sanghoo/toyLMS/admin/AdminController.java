package com.sanghoo.toyLMS.admin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanghoo.toyLMS.member.Member;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService aService;
	
	// 가입요청 목록
	@RequestMapping(value="approval")
	public String approvalForm() {
		
		return "approval";
	}
	
	
	// 회원목록
	@RequestMapping(value="management")
	public String managementForm(Model model) {
		
		ArrayList<Member> list = aService.management();
		model.addAttribute("list", list);
		return "memberList";
	}
	
	
	
}
