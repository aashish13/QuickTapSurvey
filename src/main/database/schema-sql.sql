-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema quicktap
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema quicktap
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `quicktap` DEFAULT CHARACTER SET utf8 ;
USE `quicktap` ;

-- -----------------------------------------------------
-- Table `quicktap`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `api_key` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `api_key_UNIQUE` (`api_key` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`surveys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`surveys` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `survey_id` BIGINT(15) NOT NULL,
  `name` VARCHAR(500) NOT NULL,
  `total_responses` BIGINT(15) NOT NULL,
  `last_synch_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`questions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`questions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `surveys_id` INT NOT NULL,
  `question_no` BIGINT(15) NOT NULL,
  `title` VARCHAR(500) NOT NULL,
  INDEX `fk_questions_surveys1_idx` (`surveys_id` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_questions_surveys1`
    FOREIGN KEY (`surveys_id`)
    REFERENCES `quicktap`.`surveys` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`responses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`responses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date_collected` VARCHAR(45) NOT NULL,
  `date_sent` VARCHAR(45) NOT NULL,
  `surveys_id` INT NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `latitude` FLOAT(10,6) NULL,
  `longitude` FLOAT(10,6) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_responses_surveys1_idx` (`surveys_id` ASC),
  CONSTRAINT `fk_responses_surveys1`
    FOREIGN KEY (`surveys_id`)
    REFERENCES `quicktap`.`surveys` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `quicktap`.`response_values`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`response_values` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `responses_id` INT NOT NULL,
  `value` VARCHAR(500) NULL,
  `questions_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_response_values_responses1_idx` (`responses_id` ASC),
  INDEX `fk_response_values_questions1_idx` (`questions_id` ASC),
  CONSTRAINT `fk_response_values_responses1`
    FOREIGN KEY (`responses_id`)
    REFERENCES `quicktap`.`responses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_response_values_questions1`
    FOREIGN KEY (`questions_id`)
    REFERENCES `quicktap`.`questions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`survey_user_links`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`survey_user_links` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `users_id` INT NOT NULL,
  `surveys_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_survey_user_link_users1_idx` (`users_id` ASC),
  INDEX `fk_survey_user_link_surveys1_idx` (`surveys_id` ASC),
  CONSTRAINT `fk_survey_user_link_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `quicktap`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_survey_user_link_surveys1`
    FOREIGN KEY (`surveys_id`)
    REFERENCES `quicktap`.`surveys` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `quicktap`.`charts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`charts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`question_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`question_types` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `quicktap`.`charts_questions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `quicktap`.`charts_questions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `charts_id` INT NOT NULL,
  `questions_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_charts_questions_charts1_idx` (`charts_id` ASC),
  INDEX `fk_charts_questions_questions1_idx` (`questions_id` ASC),
  CONSTRAINT `fk_charts_questions_charts1`
    FOREIGN KEY (`charts_id`)
    REFERENCES `quicktap`.`charts` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_charts_questions_questions1`
    FOREIGN KEY (`questions_id`)
    REFERENCES `quicktap`.`question_types` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



insert into users(username,password,api_key)
values('aashish','Quicktap123','LYQUPGV1L09BT488LHKDRLYQ7ZGJNU06');

insert into question_types(type)
values
('Canadian Postal Code'),
('Currency Amount'),
('Date Picker'),
('Email Address'),
('Gender(Male/Female)'),
('Image Display(Splash Screen)'),
('List Picker'),
('Map Point'),
('Matrix - Likert Scale'),
('MCQ - Image Many Answer')
;
INSERT INTO `charts` (`name`) VALUES ('PieChart');
INSERT INTO `charts` (`name`) VALUES ('BarChart');
INSERT INTO `charts` (`name`) VALUES ('Linechart');
insert into charts(name)
values('ColumnChart'),('AreaChart'),('SteppedAreaChart'),('ComboChart '),('Histogram');
-- adding linking for gender
insert into charts_questions(charts_id,questions_id)
values(1,5);
insert into charts_questions(charts_id,questions_id)
values(2,5);
insert into charts_questions(charts_id,questions_id)
values(3,5);
insert into charts_questions(charts_id,questions_id)
values(4,5);
insert into charts_questions(charts_id,questions_id)
values(5,5);
insert into charts_questions(charts_id,questions_id)
values(6,5);
insert into charts_questions(charts_id,questions_id)
values(7,5);
insert into charts_questions(charts_id,questions_id)
values(8,5);
-- Adding linking for List Picker
insert into charts_questions(charts_id,questions_id)
values(1,7);
insert into charts_questions(charts_id,questions_id)
values(2,7);
insert into charts_questions(charts_id,questions_id)
values(3,7);
insert into charts_questions(charts_id,questions_id)
values(4,7);
insert into charts_questions(charts_id,questions_id)
values(5,7);
insert into charts_questions(charts_id,questions_id)
values(6,7);
insert into charts_questions(charts_id,questions_id)
values(7,7);
insert into charts_questions(charts_id,questions_id)
values(8,7);
-- MCQ Single Answer
insert into charts_questions(charts_id,questions_id)
values(1,14);
insert into charts_questions(charts_id,questions_id)
values(2,14);
insert into charts_questions(charts_id,questions_id)
values(3,14);
insert into charts_questions(charts_id,questions_id)
values(4,14);
insert into charts_questions(charts_id,questions_id)
values(5,14);
insert into charts_questions(charts_id,questions_id)
values(6,14);
insert into charts_questions(charts_id,questions_id)
values(7,14);
insert into charts_questions(charts_id,questions_id)
values(8,14);

INSERT INTO `charts` (`name`) VALUES ('GeoChart');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;