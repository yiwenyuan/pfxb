package com.pfxb.system.service;

import java.util.List;

import com.pfxb.system.entity.UserInfo;

public interface LoginService {

	UserInfo getUserInfo(String loginName, String loginPassword);

	List<UserInfo> getUserinfoAll();

	UserInfo queryLoginPassword(String id);

	void changePassword(String id, String newLoginPassword1);


}
