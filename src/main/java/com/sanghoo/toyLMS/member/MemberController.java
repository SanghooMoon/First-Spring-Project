package com.sanghoo.toyLMS.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService mService;
	
	// 로그인 페이지로 이동
	@RequestMapping(value="login")
	public String loginForm() {
		return "login";
	}
	
	// 약관동의 페이지로 이동
	@RequestMapping(value="agree")
	public String registerForm2() {
		return "agree";
	}
	
	// 회원가입 페이지로 이동
	@RequestMapping(value="register")
	public String registerForm() {
		return "register";
	}
	
	// 회원가입 서비스
	@RequestMapping(value="signUp")
	public String signUp() {
		System.out.println("signUp()");
		return "login";
	}
	
	// 로그인 서비스
	@RequestMapping(value="signIn")
	public String signIn(@RequestParam("id") String id, @RequestParam("pwd") String pwd, HttpSession session) {
		System.out.println("signIn()");
		System.out.println(id);
		System.out.println(pwd);
		
		Member member = mService.login(id, pwd);
		if(member!=null) {
			System.out.println("성공");
			session.setAttribute("loginUserInfo", member);
			return "forward:/index";
		} 
		
		return "login";		
	}
	
	
	
	
	
	
}
