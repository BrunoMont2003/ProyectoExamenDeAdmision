use bduniversidad;
-- drop procedure insertar_facultad;
-- drop table facultad;

create table facultad(
  idFacultad char(10) not null,
    nombreFacultad varchar(40) not null,
    idArea char(10) not null,
    primary key (idFacultad),
    foreign key (idArea) references areaU(idArea)
);

DELIMITER $$
CREATE PROCEDURE insertar_facultad(in idFa char(10), in nombF varchar(40), in idAr char(10))
BEGIN
  insert into facultad(idFacultad,nombreFacultad,idArea) values (idFa,nombF,idAr);
END$$

call insertar_facultad('FACD-01','Ciencias Agropecuarias','AREA_B');
call insertar_facultad('FACD-02','Ciencias Biologicas','AREA_A');
call insertar_facultad('FACD-03','Ciencias Economicas','AREA_D');
call insertar_facultad('FACD-04','Ciencias Fisicas Y Matematicas','AREA_B');
call insertar_facultad('FACD-05','Ciencias Sociales','AREA_C');
call insertar_facultad('FACD-06','Derecho Y Ciencias Politicas','AREA_C');
call insertar_facultad('FACD-07','Educacion Y Ciencias De La Comunicacion','AREA_C');
call insertar_facultad('FACD-08','Enfermeria','AREA_A');
call insertar_facultad('FACD-09','Estomatologia','AREA_A');
call insertar_facultad('FACD-10','Farmacia Y Bioquimica','AREA_A');
call insertar_facultad('FACD-11','Ingenieria','AREA_B');
call insertar_facultad('FACD-12','Ingenieria Quimica','AREA_B');
call insertar_facultad('FACD-13','Medicina','AREA_A');
call insertar_facultad('FACD-14','Arquitectura','AREA_B');

DELIMITER $$
CREATE PROCEDURE mostrarFacultades()
BEGIN 
  select*from facultad;
END$$

call mostrarFacultades();


DELIMITER $$
create procedure buscarFacultad(in idFac char(10))
begin
  select * from facultad where idfacultad=idFac;
end$$
call buscarFacultad("FACD-02");

DELIMITER $$
CREATE PROCEDURE buscar_facultad(in idare char(10))
BEGIN
	select * from facultad where concat(idFacultad,nombreFacultad,idArea) like concat('%','%',idare);
END$$

call buscar_facultad('AREA_A');

-- drop procedure buscar_area;

DELIMITER $$
create procedure modificarFacultad(in idFa char(10), in nombF varchar(40), in idAr char(10))
begin
  UPDATE facultad SET nombreFacultad=nombF, idArea=idAr WHERE idFacultad=idFa;
end$$
call modificarFacultad('FACD-13','MedicinaGod','AREA_A');


DELIMITER $$
create procedure eliminarFacultad(in idFa char(10))
begin
  DELETE FROM facultad where idFacultad=idFa;
end$$

call eliminarFacultad("FACD-13");
