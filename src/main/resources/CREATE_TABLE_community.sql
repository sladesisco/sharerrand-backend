{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 CREATE TABLE IF NOT EXISTS `sharerrand`.`community` (\
  `communityid` INT NOT NULL AUTO_INCREMENT,\
  `communityName` VARCHAR(100) NOT NULL,\
  `city` VARCHAR(50) NULL,\
  `state` VARCHAR(50) NULL,\
  `postalCode` VARCHAR(15) NULL,\
  `country` VARCHAR(50) NULL,\
  PRIMARY KEY (`communityid`))\
ENGINE = InnoDB\
PACK_KEYS = Default}