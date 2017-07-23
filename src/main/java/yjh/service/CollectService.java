package yjh.service;

import java.util.List;

import yjh.domain.Collect;

public interface CollectService {
	List<Collect> getAllbyuser(int user_id);
	Collect removeCollect(int id);
	Collect findCollect(int good_id,int user_id);
	Collect saveCollect(int good_id,int user_id);
	void clearCollect(int user_id);
}
