package yjh.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import yjh.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	/**
	 * 根据登录名和密码查询用户
	 * @param String user_id
	 * @param String user_pwd
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where user_id= #{user_id} and user_pwd = #{user_pwd}")
	User findWithLoginnameAndPassword(@Param("user_id")String user_id,@Param("user_pwd") String user_pwd);
	@Select("select * from tb_user where user_id= #{user_id}")
	User findWithUser_id(@Param("user_id")String user_id);
	@Insert("insert into tb_user(user_id,user_name,user_pwd,user_mail,user_address) values(#{user_id},#{user_name},#{user_pwd},#{user_mail},#{user_address})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	 int saveUser(User user);
	 
	 @Select("select * from tb_user where id=#{id}")
		@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "user_id", property = "user_id"),
				@Result(column = "user_name", property = "user_name"), @Result(column = "user_pwd", property = "user_pwd"),
				@Result(column = "user_mail", property = "user_mail"),@Result(column = "user_address", property = "user_address"),
				 })
		List<User> selectByUserId(int id);
	 //找回密码
	 @Delete("update tb_user set user_pwd=#{user_pwd} where user_id=#{user_id}")
	 void changepwd(User user);
}

