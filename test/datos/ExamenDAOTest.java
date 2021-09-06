/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Areas;
import entidades.Examen;
import entidades.Fecha;
import entidades.Modalidad;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class ExamenDAOTest {

    public ExamenDAOTest() {
    }
  

    @Test
    public void testInsertar() throws Exception {
        System.out.println("Insertar Examen");
        String idExamen = "EX-0004";
        boolean existe = ExamenDAO.getInstancia().exists(idExamen);
        String semestre = "2021-II";
        Fecha fecha = new Fecha(15,3, 2022);
        Areas area = AreasDAO.getInstancia().buscarArea("AREA_C");
        Modalidad m = ModalidadDAO.getInstancia().buscarModalidad("MODD-03");
        Examen examen = new Examen(idExamen, semestre, fecha, area, m);
        assertFalse("PRUEBA FALLIDA", existe);
        ExamenDAO.getInstancia().insertar(examen);
        assertTrue("Prueba Exitosa",!existe && examen.getIdExamen().equals(idExamen)
                && examen.getSemestre().equals(semestre) && examen.getFecha().toString().equals(fecha.toString())
                && examen.getArea().getIdArea().equals(area.getIdArea())
                && examen.getModalidad().getIdModalidad().equals(m.getIdModalidad())
        );
        System.out.println(examen.toString());
    }

    @Test
    public void testBuscarExamen() throws Exception {
        System.out.println("Buscar Examen");
        String idExamen = "EX-0001";
        Examen examen = ExamenDAO.getInstancia().buscarExamen(idExamen);
        boolean existe = ExamenDAO.getInstancia().exists(idExamen);
        assertTrue("Prueba Exitosa", existe && examen.getIdExamen().equals(idExamen));
        System.out.println(examen.toString());
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar Examen");
        String idExamen = "EX-0002";
        boolean existe = ExamenDAO.getInstancia().exists(idExamen);
        String semestre = "2021-I";
        Fecha fecha = new Fecha(29, 3, 2021);
        Areas area = AreasDAO.getInstancia().buscarArea("AREA_D");
        Modalidad m = ModalidadDAO.getInstancia().buscarModalidad("MODD-02");
        Examen examen = new Examen(idExamen, semestre, fecha, area, m);
        ExamenDAO.getInstancia().actualizar(examen);
        assertTrue("Prueba Exitosa", existe && examen.getIdExamen().equals(idExamen)
                && examen.getSemestre().equals(semestre) && examen.getFecha().toString().equals(fecha.toString())
                && examen.getArea().getIdArea().equals(area.getIdArea())
                && examen.getModalidad().getIdModalidad().equals(m.getIdModalidad())
        );
        System.out.println(examen.toString());
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar examen");
        String idExamen = "EX-0003";
        boolean existe = ExamenDAO.getInstancia().exists(idExamen);
        ExamenDAO.getInstancia().eliminar(idExamen);
        assertTrue("PRUEBA EXITOSA", existe);
    }

    @Test
    public void testListarExamenes() throws Exception {

        System.out.println("TEST DE LISTAR EXAMENES");

        ArrayList<Examen> examenes = ExamenDAO.getInstancia().listarExamenes();

        assertTrue("Prueba Exitosa", examenes.size() > 0);

        for (Examen examen : examenes) {
            System.out.println("Examen: " + examen.getIdExamen());
        }

    }


}
