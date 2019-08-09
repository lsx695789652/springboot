package com.springcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService hello;
	
	@RequestMapping("/hello")
	public String hello() {
		return hello.Hello();
	}
}
