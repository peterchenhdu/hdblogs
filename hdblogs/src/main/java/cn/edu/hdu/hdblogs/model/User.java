/*
 * File Name: User.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bug Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.model;

import java.sql.Timestamp;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public class User {

	private Long id;
	private String userName;
	private String passWord;
	private String email;
	private String description;
	private Timestamp registerTime;
	private String registerAge;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the registerTime
	 */
	public Timestamp getRegisterTime() {
		return registerTime;
	}
	/**
	 * @param registerTime the registerTime to set
	 */
	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}
	/**
	 * @return the registerAge
	 */
	public String getRegisterAge() {
		return registerAge;
	}
	/**
	 * @param registerAge the registerAge to set
	 */
	public void setRegisterAge(String registerAge) {
		this.registerAge = registerAge;
	}


}
