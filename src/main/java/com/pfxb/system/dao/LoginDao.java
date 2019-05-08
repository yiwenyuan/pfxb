package com.pfxb.system.dao;

import org.springframework.stereotype.Repository;

import com.pfxb.system.entity.HelloEntity;
import com.pfxb.system.entity.UserInfo;

@Repository
public interface LoginDao {

	UserInfo getUserInfo(String loginName, String loginPassword);
}
