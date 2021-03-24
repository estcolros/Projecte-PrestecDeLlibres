-- Registros de prueba en tabla autor
INSERT INTO `PLlibres`.`autor` (`cod_autor`, `nombre`, `apellido`) VALUES (1,"Enrique","Lorenzo");
INSERT INTO `PLlibres`.`autor` (`cod_autor`, `nombre`, `apellido`) VALUES  (2,"Jorge","Gómez");
INSERT INTO `PLlibres`.`autor` (`cod_autor`, `nombre`, `apellido`) VALUES (3,"Maggie", "Stiefvater");
INSERT INTO `PLlibres`.`autor` (`cod_autor`, `nombre`, `apellido`) VALUES  (4,"Fernando","Lalana");
INSERT INTO `PLlibres`.`autor` (`cod_autor`, `nombre`, `apellido`) VALUES (5,"Estefania","Colombo");

-- Registros de prueba en tabla editorial
INSERT INTO `PLlibres`.`editorial` (`cod_editorial`, `nombre`) VALUES (1,"Planetadelibros");
INSERT INTO `PLlibres`.`editorial` (`cod_editorial`, `nombre`) VALUES (2,"Panini Cómics");
INSERT INTO `PLlibres`.`editorial` (`cod_editorial`, `nombre`) VALUES (3,"La Galera");
INSERT INTO `PLlibres`.`editorial` (`cod_editorial`, `nombre`) VALUES (4,"Neo");

-- Registros de prueba en tabla idioma
INSERT INTO `PLlibres`.`idioma` (`cod_idioma`, `nombre`) VALUES (1,"Catalan");
INSERT INTO `PLlibres`.`idioma` (`cod_idioma`, `nombre`) VALUES (2,"Castellano");
INSERT INTO `PLlibres`.`idioma` (`cod_idioma`, `nombre`) VALUES (3,"Inglés");
INSERT INTO `PLlibres`.`idioma` (`cod_idioma`, `nombre`) VALUES (4,"Aleman");

-- Registros de prueba en tabla sedeempresa
INSERT INTO `PLlibres`.`sedeempresa` (`cod_sede`, `nombre`, `localidad`) VALUES (1,"T-Systems","Reus");
INSERT INTO `PLlibres`.`sedeempresa` (`cod_sede`, `nombre`, `localidad`) VALUES (2,"T-Systems","Londres");
INSERT INTO `PLlibres`.`sedeempresa` (`cod_sede`, `nombre`, `localidad`) VALUES (3,"T-Systems","Troy");
INSERT INTO `PLlibres`.`sedeempresa` (`cod_sede`, `nombre`, `localidad`) VALUES (4,"T-Systems","Vienna");
INSERT INTO `PLlibres`.`sedeempresa` (`cod_sede`, `nombre`, `localidad`) VALUES (5,"T-Systems","Paris");

-- Registros de prueba en tabla trabajador
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES 
(1,"Estefania","Colombo","Rosario",650668915, "estefania.c.r@t-systems.com", 481615178,"estcolros","pass123",1);
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES 
(2,"Cristina","Cano","Porta",633668915, "cristinacp@t-systems.com", 654615178,"cricanpor","pass321",2);
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES  
(3,"Sara","Fernandez","Tomi",656898915, "saraft@t-systems.com", 498715178,"sarfertom","pass456",3);
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES 
(4,"Victor","Fernandez","Lopez",656898123, "victorfl@t-systems.com", 569715178,"vicferlop","pass654",1);
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES  
(5,"David","Torres","Garcia",591398915, "davidtg@t-systems.com", 498716379,"davtorgar","pass789",1);
INSERT INTO `PLlibres`.`trabajador` (`cod_trabajador`, `nombre`, `apellido1`, `apellido2`, `telefono`, `correo`, `DNI`, `user`, `password`, `trabajador_recibe`) VALUES  
(6,"Pepe","Torres","Garcia",981398915, "pepetg@t-systems.com", 498896379,"ptorgar","pass777",null);


-- Registros de prueba en tabla libro
INSERT INTO `PLlibres`.`libro` (`cod_libro`, `genero`, `titulo`, `fecha`, `ISBN`, `cod_idioma`, `cod_editorial`, `cod_autor`) 
VALUES (1, "Aventuras", "Lazarillo de Tormes","2010-08-24",987654321, 1,1, 1);
INSERT INTO `PLlibres`.`libro` (`cod_libro`, `genero`, `titulo`, `fecha`, `ISBN`, `cod_idioma`, `cod_editorial`, `cod_autor`) 
VALUES (2, "Policiaca", "Respirando cerca de mí","2020-01-06",456789123, 1,2, 3);
INSERT INTO `PLlibres`.`libro` (`cod_libro`, `genero`, `titulo`, `fecha`, `ISBN`, `cod_idioma`, `cod_editorial`, `cod_autor`) 
VALUES (3, "Paranormal", "The Raven Boys: La profecía del cuervo","2019-09-21",147258369, 2,1, 1);
INSERT INTO `PLlibres`.`libro` (`cod_libro`, `genero`, `titulo`, `fecha`, `ISBN`, `cod_idioma`, `cod_editorial`, `cod_autor`) 
VALUES (4,"Ciencia Ficción", "Los diamanes de Oberón","2005-05-05",123456789, 2,3, 1);


