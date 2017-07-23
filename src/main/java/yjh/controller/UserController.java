package yjh.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yjh.domain.User;
import yjh.service.UserService;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String user_id,String user_pwd,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(user_id, user_pwd);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			session.setAttribute("user_id", user_id);
			// 转发到shop请求
			mv.setViewName("shop");
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("login");
		}
		return mv;
	}
	@RequestMapping(value="/enroll",method = RequestMethod.POST)
	public ModelAndView register(String user_id, String user_name,String user_pwd,String user_mail,String user_address,ModelAndView mv, HttpSession session) {
		// 根据输入的登录名和密码向数据库中添加新的用户信息,完成注册
		User user = userService.register(user_id, user_name,user_pwd,user_mail,user_address);
		// 注册成功，将user对象设置到HttpSession作用范围域
		session.setAttribute("user", user);
		// 转发到login请求
		mv.setViewName("login");
		return mv;
	}
	 @RequestMapping(value="/changepwd",method = RequestMethod.POST)
	 public ModelAndView changepwd(HttpServletRequest request, ModelAndView mv,String forepwd,String newpwd){
			String user_id=(String)request.getParameter("user_id");
			// 根据登录名和密码查找用户，验证用户身份
			User user = userService.login(user_id, forepwd);
			if(user != null){
				// 登录成功，修改密码为新密码
				userService.changepwd(user_id, newpwd);
				// 转发到change请求
				mv.addObject("message", "修改密码成功!");
				mv.setViewName("change");
			}else{
				// 登录失败，设置失败提示信息，并跳转到登录页面
				mv.addObject("message", "原密码错误，请重新输入!");
				mv.setViewName("change");
			}
			return mv;
	 }
	 @RequestMapping(value="/sendpwdmail")
	 public ModelAndView sendpwdmail(String user_id,ModelAndView mv) throws EmailException{
		 //根据账户名定位用户信息以确定邮件发送目标
		 User user= userService.findWithUser_id(user_id);
		 if (user!=null){
		 String user_pwd=user.getUser_pwd();
		 String user_mail= user.getUser_mail();
		 //发送邮件到账户绑定邮箱
		 SimpleEmail email = new SimpleEmail();  
	        email.setHostName("smtp.163.com"); // 发送服务器  
	        email.setAuthentication("yjh545063309@163.com", "yjh545063309"); // 发送邮件的用户名和密码  
	        email.addTo(user_mail, "receive"); // 接收邮箱  
	        email.setFrom("yjh545063309@163.com", "壹号商城"); // 发送邮箱  
	        email.setSubject("找回账户密码");// 主题  
	        email.setMsg("您的密码为："+user_pwd); // 内容
	        email.setCharset("UTF-8"); // 编码  
	        email.send(); 
		 mv.addObject("pwdmessage", "密码已发送到账户绑定邮箱，请尝试登陆!");
		 mv.setViewName("findpassword");
		 }else{
			 mv.addObject("pwdmessage", "该账户不存在，请检查账号！");
			 mv.setViewName("findpassword");
		 }
		 return mv;
	 }
}