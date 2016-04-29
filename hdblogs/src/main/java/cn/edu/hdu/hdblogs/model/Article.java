/*
 * File Name: Article.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.model;

import java.util.Date;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public class Article {

	private Long id;
	private Long authorId;
	private String title;
	private String content;
	private Date createDate;
	private Long clicks;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the clicks
	 */
	public Long getClicks() {
		return clicks;
	}
	/**
	 * @param clicks the clicks to set
	 */
	public void setClicks(Long clicks) {
		this.clicks = clicks;
	}
	/**
	 * @return the authorId
	 */
	public Long getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
}
