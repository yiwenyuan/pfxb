package com.pfxb.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pfxb.system.entity.HelloEntity;
import com.pfxb.system.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public HelloEntity hello(){
		HelloEntity helloEntity = helloService.findAll();
		return helloEntity;
	}
	
	@RequestMapping("/login")
	public String toLogin() {
		return "views/login/login";
	}
}
