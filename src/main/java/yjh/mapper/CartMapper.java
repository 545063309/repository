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
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;

import yjh.domain.Cart;


public interface CartMapper {
    
@Select("select * from tb_cart where user_id=#{user_id}")
@Results({ @Result(id = true, column = "id", property = "id"),
	@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),		
	@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id")})
	List<Cart> findAllbyuser(@Param("user_id") int user_id);

    //加入购物车
    @Insert("insert into tb_cart(good_id,count,user_id) values(#{good_id},#{count},#{user_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCart(Cart cart);
     //通过ID寻找商品
    @Select("select * from tb_cart where good_id=#{good_id} and user_id=#{user_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id") })
	Cart findWithId(@Param("good_id") int good_id,@Param("user_id") int user_id);
    //增加商品数量
    @Update("update tb_cart set count=count+1 where good_id=#{good_id} and user_id=#{user_id}")
	void addCart(Cart cart);
    //清空购物车
    @Delete("delete from tb_cart where user_id=#{user_id}")
	void clearCart(@Param("user_id") int user_id);
    //减少购物车商品数量
    @Update("update tb_cart set count=count-1 where good_id=#{good_id} and user_id=#{user_id}")
	void reduceCart(Cart cart);
    //删除商品
    @Delete("delete from tb_cart where good_id=#{good_id} and user_id=#{user_id}")
	void removeCart(Cart cart);


}
