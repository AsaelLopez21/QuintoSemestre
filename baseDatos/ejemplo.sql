DROP database IF EXISTS EJEMPLO; 

CREATE DATABASE EJEMPLO;
USE EJEMPLO;
SET SQL_SAFE_UPDATES = 0;
DROP TABLE IF EXISTS cuentas;
CREATE TABLE cuentas (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	balance DECIMAL(10, 2)
);

DROP TABLE IF EXISTS movimientos;
CREATE TABLE movimientos (
	id INT AUTO_INCREMENT PRIMARY KEY,
	cuenta_id INT,
	monto DECIMAL(10, 2),
	fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (cuenta_id) REFERENCES cuentas(id)
);

-- Insertar los datos de Alice y Bob
INSERT INTO cuentas (nombre, balance) VALUES ('Alice', 500.00);
INSERT INTO cuentas (nombre, balance) VALUES ('Bob', 300.00);

DELIMITER $$
CREATE PROCEDURE TransferirFondos(IN cuenta_origen VARCHAR(100), IN cuenta_destino VARCHAR(100), IN monto DECIMAL(10, 2))
BEGIN
 DECLARE saldo_alice DECIMAL(10, 2);
 	DECLARE error_msg VARCHAR(255);
START TRANSACTION;
SELECT balance INTO saldo_alice FROM cuentas WHERE nombre = cuenta_origen FOR UPDATE;
IF saldo_alice < monto THEN
SET error_msg = CONCAT('Error: Saldo insuficiente en la cuenta de',cuenta_origen, '. Transacción cancelada.');
 ROLLBACK;
 SELECT error_msg AS resultado;
 ELSE
UPDATE cuentas
 SET balance = balance - monto WHERE nombre = cuenta_origen;
UPDATE cuentas  SET balance = balance + monto
 WHERE nombre = cuenta_destino;
INSERT INTO movimientos (cuenta_id, monto)  SELECT id, -monto FROM cuentas WHERE nombre = cuenta_origen;
INSERT INTO movimientos (cuenta_id, monto) SELECT id, monto FROM cuentas WHERE nombre = cuenta_destino;
COMMIT;
 SELECT CONCAT('Transacción exitosa: ', monto, ' transferidos de ', cuenta_origen, ' a ', cuenta_destino) AS resultado;
 END IF;
END $$
DELIMITER ;
CALL TransferirFondos('Alice', 'Bob', 200);