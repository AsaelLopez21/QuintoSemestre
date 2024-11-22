-- Eliminar base de datos si ya existe
DROP DATABASE IF EXISTS biblioteca;

-- Crear la base de datos
CREATE DATABASE biblioteca;

-- Ingresar a la base de datos
USE biblioteca;

-- Creacion y eliminacion de las tablas si ya existen
DROP TABLE IF EXISTS persona;

CREATE TABLE persona(
	id_persona INT AUTO_INCREMENT,
    nombre VARCHAR (30) NOT NULL,
    apellido_paterno VARCHAR(20) NOT NULL,
    apellido_materno VARCHAR(20) NOT NULL,
    tipo VARCHAR(15),
    PRIMARY KEY(id_persona)
);

-- Insertar informacion de los compañeros a personas
INSERT INTO persona(nombre,apellido_paterno,apellido_materno,tipo)
VALUES
('Asael Efrain','Lopez','Ramos','Estudiante'),
('Luis Angel','Diaz','Diaz','Estudiante'),
('Omar David','Garcia','Ventura','Estudiante'),
('Rolando Abimael','Chompa','Guzman','Estudiante'),
('Bryan Dwayne','Salinas','Pacheco','Estudiante'),
('Alex Emmanuel','Mendez','Ruiz','Estudiante'),
('Maria','Juarez','Matias','Estudiante'),
('Melissa','Pacheco','Hernandez','Estudiante'),
('Karen Celeste','Coronel','Alvarado','Estudiante'),
('Alan','Martinez','Herrera','Estudiante'),
('Arturo','Peral','Lopez','Estudiante'),
('Eliel','Perez','Cordero','Estudiante');

DROP TABLE IF EXISTS direccion;

CREATE TABLE direccion(
	id_direccion INT AUTO_INCREMENT,
    calle VARCHAR(30),
    numero VARCHAR (10),
    colonia VARCHAR(20), 
    municipio VARCHAR(25) NOT NULL,
    estado VARCHAR(15) NOT NULL,
    codigo_postal VARCHAR(10) NOT NULL,
	PRIMARY KEY(id_direccion)
);


-- Ingresar direccion ficticia de los compañeros
INSERT INTO direccion(calle, numero,colonia,municipio,estado,codigo_postal)
VALUES
('Reforma','S/N','','Los Ocotes Ejutla','Oaxaca','71502'),
('Benito Juarez','5','Pedregal','Ocotlan de Morelos','Oaxaca','71510'),
('Independencia','65','La Soledad','Ocotlan de Morelos','Oaxaca','71510'),
('','52','Las campanas','San Antonino','Oaxaca','71262'),
('Zaragoza','5','Lomas','Ocotlan de Morelos','Oaxaca','71502'),
('El arroyo','87','La Noria','Ocotlan de Morelos','Oaxaca','71502'),
('Miguel Hidalgo','14','Arboleda','San Bartolo','Oaxaca','71230'),
('5 de Mayo','3','El Paso','San Pedro','Oaxaca','71231'),
('Niños Heroes','31','La Natividad','Juxtlahuaca','Oaxaca','69400'),
('Cristobal Colon','77','Zona Centro','Juxtlahuaca','Oaxaca','69400'),
('Revolucion','22','El Arenal','Juxtlahuaca','Oaxaca','69400'),
('Insurgentes','29','Las Flores','Juxtlahuaca','Oaxaca','69400');

-- Agregar algunos autores para ingresar libros
INSERT INTO persona(nombre, apellido_paterno, apellido_materno, tipo) VALUES 
('Miguel', 'de Cervantes', 'Saavedra', 'Autor'),
('Veronica', 'Roth', '', 'Autor'),
('Suzanne', 'Collins', '', 'Autor'),
('J.K.', 'Rowling', '', 'Autor'),
('Javier', 'Ruescas', '', 'Autor');

DROP TABLE IF EXISTS socio;

CREATE TABLE socio(
	id_socio INT AUTO_INCREMENT,
    id_persona INT NOT NULL,
    id_direccion INT NOT NULL,
    curp VARCHAR(18) NOT NULL UNIQUE,
    telefono VARCHAR(15) NOT NULL UNIQUE,
    genero VARCHAR(15) NOT NULL,
    PRIMARY KEY(id_socio, id_persona, id_direccion),
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona),
	FOREIGN KEY (id_direccion) REFERENCES direccion(id_direccion)
);

