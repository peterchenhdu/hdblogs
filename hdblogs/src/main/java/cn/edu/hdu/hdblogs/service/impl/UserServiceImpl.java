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

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hdu.hdblogs.dao.IUserDao;
import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IUserService;
import cn.edu.hdu.hdblogs.service.base.BaseService;
import cn.edu.hdu.hdblogs.util.DateUtil;

/**
 * 
 * @author Pi Chen
 * @version HDBlogs V1.0.0, 2016年4月29日
 * @see
 * @since HDBlogs V1.0.0
 */
@Service
public class UserServiceImpl extends BaseService implements IUserService {
	@Autowired
	protected IUserDao userDao;

	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserService#findUser(cn.edu.hdu.hdblogs.model.User)
	 * @param user
	 * @return
	 */
	@Override
	public List<User> findUser(User condition) {
		
		return userDao.findUser(condition);
		
	}

	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserService#findById()
	 * @return
	 */
	@Override
	public User findById(User condition) {
		List<User> userList = userDao.findUser(condition);
		if(userList.size() != 1){
			this.logger.error("error in method findById, invalid userid~");
			return null;
		}
		User rstUser = userList.get(0);
		rstUser.setRegisterAge(DateUtil.getInterval(rstUser.getRegisterTime(), new Date()));
		return rstUser;
	}

	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserService#findByNameAndPw(java.lang.String, java.lang.String)
	 * @param name
	 * @param pw
	 * @return
	 */
	@Override
	public User findByNameAndPw(User condition) {
		String pw = condition.getPassWord();
		// TODO 数据库里一般存放的是加密后的密码，这里要对密码加密
		
		List<User> userList = this.findUser(condition);
		if(userList.size() != 1){
			this.logger.error("error in method findByNameAndPw, invalid name and pw~");
			return null;
		}
		return userList.get(0);
	}

}
