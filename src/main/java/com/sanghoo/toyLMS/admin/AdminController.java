package com.sanghoo.toyLMS.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping(value="approval")
	public String approvalForm() {
		return "approval";
	}
	
	@RequestMapping(value="management")
	public String managementForm() {
		return "memberList";
	}
	
	
	
}
