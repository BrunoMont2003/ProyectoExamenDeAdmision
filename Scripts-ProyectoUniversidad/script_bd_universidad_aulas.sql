use bduniversidad;

drop procedure insertar_aula;
drop table aula;
drop procedure mostrarAula;
drop procedure buscar_Area;
drop procedure buscarAula;
drop procedure eliminarArea;
drop procedure modificarArea;

CREATE TABLE aula (
    idAula CHAR(8) NOT NULL,
    numeroAula INT NOT NULL,
    capacidad INT NOT NULL,
    numeroAusentes INT NOT NULL,
    idArea CHAR(10) NOT NULL,
    PRIMARY KEY (idAula),
    FOREIGN KEY (idArea)
        REFERENCES areaU (idArea)
);

DELIMITER $$
CREATE PROCEDURE insertar_aula(in idAu char(8), in numA int, in cap int, numAU int, idA char(10))
BEGIN
  insert into aula(idAula,numeroAula,capacidad,numeroAusentes, idArea) values (idAu,numA,cap,numAu,idA);
END$$
call insertar_aula("A-00001",101,45, 44, "AREA_A");

DELIMITER $$
CREATE PROCEDURE mostrarAulas()
BEGIN 
  select*from aula;
END$$



DELIMITER $$
create procedure buscarAula(in idAu char(8))
begin
  select * from aula where idAula=idAu;
end$$

call buscarAula('A-00001');


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
	call eliminarResponsablesDeUnAula(idAu);
    DELETE FROM aula where idAula=idAu;
end$$
-- drop procedure eliminarAula;
call eliminarAula("A-00001");

DELIMITER $$
CREATE PROCEDURE mostrarAulasDeUnArea(in id char(15))
BEGIN
  select * from Aula where idArea=id;
END$$
