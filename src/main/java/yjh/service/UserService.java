package yjh.service;

import yjh.domain.User;

public interface UserService {
	User login(String user_id,String user_pwd);
	User register(String user_id,String user_name,String user_pwd,String user_mail,String user_address);
	User changepwd(String user_id,String user_pwd);
	User findWithUser_id(String user_id);
}