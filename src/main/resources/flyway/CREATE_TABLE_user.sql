CREATE TABLE IF NOT EXISTS `sharerrand`.`user` (
  `userid` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(50) NOT NULL,
  `lastName` VARCHAR(50) NOT NULL,
  `phone` VARCHAR(15) NULL,
  `email` VARCHAR(100) NULL,
  `groupId` INT NOT NULL,
  PRIMARY KEY (`userid`),
  INDEX `user_fk_1_idx` (`groupId` ASC),
  CONSTRAINT `user_fk_group`
    FOREIGN KEY (`groupId`)
    REFERENCES `sharerrand`.`group` (`groupId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;