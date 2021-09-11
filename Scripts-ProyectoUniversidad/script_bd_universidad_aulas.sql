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

call insertar_aula("B-00002",102,30, 10, "AREA_B");
call insertar_aula("B-00003",103,45, 6, "AREA_B");
call insertar_aula("C-00004",104,45, 5, "AREA_C");
call insertar_aula("A-00005",105,45, 1, "AREA_A");
call insertar_aula("A-00006",106,30, 3, "AREA_A");
call insertar_aula("D-00007",107,45, 2, "AREA_D");
call insertar_aula("B-00008",108,30, 5, "AREA_B");
call insertar_aula("B-00009",109,45, 3, "AREA_B");
call insertar_aula("A-00010",110,45, 5, "AREA_A");
call insertar_aula("D-00011",111,45, 11, "AREA_D");
call insertar_aula("D-00012",112,45, 7, "AREA_D");
call insertar_aula("C-00013",113,30, 2, "AREA_C");
call insertar_aula("B-00014",114,30, 6, "AREA_B");
call insertar_aula("A-00015",115,45, 0, "AREA_A");
call insertar_aula("D-00016",116,45, 2, "AREA_D");
call insertar_aula("B-00017",117,45, 9, "AREA_B");
call insertar_aula("B-00018",118,45, 6, "AREA_B");
call insertar_aula("A-00019",119,45, 7, "AREA_A");
call insertar_aula("A-00020",120,30, 6, "AREA_A");
call insertar_aula("D-00021",121,45, 7, "AREA_D");
call insertar_aula("B-00022",122,45, 1, "AREA_B");
call insertar_aula("C-00023",123,30, 7, "AREA_C");
call insertar_aula("C-00024",124,45, 0, "AREA_C");
call insertar_aula("A-00025",125,45, 10, "AREA_A");

call insertar_aula("A-00002",126,35, 8, "AREA_A");
call insertar_aula("B-00001",127,40, 0, "AREA_B");
call insertar_aula("B-00004",128,55, 4, "AREA_B");
call insertar_aula("C-00001",129,65, 7, "AREA_C");
call insertar_aula("A-00003",130,35, 8, "AREA_A");
call insertar_aula("A-00004",131,25, 6, "AREA_A");
call insertar_aula("D-00001",132,30, 2, "AREA_D");
call insertar_aula("B-00005",133,35, 1, "AREA_B");
call insertar_aula("B-00006",134,45, 11, "AREA_B");
call insertar_aula("A-00007",135,50, 13, "AREA_A");
call insertar_aula("D-00002",136,60, 9, "AREA_D");
call insertar_aula("D-00003",137,30, 8, "AREA_D");
call insertar_aula("C-00002",138,25, 7, "AREA_C");
call insertar_aula("B-00007",139,45, 0, "AREA_B");
call insertar_aula("A-00008",140,25, 4, "AREA_A");
call insertar_aula("D-00004",141,35, 2, "AREA_D");
call insertar_aula("B-00010",142,40, 13, "AREA_B");
call insertar_aula("B-00011",143,45, 18, "AREA_B");
call insertar_aula("A-00009",144,40, 2, "AREA_A");
call insertar_aula("A-00011",145,35, 1, "AREA_A");
call insertar_aula("D-00005",146,40, 0, "AREA_D");
call insertar_aula("B-00012",147,45, 10, "AREA_B");
call insertar_aula("C-00003",148,35, 9, "AREA_C");
call insertar_aula("C-00005",149,40, 0, "AREA_C");
call insertar_aula("A-00012",150,45, 1, "AREA_A");


DELIMITER $$
CREATE PROCEDURE mostrarAulas()
BEGIN 
  select*from aula;
END$$

call mostrarAulas;

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

