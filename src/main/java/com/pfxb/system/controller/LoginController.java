package com.pfxb.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.pfxb.system.entity.UserInfo;
import com.pfxb.system.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	/**
	 * 跳转登录页面
	 * @param loginName
	 * @param loginPassword
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "views/login/loginPage";
	}
	
	/**
	 * 登录验证
	 * @param loginName
	 * @param loginPassword
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Map<String,Object> login(String loginName,String loginPassword){
		Map<String,Object> map = new HashMap<String, Object>();
		UserInfo userInfo = null;
		if(!StringUtils.isEmpty(loginName) && !StringUtils.isEmpty(loginPassword)) {
			userInfo = loginService.getUserInfo(loginName,loginPassword);
			if(userInfo == null) {
				map.put("loginError", "用户名或密码输入错误，请重新输入");
				return map;
			}else {
				map.put("loginSuccess", "登录成功");
				return map;
			}
		}else {
			map.put("loginError", "用户名或密码输入错误，请重新输入");
			return map;
		}
	}
	
	/**
	 * 登录成功，跳转主页面
	 * @param loginName
	 * @param loginPassword
	 * @return
	 */
	@RequestMapping("/loginSuccess")
	public String loginSuccess() {
		return "views/login/systemPage";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "redirect:/toLogin";
	}
	
	/**
	 * 查询UserInfo数据，展示到主页面列表
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public List<UserInfo> getUserinfo(){
		return loginService.getUserinfo();
	}
	
	
}
