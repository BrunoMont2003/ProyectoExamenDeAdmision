/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Clave;
import entidades.Error;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ErrorDAO {
    private Connection cnn = null;
    private ResultSet rs = null;
    
    private static ErrorDAO instancia;
    
    public static ErrorDAO getInstancia() {
        if (instancia == null) {
            instancia = new ErrorDAO();
        }
        return instancia;
    }
    
    public void insertar(Error error) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_Error(?,?,?)");
            ps.setString(1, error.getIdError());
            ps.setString(2, error.getDescripcion());
            ps.setString(3, error.getClave().getIdClave());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public Error buscarError(String idError) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Error er = null;
        try {
            ps = cnn.prepareStatement("call buscar_Error(?)");
            ps.setString(1, idError);
            rs = ps.executeQuery();
            if (rs.next()) {
                String idEr = rs.getString("idError");
                String descripcion = rs.getString("descripcion");
                String idClave = rs.getString("idClave");
                Clave clave = ClaveDAO.getInstancia().buscarClave(idClave);
                er = new Error(idEr, descripcion, clave);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return er;
    }
    
    public void actualizar(Error error) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificar_Error(?,?,?)");
            ps.setString(1, error.getIdError());
            ps.setString(2, error.getDescripcion());
            ps.setString(3, error.getClave().getIdClave());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {

            ps.close();
            cnn.close();
        }
    }
    
    public void eliminar(String idError) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminar_Error(?)");
            ps.setString(1, idError);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostrarError(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"IdError", "Descripcion","IdClave"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrar_Errores()");
            rs = ps.executeQuery();
            while (rs.next()) {
               String iderror = rs.getString("idError");
                String des = rs.getString("descripcion");
                String idclave = rs.getString("idClave");
                String fila[] = {iderror, des,idclave};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostrarErrorporClave(String idClave, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"IdError", "Descripcion","IdClave"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("call buscarError_PorClave(?)");
            ps.setString(1, idClave);
            rs = ps.executeQuery();
            while (rs.next()) {
                String iderror = rs.getString("idError");
                String des = rs.getString("descripcion");
                String idclave = rs.getString("idClave");
                String fila[] = {iderror, des,idclave};
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
