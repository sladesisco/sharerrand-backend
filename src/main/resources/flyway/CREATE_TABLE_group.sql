CREATE TABLE IF NOT EXISTS `sharerrand`.`group` (
  `groupId` INT NOT NULL AUTO_INCREMENT,
  `groupName` VARCHAR(100) NOT NULL,
  `phone` VARCHAR(50) NULL,
  `addressLine1` VARCHAR(50) NOT NULL,
  `addressLine2` VARCHAR(50) NULL,
  `city` VARCHAR(50) NULL,
  `state` VARCHAR(50) NULL,
  `postalCode` VARCHAR(15) NULL,
  `country` VARCHAR(50) NULL,
  `communityId` INT NULL,
  PRIMARY KEY (`groupId`),
  INDEX `community_fk_1_idx` (`communityId` ASC),
  CONSTRAINT `group_fk_community`
    FOREIGN KEY (`communityId`)
    REFERENCES `sharerrand`.`community` (`communityid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;