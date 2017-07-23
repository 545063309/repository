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
import yjh.domain.Order;

public interface OrderMapper {
    //查询某用户所有订单
	@Select("select * from tb_order where user_id=#{user_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),
		@Result(column = "user_id", property = "user_id"),
		@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state")})
	List<Order> findAllbyuser(@Param("user_id")int user_id);
    //查询未发货订单(1)
	@Select("select * from tb_order where order_state ='未发货'")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),
		@Result(column = "user_id", property = "user_id"),
		@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state")})
	List<Order> findAll1();
    //查询已发货订单(2)
	@Select("select * from tb_order where order_state='已发货'")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),
		@Result(column = "user_id", property = "user_id"),
		@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state")})
	List<Order> findAll2();
    //查询已完成订单(3)
	@Select("select * from tb_order where order_state='已完成'")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),
		@Result(column = "user_id", property = "user_id"),
		@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state")})
	List<Order> findAll3();
	//加入订单 
    @Insert("insert into tb_order(good_id,user_id,count,order_state) values(#{good_id},#{user_id},#{count},#{order_state})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveOrder(Order order);
	//通过GOOD_ID寻找订单
    @Select("select * from tb_order where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state") })
	Order findWithId(@Param("good_id") int good_id);
    //通过ID寻找订单
    @Select("select * from tb_order where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "yjh.mapper.GoodMapper.selectByGoodId", fetchType = FetchType.LAZY)),				
			@Result(column = "count", property = "count"), @Result(column = "good_id", property = "good_id"),@Result(column="order_state", property="order_state") })
	Order findWithOnlyId(@Param("id") int id);
    //通过ID定位发货订单
    @Delete("update tb_order set order_state='已发货' where id=#{id}")
	void sendOutOrderWithOnlyId(Order order);
    //通过ID定位完成订单
    @Delete("update tb_order set order_state='已完成' where id=#{id}")
	void completeOrderWithOnlyId(Order order);
    //通过ID定位完成订单评论
    @Delete("update tb_order set comment_count=#{comment_count},comment_image=#{comment_image},comment_text=#{comment_text} where id=#{id}")
	void commentOrder(Order order); 
	//增加书籍数量
    @Update("update tb_order set count=count+1 where good_id=#{good_id}")
	void addOrder(Order order);
    //删除订单
    @Delete("delete from tb_order where id=#{id}")
	void removeOrder(Order order);
}
