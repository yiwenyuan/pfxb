CREATE TABLE `NewTable` (
`id`  varchar(50) NOT NULL COMMENT '主键' ,
`login_name`  varchar(50) NULL COMMENT '登录名' ,
`Login_password`  varchar(50) NULL COMMENT '登录密码' ,
`name`  varchar(50) NULL COMMENT '姓名' ,
`age`  varchar(50) NULL COMMENT '年龄' ,
`sex`  varchar(50) NULL COMMENT '性别' ,
`card`  varchar(50) NULL COMMENT '身份证号' ,
`phone`  varchar(50) NULL COMMENT '手机号' ,
`email`  varchar(50) NULL COMMENT '邮箱' ,
`state`  varchar(50) NULL COMMENT '状态（0无效，1有效）' ,
`description`  varchar(50) NULL COMMENT '描述（0普通员工，1管理员）' ,
`Create_time`  varchar(50) NULL COMMENT '创建时间' ,
`Update_time`  varchar(50) NULL COMMENT '更新时间' ,
PRIMARY KEY (`id`)
)
;