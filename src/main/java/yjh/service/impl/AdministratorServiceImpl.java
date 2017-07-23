package yjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import yjh.domain.Administrator;
import yjh.mapper.AdministratorMapper;
import yjh.service.AdministratorService;
/**
 * Administrator服务层接口实现类
 * @Service("AdministratorService")用于将当前类注释为一个Spring的bean，名为AdministratorService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("administratorService")
public class AdministratorServiceImpl implements AdministratorService {
	/**
	 * 自动注入AdministratorMapper
	 * */
	@Autowired
	private AdministratorMapper administratorMapper;
	
	/**
	 * AdministratorService接口login方法实现
	 * @see { AdministratorService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public Administrator administratorlogin(String administrator_name, String administrator_pwd) {
		return administratorMapper.findWithAdministratornameAndPassword(administrator_name, administrator_pwd);
	}

}
