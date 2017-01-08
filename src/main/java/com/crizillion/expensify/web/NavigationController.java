package com.crizillion.expensify.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class NavigationController {
	
	@RequestMapping("/dashboard")
	public String dashboard(){
		return "dashboard";
	}

}
