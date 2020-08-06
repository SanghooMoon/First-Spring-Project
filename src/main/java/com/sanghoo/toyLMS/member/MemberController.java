package com.sanghoo.toyLMS.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
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
	public String signIn() {
		System.out.println("signIn()");
		return "login";
	}
	
	
	
	
	
	
}
