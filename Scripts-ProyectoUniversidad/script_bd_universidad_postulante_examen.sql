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
	insert into Postulante_Examen values (pun, bue, mal, orden, idPos, idEx);
END $$
drop procedure insertar_Postulante_Examen;
call insertar_postulante_Examen(120.234, 56, 30, 5, "P-00000001","EX-0001");


DELIMITER $$
CREATE PROCEDURE insertarPostulanteExamenBase(in idPos char(10),in idEx char(8))
BEGIN
  insert into Postulante_Examen (idPostulante, idExamen) values (idPos, idEx);
END$$
drop procedure insertarPostulanteExamenBase;

call insertarPostulanteExamenBase("P-00000006","EX-0014");


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
call actualizar_postulante_Examen(150.234, 56, 30, 5, "P-00000002","EX-0001");
call actualizar_postulante_Examen(200, 70, 21, 5, "P-00000001","EX-0001");


DELIMITER $$
create procedure eliminar_Postulante_Examen(in idPos char(10), in idEx char(8))
BEGIN
	Delete from Postulante_Examen where idPostulante = idPos and idExamen = idEx;
END $$
call eliminar_Postulante_Examen("P-00000006", "EX-0014");
DELIMITER $$
create procedure eliminarExamenDeUnPostulante(in idEx char(8))
BEGIN
	Delete from Postulante_Examen where idExamen = idEx;
END $$


DELIMITER $$
create procedure mostrar_Postulante_Examen()
BEGIN
	select * from Postulante_Examen;
END $$

call mostrar_postulante_examen;


DELIMITER $$
create procedure mostrarExamenesDeUnPostulante(in idPos char(10))
BEGIN
	select * from Postulante_Examen where idPostulante=idPos;
END $$

call mostrarExamenesDeUnPostulante("P-00000006");


DELIMITER $$
create procedure mostrarPostulantesPorExamen(in idEx char(8))
BEGIN
-- select p.idPostulante, p.NombrePostulante, p.apellido_paterno, p.apellido_materno, p.dni 
    select *
    from Postulante as p
    inner join postulante_examen as pe
    on p.idPostulante = pe.idPostulante
    where pe.idExamen = idEx;
END $$
drop procedure mostrarPostulantesPorExamen;
call mostrarPostulantesPorExamen("EX-0013");


-- idarea="AREA_A" and idModalidad="MODD-01"
DELETE FROM POSTULANTE_EXAMEN WHERE IDEXAMEN="EX-0029";
call insertarPostulanteExamenBase("P-00000001","EX-0013");
call insertarPostulanteExamenBase("P-00000002","EX-0013");
call insertarPostulanteExamenBase("P-00000003","EX-0013");
call insertarPostulanteExamenBase("P-00000004","EX-0013");
call insertarPostulanteExamenBase("P-00000005","EX-0013");
call insertarPostulanteExamenBase("P-00000006","EX-0013");
call insertarPostulanteExamenBase("P-00000007","EX-0013");
call insertarPostulanteExamenBase("P-00000008","EX-0013");
call insertarPostulanteExamenBase("P-00000009","EX-0013");
call insertarPostulanteExamenBase("P-00000010","EX-0013");
call insertarPostulanteExamenBase("P-00000011","EX-0013");
call insertarPostulanteExamenBase("P-00000012","EX-0013");
call insertarPostulanteExamenBase("P-00000013","EX-0013");
call insertarPostulanteExamenBase("P-00000014","EX-0013");

call insertarPostulanteExamenBase("P-00000001","EX-0029");
call insertarPostulanteExamenBase("P-00000002","EX-0029");
call insertarPostulanteExamenBase("P-00000003","EX-0029");
call insertarPostulanteExamenBase("P-00000004","EX-0029");
call insertarPostulanteExamenBase("P-00000005","EX-0029");
call insertarPostulanteExamenBase("P-00000006","EX-0029");
call insertarPostulanteExamenBase("P-00000007","EX-0029");
call insertarPostulanteExamenBase("P-00000008","EX-0029");
call insertarPostulanteExamenBase("P-00000009","EX-0029");
call insertarPostulanteExamenBase("P-00000010","EX-0029");
call insertarPostulanteExamenBase("P-00000011","EX-0029");
call insertarPostulanteExamenBase("P-00000012","EX-0029");
call insertarPostulanteExamenBase("P-00000013","EX-0029");
call insertarPostulanteExamenBase("P-00000014","EX-0029");


call insertarPostulanteExamenBase("P-00000037","EX-0013");
call insertarPostulanteExamenBase("P-00000038","EX-0013");
call insertarPostulanteExamenBase("P-00000039","EX-0013");
call insertarPostulanteExamenBase("P-00000040","EX-0013");
call insertarPostulanteExamenBase("P-00000041","EX-0013");
call insertarPostulanteExamenBase("P-00000042","EX-0013");
call insertarPostulanteExamenBase("P-00000043","EX-0013");
call insertarPostulanteExamenBase("P-00000044","EX-0013");
call insertarPostulanteExamenBase("P-00000045","EX-0013");
call insertarPostulanteExamenBase("P-00000046","EX-0013");
call insertarPostulanteExamenBase("P-00000047","EX-0013");
call insertarPostulanteExamenBase("P-00000048","EX-0013");
call insertarPostulanteExamenBase("P-00000049","EX-0013");
call insertarPostulanteExamenBase("P-00000050","EX-0013");
call insertarPostulanteExamenBase("P-00000051","EX-0013");
call insertarPostulanteExamenBase("P-00000052","EX-0013");
call insertarPostulanteExamenBase("P-00000053","EX-0013");

