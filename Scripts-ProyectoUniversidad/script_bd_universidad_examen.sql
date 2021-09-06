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

call insertarExamen("EX-0001", "2021-II", "2021-10-03", "AREA_A","MODD-01");
call insertarExamen("EX-0002", "2020-II", "2021-03-19", "AREA_D","MODD-03");
call insertarExamen("EX-0003", "2020-I", "2019-09-28", "AREA_B","MODD-02");
-- drop procedure insertarExamen;
DELIMITER $$
CREATE PROCEDURE buscarExamen(in id char(8))
BEGIN
  select * from Examen where idExamen=id;
END$$
call buscarExamen("EX-0001");

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

DELIMITER $$
create procedure eliminarExamen(in id char(8))
begin
  call eliminarClavesDeUnExamen(id);
  DELETE FROM examen where idExamen=id;
end$$
call eliminarExamen("EX-0004");
drop procedure eliminarExamen;


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



