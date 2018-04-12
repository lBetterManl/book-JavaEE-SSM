# 项目实战

> 资费管理系统

## 功能模块

- 角色管理  
- 管理员  
- 资费管理  
- 财务账号  
- 业务账号  
- 个人信息  
- 修改密码  

## 设计实现

1.RBAC权限管理  
2.拦截器  
3.分页对象  
4.关联查询  
5.验证码  
6.时间格式转换  
7.AOP记录日志  
8.json返回  

## 涵盖知识  

1.Spring配置
2.SpringMVC配置
3.MyBatis配置
4.JDBC配置  
5.log4j配置  
6.整合时web.xml配置
7.mvc异常页面跳转配置

## 备注：

> 书中配套源码有mobile上的实现。


## SQL

```sql
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accountId` int(10) NOT NULL AUTO_INCREMENT COMMENT '账号Id',
  `recommenderAccountId` int(10) DEFAULT NULL COMMENT '推荐人Id',
  `loginUserName` varchar(30) DEFAULT NULL COMMENT '登录名',
  `loginPassword` varchar(30) DEFAULT NULL COMMENT '登录密码',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `pauseDate` datetime DEFAULT NULL COMMENT '暂停时间',
  `closeDate` datetime DEFAULT NULL COMMENT '关闭时间',
  `realName` varchar(20) NOT NULL COMMENT '真实姓名',
  `idcardNo` char(18) NOT NULL COMMENT '身份证号',
  `birthDate` datetime DEFAULT NULL COMMENT '出生时间',
  `gender` char(1) DEFAULT NULL COMMENT '性别',
  `occupation` varchar(50) DEFAULT NULL COMMENT '职业',
  `telephone` varchar(15) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮箱',
  `mailAddress` varchar(200) DEFAULT NULL COMMENT '通信地址',
  `zipCode` char(6) DEFAULT NULL COMMENT '邮编号码',
  `qq` varchar(15) DEFAULT NULL COMMENT 'qq号码',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `lastLoginIp` varchar(15) DEFAULT NULL COMMENT '最后登录IP',
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=1036 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1005', null, 'taiji001', '256528', '2', '2008-03-15 00:00:00', '2017-10-09 19:04:04', '2017-10-09 19:42:13', 'zhangsanfeng11', '123456789012345671', '1943-02-25 00:00:00', '0', '2', '13669351234', 'test@163.com', 'test', '333333', '55555555', '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1010', null, 'xl18z60', '190613', '2', '2009-01-10 00:00:00', null, '2017-10-17 11:38:00', 'guojing', '123456789012345672', '1969-03-19 00:00:00', null, null, '13338924567', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1011', '1010', 'dgbf70', '270429', '0', '2009-03-01 00:00:00', null, null, 'huangrong', '123456789012345673', '1971-08-27 00:00:00', null, null, '13637811357', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1015', '1005', 'mjjzh64', '041115', '0', '2010-03-12 00:00:00', null, null, 'zhangwuji', '123456789012345674', '1989-06-04 00:00:00', null, null, '13572952468', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1018', '1011', 'jmdxj00', '010322', '0', '2011-01-01 00:00:00', null, null, 'guofurong', '123456789012345675', '1996-01-01 00:00:00', null, null, '18617832562', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1019', '1011', 'ljxj90', '310346', '1', '2012-02-01 00:00:00', '2017-10-18 16:14:45', null, 'luwushuang', '123456789012345676', '1993-07-31 00:00:00', null, null, '13186454984', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1020', null, 'kxhxd20', '012115', '0', '2012-02-20 00:00:00', null, null, 'weixiaobao2', '123456789012345677', '2000-10-01 00:00:00', null, '', '13953410078', '', '', '', '', '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1021', null, 'kxhxd21', '012116', '1', '2012-02-20 00:00:00', '2017-10-17 11:58:12', null, 'zhangsan', '123456789012345678', '2000-10-02 00:00:00', null, null, '13953410079', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1022', null, 'kxhxd22', '012117', '0', '2012-02-20 00:00:00', null, null, 'lisi', '123456789012345670', '2000-10-03 00:00:00', null, null, '13953410080', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1023', null, 'kxhxd23', '012118', '0', '2012-02-20 00:00:00', null, null, 'wangwu', '123456789012345611', '2000-10-04 00:00:00', null, null, '13953410081', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1024', null, 'kxhxd24', '012119', '0', '2012-02-20 00:00:00', null, null, 'zhouliu', '123456789012345612', '2000-10-05 00:00:00', null, null, '13953410082', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1025', null, 'kxhxd25', '012120', '0', '2012-02-20 00:00:00', null, null, 'maqi', '12345678901234567', '2000-10-06 00:00:00', null, null, '13953410083', null, null, null, null, '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1026', null, 'test', '', '0', '2017-04-06 09:50:46', null, '2017-04-06 10:13:52', 'mytest', '111111111111111111', '1111-11-11 00:00:00', '1', '', '11111111111', '', '', '', '', '2017-10-17 19:41:06', null);
INSERT INTO `account` VALUES ('1027', null, '1111', '111', '2', '2017-10-09 19:42:45', null, '2017-10-16 14:42:20', 'zzc', '500102199608033333', '1996-08-05 00:00:00', '1', '', '11111', '', '', '', '', null, null);
INSERT INTO `account` VALUES ('1028', null, '1221', '11221', '0', null, null, null, 'lllll', '500102199608033333', null, null, null, '13527428163', null, null, null, null, null, null);
INSERT INTO `account` VALUES ('1029', null, 'sddsd', null, '0', null, null, null, 'dsfdsf', '2141431', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `account` VALUES ('1030', null, 'zgf', null, '0', null, null, null, 'zgf', '469886465', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `account` VALUES ('1031', null, '123', '123456', '2', '2017-10-18 16:27:20', '2017-10-18 16:27:45', '2017-10-18 16:28:04', '4565', '513030199410085222', '1994-10-08 00:00:00', '1', '', '12358458263', '', '', '', '', null, null);
INSERT INTO `account` VALUES ('1032', null, 'paopao', null, '0', null, null, null, 'paopao', '5008766834991919', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `account` VALUES ('1033', null, '123456', '123456', '2', '2017-10-20 11:37:23', null, '2017-10-20 11:38:01', '213123', '513030199410085222', '1994-10-08 00:00:00', '1', '', '13268528469', '1251673803@qq.com', 'qwqewqeqwe', '564651', '15464689', null, null);
INSERT INTO `account` VALUES ('1034', null, '234234234', '111', '1', '2017-10-20 11:46:03', '2017-10-20 11:46:14', null, '234324', '513030199410085222', '1994-10-08 00:00:00', '1', '', '12358458263', '', '', '', '', null, null);
INSERT INTO `account` VALUES ('1035', null, '456', '456', '1', '2017-10-20 11:51:10', '2017-10-20 11:51:19', null, 'mmm', '513030199410085222', '1994-10-08 00:00:00', '1', '', '12358458263', '', '', '', '', null, null);

-- ----------------------------
-- Table structure for admininfo
-- ----------------------------
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `adminId` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员Id',
  `adminCode` varchar(30) DEFAULT NULL COMMENT '管理员账号',
  `password` varchar(30) DEFAULT NULL COMMENT '管理员密码',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `telephone` varchar(15) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮箱',
  `enrollDate` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=2004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admininfo
-- ----------------------------
INSERT INTO `admininfo` VALUES ('243', 'ertetr', 'estet', 'ertert', 'retret', 'tertertert', '2017-10-19 09:17:30');
INSERT INTO `admininfo` VALUES ('2000', 'admin', 'admin', 'admin', '000000', 'email@tarena.com.cn', '2016-02-18 00:00:00');
INSERT INTO `admininfo` VALUES ('2003', '132131', '123', '刘倩', '2313123123', '123123123@qq.com', '2017-10-20 11:34:31');

-- ----------------------------
-- Table structure for adminrole
-- ----------------------------
DROP TABLE IF EXISTS `adminrole`;
CREATE TABLE `adminrole` (
  `adminId` int(10) NOT NULL COMMENT '管理员Id',
  `roleId` int(10) NOT NULL COMMENT '角色Id',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminrole
-- ----------------------------
INSERT INTO `adminrole` VALUES ('2000', '100', '1');
INSERT INTO `adminrole` VALUES ('3000', '200', '2');
INSERT INTO `adminrole` VALUES ('4000', '300', '3');
INSERT INTO `adminrole` VALUES ('5000', '100', '4');
INSERT INTO `adminrole` VALUES ('5000', '200', '5');
INSERT INTO `adminrole` VALUES ('5000', '300', '6');
INSERT INTO `adminrole` VALUES ('6008', '100', '9');
INSERT INTO `adminrole` VALUES ('6004', '100', '10');
INSERT INTO `adminrole` VALUES ('6004', '506', '11');
INSERT INTO `adminrole` VALUES ('2001', '200', '14');
INSERT INTO `adminrole` VALUES ('2001', '508', '15');
INSERT INTO `adminrole` VALUES ('2003', '100', '22');
INSERT INTO `adminrole` VALUES ('2003', '200', '23');
INSERT INTO `adminrole` VALUES ('2003', '300', '24');
INSERT INTO `adminrole` VALUES ('2003', '506', '25');
INSERT INTO `adminrole` VALUES ('2003', '509', '26');

-- ----------------------------
-- Table structure for cost
-- ----------------------------
DROP TABLE IF EXISTS `cost`;
CREATE TABLE `cost` (
  `costId` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `baseDuration` decimal(11,0) DEFAULT NULL,
  `baseCost` decimal(7,2) DEFAULT NULL,
  `unitCost` decimal(7,4) DEFAULT NULL,
  `status` char(16) DEFAULT NULL,
  `descr` varchar(100) DEFAULT NULL,
  `creatTime` datetime DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `costType` char(1) DEFAULT NULL,
  PRIMARY KEY (`costId`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cost
-- ----------------------------
INSERT INTO `cost` VALUES ('1', '5.9元套餐', '20', '5.90', '0.4000', '0', '5.9元20小时/月,超出部分0.4元/时', null, '2017-10-18 15:03:57', null);
INSERT INTO `cost` VALUES ('2', '6.9元套餐', '40', '6.90', '0.3000', '0', '6.9元40小时/月,超出部分0.3元/时', null, '2017-10-18 15:02:30', null);
INSERT INTO `cost` VALUES ('3', '8.5元套餐', '100', '8.50', '0.2000', '1', '8.5元100小时/月,超出部分0.2元/时', null, '2017-10-20 09:54:59', null);
INSERT INTO `cost` VALUES ('4', '10.5元套餐', '200', '10.50', '0.1000', '1', '10.5元200小时/月,超出部分0.1元/时', null, '2017-10-18 15:58:37', null);
INSERT INTO `cost` VALUES ('5', '计时收费', null, null, '0.5000', '0', '0.5元/时,不使用不收费', null, null, null);
INSERT INTO `cost` VALUES ('6', '包月', null, '20.00', null, '0', '每月20元,不限制使用时间', null, null, null);
INSERT INTO `cost` VALUES ('8', 'nn', '10', '7.00', null, '0', '', null, null, null);
INSERT INTO `cost` VALUES ('10', 'qqq', null, null, null, '1', null, null, '2017-10-18 16:08:43', null);
INSERT INTO `cost` VALUES ('11', 'adminwangvba', null, null, null, '1', null, null, '2017-10-18 15:58:31', null);
INSERT INTO `cost` VALUES ('12', '5.9元套餐', '50', '0.50', '0.3000', '0', null, null, null, null);
INSERT INTO `cost` VALUES ('13', '6.9元套餐', '50', '0.50', '0.3000', '0', null, null, null, null);
INSERT INTO `cost` VALUES ('14', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('15', '6.9元套餐', '44', '0.50', '0.2000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('16', '1', '1', '1.00', '1.0000', '0', '1', null, null, null);
INSERT INTO `cost` VALUES ('17', '1', '1', '1.00', '1.0000', '0', '1', null, null, null);
INSERT INTO `cost` VALUES ('18', '1', '1', '1.00', '1.0000', '0', 'xz', null, null, null);
INSERT INTO `cost` VALUES ('19', '4.5元套餐', '20', '20.00', '4.0000', '0', '你好', null, null, null);
INSERT INTO `cost` VALUES ('20', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('21', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('22', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('23', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('24', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('25', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('26', '6.9元套餐', '50', '0.50', '0.3000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('27', '55.5元套餐', '5', '5.00', '5.0000', '0', '5', null, null, null);
INSERT INTO `cost` VALUES ('28', '1.9套餐', '42', '42.00', '4.2000', '0', '你妹', null, null, null);
INSERT INTO `cost` VALUES ('29', '6.9元套餐', '44', '0.50', '0.2000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('30', '6.6元套餐', '6', '6.00', '6.0000', '0', '666666', null, null, null);
INSERT INTO `cost` VALUES ('31', '1011', '1', '1.00', '1.0000', '0', 'dd', null, null, null);
INSERT INTO `cost` VALUES ('32', '6.9元套餐', '44', '0.50', '0.2000', '0', 'ä½ å¥½', null, null, null);
INSERT INTO `cost` VALUES ('33', '94', '4', '4.00', '4.0000', '0', '得', null, null, null);
INSERT INTO `cost` VALUES ('34', '', null, null, null, '1', '', null, '2017-10-20 11:35:45', null);
INSERT INTO `cost` VALUES ('35', 'werwerwerwerwre', '2', '2.00', '2.0000', '0', '', '2017-10-18 14:36:53', null, '2');
INSERT INTO `cost` VALUES ('36', 'zzzzzzz', '8', '2.00', '67.0000', '1', 'tryrtyrtytry', '2017-10-20 11:35:11', null, '2');

-- ----------------------------
-- Table structure for moduleinfo
-- ----------------------------
DROP TABLE IF EXISTS `moduleinfo`;
CREATE TABLE `moduleinfo` (
  `moduleId` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`moduleId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of moduleinfo
-- ----------------------------
INSERT INTO `moduleinfo` VALUES ('1', '角色管理');
INSERT INTO `moduleinfo` VALUES ('2', '管理员管理');
INSERT INTO `moduleinfo` VALUES ('3', '资费管理');
INSERT INTO `moduleinfo` VALUES ('4', '账务账号');
INSERT INTO `moduleinfo` VALUES ('5', '业务账号');
INSERT INTO `moduleinfo` VALUES ('6', '账单管理');
INSERT INTO `moduleinfo` VALUES ('7', '报表');
INSERT INTO `moduleinfo` VALUES ('8', '个人信息');
INSERT INTO `moduleinfo` VALUES ('9', '修改密码');

-- ----------------------------
-- Table structure for roleinfo
-- ----------------------------
DROP TABLE IF EXISTS `roleinfo`;
CREATE TABLE `roleinfo` (
  `roleId` int(10) NOT NULL AUTO_INCREMENT COMMENT '角色Id',
  `name` varchar(50) NOT NULL COMMENT '角色名',
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=510 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roleinfo
-- ----------------------------
INSERT INTO `roleinfo` VALUES ('100', '管理员');
INSERT INTO `roleinfo` VALUES ('200', '营业员');
INSERT INTO `roleinfo` VALUES ('300', '经理');
INSERT INTO `roleinfo` VALUES ('506', '管理员22');
INSERT INTO `roleinfo` VALUES ('509', '管理员00');

-- ----------------------------
-- Table structure for rolemodule
-- ----------------------------
DROP TABLE IF EXISTS `rolemodule`;
CREATE TABLE `rolemodule` (
  `roleId` int(10) NOT NULL COMMENT '角色Id',
  `moduleId` int(10) NOT NULL COMMENT '模块Id',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolemodule
-- ----------------------------
INSERT INTO `rolemodule` VALUES ('200', '3', '7');
INSERT INTO `rolemodule` VALUES ('200', '4', '8');
INSERT INTO `rolemodule` VALUES ('200', '5', '9');
INSERT INTO `rolemodule` VALUES ('200', '6', '10');
INSERT INTO `rolemodule` VALUES ('300', '1', '17');
INSERT INTO `rolemodule` VALUES ('300', '2', '18');
INSERT INTO `rolemodule` VALUES ('300', '3', '19');
INSERT INTO `rolemodule` VALUES ('300', '4', '20');
INSERT INTO `rolemodule` VALUES ('300', '5', '21');
INSERT INTO `rolemodule` VALUES ('300', '6', '22');
INSERT INTO `rolemodule` VALUES ('300', '7', '23');
INSERT INTO `rolemodule` VALUES ('1', '1', '24');
INSERT INTO `rolemodule` VALUES ('1', '4', '25');
INSERT INTO `rolemodule` VALUES ('100', '1', '57');
INSERT INTO `rolemodule` VALUES ('100', '2', '58');
INSERT INTO `rolemodule` VALUES ('100', '3', '59');
INSERT INTO `rolemodule` VALUES ('100', '4', '60');
INSERT INTO `rolemodule` VALUES ('100', '5', '61');
INSERT INTO `rolemodule` VALUES ('100', '6', '62');
INSERT INTO `rolemodule` VALUES ('100', '7', '63');
INSERT INTO `rolemodule` VALUES ('100', '8', '64');
INSERT INTO `rolemodule` VALUES ('100', '9', '65');
INSERT INTO `rolemodule` VALUES ('509', '1', '87');
INSERT INTO `rolemodule` VALUES ('509', '2', '88');
INSERT INTO `rolemodule` VALUES ('509', '3', '89');
INSERT INTO `rolemodule` VALUES ('509', '4', '90');
INSERT INTO `rolemodule` VALUES ('509', '5', '91');
INSERT INTO `rolemodule` VALUES ('509', '6', '92');
INSERT INTO `rolemodule` VALUES ('509', '7', '93');
INSERT INTO `rolemodule` VALUES ('509', '8', '94');
INSERT INTO `rolemodule` VALUES ('509', '9', '95');

-- ----------------------------
-- Table structure for service
-- ----------------------------
DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `accountId` int(10) NOT NULL COMMENT '账号Id',
  `hostIp` varchar(15) NOT NULL,
  `serverUserName` varchar(100) NOT NULL,
  `password` varchar(30) NOT NULL,
  `status` char(1) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `pauseDate` datetime DEFAULT NULL,
  `closeDate` datetime DEFAULT NULL,
  `costId` int(10) NOT NULL,
  `serviceId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`serviceId`)
) ENGINE=InnoDB AUTO_INCREMENT=2031 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of service
-- ----------------------------
INSERT INTO `service` VALUES ('1010', '192.168.0.26', 'guojing', 'guo1234', '2', '2016-02-18 00:00:00', '2017-04-06 22:26:12', '2017-10-17 11:38:00', '2', '2009');
INSERT INTO `service` VALUES ('1011', '192.168.0.26', 'huangr', 'huang234', '1', '2016-02-18 00:00:00', '2017-10-09 15:12:38', null, '12', '2010');
INSERT INTO `service` VALUES ('1011', '192.168.0.20', 'huangr', 'huang234', '0', '2016-02-18 00:00:00', null, null, '3', '2011');
INSERT INTO `service` VALUES ('1011', '192.168.0.23', 'huangr', 'huang234', '0', '2016-02-18 00:00:00', null, null, '6', '2012');
INSERT INTO `service` VALUES ('1019', '192.168.0.26', 'luwsh', 'luwu2345', '2', '2016-02-18 00:00:00', '2017-10-18 16:14:45', '2017-10-20 11:51:58', '4', '2013');
INSERT INTO `service` VALUES ('1026', '12312', '123123', '123456', '2', '2017-10-18 20:03:01', null, '2017-10-19 08:39:12', '5', '2028');
INSERT INTO `service` VALUES ('1025', '13123', '123123', '123', '0', '2017-10-19 08:39:33', null, null, '1', '2029');
INSERT INTO `service` VALUES ('1032', '24234', '234234', '123456', '1', '2017-10-20 11:38:25', '2017-10-20 11:38:37', null, '1', '2030');

-- ----------------------------
-- Table structure for serviceupdatebak
-- ----------------------------
DROP TABLE IF EXISTS `serviceupdatebak`;
CREATE TABLE `serviceupdatebak` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `serviceId` int(10) NOT NULL,
  `costId` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of serviceupdatebak
-- ----------------------------
INSERT INTO `serviceupdatebak` VALUES ('3', '2009', '4');
INSERT INTO `serviceupdatebak` VALUES ('4', '2010', '4');
INSERT INTO `serviceupdatebak` VALUES ('5', '2011', '2');
INSERT INTO `serviceupdatebak` VALUES ('6', '2012', '5');
INSERT INTO `serviceupdatebak` VALUES ('7', '2009', '2');
INSERT INTO `serviceupdatebak` VALUES ('8', '2010', '12');
```