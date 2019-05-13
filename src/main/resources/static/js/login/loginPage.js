$(function(){
	$("#loginBtn").click(function(){
		loginBtn();
	});
	
	//定时器，3秒清空提示语
//	var timeout = setTimeout(() => {
//		$("#loginErrot").text("");
//	}, 3000);
	
});

//登录按钮
function loginBtn(){
	var loginName = $("#loginName").val();
	var loginPassword = $("#loginPassword").val();
	$.ajax({
		url:"login",
		type:"post",
		data:{"loginName":loginName,"loginPassword":loginPassword},
		success:function(result){
			if(result != null && result != undefined){
				if(result.loginError != null){
					$("#loginErrot").html("<span>"+result.loginError+"</span>");
				}
			}
		}
	});
	
//	var loginForm = $("#loginForm");//获取form表单
//	loginForm.attr("action","../loginSuccess");
//	loginForm.sumbit();
}
