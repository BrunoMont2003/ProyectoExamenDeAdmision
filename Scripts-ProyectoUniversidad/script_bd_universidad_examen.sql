use bduniversidad;

create table examen(
	idExamen char(8) not null,
    semestre varchar(10),
    fecha date,
    idArea char(10),
    idModalidad char(15),
    primary key(idExamen),
    foreign key(idArea) references areau(idArea),
	foreign key(idModalidad) references modalidad(idModalidad)
);
drop table examen;


DELIMITER $$
CREATE PROCEDURE insertarExamen(in id char(8),in sem varchar(10), in f date, IN idAr char(10), in idM char(15))
BEGIN
  insert into Examen(idExamen, semestre, fecha, idArea, idModalidad) values (id,sem, f, idAr, idM);
END$$

call insertarExamen("EX-0001", "2021-II", "2021-05-27", "AREA_A","MODD-01");

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
create procedure modificarExamen(in id char(8), in a char(4),in sem varchar(10), in f date, IN idAr char(10), in idM char(15))
begin
  UPDATE Examen SET año=a, semestre=sem, fecha=f, idArea = idAr, idModalidad = idM WHERE idExamen=id;
end$$


DELIMITER $$
create procedure eliminarExamen(in id char(8))
begin
  DELETE FROM examen where idExamen=id;
end$$