call insertarPostulanteExamenBase("P-00000037","EX-0029");
call insertarPostulanteExamenBase("P-00000038","EX-0029");
call insertarPostulanteExamenBase("P-00000039","EX-0029");
call insertarPostulanteExamenBase("P-00000040","EX-0029");
call insertarPostulanteExamenBase("P-00000041","EX-0029");
call insertarPostulanteExamenBase("P-00000042","EX-0029");
call insertarPostulanteExamenBase("P-00000043","EX-0029");
call insertarPostulanteExamenBase("P-00000044","EX-0029");
call insertarPostulanteExamenBase("P-00000045","EX-0029");
call insertarPostulanteExamenBase("P-00000046","EX-0029");
call insertarPostulanteExamenBase("P-00000047","EX-0029");
call insertarPostulanteExamenBase("P-00000048","EX-0029");
call insertarPostulanteExamenBase("P-00000049","EX-0029");
call insertarPostulanteExamenBase("P-00000050","EX-0029");
call insertarPostulanteExamenBase("P-00000051","EX-0029");
call insertarPostulanteExamenBase("P-00000052","EX-0029");
call insertarPostulanteExamenBase("P-00000053","EX-0029");

-- idarea="AREA_B" and idModalidad="MODD-01"
DELETE FROM POSTULANTE_EXAMEN WHERE IDEXAMEN="EX-0014";
call insertarPostulanteExamenBase("P-00000015","EX-0014");
call insertarPostulanteExamenBase("P-00000016","EX-0014");
call insertarPostulanteExamenBase("P-00000017","EX-0014");
call insertarPostulanteExamenBase("P-00000018","EX-0014");
call insertarPostulanteExamenBase("P-00000019","EX-0014");
call insertarPostulanteExamenBase("P-00000020","EX-0014");
call insertarPostulanteExamenBase("P-00000021","EX-0014");
call insertarPostulanteExamenBase("P-00000022","EX-0014");
call insertarPostulanteExamenBase("P-00000023","EX-0014");
call insertarPostulanteExamenBase("P-00000024","EX-0014");
call insertarPostulanteExamenBase("P-00000025","EX-0014");
call insertarPostulanteExamenBase("P-00000026","EX-0014");
call insertarPostulanteExamenBase("P-00000027","EX-0014");
call insertarPostulanteExamenBase("P-00000028","EX-0014");
call insertarPostulanteExamenBase("P-00000029","EX-0014");
call insertarPostulanteExamenBase("P-00000030","EX-0014");
call insertarPostulanteExamenBase("P-00000031","EX-0014");
call insertarPostulanteExamenBase("P-00000032","EX-0014");
call insertarPostulanteExamenBase("P-00000033","EX-0014");
call insertarPostulanteExamenBase("P-00000034","EX-0014");
call insertarPostulanteExamenBase("P-00000035","EX-0014");
call insertarPostulanteExamenBase("P-00000036","EX-0014");

call insertarPostulanteExamenBase("P-00000015","EX-0030");
call insertarPostulanteExamenBase("P-00000016","EX-0030");
call insertarPostulanteExamenBase("P-00000017","EX-0030");
call insertarPostulanteExamenBase("P-00000018","EX-0030");
call insertarPostulanteExamenBase("P-00000019","EX-0030");
call insertarPostulanteExamenBase("P-00000020","EX-0030");
call insertarPostulanteExamenBase("P-00000021","EX-0030");
call insertarPostulanteExamenBase("P-00000022","EX-0030");
call insertarPostulanteExamenBase("P-00000023","EX-0030");
call insertarPostulanteExamenBase("P-00000024","EX-0030");
call insertarPostulanteExamenBase("P-00000025","EX-0030");
call insertarPostulanteExamenBase("P-00000026","EX-0030");
call insertarPostulanteExamenBase("P-00000027","EX-0030");
call insertarPostulanteExamenBase("P-00000028","EX-0030");
call insertarPostulanteExamenBase("P-00000029","EX-0030");
call insertarPostulanteExamenBase("P-00000030","EX-0030");
call insertarPostulanteExamenBase("P-00000031","EX-0030");
call insertarPostulanteExamenBase("P-00000032","EX-0030");
call insertarPostulanteExamenBase("P-00000033","EX-0030");
call insertarPostulanteExamenBase("P-00000034","EX-0030");
call insertarPostulanteExamenBase("P-00000035","EX-0030");
call insertarPostulanteExamenBase("P-00000036","EX-0030");

call insertarPostulanteExamenBase("P-00000054","EX-0014");
call insertarPostulanteExamenBase("P-00000055","EX-0014");
call insertarPostulanteExamenBase("P-00000056","EX-0014");
call insertarPostulanteExamenBase("P-00000057","EX-0014");
call insertarPostulanteExamenBase("P-00000058","EX-0014");
call insertarPostulanteExamenBase("P-00000059","EX-0014");
call insertarPostulanteExamenBase("P-00000060","EX-0014");
call insertarPostulanteExamenBase("P-00000061","EX-0014");
call insertarPostulanteExamenBase("P-00000062","EX-0014");
call insertarPostulanteExamenBase("P-00000063","EX-0014");
call insertarPostulanteExamenBase("P-00000064","EX-0014");
call insertarPostulanteExamenBase("P-00000065","EX-0014");
call insertarPostulanteExamenBase("P-00000066","EX-0014");
call insertarPostulanteExamenBase("P-00000067","EX-0014");
call insertarPostulanteExamenBase("P-00000068","EX-0014");
call insertarPostulanteExamenBase("P-00000069","EX-0014");
call insertarPostulanteExamenBase("P-00000070","EX-0014");
call insertarPostulanteExamenBase("P-00000071","EX-0014");
call insertarPostulanteExamenBase("P-00000072","EX-0014");
call insertarPostulanteExamenBase("P-00000073","EX-0014");
call insertarPostulanteExamenBase("P-00000074","EX-0014");
call insertarPostulanteExamenBase("P-00000075","EX-0014");
call insertarPostulanteExamenBase("P-00000076","EX-0014");
call insertarPostulanteExamenBase("P-00000077","EX-0014");
call insertarPostulanteExamenBase("P-00000078","EX-0014");
call insertarPostulanteExamenBase("P-00000079","EX-0014");
call insertarPostulanteExamenBase("P-00000080","EX-0014");
call insertarPostulanteExamenBase("P-00000081","EX-0014");
call insertarPostulanteExamenBase("P-00000082","EX-0014");
call insertarPostulanteExamenBase("P-00000083","EX-0014");
call insertarPostulanteExamenBase("P-00000084","EX-0014");
call insertarPostulanteExamenBase("P-00000085","EX-0014");

