-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 192.168.0.21    Database: PLlibres
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
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
  `cod_autor` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `apellido` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Enrique','Lorenzo'),(2,'Jorge','Gómez'),(3,'Maggie','Stiefvater'),(4,'Fernando','Lalana'),(5,'Estefania','Colombo');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `cod_editorial` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_editorial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (1,'Planetadelibros'),(2,'Panini Cómics'),(3,'La Galera'),(4,'Neo');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ejemplar`
--

DROP TABLE IF EXISTS `ejemplar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ejemplar` (
  `estado` int NOT NULL,
  `cod_ejemplar` int NOT NULL AUTO_INCREMENT,
  `cod_libro` int NOT NULL,
  `cod_voto` int NOT NULL,
  `trabajador_recibe` int DEFAULT NULL,
  `cod_sede` int NOT NULL,
  `trabajador_presta` int NOT NULL,
  PRIMARY KEY (`cod_ejemplar`),
  KEY `FK_cod_libro` (`cod_libro`),
  KEY `fk_ejemplar_sedeempresa1_idx` (`cod_sede`),
  KEY `fk_ejemplar_trabajador1_idx` (`trabajador_presta`),
  CONSTRAINT `FK_cod_libro` FOREIGN KEY (`cod_libro`) REFERENCES `libro` (`cod_libro`),
  CONSTRAINT `fk_ejemplar_sedeempresa1` FOREIGN KEY (`cod_sede`) REFERENCES `sedeempresa` (`cod_sede`),
  CONSTRAINT `fk_ejemplar_trabajador1` FOREIGN KEY (`trabajador_presta`) REFERENCES `trabajador` (`cod_trabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ejemplar`
--

LOCK TABLES `ejemplar` WRITE;
/*!40000 ALTER TABLE `ejemplar` DISABLE KEYS */;
INSERT INTO `ejemplar` VALUES (10,1,2,1,2,1,1),(10,2,1,1,2,2,2),(10,3,3,1,2,2,3),(10,4,4,1,2,3,4),(10,5,2,1,NULL,1,1);
/*!40000 ALTER TABLE `ejemplar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma`
--

DROP TABLE IF EXISTS `idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idioma` (
  `cod_idioma` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_idioma`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma`
--

LOCK TABLES `idioma` WRITE;
/*!40000 ALTER TABLE `idioma` DISABLE KEYS */;
INSERT INTO `idioma` VALUES (1,'Catalan'),(2,'Castellano'),(3,'Inglés'),(4,'Aleman');
/*!40000 ALTER TABLE `idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `cod_libro` int NOT NULL,
  `genero` varchar(250) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `fecha` date NOT NULL,
  `ISBN` int NOT NULL,
  `cod_idioma` int NOT NULL,
  `cod_editorial` int NOT NULL,
  `cod_autor` int NOT NULL,
  PRIMARY KEY (`cod_libro`),
  KEY `FK_cod_idioma` (`cod_idioma`),
  KEY `FK_cod_editorial` (`cod_editorial`),
  KEY `FK_cod_autor` (`cod_autor`),
  CONSTRAINT `FK_cod_autor` FOREIGN KEY (`cod_autor`) REFERENCES `autor` (`cod_autor`),
  CONSTRAINT `FK_cod_editorial` FOREIGN KEY (`cod_editorial`) REFERENCES `editorial` (`cod_editorial`),
  CONSTRAINT `FK_cod_idioma` FOREIGN KEY (`cod_idioma`) REFERENCES `idioma` (`cod_idioma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'Aventuras','Lazarillo de Tormes','2010-08-24',987654321,1,1,1),(2,'Policiaca','Respirando cerca de mí','2020-01-06',456789123,1,2,3),(3,'Paranormal','The Raven Boys: La profecía del cuervo','2019-09-21',147258369,2,1,1),(4,'Ciencia Ficción','Los diamanes de Oberón','2005-05-05',123456789,2,3,1);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notificacion`
--

DROP TABLE IF EXISTS `notificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notificacion` (
  `mensaje` varchar(250) NOT NULL,
  `leido` bit(1) NOT NULL,
  `cod_notificacion` int NOT NULL AUTO_INCREMENT,
  `cod_prestamo` int NOT NULL,
  `cod_trabajador` int NOT NULL,
  `trabajador_recibe` int DEFAULT NULL,
  PRIMARY KEY (`cod_notificacion`),
  KEY `fk_notificacion_trabajador1_idx` (`trabajador_recibe`),
  KEY `fk_notificacion_prestamo1_idx` (`cod_prestamo`),
  CONSTRAINT `fk_notificacion_prestamo1` FOREIGN KEY (`cod_prestamo`) REFERENCES `prestamo` (`cod_prestamo`),
  CONSTRAINT `fk_notificacion_trabajador1` FOREIGN KEY (`trabajador_recibe`) REFERENCES `trabajador` (`cod_trabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notificacion`
--

LOCK TABLES `notificacion` WRITE;
/*!40000 ALTER TABLE `notificacion` DISABLE KEYS */;
INSERT INTO `notificacion` VALUES ('Listo para recoger',_binary '',1,1,1,1),('Listo para entregar',_binary '\0',2,1,1,1),('Pendiente de recogida',_binary '\0',3,1,1,1),('Pendiente de entrega',_binary '',4,1,1,1),('Pendiente de entrega',_binary '',5,1,1,NULL);
/*!40000 ALTER TABLE `notificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `cod_prestamo` int NOT NULL AUTO_INCREMENT,
  `fecha_caducidad` date DEFAULT NULL,
  `fecha_alta` date NOT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `cod_voto` int NOT NULL,
  `cod_ejemplar` int NOT NULL,
  `trabajador_recibe` int DEFAULT NULL,
  PRIMARY KEY (`cod_prestamo`),
  KEY `fk_prestamo_ejemplar1_idx` (`cod_ejemplar`),
  KEY `fk_prestamo_trabajador1_idx` (`trabajador_recibe`),
  KEY `fk_prestamo_voto_idx` (`cod_voto`),
  CONSTRAINT `fk_prestamo_ejemplar1` FOREIGN KEY (`cod_ejemplar`) REFERENCES `ejemplar` (`cod_ejemplar`),
  CONSTRAINT `fk_prestamo_trabajador1` FOREIGN KEY (`trabajador_recibe`) REFERENCES `trabajador` (`cod_trabajador`),
  CONSTRAINT `fk_prestamo_voto` FOREIGN KEY (`cod_voto`) REFERENCES `voto` (`cod_voto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (1,'2021-01-01','2021-01-01','2021-01-01',1,1,1),(2,'2021-01-01','2021-01-02','2021-02-01',2,1,2),(3,'2021-01-01','2021-01-03','2021-02-01',3,1,3),(4,'2021-01-01','2021-01-04','2021-02-01',4,1,4),(5,'2021-01-01','2021-01-04','2021-02-01',4,1,NULL);
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sedeempresa`
--

DROP TABLE IF EXISTS `sedeempresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sedeempresa` (
  `cod_sede` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `localidad` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sedeempresa`
--

LOCK TABLES `sedeempresa` WRITE;
/*!40000 ALTER TABLE `sedeempresa` DISABLE KEYS */;
INSERT INTO `sedeempresa` VALUES (1,'T-Systems','Reus'),(2,'T-Systems','Londres'),(3,'T-Systems','Troy'),(4,'T-Systems','Vienna'),(5,'T-Systems','Paris');
/*!40000 ALTER TABLE `sedeempresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajador` (
  `cod_trabajador` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `apellido1` varchar(250) NOT NULL,
  `apellido2` varchar(250) NOT NULL,
  `telefono` char(9) NOT NULL,
  `correo` varchar(250) NOT NULL,
  `DNI` char(9) NOT NULL,
  `user` char(9) NOT NULL,
  `password` char(9) NOT NULL,
  `trabajador_recibe` int DEFAULT NULL,
  PRIMARY KEY (`cod_trabajador`),
  UNIQUE KEY `DNI` (`DNI`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajador`
--

LOCK TABLES `trabajador` WRITE;
/*!40000 ALTER TABLE `trabajador` DISABLE KEYS */;
INSERT INTO `trabajador` VALUES (1,'Estefania','Colombo','Rosario','650668915','estefania.c.r@t-systems.com','481615178','estcolros','pass123',1),(2,'Cristina','Cano','Porta','633668915','cristinacp@t-systems.com','654615178','cricanpor','pass321',2),(3,'Sara','Fernandez','Tomi','656898915','saraft@t-systems.com','498715178','sarfertom','pass456',3),(4,'Victor','Fernandez','Lopez','656898123','victorfl@t-systems.com','569715178','vicferlop','pass654',1),(5,'David','Torres','Garcia','591398915','davidtg@t-systems.com','498716379','davtorgar','pass789',1),(6,'Pepe','Torres','Garcia','981398915','pepetg@t-systems.com','498896379','ptorgar','pass777',NULL);
/*!40000 ALTER TABLE `trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voto`
--

DROP TABLE IF EXISTS `voto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voto` (
  `opinion` varchar(250) NOT NULL,
  `calificacion` int NOT NULL,
  `cod_voto` int NOT NULL AUTO_INCREMENT,
  `cod_prestamo` int NOT NULL,
  `cod_sede` int NOT NULL,
  `cod_ejemplar` int NOT NULL,
  PRIMARY KEY (`cod_voto`),
  KEY `fk_voto_ejemplar1_idx` (`cod_ejemplar`),
  CONSTRAINT `fk_voto_ejemplar1` FOREIGN KEY (`cod_ejemplar`) REFERENCES `ejemplar` (`cod_ejemplar`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voto`
--

LOCK TABLES `voto` WRITE;
/*!40000 ALTER TABLE `voto` DISABLE KEYS */;
INSERT INTO `voto` VALUES ('Muy interesante',9,1,1,2,2),('Muy aburrido',2,2,1,2,1),('Muy aburrido',2,3,1,2,2),('Interesante',5,4,2,3,1),('Pesimo',0,6,5,3,1);
/*!40000 ALTER TABLE `voto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-24 12:58:58