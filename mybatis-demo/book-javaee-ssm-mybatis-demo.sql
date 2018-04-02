/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : book-javaee-ssm-mybatis-demo

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2018-04-02 12:37:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` int(10) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三');
INSERT INTO `student` VALUES ('2', '李四');
INSERT INTO `student` VALUES ('3', '王五');
