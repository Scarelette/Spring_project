/*
Navicat MySQL Data Transfer

Source Server         : renjie
Source Server Version : 80016
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-05-26 21:34:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsid` int(11) NOT NULL,
  `goodsname` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '联想', '5000');
INSERT INTO `goods` VALUES ('2', '戴尔', '4000');
INSERT INTO `goods` VALUES ('3', '苹果', '8000');

-- ----------------------------
-- Table structure for pay
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay` (
  `sid` varchar(50) DEFAULT NULL,
  `dateString` varchar(50) DEFAULT NULL,
  `goodsid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pay
-- ----------------------------
INSERT INTO `pay` VALUES ('2020-05-26 20:51:04', 'a8f8c22ce2ed407a9d774be9e617af04', '1');
INSERT INTO `pay` VALUES ('2020-05-26 20:55:57', '7d721ac38aba41eeb6dafbf24f4196ec', '3');
INSERT INTO `pay` VALUES ('2020-05-26 21:08:34', '9e2fe4b9e4f3425d8bb3edff97b18501', '3');
INSERT INTO `pay` VALUES ('2020-05-26 21:10:17', '9e6289e3f3fa45af9da3fe3323f64cd7', '2');
