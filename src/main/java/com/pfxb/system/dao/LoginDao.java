package com.pfxb.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pfxb.system.entity.UserInfo;

@Repository
public interface LoginDao {

	UserInfo getUserInfo(String loginName, String loginPassword);

	List<UserInfo> getUserinfoAll();

	UserInfo queryLoginPassword(String id);

	@Transactional//事物
	void changePassword(String id, String newLoginPassword1);
}
