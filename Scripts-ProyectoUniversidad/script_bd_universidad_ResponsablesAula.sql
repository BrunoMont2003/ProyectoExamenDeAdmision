create database bduniversidad;
use bduniversidad;

drop table responsableAula;

CREATE TABLE responsableAula (
    idResponsable CHAR(8) NOT NULL,
    apellidosResp VARCHAR(60) NOT NULL,
    nombresResp VARCHAR(60) NOT NULL,
    dniResp CHAR(8) NOT NULL,
    idAula CHAR(8) NOT NULL,
    PRIMARY KEY (idResponsable),
    FOREIGN KEY (idAula)
        REFERENCES aula (idAula) ON update CASCADE ON DELETE CASCADE
);
SET FOREIGN_KEY_CHECKS=0; DROP TABLE responsableaula; SET FOREIGN_KEY_CHECKS=1;
DELIMITER $$
create procedure insertar_Responsable(in idRes char(8), in apellid varchar(60), in nombr varchar(60), in dni char(8), in idAul char(8))
begin
	insert into responsableAula(idResponsable, apellidosResp, nombresResp, dniResp, idAula) values (idRes, apellid, nombr, dni, idAul);
end$$
call insertar_Responsable("R-00001", "Gálvez Orezolli", "Daira Sofía","73901875","A-00001");
call insertar_Responsable("R-00002", "Moreno Alva", "Julio Herminio","75845123","A-00001");
call insertar_Responsable("R-00003", "Ramos Soriano", "Rosa Janeth","73086825","B-00002");
call insertar_Responsable("R-00004", "Cubas Gonzales", "Noheli Rosa","73306878","B-00003");
call insertar_Responsable("R-00005", "Alvarado Avalos", "Carmen Yovani","73953875","B-00003");
call insertar_Responsable("R-00006", "Ruiz Carrasco", "Gisela Yulissa","73601865","C-00004");
call insertar_Responsable("R-00007", "Cabrera Rodriguez", "Mario Sebastian","78902875","A-00005");
call insertar_Responsable("R-00008", "Castañeda Chavez", "Ruth Jakeline","73921678","A-00006");
call insertar_Responsable("R-00009", "Zavaleta Castro", "Flor Diana","75801875","D-00007");
call insertar_Responsable("R-00010", "Bruno Bautista", "Araceli del Milagro","7590135","B-00008");
call insertar_Responsable("R-00011", "Cordova Mondragon", "Dora Lidia","73960879","B-00009");
call insertar_Responsable("R-00012", "Medina Jimenez", "Misler Noemi","77001878","A-00010");
call insertar_Responsable("R-00013", "Rios Paucar", "Rosario Dana","71006458","A-00010");
call insertar_Responsable("R-00014", "Villegas Mena", "María Santos","77260875","D-00011");
call insertar_Responsable("R-00015", "Pacheco Villegas", "Cornelio Marleny","71981065","D-00012");
call insertar_Responsable("R-00016", "Santos Sanchez", "Angie Gianella","72920875","C-00013");
call insertar_Responsable("R-00017", "Villegas Villegas", "María del Pilar","73900175","B-00014");
call insertar_Responsable("R-00018", "German Romero", "Nestor Rolando","76903965","A-00015");
call insertar_Responsable("R-00019", "Ecos Baldeon", "María Jessenia","73001807","D-00016");
call insertar_Responsable("R-00020", "Villegas Perez", "Domingo Guzman","73006825","B-00017");
call insertar_Responsable("R-00021", "Simon Lazarte", "Marcos Johony","73521885","B-00017");
call insertar_Responsable("R-00022", "Guerra Diaz", "Zoila Noemi","73480679","B-00018");
call insertar_Responsable("R-00023", "Lezama Salazar", "Jaime Cristian","76211875","B-00018");
call insertar_Responsable("R-00024", "Romero Alor", "Jorge Luis","72941955","A-00019");
call insertar_Responsable("R-00025", "Baldera Coronado", "Jorge Luis","71121875","A-00020");
call insertar_Responsable("R-00026", "Castillo Delgado", "Jose Antonio","71243865","D-00021");
call insertar_Responsable("R-00027", "Castillo Fernandez", "Amado Aurelio","70802875","B-00022");
call insertar_Responsable("R-00028", "Delgado Agip", "Justino Percy","70501275","B-00022");
call insertar_Responsable("R-00029", "Fuentes Nuñez", "Flor Marita","71900865","C-00023");
call insertar_Responsable("R-00030", "Lopez Calderon", "Rosa Emilia","75003875","C-00023");
call insertar_Responsable("R-00031", "Olano Chusden", "Hilda Teodora","76901972","C-00024");
call insertar_Responsable("R-00032", "Ramirez Ochoa", "Julia Romula","71601071","C-00024");
call insertar_Responsable("R-00033", "Rojas Silva", "Dilmer Jorge","70921075","A-00025");
call insertar_Responsable("R-00034", "Sanchez Davila", "Ana Julia","72901805","A-00025");

