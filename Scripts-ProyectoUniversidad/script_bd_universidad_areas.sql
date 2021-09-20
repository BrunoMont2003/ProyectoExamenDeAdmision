create database bduniversidad;
use bduniversidad;

-- drop database bduniversidad;

create table areaU(
	idArea char(10) not null,
	nombreArea varchar(40) not null,
    primary key(idArea)
);

DELIMITER $$
CREATE PROCEDURE insertar_areaU(in idAr char(10), in nombA varchar(40))
BEGIN
  insert into areaU(idArea,nombreArea) values (idAr,nombA);
END$$

call insertar_areaU('AREA_A','Ciencias De La Vidad Y La Salud');
call insertar_areaU('AREA_B','Ciencias Basicas Y Tecnologicas');
call insertar_areaU('AREA_C','Ciencias De La Persona');
call insertar_areaU('AREA_D','Ciencias Economicas');


DELIMITER $$
create procedure buscarArea(in idAr char(10))
begin
	select * from areau where idarea=idar;
end$$
call buscarArea("AREA_A");

DELIMITER $$
create procedure buscar_Area(in idAr char(10))
begin
	select * from areau where idarea like idar;
end$$


DELIMITER $$
create procedure modificarArea(in idar char(10), in nom varchar(40))
begin
	UPDATE areaU SET nombreArea=nom WHERE idArea=idar;
end$$
-- drop procedure modificarArea;
call modificarArea("AREA_A", "Ciencias De La Vida Y La Salud");


DELIMITER $$
create procedure eliminarArea(in idar char(10))
begin
	
	DELETE FROM areau where idarea=idar;
    
end$$
call eliminarArea("AREA_A");



DELIMITER $$
create procedure eliminarArea(in idar char(10))
begin
	-- voy a crear la cascada
    
end$$
call eliminarArea("AREA_A");



DELIMITER $$
CREATE PROCEDURE mostrarAreas()
BEGIN 
  select*from areaU;
END$$
call mostrarAreas();


-- drop table areaU;