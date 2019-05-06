package com.pfxb.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfxb.system.dao.HelloDao;
import com.pfxb.system.entity.HelloEntity;
import com.pfxb.system.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDao helloDao;
	@Override
	public HelloEntity findAll() {
		return helloDao.findAll();
	}

}
