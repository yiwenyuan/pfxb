$(function(){
	  
	//	queryUser();//创建数据表格
	queryUserInfo();//查询UserInfo数据事件
	
	$("#logout").click(function(){//注销登录
		window.location.href="../toLogout";
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


