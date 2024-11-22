-- Eliminar tabla si ya existe
DROP DATABASE IF EXISTS ejercicioConcurrencia;

-- Crear la base de datos
CREATE DATABASE ejercicioConcurrencia;

-- Entrar en la base de datos
USE ejercicioConcurrencia;

-- Creacion de las tablas 
CREATE TABLE Cuentas(
	cuenta_id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT NOT NULL,
    saldo DECIMAL(15,2) DEFAULT 0.0
);

CREATE TABLE Transacciones(
	transaccion_id INT PRIMARY KEY AUTO_INCREMENT,
    cuenta_id INT NOT NULL,
    tipo_transaccion ENUM ('Deposito','Retiro') NOT NULL,
    monto DECIMAL (15,2) NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY(cuenta_id) REFERENCES Cuentas(cuenta_id)
);

CREATE TABLE Productos(
	producto_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    cantidad INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);

-- Insertar datos para las transacciones

-- Insertar datos en las cuentas de Alice y Bob
INSERT INTO Cuentas (cliente_id,saldo) VALUES
(1,1000.00), -- Bob con id de cliente 1
(2,2000.00); -- Alice con id de cliente 2

-- Insertar datos de transacciones de las cuentas
INSERT INTO Transacciones (cuenta_id, tipo_transaccion, monto) VALUES
(1,'Deposito',500.00), -- Deposito Bob
(1,'Retiro',200.00), -- Retio Bob
(2,'Deposito',1000.00), -- Deposito Alice
(2,'Retiro',500); -- Retiro de Alice

-- Insertar productos en la tabla de inventarios
INSERT INTO Productos(nombre,cantidad,precio) VALUES
('Laptop',10,1000.00),
('Telefono',20,500.00),
('Tablet',15,300.00);




