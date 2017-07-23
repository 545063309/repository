package yjh.domain;

import java.util.List;

public class Order {
	private int id;
	private List<Good> good;
	private int count;
	private int good_id;
	private int user_id;
	private String order_state;
	private String comment_count;
	private String comment_image;
	private String comment_text;
	
	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Good> getGood() {
		return good;
	}

	public void setGood(List<Good> good) {
		this.good = good;
	}

	public int getGood_id() {
		return good_id;
	}

	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}

	public String getComment_count() {
		return comment_count;
	}

	public void setComment_count(String comment_count) {
		this.comment_count = comment_count;
	}

	public String getComment_image() {
		return comment_image;
	}

	public void setComment_image(String comment_image) {
		this.comment_image = comment_image;
	}

	public String getComment_text() {
		return comment_text;
	}

	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", good=" + good + ", count=" + count + ", good_id=" + good_id + ", user_id="
				+ user_id + ", order_state=" + order_state +", comment_count=" + comment_count +", comment_image=" + comment_image +", comment_text=" + comment_text +"]";
	}

}


