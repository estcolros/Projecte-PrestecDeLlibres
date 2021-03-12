-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 192.168.0.33    Database: PLlibres
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
-- Table structure for table `Autor`
--

DROP TABLE IF EXISTS `Autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Autor` (
  `cod_autor` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `apellido` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Autor`
--

LOCK TABLES `Autor` WRITE;
/*!40000 ALTER TABLE `Autor` DISABLE KEYS */;
INSERT INTO `Autor` VALUES (1,'Estefania','Colombo'),(2,'Mathias','Debrun'),(3,'Marc','Cuenca'),(4,'Maria','Torres'),(5,'Ruben','Cano');
/*!40000 ALTER TABLE `Autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Editorial`
--

DROP TABLE IF EXISTS `Editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Editorial` (
  `cod_editorial` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_editorial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Editorial`
--

LOCK TABLES `Editorial` WRITE;
/*!40000 ALTER TABLE `Editorial` DISABLE KEYS */;
INSERT INTO `Editorial` VALUES (1,'Planetadelibros'),(2,'Panini Cómics'),(3,'La Galera'),(4,'Neo');
/*!40000 ALTER TABLE `Editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ejemplar`
--

DROP TABLE IF EXISTS `Ejemplar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Ejemplar` (
  `estado` int NOT NULL,
  `cod_ejemplar` int NOT NULL AUTO_INCREMENT,
  `cod_libro` int NOT NULL,
  `cod_prestamo` int NOT NULL,
  `cod_sede` int NOT NULL,
  PRIMARY KEY (`cod_ejemplar`),
  KEY `FK_cod_libro` (`cod_libro`),
  KEY `FK_cod_sede` (`cod_sede`),
  CONSTRAINT `FK_cod_libro` FOREIGN KEY (`cod_libro`) REFERENCES `Libro` (`cod_libro`),
  CONSTRAINT `FK_cod_sede` FOREIGN KEY (`cod_sede`) REFERENCES `SedeEmpresa` (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ejemplar`
--

LOCK TABLES `Ejemplar` WRITE;
/*!40000 ALTER TABLE `Ejemplar` DISABLE KEYS */;
INSERT INTO `Ejemplar` VALUES (8,1,1,2,3),(10,2,2,3,1),(1,3,1,2,4),(5,4,2,2,3),(6,5,3,3,3);
/*!40000 ALTER TABLE `Ejemplar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Idioma`
--

DROP TABLE IF EXISTS `Idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Idioma` (
  `cod_idioma` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_idioma`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Idioma`
--

LOCK TABLES `Idioma` WRITE;
/*!40000 ALTER TABLE `Idioma` DISABLE KEYS */;
INSERT INTO `Idioma` VALUES (1,'Catalan'),(2,'Castellano'),(3,'Inglés'),(4,'Aleman');
/*!40000 ALTER TABLE `Idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Libro`
--

DROP TABLE IF EXISTS `Libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Libro` (
  `cod_libro` int NOT NULL,
  `genero` varchar(250) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `director` varchar(250) NOT NULL,
  `fecha` date NOT NULL,
  `ISBN` int NOT NULL,
  `cod_idioma` int NOT NULL,
  `cod_editorial` int NOT NULL,
  `cod_autor` int NOT NULL,
  PRIMARY KEY (`cod_libro`),
  KEY `FK_cod_idioma` (`cod_idioma`),
  KEY `FK_cod_editorial` (`cod_editorial`),
  KEY `FK_cod_autor` (`cod_autor`),
  CONSTRAINT `FK_cod_autor` FOREIGN KEY (`cod_autor`) REFERENCES `Autor` (`cod_autor`),
  CONSTRAINT `FK_cod_editorial` FOREIGN KEY (`cod_editorial`) REFERENCES `Editorial` (`cod_editorial`),
  CONSTRAINT `FK_cod_idioma` FOREIGN KEY (`cod_idioma`) REFERENCES `Idioma` (`cod_idioma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Libro`
--

LOCK TABLES `Libro` WRITE;
/*!40000 ALTER TABLE `Libro` DISABLE KEYS */;
INSERT INTO `Libro` VALUES (1,'Aventuras','Lazarillo de Tormes','Enrique Lorenzo Diaz','2010-08-24',987654321,2,3,1),(2,'Policiaca','Respirando cerca de mí','Jorge Gómez Soto','2020-01-06',456789123,1,2,3),(3,'Paranormal','The Raven Boys: La profecía del cuervo','Maggie Stiefvater','2019-09-21',147258369,2,1,1),(4,'Ciencia Ficción','Los diamanes de Oberón','Fernando Lalana','2005-05-05',123456789,2,3,1);
/*!40000 ALTER TABLE `Libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Notificacion`
--

DROP TABLE IF EXISTS `Notificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Notificacion` (
  `mensaje` varchar(250) NOT NULL,
  `leido` bit(1) NOT NULL,
  `cod_notificacion` int NOT NULL AUTO_INCREMENT,
  `cod_prestamo` int NOT NULL,
  `cod_trabajador` int NOT NULL,
  PRIMARY KEY (`cod_notificacion`),
  KEY `FK_cod_prestamo` (`cod_prestamo`),
  KEY `FK_cod_trabajador` (`cod_trabajador`),
  CONSTRAINT `FK_cod_prestamo` FOREIGN KEY (`cod_prestamo`) REFERENCES `Prestamo` (`cod_prestamo`),
  CONSTRAINT `FK_cod_trabajador` FOREIGN KEY (`cod_trabajador`) REFERENCES `Trabajador` (`cod_trabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Notificacion`
--

LOCK TABLES `Notificacion` WRITE;
/*!40000 ALTER TABLE `Notificacion` DISABLE KEYS */;
INSERT INTO `Notificacion` VALUES ('Listo para recoger',_binary '',1,1,2),('Listo para entregar',_binary '\0',2,3,2),('Pendiente de recogida',_binary '\0',3,2,2),('Pendiente de entrega',_binary '',4,3,3);
/*!40000 ALTER TABLE `Notificacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Prestamo`
--

DROP TABLE IF EXISTS `Prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Prestamo` (
  `cod_prestamo` int NOT NULL AUTO_INCREMENT,
  `fecha_caducidad` date DEFAULT NULL,
  `fecha_alta` date NOT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `cod_voto` int NOT NULL,
  PRIMARY KEY (`cod_prestamo`),
  KEY `FK_cod_voto` (`cod_voto`),
  CONSTRAINT `FK_cod_voto` FOREIGN KEY (`cod_voto`) REFERENCES `Voto` (`cod_voto`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Prestamo`
--

LOCK TABLES `Prestamo` WRITE;
/*!40000 ALTER TABLE `Prestamo` DISABLE KEYS */;
INSERT INTO `Prestamo` VALUES (1,'2021-01-01','2021-01-01','2021-01-01',1),(2,'2021-01-01','2021-01-02','2021-02-01',2),(3,'2021-01-01','2021-01-03','2021-02-01',3),(4,'2021-01-01','2021-01-04','2021-02-01',4);
/*!40000 ALTER TABLE `Prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SedeEmpresa`
--

DROP TABLE IF EXISTS `SedeEmpresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SedeEmpresa` (
  `cod_sede` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `localidad` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SedeEmpresa`
--

LOCK TABLES `SedeEmpresa` WRITE;
/*!40000 ALTER TABLE `SedeEmpresa` DISABLE KEYS */;
INSERT INTO `SedeEmpresa` VALUES (1,'T-Systems','Reus'),(2,'T-Systems','Londres'),(3,'T-Systems','Troy'),(4,'T-Systems','Vienna'),(5,'T-Systems','Paris');
/*!40000 ALTER TABLE `SedeEmpresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Trabajador`
--

DROP TABLE IF EXISTS `Trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Trabajador` (
  `cod_trabajador` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `apellido1` varchar(250) NOT NULL,
  `apellido2` varchar(250) NOT NULL,
  `telefono` char(9) NOT NULL,
  `correo` varchar(250) NOT NULL,
  `DNI` char(9) NOT NULL,
  `user` char(9) NOT NULL,
  `password` char(9) NOT NULL,
  PRIMARY KEY (`cod_trabajador`),
  UNIQUE KEY `DNI` (`DNI`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Trabajador`
--

LOCK TABLES `Trabajador` WRITE;
/*!40000 ALTER TABLE `Trabajador` DISABLE KEYS */;
INSERT INTO `Trabajador` VALUES (1,'Estefania','Colombo','Rosario','650668915','estefania.c.r@t-systems.com','481615178','estcolros','pass123'),(2,'Cristina','Cano','Porta','633668915','cristinacp@t-systems.com','654615178','cricanpor','pass321'),(3,'Sara','Fernandez','Tomi','656898915','saraft@t-systems.com','498715178','sarfertom','pass456'),(4,'Victor','Fernandez','Lopez','656898123','victorfl@t-systems.com','569715178','vicferlop','pass654'),(5,'David','Torres','Garcia','591398915','davidtg@t-systems.com','498716379','davtorgar','pass789');
/*!40000 ALTER TABLE `Trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Voto`
--

DROP TABLE IF EXISTS `Voto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Voto` (
  `opinion` varchar(250) NOT NULL,
  `calificacion` int NOT NULL,
  `cod_voto` int NOT NULL AUTO_INCREMENT,
  `cod_libro` int NOT NULL,
  `cod_prestamo` int NOT NULL,
  `cod_sede` int NOT NULL,
  `cod_ejemplar` int NOT NULL,
  PRIMARY KEY (`cod_voto`),
  KEY `FK_cod_ejemplar` (`cod_ejemplar`),
  CONSTRAINT `FK_cod_ejemplar` FOREIGN KEY (`cod_ejemplar`) REFERENCES `Ejemplar` (`cod_ejemplar`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Voto`
--

LOCK TABLES `Voto` WRITE;
/*!40000 ALTER TABLE `Voto` DISABLE KEYS */;
INSERT INTO `Voto` VALUES ('Muy interesante',9,1,1,1,1,1),('Muy aburrido',2,2,2,2,2,2),('Entretenido',7,3,1,1,3,3),('Interesante',5,4,2,1,3,1),('Pesimo',0,5,3,2,1,1);
/*!40000 ALTER TABLE `Voto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 12:20:59
