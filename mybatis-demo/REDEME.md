# 编译工具及环境  

JDK：1.7  
IDE：Eclipse neon.3  
MySQL:5.6  

mybatis:[https://github.com/mybatis](https://github.com/mybatis)  
mysql jar:[http://www.mysql.com/products/connector](http://www.mysql.com/products/connector)  

# 项目说明  

Java项目，对一张表（student）进行数据查询  
数据库名：book-javaee-ssm-mybatis-demo  

# 数据库SQL语句  

** 生成student表，并插入三条样本 **  

```sql
/*创建student表*/
CREATE TABLE student (
	stuId INT(10) NOT NULL AUTO_INCREMENT,
	stuName VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY(stuId)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8; 

/*插入三条样本数据*/
INSERT INTO student VALUES(1, '张三');
INSERT INTO student VALUES(2, '李四');
INSERT INTO student VALUES(3, '王五');
```