package yjh.service;

import java.util.List;

import yjh.domain.Cart;

public interface CartService {
	List<Cart> getAllbyuser(int user_id);
	
	Cart findCart(int good_id,int user_id);
	
	Cart saveCart(int good_id,int user_id);
	
	Cart addCart(int good_id,int user_id);
	
	Cart reduceCart(int good_id,int user_id);
	
	Cart removeCart(int good_id,int user_id);
	
	void clearCart(int user_id);
}
