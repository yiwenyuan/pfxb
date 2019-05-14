$(function () {
    //菜单默认全部折叠
    $("#accordion").accordion("getSelected").panel("collapse");
    //注销登录
    $("#logout").click(function () {
        logout();
    });
    //修改密码
    $("#changePassword").click(function () {
        changePassword();
    });
    //查询原密码
    $("input", $("#nowLoginPassword").next("span")).blur(function () {
        getloginPassword();
    });
    //定时器
    setInterval(function () {
        $("#nowLoginPasErr").text("");
    },3000);
});

function queryUserInfo() {
    $("#dg").datagrid({
        url: "getUserInfo",
        columns: [[
            {field: 'id', title: '主键', width: 100},
            {field: 'loginName', title: '登录名', width: 100},
            {field: 'loginPassword', title: '登录密码', width: 100},
            {field: 'name', title: '姓名', width: 100},
            {field: 'age', title: '年龄', width: 100},
            {field: 'sex', title: '性别', width: 100},
            {field: 'card', title: '身份证号', width: 100},
            {field: 'phone', title: '手机号', width: 100},
            {field: 'email', title: '邮箱', width: 100},
            {field: 'state', title: '状态（0无效，1有效', width: 100},
            {field: 'description', title: '描述（0普通员工，1管理员）', width: 100},
            {field: 'CreateTime ', title: '创建时间', width: 100},
            {field: 'UpdateTime ', title: '更新时间', width: 100}
        ]]
    });
}

//注销
function logout() {
    window.location.href = "/logout";
}

//修改密码
function changePassword() {
    $('#win').window({
        title: "修改密码",
        width: 400,
        height: 400,
        collapsible: false,//关闭折叠按钮
        minimizable: false,//关闭最小化按钮
        maximizable: false,//关闭最大化按钮
        resizable: false,//关闭窗口可改变大小
        closable:false,//关闭关闭按钮
        modal: true
    });
}

//获取原密码
function getloginPassword() {
    var userId = $("#userId").val();
    var nowLoginPassword = $("#nowLoginPassword").val();
    $.ajax({
        url: "getloginPassword",
        type: "post",
        data: {"userId": userId, "nowLoginPassword": nowLoginPassword},
        dataType: "json",
        success: function (result) {
            if (result != null && result != "") {
                if (result.passwordError != null) {
                    $("#nowLoginPasErr").text(result.passwordError);
                }
            }
        }
    });
}


