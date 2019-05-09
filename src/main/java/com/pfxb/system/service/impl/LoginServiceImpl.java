package com.pfxb.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfxb.system.dao.LoginDao;
import com.pfxb.system.entity.UserInfo;
import com.pfxb.system.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao logindao;
	@Override
	public UserInfo getUserInfo(String loginName, String loginPassword) {
		return logindao.getUserInfo(loginName,loginPassword);
	}
	//查询UserInfo数据，展示到主页面列表
	@Override
	public List<UserInfo> getUserinfo() {
		return logindao.getUserinfo();
	}
}
