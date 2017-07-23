package yjh.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import yjh.domain.Cart;
import yjh.mapper.CartMapper;
import yjh.service.CartService;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> getAllbyuser(int user_id) {
		// TODO Auto-generated method stub
		return cartMapper.findAllbyuser(user_id);
	}
	
	@Override
	public Cart findCart(int good_id,int user_id) {
		// TODO Auto-generated method stub
		return cartMapper.findWithId(good_id,user_id);
	}

	@Override
	public Cart saveCart(int good_id,int user_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setGood_id(good_id);
		final int i = 1;
		cart.setCount(i);
		cart.setUser_id(user_id);
		cartMapper.saveCart(cart);
		return cart;
	}
	@Override
	public Cart addCart(int good_id,int user_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(good_id,user_id);
		cartMapper.addCart(cart);
		return cart;
	}

	@Override
	public Cart reduceCart(int good_id,int user_id) {
		// TODO Auto-generated method stub
		
				Cart cart = cartMapper.findWithId(good_id,user_id);
				if (cart.getCount() >= 1) {
					cartMapper.reduceCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return cart;
	}
	@Override
	public void clearCart(int user_id) {
		// TODO Auto-generated method stub
		cartMapper.clearCart(user_id);
	}

	@Override
	public Cart removeCart(int good_id,int user_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(good_id,user_id);
		cartMapper.removeCart(cart);
		return cart;
	}

}
