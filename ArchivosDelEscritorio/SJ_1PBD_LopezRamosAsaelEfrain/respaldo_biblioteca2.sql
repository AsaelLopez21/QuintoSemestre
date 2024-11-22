-- MySQL dump 10.13  Distrib 8.0.37, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id_autor` int NOT NULL AUTO_INCREMENT,
  `id_persona` int NOT NULL,
  PRIMARY KEY (`id_autor`,`id_persona`),
  KEY `id_persona` (`id_persona`),
  CONSTRAINT `autor_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,13),(2,14),(3,15),(4,16),(5,17);
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria_libros`
--

DROP TABLE IF EXISTS `categoria_libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria_libros` (
  `id_categoria` int NOT NULL,
  `id_libro` int NOT NULL,
  PRIMARY KEY (`id_categoria`,`id_libro`),
  KEY `id_libro` (`id_libro`),
  CONSTRAINT `categoria_libros_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`) ON DELETE CASCADE,
  CONSTRAINT `categoria_libros_ibfk_2` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria_libros`
--

LOCK TABLES `categoria_libros` WRITE;
/*!40000 ALTER TABLE `categoria_libros` DISABLE KEYS */;
INSERT INTO `categoria_libros` VALUES (1,1),(2,3),(3,4),(4,5);
/*!40000 ALTER TABLE `categoria_libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Ficción'),(2,'No Ficción'),(3,'Ciencia Ficción'),(4,'Literatura Infantil'),(5,'Biografía');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direccion` (
  `id_direccion` int NOT NULL AUTO_INCREMENT,
  `calle` varchar(30) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `colonia` varchar(20) DEFAULT NULL,
  `municipio` varchar(25) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `codigo_postal` varchar(10) NOT NULL,
  PRIMARY KEY (`id_direccion`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,'Reforma','S/N','','Los Ocotes Ejutla','Oaxaca','71502'),(2,'Benito Juarez','5','Pedregal','Ocotlan de Morelos','Oaxaca','71510'),(3,'Independencia','65','La Soledad','Ocotlan de Morelos','Oaxaca','71510'),(4,'','52','Las campanas','San Antonino','Oaxaca','71262'),(5,'Zaragoza','5','Lomas','Ocotlan de Morelos','Oaxaca','71502'),(6,'El arroyo','87','La Noria','Ocotlan de Morelos','Oaxaca','71502'),(7,'Miguel Hidalgo','14','Arboleda','San Bartolo','Oaxaca','71230'),(8,'5 de Mayo','3','El Paso','San Pedro','Oaxaca','71231'),(9,'Niños Heroes','31','La Natividad','Juxtlahuaca','Oaxaca','69400'),(10,'Cristobal Colon','77','Zona Centro','Juxtlahuaca','Oaxaca','69400'),(11,'Revolucion','22','El Arenal','Juxtlahuaca','Oaxaca','69400'),(12,'Insurgentes','29','Las Flores','Juxtlahuaca','Oaxaca','69400');
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `id_editorial` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `detalle` varchar(50) NOT NULL,
  PRIMARY KEY (`id_editorial`),
  UNIQUE KEY `detalle` (`detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (1,'Editorial Planeta','Publicación de libros de ficción y no ficción'),(2,'Editorial Santillana','Libros educativos y de literatura infantil'),(3,'Editorial Alfaguara','Literatura contemporánea y clásica'),(4,'Editorial Anagrama','Ficción literaria y ensayo'),(5,'Editorial Random House','Diversidad de géneros literarios');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ejemplar`
--

DROP TABLE IF EXISTS `ejemplar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ejemplar` (
  `id_ejemplar` int NOT NULL AUTO_INCREMENT,
  `id_libro` int NOT NULL,
  `id_estado` int NOT NULL,
  `ubicacion_fisica` varchar(40) NOT NULL,
  `fecha_adquisicion` datetime NOT NULL,
  `condicion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_ejemplar`,`id_libro`,`id_estado`),
  KEY `id_libro` (`id_libro`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `ejemplar_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`),
  CONSTRAINT `ejemplar_ibfk_2` FOREIGN KEY (`id_estado`) REFERENCES `estado_libro` (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ejemplar`
--

LOCK TABLES `ejemplar` WRITE;
/*!40000 ALTER TABLE `ejemplar` DISABLE KEYS */;
INSERT INTO `ejemplar` VALUES (1,1,1,'Estante 3','2024-01-15 10:00:00','Nuevo'),(2,1,2,'Estante 4','2024-01-15 10:00:00','Dañado'),(3,2,1,'Estante 2','2024-01-16 11:00:00','Usado'),(4,3,2,'Estante 1','2024-01-17 12:00:00','Dañado'),(5,4,1,'Estante 5','2024-01-18 13:00:00','Nuevo'),(6,5,1,'Estante 4','2024-01-19 14:00:00','Usado');
/*!40000 ALTER TABLE `ejemplar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_libro`
--

DROP TABLE IF EXISTS `estado_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_libro` (
  `id_estado` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_libro`
--

LOCK TABLES `estado_libro` WRITE;
/*!40000 ALTER TABLE `estado_libro` DISABLE KEYS */;
INSERT INTO `estado_libro` VALUES (1,'Disponible'),(2,'Prestado'),(3,'Reservado');
/*!40000 ALTER TABLE `estado_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro_autor`
--

DROP TABLE IF EXISTS `libro_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro_autor` (
  `id_libro` int NOT NULL,
  `id_autor` int NOT NULL,
  PRIMARY KEY (`id_libro`,`id_autor`),
  KEY `id_autor` (`id_autor`),
  CONSTRAINT `libro_autor_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`),
  CONSTRAINT `libro_autor_ibfk_2` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro_autor`
--

LOCK TABLES `libro_autor` WRITE;
/*!40000 ALTER TABLE `libro_autor` DISABLE KEYS */;
INSERT INTO `libro_autor` VALUES (1,1),(2,1),(3,2),(4,2),(5,3),(6,3),(8,4),(9,5);
/*!40000 ALTER TABLE `libro_autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `id_libro` int NOT NULL AUTO_INCREMENT,
  `id_autor` int NOT NULL,
  `id_editorial` int NOT NULL,
  `id_estado` int NOT NULL,
  `titulo` varchar(50) DEFAULT NULL,
  `isbn` varchar(13) NOT NULL,
  `id_categoria` int NOT NULL,
  PRIMARY KEY (`id_libro`,`id_autor`,`id_editorial`,`id_categoria`),
  UNIQUE KEY `isbn` (`isbn`),
  KEY `id_autor` (`id_autor`),
  KEY `id_editorial` (`id_editorial`),
  KEY `id_estado` (`id_estado`),
  KEY `id_categoria` (`id_categoria`),
  CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`) ON DELETE CASCADE,
  CONSTRAINT `libros_ibfk_2` FOREIGN KEY (`id_editorial`) REFERENCES `editorial` (`id_editorial`),
  CONSTRAINT `libros_ibfk_3` FOREIGN KEY (`id_estado`) REFERENCES `estado_libro` (`id_estado`),
  CONSTRAINT `libros_ibfk_4` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (1,1,1,2,'Don Quijote de la Mancha','9788491052029',1),(2,1,1,1,'La vida de Lazarillo de Tormes','9788491052036',2),(3,2,2,1,'Insurgent','9780062024039',2),(4,3,3,1,'Los Juegos del Hambre','9780439023528',3),(5,3,3,1,'En llamas','9780439023511',3),(6,4,4,1,'Harry Potter y la piedra filosofal','9780439708180',1),(7,4,4,1,'Harry Potter y la cámara secreta','9780439064873',1),(8,5,5,1,'Cuentos de la Abuela Amelia','9788498381567',4),(9,5,5,1,'El viaje de las estrellas','9788498381574',1);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros_ejemplares`
--

DROP TABLE IF EXISTS `libros_ejemplares`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros_ejemplares` (
  `id_libro_ejemplar` int NOT NULL AUTO_INCREMENT,
  `id_libro` int NOT NULL,
  `id_ejemplar` int NOT NULL,
  PRIMARY KEY (`id_libro_ejemplar`),
  KEY `id_libro` (`id_libro`),
  KEY `id_ejemplar` (`id_ejemplar`),
  CONSTRAINT `libros_ejemplares_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`) ON DELETE CASCADE,
  CONSTRAINT `libros_ejemplares_ibfk_2` FOREIGN KEY (`id_ejemplar`) REFERENCES `ejemplar` (`id_libro`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros_ejemplares`
--

LOCK TABLES `libros_ejemplares` WRITE;
/*!40000 ALTER TABLE `libros_ejemplares` DISABLE KEYS */;
INSERT INTO `libros_ejemplares` VALUES (1,1,1),(2,2,2),(3,3,3);
/*!40000 ALTER TABLE `libros_ejemplares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido_paterno` varchar(20) NOT NULL,
  `apellido_materno` varchar(20) NOT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Asael Efrain','Lopez','Ramos','Estudiante'),(2,'Luis Angel','Diaz','Diaz','Estudiante'),(3,'Omar David','Garcia','Ventura','Estudiante'),(4,'Rolando Abimael','Chompa','Guzman','Estudiante'),(5,'Bryan Dwayne','Salinas','Pacheco','Estudiante'),(6,'Alex Emmanuel','Mendez','Ruiz','Estudiante'),(7,'Maria','Juarez','Matias','Estudiante'),(8,'Melissa','Pacheco','Hernandez','Estudiante'),(9,'Karen Celeste','Coronel','Alvarado','Estudiante'),(10,'Alan','Martinez','Herrera','Estudiante'),(11,'Arturo','Peral','Lopez','Estudiante'),(12,'Eliel','Perez','Cordero','Estudiante'),(13,'Miguel','de Cervantes','Saavedra','Autor'),(14,'Veronica','Roth','','Autor'),(15,'Suzanne','Collins','','Autor'),(16,'J.K.','Rowling','','Autor'),(17,'Javier','Ruescas','','Autor');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `id_prestamo` int NOT NULL AUTO_INCREMENT,
  `id_libro` int NOT NULL,
  `id_socio` int NOT NULL,
  `fecha_prestamo` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_devolucion` datetime DEFAULT NULL,
  PRIMARY KEY (`id_prestamo`,`id_libro`,`id_socio`),
  KEY `id_libro` (`id_libro`),
  KEY `id_socio` (`id_socio`),
  CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`),
  CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`id_socio`) REFERENCES `socio` (`id_socio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (1,1,1,'2024-10-30 16:43:21',NULL),(2,2,1,'2024-10-30 16:43:21',NULL),(3,1,3,'2024-10-30 16:43:21',NULL);
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `id_reserva` int NOT NULL AUTO_INCREMENT,
  `id_socio` int NOT NULL,
  `id_libro` int NOT NULL,
  `fecha_reserva` datetime DEFAULT NULL,
  `fecha_expiracion_reserva` datetime DEFAULT NULL,
  `estado_reserva` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_reserva`,`id_libro`,`id_socio`),
  KEY `id_libro` (`id_libro`),
  KEY `id_socio` (`id_socio`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`) ON DELETE CASCADE,
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`id_socio`) REFERENCES `socio` (`id_socio`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socio`
--

DROP TABLE IF EXISTS `socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socio` (
  `id_socio` int NOT NULL AUTO_INCREMENT,
  `id_persona` int NOT NULL,
  `id_direccion` int NOT NULL,
  `curp` varchar(18) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `genero` varchar(15) NOT NULL,
  PRIMARY KEY (`id_socio`,`id_persona`,`id_direccion`),
  UNIQUE KEY `curp` (`curp`),
  UNIQUE KEY `telefono` (`telefono`),
  KEY `id_persona` (`id_persona`),
  KEY `id_direccion` (`id_direccion`),
  CONSTRAINT `socio_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`),
  CONSTRAINT `socio_ibfk_2` FOREIGN KEY (`id_direccion`) REFERENCES `direccion` (`id_direccion`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socio`
--

LOCK TABLES `socio` WRITE;
/*!40000 ALTER TABLE `socio` DISABLE KEYS */;
INSERT INTO `socio` VALUES (1,1,1,'LOPE010203HDFLRS05','5556789012','Masculino'),(2,2,2,'DIAZ020304HDFLRS06','5557890123','Masculino'),(3,3,3,'GARC030405HDFLRS07','5558901234','Masculino'),(4,4,4,'CHOA040506HDFLRS08','5559012345','Masculino'),(5,5,5,'SALI050607HDFLRS09','5550123456','Masculino'),(6,6,6,'MENR060708HDFLRS10','5551234568','Masculino'),(7,7,7,'JUAR070809HDFLRS11','5552345679','Femenino'),(8,8,8,'PACH080910HDFLRS12','5553456780','Femenino'),(9,9,9,'CORO091011HDFLRS13','5554567891','Femenino'),(10,10,10,'MART101112HDFLRS14','5555678902','Masculino'),(11,11,11,'PERA111213HDFLRS15','5556789013','Masculino'),(12,12,12,'PECA060708HDFLRS10','5556789014','Masculino');
/*!40000 ALTER TABLE `socio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-30 16:51:19
