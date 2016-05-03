/*
 * File Name: IUserRelationService.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.service;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年5月3日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public interface IUserRelationService {

	public long getFollowersCount(Long userId);
	
	public long getFollowCount(Long userId);
}
