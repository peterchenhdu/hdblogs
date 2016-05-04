/*
 * File Name: UserService.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.service;

import java.util.List;

import cn.edu.hdu.hdblogs.model.User;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public interface IUserService {

	public List<User> findUser(User condition);
	
	public User findById(User condition);
	
	public User findByNameAndPw(User condition);
	
}
