package yjh.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import yjh.domain.Cart;
import yjh.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/cart")
	public String cart(Model model,HttpServletRequest request) {
		// 获得该用户所有图书集合
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		List<Cart> cart_list = cartService.getAllbyuser(user_id_);
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到cart页面
		return "cart";
	
	}
	
	@RequestMapping(value = "/save")
	public String save(HttpServletRequest request,Model model) {
		String good_id = request.getParameter("id");
		int good_id_ = Integer.parseInt(good_id);
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		Cart cart=cartService.findCart(good_id_,user_id_);
		if (cart == null) {
			cartService.saveCart(good_id_,user_id_);
		}
		return "redirect:/cart";
	}
	//清空购物车
	@RequestMapping(value = "/clear")
	public String clear(HttpServletRequest request) {
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		cartService.clearCart(user_id_);
		// 跳转到main页面
		return "redirect:/cart";

	}
	//从购物车里减少商品数量
	@RequestMapping(value="/reduce")
	public String reduce(HttpServletRequest request,Model model){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		cartService.reduceCart(good_id_,user_id_);
		return "redirect:/cart";
	}
	//从购物车里增加商品数量
	@RequestMapping(value="/add")
	public String add(HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		cartService.addCart(good_id_,user_id_);
		// 跳转到cart页面
		return "redirect:/cart";
	}
	//删除购物车中的一整条商品
	@RequestMapping(value="/remove")
	public String remove(HttpServletRequest request){
		String good_id = request.getParameter("good_id");
		int good_id_ = Integer.parseInt(good_id);
		String user_id = (String)request.getSession().getAttribute("user_id");
		int user_id_ = Integer.parseInt(user_id);
		cartService.removeCart(good_id_,user_id_);
		// 跳转到cart页面
		return "redirect:/cart";
	}
	

}
