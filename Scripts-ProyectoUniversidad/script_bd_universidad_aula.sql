use bduniversidad;

create table aula(
	idAula char(10) not null,
	numeroAula smallint not null,
    capacidad smallint not null,
    numeroAusentes smallint not null,
    idArea char(10) not null,
    primary key(idAula),
    foreign key(idArea) references areaU(idArea)
);
select * from aula;

DELIMITER $$
CREATE PROCEDURE insertar_aula(in idAu char(10), in nombAu smallint, in cap smallint, in numeroAus smallint, in idAr char(10))
BEGIN
  insert into aula(idAula,numeroAula,capacidad,numeroAusentes,idArea) values (idAu,nombAu,cap,numeroAus,idAr);
END$$
-- drop procedure insertar_aula;
call insertar_aula('AULA-001','1','32','10','AREA_A');