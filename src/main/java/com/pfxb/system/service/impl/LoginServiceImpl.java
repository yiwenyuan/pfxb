package com.pfxb.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
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
	public List<UserInfo> getUserinfoAll() {
		return logindao.getUserinfoAll();
	}
	//判断输入原密码和数据库存储原密码是否一致
	@Override
	public UserInfo queryLoginPassword(String id) {
		if(!(StringUtils.isEmpty(id))) {
			return logindao.queryLoginPassword(id);
		}
		return null;
	}
	////修改密码：新密码入库
	@Override
	public void changePassword(String id, String newLoginPassword1) {
		logindao.changePassword(id,newLoginPassword1);
	}
}
