package yjh.service.impl;

import java.util.List;

import yjh.domain.Order;
import yjh.mapper.OrderMapper;
import yjh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("orderService")
public class OrderServicerImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> getAllbyuser(int user_id) {
		// TODO Auto-generated method stub
		return orderMapper.findAllbyuser(user_id);
	}
	@Override
	public List<Order> getAll1() {
		// TODO Auto-generated method stub
		return orderMapper.findAll1();
	}
	@Override
	public List<Order> getAll2() {
		// TODO Auto-generated method stub
		return orderMapper.findAll2();
	}
	@Override
	public List<Order> getAll3() {
		// TODO Auto-generated method stub
		return orderMapper.findAll3();
	}

	@Override
	public Order removeOrder(int id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithOnlyId(id);
		orderMapper.removeOrder(order);
		return order;
	}

	@Override
	public Order sendOutOrder(int id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithOnlyId(id);
		orderMapper.sendOutOrderWithOnlyId(order);
		return order;
	}
	@Override
	public Order completeOrder(int id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithOnlyId(id);
		orderMapper.completeOrderWithOnlyId(order);
		return order;
	}
	public Order commentOrder(int id,String comment_count,String comment_image,String comment_text) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithOnlyId(id);
		order.setComment_count(comment_count);
		order.setComment_image(comment_image);
		order.setComment_text(comment_text);
		orderMapper.commentOrder(order);
		return order;
	}
	@Override
	public Order findOrder(int good_id) {
		// TODO Auto-generated method stub
		return orderMapper.findWithId(good_id);
	}

	@Override
	public Order saveOrder(int good_id,int user_id,int count,String order_state) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setGood_id(good_id);
		order.setCount(count);
		order.setOrder_state(order_state);
		order.setUser_id(user_id);
		orderMapper.saveOrder(order);
		return order;
	}

	@Override
	public Order addOrder(int good_id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithId(good_id);
		orderMapper.addOrder(order);
		return order;
	}
	@Override
	public Order findOrderbyid(int id){
		Order order = orderMapper.findWithOnlyId(id);
		return order;
	}
}
