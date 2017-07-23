package yjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import yjh.domain.User;
import yjh.mapper.UserMapper;
import yjh.service.UserService;
/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String user_id, String user_pwd) {
		return userMapper.findWithLoginnameAndPassword(user_id, user_pwd);
	}
	@Override
	public User register(String user_id, String user_name, String user_pwd, String user_mail, String user_address) {
		User user=new User();
		user.setUser_id(user_id);
		user.setUser_name(user_name);
		user.setUser_pwd(user_pwd);
		user.setUser_mail(user_mail);
		user.setUser_address(user_address);
		userMapper.saveUser(user);
		return user;
	}
	@Override
	public User changepwd(String user_id,String user_pwd){
		User user=userMapper.findWithUser_id(user_id);
		user.setUser_pwd(user_pwd);
		userMapper.changepwd(user);
		return user;
	}
	@Override
	public User findWithUser_id(String user_id) {
		// TODO Auto-generated method stub
		User user=userMapper.findWithUser_id(user_id);
		return user;
	}
}
