create database S17;
use S17;
drop  table persona;
CREATE TABLE persona (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Dni VARCHAR(8),
    Nombres VARCHAR(50),
    edad INT,
    direccion VARCHAR(50),
    telefono INT
);

INSERT INTO persona (Dni, Nombres, edad, direccion, telefono)
VALUES ('62040302', 'Juan',20,'direccion2',987654654);

insert into persona
	(Dni, Nombres, edad, direccion, telefono)
values
	(87654321, 'Henry', 18, 'nuevo ayacucho', 960599131),
    (85476123, 'Daniel', 20, 'san vicente', 987654321);
    
select * from persona;