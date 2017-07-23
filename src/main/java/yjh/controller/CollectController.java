package yjh.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import yjh.domain.Collect;
import yjh.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectController {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Autowired
	CollectService collectService;
	@RequestMapping(value="/collect")
	public String collect(Model model,HttpServletRequest request){
		// 获得该用户所有商品集合
			String user_id = (String)request.getSession().getAttribute("user_id");
			int user_id_ = Integer.parseInt(user_id);
			List<Collect> collect_list=collectService.getAllbyuser(user_id_);
			model.addAttribute("collect_list",collect_list);
			//返回收藏的页面
		return "collect";
		
	}
	//全部清空
		@RequestMapping(value = "/clearcollect")
		public String clearcollect(HttpServletRequest request) {
			String user_id = (String)request.getSession().getAttribute("user_id");
			int user_id_ = Integer.parseInt(user_id);
			collectService.clearCollect(user_id_);
			// 跳转到collect页面
			return "redirect:/collect";
}
	//添加收藏
		@RequestMapping(value = "/savecollect")
		public String savecollect(HttpServletRequest request) {
			String good_id = request.getParameter("id");
			int good_id_ = Integer.parseInt(good_id);
			String user_id = (String)request.getSession().getAttribute("user_id");
			int user_id_ = Integer.parseInt(user_id);
				Collect collect=collectService.findCollect(good_id_,user_id_);
				if( collect == null){
					collectService.saveCollect(good_id_,user_id_);		
				}
			return "redirect:/collect";
}
		//取消收藏
		@RequestMapping(value="/removecollect")
		public String removecollect(HttpServletRequest request){
			String id = request.getParameter("id");
			int id_ = Integer.parseInt(id);
			collectService.removeCollect(id_);
			// 跳转到collect页面
			return "redirect:/collect";
		}
}