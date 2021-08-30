
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
    PRIMARY KEY (idPostulante),
    FOREIGN KEY (idCarrera)
        REFERENCES carrera (idCarrera),
    FOREIGN KEY (idAula)
        REFERENCES aula (idAula)
);

SELECT 
    *
FROM
    postulante;
drop procedure insertar_postulante;
DELIMITER $$
CREATE PROCEDURE insertar_postulante(in idPos char(10), in nombP varchar(40), in apeM varchar(20), in apeF varchar(20), in dni char(8), in idcar char(10),in idla char(10)) 
BEGIN
  insert into postulante(idPostulante, nombrePostulante, apellido_paterno, apellido_materno, dni, idCarrera, idAula) values (idPos, nombP, apeM, apeF, dni, idcar, idla);
END$$

call insertar_postulante("P-00000001","DARREN CARLOS","ABAL","MENDOZA","76512311","SLUD-01","AULA-001");
S