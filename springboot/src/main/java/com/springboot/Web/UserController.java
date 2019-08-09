package com.springboot.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Mapper.UserMapper;
import com.springboot.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
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
   @RequestMapping("/login")
   public Object Login() {
	   return "login";
   }
}
