/*
 * File Name: TestController.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bug Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IUserService;


/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */

@Controller
@RequestMapping("/test")
public class TestController {
	private Logger logger = Logger.getLogger(TestController.class);
	@Autowired
	private IUserService UserService;
	@RequestMapping("/test")
	@ResponseBody
	public String initLoginPage() {
		logger.info("hell0");
		
		List<User> userList = UserService.findUser(new User());
		Gson gson = new Gson();
		gson.toJson(userList);
		return gson.toJson(userList);
	}
}
