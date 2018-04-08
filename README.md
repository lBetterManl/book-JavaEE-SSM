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

（[spring-01-moattack](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-moattack)）  

**（1）谁依赖谁：**应用程序依赖于IoC容器  
**（2）为何要依赖：**应用程序需要IoC容器来提供对象需要的外部资源  
**（3）谁注入谁：**IoC容器注入应用程序某个对象，该对象是应用程序依赖的对象  
**（4）注入了什么：**注入某个对象所需的外部资源（对象、资源、常量数据）  

#### 4.2.1 IoC详细分析  

**案例场景：**  
> 电影《墨攻》的一个场景：当刘德华所饰演的墨者革离角色到达城门下，城上守军问：“来者何人？”刘德华回答：“墨者革离！”。用Java类实现“城门问答”的场景。  

**1、剧本和演员直接耦合**  （[spring-01-moattack/com.hbut.hanson.moattack01](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-moattack/src/com/hbut/hanson/moattack01)）  
**2、引入角色接口的关系**  （[spring-01-moattack/com.hbut.hanson.moattack02](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-moattack/src/com/hbut/hanson/moattack02)）  
**3、剧本和演员解耦**  （[spring-01-moattack/com.hbut.hanson.moattack03](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-01-moattack/src/com/hbut/hanson/moattack03)）  

#### 4.2.2 依赖注入的类型

**1、构造方法注入**  
**2、属性注入**  
**3、接口注入**  

### 4.3 Bean的装配  

Spring的两个核心接口：BeanFactory和ApplicationContext，其中ApplicationContext是BeanFactory的子接口。

**Bean的三种装配方式：**
1.在XML中进行显式配置
2.在Java中进行显式配置
3.隐式的Bean发现机制和自动装配

#### 4.3.1 基于XML配置的元数据

```xml
<!-- Spring配置文件 -->
<bean name="geLi" class="com.hbut.hanson.domain.LiuDeHua"></bean>
<bean name="moAttack" class="com.hbut.hanson.domain.MoAttack">
	<property name="geLi" ref="geLi"></property>
</bean>
```

```java
/* 实例化容器对象，使用容器获得Bean对象 */
ApplicationContext appContext = new ClassPathXMLApplicationContext(new String[]{"applicationContext.xml"});
GeLi geLi = (GeLi)appContext.getBean("geLi");
```

#### 4.3.2 基于注解的Bean装配

1.创建Student类

> 在Student类中添加`@Component`，声明Student对象是Spring容器管理的对象。这个注解表明该类作为组件类，并告知Spring要为这个类创建Bean。

2.组件开启扫描

> 组件扫描默认不开启，需要在Spring配置文件中设置。设置base-package，指定扫描的包名。

```xml
<!-- 在Spring配置文件中开启组件扫描 -->
<context:component-scan base-package="com.hbut.hanson"></context:component-scan>
```

> 也可以使用@ComponentScan注解开启组件扫描（一般不使用这种方式）

```java
@Configuration
@ComponentScan
public class MyConfig(){}
```

3.编写测试类

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(location = {"calsspath:applicationContext.xml"})
//@ContextConfiguration（classes = MyConfig.class）
public class AutoBeanTest(){
    @Resource
    Student student;	//@Resource表示在Spring容器中查找Student类型的对象并初始化为Student对象
    @Test
    public void test(){
        Assert.assertNotNull(student);
    }
}
```

### 4.4 面向切面编程（AOP）

（[spring-02-core](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-02-core)） 

**Aop的相关术语：**

1.切面（Aspect）：一个关注点的模快化，这个关注点可能会横切多个对象。事务管理就是关于横切关注点的例子。
2.连接点（Joinpoint）：在程序过程中某个特定的点，比如某个方法调用的时候或者处理异常的时候。一个连接点总是表示一个方法的执行。
3.通知（Advice）：在切面的某个特定的连接点上执行的动作。
4.切入点（Pointcut）：匹配连接点的断言，通知和一个切入点表达式关联，并在满足这个切入点的连接点上运行（例如，当执行某个特定名称的方法时）。
5.引入（Introduction）：用来给一个类型声明额外的方法或属性。
6.目标对象（Target Object）：被一个或多个切面所通知的对象，这个对象永远是一个被代理的对象。
7.AOP代理（AOP Proxy）：AOP框架创建的对象，用来实现切面的契约，可以是JDK动态代理或者CGLIB代理。
8.织入（Weaving）：把切面连接到其他的应用程序类型或对象上，并出啊构建一个被通知的对象，这些对象可以在编译时、类加载时和运行时完成。

**通过切点选择连接点：**

1.编写切点
```java
public interface Performance {
    public void perform();
}

