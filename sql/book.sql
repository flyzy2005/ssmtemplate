/*
Navicat MySQL Data Transfer

Source Server         : fly
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-07-19 17:23:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `author` varchar(100) NOT NULL COMMENT '馆藏数量',
  `publisher` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='图书表';

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1000', 'Java程序设计', '程星会', 'fzt程');
INSERT INTO `book` VALUES ('1001', '数据结构', '大师兄', 'fzt大师兄');
INSERT INTO `book` VALUES ('1002', '设计模式', '会会', 'fzt会会');
INSERT INTO `book` VALUES ('1003', '编译原理', '玉米会', 'fzt玉米');
