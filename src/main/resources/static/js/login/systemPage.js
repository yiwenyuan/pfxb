$(function(){
	//创建数据表格
	queryUser();
});

function queryUser(){
	$("#dg").datagrid({
		url:"getHello",
		columns:[[    
	        {field:'id',title:'id',width:100},    
	        {field:'name',title:'名称',width:100},    
	        {field:'age',title:'年龄',width:100,align:'center'}    
	    ]] 
	});
}