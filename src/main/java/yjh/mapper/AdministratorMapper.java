package yjh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import yjh.domain.Administrator;

/**
 * AdministratorMapper接口
 * */
public interface AdministratorMapper {
	/**
	 * 根据登录名和密码查询用户
	 * @param String administrator_id
	 * @param String administrator_password
	 * @return 找到返回Administrator对象，没有找到返回null
	 * */
	@Select("select * from tb_administrator where administrator_id= #{administrator_id} and administrator_pwd = #{administrator_pwd}")
	Administrator findWithAdministratornameAndPassword(@Param("administrator_id")String administrator_id,@Param("administrator_pwd") String administrator_pwd);
	@Options(useGeneratedKeys = true, keyProperty = "id")
	 int saveAdministrator(Administrator administrator);
	@Select("select * from tb_administrator where id=#{id}")
		@Results({ @Result(id = true, column = "id", property = "id"), @Result(column = "administrator_id", property = "administrator_id"),
			@Result(column = "administrator_name", property = "administrator_name"), @Result(column = "administrator_pwd", property = "administratorr_pwd"),
			 })
	List<Administrator> selectByAdministratorId(int id);
}

