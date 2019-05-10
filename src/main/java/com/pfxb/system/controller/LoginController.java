package com.pfxb.system.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	 * 登录成功，跳转主页面
	 * @param loginName
	 * @param loginPassword
	 * @return
	 */
	@RequestMapping("/loginSuccess")
	public String loginSuccess(String loginName,String loginPassword,HttpServletRequest request) {
		UserInfo userInfo = null;
		if(!StringUtils.isEmpty(loginName) && !StringUtils.isEmpty(loginPassword)) {
			userInfo = loginService.getUserInfo(loginName,loginPassword);
			if(userInfo == null) {
				request.setAttribute("loginError", "用户名或密码输入错误，请重新输入");
				return "views/login/loginPage";
			}else {
				request.setAttribute("loginName", loginName);
				return "views/login/systemPage";
			}
		}else {
			request.setAttribute("loginError", "用户名或密码输入错误，请重新输入");
			return "views/login/loginPage";
		}
	}
	
	/**
	 * 查询UserInfo数据，展示到主页面列表
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public List<UserInfo> getUserinfo(){
		return loginService.getUserinfo();
	}
	
	
//	/**
//	 * 获取用户数据，
//	 */
//	@RequestMapping("/ChangePassword")
//	@ResponseBody
//	public List<UserInfo> ChangePassword(String loginName,String loginPassword,
//			String newLoginPassword ,HttpServletRequest request){
//		UserInfo userInfo = null;
//		List<UserInfo> list = null;
//		//根据用户名查询出原密码
//		userInfo = loginService.getUserInfo(loginName,loginPassword);
//		if(userInfo!=null && userInfo.equals("")) {
//			//判断用户名查出原密码，和输入原密码是否正确(提高安全性)
//			if(userInfo.getLoginPassword().equals(loginPassword)) {
//				//判断输入原密码和新密码是否相同,并且不可为空
//				if(loginPassword!=newLoginPassword && newLoginPassword!=null && newLoginPassword!="") {
//					//修改密码
//					list = loginService.ChangePassword(loginName,newLoginPassword);
//					return list;
//				}else {
//					//输入新密码和原密码相同不可修改
//					return list;
//				}
//			}else{
//				//输入原密码和数据库原密码不同不能修改
//				return list;
//			}
//			
//			
//		}
//		return list;		
//	}
	
	
	
	
	
//	/**
//	 * 新密码入库，跳转登录页面
//	 */
//	@RequestMapping("/changePassword")
//	public UserInfo
	
	
	
}