call insertarPostulanteExamenBase("P-00000054","EX-0030");
call insertarPostulanteExamenBase("P-00000055","EX-0030");
call insertarPostulanteExamenBase("P-00000056","EX-0030");
call insertarPostulanteExamenBase("P-00000057","EX-0030");
call insertarPostulanteExamenBase("P-00000058","EX-0030");
call insertarPostulanteExamenBase("P-00000059","EX-0030");
call insertarPostulanteExamenBase("P-00000060","EX-0030");
call insertarPostulanteExamenBase("P-00000061","EX-0030");
call insertarPostulanteExamenBase("P-00000062","EX-0030");
call insertarPostulanteExamenBase("P-00000063","EX-0030");
call insertarPostulanteExamenBase("P-00000064","EX-0030");
call insertarPostulanteExamenBase("P-00000065","EX-0030");
call insertarPostulanteExamenBase("P-00000066","EX-0030");
call insertarPostulanteExamenBase("P-00000067","EX-0030");
call insertarPostulanteExamenBase("P-00000068","EX-0030");
call insertarPostulanteExamenBase("P-00000069","EX-0030");
call insertarPostulanteExamenBase("P-00000070","EX-0030");
call insertarPostulanteExamenBase("P-00000071","EX-0030");
call insertarPostulanteExamenBase("P-00000072","EX-0030");
call insertarPostulanteExamenBase("P-00000073","EX-0030");
call insertarPostulanteExamenBase("P-00000074","EX-0030");
call insertarPostulanteExamenBase("P-00000075","EX-0030");
call insertarPostulanteExamenBase("P-00000076","EX-0030");
call insertarPostulanteExamenBase("P-00000077","EX-0030");
call insertarPostulanteExamenBase("P-00000078","EX-0030");
call insertarPostulanteExamenBase("P-00000079","EX-0030");
call insertarPostulanteExamenBase("P-00000080","EX-0030");
call insertarPostulanteExamenBase("P-00000081","EX-0030");
call insertarPostulanteExamenBase("P-00000082","EX-0030");
call insertarPostulanteExamenBase("P-00000083","EX-0030");
call insertarPostulanteExamenBase("P-00000084","EX-0030");
call insertarPostulanteExamenBase("P-00000085","EX-0030");

 call insertarPostulanteExamenBase("P-00000126","EX-0014");
call insertarPostulanteExamenBase("P-00000127","EX-0014");
call insertarPostulanteExamenBase("P-00000128","EX-0014");
call insertarPostulanteExamenBase("P-00000129","EX-0014");
call insertarPostulanteExamenBase("P-00000130","EX-0014");
call insertarPostulanteExamenBase("P-00000131","EX-0014");
call insertarPostulanteExamenBase("P-00000132","EX-0014");
call insertarPostulanteExamenBase("P-00000133","EX-0014");
call insertarPostulanteExamenBase("P-00000134","EX-0014");
call insertarPostulanteExamenBase("P-00000135","EX-0014");
call insertarPostulanteExamenBase("P-00000136","EX-0014");
call insertarPostulanteExamenBase("P-00000137","EX-0014");
call insertarPostulanteExamenBase("P-00000138","EX-0014");
call insertarPostulanteExamenBase("P-00000139","EX-0014");
call insertarPostulanteExamenBase("P-00000140","EX-0014");
call insertarPostulanteExamenBase("P-00000141","EX-0014");
call insertarPostulanteExamenBase("P-00000142","EX-0014");
call insertarPostulanteExamenBase("P-00000143","EX-0014");
call insertarPostulanteExamenBase("P-00000144","EX-0014");
call insertarPostulanteExamenBase("P-00000145","EX-0014");
call insertarPostulanteExamenBase("P-00000146","EX-0014");
call insertarPostulanteExamenBase("P-00000147","EX-0014");
call insertarPostulanteExamenBase("P-00000148","EX-0014");
call insertarPostulanteExamenBase("P-00000149","EX-0014");
call insertarPostulanteExamenBase("P-00000150","EX-0014");
call insertarPostulanteExamenBase("P-00000151","EX-0014");
call insertarPostulanteExamenBase("P-00000152","EX-0014");
call insertarPostulanteExamenBase("P-00000153","EX-0014");
call insertarPostulanteExamenBase("P-00000154","EX-0014");
call insertarPostulanteExamenBase("P-00000155","EX-0014");
call insertarPostulanteExamenBase("P-00000156","EX-0014");
call insertarPostulanteExamenBase("P-00000157","EX-0014");
call insertarPostulanteExamenBase("P-00000158","EX-0014");
call insertarPostulanteExamenBase("P-00000159","EX-0014");
call insertarPostulanteExamenBase("P-00000160","EX-0014");
call insertarPostulanteExamenBase("P-00000161","EX-0014");
call insertarPostulanteExamenBase("P-00000162","EX-0014");
call insertarPostulanteExamenBase("P-00000163","EX-0014");
call insertarPostulanteExamenBase("P-00000164","EX-0014");
call insertarPostulanteExamenBase("P-00000165","EX-0014");
call insertarPostulanteExamenBase("P-00000166","EX-0014");
call insertarPostulanteExamenBase("P-00000167","EX-0014");
call insertarPostulanteExamenBase("P-00000168","EX-0014");
call insertarPostulanteExamenBase("P-00000169","EX-0014");
call insertarPostulanteExamenBase("P-00000170","EX-0014");
call insertarPostulanteExamenBase("P-00000171","EX-0014");
call insertarPostulanteExamenBase("P-00000172","EX-0014");
call insertarPostulanteExamenBase("P-00000173","EX-0014");
call insertarPostulanteExamenBase("P-00000174","EX-0014");
call insertarPostulanteExamenBase("P-00000175","EX-0014");
call insertarPostulanteExamenBase("P-00000176","EX-0014");
call insertarPostulanteExamenBase("P-00000177","EX-0014");
call insertarPostulanteExamenBase("P-00000178","EX-0014");
call insertarPostulanteExamenBase("P-00000179","EX-0014");
call insertarPostulanteExamenBase("P-00000180","EX-0014");
call insertarPostulanteExamenBase("P-00000181","EX-0014");
call insertarPostulanteExamenBase("P-00000182","EX-0014");
call insertarPostulanteExamenBase("P-00000183","EX-0014");
call insertarPostulanteExamenBase("P-00000184","EX-0014");
call insertarPostulanteExamenBase("P-00000185","EX-0014");
call insertarPostulanteExamenBase("P-00000186","EX-0014");
call insertarPostulanteExamenBase("P-00000187","EX-0014");
call insertarPostulanteExamenBase("P-00000188","EX-0014");
call insertarPostulanteExamenBase("P-00000189","EX-0014");
call insertarPostulanteExamenBase("P-00000190","EX-0014");
call insertarPostulanteExamenBase("P-00000191","EX-0014");
call insertarPostulanteExamenBase("P-00000192","EX-0014");
call insertarPostulanteExamenBase("P-00000193","EX-0014");
call insertarPostulanteExamenBase("P-00000194","EX-0014");
call insertarPostulanteExamenBase("P-00000195","EX-0014");
call insertarPostulanteExamenBase("P-00000196","EX-0014");
call insertarPostulanteExamenBase("P-00000197","EX-0014");
call insertarPostulanteExamenBase("P-00000198","EX-0014");
call insertarPostulanteExamenBase("P-00000199","EX-0014");
call insertarPostulanteExamenBase("P-00000200","EX-0014");


 call insertarPostulanteExamenBase("P-00000126","EX-0030");
