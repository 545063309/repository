package yjh.service.impl;

import java.util.List;
import yjh.domain.Good;
import yjh.mapper.GoodMapper;
import yjh.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	@Autowired
	private GoodMapper goodMapper;
	
	@Transactional(readOnly=true)
	@Override
	//查询服装
	public List<Good> clothesgetAll(String good_type) {
		return goodMapper.clothesfindAll(good_type);
	}
	//查询图书
	@Transactional(readOnly=true)
		public List<Good> bookgetAll(String good_type) {
		return goodMapper.bookfindAll(good_type);
	}
	//查询精品文具
	@Transactional(readOnly=true)
		public List<Good> stationarygetAll(String good_type) {
		return goodMapper.stationaryfindAll(good_type);
	}
	//查询美食饮品
	@Transactional(readOnly=true)
		public List<Good> delicacygetAll(String good_type) {
		return goodMapper.delicacyfindAll(good_type);
	}
	//查询具体商品
	@Transactional(readOnly=true)
		public List<Good> idgetAll(String id){
		return goodMapper.idfindAll(id);
	}
	//减少商品库存
	@Override
	public Good removeGoodWithCount(int id,int good_count) {
		// TODO Auto-generated method stub
		Good good = goodMapper.findWithId(id);
		good.setId(id);
		good.setGood_count(good_count);
		goodMapper.removeGoodWithCount(good);
		return good;
	}
	//增加商品库存
	@Override
	public Good addGoodWithCount(int id,int good_count) {
		// TODO Auto-generated method stub
		Good good = goodMapper.findWithId(id);
		good.setId(id);
		good.setGood_count(good_count);
		goodMapper.addGoodWithCount(good);
		return good;
	}
	//管理员商品入库
		@Override
		public Good ManageaddGoodWithCount(String good_number,int good_count) {
			// TODO Auto-generated method stub
			Good good = goodMapper.findWithGood_number(good_number);
			good.setGood_number(good_number);
			good.setGood_count(good_count);
			goodMapper.ManageaddGoodWithCount(good);
			return good;
		}
	//新品上架
		@Override
		public Good addnewGood(String newgood_name,String newgood_type,String newgood_number,String newgood_price,int newgood_count,String newgood_image){
			// TODO Auto-generated method stub
			Good good = new Good();
			good.setGood_image(newgood_image);
			good.setGood_number(newgood_number);
			good.setGood_name(newgood_name);
			good.setGood_type(newgood_type);
			good.setGood_price(newgood_price);
			good.setGood_count(newgood_count);
			goodMapper.addnewGood(good);
			return good;
		}
}
