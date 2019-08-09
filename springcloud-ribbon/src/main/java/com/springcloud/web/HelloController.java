package com.springcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.HelloServices;

@RestController
public class HelloController {

	@Autowired
	private  HelloServices service;
	
	@RequestMapping("hello")
	public String Hello() {
		return service.HelloService() ;
	}
}
