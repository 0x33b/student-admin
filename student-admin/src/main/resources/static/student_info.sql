/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2022-11-20 10:58:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `stu_no` varchar(128) DEFAULT NULL COMMENT '学号',
  `stu_name` varchar(64) DEFAULT NULL COMMENT '学生姓名',
  `stu_age` int(11) DEFAULT NULL COMMENT '学生年龄',
  `stu_sex` char(1) DEFAULT NULL COMMENT '性别： 0女 1男',
  `stu_birthday` date DEFAULT NULL COMMENT '学生生日',
  `stu_address` varchar(128) DEFAULT NULL COMMENT '家庭住址',
  `del_flag` varchar(1) DEFAULT NULL COMMENT '逻辑删除标识（0正常 1删除）',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('1', '001', '张三', '18', '1', '2014-02-06', '江苏徐州', '0', null, null, null, null);
INSERT INTO `student_info` VALUES ('3', '002', '李四', '18', '0', '2015-02-06', '江苏徐州', '0', null, null, null, null);
