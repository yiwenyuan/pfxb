$(function(){
	$("#loginBtn").click(function(){
		loginBtn();
	});
	
	//定时器，3秒清空提示语
	setTimeout(() => {
		$("#loginErrot").text("");
	}, 3000);
});

//登录按钮
function loginBtn(){
	var loginForm = $("#loginForm");//获取form表单
	var loginName = $("#loginName").val();
	var loginPassword = $("#loginPassword").val();
	if(loginName==null || loginName==""){
		alert("用户名不可为空，请重新输入")
	}else if(loginPassword==null || loginPassword==""){
		alert("密码不可为空，请重新输入")
	}
	loginForm.attr("action","../loginSuccess");
	loginForm.sumbit();
}