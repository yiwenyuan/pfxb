$(function(){

	//定时器，清空提示语
    setInterval(function(){
        $("#loginErrot").text("");
    },3000);

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
            var loginForm = $("#loginForm");//获取form表单
            if(result != null && result != undefined){
                if(result.loginError != null){
                    $("#loginErrot").text(result.loginError);
				}else{
                    loginForm.attr("action","../loginSuccess");
					loginForm.submit();
				}
			}
		}
	});
}
