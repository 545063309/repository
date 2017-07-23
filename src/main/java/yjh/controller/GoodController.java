package yjh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import yjh.domain.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yjh.service.GoodService;
import yjh.service.OrderService;


@Controller
public class GoodController {

	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	// 获得所有服装类商品集合
		@RequestMapping(value="/clothes")
		 public String clothes(Model model){
			// 获得所有商品集合
			String good_type="clothes";
			List<Good> clothes_list = goodService.clothesgetAll(good_type);
			// 将服装集合添加到model当中
			model.addAttribute("clothes_list", clothes_list);
			// 跳转到clothes页面
			return "clothes";
		}
		// 获得所有图书类商品集合
		@RequestMapping(value="/book")
		 public String book(Model model){
			// 获得所有商品集合
			String good_type="book";
			List<Good> book_list = goodService.bookgetAll(good_type);
				//model.setAttribute("book_list", book_list);
				// 将服装集合添加到model当中
				model.addAttribute("book_list", book_list);
			// 跳转到book页面
			return "book";
		}
		// 获得所有文具类商品集合
		@RequestMapping(value="/stationary")
		 public String stationary(Model model){
			// 获得所有商品集合
			String good_type="stationary";
			List<Good> stationary_list = goodService.stationarygetAll(good_type);
			// 将服装集合添加到model当中
			model.addAttribute("stationary_list", stationary_list);
			// 跳转到stationary页面
			return "stationary";
		}
		// 获得所有食品类商品集合
		@RequestMapping(value="/delicacy")
		 public String delicacy(Model model){
			// 获得所有商品集合
			String good_type="delicacy";
			List<Good> delicacy_list = goodService.delicacygetAll(good_type);
			// 将服装集合添加到model当中
			model.addAttribute("delicacy_list", delicacy_list);
			// 跳转到delicacy页面
			return "delicacy";
		}
		//获得指定id的商品集合
		@RequestMapping(value="/detail")
		public String detail(HttpServletRequest request,Model model){
			//获得所有商品
			String id= request.getParameter("id");
			List<Good> detail_list = goodService.idgetAll(id);
			// 将该商品添加到model当中
			model.addAttribute("detail_list", detail_list);
			// 跳转到cart页面
			return "detail";
		}
		//添加商品库存
		@RequestMapping(value="/addgood")
		public String addgood(String addgood_count,String addgood_number){
			int addgood_count_ = Integer.parseInt(addgood_count);
			goodService.ManageaddGoodWithCount(addgood_number,addgood_count_);
			return "redirect:/manage";
		}
		//新品上架
		@RequestMapping(value="/newgood")
		public String newgood(String newgood_name,String newgood_type,String newgood_number,String newgood_price,
				String newgood_count,String newgood_image){
			int newgood_count_=Integer.parseInt(newgood_count);
			goodService.addnewGood(newgood_name,newgood_type,newgood_number,newgood_price,newgood_count_,newgood_image);
			return "redirect:/manage";
		}
}
