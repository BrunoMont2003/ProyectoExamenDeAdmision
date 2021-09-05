
use bduniversidad;

create table modalidad(
	idModalidad char(15) not null,
	nombre varchar(20) not null,
    primary key(idModalidad)
);
drop table modalidad;
drop procedure insertar_modalidad;

select * from modalidad;

DELIMITER $$
CREATE PROCEDURE insertar_modalidad(in idMod char(10), in nomb varchar(20))
BEGIN
  insert into modalidad(idModalidad,nombre) values (idMod,nomb);
END$$
-- drop procedure insertar_modalidad;


DELIMITER $$
CREATE PROCEDURE buscarmodalidad(in idMod char(10))
BEGIN
  select * from modalidad where idModalidad=idMod;
END$$


DELIMITER $$
CREATE PROCEDURE mostrarModalidad()
BEGIN 
  select*from modalidad;
END$$

call mostrarModalidad();

DELIMITER $$
create procedure modificarModalidad(in idMod char(10), in nomb varchar(20))
begin
  UPDATE modalidad SET nombre=nomb WHERE idModalidad=idMod;
end$$

DELIMITER $$
create procedure eliminarModalidad(in idMod char(10))
begin
  DELETE FROM modalidad where idModalidad=idMod;
end$$
drop procedure eliminarModalidad;
call eliminarModalidad("MODD-01");
call eliminarModalidad("MODD-02");
call eliminarModalidad("MODD-03");
call eliminarModalidad("MODD-04");

DELIMITER $$
CREATE PROCEDURE buscar_modalidad(in idMod char(10))
BEGIN
  select * from modalidad where concat(idModalidad,nombre) like concat(idMod,'%');
END$$

call insertar_modalidad('MODD-01','ORDINARIO');
call insertar_modalidad('MODD-02','EXCELENCIA');
call insertar_modalidad('MODD-03','DISCAPACITADOS');
call insertar_modalidad('MODD-04','CEPUNT');
