# 映射器（Mapper）  

# 编译工具及环境  

JDK：1.8  
IDE：Eclipse neon.3  
MySQL:5.6  

mybatis:[https://github.com/mybatis](https://github.com/mybatis)  
mysql jar:[http://www.mysql.com/products/connector](http://www.mysql.com/products/connector)  
log4j:[http://logging.apache.org/log4j](http://logging.apache.org/log4j)

# 项目说明  

数据库及对象关系参考`mybatis-mapper-xml`  
Java项目，MyBatis基于注解配置  
`@Insert` `@Delete` `@Update` `@Select` `@One` `@Many`  
数据库名：book-javaee-ssm-mybatis-mapper 

# 动态SQL  

`@SelectProvider`  
`@InsertProvider`  
`@UpdateProvider`  
`@DeleteProvider`  

# Mybatis自动生成插件  

`generatorConfig.xml`  
配置完之后运行脚本 Java -jar mybatis-generator-core-1.3.5.jar -configfile generatorConfig.xml -overwrite  
或者直接安装MybatisGenerator插件  