public class Performer implements Performance {
    public void perform(){
        System.out.println("正在表演！");
    }
}
```

2.在切点中选择Bean
```java
/* 返回任意类型 所属类 方法 使用任意参数 */
execution(* com.hbut.hanson.Performance.perform(..))
```

3.Spring AOP两种实现方式

- 基于注解实现 （[spring-02-core/com.hbut.hanson.aop](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-02-core/src/com/hbut/hanson/aop)）
- 基于XML配置实现（[spring-02-core/com.hbut.hanson.xmlaop](https://github.com/lBetterManl/book-JavaEE-SSM/tree/master/spring-02-core/src/com/hbut/hanson/xmlaop)）

### 4.5 Spring的事务管理

**事务四大特性（ACID）：**
1.原子性：确保动作要么全部完成，要么完全不起作用；
2.一致性：一旦事务完成（不管成功或失败），系统必须确保它所建模的业务处于一致性状态，而不会是部分完成部分失败。现实中的数据不会被破坏。
3.隔离性：可能有许多事务会同时处理相同的数据，因此每个事务都应该与其他事务隔离开来，防止数据损坏。
4.持久性：一旦事务完成，无论发生什么系统错误，它的结果都不应该受到影响，这样就能从任何系统崩溃中恢复过来。

**核心接口：**

1.事务管理器 

> Spring并不直接管理事务，而是提供了多种事务管理器。Spring事务管理器的接口是`org.springframework.transaction.PlatformTransactionManager`，通过这个接口为JDBC、Hibernate等提供对应的事务管理器。

```java
public interface PlatformTransactionManager {
	TransactionStatus getTransaction（TransactionDefinition definition）throws TransactionException;
	void commit(TransactionStatus status) throws TransactionException;
	void rillback(TransactionStatus status) throws TransactionException;
}
```

2.JDBC事务

> 如果应用程序使用JDBC来进行持久化，DataSourceTransactionManager会处理事务边界。

```xml
<bean id = "transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
	<property name = "dataSource" ref = "dataSource"/>
</bean>
```

3.Hibernate事务

> 如果应用程序使用Hibernate来进行持久化，需要使用HibernateTransactionManager。对于Hibernate4的配置如下。

```xml
<bean id = "transactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager">
	<property name="sessionFactory" ref="sessionFactory"/>
</bean>
```

4.Java持久化API事务（JPA）

> 如果应用程序使用JPA来进行持久化，需要使用JpaTransactionManager来处理事务。

```xml
<bean id = "transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
	<property name="sessionFactory" ref="sessionFactory"/>
</bean>
```

5.Java原生API事务

> 如果没有使用上述事务管理，或者是跨越了多个事务管理源（比如两个或者多个不同数据源），就需要使用JtaTransactionManager。

```
<bean id = "transationManager" class="org.springframework.transaction.jta.JtaTransactionManager">
	<property name="transactionManagerName" value="java:/TransactionManager"/>
