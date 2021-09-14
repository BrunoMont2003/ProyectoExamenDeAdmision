USE BDUNIVERSIDAD;
CREATE TABLE VACANTE (
    idPostulante CHAR(10) NOT NULL,
    idExamen CHAR(8) NOT NULL,
    PRIMARY KEY (idPostulante, idExamen),
    FOREIGN KEY (idPostulante)
        REFERENCES Postulante (idPostulante),
    FOREIGN KEY (idExamen)
        REFERENCES Examen (idExamen)
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
    from VACANTE as v
    inner join examen as ex
    on v.idExamen=ex.idExamen
    inner join areau as a
    on ex.idArea=a.idArea
    inner join facultad as f
    on a.idArea=f.idArea
    inner join carrera as c
    on f.idFacultad=c.idFacultad
    inner join postulante_examen as pe
    on v.idPostulante=pe.idPostulante
    inner join postulante as p
    on pe.idPostulante=p.idPostulante
    inner join modalidad as m
    on ex.idModalidad=m.idModalidad
    where pe.idExamen=idEx
    and c.idCarrera=idCar
    ORDER BY pe.puntaje desc;
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
