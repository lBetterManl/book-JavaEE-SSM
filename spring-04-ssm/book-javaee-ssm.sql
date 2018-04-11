/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : book-javaee-ssm

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2018-04-11 15:01:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', 'aa', '22');
INSERT INTO `user` VALUES ('2', '李四', 'bb', '20');
INSERT INTO `user` VALUES ('3', '王五', 'cc', '20');
