package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author 街道口译
 * @Date 2022/7/28 15:40
 * @Version 1.0
 **/

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User findUserById(int id) {
		return userMapper.selectById(id);
	}
	
}
