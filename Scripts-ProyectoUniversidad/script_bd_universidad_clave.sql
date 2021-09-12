use bduniversidad;

CREATE TABLE clave (
    idClave CHAR(15) NOT NULL,
    numero SMALLINT,
    letra CHAR(4),
    idExamen CHAR(8) NOT NULL,
    idRangoPreguntas CHAR(8) NOT NULL,
    PRIMARY KEY (idClave),
    FOREIGN KEY (idExamen)
        REFERENCES Examen (idExamen),
    FOREIGN KEY (idRangoPreguntas)
        REFERENCES RangoPreguntas (idRangoPreguntas)
);
drop table clave;

DELIMITER $$
CREATE PROCEDURE insertarClave(in id char(15), in num smallint, in let char(4), idEx char(8), idR char(8))
BEGIN
  insert into clave(idClave, numero, letra, idExamen, idRangoPreguntas) values (id,num, let, idEx, idR);
END$$
-- drop procedure insertarClave;


DELIMITER $$
CREATE PROCEDURE buscarClave(in id char(15))
BEGIN
  select * from clave where idClave=id;
END$$

DELIMITER $$
CREATE PROCEDURE mostrarClaves()
BEGIN 
  select*from clave;
END$$
-- drop procedure mostrarClaves;
call mostrarClaves();


DELIMITER $$
create procedure modificarClave(in id char(15), in num smallint, in let char(4), idEx char(8), idR char(8))
begin
  UPDATE clave SET numero=num, letra=letra, idExamen = idEx, idRangoPreguntas=idR WHERE idClave=id;
end$$
-- drop procedure modificarClave;
DELIMITER $$
create procedure eliminarClave(in id char(15))
begin
  DELETE FROM clave where idClave=id;
end$$
-- drop procedure eliminarClave;


DELIMITER $$
create procedure eliminarClavesDeUnExamen(in idEx char(15))
begin
  DELETE FROM clave where idExamen=idEx;
end$$
call eliminarClavesDeUnExamen("EX-0001");

-- drop procedure eliminarclavedeunexamen;




DELIMITER $$
create procedure mostrarClavesDeExamen(in idEx char(15))
begin
  select * from clave where idExamen like concat(idEx, '%');
end$$
-- drop procedure mostrarclavesdeexamen;
call mostrarClavesDeExamen("EX");

DELIMITER $$
create procedure buscarClavePorExamenYNumero(in idEx char(15), in num smallint)
begin
  select * from clave where idExamen= idEx and numero=num;
end$$
-- drop procedure mostrarclavesdeexamen;
call buscarClavePorExamenYNumero("EX-0001", 2);





