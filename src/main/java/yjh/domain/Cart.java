package yjh.domain;

import java.util.List;

public class Cart{
	private int id;
	private List<Good> good;
	private int count;
	private int good_id;
	private int user_id;
	
	
public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Good> getGood() {
		return good;
	}


	public void setGood(List<Good> good) {
		this.good = good;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getGood_id() {
		return good_id;
	}


	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
@Override
public String toString() {
	return "Cart [id=" + id + ", good=" + good + ", count=" + count + ", good_id=" + good_id + ", user_id="
			+ user_id + "]";
}
	
	
}
