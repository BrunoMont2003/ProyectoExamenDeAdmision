use bduniversidad;

create table clave(
	idClave char(15) not null, 
    numero smallint, 
    letra char(1),
    idExamen char(8) not null,
    primary key  (idClave) ,
    foreign key(idExamen) references Examen(idExamen)
);
-- drop table clave;

DELIMITER $$
CREATE PROCEDURE insertarClave(in id char(15), in num smallint, in let char(1), idEx char(8))
BEGIN
  insert into clave(idClave, numero, letra, idExamen) values (id,num, let, idEx);
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
create procedure modificarClave(in id char(15), in num smallint, in let char(1), idEx char(8))
begin
  UPDATE clave SET numero=num, letra=letra, idExamen = idEx WHERE idClave=id;
end$$
-- drop procedure modificarClave;
DELIMITER $$
create procedure eliminarClave(in id char(15))
begin
  DELETE FROM clave where idClave=id;
end$$
-- drop procedure eliminarClave;



call insertarClave("C-00001", 1, 'b',"EX-0001");
call insertarClave("C-00002", 2, 'd',"EX-0001");
call insertarClave("C-00003", 3, 'd',"EX-0001");
call insertarClave("C-00004", 4, 'b',"EX-0001");
call insertarClave("C-00005", 5, 'c',"EX-0001");
call insertarClave("C-00006", 6, 'b',"EX-0001");
call insertarClave("C-00007", 7, 'a',"EX-0001");
call insertarClave("C-00008", 8, 'd',"EX-0001");
call insertarClave("C-00009", 9, 'c',"EX-0001");
call insertarClave("C-00010", 10, 'a',"EX-0001");
call insertarClave("C-00011", 11, 'c',"EX-0001");
call insertarClave("C-00012", 12, 'b',"EX-0001");
call insertarClave("C-00013", 13, 'd',"EX-0001");
call insertarClave("C-00014", 14, 'c',"EX-0001");
call insertarClave("C-00015", 15, 'b',"EX-0001");
call insertarClave("C-00016", 16, 'd',"EX-0001");
call insertarClave("C-00017", 17, 'a',"EX-0001");
call insertarClave("C-00018", 18, 'c',"EX-0001");
call insertarClave("C-00019", 19, 'd',"EX-0001");
call insertarClave("C-00020", 20, 'c',"EX-0001");
call insertarClave("C-00021", 21, 'd',"EX-0001");
call insertarClave("C-00022", 22, 'c',"EX-0001");
call insertarClave("C-00023", 23, 'b',"EX-0001");
call insertarClave("C-00024", 24, 'a',"EX-0001");
call insertarClave("C-00025", 25, 'c',"EX-0001");
call insertarClave("C-00026", 26, 'd',"EX-0001");
call insertarClave("C-00027", 27, 'c',"EX-0001");
call insertarClave("C-00028", 28, 'b',"EX-0001");
call insertarClave("C-00029", 29, 'd',"EX-0001");
call insertarClave("C-00030", 30, 'b',"EX-0001");
call insertarClave("C-00031", 31, 'c',"EX-0001");
call insertarClave("C-00032", 32, 'd',"EX-0001");
call insertarClave("C-00033", 33, 'd',"EX-0001");
call insertarClave("C-00034", 34, 'b',"EX-0001");
call insertarClave("C-00035", 35, 'c',"EX-0001");
call insertarClave("C-00036", 36, 'c',"EX-0001");
call insertarClave("C-00037", 37, 'c',"EX-0001");
call insertarClave("C-00038", 38, 'b',"EX-0001");
call insertarClave("C-00039", 39, 'c',"EX-0001");
call insertarClave("C-00040", 40, 'd',"EX-0001");
call insertarClave("C-00041", 41, 'b',"EX-0001");
call insertarClave("C-00042", 42, 'c',"EX-0001");
call insertarClave("C-00043", 43, 'c',"EX-0001");
call insertarClave("C-00044", 44, 'c',"EX-0001");
call insertarClave("C-00045", 45, 'd',"EX-0001");
call insertarClave("C-00046", 46, 'd',"EX-0001");
call insertarClave("C-00047", 47, 'd',"EX-0001");
call insertarClave("C-00048", 48, 'b',"EX-0001");
call insertarClave("C-00049", 49, 'b',"EX-0001");
call insertarClave("C-00050", 50, 'a',"EX-0001");
call insertarClave("C-00051", 51, 'c',"EX-0001");
call insertarClave("C-00052", 52, 'b',"EX-0001");
call insertarClave("C-00053", 53, 'a',"EX-0001");
call insertarClave("C-00054", 54, 'b',"EX-0001");
call insertarClave("C-00055", 55, 'd',"EX-0001");
call insertarClave("C-00056", 56, 'd',"EX-0001");
call insertarClave("C-00057", 57, 'b',"EX-0001");
call insertarClave("C-00058", 58, 'c',"EX-0001");
call insertarClave("C-00059", 59, 'd',"EX-0001");
call insertarClave("C-00060", 60, 'c',"EX-0001");
call insertarClave("C-00061", 61, 'b',"EX-0001");
call insertarClave("C-00062", 62, 'a',"EX-0001");
call insertarClave("C-00063", 63, 'b',"EX-0001");
call insertarClave("C-00064", 64, 'b',"EX-0001");
call insertarClave("C-00065", 65, 'b',"EX-0001");
call insertarClave("C-00066", 66, 'b',"EX-0001");
call insertarClave("C-00067", 67, 'b',"EX-0001");
call insertarClave("C-00068", 68, 'd',"EX-0001");
call insertarClave("C-00069", 69, 'a',"EX-0001");
call insertarClave("C-00070", 70, 'd',"EX-0001");
call insertarClave("C-00071", 71, 'a',"EX-0001");
call insertarClave("C-00072", 72, 'c',"EX-0001");
call insertarClave("C-00073", 73, 'c',"EX-0001");
call insertarClave("C-00074", 74, 'c',"EX-0001");
call insertarClave("C-00075", 75, 'b',"EX-0001");
call insertarClave("C-00076", 76, 'b',"EX-0001");
call insertarClave("C-00077", 77, 'c',"EX-0001");
call insertarClave("C-00078", 78, 'c',"EX-0001");
call insertarClave("C-00079", 79, 'c',"EX-0001");
call insertarClave("C-00080", 80, 'c',"EX-0001");
call insertarClave("C-00081", 81, 'a',"EX-0001");
call insertarClave("C-00082", 82, 'a',"EX-0001");
call insertarClave("C-00083", 83, 'd',"EX-0001");
call insertarClave("C-00084", 84, 'd',"EX-0001");
call insertarClave("C-00085", 85, 'a',"EX-0001");
call insertarClave("C-00086", 86, 'a',"EX-0001");
call insertarClave("C-00087", 87, 'd',"EX-0001");
call insertarClave("C-00088", 88, 'a',"EX-0001");
call insertarClave("C-00089", 89, 'a',"EX-0001");
call insertarClave("C-00090", 90, 'b',"EX-0001");
call insertarClave("C-00091", 91, 'c',"EX-0001");
call insertarClave("C-00092", 92, 'c',"EX-0001");
call insertarClave("C-00093", 93, 'd',"EX-0001");
call insertarClave("C-00094", 94, 'c',"EX-0001");
call insertarClave("C-00095", 95, 'c',"EX-0001");
call insertarClave("C-00096", 96, 'c',"EX-0001");
call insertarClave("C-00097", 97, 'c',"EX-0001");
call insertarClave("C-00098", 98, 'c',"EX-0001");
call insertarClave("C-00099", 99, 'c',"EX-0001");
call insertarClave("C-00100", 100, 'a',"EX-0001");