call insertarPostulanteExamenBase("P-00000127","EX-0030");
call insertarPostulanteExamenBase("P-00000128","EX-0030");
call insertarPostulanteExamenBase("P-00000129","EX-0030");
call insertarPostulanteExamenBase("P-00000130","EX-0030");
call insertarPostulanteExamenBase("P-00000131","EX-0030");
call insertarPostulanteExamenBase("P-00000132","EX-0030");
call insertarPostulanteExamenBase("P-00000133","EX-0030");
call insertarPostulanteExamenBase("P-00000134","EX-0030");
call insertarPostulanteExamenBase("P-00000135","EX-0030");
call insertarPostulanteExamenBase("P-00000136","EX-0030");
call insertarPostulanteExamenBase("P-00000137","EX-0030");
call insertarPostulanteExamenBase("P-00000138","EX-0030");
call insertarPostulanteExamenBase("P-00000139","EX-0030");
call insertarPostulanteExamenBase("P-00000140","EX-0030");
call insertarPostulanteExamenBase("P-00000141","EX-0030");
call insertarPostulanteExamenBase("P-00000142","EX-0030");
call insertarPostulanteExamenBase("P-00000143","EX-0030");
call insertarPostulanteExamenBase("P-00000144","EX-0030");
call insertarPostulanteExamenBase("P-00000145","EX-0030");
call insertarPostulanteExamenBase("P-00000146","EX-0030");
call insertarPostulanteExamenBase("P-00000147","EX-0030");
call insertarPostulanteExamenBase("P-00000148","EX-0030");
call insertarPostulanteExamenBase("P-00000149","EX-0030");
call insertarPostulanteExamenBase("P-00000150","EX-0030");
call insertarPostulanteExamenBase("P-00000151","EX-0030");
call insertarPostulanteExamenBase("P-00000152","EX-0030");
call insertarPostulanteExamenBase("P-00000153","EX-0030");
call insertarPostulanteExamenBase("P-00000154","EX-0030");
call insertarPostulanteExamenBase("P-00000155","EX-0030");
call insertarPostulanteExamenBase("P-00000156","EX-0030");
call insertarPostulanteExamenBase("P-00000157","EX-0030");
call insertarPostulanteExamenBase("P-00000158","EX-0030");
call insertarPostulanteExamenBase("P-00000159","EX-0030");
call insertarPostulanteExamenBase("P-00000160","EX-0030");
call insertarPostulanteExamenBase("P-00000161","EX-0030");
call insertarPostulanteExamenBase("P-00000162","EX-0030");
call insertarPostulanteExamenBase("P-00000163","EX-0030");
call insertarPostulanteExamenBase("P-00000164","EX-0030");
call insertarPostulanteExamenBase("P-00000165","EX-0030");
call insertarPostulanteExamenBase("P-00000166","EX-0030");
call insertarPostulanteExamenBase("P-00000167","EX-0030");
call insertarPostulanteExamenBase("P-00000168","EX-0030");
call insertarPostulanteExamenBase("P-00000169","EX-0030");
call insertarPostulanteExamenBase("P-00000170","EX-0030");
call insertarPostulanteExamenBase("P-00000171","EX-0030");
call insertarPostulanteExamenBase("P-00000172","EX-0030");
call insertarPostulanteExamenBase("P-00000173","EX-0030");
call insertarPostulanteExamenBase("P-00000174","EX-0030");
call insertarPostulanteExamenBase("P-00000175","EX-0030");
call insertarPostulanteExamenBase("P-00000176","EX-0030");
call insertarPostulanteExamenBase("P-00000177","EX-0030");
call insertarPostulanteExamenBase("P-00000178","EX-0030");
call insertarPostulanteExamenBase("P-00000179","EX-0030");
call insertarPostulanteExamenBase("P-00000180","EX-0030");
call insertarPostulanteExamenBase("P-00000181","EX-0030");
call insertarPostulanteExamenBase("P-00000182","EX-0030");
call insertarPostulanteExamenBase("P-00000183","EX-0030");
call insertarPostulanteExamenBase("P-00000184","EX-0030");
call insertarPostulanteExamenBase("P-00000185","EX-0030");
call insertarPostulanteExamenBase("P-00000186","EX-0030");
call insertarPostulanteExamenBase("P-00000187","EX-0030");
call insertarPostulanteExamenBase("P-00000188","EX-0030");
call insertarPostulanteExamenBase("P-00000189","EX-0030");
call insertarPostulanteExamenBase("P-00000190","EX-0030");
call insertarPostulanteExamenBase("P-00000191","EX-0030");
call insertarPostulanteExamenBase("P-00000192","EX-0030");
call insertarPostulanteExamenBase("P-00000193","EX-0030");
call insertarPostulanteExamenBase("P-00000194","EX-0030");
call insertarPostulanteExamenBase("P-00000195","EX-0030");
call insertarPostulanteExamenBase("P-00000196","EX-0030");
call insertarPostulanteExamenBase("P-00000197","EX-0030");
call insertarPostulanteExamenBase("P-00000198","EX-0030");
call insertarPostulanteExamenBase("P-00000199","EX-0030");
call insertarPostulanteExamenBase("P-00000200","EX-0030");




