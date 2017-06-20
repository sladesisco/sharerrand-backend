CREATE TABLE IF NOT EXISTS `sharerrand`.`request` (
  `requestId` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `groupId` INT NOT NULL,
  `requestedDate` DATETIME NULL,
  `dueDate` DATETIME NULL,
  `completedDate` DATETIME NULL,
  `status` VARCHAR(45) NULL,
  `description` MEDIUMBLOB NULL,
  PRIMARY KEY (`requestId`),
  INDEX `request_fk_user_idx` (`userId` ASC),
  INDEX `request_fk_group_idx` (`groupId` ASC),
  CONSTRAINT `request_fk_user`
    FOREIGN KEY (`userId`)
    REFERENCES `sharerrand`.`user` (`userid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `request_fk_group`
    FOREIGN KEY (`groupId`)
    REFERENCES `sharerrand`.`group` (`groupId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;