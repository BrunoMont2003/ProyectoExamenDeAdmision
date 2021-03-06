use bduniversidad;
-- drop procedure insertar_carreras;
drop table carrera;

create table carrera(
	idCarrera char(10) not null, 
    nombreCarrera varchar(40) not null,
    idFacultad char(10) not null,
    primary key (idCarrera),
    foreign key(idFacultad) references facultad(idFacultad) ON UPDATE CASCADE ON DELETE CASCADE
);
SET FOREIGN_KEY_CHECKS=0; DROP TABLE carrera; SET FOREIGN_KEY_CHECKS=1;

DELIMITER $$
CREATE PROCEDURE insertar_carreras(in idcar char(10), in nombcar varchar(40), in idFac char(10))
BEGIN
  insert into carrera(idCarrera,nombreCarrera,idFacultad) values (idcar,nombcar,idFac);
END$$



call insertar_carreras('CBIO-01','Biologia','FACD-02');
call insertar_carreras('CBIO-02','Biologia Pesquera','FACD-02');
call insertar_carreras('CBIO-03','Microbiologia y Parasitologia','FACD-02');
call insertar_carreras('CBIO-04','Farmacia y Bioquimica','FACD-02');
call insertar_carreras('CBIO-05','Ingenieria Quimica','FACD-12');
call insertar_carreras('CBIO-06','Ingenieria Ambiental','FACD-11');
call insertar_carreras('EDCC-01','Educacion Inicial','FACD-07');
call insertar_carreras('EDCC-02','Educacion Primaria','FACD-07');
call insertar_carreras('EDCC-03','Educacion Secundaria','FACD-07');
call insertar_carreras('EDCC-04','Ciencias De La Comunicacion','FACD-07');
call insertar_carreras('SLUD-01','Medicina','FACD-13');
call insertar_carreras('SLUD-02','Estomatologia','FACD-09');
call insertar_carreras('SLUD-03','Enfermeria','FACD-08');
call insertar_carreras('CCSC-01','Antropologia','FACD-05');
call insertar_carreras('CCSC-02','Arqueologia','FACD-05');
call insertar_carreras('CCSC-03','Trabajo Social','FACD-05');
call insertar_carreras('CCSC-04','Turismo','FACD-05');
call insertar_carreras('CCSC-05','Historia','FACD-05');
call insertar_carreras('CCSC-06','Arquitectura y Urbanismo','FACD-14');
call insertar_carreras('CFSM-01','Estadistica','FACD-04');
call insertar_carreras('CFSM-02','Matematica','FACD-04');
call insertar_carreras('CFSM-03','Fisica','FACD-04');
call insertar_carreras('CFSM-04','Ingenieria Informatica','FACD-04');
call insertar_carreras('CCEE-01','Administracion','FACD-03');
call insertar_carreras('CCEE-02','Contabilidad','FACD-03');
call insertar_carreras('CCEE-03','Economia','FACD-03');
call insertar_carreras('DOCP-01','Derecho','FACD-06');
call insertar_carreras('DOCP-02','Ciencias Politcas y Gobernabilidad','FACD-06');
call insertar_carreras('INGN-01','Ingenieria Industrial','FACD-11');
call insertar_carreras('INGN-02','Ingenieria Mecanica','FACD-11');
call insertar_carreras('INGN-03','Ingenieria Metalurgica','FACD-11');
call insertar_carreras('INGN-04','Ingenieria Materiales','FACD-11');
call insertar_carreras('INGN-05','Ingenieria Sistemas','FACD-11');
call insertar_carreras('INGN-06','Ingenieria Minas','FACD-11');
call insertar_carreras('INGN-07','Ingenieria Mecatronica','FACD-11');
call insertar_carreras('INGN-08','Ingenieria Civil','FACD-11');
call insertar_carreras('CCAG-01','Ingenieria Agroindustrial','FACD-01');
call insertar_carreras('CCAG-02','Ingenieria Agricola','FACD-01');
call insertar_carreras('CCAG-03','Ingenieria Agronoma','FACD-01');
call insertar_carreras('CCAG-04','Ingenieria Zootecnia','FACD-01');


DELIMITER $$
CREATE PROCEDURE mostrarCarreras()
BEGIN 
  select*from carrera;
END$$

call mostrarCarreras();

DELIMITER $$
create procedure buscarCarrera(in idCar char(10))
begin
  select * from carrera where idcarrera=idCar;
end$$
call buscarCarrera("INGN-05");

DELIMITER $$
create procedure buscarCarreraPorNombre(in nom varchar(40))
begin
  select * from carrera where nombreCarrera=nom;
end$$

DELIMITER $$
CREATE PROCEDURE buscar_carrera(in idfac char(10))
BEGIN
	select * from carrera where concat(idCarrera,nombreCarrera,idFacultad) like concat('%','%',idfac);
END$$

DELIMITER $$
create procedure modificarCarrera(in idCar char(10), in nombCar varchar(40), in idfac char(10))
begin
  UPDATE carrera SET nombreCarrera=nombCar, idFacultad=idfac WHERE idCarrera=idCar;
end$$

DELIMITER $$
create procedure eliminarCarrera(in idCar char(10))
begin
  DELETE FROM carrera where idCarrera=idCar;
end$$

DELIMITER $$
create procedure eliminarCarrerasDeUnaFacultad(in idFac char(15))
begin
  DELETE FROM Carrera where idFacultad=idFac;
end$$
call eliminarCarrerasDeUnaFacultad("FACD-13");


DELIMITER $$
CREATE PROCEDURE mostrarCarrerasDeUnaFacultad(in id char(10))
BEGIN
  select * from Carrera where idFacultad=id;
END$$
-- drop procedure mostrarCarrerasDeUnaFacultad;
call mostrarCarrerasDeUnaFacultad("FACD-13");


DELIMITER $$
CREATE PROCEDURE contarCarrerasDeUnaFacultad(in id char(10))
BEGIN
  select count(*) from Carrera where idFacultad=id;
END$$
-- drop procedure mostrarCarrerasDeUnaFacultad;
call contarCarrerasDeUnaFacultad("FACD-01");


DELIMITER $$
CREATE PROCEDURE mostrarCarrerasDeUnArea(in id char(10))
BEGIN
  select * from Carrera as c
  inner join facultad as f
  on f.idfacultad=c.idFacultad
  inner join areau as a
  on a.idArea = f.idArea
  where a.idArea=id;
END$$
drop procedure mostrarCarrerasDeUnArea;
call mostrarCarrerasDeUnArea("AREA_A");



DELIMITER $$
CREATE PROCEDURE buscarAreaDeUnaCarrera(in idCar char(10))
BEGIN
  select a.idArea from areau as a
  inner join facultad as f
  on a.idArea=f.idArea
  inner join carrera as c
  on c.idFacultad=f.idFacultad
  where idCarrera = idCar;
END$$
drop procedure buscarAreaDeUnaCarrera;
call buscarAreaDeUnaCarrera("INGN-08");