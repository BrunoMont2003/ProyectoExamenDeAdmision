use bduniversidad;

drop procedure insertar_aula;
drop table aula;
drop procedure mostrarAula;
drop procedure buscar_Area;
drop procedure buscarArea;
drop procedure eliminarArea;
drop procedure modificarArea;

create table aula(
	idAula char(8) not null,
    numeroAula int not null,
    capacidad int not null,
    numeroAusentes int not null,
    idArea char(10) not null,
    primary key (idAula),
    foreign key (idArea) references areaU(idArea)
);

DELIMITER $$
CREATE PROCEDURE insertar_aula(in idAu char(8), in numA int, in cap int, numAU int, idA char(10))
BEGIN
  insert into aula(idAula,numeroAula,capacidad,numeroAusentes, idArea) values (idAu,numA,cap,numAu,idA);
END$$


DELIMITER $$
CREATE PROCEDURE mostrarAulas()
BEGIN 
  select*from aula;
END$$



DELIMITER $$
create procedure buscarAula(in idAu char(8))
begin
  select * from facultad where idAula=idAu;
end$$


DELIMITER $$
CREATE PROCEDURE buscar_Aula(in idare char(10))
BEGIN
	select * from aula where concat(idAula,numeroAula,capacidad,numeroAusentes,idArea) like concat('%','%','%','%',idare);
END$$



DELIMITER $$
create procedure modificarAula(in idAu char(8), in numA int, in cap int, numAU int, idA char(10))
begin
  UPDATE aula SET numeroAula=numA, capacidad=cap,numeroAusentes=numAU, idArea=idA WHERE idAula=idAu;
end$$


DELIMITER $$
create procedure eliminarAula(in idAu char(8))
begin
  DELETE FROM aula where idAula=idAu;
end$$
