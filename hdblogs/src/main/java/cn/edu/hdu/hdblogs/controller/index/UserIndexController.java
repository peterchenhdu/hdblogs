/*
 * File Name: UserIndexController.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.controller.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hdu.hdblogs.controller.base.BaseController;
import cn.edu.hdu.hdblogs.model.Article;
import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IArticleService;
import cn.edu.hdu.hdblogs.service.IUserRelationService;
import cn.edu.hdu.hdblogs.service.IUserService;
import cn.edu.hdu.hdblogs.service.impl.UserServiceImpl;
import cn.edu.hdu.hdblogs.util.DateUtil;

/**
 * 
 * @author Pi Chen
 * @version HDBlogs V1.0.0, 2016年5月3日
 * @see
 * @since HDBlogs V1.0.0
 */

@Controller
@RequestMapping("/index")
public class UserIndexController extends BaseController{

	@Autowired
	private IUserService userService;
	@Autowired
	private IUserRelationService userRelationService;
	@Autowired
	private IArticleService articleService;
	
	
	@RequestMapping("user")
	public ModelAndView userIndex(Long userId) {
		System.out.println(userId);
		
		User user = userService.findById(userId);
		System.out.println(user.getRegisterAge());
		ModelAndView modelAndView = new ModelAndView("/index");

		Article condition = new Article();
		condition.setAuthorId(userId);
		List<Article> articleList = articleService.findArticle(condition);


		modelAndView.addObject("articleList", articleList);
		modelAndView.addObject("userInfo", user);
		modelAndView.addObject("followersCount", userRelationService.getFollowersCount(userId));
		modelAndView.addObject("followCount", userRelationService.getFollowCount(userId));

		return modelAndView;
	}
}
