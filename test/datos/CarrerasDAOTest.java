/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Areas;
import entidades.Carreras;
import entidades.Facultad;
import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class CarrerasDAOTest {

    public CarrerasDAOTest() {
    }

    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        CarrerasDAO expResult = null;
        CarrerasDAO result = CarrerasDAO.getInstancia();
        assertNotEquals(expResult, result);
    }

    @Test
    public void testInsertar() throws Exception {
        System.out.println("insertar");
        Carreras carreras = new Carreras("SLUD-02", "Estomatologia",
                new Facultad("FACD-09", "Estomatologia",
                        new Areas("AREA_A", "Ciencias De La Vidad Y La Salud")));
        CarrerasDAO instance = new CarrerasDAO();
        assertNull(instance.buscarCarreras("SLUD-02"));
        instance.insertar(carreras);
    }

    @Test
    public void testBuscarCarreras() throws Exception {
        System.out.println("buscarCarreras");
        String idCarrera = "FACD-09";
        CarrerasDAO instance = new CarrerasDAO();
        Carreras expResult = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);
        Carreras result = instance.buscarCarreras(idCarrera);
        assertEquals(expResult, result);
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Carreras carreras = new Carreras("SLUD-02", "Estomatologia y Odontologia",
                new Facultad("FACD-09", "Estomatologia",
                        new Areas("AREA_A", "Ciencias De La Vidad Y La Salud")));
        CarrerasDAO instance = new CarrerasDAO();
        assertNotNull(instance.buscarCarreras("SLUD-02"));
        instance.actualizar(carreras);
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        String idCarrera = "SLUD-02";
        CarrerasDAO instance = new CarrerasDAO();
        assertNotNull(instance.buscarCarreras(idCarrera));
        instance.eliminar(idCarrera);
    }

}
