--
--    1.创建用户表，出于安全性考虑，要求数据库中不能存储用户密码的明文
--    2.写一个登录功能
--    3.登录失败，统一显示 "对不起用户名或者密码错误";
--    4.登录成功,如果是管理员，给出欢迎语 "管理员 XXX 请谨慎操作"，普通用户 给出欢迎语 "XXX ,[此处显示配置的欢迎语]"
--    5.第四条中的 XXX 为用户的中文名

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) NOT NULL DEFAULT '',
  `role` tinyint(10) NOT NULL DEFAULT '0' COMMENT '0,管理员；1普通用户',
  `user_name` varchar(50) DEFAULT '' COMMENT '用户中文名',
  `hello_word` varchar(255) DEFAULT '' COMMENT '用户欢迎语',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


