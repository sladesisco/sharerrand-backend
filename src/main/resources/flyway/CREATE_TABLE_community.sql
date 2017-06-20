CREATE TABLE IF NOT EXISTS `sharerrand`.`community` (
  `communityid` INT NOT NULL AUTO_INCREMENT,
  `communityName` VARCHAR(100) NOT NULL,
  `city` VARCHAR(50) NULL,
  `state` VARCHAR(50) NULL,
  `postalCode` VARCHAR(15) NULL,
  `country` VARCHAR(50) NULL,
  PRIMARY KEY (`communityid`))
ENGINE = InnoDB
PACK_KEYS = Default;