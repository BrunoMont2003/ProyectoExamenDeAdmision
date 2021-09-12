/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Respuesta;
import entidades.Examen;
import entidades.Postulante;
import entidades.Respuesta;
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
public class RespuestaDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static RespuestaDAO instancia;

    public static RespuestaDAO getInstancia() {
        if (instancia == null) {
            instancia = new RespuestaDAO();
        }
        return instancia;
    }

    public void insertar(Respuesta respuesta) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertar_respuesta(?,?,?,?,?)");
            ps.setString(1, respuesta.getIdRespuesta());
            ps.setInt(2, respuesta.getNumero());
            ps.setString(3, String.valueOf(respuesta.getLetra()));
            ps.setString(4, respuesta.getPostulante().getIdPostulante());
            ps.setString(5, respuesta.getExamen().getIdExamen());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Respuesta buscarRespuesta(String idRespuesta) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Respuesta c = null;
        try {
            ps = cnn.prepareCall("call buscarRespuesta(?)");
            ps.setString(1, idRespuesta);
            rs = ps.executeQuery();
            if (rs.next()) {
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idPostulante = rs.getString("idPostulante");
                String idExamen = rs.getString("idExamen");
                ExamenDAO dao = new ExamenDAO();
                Examen examen = dao.buscarExamen(idExamen);
                Postulante postulante = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                c = new Respuesta(idRespuesta, numero, letra, postulante, examen);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return c;
    }

    public void actualizar(Respuesta respuesta) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarRespuesta(?,?,?,?,?)");
            ps.setString(1, respuesta.getIdRespuesta());
            ps.setInt(2, respuesta.getNumero());
            ps.setString(3, String.valueOf(respuesta.getLetra()));
            ps.setString(4, respuesta.getPostulante().getIdPostulante());
            ps.setString(5, respuesta.getExamen().getIdExamen());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idRespuesta) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarRespuesta(?)");
            ps.setString(1, idRespuesta);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public ArrayList<Respuesta> mostrarRespuestasDePostulanteEnUnExamen(String idPostulante, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Respuesta> lista = new ArrayList<Respuesta>();
        try {
            ps = cnn.prepareCall("call mostrarRespuestasDePostulanteEnUnExamen(?,?)");
            ps.setString(1, idPostulante);
            ps.setString(2, idExamen);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idRespuesta = rs.getString("idRespuesta");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                Postulante postulante = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                Examen examen = ExamenDAO.getInstancia().buscarExamen(idExamen);
                Respuesta r = new Respuesta(idRespuesta, numero, letra, postulante, examen);
                lista.add(r);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());

        }
        return lista;
    }
    public void mostrarRespuestas(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Respuesta", "NUMERO", "LETRA", "ID POSTULANTE", "ID EXAMEN"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarRespuestas()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idRespuesta = rs.getString("idRespuesta");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idPostulante = rs.getString("idPostulante");
                String idExamen = rs.getString("idExamen");
                String fila[] = {idRespuesta, String.valueOf(numero), String.valueOf(letra), idPostulante, idExamen};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void mostrarRespuestasPorPostulante(DefaultTableModel modelo, String idPos) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Respuesta", "NUMERO", "LETRA", "ID POSTULANTE", "ID EXAMEN"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarRespuestasDePostulante(?)");
            ps.setString(1, idPos);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idRespuesta = rs.getString("idRespuesta");
                int numero = rs.getInt("numero");
                char letra = rs.getString("letra").charAt(0);
                String idExamen = rs.getString("idExamen");
                String idPostulante = rs.getString("idPostulante");
                String fila[] = {idRespuesta, String.valueOf(numero), String.valueOf(letra), idPostulante, idExamen};
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