</bean>
```

**基本事务属性：**

事务属性包含了5个方面：传播行为、隔离规则、回滚规则、事务超时和是否可读。

1.传播行为

> 当事务方法被另一个事务方法调用时，必须制定事务应该如何传播。例如：方法可能继续在现有事务中运行，也可能开启一个新的事务，并在自己的事务中运行。

| 传播行为                  | 含义                                                         |
| :------------------------ | :----------------------------------------------------------- |
| PROPAGATION_REQUIRED      | 表示当前方法必须运行在事务中。如果当前事务存在，方法将会在该事务中运行。否则，就会启动一个新的事务。 |
| PROPAGATION_SUPPORTS      | 表示当前方法不需要事务上下文。但是如果存在当前事务，则该方法会在这个事务中运行。 |
| PROPAGATION_MANDATORY     | 表示该方法必须在事务中运行，如果当前不存在事务，则会抛出一个异常。 |
| PROPAGATION_REQUIRED_NEW  | 表示当前方法必须运行在它自己的事务中。一个新的事务将被启动。如果存在当前事务，在该方法执行期间，当前事务会被挂起。如果使用JtaTransactionManager，则需要访问TransactionManager。 |
| PROPAGATION_NOT_SUPPORTED | 表示当前方法不应该运行在事务中。如果存在当前事务，在该方法执行期间，当前事务会被挂起。如果使用JtaTransactionManager，则需要访问TransactionManager。 |
| PROPAGATION_NEVER         | 表示当前方法不应该运行在事务上下文中。如果当前正有一个事务在运行，则会抛出异常。 |
| PROPAGATION_NESTED        | 表示如果当前已经存在一个事务，则该方法将会在嵌套事务中运行。嵌套事务可以独立于当前事务进行单独提交或回滚。如果当前事务不存在，那么其行为与PROPAGATION_REQUIRED一样。 |

2.隔离级别

> 隔离级别定义了一个事务可能收到其他并发事务影响的程度。

并发导致的问题：
- 脏读——脏读发生在一个事务读取了另一个事务改写但尚未提交的数据时。如果改写在稍后被回滚了，那么第一个事务获取的数据就是无效的。

- 不可重复读——不可重复读发生在一个事务执行相同的查询两次或两次以上，但是每次都得到不同的数据时。这通常是因为另一个并发事务在两次查询期间进行了更新。

- 幻读——幻读与不可重复读类似。它发生在一个事务（T1）读取了几行数据，接着另一个并发事务（T2）插入了一些数据时。在随后的查询中，第一个事务（T1）就会发现多了一些原本不存在的记录。

  | 隔离级别                  | 含义                                                         |
  | :------------------------ | :----------------------------------------------------------- |
  | ISOLATION_DEFAULT         | 使用后端数据库默认的隔离级别                                 |
  | ISOLATION_READ_UNCOMMITED | 最低的隔离级别，允许读取尚未提交的数据变更，可能会导致脏读，幻读或不可重复读。 |
  | ISOLATION_READ_COMMITED   | 允许读取并发事务已经提交的数据，可以阻止脏读，但是幻读或不可重复读仍有可能发生。 |
  | ISOLATION_REPEATABLE_READ | 对同一字段的多次读取结果都是一致的，除非数据是被本身事务所修改，可以阻止脏读和不可重复读，但幻读仍有可能发生。 |
  | ISOLATION_SERIALIZABLE    | 最高的隔离级别，完全服从ACID的隔离级别，确保阻止脏读、不可重复读以及幻读，也是最慢的事务隔离级别，因为它通常是通过完全锁定事务相关的数据库来实现。 |

**事务配置：**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:aop="http://www.springframework.org/schema/aop" 
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
						http://www.springframework.org/schema/beans/spring-beans.xsd
						http://www.springframework.org/schema/aop 
						http://www.springframework.org/schema/aop/spring-aop.xsd
						http://www.springframework.org/schema/context 
						http://www.springframework.org/schema/context/spring-context.xsd
						http://www.springframework.org/schema/tx 
						http://www.springframework.org/schema/tx/spring-tx.xsd">
    
	<!-- <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource" />
    </bean> -->
    <!-- <bean id="transactionManager" class="org.springframework.orm.hibernate3.HibernateTransactionManager">
        <property name="sessionFactory" ref="sessionFactory" />
    </bean> -->
     <!-- <bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
        <property name="sessionFactory" ref="sessionFactory" />
    </bean> -->
  <!--   <bean id="transactionManager" class="org.springframework.transaction.jta.JtaTransactionManager">
        <property name="transactionManagerName" value="java:/TransactionManager" />
    </bean> -->
    
  	<!-- 声明一个事务管理的fooService bean (DefaultFooService类)-->
    <bean id="fooService" class="com.hbut.hanson.service.DefaultFooService"></bean>
    <!-- 声明事务通知 -->
    <tx:advice id="txAdvice" transaction-manager="txManager">
        <!--属性属性 -->
        <tx:attributes>
            <!-- 所有以get开头的方法 read-only -->
            <tx:method name="get*" propagation="SUPPORTS" read-only="true"/>
            <!-- 其它方法使用事务读写设置 -->
            <tx:method name="insert*" propagation="REQUIRED" read-only="false"/>
            <tx:method name="update*" propagation="REQUIRED" read-only="false"/>
            <tx:method name="delete*" propagation="REQUIRED" read-only="false"/>
        </tx:attributes>
    </tx:advice>
    <!-- 声明事务切面 （FooService接口）-->
     <aop:config>
        <aop:pointcut id="fooServiceOperation" expression="execution(* com.hbut.hanson.service.FooService.*(..))"/>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="fooServiceOperation"/>
    </aop:config>

    <!-- 声明数据源bean -->
    <bean id="dataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql:///mytest"/>
        <property name="username" value="root"/>
        <property name="password" value="root"/>
    </bean>

    <!-- 声明一个事务管理器 -->
    <bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>
</beans>
```

