package cn.edu.hdu.hdblogs.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.edu.hdu.hdblogs.controller.base.BaseController;
import cn.edu.hdu.hdblogs.model.User;
import cn.edu.hdu.hdblogs.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private IUserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	@ResponseBody
	public String login(@RequestBody User userParam, HttpServletRequest request) {
		logger.info("login");
		try {
			User user = userService.findByNameAndPw(userParam);

			if (user != null) {
				request.getSession().setAttribute("userID", user.getId());
				request.getSession().setAttribute("userName", user.getUserName());
				logger.info("user login success");
				return "success";
			} else {
				logger.info("invalid user");
				return "invalid user";
			}
		} catch (Exception e) {
			logger.error("UserController.login();", e.getMessage());
			return "fail";
		}

	}
	@RequestMapping(value = "/logout")
	@ResponseBody
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("userID");
		request.getSession().removeAttribute("userName");
		return "success";
	}
}