-- Agregando informacion de los compañeros a la tabla socios
INSERT INTO socio(id_persona, id_direccion, curp, telefono, genero)
VALUES
(1, 1, 'LOPE010203HDFLRS05', '5556789012', 'Masculino'),
(2, 2, 'DIAZ020304HDFLRS06', '5557890123', 'Masculino'),
(3, 3, 'GARC030405HDFLRS07', '5558901234', 'Masculino'),
(4, 4, 'CHOA040506HDFLRS08', '5559012345', 'Masculino'),
(5, 5, 'SALI050607HDFLRS09', '5550123456', 'Masculino'),
(6, 6, 'MENR060708HDFLRS10', '5551234568', 'Masculino'),
(7, 7, 'JUAR070809HDFLRS11', '5552345679', 'Femenino'),
(8, 8, 'PACH080910HDFLRS12', '5553456780', 'Femenino'),
(9, 9, 'CORO091011HDFLRS13', '5554567891', 'Femenino'),
(10, 10, 'MART101112HDFLRS14', '5555678902', 'Masculino'),
(11, 11, 'PERA111213HDFLRS15', '5556789013', 'Masculino'),
(12, 12, 'PECA060708HDFLRS10', '5556789014', 'Masculino');

DROP TABLE IF EXISTS autor;

CREATE TABLE autor(
	id_autor INT AUTO_INCREMENT,
    id_persona INT NOT NULL,
	PRIMARY KEY(id_autor,id_persona),
    FOREIGN KEY(id_persona) REFERENCES persona(id_persona)
);

-- Creando autores con las personas ingresadas anteriormente de tipo autor
INSERT INTO autor(id_persona)
VALUES
(13),
(14), 
(15), 
(16), 
(17);

DROP TABLE IF EXISTS editorial;

CREATE TABLE editorial(
	id_editorial INT AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    detalle VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY(id_editorial)
);

-- Creando editoriales para cada autor
INSERT INTO editorial(nombre, detalle)
VALUES
('Editorial Planeta', 'Publicación de libros de ficción y no ficción'),
('Editorial Santillana', 'Libros educativos y de literatura infantil'),
('Editorial Alfaguara', 'Literatura contemporánea y clásica'),
('Editorial Anagrama', 'Ficción literaria y ensayo'),
('Editorial Random House', 'Diversidad de géneros literarios');

-- Creando tabla estado de los libros donde tendremos:
-- disponible, reservado, prestado y despues relacionarla con
-- la tabla libros
DROP TABLE IF EXISTS estado_libro;
CREATE TABLE estado_libro(
	id_estado INT AUTO_INCREMENT,
    descripcion VARCHAR(20),
    PRIMARY KEY(id_estado)
);

-- EXAMEN 3.
-- Estados en los que puede estar un libro en la biblioteca
INSERT INTO estado_libro(descripcion)
VALUES
('Disponible'),
('Prestado'),
('Reservado');



-- EXAMEN 1.
DROP TABLE IF EXISTS categorias;
CREATE TABLE categorias(
id_categoria INT AUTO_INCREMENT,
nombre_categoria VARCHAR(30),
PRIMARY KEY(id_categoria) 
);

INSERT INTO categorias(nombre_categoria) VALUES
('Ficción'),
('No Ficción'),
('Ciencia Ficción'),
('Literatura Infantil'),
('Biografía');

DROP TABLE IF EXISTS libros;

CREATE TABLE libros(
	id_libro INT AUTO_INCREMENT,
    id_autor INT NOT NULL,
    id_editorial INT NOT NULL,
    id_estado INT NOT NULL,
    titulo VARCHAR(50),
    isbn VARCHAR(13) NOT NULL UNIQUE,
    id_categoria INT NOT NULL,
    PRIMARY KEY(id_libro,id_autor,id_editorial,id_categoria),
    FOREIGN KEY(id_autor) REFERENCES autor(id_autor) ON DELETE CASCADE,
    FOREIGN KEY(id_editorial) REFERENCES editorial(id_editorial),
    FOREIGN KEY(id_estado) REFERENCES estado_libro(id_estado),
    FOREIGN KEY(id_categoria) REFERENCES categorias(id_categoria)
);

-- Agregando a la biblioteca un libro de cada autor
INSERT INTO libros (id_autor, id_editorial, titulo, isbn,id_estado,id_categoria)
VALUES
(1, 1, 'Don Quijote de la Mancha', 9788491052029,2,1),
(1, 1, 'La vida de Lazarillo de Tormes', 9788491052036,1,2),
(2, 2, 'Insurgent', 9780062024039,1,2),
(3, 3, 'Los Juegos del Hambre', 9780439023528,1,3),
(3, 3, 'En llamas', 9780439023511,1,3),
(4, 4, 'Harry Potter y la piedra filosofal', 9780439708180,1,1),
(4, 4, 'Harry Potter y la cámara secreta', 9780439064873,1,1),
(5, 5, 'Cuentos de la Abuela Amelia', 9788498381567,1,4),
(5, 5, 'El viaje de las estrellas', 9788498381574,1,1);

