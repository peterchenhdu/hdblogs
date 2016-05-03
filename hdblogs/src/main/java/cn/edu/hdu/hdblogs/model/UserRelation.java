/*
 * File Name: UserRelation.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.model;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年5月3日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public class UserRelation {

	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 关注者ID
	 */
	private Long followerId;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the followerId
	 */
	public Long getFollowerId() {
		return followerId;
	}
	/**
	 * @param followerId the followerId to set
	 */
	public void setFollowerId(Long followerId) {
		this.followerId = followerId;
	}
}
