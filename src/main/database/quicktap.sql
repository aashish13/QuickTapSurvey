-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `api_key` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `api_key_UNIQUE` (`api_key` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`surveys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`surveys` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `survey_id` BIGINT(15) NOT NULL,
  `name` VARCHAR(500) NOT NULL,
  `total_responses` BIGINT(15) NOT NULL,
  `last_synch_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`questions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`questions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `surveys_id` INT NOT NULL,
  `question_no` BIGINT(15) NOT NULL,
  `title` VARCHAR(500) NOT NULL,
  INDEX `fk_questions_surveys1_idx` (`surveys_id` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_questions_surveys1`
    FOREIGN KEY (`surveys_id`)
    REFERENCES `mydb`.`surveys` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`responses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`responses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `questions_id` INT NOT NULL,
  `users_id` INT NOT NULL,
  `date_collected` VARCHAR(45) NOT NULL,
  `date_sent` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_responses_questions1_idx` (`questions_id` ASC),
  INDEX `fk_responses_users1_idx` (`users_id` ASC),
  CONSTRAINT `fk_responses_questions1`
    FOREIGN KEY (`questions_id`)
    REFERENCES `mydb`.`questions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_responses_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `mydb`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`response_values`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`response_values` (
  `id` INT NOT NULL,
  `responses_id` INT NOT NULL,
  `value` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_response_values_responses1_idx` (`responses_id` ASC),
  CONSTRAINT `fk_response_values_responses1`
    FOREIGN KEY (`responses_id`)
    REFERENCES `mydb`.`responses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`survey_user_links`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`survey_user_links` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `users_id` INT NOT NULL,
  `surveys_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_survey_user_link_users1_idx` (`users_id` ASC),
  INDEX `fk_survey_user_link_surveys1_idx` (`surveys_id` ASC),
  CONSTRAINT `fk_survey_user_link_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `mydb`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_survey_user_link_surveys1`
    FOREIGN KEY (`surveys_id`)
    REFERENCES `mydb`.`surveys` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