-- idarea="AREA_D" and idModalidad="MODD-01"
call insertarPostulanteExamenBase("P-00000086","EX-0016");
call insertarPostulanteExamenBase("P-00000087","EX-0016");
call insertarPostulanteExamenBase("P-00000088","EX-0016");
call insertarPostulanteExamenBase("P-00000089","EX-0016");
call insertarPostulanteExamenBase("P-00000090","EX-0016");
call insertarPostulanteExamenBase("P-00000091","EX-0016");
call insertarPostulanteExamenBase("P-00000092","EX-0016");
call insertarPostulanteExamenBase("P-00000093","EX-0016");
call insertarPostulanteExamenBase("P-00000094","EX-0016");
call insertarPostulanteExamenBase("P-00000095","EX-0016");
call insertarPostulanteExamenBase("P-00000096","EX-0016");
call insertarPostulanteExamenBase("P-00000097","EX-0016");
call insertarPostulanteExamenBase("P-00000098","EX-0016");
call insertarPostulanteExamenBase("P-00000099","EX-0016");
call insertarPostulanteExamenBase("P-00000100","EX-0016");
call insertarPostulanteExamenBase("P-00000101","EX-0016");
call insertarPostulanteExamenBase("P-00000102","EX-0016");
call insertarPostulanteExamenBase("P-00000103","EX-0016");
call insertarPostulanteExamenBase("P-00000104","EX-0016");
call insertarPostulanteExamenBase("P-00000105","EX-0016");
call insertarPostulanteExamenBase("P-00000106","EX-0016");
call insertarPostulanteExamenBase("P-00000107","EX-0016");
call insertarPostulanteExamenBase("P-00000108","EX-0016");
call insertarPostulanteExamenBase("P-00000109","EX-0016");
call insertarPostulanteExamenBase("P-00000110","EX-0016");

call insertarPostulanteExamenBase("P-00000086","EX-0032");
call insertarPostulanteExamenBase("P-00000087","EX-0032");
call insertarPostulanteExamenBase("P-00000088","EX-0032");
call insertarPostulanteExamenBase("P-00000089","EX-0032");
call insertarPostulanteExamenBase("P-00000090","EX-0032");
call insertarPostulanteExamenBase("P-00000091","EX-0032");
call insertarPostulanteExamenBase("P-00000092","EX-0032");
call insertarPostulanteExamenBase("P-00000093","EX-0032");
call insertarPostulanteExamenBase("P-00000094","EX-0032");
call insertarPostulanteExamenBase("P-00000095","EX-0032");
call insertarPostulanteExamenBase("P-00000096","EX-0032");
call insertarPostulanteExamenBase("P-00000097","EX-0032");
call insertarPostulanteExamenBase("P-00000098","EX-0032");
call insertarPostulanteExamenBase("P-00000099","EX-0032");
call insertarPostulanteExamenBase("P-00000100","EX-0032");
call insertarPostulanteExamenBase("P-00000101","EX-0032");
call insertarPostulanteExamenBase("P-00000102","EX-0032");
call insertarPostulanteExamenBase("P-00000103","EX-0032");
call insertarPostulanteExamenBase("P-00000104","EX-0032");
call insertarPostulanteExamenBase("P-00000105","EX-0032");
call insertarPostulanteExamenBase("P-00000106","EX-0032");
call insertarPostulanteExamenBase("P-00000107","EX-0032");
call insertarPostulanteExamenBase("P-00000108","EX-0032");
call insertarPostulanteExamenBase("P-00000109","EX-0032");
call insertarPostulanteExamenBase("P-00000110","EX-0032");

-- idarea="AREA_C" and idModalidad="MODD-01"
call insertarPostulanteExamenBase("P-00000111","EX-0015");
call insertarPostulanteExamenBase("P-00000112","EX-0015");
call insertarPostulanteExamenBase("P-00000113","EX-0015");
call insertarPostulanteExamenBase("P-00000114","EX-0015");
call insertarPostulanteExamenBase("P-00000115","EX-0015");
call insertarPostulanteExamenBase("P-00000116","EX-0015");
call insertarPostulanteExamenBase("P-00000117","EX-0015");
call insertarPostulanteExamenBase("P-00000118","EX-0015");
call insertarPostulanteExamenBase("P-00000119","EX-0015");
call insertarPostulanteExamenBase("P-00000120","EX-0015");
call insertarPostulanteExamenBase("P-00000121","EX-0015");
call insertarPostulanteExamenBase("P-00000122","EX-0015");
call insertarPostulanteExamenBase("P-00000123","EX-0015");
call insertarPostulanteExamenBase("P-00000124","EX-0015");
call insertarPostulanteExamenBase("P-00000125","EX-0015");

call insertarPostulanteExamenBase("P-00000111","EX-0031");
call insertarPostulanteExamenBase("P-00000112","EX-0031");
call insertarPostulanteExamenBase("P-00000113","EX-0031");
call insertarPostulanteExamenBase("P-00000114","EX-0031");
call insertarPostulanteExamenBase("P-00000115","EX-0031");
call insertarPostulanteExamenBase("P-00000116","EX-0031");
call insertarPostulanteExamenBase("P-00000117","EX-0031");
call insertarPostulanteExamenBase("P-00000118","EX-0031");
call insertarPostulanteExamenBase("P-00000119","EX-0031");
call insertarPostulanteExamenBase("P-00000120","EX-0031");
call insertarPostulanteExamenBase("P-00000121","EX-0031");
call insertarPostulanteExamenBase("P-00000122","EX-0031");
call insertarPostulanteExamenBase("P-00000123","EX-0031");
call insertarPostulanteExamenBase("P-00000124","EX-0031");
call insertarPostulanteExamenBase("P-00000125","EX-0031");


