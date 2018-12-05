/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.5.27 : Database - yue
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`yue` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yue`;

/*Table structure for table `activity` */

DROP TABLE IF EXISTS `activity`;

CREATE TABLE `activity` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `roomId` int(10) NOT NULL,
  `userId` int(10) NOT NULL,
  `jTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activity` */

/*Table structure for table `browse` */

DROP TABLE IF EXISTS `browse`;

CREATE TABLE `browse` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `trendsId` int(10) NOT NULL,
  `userId` int(10) NOT NULL,
  `bTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `browse` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `trendsId` int(10) NOT NULL,
  `userId` int(10) NOT NULL,
  `content` char(50) DEFAULT NULL,
  `agreeNum` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `friend` */

DROP TABLE IF EXISTS `friend`;

CREATE TABLE `friend` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL,
  `friendId` int(10) NOT NULL,
  `class` char(10) NOT NULL DEFAULT '好友',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `friend` */

/*Table structure for table `message_friend` */

DROP TABLE IF EXISTS `message_friend`;

CREATE TABLE `message_friend` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `sender` int(10) NOT NULL,
  `geter` int(10) NOT NULL,
  `content` char(50) NOT NULL,
  `sTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_friend` */

/*Table structure for table `message_room` */

DROP TABLE IF EXISTS `message_room`;

CREATE TABLE `message_room` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `sender` int(10) NOT NULL,
  `roomId` int(10) NOT NULL,
  `content` char(50) DEFAULT NULL,
  `sTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message_room` */

/*Table structure for table `ready` */

DROP TABLE IF EXISTS `ready`;

CREATE TABLE `ready` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `recommendId` int(10) NOT NULL,
  `userId` int(10) NOT NULL,
  `rTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ready` */

/*Table structure for table `recommend` */

DROP TABLE IF EXISTS `recommend`;

CREATE TABLE `recommend` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL DEFAULT '1705010406',
  `infor` char(50) NOT NULL,
  `number` int(10) unsigned DEFAULT '10',
  `pTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `recommend` */

/*Table structure for table `room` */

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `type` char(10) NOT NULL,
  `name` char(10) NOT NULL,
  `summary` char(30) DEFAULT NULL,
  `userId` int(10) unsigned NOT NULL COMMENT 'userId',
  `place` char(10) DEFAULT NULL,
  `time` datetime NOT NULL,
  `number` int(10) unsigned DEFAULT '10',
  `maxNumber` int(10) unsigned DEFAULT '10',
  `pTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `room` */

/*Table structure for table `trends` */

DROP TABLE IF EXISTS `trends`;

CREATE TABLE `trends` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL COMMENT 'userId',
  `context` char(50) DEFAULT NULL,
  `shareNum` int(10) DEFAULT NULL,
  `commentNum` int(10) DEFAULT NULL,
  `agreeNum` int(10) DEFAULT NULL,
  `number` int(10) DEFAULT '10',
  `pTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `trends` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `sId` int(10) unsigned NOT NULL,
  `pswd` char(16) NOT NULL,
  `idenId` char(18) NOT NULL,
  `nick` char(10) NOT NULL,
  `phone` char(11) NOT NULL,
  `sex` char(2) NOT NULL,
  `sign` char(50) DEFAULT '这个人很懒，还没有留下任何签名',
  `charm` int(10) unsigned DEFAULT '0',
  `rTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`,`sId`,`idenId`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
