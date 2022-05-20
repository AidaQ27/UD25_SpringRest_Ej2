DROP table IF EXISTS departamento;
DROP table IF EXISTS empleado;

create table departamento(
	codigo int primary key NOT NULL,
	nombre varchar(250),
	presupuesto double(50));
	
create table empleado(
	dni varchar(10) primary key NOT NULL,
	nombre varchar(250),
	apellidos varchar(250),
	codigo_dept int,
	constraint empleado_fk foreign key (codigo_dept) references departamento (codigo) on delete cascade on update cascade
);

insert into departamento (codigo, nombre, presupuesto) values (123, 'RRHH' , 5000);
insert into departamento (codigo, nombre, presupuesto) values (225, 'Marketing', 6000);
insert into departamento (codigo, nombre, presupuesto) values (56, 'AudoVisual', 7000);
insert into departamento (codigo, nombre, presupuesto) values (13, 'Limpieza', 9000);


insert into empleado (dni, nombre, apellidos, codigo_dept) values ('39908825', 'Peppa', 'Pig', 123);
insert into empleado (dni, nombre, apellidos, codigo_dept) values ('39901425', 'Pepito', 'Grillo', 225);
insert into empleado (dni, nombre, apellidos, codigo_dept) values ('32208825', 'Maria', 'DelaO', 123);
insert into empleado (dni, nombre, apellidos, codigo_dept) values ('39998825', 'Martin', 'Pachecho', 13);
insert into empleado (dni, nombre, apellidos, codigo_dept) values ('39905872', 'Patrivia', 'Pig', 56);