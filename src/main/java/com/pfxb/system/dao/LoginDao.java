package com.pfxb.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pfxb.system.entity.UserInfo;

@Repository
public interface LoginDao {

	UserInfo getUserInfo(@Param("loginName") String loginName, @Param("loginPassword") String loginPassword);

	UserInfo getloginPassword(@Param("userId") String userId);
}
