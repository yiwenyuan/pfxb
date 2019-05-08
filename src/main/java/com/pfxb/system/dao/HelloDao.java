package com.pfxb.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pfxb.system.entity.HelloEntity;

@Repository
public interface HelloDao {

	HelloEntity findAll();

	List<HelloEntity> getHello();

}
