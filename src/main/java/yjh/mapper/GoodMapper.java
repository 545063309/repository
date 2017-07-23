package yjh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import yjh.domain.Good;

public interface GoodMapper {

	@Select("select * from tb_good")
	List<Good> findAll();
	//查询所有服装的集合
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> clothesfindAll(@Param("good_type") String good_type);
	//查询所有图书的集合
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> bookfindAll(@Param("good_type") String good_type);
	//查询所有精品文具的集合
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> stationaryfindAll(@Param("good_type") String good_type);
	//查询所有美食饮品的集合
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> delicacyfindAll(@Param("good_type") String good_type);
	@Select("select * from tb_good where id=#{id}")
	List<Good>  idfindAll(@Param("id") String id);
	
	@Select("select * from tb_good where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"), 
			@Result(column = "good_image", property = "good_image"),@Result(column = "good_number", property = "good_number"), 
			@Result(column = "good_type", property = "good_type"),@Result(column = "good_name", property = "good_name"),
			@Result(column = "good_intro", property = "good_intro"), @Result(column = "good_price", property = "good_price"),
			@Result(column = "good_count", property = "good_count"),@Result(column = "remark", property = "good_image")})
	List<Good> selectByGoodId(int id);
	  //通过ID寻找书
    @Select("select * from tb_good where id=#{id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_image", property = "good_image"),@Result(column = "good_number", property = "good_number"), 
		@Result(column = "good_type", property = "good_type"),@Result(column = "good_name", property = "good_name"),
		@Result(column = "good_intro", property = "good_intro"), @Result(column = "good_price", property = "good_price"),
		@Result(column = "good_count", property = "good_count")})
	Good findWithId(@Param("id") int id);
	  //通过编号寻找书
    @Select("select * from tb_good where good_number=#{good_number}")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_image", property = "good_image"),@Result(column = "good_number", property = "good_number"), 
		@Result(column = "good_type", property = "good_type"),@Result(column = "good_name", property = "good_name"),
		@Result(column = "good_intro", property = "good_intro"), @Result(column = "good_price", property = "good_price"),
		@Result(column = "good_count", property = "good_count")})
	Good findWithGood_number(@Param("good_number") String good_number);
    //减少商品库存
    @Delete("update tb_good set good_count=good_count-#{good_count} where id=#{id}")
	void removeGoodWithCount(Good good);
    //增加商品库存
    @Delete("update tb_good set good_count=good_count+#{good_count} where id=#{id}")
	void addGoodWithCount(Good good);
    //管理员商品入库
    @Delete("update tb_good set good_count=good_count+#{good_count} where good_number=#{good_number}")
	void ManageaddGoodWithCount(Good good);
    //新品上架
    @Insert("insert into tb_good (good_image,good_number,good_name,good_type,good_price,good_count) values(#{good_image},#{good_number},#{good_name},#{good_type},#{good_price},#{good_count})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addnewGood(Good good);
}