call insertar_Responsable("R-00035", "Sanchez Castro", "Juan Luis","73901874","A-00002");
call insertar_Responsable("R-00036", "Corro Perez", "Juan Julio","75845122","A-00002");
call insertar_Responsable("R-00037", "Rojas Perez", "Martha Joaquina","73086821","B-00001");
call insertar_Responsable("R-00038", "Cueva Cumpa", "Dayana Marisol","73306876","B-00004");
call insertar_Responsable("R-00039", "Alvarez Florentino", "Carol Leah","73953879","B-00004");
call insertar_Responsable("R-00040", "Carrillo Pastor", "Maria Juana","73601860","C-00001");
call insertar_Responsable("R-00041", "Cordova Zavaleta", "Joaquin Carlos","78902871","A-00003");
call insertar_Responsable("R-00042", "Zavaleta Cruz", "Judith Fiorella","73921672","A-00003");
call insertar_Responsable("R-00043", "Cruz Prieto", "Olivia Cinthia","75801873","D-00001");
call insertar_Responsable("R-00044", "Prieto Chavez", "Aranza Martha","7590134","B-00005");
call insertar_Responsable("R-00045", "Chavez Gastelumendi", "Patricia Marleny","73960875","B-00005");
call insertar_Responsable("R-00046", "Gatelumendi Api", "Ruth Pilar","77001876","A-00007");
call insertar_Responsable("R-00047", "Api Martinez", "Juan Carlos","71006457","A-00007");
call insertar_Responsable("R-00048", "Martinez Lopez", "Orlando Martin","77260878","D-00002");
call insertar_Responsable("R-00049", "Lopez Villegas", "Carlos Javier","71981069","D-00002");
call insertar_Responsable("R-00050", "Villegas Santos", "Norma Eufemia","72920870","C-00002");
call insertar_Responsable("R-00051", "Santos Loero", "Sebastian Facundo","73900171","B-00005");
call insertar_Responsable("R-00052", "Loero Ballena", "Patrick Zahid","76903962","A-00007");
call insertar_Responsable("R-00053", "Ballena Pizarro", "Bruno Javier","73001803","D-00003");
call insertar_Responsable("R-00054", "Pizarro Avalos", "Johny Sebastian","73006824","B-00011");
call insertar_Responsable("R-00055", "Avalos Castro", "Piero Martin","73521886","B-00011");
call insertar_Responsable("R-00056", "Castro Sanchez", "Maria Angela","73480675","B-00010");
call insertar_Responsable("R-00057", "Sanchez Escobedo", "Cristian Pedro","76211877","B-00010");
call insertar_Responsable("R-00058", "Escobedo Cumpa", "Mario Martin","72941958","A-00008");
call insertar_Responsable("R-00059", "Cumpa Cruz", "Jose Luis","71121879","A-00008");
call insertar_Responsable("R-00060", "Castillo Terrones", "Jose Sebastian","71243860","D-00001");
call insertar_Responsable("R-00061", "Rodriguez Zavaleta", "Cristina Aurora","70802871","B-00001");
call insertar_Responsable("R-00062", "Fuentes Sanchez", "Percy Jair","70501272","B-00012");
call insertar_Responsable("R-00063", "Rios Lopez", "Martha Luisa","71900863","C-00003");
call insertar_Responsable("R-00064", "Goicochea Romero", "Damaris Luisa","75003874","C-00003");
call insertar_Responsable("R-00065", "Solano Varas", "Pedro Marcos","76901975","C-00005");
call insertar_Responsable("R-00066", "Salinas Ordoñez", "Martha Eufemia","71601076","C-00005");
call insertar_Responsable("R-00067", "Rojas Benites", "Daniela Katherine","70921077","A-00009");
call insertar_Responsable("R-00068", "Vasquez Blas", "Alexis Martin","72901808","A-00009");
call insertar_Responsable("R-00069", "Salgado Meza", "Joaquina Marcela","76211879","B-00012");
call insertar_Responsable("R-00070", "Navarro Garcia", "Alan Steve","72941950","A-00011");
call insertar_Responsable("R-00071", "Baluarte Cruz", "Eduardo Martin","71121871","A-00011");
call insertar_Responsable("R-00072", "Quispe Lopez", "Eduardo Luis","71243862","D-00003");
call insertar_Responsable("R-00073", "Valdez Avalos", "Justino Pedro","70802873","B-00002");
call insertar_Responsable("R-00074", "Diaz Avalos", "Melissa Martina","70501274","B-00008");
call insertar_Responsable("R-00075", "Salazar Martinez", "Brighitte Paola","71900866","C-00004");
call insertar_Responsable("R-00076", "Jacinto Perez", "Marina Mayra","75003877","C-00013");
call insertar_Responsable("R-00077", "Romero Leon", "Juan Carlos","76901978","C-00002");
call insertar_Responsable("R-00078", "Rodriguez Sanchez", "Jorge Martin","71601079","C-00001");
call insertar_Responsable("R-00079", "Bracamonte Rojas", "Barbara Martina","70921070","A-00005");
call insertar_Responsable("R-00080", "Pereda Leon", "Lucia Marcela","72901801","A-00006");


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
