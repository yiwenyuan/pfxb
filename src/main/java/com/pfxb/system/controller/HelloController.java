package com.pfxb.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfxb.system.entity.HelloEntity;
import com.pfxb.system.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	@RequestMapping("/hello")
	public HelloEntity hello(){
		HelloEntity helloEntity = helloService.findAll();
		return helloEntity;
		
	}
}
