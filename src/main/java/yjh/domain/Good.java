package yjh.domain;

public class Good {
	private Integer id;
	private String good_image;
	private String good_number ;
	private String good_name;
	private String good_type;
	private String good_intro;
	private String good_price;
	private int good_count;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGood_image() {
		return good_image;
	}

	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}

	public String getGood_number() {
		return good_number;
	}

	public void setGood_number(String good_number) {
		this.good_number = good_number;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public String getGood_type() {
		return good_type;
	}

	public void setGood_type(String good_type) {
		this.good_type = good_type;
	}

	public String getGood_intro() {
		return good_intro;
	}

	public void setGood_intro(String good_intro) {
		this.good_intro = good_intro;
	}

	public String getGood_price() {
		return good_price;
	}

	public void setGood_price(String good_price) {
		this.good_price = good_price;
	}

	public int getGood_count() {
		return good_count;
	}

	public void setGood_count(int good_count) {
		this.good_count = good_count;
	}

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public String toString() {
		return "Good [id=" + id + ", good_image=" + good_image + ", good_number=" + good_number + ", good_name=" + good_name
				+ ", good_type=" + good_type + ", good_intro=" + good_intro + ", good_price=" + good_price + ", good_count="
				+ good_count + "]";
	}
	
}
