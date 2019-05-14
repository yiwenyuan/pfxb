$(function(){
	//创建数据表格
//	queryUser();
	queryUserInfo();//查询UserInfo数据事件
	modification();//修改密码事件
	$('#loginPassword').blur(function() {
		modification();
	 });
});
//测试
//function queryUser(){
//	$("#dg").datagrid({
//		url:"getHello",
//		columns:[[    
//	        {field:'id',title:'id',width:100},    
//	        {field:'name',title:'名称',width:100},    
//	        {field:'age',title:'年龄',width:100,align:'center'}    
//	    ]] 
//	});
//}
function queryUserInfo(){
	$("#dg").datagrid({
		url:"getUserInfo",
		columns:[[
			{field:'id',title:'主键',width:100},
			{field:'loginName',title:'登录名',width:100},
			{field:'loginPassword',title:'登录密码',width:100},
			{field:'name',title:'姓名',width:100},
			{field:'age',title:'年龄',width:100},
			{field:'sex',title:'性别',width:100},
			{field:'card',title:'身份证号',width:100},
			{field:'phone',title:'手机号',width:100},
			{field:'email',title:'邮箱',width:100},
			{field:'state',title:'状态（0无效，1有效',width:100},
			{field:'description',title:'描述（0普通员工，1管理员）',width:100},
			{field:'CreateTime ',title:'创建时间',width:100},
			{field:'UpdateTime ',title:'更新时间',width:100}
		]]
	});
}

//修改密码
function modification(){
	$("#modification").click(function(){
		//修改密码弹框
		$('#win').window({    
		    width:600,    
		    height:400,    
		    modal:true   
		});
		//修改按钮
		$("#changePasswordBtn").click(function(){
			var changePasswordForm = $("#changePasswordForm");//获取form表单
			var id = $("#id").val();
			var loginName = $("#loginName").val();
			var loginPassword = $("#loginPassword").val();
			var newLoginPassword1 = $("#newLoginPassword1");
			var newLoginPassword2 = $("#newLoginPassword2");
			if(loginName==null || loginName==""){
				alert("登录已过期，请重新登录")
				loginForm.attr("action","../toLogin");
			}else if(loginPassword==null || loginPassword==""){
				alert("密码不可为空，请重新输入")
			}else{
				//验证输入原密码和用户数据库原密码是否一致
				$.ajax({
					type:"post",
					url:" queryLoginPassword",
					data:{
						"id":id,
						"loginPassword":loginPassword
					},
					dataType:"json",
					success:function(data){
						if(data.success!=null){
							//一致
							inputNewPassword();
						}else{
							//不一致
							alert("输入密码与原密码不一致，请重新输入");
						}
					}
				});
			}		
		});
	});
}		
		
//输入新密码 inputNewPassword
function inputNewPassword(){
	alert(1);
}


//		if((newLoginPassword1==null||newLoginPassword1=="") && (newLoginPassword2==null||newLoginPassword2=="")){
//			alert("新密码不可为空，请重新输入")
//		}else if(newLoginPassword1 != newLoginPassword2){
//			alert("新密码两次输入不一致，请重新输入")
//		}else{
//			$.ajax({
//				type:"post",
//				url:'changePassword',
//				data:{
//					"loginName":loginName,
//					"loginPassword":loginPassword,
//					"newLoginPassword1":newLoginPassword1
//				},
//				dataType:"json",
//				success:function(data){
//					if(data!=null){
//						//修改密码成功，跳转登录页面
//						changePasswordForm.attr("action","../toLogin");
//						changePasswordForm.sumbit();
//					}else {
//						//修改密码失败，跳转主页面
//						changePasswordForm.attr("action","../loginSuccess");
//						alert("修改密码失败，请重新输入");
//						modification();
//					}
//				}
//			});
//		}
//		if((newLoginPassword1==null||newLoginPassword1=="") && (newLoginPassword2==null||newLoginPassword2=="")){
//			alert("新密码不可为空，请重新输入")
//		}else if(newLoginPassword1 != newLoginPassword2){
//			alert("新密码两次输入不一致，请重新输入")
//		}else{
//			$.ajax({
//				type:"post",
//				url:'ChangePassword',
//				data:{
//					"loginName":loginName,
//					"loginPassword":loginPassword,
//					"newLoginPassword1":newLoginPassword1
//				},
//				dataType:"json",
//				success:function(data){
//					if(data!=null){
//						//修改密码成功，跳转登录页面
//						changePasswordForm.attr("action","../toLogin");
//						changePasswordForm.sumbit();
//					}else {
//						//修改密码失败，跳转主页面
//						changePasswordForm.attr("action","../loginSuccess");
//						alert("修改密码失败，请重新输入");
//						modification();
//					}
//				}
//			});
//		}
//	});
//		
//		
//		
//		
//	});
//}

