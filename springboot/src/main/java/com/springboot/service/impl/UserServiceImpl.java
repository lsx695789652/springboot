package com.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.Mapper.UserMapper;
import com.springboot.entity.User;
import com.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional  //事务
	public void Transfor() {
		// TODO Auto-generated method stub
		userMapper.update("王五", 2);
						
		userMapper.delete(2);
		
		User user=new User();
		user.setName("新增");
		user.setSex("男");
		userMapper.insert(user);
	}

}
