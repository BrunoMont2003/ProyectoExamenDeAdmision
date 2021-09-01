/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Examen;
import entidades.composite2.RangoPreguntasLeaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class ClaveDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static ClaveDAO instancia;

    public static ClaveDAO getInstancia() {
        if (instancia == null) {
            instancia = new ClaveDAO();
        }
        return instancia;
    }

    public void insertar(RangoPreguntasLeaf clave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertarClave(?,?,?,?)");
            ps.setString(1, clave.getIdClave());
            ps.setInt(2, clave.getNumero());
            ps.setDouble(3, clave.getLetra());
            ps.setString(4, clave.getExamen().getIdExamen());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public RangoPreguntasLeaf buscarClave(String idClave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        RangoPreguntasLeaf c = null;
        try {
            ps = cnn.prepareStatement("call buscarClave(?)");
            ps.setString(1, idClave);
            rs = ps.executeQuery();
            if (rs.next()) {
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idExamen = rs.getString("idExamen");
                ExamenDAO dao = new ExamenDAO();
                Examen examen = dao.buscarExamen(idExamen);

                c = new RangoPreguntasLeaf(idClave, numero, letra, examen);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return c;
    }

    public void actualizar(RangoPreguntasLeaf clave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarClave(?,?,?,?)");
            ps.setString(1, clave.getIdClave());
            ps.setInt(2, clave.getNumero());
            ps.setDouble(3, clave.getLetra());
            ps.setString(4, clave.getExamen().getIdExamen());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idClave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminarClave(?)");
            ps.setString(1, idClave);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostrarClaves(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID CLAVE", "NUMERO", "LETRA", "ID EXAMEN"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarClaves()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idClave = rs.getString("idClave");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idExamen = rs.getString("idExamen");
                String fila[] = {idClave, String.valueOf(numero), String.valueOf(letra), idExamen};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    public void mostrarClavesPorExamen(DefaultTableModel modelo, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID CLAVE", "NUMERO", "LETRA", "ID EXAMEN"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarClavesDeExamen(?)");
            ps.setString(1, idExamen);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idClave = rs.getString("idClave");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String fila[] = {idClave, String.valueOf(numero), String.valueOf(letra), idExamen};
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
