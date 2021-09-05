create database bduniversidad;
use bduniversidad;

drop database bduniversidad;

CREATE TABLE responsableAula (
    idResponsable CHAR(8) NOT NULL,
    apellidosResp VARCHAR(60) NOT NULL,
    nombresResp VARCHAR(60) NOT NULL,
    dniResp CHAR(8) NOT NULL,
    idAula CHAR(8) NOT NULL,
    PRIMARY KEY (idResponsable),
    FOREIGN KEY (idAula)
        REFERENCES aula (idAula)
);

DELIMITER $$
create procedure insertar_Responsable(in idRes char(8), in apellid varchar(60), in nombr varchar(60), in dni char(8), in idAul char(8))
begin
	insert into responsableAula(idResponsable, apellidosResp, nombresResp, dniResp, idAula) values (idRes, apellid, nombr, dni, idAul);
end$$
call insertar_Responsable("R-00001", "Gálvez Orezolli", "Daira Sofía","73901875","A-00001");

DELIMITER $$
create procedure mostrar_Responsables()
begin
	select * from responsableAula; 
end$$

call mostrar_Responsables();

DELIMITER $$
create procedure buscar_Responsable(in idRes char(8))
begin
	select * from responsableAula where idResponsable= idRes; 
end$$

DELIMITER $$
create procedure buscarResponsable_PorNombre(in nombre varchar(60))
begin
	select * from responsableAula where nombresResp = nombre; 
end$$

DELIMITER $$
create procedure eliminar_Responsable(in idRes char(8))
begin
	delete from responsableAula where idResponsable= idRes; 
end$$

DELIMITER $$
create procedure modificar_Responsable(in idRes char(8), in apellid varchar(60),in nombr varchar(60),in dni char(8), in idAul char(8))
begin
	update responsableAula set apellidosResp= apellid, nombresResp=nombr, dniResp=dni, idAula=idAul where idResponsable=idRes; 
end$$


DELIMITER $$
create procedure eliminarResponsablesDeUnAula(in idAu char(15))
begin
  DELETE FROM responsableaula where idAula=idAu;
end$$
call eliminarResponsablesDeUnAula("A-00001");
