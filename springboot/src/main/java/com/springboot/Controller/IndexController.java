package com.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.Mapper.*;
import com.springboot.service.UserService;

@RestController
public class IndexController {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService userService;
	
   @RequestMapping("/test")
	public String Index() {
	   userMapper.InsertUser("李四", "女");
		return "插入成功";
	}
   @RequestMapping("/all")
   public Object user(Integer id) {
	   return userMapper.getUserById(1);
   }
   
   @RequestMapping("/other")
   public Object dd() {
	   userService.Transfor();
	   return "成功";
	   
   }
}
