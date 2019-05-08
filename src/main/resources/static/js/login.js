$(function(){
	$("#loginBtn").click(function(){
		loginBtn();
	});
	
	setTimeout(() => {
		$("#loginErrot").text("");
	}, 3000);
});

//登录按钮
function loginBtn(){
	var loginForm = $("#loginForm");
	loginForm.attr("action","../loginSuccess");
	loginForm.sumbit();
}