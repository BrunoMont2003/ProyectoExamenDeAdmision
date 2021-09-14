create database bduniversidad;
use bduniversidad;

drop database bduniversidad;

CREATE TABLE error (
    idError CHAR(7) NOT NULL,
    descripcion LONGTEXT NOT NULL,
    idClave CHAR(15) NOT NULL,
    PRIMARY KEY (idError),
    FOREIGN KEY (idClave)
        REFERENCES clave (idClave)
);

call insertar_Error("ER-0001", "Enunciado incompleto","C-00001");
call insertar_Error("ER-0002", "Claves incorrectas","C-00005");
call insertar_Error("ER-0003", "Claves incorrectas","C-00007");
call insertar_Error("ER-0004", "Falta de legibilidad","C-00009");
call insertar_Error("ER-0005", "Claves incorrectas","C-00011");
call insertar_Error("ER-0006", "Enunciado incomprensible","C-00011");
call insertar_Error("ER-0007", "El enunciado no corresponde al curso","C-00016");
call insertar_Error("ER-0008", "Falta de legibilidad","C-00013");
call insertar_Error("ER-0009", "Enunciado incompleto","C-00015");
call insertar_Error("ER-0010", "Falta de legibilidad","C-00099");
call insertar_Error("ER-0011", "Claves incorrectas","C-00026");
call insertar_Error("ER-0012", "Enunciado incompleto","C-00028");
call insertar_Error("ER-0013", "Falta de legibilidad","C-00025");
call insertar_Error("ER-0014", "Claves incorrectas","C-00055");
call insertar_Error("ER-0015", "El enunciado no corresponde al curso","C-00072");
call insertar_Error("ER-0016", "Enunciado no esta dentro de los temas de evaluacion","C-00088");
call insertar_Error("ER-0017", "Falta de legibilidad","C-00077");
call insertar_Error("ER-0018", "Enunciado incompleto","C-00040");
call insertar_Error("ER-0019", "Claves incorrectas","C-00100");
call insertar_Error("ER-0020", "Enunciado no esta dentro de los temas de evaluacion","C-00048");
call insertar_Error("ER-0021", "Enunciado incompleto","C-00016");
call insertar_Error("ER-0022", "Enunciado incompleto","C-00022");
call insertar_Error("ER-0023", "Claves incorrectas","C-00033");
call insertar_Error("ER-0024", "Claves incorrectas","C-00088");
call insertar_Error("ER-0025", "Enunciado no esta dentro de los temas de evaluacion","C-00066");
call insertar_Error("ER-0026", "Claves incorrectas","C-00002");
call insertar_Error("ER-0027", "Enunciado incompleto","C-00023");
call insertar_Error("ER-0028", "Enunciado no esta dentro de los temas de evaluacion","C-00041");
call insertar_Error("ER-0029", "Falta de legibilidad","C-00095");
call insertar_Error("ER-0030", "Claves incorrectas","C-00096");

DELIMITER $$
create procedure insertar_Error(in idE char(7), in des longtext, in idc varchar(15))
begin
	insert into error(idError, descripcion, idClave) values (idE, des, idc);
end$$


DELIMITER $$
create procedure mostrar_Errores()
begin
	select * from error; 
end$$

call mostrar_Errores();

DELIMITER $$
create procedure buscar_Error(in idE char(7))
begin
	select * from error where idError= idE; 
end$$

DELIMITER $$
create procedure buscarError_PorClave(in idC char(15))
begin
	select * from error where idClave = idC; 
end$$

DELIMITER $$
create procedure eliminar_Error(in idE char(7))
begin
	delete from error where idError= idE; 
end$$ 

DELIMITER $$
create procedure eliminarErroresDeUnaClave(in idC char(15))
begin
  DELETE FROM clave where idClave=idC;
end$$

DELIMITER $$
create procedure modificar_Error(in idE char(7), in des longtext,in idC char(15))
begin
	update error set descripcion=des, idClave=idC where idError=idE; 
end$$

DELIMITER $$
CREATE PROCEDURE BuscarClavesConMayorError(in id char(7))
BEGIN
  select  idClave ,  count(*)  CantidadDeErrores  from Error where idClave=id;
END$$

drop procedure clavesConMayorError;

call BuscarClavesConMayorError('C-00011');

DELIMITER $$
CREATE PROCEDURE clavesConMayorErrora()
BEGIN
  select  idClave ,  count(*)  CantidadDeErrores  from Error
  group by idClave;
END$$


call clavesConMayorErrora();

DELIMITER $$
CREATE PROCEDURE erroresyclaves()
BEGIN
  select  idError ,  count(*)  CantidadDeClaves from Error
  group by idError;
END$$

call erroresyclaves();