use bdUniversidad;

create table Postulante_Examen(
	puntaje double,
    numBuenas smallint,
    numMalas smallint,
    ordenMerito smallint,
	idPostulante char (10) not null,
    idExamen char(8) not null,
    primary key(idPostulante, idExamen),
    foreign key (idPostulante) references Postulante(idPostulante),
	foreign key (idExamen) references Examen(idExamen)
	
);

DELIMITER $$
create procedure insertar_Postulante_Examen(in pun double, in bue smallint, in mal smallint, in orden smallint, in idPos char(10), in idEx char(8))
BEGIN
	insert Postulante_Examen values (pun, bue, mal, orden, idPos, idEx);
END $$

call insertar_postulante_Examen(120.234, 56, 30, 5, "P-00000001","EX-0001");

DELIMITER $$
create procedure buscar_Postulante_Examen(in idPos char(10), in idEx char(8))
BEGIN
	select * from Postulante_Examen where idPostulante = idPos and idExamen = idEx;
END $$
call buscar_postulante_examen("P-00000001","EX-0001");


DELIMITER $$
create procedure actualizar_Postulante_Examen(in pun double, in bue smallint, in mal smallint, in orden smallint, in idPos char(10), in idEx char(8))
BEGIN
	update Postulante_Examen set puntaje=pun, numBuenas=bue, numMalas=mal, ordenMerito=orden where idPostulante = idPos and idExamen = idEx;
END $$
drop procedure actualizar_postulante_examen;
call actualizar_postulante_Examen(150.234, 56, 30, 5, "P-00000001","EX-0001");



DELIMITER $$
create procedure eliminar_Postulante_Examen(in idPos char(10), in idEx char(8))
BEGIN
	Delete from Postulante_Examen where idPostulante = idPos and idExamen = idEx;
END $$

DELIMITER $$
create procedure mostrar_Postulante_Examen()
BEGIN
	select * from Postulante_Examen;
END $$

call mostrar_postulante_examen;
