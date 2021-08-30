use bduniversidad;

create table modalidad(
	idModalidad char(15) not null,
	nombre varchar(20) not null,
    primary key(idModalidad)
    
);
select * from modalidad;

DELIMITER $$
CREATE PROCEDURE insertar_modalidad(in idMod char(15), in nomb varchar(20))
BEGIN
  insert into modalidad(idModalidad,nombre) values (idMod,nomb);
END$$

call insertar_modalidad('MODALIDAD-001','ORDINARIO');
call insertar_modalidad('MODALIDAD-002','EXTRAORDINARIO');
call insertar_modalidad('MODALIDAD-003','CEPUNT');
call insertar_modalidad('MODALIDAD-004','TRASLADO');


DELIMITER $$
CREATE PROCEDURE buscarmodalidad(in idMod char(15))
BEGIN
  select * from modalidad where idModalidad=idMod;
END$$

call buscarmodalidad('MODALIDAD-001');

DELIMITER $$
CREATE PROCEDURE mostrarModalidad()
BEGIN 
  select*from modalidad;
END$$

call mostrarModalidad();

DELIMITER $$
create procedure modificarModalidad(in idMod char(15), in nomb varchar(20))
begin
  UPDATE modalidad SET nombre=nomb WHERE idModalidad=idMod;
end$$
call modificarModalidad('','');

DELIMITER $$
create procedure eliminarModalidad(in idMod char(15))
begin
  DELETE FROM modalidad where idModalidad=idMod;
end$$

call eliminarModalidad('MODALIDAD-001');