-- EXAMEN 2.
DROP TABLE IF EXISTS categoria_libros;

CREATE TABLE categoria_libros(
	id_categoria INT NOT NULL,
    id_libro INT NOT NULL,
	PRIMARY KEY(id_categoria, id_libro),
	FOREIGN KEY(id_categoria) REFERENCES categorias(id_categoria) ON DELETE CASCADE,
    FOREIGN KEY(id_libro) REFERENCES libros(id_libro) ON DELETE CASCADE
);

INSERT INTO categoria_libros (id_categoria, id_libro) VALUES
(1, 1),  
(2, 3),  
(3, 4),  
(4, 5); 

-- creando la tabla que relacion al autor con los libros
DROP TABLE IF EXISTS libro_autor;

CREATE TABLE libro_autor(
	id_libro INT NOT NULL,
    id_autor INT NOT NULL,
    PRIMARY KEY(id_libro,id_autor),
    FOREIGN KEY(id_libro) REFERENCES libros(id_libro),
    FOREIGN KEY(id_autor) REFERENCES autor(id_autor) ON DELETE CASCADE
);
-- Relacionando a cada autor con su libro
INSERT INTO libro_autor (id_libro, id_autor)
VALUES
(1, 1), 
(2, 1),
(3, 2),
(4, 2),
(5, 3),
(6, 3),
(8, 4),
(9, 5); 

-- EXAMEN 4.
-- Creacion de la tabla ejemplar
DROP TABLE IF EXISTS ejemplar;

CREATE TABLE ejemplar(
	id_ejemplar INT AUTO_INCREMENT,
	id_libro INT NOT NULL,
	id_estado INT NOT NULL,
    PRIMARY KEY(id_ejemplar,id_libro,id_estado),
    FOREIGN KEY (id_libro) REFERENCES libros(id_libro),
    FOREIGN KEY(id_estado) REFERENCES estado_libro(id_estado)
);

-- Agregar columnas a ejemplar
ALTER TABLE ejemplar	
ADD ubicacion_fisica VARCHAR(40) NOT NULL,
ADD fecha_adquisicion DATETIME NOT NULL,
ADD    condicion VARCHAR(20);


INSERT INTO ejemplar (id_libro, id_estado, ubicacion_fisica, fecha_adquisicion, condicion) VALUES
(1, 1, 'Estante 3', '2024-01-15 10:00:00', 'Nuevo'),  
(1, 2, 'Estante 4', '2024-01-15 10:00:00', 'Dañado'),
(2, 1, 'Estante 2', '2024-01-16 11:00:00', 'Usado'),  
(3, 2, 'Estante 1', '2024-01-17 12:00:00', 'Dañado'),  
(4, 1, 'Estante 5', '2024-01-18 13:00:00', 'Nuevo'),   
(5, 1, 'Estante 4', '2024-01-19 14:00:00', 'Usado');    

-- Valores para identificar a los libros por ejemplares

-- EXAMEN 6.
DROP TABLE IF EXISTS libros_ejemplares;

CREATE TABLE libros_ejemplares(
	id_libro_ejemplar INT AUTO_INCREMENT,
	id_libro INT NOT NULL,
    id_ejemplar INT NOT NULL,
    PRIMARY KEY(id_libro_ejemplar),
    FOREIGN KEY (id_libro) REFERENCES libros(id_libro) ON DELETE CASCADE,
    FOREIGN KEY (id_ejemplar) REFERENCES ejemplar(id_libro) ON DELETE CASCADE    
);

INSERT INTO libros_ejemplares (id_libro, id_ejemplar)
VALUES
(1, 1), 
(2, 2),  
(3, 3);  

DROP TABLE IF EXISTS prestamo;

CREATE TABLE prestamo(
	id_prestamo INT AUTO_INCREMENT,
    id_libro INT NOT NULL,
    id_socio INT NOT NULL,
    fecha_prestamo DATETIME NOT NULL DEFAULT NOW(),
    fecha_devolucion DATETIME,
    PRIMARY KEY(id_prestamo,id_libro,id_socio),
    FOREIGN KEY(id_libro) REFERENCES libros(id_libro),
    FOREIGN KEY(id_socio) REFERENCES socio(id_socio)
);

