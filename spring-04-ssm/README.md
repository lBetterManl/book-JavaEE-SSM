# Spring+SpringMVC+Mybatis整合

Spring4+MyBatis3

## 环境jar包及xml配置

## SQL语句

```
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO user VALUES(1,"张三","aa",22);
INSERT INTO user VALUES(2,"李四","bb",20);
INSERT INTO user VALUES(3,"王五","cc",20);
```
