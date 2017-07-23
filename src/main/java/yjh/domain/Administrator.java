package yjh.domain;

public class Administrator{
	public int id;
	private String administrator_id;//登录名
	private String administrator_name;//用户名
	private String administrator_pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdministrator_id() {
		return administrator_id;
	}

	public void setAdministrator_id(String administrator_id) {
		this.administrator_id = administrator_id;
	}

	public String getAdministrator_name() {
		return administrator_name;
	}

	public void setAdministrator_name(String administrator_name) {
		this.administrator_name = administrator_name;
	}

	public String getAdministrator_pwd() {
		return administrator_pwd;
	}

	public void setAdministrator_pwd(String administrator_pwd) {
		this.administrator_pwd = administrator_pwd;
	}
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
		}

	@Override
	public String toString() {
		return "Administrator [id="+ id +"administrator_id=" + administrator_id + ", administrator_name=" + administrator_name
				+ ", administrator_pwd="+ administrator_pwd + "]";
	}
	
	
}
