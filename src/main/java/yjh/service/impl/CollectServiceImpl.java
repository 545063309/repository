package yjh.service.impl;

import java.util.List;

import yjh.domain.Collect;
import yjh.mapper.CollectMapper;
import yjh.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	@Autowired
	private CollectMapper collectMapper;
	@Override
	public List<Collect> getAllbyuser(int user_id) {
		// TODO Auto-generated method stub
		return collectMapper.findAllbyuser(user_id);
	}

	@Override
	public Collect removeCollect(int id) {
		// TODO Auto-generated method stub
		Collect collect = collectMapper.findWithOnlyId(id);
		collectMapper.removeCollect(collect);
		return collect;
	}

	@Override
	public Collect findCollect(int good_id,int user_id) {
		// TODO Auto-generated method stub
		Collect collect= collectMapper.findWithId(good_id,user_id);
		return collect;
	}

	@Override
	public Collect saveCollect(int good_id,int user_id) {
		// TODO Auto-generated method stub
		Collect collect=new Collect();
		collect.setGood_id(good_id);
		collect.setUser_id(user_id);
		collectMapper.saveCollect(collect);
		return collect;
	}

	@Override
	public void clearCollect(int user_id) {
		// TODO Auto-generated method stub
		collectMapper.clearCollect(user_id);
	}

}
