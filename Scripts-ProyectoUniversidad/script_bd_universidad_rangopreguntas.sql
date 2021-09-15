use bduniversidad;

CREATE TABLE RangoPreguntas (
    idRangoPreguntas CHAR(8) not null,
    nombre VARCHAR(45),
    puntajeCorrecta DOUBLE,
    puntajeIncorrecta DOUBLE,
    PRIMARY KEY (idRangoPreguntas)
);

drop table RangoPreguntas;
DELIMITER $$
CREATE PROCEDURE insertarRangoPreguntas(in id char(8), in nom varchar(45),in cor double, in inc double)
BEGIN
  insert into RangoPreguntas(idRangoPreguntas, nombre, puntajeCorrecta, puntajeIncorrecta) values (id,nom, cor, inc);
END$$
call insertarRangoPreguntas("RAN-001", "Conocimientos", 4.079, -1.021);
call insertarRangoPreguntas("RAN-002", "Aptitud Académica", 4.070, -1.019);

DELIMITER $$
CREATE PROCEDURE buscarRangoPreguntas(in id char(8))
BEGIN
  select * from RangoPreguntas where idRangoPreguntas=id;
END$$

call buscarRangoPreguntas("RAN-002");

DELIMITER $$
CREATE PROCEDURE mostrarRangoPreguntas()
BEGIN 
  select*from RangoPreguntas;
END$$

call mostrarRangoPreguntas();

DELIMITER $$
CREATE PROCEDURE mostrarRangoPreguntasPorNombre(in nom varchar(45))
BEGIN 
  select*from RangoPreguntas where nombre like concat(nom,"%");
END$$
call mostrarRangoPreguntasPorNombre("c");


DELIMITER $$
create procedure modificarRangoPreguntas(in id char(8), in nom varchar(45),in cor double, in inc double)
begin
  UPDATE RangoPreguntas SET nombre=nom, puntajeCorrecta=cor, puntajeIncorrecta=inc WHERE idRangoPreguntas=id;
end$$
call modificarRangoPreguntas("RAN-001", "Conocimientos", 4.079, -1.021);



DELIMITER $$
create procedure eliminarRangoPreguntas(in id char(8))
begin
  DELETE FROM rangoPreguntas where idRangoPreguntas=id;
end$$









