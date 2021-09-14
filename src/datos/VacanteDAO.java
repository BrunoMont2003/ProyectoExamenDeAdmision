/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Carreras;
import entidades.Examen;
import entidades.Postulante;
import entidades.Vacante;
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
public class VacanteDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static VacanteDAO instancia;

    public static VacanteDAO getInstancia() {
        if (instancia == null) {
            instancia = new VacanteDAO();
        }
        return instancia;
    }

    public void insertar(Vacante vacante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertarVacante(?,?)");
            ps.setString(1, vacante.getPostulante().getIdPostulante());
            ps.setString(2, vacante.getExamen().getIdExamen());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }


    public Vacante buscarVacante(String idPostulante, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Vacante c = null;
        try {
            ps = cnn.prepareCall("call buscarVacantePorPostulanteYExamen(?,?)");
            ps.setString(1, idPostulante);
            ps.setString(2, idExamen);
            rs = ps.executeQuery();
            if (rs.next()) {
                Examen examen = ExamenDAO.getInstancia().buscarExamen(idExamen);
                Postulante postulante = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                c = new Vacante(postulante, examen);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return c;
    }

    

    public void mostrarVacantesDeUnExamenEnUnaCarrera(DefaultTableModel modelo, String idExamen, String idCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"Nombre", "DNI", "MODALIDAD", "PUNTAJE", "ORDEN DE MÉRITO", "CARRERA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call buscarVacantesDeUnExamenEnUnaCarrera(?,?)");
            ps.setString(1, idExamen);
            ps.setString(2, idCarrera);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("NombrePostulante");
                String apePaterno = rs.getString("apellido_paterno");
                String apeMaterno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String modalidad = rs.getString("modalidad");
                double puntaje = rs.getDouble("puntaje");
                int ordenMerito = rs.getInt("ordenMerito");
                String carrera = rs.getString("nombreCarrera");
                Object fila[] = {apePaterno + " " + apeMaterno + ", " + nombre, dni, modalidad, puntaje, ordenMerito, carrera};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public ArrayList<Vacante> listarVacantes() throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Vacante> lista = new ArrayList<Vacante>();
        try {
            ps = cnn.prepareCall("call mostrarVacantes()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                Examen examen = ExamenDAO.getInstancia().buscarExamen(idExamen);
                String idPostulante = rs.getString("idPostulante");
                Postulante postulante = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                Vacante v = new Vacante(postulante, examen);
                lista.add(v);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return lista;
    }

    public double getPuntajePromedio(Examen examen, String idCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String idExamen = examen.getIdExamen();
        double sumaPuntajePositivo = 0;
        int i = 0;
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamenOrdenadosDeUnaCarrera(?,?)");
            ps.setString(1, idExamen);
            ps.setString(2, idCarrera);
            rs = ps.executeQuery();
            while (rs.next()) {
                double puntaje = rs.getDouble("puntaje");
                if (puntaje >= 0) {
                    sumaPuntajePositivo += puntaje;
                    i++;
                }
            }

        } catch (SQLException ex) {
            System.out.println("ERROR EN EL puntaje promedio: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return sumaPuntajePositivo / i;
    }

    public void setVacantes(Examen examen, String idCarrera) throws SQLException {

        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        PreparedStatement pse = null;
        String idExamen = examen.getIdExamen();
        String idModalidad = examen.getModalidad().getIdModalidad();
        Carreras carrera = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);
        int numVacantes = carrera.getNumVacantes(idModalidad);
        System.out.println("Numero vacantes " + numVacantes);
        double puntajePromedio = VacanteDAO.getInstancia().getPuntajePromedio(examen, idCarrera);
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamenOrdenadosDeUnaCarrera(?,?)");
            ps.setString(1, idExamen);
            ps.setString(2, idCarrera);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                int ordenMerito = rs.getInt("ordenMerito");
                double puntaje = rs.getDouble("puntaje");
                if (numVacantes >= ordenMerito && puntaje>=puntajePromedio) {
                    System.out.println("Postulante: "+idPostulante+" Punt: "+puntaje);
                    if(VacanteDAO.getInstancia().buscarVacante(idPostulante, idExamen)==null){
                        pse = cnn.prepareCall("call insertarVacante(?,?)");
                        pse.setString(1, idPostulante);
                        pse.setString(2, idExamen);
                        pse.executeUpdate();
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya se han designado las vacantes, diríjase a reportes de vacantes");
                        break;
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("ERROR EN EL SET vacantes: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
            pse.close();
        }

    }

}
