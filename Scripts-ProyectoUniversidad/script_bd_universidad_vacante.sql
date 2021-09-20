USE BDUNIVERSIDAD;
CREATE TABLE VACANTE (
    idPostulante CHAR(10) NOT NULL,
    idExamen CHAR(8) NOT NULL,
    PRIMARY KEY (idPostulante, idExamen),
    FOREIGN KEY (idPostulante) 
        REFERENCES Postulante (idPostulante) ON UPDATE CASCADE ON DELETE CASCADE ,
    FOREIGN KEY (idExamen)
        REFERENCES Examen (idExamen) ON UPDATE CASCADE ON DELETE CASCADE
);

drop table vacante;
DELIMITER $$
create procedure insertarVacante(in idPos char(10), in idEx char(8))
BEGIN
	insert into VACANTE(idPostulante, idExamen) values (idPos,idEx);
END $$
drop procedure insertarVacante;
call insertarVacante("P-00000462","EX-0002");

DELIMITER $$
create procedure buscarVacantePorPostulanteYExamen(in idPos char(10), in idEx char(8))
BEGIN
	select * from VACANTE where idPostulante = idPos and idExamen = idEx;
END $$
call buscarVacantePorPostulanteYExamen("P-00000462","EX-0002");

DELIMITER $$
create procedure buscarVacantesDeExamen(in idEx char(8))
BEGIN
	select * from VACANTE where idExamen = idEx;
END $$
-- drop procedure buscarVacantesDeExamen;
call buscarVacantesDeExamen("EX-0002");



DELIMITER $$
create procedure buscarVacantesDeUnPostulante(in idPos char(10))
BEGIN
	select * from VACANTE where idPostulante = idPos;
END $$
-- drop procedure buscarVacantesDeUnPostulante;
call buscarVacantesDeUnPostulante("P-00000462");

DELIMITER $$
create procedure buscarVacantesDeUnExamenEnUnaCarrera(in idEx char(8), in idCar char(10))
BEGIN
	select v.idExamen, v.idPostulante,p.nombrePostulante, 
    p.apellido_paterno,p.apellido_materno, p.dni, 
    pe.puntaje, pe.ordenMerito, c.nombreCarrera, m.nombre as modalidad  
    FROM VACANTE AS V
    INNER JOIN EXAMEN AS EX
    ON V.IDEXAMEN=EX.IDEXAMEN
    INNER JOIN AREAU AS A
    ON EX.IDAREA=A.IDAREA
    INNER JOIN FACULTAD AS F
    ON A.IDAREA=F.IDAREA
    INNER JOIN CARRERA AS C
    ON F.IDFACULTAD=C.IDFACULTAD
    INNER JOIN POSTULANTE AS P
    ON V.IDPOSTULANTE=P.IDPOSTULANTE AND C.IDCARRERA=P.IDCARRERA
    INNER JOIN POSTULANTE_EXAMEN AS PE
    ON P.IDPOSTULANTE=PE.IDPOSTULANTE AND EX.IDEXAMEN=PE.IDEXAMEN
    INNER JOIN MODALIDAD AS M
    ON EX.IDMODALIDAD=M.IDMODALIDAD
    WHERE V.IDEXAMEN=IDEX
    AND C.IDCARRERA=IDCAR
    ORDER BY PUNTAJE DESC;
END $$
 drop procedure buscarVacantesDeUnExamenEnUnaCarrera;
call buscarVacantesDeUnExamenEnUnaCarrera("EX-0002", "INGN-05");







DELIMITER $$
create procedure eliminarVacantesDeUnExamen(in id char(8))
BEGIN
	Delete from VACANTE where idExamen= id;
END $$
drop procedure eliminarVacantesDeUnExamen;
call eliminarVacantesDeUnExamen("EX-0002");











DELIMITER $$
create procedure mostrarVacantes()
BEGIN
	select * from VACANTE;
END $$

call mostrarVacantes;
