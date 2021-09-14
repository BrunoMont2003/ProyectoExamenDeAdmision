/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import datos.Conexion;
import java.sql.Connection;
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
        String path = "src\\reportes\\reportAreas.jasper";
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
        String path = "src\\reportes\\reportFacultades.jasper";
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
        String path = "src\\reportes\\reportCarreras.jasper";
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
        String path = "src\\reportes\\reportErrores.jasper";
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
        String path = "src\\reportes\\reportCantidadDeErroresPorClave.jasper";
        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
        JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
        JasperViewer view = new JasperViewer(jprint, false);
        view.setTitle("Errores");
        view.setVisible(true);
        view.setAlwaysOnTop(true);

    }
}
