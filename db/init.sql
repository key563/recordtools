
-- 创建数据库
drop database if exists recordtools;
create database recordtools;

-- 创建表结构

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account_information`
-- ----------------------------
DROP TABLE IF EXISTS `account_information`;
CREATE TABLE `account_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账号表主键',
  `account_wangwang_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '旺旺号',
  `account_wechat_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '微信号',
  `account_type` int(11) DEFAULT NULL COMMENT '0:白名单1:黑名单2:骗子',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '更改者',
  `create_by` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of account_information
-- ----------------------------

-- ----------------------------
-- Table structure for `bussiness_information`
-- ----------------------------
DROP TABLE IF EXISTS `bussiness_information`;
CREATE TABLE `bussiness_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '业务单表主键',
  `bussiness_id` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '业务单号',
  `store_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '店铺名称',
  `pay_money` float(11,0) DEFAULT NULL COMMENT '购买金额',
  `commission_momey` float(11,0) DEFAULT NULL COMMENT '佣金',
  `cost_price` float(11,0) DEFAULT NULL COMMENT '成本价:购买金额+佣金',
  `pay_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '购买时间',
  `bussiness_decsription` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '业务单描述',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '更新者',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `PK_BUSSINESS_ID` (`bussiness_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of bussiness_information
-- ----------------------------

-- ----------------------------
-- Table structure for `mid_account_bussiness`
-- ----------------------------
DROP TABLE IF EXISTS `mid_account_bussiness`;
CREATE TABLE `mid_account_bussiness` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账号和业务单中间表',
  `account_id` int(11) NOT NULL COMMENT '账号id',
  `bussiness_id` int(11) NOT NULL COMMENT '业务单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of mid_account_bussiness
-- ----------------------------

-- ----------------------------
-- Table structure for `mid_users_account`
-- ----------------------------
DROP TABLE IF EXISTS `mid_users_account`;
CREATE TABLE `mid_users_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账号和用户中间表',
  `users_id` int(11) NOT NULL COMMENT '用户表主键',
  `account_id` int(11) NOT NULL COMMENT '账号表主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of mid_users_account
-- ----------------------------

-- ----------------------------
-- Table structure for `user_operator`
-- ----------------------------
DROP TABLE IF EXISTS `user_operator`;
CREATE TABLE `user_operator` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户表主键',
  `login_name` varchar(16) COLLATE gbk_bin NOT NULL COMMENT '登录用户名',
  `login_pdw` varchar(64) COLLATE gbk_bin NOT NULL COMMENT '登录密码密文',
  `operator_type` int(11) NOT NULL DEFAULT '0' COMMENT '1:超级用户2:普通用户',
  `description` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '描述',
  `operator_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '昵称',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '更新者',
  `create_by` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;