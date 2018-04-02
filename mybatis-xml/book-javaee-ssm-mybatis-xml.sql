/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : book-javaee-ssm-mybatis-xml

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2018-04-02 16:21:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` int(10) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(50) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `createTime` time DEFAULT NULL,
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '嘿哈', '2018-04-02', '15:36:33');
