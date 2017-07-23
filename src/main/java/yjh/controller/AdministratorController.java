package yjh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yjh.domain.Administrator;
import yjh.domain.Good;
import yjh.domain.Order;
import yjh.service.AdministratorService;
import yjh.service.GoodService;
import yjh.service.OrderService;
/**
 * 处理用户请求控制器
 * */
	@Controller
	public class AdministratorController {
		
		/**
		 * 自动注入AdministratorService
		 * */
		@Autowired
		@Qualifier("goodService")
		private GoodService goodService;
		@Autowired
		@Qualifier("orderService")
		private OrderService orderService;
		@Autowired
		@Qualifier("administratorService")
		private AdministratorService administratorService;

		/**
		 * 处理/administratorlogin请求
		 * */
		
		@RequestMapping(value="/administratorlogin")
		 public ModelAndView administratorlogin(String administrator_id,String administrator_pwd,
				 ModelAndView mv){
			// 根据登录名和密码查找用户，判断用户登录
			Administrator administrator = administratorService.administratorlogin(administrator_id, administrator_pwd);
			if(administrator != null){
				// 登录成功，转到manage页面
				mv.setViewName("redirect:/manage");
			}else{
				// 登录失败，设置失败提示信息，并跳转到登录页面
				mv.addObject("message", "管理员账户或密码错误，请重新输入!");
				mv.setViewName("managelogin");
			}
			return mv;
		}
		@RequestMapping(value="/manage")
		public String manage(Model model){
			// 获得各类商品集合
			String good_type1="clothes";
			List<Good> clothes_list = goodService.clothesgetAll(good_type1);
			String good_type2="book";
			List<Good> book_list = goodService.bookgetAll(good_type2);
			String good_type3="stationary";
			List<Good> stationary_list = goodService.stationarygetAll(good_type3);
			String good_type4="delicacy";
			List<Good> delicacy_list = goodService.delicacygetAll(good_type4);
			//获得各类订单集合
			List<Order> order_list1 = orderService.getAll1();
			List<Order> order_list2 = orderService.getAll2();
			List<Order> order_list3 = orderService.getAll3();
			// 将各类商品以及各类订单集合添加到model当中
			model.addAttribute("order_list1",order_list1);
			model.addAttribute("order_list2",order_list2);
			model.addAttribute("order_list3",order_list3);
			model.addAttribute("clothes_list", clothes_list);
			model.addAttribute("book_list", book_list);
			model.addAttribute("stationary_list", stationary_list);
			model.addAttribute("delicacy_list", delicacy_list);
				return "manage";
				}
}