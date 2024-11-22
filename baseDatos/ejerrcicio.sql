-- Crear tabla de cuentas bancarias
DROP DATABASE IF EXISTS ejerrcicio;
CREATE DATABASE ejerrcicio;
USE ejerrcicio;

DROP TABLE IF EXISTS cuentas;

CREATE TABLE cuentas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    balance DECIMAL(10, 2)
);

-- Insertar los datos de Alice y Bob
INSERT INTO cuentas (nombre, balance) VALUES ('Alice', 500.00);
INSERT INTO cuentas (nombre, balance) VALUES ('Bob', 300.00);

-- Desactivar el autocommit
SET AUTOCOMMIT = 0;

-- Iniciar la transacción
START TRANSACTION;

-- Restar $100 de la cuenta de Alice (id = 1)
UPDATE cuentas SET balance = balance - 100 WHERE id = 1;

-- Verificar si el balance de Alice es suficiente
SELECT balance FROM cuentas WHERE id = 1;

-- Si Alice tiene suficiente saldo, sumar $100 a la cuenta de Bob (id = 2)
UPDATE cuentas SET balance = balance + 100 WHERE id = 2;




DROP TABLE IF EXISTS movimientos;
-- Crear tabla de movimientos para registrar transferencias
CREATE TABLE movimientos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cuenta_id INT,
    monto DECIMAL(10, 2),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (cuenta_id) REFERENCES cuentas(id)
);

-- Registrar los movimientos en la tabla "movimientos"
INSERT INTO movimientos (cuenta_id, monto) VALUES (1, -100); -- Alice envía $100
INSERT INTO movimientos (cuenta_id, monto) VALUES (2, 100); -- Bob recibe $100

-- Confirmar la transacción
COMMIT;
-- Volver a activar el autocommit
SET AUTOCOMMIT = 1;

-- Verificar los balances después de la transacción
SELECT * FROM cuentas;
-- Verificar los registros de movimientos
SELECT * FROM movimientos;

-- Agregando dos cuentas mas
INSERT INTO cuentas (nombre, balance) VALUES ('Carlos', 1000.00);
INSERT INTO cuentas (nombre, balance) VALUES ('Davo', 1500.00);

-- Iniciando transaccion
SET AUTOCOMMIT = 0;
START TRANSACTION;

-- Restando 500 de la cuenta de Davo
UPDATE cuentas set balance = balance-500 where id=4;

-- Restando 500 de la cuenta de Carlos
UPDATE cuentas set balance = balance-500 where id=3;

-- Verificar sus saldos
SELECT balance FROM cuentas WHERE id = 3;

-- Si tienen saldo suficiente depositar a la cuenta de Bob
UPDATE cuentas SET balance = balance + 500 WHERE id = 2;


SELECT balance FROM cuentas WHERE id = 4;
-- Si tienen saldo suficiente depositar a la cuenta de Bob
UPDATE cuentas SET balance = balance + 500 WHERE id = 2;


INSERT INTO movimientos (cuenta_id, monto) VALUES (3, -500); -- Alice envía $100

INSERT INTO movimientos (cuenta_id, monto) VALUES (4, -500); -- Bob recibe$100
COMMIT;
-- Volver a activar el autocommit
SET AUTOCOMMIT = 1;

SELECT * FROM cuentas;

SELECT * FROM movimientos;

SET AUTOCOMMIT=0;
UPDATE cuentas SET balance = balance-500 WHERE id=1;

SELECT * FROM cuentas;
ROLLBACK; -- Cancelar la operacion
SELECT * FROM cuentas;

COMMIT;
SET AUTOCOMMIT =1;