-- idarea="AREA_A" and idModalidad="MODD-02"
call insertarPostulanteExamenBase("P-00000201","EX-0005");
call insertarPostulanteExamenBase("P-00000202","EX-0005");
call insertarPostulanteExamenBase("P-00000203","EX-0005");
call insertarPostulanteExamenBase("P-00000204","EX-0005");
call insertarPostulanteExamenBase("P-00000205","EX-0005");
call insertarPostulanteExamenBase("P-00000206","EX-0005");
call insertarPostulanteExamenBase("P-00000207","EX-0005");
call insertarPostulanteExamenBase("P-00000208","EX-0005");
call insertarPostulanteExamenBase("P-00000209","EX-0005");
call insertarPostulanteExamenBase("P-00000210","EX-0005");

call insertarPostulanteExamenBase("P-00000201","EX-0017");
call insertarPostulanteExamenBase("P-00000202","EX-0017");
call insertarPostulanteExamenBase("P-00000203","EX-0017");
call insertarPostulanteExamenBase("P-00000204","EX-0017");
call insertarPostulanteExamenBase("P-00000205","EX-0017");
call insertarPostulanteExamenBase("P-00000206","EX-0017");
call insertarPostulanteExamenBase("P-00000207","EX-0017");
call insertarPostulanteExamenBase("P-00000208","EX-0017");
call insertarPostulanteExamenBase("P-00000209","EX-0017");
call insertarPostulanteExamenBase("P-00000210","EX-0017");

-- idarea="AREA_B" and idModalidad="MODD-02"
call insertarPostulanteExamenBase("P-00000211","EX-0006");
call insertarPostulanteExamenBase("P-00000212","EX-0006");
call insertarPostulanteExamenBase("P-00000213","EX-0006");
call insertarPostulanteExamenBase("P-00000214","EX-0006");
call insertarPostulanteExamenBase("P-00000215","EX-0006");
call insertarPostulanteExamenBase("P-00000216","EX-0006");
call insertarPostulanteExamenBase("P-00000217","EX-0006");
call insertarPostulanteExamenBase("P-00000218","EX-0006");
call insertarPostulanteExamenBase("P-00000219","EX-0006");
call insertarPostulanteExamenBase("P-00000220","EX-0006");
call insertarPostulanteExamenBase("P-00000221","EX-0006");
call insertarPostulanteExamenBase("P-00000222","EX-0006");
call insertarPostulanteExamenBase("P-00000223","EX-0006");
call insertarPostulanteExamenBase("P-00000224","EX-0006");
call insertarPostulanteExamenBase("P-00000225","EX-0006");
call insertarPostulanteExamenBase("P-00000226","EX-0006");
call insertarPostulanteExamenBase("P-00000227","EX-0006");
call insertarPostulanteExamenBase("P-00000228","EX-0006");

call insertarPostulanteExamenBase("P-00000211","EX-0018");
call insertarPostulanteExamenBase("P-00000212","EX-0018");
call insertarPostulanteExamenBase("P-00000213","EX-0018");
call insertarPostulanteExamenBase("P-00000214","EX-0018");
call insertarPostulanteExamenBase("P-00000215","EX-0018");
call insertarPostulanteExamenBase("P-00000216","EX-0018");
call insertarPostulanteExamenBase("P-00000217","EX-0018");
call insertarPostulanteExamenBase("P-00000218","EX-0018");
call insertarPostulanteExamenBase("P-00000219","EX-0018");
call insertarPostulanteExamenBase("P-00000220","EX-0018");
call insertarPostulanteExamenBase("P-00000221","EX-0018");
call insertarPostulanteExamenBase("P-00000222","EX-0018");
call insertarPostulanteExamenBase("P-00000223","EX-0018");
call insertarPostulanteExamenBase("P-00000224","EX-0018");
call insertarPostulanteExamenBase("P-00000225","EX-0018");
call insertarPostulanteExamenBase("P-00000226","EX-0018");
call insertarPostulanteExamenBase("P-00000227","EX-0018");
call insertarPostulanteExamenBase("P-00000228","EX-0018");



call insertarPostulanteExamenBase("P-00000257","EX-0006");
call insertarPostulanteExamenBase("P-00000258","EX-0006");
call insertarPostulanteExamenBase("P-00000259","EX-0006");
call insertarPostulanteExamenBase("P-00000260","EX-0006");
call insertarPostulanteExamenBase("P-00000261","EX-0006");
call insertarPostulanteExamenBase("P-00000262","EX-0006");
call insertarPostulanteExamenBase("P-00000263","EX-0006");
call insertarPostulanteExamenBase("P-00000264","EX-0006");
call insertarPostulanteExamenBase("P-00000265","EX-0006");
call insertarPostulanteExamenBase("P-00000266","EX-0006");
call insertarPostulanteExamenBase("P-00000267","EX-0006");
call insertarPostulanteExamenBase("P-00000268","EX-0006");
call insertarPostulanteExamenBase("P-00000269","EX-0006");
call insertarPostulanteExamenBase("P-00000270","EX-0006");
call insertarPostulanteExamenBase("P-00000271","EX-0006");
call insertarPostulanteExamenBase("P-00000272","EX-0006");
call insertarPostulanteExamenBase("P-00000273","EX-0006");
call insertarPostulanteExamenBase("P-00000274","EX-0006");
call insertarPostulanteExamenBase("P-00000275","EX-0006");
call insertarPostulanteExamenBase("P-00000276","EX-0006");
call insertarPostulanteExamenBase("P-00000277","EX-0006");
call insertarPostulanteExamenBase("P-00000278","EX-0006");
call insertarPostulanteExamenBase("P-00000279","EX-0006");
call insertarPostulanteExamenBase("P-00000280","EX-0006");
call insertarPostulanteExamenBase("P-00000281","EX-0006");
call insertarPostulanteExamenBase("P-00000282","EX-0006");
call insertarPostulanteExamenBase("P-00000283","EX-0006");
call insertarPostulanteExamenBase("P-00000284","EX-0006");
call insertarPostulanteExamenBase("P-00000285","EX-0006");
call insertarPostulanteExamenBase("P-00000286","EX-0006");
call insertarPostulanteExamenBase("P-00000287","EX-0006");
call insertarPostulanteExamenBase("P-00000288","EX-0006");
call insertarPostulanteExamenBase("P-00000289","EX-0006");
call insertarPostulanteExamenBase("P-00000290","EX-0006");
call insertarPostulanteExamenBase("P-00000291","EX-0006");
call insertarPostulanteExamenBase("P-00000292","EX-0006");
call insertarPostulanteExamenBase("P-00000293","EX-0006");
call insertarPostulanteExamenBase("P-00000294","EX-0006");
call insertarPostulanteExamenBase("P-00000295","EX-0006");
call insertarPostulanteExamenBase("P-00000296","EX-0006");
call insertarPostulanteExamenBase("P-00000297","EX-0006");
call insertarPostulanteExamenBase("P-00000298","EX-0006");
call insertarPostulanteExamenBase("P-00000299","EX-0006");
call insertarPostulanteExamenBase("P-00000300","EX-0006");

 call insertarPostulanteExamenBase("P-00000257","EX-0018");
