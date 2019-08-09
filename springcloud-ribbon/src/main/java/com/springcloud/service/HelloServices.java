package com.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloServices {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "helloError")
	public String HelloService() {
		return restTemplate.getForObject("http://CLIENT-WEB/hello", String.class);
		
	}
	
	public String helloError() {
		return "服务器报错";
	}
}
