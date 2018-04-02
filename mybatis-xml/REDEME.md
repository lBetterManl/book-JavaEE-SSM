# 编译工具及环境  

JDK：1.8  
IDE：Eclipse neon.3  
MySQL:5.6  

mybatis:[https://github.com/mybatis](https://github.com/mybatis)  
mysql jar:[http://www.mysql.com/products/connector](http://www.mysql.com/products/connector)  
log4j:[http://logging.apache.org/log4j](http://logging.apache.org/log4j)

# 项目说明  

Java项目，MyBatis基于XML配置  
数据库名：book-javaee-ssm-mybatis-demo  

# 数据库SQL  
```
CREATE TABLE student (
	stuId INT(10) NOT NULL AUTO_INCREMENT,
	stuName VARCHAR(50) DEFAULT NULL,
	createDate date,
	createTime time,
	PRIMARY KEY(stuId)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARACTER=utf8;
```


# 笔记  

```
别名	映射的类型
_byte	byte
_long	long
_short	short
_int	int
_integer	int
_double	double
_float	float
_boolean	boolean
string	String
byte	Byte
long	Long
short	Short
int	Integer
integer	Integer
double	Double
float	Float
boolean	Boolean
date	Date
decimal	BigDecimal
bigdecimal	BigDecimal
object	Object
map	Map
hashmap	HashMap
list	List
arraylist	ArrayList
collection	Collection
iterator	Iterator
```

# 小结

Mybatis基于XML配置  