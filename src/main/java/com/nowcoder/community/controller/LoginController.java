package com.nowcoder.community.controller;

import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @Author 街道口译
 * @Date 2022/7/29 0:15
 * @Version 1.0
 **/

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/register",method = RequestMethod.GET)
	public String getRegisterPage(){
		return "/site/register";
	}
}
