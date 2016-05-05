/*
 * File Name: ArticleController.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年4月29日

 * Modifier: Pi Chen
 * Modify Date: 2016年4月29日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.controller.article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hdu.hdblogs.controller.base.BaseController;
import cn.edu.hdu.hdblogs.model.Article;
import cn.edu.hdu.hdblogs.service.IArticleService;

/**
 * 
 * @author Pi Chen
 * @version HDBlogs V1.0.0, 2016年4月29日
 * @see
 * @since HDBlogs V1.0.0
 */

@Controller
@RequestMapping("/admin/article")
public class ArticleController extends BaseController{

	@Autowired
	private IArticleService articleService;

	@RequestMapping(value = "/toAddPage")
	public ModelAndView getAllArticle() {
		ModelAndView modelAndView = new ModelAndView("/article/add_article");
		return modelAndView;
	}
	
	@RequestMapping(value = "/add")
	@ResponseBody
	public String add(HttpServletRequest request, @RequestBody Article article){
		
		
		
		HttpSession session = request.getSession();
		if(session.getAttribute("userName")!=null && session.getAttribute("userID")!=null){
			System.out.println(article.getTitle() + article.getContent());
			article.setAuthorId((Long) session.getAttribute("userID"));
			article.setCreateDate(new Date());
			article.setClicks(0l);
			Long id = articleService.addArticle(article);
			logger.info("ArticleController.add", id);
			return "success";
		}else{
			return "please login.";
		}
		
		
	}
}