call insertarClave("C-00001", 1, 'd',"EX-0001","RAN-001");
call insertarClave("C-00002", 2, 'c',"EX-0001","RAN-001");
call insertarClave("C-00003", 3, 'a',"EX-0001","RAN-001");
call insertarClave("C-00004", 4, 'c',"EX-0001","RAN-001");
call insertarClave("C-00005", 5, 'b',"EX-0001","RAN-001");
call insertarClave("C-00006", 6, 'd',"EX-0001","RAN-001");
call insertarClave("C-00007", 7, 'd',"EX-0001","RAN-001");
call insertarClave("C-00008", 8, 'b',"EX-0001","RAN-001");
call insertarClave("C-00009", 9, 'd',"EX-0001","RAN-001");
call insertarClave("C-00010", 10, 'c',"EX-0001","RAN-001");
call insertarClave("C-00011", 11, 'b',"EX-0001","RAN-001");
call insertarClave("C-00012", 12, 'b',"EX-0001","RAN-001");
call insertarClave("C-00013", 13, 'b',"EX-0001","RAN-001");
call insertarClave("C-00014", 14, 'b',"EX-0001","RAN-001");
call insertarClave("C-00015", 15, 'b',"EX-0001","RAN-001");
call insertarClave("C-00016", 16, 'd',"EX-0001","RAN-001");
call insertarClave("C-00017", 17, 'a',"EX-0001","RAN-001");
call insertarClave("C-00018", 18, 'b',"EX-0001","RAN-001");
call insertarClave("C-00019", 19, 'c',"EX-0001","RAN-001");
call insertarClave("C-00020", 20, 'b',"EX-0001","RAN-001");
call insertarClave("C-00021", 21, 'c',"EX-0001","RAN-001");
call insertarClave("C-00022", 22, 'c',"EX-0001","RAN-001");
call insertarClave("C-00023", 23, 'd',"EX-0001","RAN-001");
call insertarClave("C-00024", 24, 'c',"EX-0001","RAN-001");
call insertarClave("C-00025", 25, 'c',"EX-0001","RAN-001");
call insertarClave("C-00026", 26, 'b',"EX-0001","RAN-001");
call insertarClave("C-00027", 27, 'c',"EX-0001","RAN-001");
call insertarClave("C-00028", 28, 'a',"EX-0001","RAN-001");
call insertarClave("C-00029", 29, 'd',"EX-0001","RAN-001");
call insertarClave("C-00030", 30, 'b',"EX-0001","RAN-001");
call insertarClave("C-00031", 31, 'd',"EX-0001","RAN-002");
call insertarClave("C-00032", 32, 'c',"EX-0001","RAN-002");
call insertarClave("C-00033", 33, 'c',"EX-0001","RAN-002");
call insertarClave("C-00034", 34, 'c',"EX-0001","RAN-002");
call insertarClave("C-00035", 35, 'a',"EX-0001","RAN-002");
call insertarClave("C-00036", 36, 'a',"EX-0001","RAN-002");
call insertarClave("C-00037", 37, 'a',"EX-0001","RAN-002");
call insertarClave("C-00038", 38, 'b',"EX-0001","RAN-002");
call insertarClave("C-00039", 39, 'b',"EX-0001","RAN-002");
call insertarClave("C-00040", 40, 'b',"EX-0001","RAN-002");
call insertarClave("C-00041", 41, 'd',"EX-0001","RAN-002");
call insertarClave("C-00042", 42, 'b',"EX-0001","RAN-002");
call insertarClave("C-00043", 43, 'a',"EX-0001","RAN-002");
call insertarClave("C-00044", 44, 'c',"EX-0001","RAN-002");
call insertarClave("C-00045", 45, 'd',"EX-0001","RAN-002");
call insertarClave("C-00046", 46, 'd',"EX-0001","RAN-002");
call insertarClave("C-00047", 47, 'b',"EX-0001","RAN-002");
call insertarClave("C-00048", 48, 'c',"EX-0001","RAN-002");
call insertarClave("C-00049", 49, 'b',"EX-0001","RAN-002");
call insertarClave("C-00050", 50, 'c',"EX-0001","RAN-002");
call insertarClave("C-00051", 51, 'b',"EX-0001","RAN-002");
call insertarClave("C-00052", 52, 'a',"EX-0001","RAN-002");
call insertarClave("C-00053", 53, 'c',"EX-0001","RAN-002");
call insertarClave("C-00054", 54, 'b',"EX-0001","RAN-002");
call insertarClave("C-00055", 55, 'c',"EX-0001","RAN-002");
call insertarClave("C-00056", 56, 'a',"EX-0001","RAN-002");
call insertarClave("C-00057", 57, 'a',"EX-0001","RAN-002");
call insertarClave("C-00058", 58, 'a',"EX-0001","RAN-002");
call insertarClave("C-00059", 59, 'a',"EX-0001","RAN-002");
call insertarClave("C-00060", 60, 'a',"EX-0001","RAN-002");
call insertarClave("C-00061", 61, 'c',"EX-0001","RAN-002");
call insertarClave("C-00062", 62, 'b',"EX-0001","RAN-002");
call insertarClave("C-00063", 63, 'b',"EX-0001","RAN-002");
call insertarClave("C-00064", 64, 'd',"EX-0001","RAN-002");
call insertarClave("C-00065", 65, 'd',"EX-0001","RAN-002");
call insertarClave("C-00066", 66, 'd',"EX-0001","RAN-002");
call insertarClave("C-00067", 67, 'b',"EX-0001","RAN-002");
call insertarClave("C-00068", 68, 'b',"EX-0001","RAN-002");
call insertarClave("C-00069", 69, 'a',"EX-0001","RAN-002");
call insertarClave("C-00070", 70, 'b',"EX-0001","RAN-002");
call insertarClave("C-00071", 71, 'c',"EX-0001","RAN-002");
call insertarClave("C-00072", 72, 'a',"EX-0001","RAN-002");
call insertarClave("C-00073", 73, 'c',"EX-0001","RAN-002");
call insertarClave("C-00074", 74, 'd',"EX-0001","RAN-002");
call insertarClave("C-00075", 75, 'c',"EX-0001","RAN-002");
call insertarClave("C-00076", 76, 'c',"EX-0001","RAN-002");
call insertarClave("C-00077", 77, 'd',"EX-0001","RAN-002");
call insertarClave("C-00078", 78, 'a',"EX-0001","RAN-002");
call insertarClave("C-00079", 79, 'c',"EX-0001","RAN-002");
call insertarClave("C-00080", 80, 'a',"EX-0001","RAN-002");
call insertarClave("C-00081", 81, 'd',"EX-0001","RAN-002");
call insertarClave("C-00082", 82, 'c',"EX-0001","RAN-002");
call insertarClave("C-00083", 83, 'b',"EX-0001","RAN-002");
call insertarClave("C-00084", 84, 'c',"EX-0001","RAN-002");
call insertarClave("C-00085", 85, 'c',"EX-0001","RAN-002");
call insertarClave("C-00086", 86, 'b',"EX-0001","RAN-002");
call insertarClave("C-00087", 87, 'a',"EX-0001","RAN-002");
call insertarClave("C-00088", 88, 'b',"EX-0001","RAN-002");
call insertarClave("C-00089", 89, 'c',"EX-0001","RAN-002");
call insertarClave("C-00090", 90, 'c',"EX-0001","RAN-002");
call insertarClave("C-00091", 91, 'a',"EX-0001","RAN-002");
call insertarClave("C-00092", 92, 'a',"EX-0001","RAN-002");
call insertarClave("C-00093", 93, 'd',"EX-0001","RAN-002");
call insertarClave("C-00094", 94, 'a',"EX-0001","RAN-002");
call insertarClave("C-00095", 95, 'a',"EX-0001","RAN-002");
call insertarClave("C-00096", 96, 'c',"EX-0001","RAN-002");
call insertarClave("C-00097", 97, 'a',"EX-0001","RAN-002");
call insertarClave("C-00098", 98, 'c',"EX-0001","RAN-002");
call insertarClave("C-00099", 99, 'b',"EX-0001","RAN-002");
call insertarClave("C-00100", 100, 'c',"EX-0001","RAN-002");