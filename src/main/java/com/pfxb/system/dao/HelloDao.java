package com.pfxb.system.dao;

import org.springframework.stereotype.Repository;

import com.pfxb.system.entity.HelloEntity;

@Repository
public interface HelloDao {

	HelloEntity findAll();

}