-- Registros de prueba en tabla ejemplar
INSERT INTO `PLlibres`.`ejemplar` (`estado`, `cod_ejemplar`, `cod_libro`, `cod_sede`, `cod_voto`, `trabajador_recibe`, `trabajador_presta`) 
VALUES (10, 5, 2, 1, 1, null, 1);
INSERT INTO `PLlibres`.`ejemplar` (`estado`, `cod_ejemplar`, `cod_libro`, `cod_sede`, `cod_voto`, `trabajador_recibe`, `trabajador_presta`) 
VALUES (10, 1, 2, 1, 1, 2, 1);
INSERT INTO `PLlibres`.`ejemplar` (`estado`, `cod_ejemplar`, `cod_libro`, `cod_sede`, `cod_voto`, `trabajador_recibe`,  `trabajador_presta`) 
VALUES (10, 2, 1, 2, 1, 2, 2);
INSERT INTO `PLlibres`.`ejemplar` (`estado`, `cod_ejemplar`, `cod_libro`, `cod_sede`, `cod_voto`, `trabajador_recibe`,  `trabajador_presta`) 
VALUES (10, 3, 3, 2, 1, 2, 3);
INSERT INTO `PLlibres`.`ejemplar` (`estado`, `cod_ejemplar`, `cod_libro`, `cod_sede`, `cod_voto`, `trabajador_recibe`, `trabajador_presta`) 
VALUES (10, 4, 4, 3, 1, 2, 4);


-- Registros de prueba en tabla voto
INSERT INTO `PLlibres`.`voto` (`opinion`, `calificacion`, `cod_voto`, `cod_prestamo`, `cod_sede`, `cod_ejemplar`) 
VALUES ("Muy interesante",9, 1, 1, 2, 2);
INSERT INTO `PLlibres`.`voto` (`opinion`, `calificacion`, `cod_voto`, `cod_prestamo`, `cod_sede`, `cod_ejemplar`) 
VALUES ("Muy aburrido",2, 2, 1, 2, 1);
INSERT INTO `PLlibres`.`voto` (`opinion`, `calificacion`, `cod_voto`, `cod_prestamo`, `cod_sede`, `cod_ejemplar`) 
VALUES ("Muy aburrido",2, 3, 1, 2, 2);
INSERT INTO `PLlibres`.`voto` (`opinion`, `calificacion`, `cod_voto`, `cod_prestamo`, `cod_sede`, `cod_ejemplar`)  
VALUES ("Interesante",5, 4, 2, 3, 1);
INSERT INTO `PLlibres`.`voto` (`opinion`, `calificacion`, `cod_voto`, `cod_prestamo`, `cod_sede`, `cod_ejemplar`) 
VALUES ("Pesimo",0, 6, 5, 3, 1);


-- Registros de prueba en tabla prestamo
INSERT INTO `PLlibres`.`prestamo` (`cod_prestamo`, `fecha_caducidad`, `fecha_alta`, `fecha_devolucion`, `cod_voto`,  `cod_ejemplar`, `trabajador_recibe`) 
VALUES (1, "2021-01-01","2021-01-01" ,"2021-01-01", 1, 1, 1);
INSERT INTO `PLlibres`.`prestamo` (`cod_prestamo`, `fecha_caducidad`, `fecha_alta`, `fecha_devolucion`, `cod_voto`,  `cod_ejemplar`, `trabajador_recibe`) 
VALUES (2, "2021-01-01","2021-01-02" ,"2021-02-01", 2, 1,2);
INSERT INTO `PLlibres`.`prestamo` (`cod_prestamo`, `fecha_caducidad`, `fecha_alta`, `fecha_devolucion`, `cod_voto`,  `cod_ejemplar`, `trabajador_recibe`) 
VALUES (3, "2021-01-01","2021-01-03" ,"2021-02-01", 3, 1, 3);
INSERT INTO `PLlibres`.`prestamo` (`cod_prestamo`, `fecha_caducidad`, `fecha_alta`, `fecha_devolucion`, `cod_voto`,  `cod_ejemplar`, `trabajador_recibe`) 
VALUES (4, "2021-01-01","2021-01-04" ,"2021-02-01", 4, 1, 4);
INSERT INTO `PLlibres`.`prestamo` (`cod_prestamo`, `fecha_caducidad`, `fecha_alta`, `fecha_devolucion`, `cod_voto`,  `cod_ejemplar`, `trabajador_recibe`) 
VALUES (5, "2021-01-01","2021-01-04" ,"2021-02-01", 4, 1, null);


-- Registros de prueba en tabla notificacion
INSERT INTO `PLlibres`.`notificacion` (`mensaje`, `leido`, `cod_notificacion`, `cod_prestamo`, `cod_trabajador`, `trabajador_recibe`)
VALUES ("Listo para recoger",true, 1, 1, 1, 1);
INSERT INTO `PLlibres`.`notificacion` (`mensaje`, `leido`, `cod_notificacion`, `cod_prestamo`, `cod_trabajador`, `trabajador_recibe`)
VALUES ("Listo para entregar",false, 2, 1, 1, 1);
INSERT INTO `PLlibres`.`notificacion` (`mensaje`, `leido`, `cod_notificacion`, `cod_prestamo`, `cod_trabajador`, `trabajador_recibe`)
VALUES ("Pendiente de recogida",false, 3, 1, 1, 1);
INSERT INTO `PLlibres`.`notificacion` (`mensaje`, `leido`, `cod_notificacion`, `cod_prestamo`, `cod_trabajador`, `trabajador_recibe`)
VALUES ("Pendiente de entrega",true, 4, 1, 1, 1);
INSERT INTO `PLlibres`.`notificacion` (`mensaje`, `leido`, `cod_notificacion`, `cod_prestamo`, `cod_trabajador`, `trabajador_recibe`)
VALUES ("Pendiente de entrega",true, 5, 1, 1, null);


-- Consulta para relacionar tablas libro/prestamo 
select * from libro l left join prestamo p  on l.cod_libro=p.cod_prestamo;