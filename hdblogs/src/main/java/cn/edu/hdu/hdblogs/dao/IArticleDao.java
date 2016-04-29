/*
 * File Name: IArticleDao.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.dao;

import java.util.List;

import cn.edu.hdu.hdblogs.model.Article;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */

public interface IArticleDao {

	public List<Article> findArticle(Article article);
}
