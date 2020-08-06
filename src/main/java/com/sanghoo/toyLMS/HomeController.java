package com.sanghoo.toyLMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index2() {
		System.out.println("index2()");
		return "index";
	}
	
}
