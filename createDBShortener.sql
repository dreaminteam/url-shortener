SET FOREIGN_KEY_CHECKS = 0;

CREATE SCHEMA IF NOT EXISTS `shortener` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `shortener` ;


CREATE TABLE IF NOT EXISTS `shortener`.`user` (
  `user_id` long NOT NULL AUTO_INCREMENT COMMENT '',
  `login` VARCHAR(20) NOT NULL ,
  `password` VARCHAR(40) NOT NULL ,
  `email` VARCHAR(60) NOT NULL ,
  PRIMARY KEY (`user_id`)  COMMENT '',
  UNIQUE INDEX `login_UNIQUE` (`login` ASC)  ,
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC)  )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `shortener`.`tag` (
  `tag_id` long NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`tag_id`)  ,
  UNIQUE INDEX `title_UNIQUE` (`title` ASC)  ,
  UNIQUE INDEX `tag_id_UNIQUE` (`tag_id` ASC)  )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `shortener`.`link` (
  `link_id` VARCHAR(10) NOT NULL AUTO_INCREMENT ,
  `source_url` VARCHAR(1000) NOT NULL ,
  `description` VARCHAR(10000) NULL ,
  `click_count` VARCHAR(10000) NULL ,
  PRIMARY KEY (`link_id`)  ,
  UNIQUE INDEX `link_id_UNIQUE` (`link_id` ASC)  )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `shortener`.`tag_link` (
  `link_id` VARCHAR(10) NOT NULL,
  `tag_id` long NOT NULL,
  PRIMARY KEY (`link_id,tag_id`),
  FOREIGN KEY (link_id) REFERENCES link (link_id),
  FOREIGN KEY (tag_id) REFERENCES tag (tag_id)
ENGINE = InnoDB;


SET FOREIGN_KEY_CHECKS = 1;
