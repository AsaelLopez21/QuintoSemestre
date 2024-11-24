-- MySQL Script generated by MySQL Workbench
-- Tue Oct 15 09:52:08 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Biblioteca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Biblioteca` DEFAULT CHARACTER SET utf8 ;
USE `Biblioteca` ;

-- -----------------------------------------------------
-- Table `Biblioteca`.`Libros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Libros` (
  `ISBN` INT NOT NULL AUTO_INCREMENT,
  `IDAutor` INT NOT NULL,
  `Titulo` VARCHAR(20) NOT NULL,
  `IDEjemplar` VARCHAR(15) NOT NULL,
  `Libroscol` VARCHAR(15) NOT NULL,
  `IDEditorial` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`ISBN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Persona` (
  `IDPersona` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(15) NOT NULL,
  `AellidoPaterno` VARCHAR(15) NOT NULL,
  `ApellidoMaterno` VARCHAR(15) NOT NULL,
  `Tipo` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`IDPersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Autor` (
  `IDPersona` INT NOT NULL,
  `IDAutor` INT NOT NULL,
  PRIMARY KEY (`IDPersona`, `IDAutor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Socio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Socio` (
  `IDSocio` INT NOT NULL AUTO_INCREMENT,
  `IDPersona` INT NOT NULL,
  `CURP` VARCHAR(18) NOT NULL,
  `IDDireccion` VARCHAR(20) NOT NULL,
  `Telefono` VARCHAR(12) NULL,
  `Genero` VARCHAR(10) NULL,
  PRIMARY KEY (`IDSocio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Editorial`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Editorial` (
  `IDEditorial` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(15) NOT NULL,
  `Detalle` VARCHAR(25) NULL,
  PRIMARY KEY (`IDEditorial`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Ejemplar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Ejemplar` (
  `IDEjemplar` INT NOT NULL AUTO_INCREMENT,
  `IDLibro` INT NOT NULL,
  `Numero` INT NOT NULL,
  `Observacion` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`IDEjemplar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Prestamo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Prestamo` (
  `IDPrestamo` INT NOT NULL,
  `FechaPrestamo` VARCHAR(10) NOT NULL,
  `FechaDevolucion` VARCHAR(10) NOT NULL,
  `ISBN` INT NOT NULL,
  `IDSocio` INT NOT NULL,
  PRIMARY KEY (`IDPrestamo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Libro.Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Libro.Autor` (
  `ISBN` INT NOT NULL,
  `IDAutor` INT NOT NULL,
  PRIMARY KEY (`ISBN`, `IDAutor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Biblioteca`.`Direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Biblioteca`.`Direccion` (
  `IDDireccion` INT NOT NULL AUTO_INCREMENT,
  `Calle` VARCHAR(20) NULL,
  `Numero` INT NULL,
  `Colonia` VARCHAR(20) NULL,
  `Municipio` VARCHAR(20) NULL,
  `Estado` VARCHAR(15) NULL,
  `CP` INT NULL,
  PRIMARY KEY (`IDDireccion`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
