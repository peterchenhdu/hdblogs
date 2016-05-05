/*
 * File Name: ArticleServiceImpl.java
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

import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hdu.hdblogs.dao.IArticleDao;
import cn.edu.hdu.hdblogs.model.Article;
import cn.edu.hdu.hdblogs.service.IArticleService;

/**
 * 
 * @author    Pi Chen
 * @version   HDBlogs V1.0.0, 2016年4月29日
 * @see       
 * @since     HDBlogs V1.0.0
 */
@Service
public class ArticleServiceImpl implements IArticleService{

	@Autowired
	private IArticleDao articleDao;
	
	/**
	 * 
	 * @see cn.edu.hdu.hdblogs.service.IArticleService#findArticle(cn.edu.hdu.hdblogs.model.Article)
	 * @param article
	 * @return
	 */
	@Override
	public List<Article> findArticleList(Article article) {
		List<Article> articleList = articleDao.findArticle(article);;
		for(Article articleTmp : articleList){
			String content = Jsoup.parse(articleTmp.getContent()).text();
     			
			content = content.length() > 100 ? content.substring(0, 100) : content;   					
			articleTmp.setContent(content + "<a href=\"#\" >阅读全文</a>" );
		}
		return articleDao.findArticle(article);
	}
	
	public Long addArticle(Article article){
		return articleDao.addArticle(article);
	}

}
