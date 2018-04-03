# book-JavaEE-SSM
[book-JavaEE-SSM源码](https://github.com/lBetterManl/book-JavaEE-SSM)  
Java EE框架技术（SpringMVC+Spring+Mybatis）-陈永政-西安电子科技大学出版社  
书中代码 [https://github.com/bay-test/ssmbooksource](https://github.com/bay-test/ssmbooksource)  

## 1、MyBatis开发入门
（[mybatis-demo](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/mybatis-demo)）  

### 1.1 第一个MyBatis程序  
入门基础，引入jar包和简单配置  

### 1.2 MyBatis日志  
`log4j` 输出到控制台或文件，记录SQL执行过程。

## 2、MyBatis配置   

### 2.1 基于XML方式配置MyBatis
（[mybatis-xml](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/mybatis-mapper-xml)）  
- 数据源配置  
- mybatis-config.xml配置节点说明  
- 测试mapper语句  
- 相关拦截器、插件的使用  

### 2.2 基于API方式配置MyBatis
（[mybatis-api](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/mybatis-api)）  
了解原理用，实际不适用  

## 3、映射器（Mapper）  
**注意：**  
- SQL语句需要使用数据库中字段  
- 不配置映射关系时对象属性和数据库字段一致（不区分大小写）  

### 3.1 XML配置映射
（[mybatis-mapper-xml](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/mybatis-mapper-xml)）  
- 关联关系(一对一，一对多)  
- ResultMap(数据库到实体的映射，连接查询)  
- Mapper接口  
- 动态SQL  

### 3.2 注解配置映射
（[mybatis-mapper-annotation](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/mybatis-mapper-annotation)）  
- 以注解的方式实现3.1的例子  
- Mybatis自动生成插件的配置  

## 4、Spring核心技术  

### 4.1 Spring简介  
**Spring jar包：**  
`spring-core-XXX.jar`  
`spring-beans-XXX.jar`  
`spring-context-XXX.jar`  
`spring-expression-XXX.jar`  
**配置文件：**  
`applicationContext.xml`  
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
						http://www.springframework.org/schema/beans/spring-beans.xsd
</beans>
```
**测试类：**  
```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringTest{
    @Test
    public void test(){
        System.out.println("Hello Test!");
    }
}
```

### 4.2 控制反转（IoC）或 依赖注入(ID)  
（[spring-01-attack](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-attack)）  

**（1）谁依赖谁：**应用程序依赖于IoC容器  
**（2）为何要依赖：**应用程序需要IoC容器来提供对象需要的外部资源  
**（3）谁注入谁：**IoC容器注入应用程序某个对象，该对象是应用程序依赖的对象  
**（4）注入了什么：**注入某个对象所需的外部资源（对象、资源、常量数据）  

#### 4.2.1 IoC详细分析  
**案例场景：**  
> 电影《墨攻》的一个场景：当刘德华所饰演的墨者革离角色到达城门下，城上守军问：“来者何人？”刘德华回答：“墨者革离！”。用Java类实现“城门问答”的场景。  

**1、剧本和演员直接耦合**  （[spring-01-attack/com.hbut.hanson.moattack01](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-attack/src/com/hbut/hanson/moattack01)）  
**2、引入角色接口的关系**  （[spring-01-attack/com.hbut.hanson.moattack02](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-attack/src/com/hbut/hanson/moattack02)）  
**3、剧本和演员解耦**  （[spring-01-attack/com.hbut.hanson.moattack03](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-attack/src/com/hbut/hanson/moattack03)）  


### 4.3 Bean的装配  

### 4.4 面向切面编程（AOP）  

### 4.5 Spring的事务管理  











