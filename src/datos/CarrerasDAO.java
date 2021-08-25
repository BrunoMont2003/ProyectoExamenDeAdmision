/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Carreras;
import entidades.Facultad;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CarrerasDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static CarrerasDAO instancia;

    public static CarrerasDAO getInstancia() {
        if (instancia == null) {
            instancia = new CarrerasDAO();
        }
        return instancia;
    }

    public void insertar(Carreras carreras) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_carreras(?,?,?)");
            ps.setString(1, carreras.getCodigoCarrera());
            ps.setString(2, carreras.getNombreCarrera());
            ps.setString(3, carreras.getFacultad().getIdFacultad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Carreras buscarCarreras(String idCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Carreras car = null;
        try {
            ps = cnn.prepareStatement("call buscarCarrera(?)");
            ps.setString(1, idCarrera);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombreCarrera = rs.getString("nombreCarrera");
                String idFacultad = rs.getString("idFacultad");
                Facultad facultad = FacultadDAO.getInstancia().buscarFacultad(idFacultad);
                car = new Carreras(idCarrera, nombreCarrera, facultad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return car;
    }

    public void actualizar(Carreras carreras) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarCarrera(?,?,?)");
            ps.setString(1, carreras.getCodigoCarrera());
            ps.setString(2, carreras.getNombreCarrera());
            ps.setString(3, carreras.getFacultad().getIdFacultad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminarCarrera(?)");
            ps.setString(1, idCarrera);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostrarCarreras(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Carrera", "Nombre Carrera", "ID Facultad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarCarreras()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idCarrera = rs.getString("idCarrera");
                String nombreCarrera = rs.getString("nombreCarrera");
                String idFacultad = rs.getString("idFacultad");
                String fila[] = {idCarrera, nombreCarrera, idFacultad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostraCarreraPorFacultad(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID CARRERA", "NOMBRE CARRERA", "ID FACULTAD"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("call buscar_carrera(?)");
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idCarrera= rs.getString("idCarrera");
                String nombreCarrera = rs.getString("nombreCarrera");
                String idFacultad = rs.getString("idFacultad");
                String fila[] = {idCarrera, nombreCarrera, idFacultad};
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
