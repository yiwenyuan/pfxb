package com.pfxb.system.service;

import java.util.List;

import com.pfxb.system.entity.HelloEntity;

public interface HelloService {

	HelloEntity findAll();

	List<HelloEntity> getHello();

}