INSERT INTO prestamo (id_libro, id_socio, fecha_prestamo)
VALUES (1, 1, NOW()),
(2, 1, NOW()),
(1, 3, NOW());

-- EXAMEN 7.
DROP TABLE IF EXISTS reservas;

CREATE TABLE reservas(
	id_reserva INT AUTO_INCREMENT,
	id_socio INT NOT NULL,
    id_libro INT NOT NULL,
    fecha_reserva DATETIME,
    fecha_expiracion_reserva DATETIME,
	estado_reserva VARCHAR(20),    
	PRIMARY KEY(id_reserva,id_libro,id_socio),
	FOREIGN KEY(id_libro) REFERENCES libros(id_libro) ON DELETE CASCADE,
    FOREIGN KEY(id_socio) REFERENCES socio(id_socio) ON DELETE CASCADE
);

-- CONSULTAS

-- CONSULTA 1
-- Seleccionar su id,, ubicacion y disponibilidad
SELECT ejemplar.id_ejemplar, ejemplar.ubicacion_fisica, estado_libro.descripcion AS estado
FROM ejemplar
-- Combinar las tablas estado libro con ejemplar y usar su id para filtrar resultados
JOIN estado_libro ON ejemplar.id_estado = estado_libro.id_estado
WHERE ejemplar.id_libro = 2 AND estado_libro.descripcion = 'Disponible';

-- CONSULTA 2
-- Selecciones id del libro el titulo contamos los ejemplares
SELECT libros.id_libro, libros.titulo, COUNT(ejemplar.id_ejemplar) AS cantidad_disponibles
-- de la tabla libros
FROM libros
-- ingresamos a ejemplar combinado con libros
LEFT JOIN ejemplar ON libros.id_libro = ejemplar.id_libro
-- ingresamos al estado_libro combinado con ejemplar
LEFT JOIN estado_libro ON ejemplar.id_estado = estado_libro.id_estado
-- condicionamos que este disponible
WHERE estado_libro.descripcion = 'Disponible'
-- los agrupamos por su id y titulo
GROUP BY libros.id_libro, libros.titulo;

-- Consulta 3
-- Seleccionamos de prestamo
SELECT * FROM prestamo
-- donde el id sea uno especifico
WHERE prestamo.id_socio = 1;

-- Consulta 4
SELECT * FROM prestamo;

-- Consulta 5
SELECT ejemplar.id_ejemplar, libros.id_libro, libros.titulo,categorias.nombre_categoria 
FROM libros
LEFT JOIN ejemplar ON libros.id_libro = ejemplar.id_libro
LEFT JOIN categorias ON categorias.id_categoria= libros.id_categoria
WHERE libros.id_categoria = 1;

-- Usar procedimientos para comprobar la transacciones que estamos haciendo

-- 1. Agregar un nuevo libro y su autor
-- Eliminar procedimiento si exite
DELIMITER $$
DROP PROCEDURE IF EXISTS agregar_libro_autor$$
-- Crear el procedimiento
CREATE PROCEDURE agregar_libro_autor()
-- Comenzar el procedimiento
BEGIN
    -- Excepcion, salir del procedimiento si ocurre un error
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    -- Si ocurre la excepcion
    BEGIN
		-- Mostrar mensaje de error
        SELECT 'Error' AS result;
        -- Realizar un rollback para no hacer los cambios a las tablas
        ROLLBACK;
    -- Terminar si hubo alguna excepcion
    END;

	-- Si no hay ninguna excepcion comenzar con la transaccion
	-- Iniciar la transaccion
    START TRANSACTION;

    -- Insertar una persona de tipo autor
    INSERT INTO persona(nombre, apellido_paterno, apellido_materno, tipo)
    VALUES ('Autor', 'Poco', 'Conocido', 'Autor');

    -- Insertar en la tabla autor la persona agregada anteriormente
    INSERT INTO autor(id_persona)
    -- El ultimo id agregado
    VALUES (LAST_INSERT_ID());

    -- Insertar el libro con el id del autor agregado anteriormente
    INSERT INTO libros (id_autor, id_editorial, titulo, isbn, id_estado)
    -- El ultimo id agregado
    VALUES (LAST_INSERT_ID(), 1, 'Libro raro', '9788491052004', 1);
        
    -- Mostrar mensaje de confirmacion de operacion
    SELECT 'Hecho' AS result;

    -- Realizar los cambios
    COMMIT;
    -- Terminar el procedimiento
END$$
DELIMITER ;

