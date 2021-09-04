/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Clave;
import entidades.Examen;
import entidades.RangoPreguntas;
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

    public void insertar(Clave clave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertarClave(?,?,?,?,?)");
            ps.setString(1, clave.getIdClave());
            ps.setInt(2, clave.getNumero());
            ps.setDouble(3, clave.getLetra());
            ps.setString(4, clave.getExamen().getIdExamen());
            ps.setString(5, clave.getRangoPreguntas().getIdRangoPreguntas());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Clave buscarClave(String idClave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Clave c = null;
        try {
            ps = cnn.prepareStatement("call buscarClave(?)");
            ps.setString(1, idClave);
            rs = ps.executeQuery();
            if (rs.next()) {
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idExamen = rs.getString("idExamen");
                String idRangoPreguntas = rs.getString("idRangoPreguntas");
                ExamenDAO dao = new ExamenDAO();
                Examen examen = dao.buscarExamen(idExamen);
                RangoPreguntas rangoPreguntas = RangoPreguntasDAO.getInstancia().buscarRango(idRangoPreguntas);
                c = new Clave(idClave, numero, letra, examen, rangoPreguntas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return c;
    }

    public void actualizar(Clave clave) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarClave(?,?,?,?,?)");
            ps.setString(1, clave.getIdClave());
            ps.setInt(2, clave.getNumero());
            ps.setDouble(3, clave.getLetra());
            ps.setString(4, clave.getExamen().getIdExamen());
            ps.setString(4, clave.getRangoPreguntas().getIdRangoPreguntas());

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
        String titulos[] = {"ID CLAVE", "NUMERO", "LETRA", "ID EXAMEN", "ID RANGO PREGUNTAS"};
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
                String idRangoPreguntas = rs.getString("idRangoPreguntas");
                String fila[] = {idClave, String.valueOf(numero), String.valueOf(letra), idExamen, idRangoPreguntas};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    public void mostrarClavesPorExamen(DefaultTableModel modelo, String idEx) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID CLAVE", "NUMERO", "LETRA", "ID EXAMEN", "ID RANGO PREGUNTAS"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarClavesDeExamen(?)");
            ps.setString(1, idEx);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idClave = rs.getString("idClave");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idRangoPreguntas = rs.getString("idRangoPreguntas");
                String idExamen = rs.getString("idExamen");
                String fila[] = {idClave, String.valueOf(numero), String.valueOf(letra), idExamen, idRangoPreguntas};
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
