package com.pfxb.system.service;

import com.pfxb.system.entity.UserInfo;

public interface LoginService {

	UserInfo getUserInfo(String loginName, String loginPassword);

}