call insertarPostulanteExamenBase("P-00000258","EX-0018");
call insertarPostulanteExamenBase("P-00000259","EX-0018");
call insertarPostulanteExamenBase("P-00000260","EX-0018");
call insertarPostulanteExamenBase("P-00000261","EX-0018");
call insertarPostulanteExamenBase("P-00000262","EX-0018");
call insertarPostulanteExamenBase("P-00000263","EX-0018");
call insertarPostulanteExamenBase("P-00000264","EX-0018");
call insertarPostulanteExamenBase("P-00000265","EX-0018");
call insertarPostulanteExamenBase("P-00000266","EX-0018");
call insertarPostulanteExamenBase("P-00000267","EX-0018");
call insertarPostulanteExamenBase("P-00000268","EX-0018");
call insertarPostulanteExamenBase("P-00000269","EX-0018");
call insertarPostulanteExamenBase("P-00000270","EX-0018");
call insertarPostulanteExamenBase("P-00000271","EX-0018");
call insertarPostulanteExamenBase("P-00000272","EX-0018");
call insertarPostulanteExamenBase("P-00000273","EX-0018");
call insertarPostulanteExamenBase("P-00000274","EX-0018");
call insertarPostulanteExamenBase("P-00000275","EX-0018");
call insertarPostulanteExamenBase("P-00000276","EX-0018");
call insertarPostulanteExamenBase("P-00000277","EX-0018");
call insertarPostulanteExamenBase("P-00000278","EX-0018");
call insertarPostulanteExamenBase("P-00000279","EX-0018");
call insertarPostulanteExamenBase("P-00000280","EX-0018");
call insertarPostulanteExamenBase("P-00000281","EX-0018");
call insertarPostulanteExamenBase("P-00000282","EX-0018");
call insertarPostulanteExamenBase("P-00000283","EX-0018");
call insertarPostulanteExamenBase("P-00000284","EX-0018");
call insertarPostulanteExamenBase("P-00000285","EX-0018");
call insertarPostulanteExamenBase("P-00000286","EX-0018");
call insertarPostulanteExamenBase("P-00000287","EX-0018");
call insertarPostulanteExamenBase("P-00000288","EX-0018");
call insertarPostulanteExamenBase("P-00000289","EX-0018");
call insertarPostulanteExamenBase("P-00000290","EX-0018");
call insertarPostulanteExamenBase("P-00000291","EX-0018");
call insertarPostulanteExamenBase("P-00000292","EX-0018");
call insertarPostulanteExamenBase("P-00000293","EX-0018");
call insertarPostulanteExamenBase("P-00000294","EX-0018");
call insertarPostulanteExamenBase("P-00000295","EX-0018");
call insertarPostulanteExamenBase("P-00000296","EX-0018");
call insertarPostulanteExamenBase("P-00000297","EX-0018");
call insertarPostulanteExamenBase("P-00000298","EX-0018");
call insertarPostulanteExamenBase("P-00000299","EX-0018");
call insertarPostulanteExamenBase("P-00000300","EX-0018");



-- idarea="AREA_D" and idModalidad="MODD-02"
call insertarPostulanteExamenBase("P-00000229","EX-0008");
call insertarPostulanteExamenBase("P-00000230","EX-0008");
call insertarPostulanteExamenBase("P-00000231","EX-0008");
call insertarPostulanteExamenBase("P-00000232","EX-0008");
call insertarPostulanteExamenBase("P-00000233","EX-0008");
call insertarPostulanteExamenBase("P-00000234","EX-0008");
call insertarPostulanteExamenBase("P-00000235","EX-0008");
call insertarPostulanteExamenBase("P-00000236","EX-0008");
call insertarPostulanteExamenBase("P-00000237","EX-0008");
 call insertarPostulanteExamenBase("P-00000238","EX-0008");
call insertarPostulanteExamenBase("P-00000239","EX-0008");
call insertarPostulanteExamenBase("P-00000240","EX-0008");
call insertarPostulanteExamenBase("P-00000241","EX-0008");
call insertarPostulanteExamenBase("P-00000242","EX-0008");
call insertarPostulanteExamenBase("P-00000243","EX-0008");
call insertarPostulanteExamenBase("P-00000244","EX-0008");
call insertarPostulanteExamenBase("P-00000245","EX-0008");
call insertarPostulanteExamenBase("P-00000246","EX-0008");

call insertarPostulanteExamenBase("P-00000229","EX-0020");
call insertarPostulanteExamenBase("P-00000230","EX-0020");
call insertarPostulanteExamenBase("P-00000231","EX-0020");
call insertarPostulanteExamenBase("P-00000232","EX-0020");
call insertarPostulanteExamenBase("P-00000233","EX-0020");
call insertarPostulanteExamenBase("P-00000234","EX-0020");
call insertarPostulanteExamenBase("P-00000235","EX-0020");
call insertarPostulanteExamenBase("P-00000236","EX-0020");
call insertarPostulanteExamenBase("P-00000237","EX-0020");
call insertarPostulanteExamenBase("P-00000238","EX-0020");
call insertarPostulanteExamenBase("P-00000239","EX-0020");
call insertarPostulanteExamenBase("P-00000240","EX-0020");
call insertarPostulanteExamenBase("P-00000241","EX-0020");
call insertarPostulanteExamenBase("P-00000242","EX-0020");
call insertarPostulanteExamenBase("P-00000243","EX-0020");
call insertarPostulanteExamenBase("P-00000244","EX-0020");
call insertarPostulanteExamenBase("P-00000245","EX-0020");
call insertarPostulanteExamenBase("P-00000246","EX-0020");