## 5、SpringMVC

### 5.1 创建SpringMVC程序

1.导入jar包
`commons-logging-XXX.jar`  
`spring-aop-XXX.jar`  
`spring-beans-XXX.jar`  
`spring-context-XXX.jat`  
`spring-core-XXX.jar`  
`spring-expression-XXX.jar`  
`spring-web-XXX.jar`  
`spring-webmvc-XXX.jar`  

2.在web.xml中配置
```xml
	<servlet>
		<servlet-name>springmvc</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- 初始化配置 -->
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:spring-mvc.xml</param-value>
		</init-param>
		<!-- 是否在启动时就加载 -->
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>springmvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
```

3.在spring-mvc.xml中配置视图解析
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xmlns:mvc="http://www.springframework.org/schema/mvc"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd
        http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.3.xsd">                    

    <!-- 启动spring自动扫描 -->
    <context:component-scan base-package="com.hbut.hanson.controller"/>
    <!-- 启动Spring MVC的注解功能，完成请求和注解POJO的映射 -->
    <mvc:annotation-driven />
    <!-- 配置视图解析器 -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" 
            id="internalResourceViewResolver">
        <!-- 前缀 -->
        <property name="prefix" value="/WEB-INF/jsp/" />
        <!-- 后缀 -->
        <property name="suffix" value=".jsp" />
    </bean>
   <!-- 配置文件上传 --> 
    <bean id="multipartResolver"
		class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<property name="defaultEncoding" value="utf-8" /> <!-- 默认编码 (ISO-8859-1) -->
		<property name="maxInMemorySize" value="10240" /> <!-- 最大内存大小 (10240) -->
		<property name="uploadTempDir" value="/temp/" /> <!--(临时文件存储目录) 上传后的目录名 (WebUtils#TEMP_DIR_CONTEXT_ATTRIBUTE) -->
		<property name="maxUploadSize" value="-1" /> <!-- 最大文件大小，-1为无限止(-1) -->
	</bean> 
</beans>
```

### 5.2 SpringMVC RequestMapping的基本配置

### 5.3 SpringMVC前后台数据交互

### 5.4 SpringMVC文件上传下载

### 5.5 SpringMVC常用注解

## 6、SpringMVC Spring MyBatis集成

