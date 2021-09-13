/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Modalidad;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Frecuencia 7
 */
public class ModalidadDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static ModalidadDAO instancia;

    public static ModalidadDAO getInstancia() {
        if (instancia == null) {
            instancia = new ModalidadDAO();
        }
        return instancia;
    }

    public void insertar(Modalidad modalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertar_modalidad(?,?)");
            ps.setString(1, modalidad.getIdModalidad());
            ps.setString(2, modalidad.getNombreM());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    public void actualizar(Modalidad modalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarModalidad(?,?)");
            ps.setString(1, modalidad.getIdModalidad());
            ps.setString(2, modalidad.getNombreM());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idModalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call mostrarExamenesDeUnaModalidad(?)");
            ps.setString(1, idModalidad);
            ps.executeUpdate();
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                ps = cnn.prepareCall("call eliminarExamen(?)");
                ps.setString(1, idExamen);
                ps.executeUpdate();
            }
            ps = cnn.prepareCall("call eliminarModalidad(?)");
            ps.setString(1, idModalidad);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Modalidad buscarModalidad(String idModalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Modalidad mod = null;
        try {
            ps = cnn.prepareCall("call buscarmodalidad(?)");
            ps.setString(1, idModalidad);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombreModalidad = rs.getString("nombre");
                mod = new Modalidad(idModalidad, nombreModalidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return mod;
    }
    public Modalidad buscarModalidadPorNombre(String nom) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Modalidad mod = null;
        try {
            ps = cnn.prepareCall("call buscarmodalidadpornombre(?)");
            ps.setString(1, nom);
            rs = ps.executeQuery();
            if (rs.next()) {
                String idModalidad = rs.getString("idModalidad");
                mod = new Modalidad(idModalidad, nom);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return mod;
    }

    public void mostrarModalidad(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Modalidad", "Nombre Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarModalidad()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idModalidad = rs.getString("idModalidad");
                String nombreModalidad = rs.getString("nombre");
                String fila[] = {idModalidad, nombreModalidad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }

    }

    public void mostraModalidadPorID(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Modalidad", "Nombre Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareCall("call buscar_modalidad(?)");
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idModalidad = rs.getString("idModalidad");
                String nombreM = rs.getString("nombre");
                String fila[] = {idModalidad, nombreM};
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
