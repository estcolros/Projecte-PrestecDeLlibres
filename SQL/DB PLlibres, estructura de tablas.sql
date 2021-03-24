-- SHOW CREATE TABLE notificacion; (busca tabla y devuelve código)
CREATE DATABASE PLlibres;
USE  PLlibres;

CREATE TABLE `autor` (
  `cod_autor` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `apellido` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `editorial` (
  `cod_editorial` int NOT NULL,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_editorial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `idioma` (
  `cod_idioma` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_idioma`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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

CREATE TABLE `sedeempresa` (
  `cod_sede` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `localidad` varchar(250) NOT NULL,
  PRIMARY KEY (`cod_sede`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
  `trabajador_recibe` int default null,
  PRIMARY KEY (`cod_trabajador`),
  UNIQUE KEY `DNI` (`DNI`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `ejemplar` (
  `estado` int NOT NULL,
  `cod_ejemplar` int NOT NULL AUTO_INCREMENT,
  `cod_libro` int NOT NULL,
  `cod_voto` int NOT NULL,
  `trabajador_recibe` int default NULL,
  `cod_sede` int NOT NULL,
  `trabajador_presta` int NOT NULL,
  PRIMARY KEY (`cod_ejemplar`),
  KEY `FK_cod_libro` (`cod_libro`),
  KEY `fk_ejemplar_sedeempresa1_idx` (`cod_sede`),
  KEY `fk_ejemplar_trabajador1_idx` (`trabajador_presta`),
  CONSTRAINT `FK_cod_libro` FOREIGN KEY (`cod_libro`) REFERENCES `libro` (`cod_libro`),
  CONSTRAINT `fk_ejemplar_sedeempresa1` FOREIGN KEY (`cod_sede`) REFERENCES `sedeempresa` (`cod_sede`),
  CONSTRAINT `fk_ejemplar_trabajador1` FOREIGN KEY (`trabajador_presta`) REFERENCES `trabajador` (`cod_trabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `prestamo` (
  `cod_prestamo` int NOT NULL AUTO_INCREMENT,
  `fecha_caducidad` date DEFAULT NULL,
  `fecha_alta` date NOT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `cod_voto` int NOT NULL,
  `cod_ejemplar` int NOT NULL,
  `trabajador_recibe` int default NULL,
  PRIMARY KEY (`cod_prestamo`),
  KEY `fk_prestamo_ejemplar1_idx` (`cod_ejemplar`),
  KEY `fk_prestamo_trabajador1_idx` (`trabajador_recibe`),
  KEY `fk_prestamo_voto_idx` (`cod_voto`),
  CONSTRAINT `fk_prestamo_ejemplar1` FOREIGN KEY (`cod_ejemplar`) REFERENCES `ejemplar` (`cod_ejemplar`),
  CONSTRAINT `fk_prestamo_trabajador1` FOREIGN KEY (`trabajador_recibe`) REFERENCES `trabajador` (`cod_trabajador`),
  CONSTRAINT `fk_prestamo_voto` FOREIGN KEY (`cod_voto`) REFERENCES `voto` (`cod_voto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `notificacion` (
  `mensaje` varchar(250) NOT NULL,
  `leido` bit(1) NOT NULL,
  `cod_notificacion` int NOT NULL AUTO_INCREMENT,
  `cod_prestamo` int NOT NULL,
  `cod_trabajador` int NOT NULL,
  `trabajador_recibe` int default NULL,
  PRIMARY KEY (`cod_notificacion`),
  KEY `fk_notificacion_trabajador1_idx` (`trabajador_recibe`),
  KEY `fk_notificacion_prestamo1_idx` (`cod_prestamo`),
  CONSTRAINT `fk_notificacion_prestamo1` FOREIGN KEY (`cod_prestamo`) REFERENCES `prestamo` (`cod_prestamo`),
  CONSTRAINT `fk_notificacion_trabajador1` FOREIGN KEY (`trabajador_recibe`) REFERENCES `trabajador` (`cod_trabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

