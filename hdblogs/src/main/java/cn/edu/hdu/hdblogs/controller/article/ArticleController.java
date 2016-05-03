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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private IArticleService articleService;

	@RequestMapping(value = "/add")
	public ModelAndView getAllArticle() {
		ModelAndView modelAndView = new ModelAndView("/article/add_article");

		return modelAndView;
	}
}
