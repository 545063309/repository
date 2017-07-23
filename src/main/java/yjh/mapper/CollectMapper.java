package yjh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import yjh.domain.Collect;

public interface CollectMapper {
	//删除收藏
    @Delete("delete from tb_collect where id=#{id}")
	void removeCollect(Collect collect);
    
    //查询某用户的收藏夹
    @Select("select * from tb_collect where user_id=#{user_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),		
	    @Result(column = "good_id", property = "good_id")})
	List<Collect> findAllbyuser(@Param("user_id")int user_id);
    
  //通过good_ID寻找商品
    @Select("select * from tb_collect where good_id=#{good_id} and user_id=#{user_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			 @Result(column = "good_id", property = "good_id") })
	Collect findWithId(@Param("good_id") int good_id,@Param("user_id") int user_id);
  //通过唯一ID寻找商品
    @Select("select * from tb_collect where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			 @Result(column = "good_id", property = "good_id") })
	Collect findWithOnlyId(@Param("id") int id);
   //进行收藏
    @Insert("insert into tb_collect(good_id,user_id) values(#{good_id},#{user_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCollect(Collect collect);
    //清空收藏
    @Delete("delete from tb_collect where user_id=#{user_id}")
	void clearCollect(@Param("user_id")int user_id);
}
