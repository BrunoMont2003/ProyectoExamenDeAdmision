/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Carreras;
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
            ps = cnn.prepareStatement("INSERT INTO Autor(codigoCarrera,nombreCarrera) values(?,?)");
            ps.setString(1, carreras.getCodigoCarrera());
            ps.setString(2, carreras.getNombreCarrera());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Carreras buscarCarreras(String codigoCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Carreras car = null;
        try {
            ps = cnn.prepareStatement("SELECT * FROM carrera"
                    + " WHERE codigoCarrera=?");
            ps.setString(1, codigoCarrera);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombreCarrera = rs.getString("nombreCarrera");
                car = new Carreras(codigoCarrera, nombreCarrera);
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
            ps = cnn.prepareStatement(" UPDATE carrera"
                    + " SET nombreCarrera = ?"
                    + " WHERE codigoCarrera=?");
            ps.setString(2, carreras.getCodigoCarrera());
            ps.setString(1, carreras.getNombreCarrera());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String codigoCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("DELETE FROM carrera"
                    + " WHERE codigoCarrera=?");
            ps.setString(1, codigoCarrera);
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
        String titulos[] = {"Codigo Carrera", "Nombre Carrera"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("SELECT * FROM carrera");
            rs = ps.executeQuery();
            while (rs.next()) {
                String codigoCarrera = rs.getString("codigoCarrera");
                String nombreCarrera = rs.getString("nombreCarrera");
                String fila[] = {codigoCarrera, nombreCarrera};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostraCarrerasPorNombre(String nombre, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"Codigo Carrera", "Nombre Carrera"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("SELECT * FROM carrera where nombreCarrera like ?");
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String codigoCarrera = rs.getString("codigoCarrera");
                String nombreCarrera = rs.getString("nombreCarrera");
                String fila[] = {codigoCarrera, nombreCarrera};
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
