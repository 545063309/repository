package yjh.domain;

public class User{
	public int id;
	private String user_id;//登录名
	private String user_name;//用户名
	private String user_pwd;
	private String user_mail;
	private String user_address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	@Override
	public String toString() {
		return "User [id="+ id +"user_id=" + user_id + ", user_name=" + user_name + ", user_pwd="+ user_pwd 
				+ ", user_mail="+ user_mail + ", user_address=" + user_address + "]";
	}
	
	
}
