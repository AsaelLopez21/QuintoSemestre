-- Eliminar tabla si ya existe
DROP DATABASE IF EXISTS concurrencia_biblioteca;

-- Crear la base de datos
CREATE DATABASE concurrencia_biblioteca;

-- Entrar en la base de datos
USE concurrencia_biblioteca;

-- Tabla de libros

DROP TABLE IF EXISTS libros;

CREATE TABLE libros(
	id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    disponible BOOLEAN NOT NULL DEFAULT TRUE
);

-- Tabla de prestamos
DROP TABLE IF EXISTS prestamos;

CREATE TABLE prestamos(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_libro INT,
    id_usuario INT,
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    FOREIGN KEY (id_libro) REFERENCES libros(id)
);

-- Insertar datos en la tabla libros
INSERT INTO libros (titulo, autor, disponible) VALUES
('Cien años de soledad', 'Gabriel García Márquez', TRUE),
('Don Quijote de la Mancha', 'Miguel de Cervantes', TRUE),
('El amor en los tiempos del cólera', 'Gabriel García Márquez', TRUE),
('La sombra del viento', 'Carlos Ruiz Zafón', TRUE),
('1984', 'George Orwell', TRUE);

-- Insertar en la tabla prestamos
INSERT INTO prestamos (id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES
(1, 101, '2024-11-01', '2024-11-15'),
(2, 102, '2024-11-02', '2024-11-16'),
(3, 103, '2024-11-03', '2024-11-18'),  
(4, 104, '2024-11-04', '2024-11-18'),
(5, 105, '2024-11-05', '2024-11-18'); 

 




