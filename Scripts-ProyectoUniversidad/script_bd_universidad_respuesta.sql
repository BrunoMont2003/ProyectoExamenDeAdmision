use bdUniversidad;
-- drop table respuesta;
CREATE TABLE Respuesta (
    idRespuesta CHAR(15) NOT NULL,
    numero SMALLINT,
    letra CHAR(4),
    idPostulante CHAR(10),
    idExamen CHAR(8),
    PRIMARY KEY (idRespuesta),
    FOREIGN KEY (idPostulante)
        REFERENCES Postulante (idPostulante),
    FOREIGN KEY (idExamen)
        REFERENCES Examen (idExamen)
);
DELIMITER $$
create procedure insertar_respuesta(in idre char(15),  in num smallint, in let char(4), in idPos char(10), in idEx char(8))
begin
	insert into respuesta values(idre, num, let, idPos, idEx); 
end $$

drop procedure insertar_respuesta;

call insertar_respuesta("R-00002",2, 'd' ,"P-00000001","EX-0001");

DELIMITER $$
CREATE PROCEDURE buscarRespuesta(in id char(15))
BEGIN
  select * from respuesta where idRespuesta=id;
END$$

DELIMITER $$
CREATE PROCEDURE mostrarRespuestas()
BEGIN 
  select*from respuesta;
END$$
-- drop procedure mostrarRespuestas;
call mostrarRespuestas();


DELIMITER $$
create procedure modificarRespuesta(in id char(15),  in num smallint, in let char(4), in idPos char(10), in idEx char(8))
begin
  UPDATE respuesta SET numero=num, letra=let, idPostulante = idPos,idExamen = idEx WHERE idRespuesta=id;
end$$
-- drop procedure modificarRespuesta;
DELIMITER $$
create procedure eliminarRespuesta(in id char(15))
begin
  DELETE FROM respuesta where idRespuesta=id;
end$$
-- drop procedure eliminarRespuesta;


DELIMITER $$
create procedure eliminarRespuestasDeUnExamen(in idEx char(15))
begin
  DELETE FROM respuesta where idExamen=idEx;
end$$
call eliminarRespuestasDeUnExamen("EX-0001");

-- drop procedure eliminarrespuestasdeunexamen;

DELIMITER $$
create procedure eliminarRespuestasDeUnPostulante(in idPos char(10))
begin
  DELETE FROM respuesta where idPostulante=idPos;
end$$



DELIMITER $$
create procedure mostrarRespuestasDePostulante(in idPos char(10))
begin
  select * from respuesta where idPostulante like concat(idPos, '%');
end$$
-- drop procedure mostrarrespuestasdepostulante;
call mostrarRespuestasDePostulante("P-");

DELIMITER $$
create procedure mostrarRespuestasDePostulanteEnUnExamen(in idPos char(10), in idEx char(15))
begin
  select * from respuesta where idPostulante = idPos and idExamen=idEx;
end$$
call mostrarRespuestasDePostulanteEnUnExamen("P-00000001","EX-0001");


call insertar_respuesta("R-00001", 1, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00002", 2, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00003", 3, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00004", 4, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00005", 5, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00006", 6, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00007", 7, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00008", 8, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00009", 9, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00010", 10, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00011", 11, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00012", 12, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00013", 13, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00014", 14, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00015", 15, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00016", 16, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00017", 17, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00018", 18, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00019", 19, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00020", 20, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00021", 21, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00022", 22, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00023", 23, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00024", 24, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00025", 25, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00026", 26, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00027", 27, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00028", 28, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00029", 29, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00030", 30, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00031", 31, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00032", 32, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00033", 33, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00034", 34, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00035", 35, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00036", 36, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00037", 37, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00038", 38, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00039", 39, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00040", 40, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00041", 41, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00042", 42, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00043", 43, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00044", 44, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00045", 45, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00046", 46, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00047", 47, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00048", 48, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00049", 49, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00050", 50, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00051", 51, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00052", 52, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00053", 53, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00054", 54, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00055", 55, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00056", 56, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00057", 57, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00058", 58, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00059", 59, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00060", 60, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00061", 61, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00062", 62, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00063", 63, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00064", 64, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00065", 65, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00066", 66, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00067", 67, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00068", 68, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00069", 69, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00070", 70, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00071", 71, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00072", 72, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00073", 73, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00074", 74, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00075", 75, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00076", 76, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00077", 77, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00078", 78, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00079", 79, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00080", 80, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00081", 81, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00082", 82, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00083", 83, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00084", 84, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00085", 85, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00086", 86, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00087", 87, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00088", 88, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00089", 89, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00090", 90, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00091", 91, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00092", 92, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00093", 93, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00094", 94, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00095", 95, 'a', "P-00000001","EX-0001");
call insertar_respuesta("R-00096", 96, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00097", 97, 'd', "P-00000001","EX-0001");
call insertar_respuesta("R-00098", 98, 'c', "P-00000001","EX-0001");
call insertar_respuesta("R-00099", 99, 'b', "P-00000001","EX-0001");
call insertar_respuesta("R-00100", 100, 'a', "P-00000001","EX-0001");
