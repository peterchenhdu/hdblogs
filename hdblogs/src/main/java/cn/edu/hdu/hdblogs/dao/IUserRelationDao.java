/*
 * File Name: IUserRelationDao.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.dao;

import java.util.Map;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年5月3日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public interface IUserRelationDao {

	public Long getFollowersCount(Map<String,Object> param);
	
	public Long getFollowCount(Map<String,Object> param);
}
