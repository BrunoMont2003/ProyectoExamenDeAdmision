/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Modalidad;
import entidades.builder.DireccionSistemas;
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
    
    public void insertar(DireccionSistemas modalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_modalidad(?,?)");
            ps.setString(1, modalidad.getModalidad().getIdModalidad());
            ps.setString(2, modalidad.getModalidad().getNombreM());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

public void insertar(Modalidad modalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_modalidad(?,?)");
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
            ps = cnn.prepareStatement("call eliminarModalidad(?)");
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
        Modalidad mod= null;
        try {
            ps = cnn.prepareStatement("call buscarmodalidad(?)");
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
   
    public void mostrarModalidad(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Modalidad", "Nombre Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarModalidad()");
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
            ps = cnn.prepareStatement("call buscar_modalidad(?)");
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
