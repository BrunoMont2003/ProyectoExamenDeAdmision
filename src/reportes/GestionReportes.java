/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import datos.CarrerasDAO;
import datos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Frecuencia 7
 */
public class GestionReportes {

    public void ReporteAreas() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportAreas.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Areas");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }

    public void ReporteFacultad() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportFacultades.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Facultades");
        view.setVisible(true);
        view.setAlwaysOnTop(true);
    }

    public void ReporteCarreras() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportCarreras.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Carreras");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }

    public void ReporteError() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportErrores.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Errores");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }
    
    public void ReporteCantidadError() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportCantidadDeErroresPorClave.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Errores");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }
    public void ReporteRangoPreguntas() throws JRException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportRangoPreguntas.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Rango Preguntas");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }
    public void ReporteVacantes(String idExamen, String idCarrera) throws JRException, SQLException {
        Conexion con = new Conexion();
        Connection conn = con.miConexion();
        JasperReport reporte = null;
        Map parametro = new HashMap();
        parametro.put("IDEX", idExamen);
        parametro.put("IDCAR", idCarrera);
        String path = "C:\\Users\\bruno\\OneDrive\\Desktop\\UNT\\CICLO3\\TAREAS\\POO II\\Proyecto\\ProyectoUniversidad\\src\\reportes\\reportVacantes.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Vacantes de "+CarrerasDAO.getInstancia().buscarCarreras(idCarrera).getNombreCarrera());
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }
}
