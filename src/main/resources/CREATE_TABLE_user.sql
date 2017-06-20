{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 CREATE TABLE IF NOT EXISTS `sharerrand`.`user` (\
  `userid` INT NOT NULL AUTO_INCREMENT,\
  `firstName` VARCHAR(50) NOT NULL,\
  `lastName` VARCHAR(50) NOT NULL,\
  `phone` VARCHAR(15) NULL,\
  `email` VARCHAR(100) NULL,\
  `groupId` INT NOT NULL,\
  PRIMARY KEY (`userid`),\
  INDEX `user_fk_1_idx` (`groupId` ASC),\
  CONSTRAINT `user_fk_group`\
    FOREIGN KEY (`groupId`)\
    REFERENCES `sharerrand`.`group` (`groupId`)\
    ON DELETE NO ACTION\
    ON UPDATE NO ACTION)\
ENGINE = InnoDB}