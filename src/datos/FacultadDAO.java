/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Areas;
import entidades.Facultad;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacultadDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static FacultadDAO instancia;

    public static FacultadDAO getInstancia() {
        if (instancia == null) {
            instancia = new FacultadDAO();
        }
        return instancia;
    }

    public void insertar(Facultad facultad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertar_facultad(?,?,?)");
            ps.setString(1, facultad.getIdFacultad());
            ps.setString(2, facultad.getNombreFacultad());
            ps.setString(3, facultad.getAreas().getIdArea());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Facultad buscarFacultad(String idFacultad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Facultad facu = null;
        try {
            ps = cnn.prepareCall("call buscarfacultad(?)");
            ps.setString(1, idFacultad);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombreAFacultad = rs.getString("nombreFacultad");
                String idArea = rs.getString("idArea");
                Areas areas = AreasDAO.getInstancia().buscarArea(idArea);
                facu = new Facultad(idFacultad, nombreAFacultad, areas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return facu;
    }

    public void actualizar(Facultad facultad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarFacultad(?,?,?)");
            ps.setString(1, facultad.getIdFacultad());
            ps.setString(2, facultad.getNombreFacultad());
            ps.setString(3, facultad.getAreas().getIdArea());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {

            ps.close();
            cnn.close();

        }
    }

    public void eliminar(String idFacultad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarFacultad(?)");
            ps.setString(1, idFacultad);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostrarFacultad(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Facultad", "Nombre Facultad", "ID Area"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarFacultades()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idFacultad = rs.getString("idFacultad");
                String nombreFacultad = rs.getString("nombreFacultad");
                String idArea = rs.getString("idArea");
                String fila[] = {idFacultad, nombreFacultad, idArea};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostraFacultadPorArea(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID FACULTAD", "NOMBRE FACULTAD", "ID AREA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareCall("call buscar_facultad(?)");
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idFacultad = rs.getString("idFacultad");
                String nombreFacultad = rs.getString("nombreFacultad");
                String idArea = rs.getString("idArea");
                String fila[] = {idFacultad, nombreFacultad, idArea};
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