-- idarea="AREA_C" and idModalidad="MODD-02"

call insertarPostulanteExamenBase("P-00000247","EX-0007");
call insertarPostulanteExamenBase("P-00000248","EX-0007");
call insertarPostulanteExamenBase("P-00000249","EX-0007");
call insertarPostulanteExamenBase("P-00000250","EX-0007");
call insertarPostulanteExamenBase("P-00000251","EX-0007");
call insertarPostulanteExamenBase("P-00000252","EX-0007");
call insertarPostulanteExamenBase("P-00000253","EX-0007");
call insertarPostulanteExamenBase("P-00000254","EX-0007");
call insertarPostulanteExamenBase("P-00000255","EX-0007");
call insertarPostulanteExamenBase("P-00000256","EX-0007");

 call insertarPostulanteExamenBase("P-00000247","EX-0019");
call insertarPostulanteExamenBase("P-00000248","EX-0019");
call insertarPostulanteExamenBase("P-00000249","EX-0019");
call insertarPostulanteExamenBase("P-00000250","EX-0019");
call insertarPostulanteExamenBase("P-00000251","EX-0019");
call insertarPostulanteExamenBase("P-00000252","EX-0019");
call insertarPostulanteExamenBase("P-00000253","EX-0019");
call insertarPostulanteExamenBase("P-00000254","EX-0019");
call insertarPostulanteExamenBase("P-00000255","EX-0019");
call insertarPostulanteExamenBase("P-00000256","EX-0019");


-- idarea="AREA_A" and idModalidad="MODD-03"
 call insertarPostulanteExamenBase("P-00000301","EX-0009");
call insertarPostulanteExamenBase("P-00000302","EX-0009");
call insertarPostulanteExamenBase("P-00000303","EX-0009");
call insertarPostulanteExamenBase("P-00000304","EX-0009");
call insertarPostulanteExamenBase("P-00000305","EX-0009");
call insertarPostulanteExamenBase("P-00000306","EX-0009");
call insertarPostulanteExamenBase("P-00000307","EX-0009");

 call insertarPostulanteExamenBase("P-00000301","EX-0021");
call insertarPostulanteExamenBase("P-00000302","EX-0021");
call insertarPostulanteExamenBase("P-00000303","EX-0021");
call insertarPostulanteExamenBase("P-00000304","EX-0021");
call insertarPostulanteExamenBase("P-00000305","EX-0021");
call insertarPostulanteExamenBase("P-00000306","EX-0021");
call insertarPostulanteExamenBase("P-00000307","EX-0021");


-- idarea="AREA_B" and idModalidad="MODD-03"
call insertarPostulanteExamenBase("P-00000308","EX-0010");
call insertarPostulanteExamenBase("P-00000308","EX-0022");
call insertarPostulanteExamenBase("P-00000309","EX-0010");
call insertarPostulanteExamenBase("P-00000309","EX-0022");
call insertarPostulanteExamenBase("P-00000310","EX-0010");
call insertarPostulanteExamenBase("P-00000310","EX-0022");
call insertarPostulanteExamenBase("P-00000311","EX-0010");
call insertarPostulanteExamenBase("P-00000311","EX-0022");
call insertarPostulanteExamenBase("P-00000312","EX-0010");
call insertarPostulanteExamenBase("P-00000312","EX-0022");
call insertarPostulanteExamenBase("P-00000313","EX-0010");
call insertarPostulanteExamenBase("P-00000313","EX-0022");
call insertarPostulanteExamenBase("P-00000314","EX-0010");
call insertarPostulanteExamenBase("P-00000314","EX-0022");
call insertarPostulanteExamenBase("P-00000315","EX-0010");
call insertarPostulanteExamenBase("P-00000315","EX-0022");
call insertarPostulanteExamenBase("P-00000316","EX-0010");
call insertarPostulanteExamenBase("P-00000316","EX-0022");
call insertarPostulanteExamenBase("P-00000317","EX-0010");
call insertarPostulanteExamenBase("P-00000317","EX-0022");
call insertarPostulanteExamenBase("P-00000318","EX-0010");
call insertarPostulanteExamenBase("P-00000318","EX-0022");
call insertarPostulanteExamenBase("P-00000319","EX-0010");
call insertarPostulanteExamenBase("P-00000319","EX-0022");
call insertarPostulanteExamenBase("P-00000320","EX-0010");
call insertarPostulanteExamenBase("P-00000320","EX-0022");
call insertarPostulanteExamenBase("P-00000321","EX-0010");
call insertarPostulanteExamenBase("P-00000321","EX-0022");
call insertarPostulanteExamenBase("P-00000322","EX-0010");
call insertarPostulanteExamenBase("P-00000322","EX-0022");
call insertarPostulanteExamenBase("P-00000323","EX-0010");
call insertarPostulanteExamenBase("P-00000323","EX-0022");
call insertarPostulanteExamenBase("P-00000324","EX-0010");
call insertarPostulanteExamenBase("P-00000324","EX-0022");
call insertarPostulanteExamenBase("P-00000325","EX-0010");
call insertarPostulanteExamenBase("P-00000325","EX-0022");
call insertarPostulanteExamenBase("P-00000326","EX-0010");
call insertarPostulanteExamenBase("P-00000326","EX-0022");
call insertarPostulanteExamenBase("P-00000327","EX-0010");
call insertarPostulanteExamenBase("P-00000327","EX-0022");
call insertarPostulanteExamenBase("P-00000328","EX-0010");
call insertarPostulanteExamenBase("P-00000328","EX-0022");
call insertarPostulanteExamenBase("P-00000329","EX-0010");
call insertarPostulanteExamenBase("P-00000329","EX-0022");
