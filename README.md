![banner-libros](https://user-images.githubusercontent.com/78431881/112316874-cc4fa500-8cab-11eb-88d6-d7a554a01cf8.jpeg)

# Proyecto: Préstamo de libros 

### Equipo Desarrollo 

| Developer | Rama | Rol | Fecha Incorporación | Proyecto | Versión |
| --- | :---:  | :---:  | :---:  | :---: | :---:  |
| Estefania Colombo Rosario| Master / Estefania | Project Manager/Developer 1  | 05/03/2021 | Prestéc de llibres  |   1.0|
| Marc Cuenca | Master / Marc | Developer 2 | 05/03/2021 | Prestéc de llibres  |   1.0|
| Mathias Debrun | Master / Mathias | Developer 3| 05/03/2021 | Prestéc de llibres  |   1.0|

#### Lista con los pasos mínimos que se necesitan para clonar exitosamente el proyecto y echarlo a andar en local.

##### Install stack technology

```
Eclipse Enterprise Java Developers          https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-enterprise-java-developers
Spring Tool Suite 4                         https://spring.io/tools
MySQL Workbench                             https://dev.mysql.com/downloads/workbench/
MySQL Community Server                      https://dev.mysql.com/downloads/mysql/
Postman                                     https://www.postman.com/
```

#### Descripción del proyecto 

```
Muchos de los compañeros de T-Systems se han vuelto a aficionar a la lectura, dados los periodos que hemos estado 
en casa los últimos meses. Cuando acabe la situación sanitaria actual, a T-Systems queremos crear un espacio de 
préstamo de libros para poder potenciar el hábito de la lectura.

Se desea que los empleados puedan registrar libros que tengan y que quieran prestar a una aplicación web, con el 
objetivo que otros usuarios puedan buscarlos por posteriormente contactarlos y hacer el préstamo o intercambio.
```

#### Requisitos funcionales de la aplicación
  1. Los usuarios se tienen que poder registrar a la aplicación, estableciendo un usuario/contraseña.
  2. Los usuarios tienen que autenticarse a la aplicación haciendo login.
  3. Los usuarios tienen que poder crear, actualizar y borrar libros.
  4. Los libros tienen que tener informada una editorial; si esta no existe al sistema, los usuarios tienen que poder darla de alta.
  5. Los usuarios tienen que poder buscar libros filtrante por partes del título, autor o ISBN.
  6. Los usuarios tienen que poder consultar los datos de contacto (nombre y e-mail) del propietario de los libros.
  7. Los usuarios tienen que poder hacer logout de la aplicación web.

#### Posibles puntos de extensión

```
Los posibles puntos de extensión de esta práctica son añadir un sistema de notificaciones por los usuarios 
para recibir avisos cuando otro usuario esté interesado en uno de sus libros, así como añadir un sistema de
votación/puntuación/opinión sobre los libros.
```

### Diseño base de datos 

#### Módelo ERR
![ERR PLlibres](https://user-images.githubusercontent.com/78431881/112317681-952dc380-8cac-11eb-9351-f1b196439dd8.png)

#### Módelo relacional
- **Libro (cod_libro,** genero, titulo, fecha, ISBN)
- **Editorial (cod_editorial,** nombre)
- **Autor (cod_autor,** nombre, apellido)
- **Idioma (cod_idioma,** nombre)
- **Ejemplar (cod_libro, cod_ejemplar, cod_sede, cod_voto, cod_prestamo, cod_trabajador,** estado)
- **SedeEmpresa (cod_sede,** nombre, localidad)
- **Voto(cod_voto, cod_ejemplar , cod_prestamo,** opinión, calificación)
- **Prestamo (cod_prestamo, cod_voto, cod_notificacion, cod_trabajador, cod_ejemplar,** fecha_caducidad, fecha_alta, fecha_devolucion)
- **Notificacion (cod_notificacion, cod_préstamo, cod_trabajador,** mensaje, leído)
- **Trabajador (cod_trabajador, cod_ejemplar, cod_notificacion, cod_prestamo,** nombre, apellido1, apellido2, correo, DNI, user,   password)

### Backend

#### Información de Desarrollo

```
IDE               Eclipse Enterprise Java Developers, Version: 2020-12 (4.18.0)
Core              Java
JDK               8
Framework         Spring Tool Suite 4, Version: 4.9.0
DataBase          MySQL Workbench and MySQL Community Server, Version 8.0.22 
Peticiones        Postman, Versión 8.0.7 
```

#### API REST Endpoints

```
Autor:
GET:/api/autores
GET ID:/api/autor/{id}
PUT:/api/autor/{id}
POST:/api/autores
DELETE:/api/autor/{id}

Editorial:
GET:/api/editoriales
GET ID:/api/editorial/{id}
PUT:/api/editorial/{id}
POST:/api/editoriales
DELETE:/api/editorial/{id}

Ejemplar:
GET:/api/ejemplares
GET ID:/api/ejemplar/{id}
PUT:/api/ejemplar/{id}
POST:/api/ejemplares
DELETE:/api/ejemplar/{id}

Idioma:
GET:/api/idiomas
GET ID:/api/idioma/{id}
PUT:/api/idioma/{id}
POST:/api/idiomas
DELETE:/api/idioma/{id}

Libro:
GET:/api/libros
GET ID:/api/libro/{id}
PUT:/api/libro/{id}
POST:/api/libros
DELETE:/api/libro/{id}

Notificacion:
GET:/api/notificaciones
GET ID:/api/notificacion/{id}
PUT:/api/notificacion/{id}
POST:/api/notificaciones
DELETE:/api/notificacion/{id}

Prestamo:
GET:/api/prestamos
GET ID:/api/prestamo/{id}
PUT:/api/prestamo/{id}
POST:/api/prestamos
DELETE:/api/prestamo/{id}

SedeEmpresa:
GET:/api/sedeEmpresas
GET ID:/api/sedeEmpresa/{id}
PUT:/api/sedeEmpresa/{id}
POST:/api/sedeEmpresas
DELETE:/api/sedeEmpresa/{id}

Trabajador:
GET:/api/trabajadores
GET ID:/api/trabajador/{id}
PUT:/api/trabajador/{id}
POST:/api/trabajadores
DELETE:/api/trabajador/{id}

Usuario:
GET:/api/users/
GET ID:/api/users/{username}
PUT:/api/users/{username}
POST:/api/users/

Voto:
GET:/api/votos
GET ID:/api/voto/{id}
PUT:/api/voto/{id}
POST:/api/votos
DELETE:/api/voto/{id}
```

### Frontend

#### Información de Desarrollo

```
IDE               Visual Studio Code, Versión: 1.54.3
Core              HTML, CSS, JavaScript,jQuery,TypeScript, Boostrap, Angular
Framework         Angular
DataBase          MySQL Workbench and MySQL Community Server, Version 8.0.22 
```


