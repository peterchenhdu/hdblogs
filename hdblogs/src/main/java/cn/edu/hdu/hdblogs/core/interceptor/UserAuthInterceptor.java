package cn.edu.hdu.hdblogs.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IUserService;



public class UserAuthInterceptor extends HandlerInterceptorAdapter {

	//用户Service
	@Autowired
	protected IUserService userService;
	
	@Override
    public boolean preHandle(HttpServletRequest  request,HttpServletResponse  response,
            Object handler)
    		throws Exception{
        
		User user = new User();
		if (request.getSession().getAttribute("userID") != null) {			
			user.setId(Long.parseLong(request.getSession().getAttribute("userID").toString()));
			User temp = userService.findById(user);
			if (temp != null) {
				return true;
			}
		}
		       
        response.setCharacterEncoding("utf-8");
        response.sendRedirect(request.getContextPath()+"/user/toLoginPage.do");
        return false;
    }

}
