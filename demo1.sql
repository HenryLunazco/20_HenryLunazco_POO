Create database demo1;

use demo1;

Drop table persona;

create table persona
(
	id int auto_increment primary key,
    nombre varchar(90),
    telefono char(9)
);

show columns in persona;

INSERT INTO persona
	(nombre, telefono)
values
	('Henry', '987654321'),
    ('Carlos', '958746231');

select * from persona;