CREATE DATABASE PLlibres;
USE PLlibres;

CREATE TABLE Editorial (
	cod_editorial INT NOT NULL,
	nombre VARCHAR(250) NOT NULL,
	PRIMARY KEY (cod_editorial)
)ENGINE=InnoDB;

CREATE TABLE Autor (
	cod_autor INT NOT NULL,
	nombre VARCHAR(250) NOT NULL,
	apellido VARCHAR(250) NOT NULL,
	PRIMARY KEY (cod_autor)
)ENGINE=InnoDB;

CREATE TABLE Idioma (
	cod_idioma INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(250) NOT NULL,
	PRIMARY KEY (cod_idioma)
)ENGINE=InnoDB;

CREATE TABLE Libro (
	cod_libro INT  NOT NULL,
	genero VARCHAR(250) NOT NULL,
	titulo VARCHAR(250) NOT NULL,
	director VARCHAR(250) NOT NULL,
    fecha DATE NOT NULL,
    ISBN INT NOT NULL,
    cod_idioma INT NOT NULL, 
    cod_editorial INT NOT NULL,
    cod_autor INT NOT NULL,
	PRIMARY KEY (cod_libro),
    CONSTRAINT FK_cod_idioma FOREIGN KEY (cod_idioma) REFERENCES Idioma(cod_idioma),
    CONSTRAINT FK_cod_editorial FOREIGN KEY (cod_editorial) REFERENCES Editorial(cod_editorial),
    CONSTRAINT FK_cod_autor FOREIGN KEY (cod_autor) REFERENCES Autor(cod_autor)
)ENGINE=InnoDB;


CREATE TABLE SedeEmpresa (
	cod_sede INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(250) NOT NULL,
    localidad VARCHAR(250) NOT NULL,
	PRIMARY KEY (cod_sede)

)ENGINE=InnoDB;

CREATE TABLE Ejemplar (
estado INT NOT NULL,
cod_ejemplar INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cod_libro INT NOT NULL,
cod_prestamo INT NOT NULL,
cod_sede INT NOT NULL,
CONSTRAINT FK_cod_libro FOREIGN KEY (cod_libro) REFERENCES Libro(cod_libro),
CONSTRAINT FK_cod_sede FOREIGN KEY (cod_sede) REFERENCES SedeEmpresa(cod_sede)
)ENGINE=InnoDB;

CREATE TABLE Voto (
opinion VARCHAR(250) NOT NULL,
calificacion INT NOT NULL,
cod_voto INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cod_libro INT NOT NULL,
cod_prestamo INT NOT NULL,
cod_sede INT NOT NULL,
cod_ejemplar INT NOT NULL,
CONSTRAINT FK_cod_ejemplar FOREIGN KEY (cod_ejemplar) REFERENCES Ejemplar(cod_ejemplar)
)ENGINE=InnoDB;

CREATE TABLE Prestamo (
	cod_prestamo INT NOT NULL AUTO_INCREMENT,
	fecha_caducidad DATE DEFAULT NULL,
    fecha_alta DATE NOT NULL,
    fecha_devolucion DATE DEFAULT NULL,
	PRIMARY KEY (cod_prestamo),
    cod_voto INT NOT NULL,
    CONSTRAINT FK_cod_voto FOREIGN KEY (cod_voto) REFERENCES Voto (cod_voto)
)ENGINE=InnoDB;

CREATE TABLE Trabajador (
	cod_trabajador INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(250) NOT NULL,
    apellido1 VARCHAR(250) NOT NULL,
	apellido2 VARCHAR(250) NOT NULL,
	telefono CHAR(9) NOT NULL,
    correo VARCHAR(250) NOT NULL,
	DNI CHAR(9)  UNIQUE NOT NULL,
    user CHAR(9) NOT NULL,
	password CHAR(9) NOT NULL,
	PRIMARY KEY (cod_trabajador)
)ENGINE=InnoDB;

CREATE TABLE Notificacion (
mensaje VARCHAR(250) NOT NULL,
leido BIT NOT NULL,
cod_notificacion INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cod_prestamo INT NOT NULL,
cod_trabajador INT NOT NULL,
CONSTRAINT FK_cod_prestamo FOREIGN KEY (cod_prestamo) REFERENCES Prestamo(cod_prestamo),
CONSTRAINT FK_cod_trabajador FOREIGN KEY (cod_trabajador) REFERENCES Trabajador (cod_trabajador)
)ENGINE=InnoDB;


