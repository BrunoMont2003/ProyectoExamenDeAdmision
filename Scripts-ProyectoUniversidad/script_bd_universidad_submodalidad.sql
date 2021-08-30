use bduniversidad;

create table submodalidad(
	idSubmodalidad char(15) not null,
	descripcion varchar(30) not null,
    idModalidad char(15) not null,
    primary key(idSubmodalidad),
    foreign key(idModalidad) references modalidad(idModalidad)  
);
-- drop table submodalidad;
select * from submodalidad;

DELIMITER $$
CREATE PROCEDURE insertar_submodalidad(in idSub char(15), in des varchar(30), in idMod char(15))
BEGIN
  insert into submodalidad(idSubmodalidad,descripcion, idModalidad) values (idSub,des, idMod);
END$$
-- drop procedure insertar_submodalidad;
call insertar_submodalidad('SUBMOD-001','QUINTO DE SECUNDARIA','MODALIDAD-001');
call insertar_submodalidad('SUBMOD-002','PREMIOS DE EXCELENCIA','MODALIDAD-002');
call insertar_submodalidad('SUBMOD-003','DISCAPACITADOS','MODALIDAD-002');
call insertar_submodalidad('SUBMOD-004','DEPORTISTAS','MODALIDAD-002');
call insertar_submodalidad('SUBMOD-005','VICTIMAS DE VIOLENCIA','MODALIDAD-002');

DELIMITER $$
CREATE PROCEDURE buscarSubmodalidad(in idSub char(15))
BEGIN
  select * from submodalidad where idSubModalidad=idSub;
END$$

call buscarSubmodalidad('SUBMOD-001');

DELIMITER $$
CREATE PROCEDURE mostrarSubModalidad()
BEGIN 
  select*from submodalidad;
END$$

call mostrarSubModalidad();

DELIMITER $$
create procedure modificarSubModalidad(in idSub char(15), in des varchar(30), in idMod char(15))
begin
  UPDATE Submodalidad SET descripcion=des, idModalidad=idMod WHERE idSubModalidad=idSub;
end$$
drop procedure modificarSubModalidad;
call modificarSubModalidad('SUBMOD-005','VICTIMAS DE VIOLENCIAs','MODALIDAD-002');

DELIMITER $$
create procedure eliminarSubModalidad(in idSub char(15))
begin
  DELETE FROM Submodalidad where idSubModalidad=idSub;
end$$

call eliminarSubModalidad('SUBMOD-005');