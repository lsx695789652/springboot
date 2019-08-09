package com.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client-web",fallback =HelloServiceImpl.class)
public interface HelloService {
	
	@RequestMapping("/hello")
	String Hello();

}
