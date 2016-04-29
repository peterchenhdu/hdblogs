/*
 * File Name: UserServiceImpl.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hdu.hdblogs.dao.IUserDao;
import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IUserService;

/**
 * 
 * @author Pi Chen
 * @version HDBlogs V1.0.0, 2016年4月29日
 * @see
 * @since HDBlogs V1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	protected IUserDao userDao;

	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserService#findUser(cn.edu.hdu.hdblogs.model.User)
	 * @param user
	 * @return
	 */
	@Override
	public List<User> findUser(User user) {

		List<User> userList = userDao.findUser(user);

		return userList;
	}

}
