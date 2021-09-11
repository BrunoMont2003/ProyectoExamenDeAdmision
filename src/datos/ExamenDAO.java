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
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExamenDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static ExamenDAO instancia;

    public static ExamenDAO getInstancia() {
        if (instancia == null) {
            instancia = new ExamenDAO();
        }
        return instancia;
    }

    public void insertar(Examen examen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertarExamen(?,?,?,?,?)");
            ps.setString(1, examen.getIdExamen());
            ps.setString(2, examen.getSemestre());
            ps.setString(3, examen.getFecha().toStringFormatSql());
            ps.setString(4, examen.getArea().getIdArea());
            ps.setString(5, examen.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public boolean exists(String id) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call mostrarexamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                if (idExamen.equals(id)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return false;
    }

    public Examen buscarExamen(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Examen exa = null;
        try {
            ps = cnn.prepareCall("call buscarexamen(?)");
            ps.setString(1, idExamen);
            rs = ps.executeQuery();
            if (rs.next()) {
                String semestre = rs.getString("semestre");
                String fechaSql = rs.getString("fecha");
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(añoF, mes, dia);
                String idArea = rs.getString("idArea");
                Areas areas = AreasDAO.getInstancia().buscarArea(idArea);
                String idModalidad = rs.getString("idModalidad");
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);

                exa = new Examen(idExamen, semestre, fecha, areas, modalidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return exa;
    }

    public void actualizar(Examen examen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarExamen(?,?, ?, ?, ?)");
            ps.setString(1, examen.getIdExamen());
            ps.setString(2, examen.getSemestre());
            ps.setString(3, examen.getFecha().toStringFormatSql());
            ps.setString(4, examen.getArea().getIdArea());
            ps.setString(5, examen.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarExamen(?)");
            ps.setString(1, idExamen);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public ArrayList<Examen> listarExamenes() throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Examen> lista = new ArrayList<Examen>();
        try {
            ps = cnn.prepareCall("call mostrarExamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String idArea = rs.getString("idArea");
                String idModalidad = rs.getString("idModalidad");
                String fechaSql = rs.getString("fecha");
                Areas area = AreasDAO.getInstancia().buscarArea(idArea);
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(añoF, mes, dia);
                Examen ex = new Examen(idExamen, semestre, fecha, area, modalidad);
                lista.add(ex);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<Examen> listarExamenesDeUnaModalidadYArea(String idModalidad, String idArea) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Examen> lista = new ArrayList<Examen>();
        try {
            ps = cnn.prepareCall("call mostrarExamenesDeUnaModalidadYArea(?,?)");
            ps.setString(1, idModalidad);
            ps.setString(2, idArea);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String fechaSql = rs.getString("fecha");
                Areas area = AreasDAO.getInstancia().buscarArea(idArea);
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(añoF, mes, dia);
                Examen ex = new Examen(idExamen, semestre, fecha, area, modalidad);
                lista.add(ex);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());

        }
        return lista;
    }

    public void mostrarExamen(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Examen", "Semestre", "Fecha", "Id Area", "IdModalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarExamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String idArea = rs.getString("idArea");
                String idModalidad = rs.getString("idModalidad");
                String fecha = rs.getString("fecha");
                String fila[] = {idExamen, semestre, fecha, idArea, idModalidad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
}
