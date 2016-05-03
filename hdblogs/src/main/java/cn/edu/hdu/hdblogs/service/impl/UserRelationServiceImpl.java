/*
 * File Name: UserRelationServiceImpl.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hdu.hdblogs.dao.IUserRelationDao;
import cn.edu.hdu.hdblogs.service.IUserRelationService;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年5月3日
 * @see       
 * @since     HDBlogs V1.0.0
 */
@Service
public class UserRelationServiceImpl implements IUserRelationService{

	@Autowired
	private IUserRelationDao userRelationDao;
	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserRelationService#getFollowersCount(java.lang.Long)
	 * @param userId
	 * @return
	 */
	@Override
	public long getFollowersCount(Long userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		return userRelationDao.getFollowersCount(map);
	}

	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IUserRelationService#getFollowCount(java.lang.Long)
	 * @param userId
	 * @return
	 */
	@Override
	public long getFollowCount(Long userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		return userRelationDao.getFollowCount(map);
	}

}
