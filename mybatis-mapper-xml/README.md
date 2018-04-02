# 映射器（Mapper）  

# 编译工具及环境  

JDK：1.8  
IDE：Eclipse neon.3  
MySQL:5.6  

mybatis:[https://github.com/mybatis](https://github.com/mybatis)  
mysql jar:[http://www.mysql.com/products/connector](http://www.mysql.com/products/connector)  
log4j:[http://logging.apache.org/log4j](http://logging.apache.org/log4j)

# 项目说明  

Java项目，MyBatis基于XML配置  
数据库名：book-javaee-ssm-mybatis-mapper  

Student 单一例子  
Userinfo - Address	一对一  
Department - Employee	一对多  

# 动态SQL  

`if`  
`choose` `when` `otherwise`  
`where` `trim` `set`  
`foreach`  


# 数据库SQL  

** Student（单个例子） **  

```
/* student表 */
CREATE TABLE `student`(
	`stuId` INT(10) NOT NULL AUTO_INCREMENT,
	`stuName` VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(`stuId`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `student` VALUES(1, "张三");
INSERT INTO `student` VALUES(2, "李四");
INSERT INTO `student` VALUES(3, "王五");
```

** Userinfo - Address（一对一） **

```
/* address表 */
CREATE TABLE address (
	addrid INT(10) NOT NULL AUTO_INCREMENT,
	city VARCHAR(50) DEFAULT NULL,
	street VARCHAR(50) DEFAULT NULL,
	zip VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(addrid)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/* userinfo表 */
CREATE TABLE userinfo (
	user_id INT(10) NOT NULL AUTO_INCREMENT,
	user_name VARCHAR(50) DEFAULT NULL,
	password VARCHAR(50) DEFAULT NULL,
	addrid INT(10),
	PRIMARY KEY(user_id),
	FOREIGN KEY(addrid) REFERENCES Address(addrid)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO address VALUES(1, "北京", "东城", "400056");
INSERT INTO address VALUES(2, "上海", "黄浦", "400023");

INSERT INTO userinfo VALUES(1, "张三", "aaa", 1);
INSERT INTO userinfo VALUES(2, "李四", "bbb", 2);
INSERT INTO userinfo VALUES(3, "王五", "ccc", 2);
```

** Department - Employee（一对多） **  

```
/* department表 */
CREATE TABLE department (
	depid INT(10) NOT NULL AUTO_INCREMENT,
	depname VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(depid)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/* employee表 */
CREATE TABLE employee (
	empid INT(10) NOT NULL AUTO_INCREMENT,
	empname VARCHAR(50) DEFAULT NULL,
	depid INT(10) DEFAULT NULL,
	PRIMARY KEY(empid),
	FOREIGN KEY(depid) REFERENCES department(depid)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO department VALUES(1, "行政部");
INSERT INTO department VALUES(2, "人力资源部");
INSERT INTO department VALUES(3, "销售部");

INSERT INTO employee VALUES(1, "妮妮", 1);
INSERT INTO employee VALUES(2, "喔喔", 2);
INSERT INTO employee VALUES(3, "塔塔", 2);
INSERT INTO employee VALUES(4, "嘿嘿", 3);
```
