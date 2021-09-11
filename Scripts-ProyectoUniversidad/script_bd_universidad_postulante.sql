
use bduniversidad;
drop table postulante;

CREATE TABLE postulante (
    idPostulante CHAR(10) NOT NULL,
    nombrePostulante VARCHAR(40) NOT NULL,
    apellido_paterno VARCHAR(20) NOT NULL,
    apellido_materno VARCHAR(20) NOT NULL,
    dni CHAR(8),
    idCarrera CHAR(10),
    idAula CHAR(10),
    idModalidad CHAR(15),
    PRIMARY KEY (idPostulante),
    FOREIGN KEY (idCarrera) REFERENCES carrera (idCarrera),
    FOREIGN KEY (idAula) REFERENCES aula (idAula),
    FOREIGN KEY (idModalidad) REFERENCES modalidad(idModalidad)
);
drop table postulante;
SELECT *FROM postulante;
drop procedure insertar_postulante;
DELIMITER $$
CREATE PROCEDURE insertar_postulante(in idPos char(10), in nombP varchar(40), in apeM varchar(20), in apeF varchar(20), in dni char(8), in idcar char(10),in idla char(10), in idmo char(10)) 
BEGIN
  insert into postulante(idPostulante, nombrePostulante, apellido_paterno, apellido_materno, dni, idCarrera, idAula, idModalidad) values (idPos, nombP, apeM, apeF, dni, idcar, idla, idmo);
END$$


call insertar_postulante("P-00000001","DARREN CARLOS","ABAL","MENDOZA","76512311","CBIO-01","A-00001","MODD-01");
call insertar_postulante("P-00000002","JORGE JUNIOR","VIGO","VILLALOBOS","72485759","CBIO-01","A-00001","MODD-01");
call insertar_postulante("P-00000003","DIEGO ARON","MURILLO","LOZANO","72174856","CBIO-01","A-00001","MODD-01");
call insertar_postulante("P-00000004","STEVEN ALEXANDER","GARCIA","CRUZ","70182946","CBIO-01","A-00001","MODD-01");
call insertar_postulante("P-00000005","CARLOS EDUARDO","MALAVER","CASTAÑEDA","70197412","CBIO-01","A-00001","MODD-01");
DELIMITER $$
CREATE PROCEDURE mostrarPostulantes()
BEGIN 
  select*from postulante;
END$$
-- drop procedure mostraPostulantes;
call mostrarPostulantes();

call buscarpostulante('P-00000006');
DELIMITER $$
CREATE PROCEDURE buscarpostulante(in idPos char(10))
BEGIN
  select * from postulante where idPostulante=idPos;
END$$

-- drop procedure modificarPostulante;
DELIMITER $$
create procedure modificarPostulante(in idPos char(10), in nombP varchar(40), in apeM varchar(20), in apeF varchar(20), in dni char(8), in idcar char(10),in idla char(10), in idmo char(10))
begin
  UPDATE postulante SET nombrePostulante=nombP, apellido_paterno=apeM, apellido_materno=apeF, dni=dni, idCarrera=idcar, idAula=idla, idModalidad=idmo  WHERE idPostulante=idPos;
end$$

call modificarPostulante("P-00000001","DARREN CARLOS","ABALES","MENDOZA","76512321","CBIO-01","A-00001","MODD-01");

DELIMITER $$
create procedure eliminarPostulante(in idPos char(10))
begin
  call eliminarRespuestasDeUnPostulante(idPos);
  DELETE FROM postulante where idPostulante=idPos;
end$$
drop procedure eliminarPostulante;
call eliminarPostulante("P-00000006");