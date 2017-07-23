package yjh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import yjh.domain.Order;
import yjh.domain.User;
import yjh.service.CartService;
import yjh.service.GoodService;
import yjh.service.OrderService;
import yjh.service.UserService;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	UserService userService;
	@Autowired
	GoodService goodService;
	@Autowired
	CartService cartService;
	//我的订单
	@RequestMapping(value="/order")
	public String order(Model model,HttpServletRequest request){
	        // 获得该用户所有订单集合
			String user_id = (String)request.getSession().getAttribute("user_id");
 			int user_id_ = Integer.parseInt(user_id);
			List<Order> order_list = orderService.getAllbyuser(user_id_);
			// 将订单集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "order";
			}
	
	//取消一条订单
		@RequestMapping(value="/removeorder")
		public String removeorder(HttpServletRequest request){
			String id = request.getParameter("id");
			int id_= Integer.parseInt(id);
			String good_id = request.getParameter("good_id");
			int good_id_ = Integer.parseInt(good_id);
			String count = request.getParameter("count");
			int count_ = Integer.parseInt(count);
			//订单表中删除订单
			orderService.removeOrder(id_);
			//商品表对应增加库存
			goodService.addGoodWithCount(good_id_,count_);
			// 跳转到order页面
			return "redirect:/order";
			}
		//添加订单
		@RequestMapping(value = "/saveorder")
		public String saveorder(HttpServletRequest request){
			String good_id = request.getParameter("good_id");
			int good_id_ = Integer.parseInt(good_id);
			String count = request.getParameter("count");
			int count_ = Integer.parseInt(count);
			Object user_id=request.getSession().getAttribute("user_id");
			int user_id_=Integer.parseInt(String.valueOf(user_id)); 
			String order_state = request.getParameter("order_state");
				orderService.saveOrder(good_id_,user_id_,count_,order_state);
				cartService.removeCart(good_id_,user_id_);
				//库存相应减少
				goodService.removeGoodWithCount(good_id_,count_);
			// 跳转到order页面
			return "redirect:/order";
		}
		//详情页直接购买
				@RequestMapping(value = "/directbuy")
				public String directbuy(HttpServletRequest request){
					String good_id = request.getParameter("good_id");
					int good_id_ = Integer.parseInt(good_id);
					String count = request.getParameter("count");
					int count_ = Integer.parseInt(count);
					Object user_id=request.getSession().getAttribute("user_id");
					int user_id_=Integer.parseInt(String.valueOf(user_id)); 
					String order_state = request.getParameter("order_state");
						orderService.saveOrder(good_id_,user_id_,count_,order_state);
						goodService.removeGoodWithCount(good_id_,count_);
					// 跳转到order页面
					return "redirect:/order";
				}
		//用户完成订单
		@RequestMapping(value="/complete")
		public String complete(HttpServletRequest request){
			String id=request.getParameter("id");
			int id_=Integer.parseInt(id);
			orderService.completeOrder(id_);
			// 跳转到order页面
			return "redirect:/order";
		}
		//后台确认发货
		@RequestMapping(value="/sendout")
		public String sendout(HttpServletRequest request){
			String id=request.getParameter("id");
			int id_=Integer.parseInt(id);
			orderService.sendOutOrder(id_);
			return "redirect:/manage";
		}
		//后台发送订单信息
		@RequestMapping(value="/sendordermail")
		public ModelAndView sendordermail(HttpServletRequest request,ModelAndView mv)throws EmailException{
			//根据订单编号定位用户账号
			String id=request.getParameter("id");
			int id_=Integer.parseInt(id);
			Order order=orderService.findOrderbyid(id_);
			String user_id=String.valueOf(order.getUser_id());
			//根据用户账号确定邮件发送目标
			User user=userService.findWithUser_id(user_id);
			String user_mail=user.getUser_mail();
			//发送邮件
			SimpleEmail email = new SimpleEmail();  
	        email.setHostName("smtp.163.com"); // 发送服务器  
	        email.setAuthentication("yjh545063309@163.com", "yjh545063309"); // 发送邮件的用户名和密码  
	        email.addTo(user_mail, "receive"); // 接收邮箱  
	        email.setFrom("yjh545063309@163.com", "壹号商城"); // 发送邮箱  
	        email.setSubject("订单发货通知");// 主题  
	        email.setMsg("您的编号为"+id+"的订单已发货，请及时收货完成订单并评论"); // 内容
	        email.setCharset("UTF-8"); // 编码  
	        email.send();
			mv.setViewName("manage");
			return mv; 
		}
		//用户订单评论
		@RequestMapping(value="/comment")
		public String comment(HttpServletRequest request,Model model,String comment_count,String comment_image,String comment_text){
			String id=(String)request.getParameter("id");
			int id_=Integer.parseInt(id);
			Object user_id=request.getSession().getAttribute("user_id");
			int user_id_=Integer.parseInt(String.valueOf(user_id)); 
			orderService.commentOrder(id_,comment_count,comment_image,comment_text);
			List<Order> order_list = orderService.getAllbyuser(user_id_);
			// 将图书集合添加到model当中
			model.addAttribute("order_list", order_list);
			// 跳转到order页面
			return "redirect:/order";
		}
}