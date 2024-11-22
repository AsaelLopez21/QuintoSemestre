-- Crear tabla de cuentas bancarias
DROP DATABASE IF EXISTS aislamiento;
CREATE DATABASE aislamiento;
USE aislamiento;

DROP TABLE IF EXISTS cuentas;

CREATE TABLE cuentas (
    cuentas_id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT NOT NULL,
    saldo DECIMAL(15,2) DEFAULT 0.0
);


DROP TABLE IF EXISTS transacciones;
-- Crear tabla de movimientos para registrar transferencias
CREATE TABLE transacciones (
	transaccion_id INT PRIMARY KEY AUTO_INCREMENT,
    cuenta_id INT NOT NULL,
    tipo_transaccion ENUM('Depósito','Retiro') NOT NULL,
    monto DECIMAL(15,2) NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (cuenta_id) REFERENCES cuentas(cuentas_id)
);

INSERT INTO cuentas(cliente_id,saldo) VALUES (1,1000.00),(2,2000.00);

