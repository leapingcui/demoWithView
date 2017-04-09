/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : gene

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-04-09 12:29:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `cla_id` varchar(16) NOT NULL,
  `cla_name` varchar(16) DEFAULT NULL,
  `cla_total_num` int(8) DEFAULT NULL,
  PRIMARY KEY (`cla_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('1', '一班', '10');
INSERT INTO `classes` VALUES ('2', '二班', '20');
INSERT INTO `classes` VALUES ('3', '三班', '30');
INSERT INTO `classes` VALUES ('33', '三十三班', '10');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` int(10) NOT NULL,
  `stu_pwd` varchar(32) DEFAULT '123456',
  `stu_name` varchar(16) DEFAULT NULL,
  `stu_pic` varchar(128) DEFAULT NULL,
  `stu_sex` varchar(4) DEFAULT '男',
  `stu_birth` date DEFAULT NULL,
  `stu_cla_id` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `stu_cla_id_fk` (`stu_cla_id`),
  CONSTRAINT `stu_cla_id_fk` FOREIGN KEY (`stu_cla_id`) REFERENCES `classes` (`cla_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('101', '101', '崔一', null, '男', '1992-10-23', '1');
INSERT INTO `student` VALUES ('102', '102', '崔二', null, '女', '2017-03-08', '2');
INSERT INTO `student` VALUES ('103', '103', '崔三', null, '女', '2017-03-22', '1');
INSERT INTO `student` VALUES ('105', '123456', '崔五', null, '男', '1963-04-05', '2');
INSERT INTO `student` VALUES ('107', '123456', '刘二', null, '男', null, '2');
INSERT INTO `student` VALUES ('108', '123456', '刘三', null, '男', null, '1');
INSERT INTO `student` VALUES ('110', '123456', '崔二', null, '男', null, '1');
INSERT INTO `student` VALUES ('111', '123456', '王一', null, '男', null, '2');
INSERT INTO `student` VALUES ('112', '123456', '赵一', null, '男', null, '2');
INSERT INTO `student` VALUES ('113', '123456', '张一', null, '男', null, '1');
INSERT INTO `student` VALUES ('114', '123456', '崔一', null, '女', null, '1');
INSERT INTO `student` VALUES ('115', '115', '崔十五', null, '女', '2017-03-18', '1');
INSERT INTO `student` VALUES ('116', '123456', '崔十六', null, '女', '1988-11-12', '2');
INSERT INTO `student` VALUES ('117', '123456', '崔十七', null, '男', '1993-10-15', '2');
INSERT INTO `student` VALUES ('122', '123456', '崔二十二', null, '男', null, '1');

-- ----------------------------
-- View structure for v_stu_cla
-- ----------------------------
DROP VIEW IF EXISTS `v_stu_cla`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_stu_cla` AS select `student`.`stu_id` AS `stu_id`,`student`.`stu_pwd` AS `stu_pwd`,`student`.`stu_name` AS `stu_name`,`student`.`stu_pic` AS `stu_pic`,`student`.`stu_sex` AS `stu_sex`,`student`.`stu_birth` AS `stu_birth`,`student`.`stu_cla_id` AS `stu_cla_id`,`classes`.`cla_name` AS `cla_name`,`classes`.`cla_total_num` AS `cla_total_num` from (`classes` join `student` on((`student`.`stu_cla_id` = `classes`.`cla_id`))) ;
SET FOREIGN_KEY_CHECKS=1;
