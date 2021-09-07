/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Aula;
import entidades.Carreras;
import entidades.Modalidad;
import entidades.Postulante;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PostulanteDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static PostulanteDAO instancia;

    public static PostulanteDAO getInstancia() {
        if (instancia == null) {
            instancia = new PostulanteDAO();
        }
        return instancia;
    }

    public void insertar(Postulante postulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_postulante(?,?,?,?,?,?,?,?)");
            ps.setString(1, postulante.getIdPostulante());
            ps.setString(2, postulante.getNombres());
            ps.setString(3, postulante.getApellido_paterno());
            ps.setString(4, postulante.getApellido_materno());
            ps.setString(5, postulante.getDni());
            ps.setString(6, postulante.getCarrera().getCodigoCarrera());
            ps.setString(7, postulante.getAula().getIdAula());
            ps.setString(8, postulante.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public Postulante buscarPostulante(String idPostulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Postulante pos = null;
        try {
            ps = cnn.prepareStatement("call buscarpostulante(?)");
            ps.setString(1, idPostulante);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombres = rs.getString("nombrePostulante");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String idCarrera = rs.getString("idCarrera");
                Carreras carreras = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);
                String idAula = rs.getString("idAula");
                Aula aula = AulaDAO.getInstancia().buscarAula(idAula);
                String idModalidad = rs.getString("idModalidad");
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                
                pos = new Postulante(idPostulante, nombres, apellido_paterno, apellido_materno, dni, carreras, aula, modalidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return pos;
    }

    public void actualizar(Postulante postulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarPostulante(?,?,?,?,?,?,?,?)");
            ps.setString(1, postulante.getIdPostulante());
            ps.setString(2, postulante.getNombres());
            ps.setString(3, postulante.getApellido_paterno());
            ps.setString(4, postulante.getApellido_materno());
            ps.setString(5, postulante.getDni());
            ps.setString(6, postulante.getCarrera().getCodigoCarrera());
            ps.setString(7, postulante.getAula().getIdAula());
            ps.setString(8, postulante.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminar(String idPostulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminarPostulante(?)");
            ps.setString(1, idPostulante);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostrarPostulantes(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Postulante", "Nombres", "Apellido Paterno", "Apellido Materno","DNI","ID Carrera","ID AULA","ID Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarPostulante()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
               String nombres = rs.getString("nombrePostulante");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String idCarrera = rs.getString("idCarrera");
                String idAula = rs.getString("idAula");
                String idModalidad = rs.getString("idModalidad");
                String fila[] = {idPostulante, nombres, apellido_paterno, apellido_materno, dni, idCarrera, idAula, idModalidad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    public void mostraPostulantePorCarrera(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Postulante", "Nombres", "Apellido Paterno", "Apellido Materno","DNI","ID Carrera","ID AULA","ID Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("call buscar_postulante(?)");
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                String nombres = rs.getString("nombrePostulante");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String idCarrera = rs.getString("idCarrera");
                String idAula = rs.getString("idAula");
                String idModalidad = rs.getString("idModalidad");
                String fila[] = {idPostulante, nombres, apellido_paterno, apellido_materno, dni, idCarrera, idAula, idModalidad};
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
