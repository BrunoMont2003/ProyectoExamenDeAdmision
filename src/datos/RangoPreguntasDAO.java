/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.composite2.RangoPreguntasComposite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class RangoPreguntasDAO {
    private Connection cnn = null;
    private ResultSet rs = null;

    private static RangoPreguntasDAO instancia;

    public static RangoPreguntasDAO getInstancia() {
        if (instancia == null) {
            instancia = new RangoPreguntasDAO();
        }
        return instancia;
    }
    
     public void insertar(RangoPreguntasComposite rangoPreguntas ) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
         PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertarRangoPreguntas(?,?,?,?)");
            ps.setString(1, rangoPreguntas.getIdRangoPreguntas());
            ps.setString(2, rangoPreguntas.getNombre());
            ps.setDouble(3, rangoPreguntas.getPuntajeCorrecta());
            ps.setDouble(4, rangoPreguntas.getPuntajeIncorrecta());
          
            
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
       public RangoPreguntasComposite buscarRango(String idRangoPreguntas) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        RangoPreguntasComposite r = null;
        try {
            ps = cnn.prepareStatement("call buscarRangoPreguntas(?)");
            ps.setString(1, idRangoPreguntas);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                double puntajeCorrecta = rs.getDouble("puntajeCorrecta");
                double puntajeIncorrecta = rs.getDouble("puntajeIncorrecta");
                r = new RangoPreguntasComposite(idRangoPreguntas, nombre, puntajeCorrecta, puntajeIncorrecta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return r;
    }
       

      public void actualizar(RangoPreguntasComposite rangoPreguntas ) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
         PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarRangoPreguntas(?,?,?,?)");
            ps.setString(1, rangoPreguntas.getIdRangoPreguntas());
            ps.setString(2, rangoPreguntas.getNombre());
            ps.setDouble(3, rangoPreguntas.getPuntajeCorrecta());
            ps.setDouble(4, rangoPreguntas.getPuntajeIncorrecta());            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
     
      public void eliminar(String idRango) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminarRangoPreguntas(?)");
            ps.setString(1, idRango);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
     public void mostrarRangoPreguntas(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Rango Preguntas", "Nombre", "Puntaje Correcta", "Puntaje Incorrecta"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarRangoPreguntas()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idRango = rs.getString("idRangoPreguntas");
                String nombre = rs.getString("nombre");
                double puntajeCorrecta = rs.getDouble("puntajeCorrecta");
                double puntajeIncorrecta = rs.getDouble("puntajeIncorrecta");
                String fila[] = {idRango, nombre, String.valueOf(puntajeCorrecta) , String.valueOf(puntajeIncorrecta)};
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