-- 2. Actualizar la informacion del libro Don Quijote de la Mancha
-- Eliminar procedimiento si exite
DELIMITER $$
DROP PROCEDURE IF EXISTS actualizar_info_libro$$
-- Crear el procedimiento
CREATE PROCEDURE actualizar_info_libro()
-- Comenzar el procedimiento
BEGIN
    -- Excepcion, salir del procedimiento si ocurre un error
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    -- Si ocurre la excepcion
    BEGIN
		-- Mostrar mensaje de error
        SELECT 'Error' AS result;
        -- Realizar un rollback para no hacer los cambios a las tablas
        ROLLBACK;
    -- Terminar si hubo alguna excepcion
    END;

	-- Si no hay ninguna excepcion comenzar con la transaccion
	-- Iniciar la transaccion
    START TRANSACTION;
    UPDATE libros
	SET titulo = 'Don Quijote de la Mancha Nueva Edicion'
	WHERE id_libro=1;

    -- Mostrar mensaje de confirmacion de operacion
    SELECT 'Hecho' AS result;

    -- Realizar los cambios
    COMMIT;
    -- Terminar el procedimiento
END$$
DELIMITER ;

-- 3.Hacer un prestamo
-- Eliminar procedimiento si exite
DELIMITER $$
DROP PROCEDURE IF EXISTS realizar_prestamo$$
-- Crear el procedimiento
CREATE PROCEDURE realizar_prestamo()
-- Comenzar el procedimiento
BEGIN
    -- Excepcion, salir del procedimiento si ocurre un error
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    -- Si ocurre la excepcion
    BEGIN
		-- Mostrar mensaje de error
        SELECT 'Error' AS result;
        -- Realizar un rollback para no hacer los cambios a las tablas
        ROLLBACK;
    -- Terminar si hubo alguna excepcion
    END;

	-- Si no hay ninguna excepcion comenzar con la transaccion
	-- Iniciar la transaccion
    START TRANSACTION;
    INSERT INTO prestamo (id_libro, id_socio, fecha_prestamo)
	VALUES
	(6, 1, '2024-10-01 10:00:00'); 
	UPDATE libros
	SET id_estado=2
	WHERE id_libro=6;

    -- Mostrar mensaje de confirmacion de operacion
    SELECT 'Hecho' AS result;

    -- Realizar los cambios
    COMMIT;
    -- Terminar el procedimiento
END$$
DELIMITER ;

-- 4. Hacer una devolucion
-- Eliminar procedimiento si exite
DELIMITER $$
DROP PROCEDURE IF EXISTS realizar_devolucion$$
-- Crear el procedimiento
CREATE PROCEDURE realizar_devolucion()
-- Comenzar el procedimiento
BEGIN
    -- Excepcion, salir del procedimiento si ocurre un error
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    -- Si ocurre la excepcion
    BEGIN
		-- Mostrar mensaje de error
        SELECT 'Error' AS result;
        -- Realizar un rollback para no hacer los cambios a las tablas
        ROLLBACK;
    -- Terminar si hubo alguna excepcion
    END;

	-- Si no hay ninguna excepcion comenzar con la transaccion
	-- Iniciar la transaccion
    START TRANSACTION;
	UPDATE prestamo 
	SET fecha_devolucion = '2024-10-12 13:23:54'
	WHERE id_libro=6;

	UPDATE libros
	SET id_estado=1
	WHERE id_libro=6;

    -- Mostrar mensaje de confirmacion de operacion
    SELECT 'Hecho' AS result;

    -- Realizar los cambios
    COMMIT;
    -- Terminar el procedimiento
END$$
DELIMITER ;

-- 5. Eliminar autor
-- Eliminar procedimiento si exite
DELIMITER $$
DROP PROCEDURE IF EXISTS eliminar_autor$$
-- Crear el procedimiento
CREATE PROCEDURE eliminar_autor(IN autor_id INT)
-- Comenzar el procedimiento
BEGIN
    -- Excepcion, salir del procedimiento si ocurre un error
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    -- Si ocurre la excepcion
    BEGIN
		-- Mostrar mensaje de error
        SELECT 'Error' AS result;
        -- Realizar un rollback para no hacer los cambios a las tablas
        ROLLBACK;
    -- Terminar si hubo alguna excepcion
    END;

	-- Si no hay ninguna excepcion comenzar con la transaccion
	-- Iniciar la transaccion
    START TRANSACTION;
    -- Eliminar el autor
    DELETE FROM autor WHERE id = autor_id;

    -- Mostrar mensaje de confirmacion de operacion
    SELECT 'Hecho' AS result;

    -- Realizar los cambios
    COMMIT;
    -- Terminar el procedimiento
END$$
DELIMITER ;



