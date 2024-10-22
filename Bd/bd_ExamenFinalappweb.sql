drop database bd_ExamenFinalappweb;
Create database bd_ExamenFinalappweb;
use bd_ExamenFinalappweb;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    rol VARCHAR(50) NOT NULL,
    activo BOOLEAN NOT NULL
);

INSERT INTO usuario (codigo, password, email, rol, activo) 
VALUES ('U001', 'r8yZPX4YxvyK5DB5GaHGFfLmMFUITLQr/d/8e7Vg4ZQ', 'genesis@gmail.com', 'ADMIN', TRUE);
