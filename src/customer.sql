/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50622
Source Host           : 127.0.0.1:3306
Source Database       : csgl

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2017-12-21 10:07:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'zhangsan', '123456', '123456');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `name` varchar(255) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('lisi', '2', 'employee', '123456', '111222');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `name` varchar(255) DEFAULT NULL,
  `onshelf` date DEFAULT NULL,
  `offshelf` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prodate` date DEFAULT NULL,
  `reldate` date DEFAULT NULL,
  `pride` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('矿泉水', '2017-12-05', '2017-12-19', 'good', '200', '2', '2017-12-29', '2017-12-28', '2.00');
INSERT INTO `goods` VALUES ('可乐', '2017-12-20', '2017-11-06', 'good', '497', '3', null, null, '2.50');
INSERT INTO `goods` VALUES ('香蕉', '2017-12-18', '2017-12-03', 'good', '500', '4', null, null, '5.00');
INSERT INTO `goods` VALUES ('葡萄', '2018-01-06', '2017-12-06', 'good', '500', '5', null, null, '3.00');
INSERT INTO `goods` VALUES ('哇哈哈', '2017-12-07', null, 'good', '500', '6', '2017-12-07', '2017-12-30', '2.5');
INSERT INTO `goods` VALUES ('鼠标', '2017-12-12', null, 'good', '200', '7', '2017-12-04', '2017-12-31', '250');
INSERT INTO `goods` VALUES ('键盘', '2017-12-06', null, 'good', '10', '8', '2017-12-01', '2017-12-26', '200');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` varchar(11) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('2', '111222', '123456', 'employee');
INSERT INTO `login` VALUES ('1', '123456', '123456', 'customer');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) DEFAULT NULL,
  `gstate` varchar(255) DEFAULT NULL,
  `gid` int(11) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('zhangsan', null, '1', '矿泉水', '交易完毕', null, null);
INSERT INTO `record` VALUES ('zhangsan', null, '2', '可乐', '交易完毕', '3', null);
INSERT INTO `record` VALUES ('zhangsan', null, '3', '矿泉水', '交易完毕', '2', null);
INSERT INTO `record` VALUES ('zhangsan', null, '4', '可乐', '交易完毕', '3', null);
INSERT INTO `record` VALUES ('zhangsan', null, '5', '可乐', '交易完毕', '3', null);
INSERT INTO `record` VALUES ('zhangsan', null, '6', '矿泉水', '交易完毕', '2', null);

-- ----------------------------
-- Table structure for tuser
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `uno` int(11) NOT NULL,
  `uname` varchar(255) DEFAULT NULL,
  `uage` varchar(255) DEFAULT NULL,
  `usex` varchar(255) DEFAULT NULL,
  `ubirth` date DEFAULT NULL,
  PRIMARY KEY (`uno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------
INSERT INTO `tuser` VALUES ('1', '123', '12', 'man', '2015-06-13');
INSERT INTO `tuser` VALUES ('2', '234', '123', '12', '2016-12-30');
