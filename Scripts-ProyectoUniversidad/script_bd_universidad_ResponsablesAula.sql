create database bduniversidad;
use bduniversidad;

drop database bduniversidad;

create table responsableAula(
	idResponsable char(8) not null,
    apellidosResp varchar(60) not null,
    nombresResp varchar(60) not null,
    dniResp char(8) not null,
    idAula char(8) not null,
    primary key (idResponsable),
    foreign key (idAula) references aula(idAula)
);

DELIMITER $$
create procedure insertar_Responsable(in idRes char(8), in apellid varchar(60), in nombr varchar(60), in dni char(8), in idAul char(8))
begin
	insert into responsableAula(idResponsable, apellidosResp, nombresResp, dniResp, idAula) values (idRes, apellid, nombr, dni, idAul);
end$$

DELIMITER $$
create procedure mostrar_Responsables()
begin
	select * from responsableAula; 
end$$

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


