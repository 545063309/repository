package yjh.service;

import java.util.List;
import yjh.domain.Order;
public interface OrderService {
	List<Order> getAllbyuser(int user_id);
	Order removeOrder(int id);
	//good_id查询订单
	Order findOrder(int good_id);
	Order saveOrder(int good_id,int user_id,int count,String order_state);
	Order addOrder(int good_id);
	Order sendOutOrder(int id);
	Order completeOrder(int id);
	Order commentOrder(int id,String commnet_count,String comment_image,String comment_text);
	Order findOrderbyid(int id);
	//获得所有未发货订单
	List<Order> getAll1();
	//获得所有已发货订单
	List<Order> getAll2();
	//获得所有已完成订单
	List<Order> getAll3();
}  
