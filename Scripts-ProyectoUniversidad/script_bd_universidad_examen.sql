use bduniversidad;

CREATE TABLE examen (
    idExamen CHAR(8) NOT NULL,
    semestre VARCHAR(10),
    fecha DATE,
    idArea CHAR(10),
    idModalidad CHAR(15),
    PRIMARY KEY (idExamen),
    FOREIGN KEY (idArea)
        REFERENCES areau (idArea),
    FOREIGN KEY (idModalidad)
        REFERENCES modalidad (idModalidad)
);
drop table examen;


DELIMITER $$
CREATE PROCEDURE insertarExamen(in id char(8),in sem varchar(10), in f date, IN idAr char(10), in idM char(15))
BEGIN
  insert into Examen(idExamen, semestre, fecha, idArea, idModalidad) values (id,sem, f, idAr, idM);
END$$


call insertarExamen("EX-0001", "2021-I", "2020-11-05", "AREA_A","MODD-04");
call insertarExamen("EX-0002", "2021-I", "2020-11-06", "AREA_B","MODD-04");
call insertarExamen("EX-0003", "2021-I", "2020-11-07", "AREA_C","MODD-04");
call insertarExamen("EX-0004", "2021-I", "2020-11-07", "AREA_D","MODD-04");
call insertarExamen("EX-0005", "2021-I", "2020-11-21", "AREA_A","MODD-02");
call insertarExamen("EX-0006", "2021-I", "2020-11-21", "AREA_B","MODD-02");
call insertarExamen("EX-0007", "2021-I", "2020-11-21", "AREA_C","MODD-02");
call insertarExamen("EX-0008", "2021-I", "2020-11-21", "AREA_D","MODD-02");
call insertarExamen("EX-0009", "2021-I", "2020-11-21", "AREA_A","MODD-03");
call insertarExamen("EX-0010", "2021-I", "2020-11-21", "AREA_B","MODD-03");
call insertarExamen("EX-0011", "2021-I", "2020-11-21", "AREA_C","MODD-03");
call insertarExamen("EX-0012", "2021-I", "2020-11-21", "AREA_D","MODD-03");
call insertarExamen("EX-0013", "2021-I", "2020-12-02", "AREA_A","MODD-01");
call insertarExamen("EX-0014", "2021-I", "2020-11-03", "AREA_B","MODD-01");
call insertarExamen("EX-0015", "2021-I", "2020-11-04", "AREA_C","MODD-01");
call insertarExamen("EX-0016", "2021-I", "2020-11-05", "AREA_D","MODD-01");
call insertarExamen("EX-0017", "2021-II", "2021-05-12", "AREA_A","MODD-02");
call insertarExamen("EX-0018", "2021-II", "2021-05-12", "AREA_B","MODD-02");
call insertarExamen("EX-0019", "2021-II", "2021-05-12", "AREA_C","MODD-02");
call insertarExamen("EX-0020", "2021-II", "2021-05-12", "AREA_D","MODD-02");
call insertarExamen("EX-0021", "2021-II", "2021-05-12", "AREA_A","MODD-03");
call insertarExamen("EX-0022", "2021-II", "2021-05-12", "AREA_B","MODD-03");
call insertarExamen("EX-0023", "2021-II", "2021-05-12", "AREA_C","MODD-03");
call insertarExamen("EX-0024", "2021-II", "2021-05-12", "AREA_D","MODD-03");
call insertarExamen("EX-0025", "2021-II", "2021-05-13", "AREA_A","MODD-04");
call insertarExamen("EX-0026", "2021-II", "2021-05-14", "AREA_B","MODD-04");
call insertarExamen("EX-0027", "2021-Ii", "2021-05-15", "AREA_C","MODD-04");
call insertarExamen("EX-0028", "2021-II", "2021-05-15", "AREA_D","MODD-04");
call insertarExamen("EX-0029", "2021-II", "2021-05-27", "AREA_A","MODD-01");
call insertarExamen("EX-0030", "2021-II", "2021-05-28", "AREA_B","MODD-01");
call insertarExamen("EX-0031", "2021-Ii", "2021-05-29", "AREA_C","MODD-01");
call insertarExamen("EX-0032", "2021-II", "2021-05-29", "AREA_D","MODD-01");

select * from examen where idarea="AREA_B" and idModalidad="MODD-04";

-- drop procedure insertarExamen;
DELIMITER $$
CREATE PROCEDURE buscarExamen(in id char(8))
BEGIN
  select * from Examen where idExamen=id;
END$$
call buscarExamen("EX-0033");

DELIMITER $$
CREATE PROCEDURE buscarExamenPorSemestreYCarreraYModalidad(in sem char(10), in car char(10), in moda char(15))
BEGIN
  select * from Examen as ex
  inner join areau as a
  on ex.idArea = a.idArea
  inner join facultad as f
  on a.idArea = f.idArea
  inner join carrera as c
  on f.idFacultad=c.idFacultad
  where semestre=sem and idmodalidad=moda and c.idCarrera=car;
END$$
drop procedure buscarExamenPorSemestreYCarreraYModalidad;
call buscarExamenPorSemestreYCarreraYModalidad("2021-II","CBIO-04", "MODD-01");


DELIMITER $$
CREATE PROCEDURE mostrarExamen()
BEGIN 
  select*from Examen;
END$$
call mostrarExamen;
-- drop procedure mostrarExamen;
DELIMITER $$
create procedure modificarExamen(in id char(8), in sem varchar(10), in f date, IN idAr char(10), in idM char(15))
begin
  -- UPDATE CLAVE set idExamen = id where idExamen = id;
  UPDATE Examen SET semestre=sem, fecha=f, idArea = idAr, idModalidad = idM WHERE idExamen=id;
end$$
drop procedure modificarexamen;
call modificarExamen("EX-0001", "2021-II", "2021-06-27", "AREA_B","MODD-01");
/*
DELIMITER $$
create procedure eliminarExamen(in id char(8))
begin
  call eliminarClavesDeUnExamen(id);
  call eliminarRespuestasDeUnExamen(id);
  call eliminarExamenDeUnPostulante(id);
  DELETE FROM examen where idExamen=id;
end$$
call eliminarExamen("EX-0003");
drop procedure eliminarExamen;
*/
DELIMITER $$
create procedure eliminarExamen(in id char(8))
begin
  call eliminarClavesDeUnExamen(id);
  call eliminarRespuestasDeUnExamen(id);
  call eliminarVacantesDeUnExamen(id);
  DELETE from postulante_examen where idExamen=id;
  DELETE from examen where idExamen=id;
end$$
call eliminarExamen("EX-0003");

DELIMITER $$
CREATE PROCEDURE mostrarExamenesDeUnaModalidad(in id char(15))
BEGIN
  select * from Examen where idModalidad=id;
END$$
call mostrarExamenesDeunamodalidad("MODD-01");


DELIMITER $$
CREATE PROCEDURE mostrarExamenesDeUnArea(in id char(15))
BEGIN
  select * from Examen where idArea=id;
END$$
call mostrarExamenesDeUnArea("AREA_B");



DELIMITER $$
CREATE PROCEDURE mostrarExamenesDeUnaModalidadYArea(in idM char(15), in idA char(15))
BEGIN
  select * from Examen where idModalidad=idM and idArea=idA;
END$$

call mostrarExamenesDeUnaModalidadYArea("MODD-01","AREA_A");

show variables like "max_connections";
set global max_connections = 1500;
