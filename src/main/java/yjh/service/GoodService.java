package yjh.service;

import java.util.List;

import yjh.domain.Good;

public interface GoodService {
	//遍历服装集合
	List<Good> clothesgetAll(String good_type);
	//遍历图书集合
	List<Good> bookgetAll(String good_type);
	//遍历精品文具集合
	List<Good> stationarygetAll(String good_type);
	//遍历美食饮品集合
	List<Good> delicacygetAll(String good_type);
	//减少商品库存数量
	Good removeGoodWithCount(int id,int good_count);
	//增加商品库存
	Good addGoodWithCount(int id,int good_count);
	//管理员入库商品
	Good ManageaddGoodWithCount(String good_number,int good_count);
	//新品上架
	Good addnewGood(String newgood_name,String newgood_type,String newgood_number,String newgood_price,int newgood_count,String newgood_image);
	List<Good> idgetAll(String id);
}
