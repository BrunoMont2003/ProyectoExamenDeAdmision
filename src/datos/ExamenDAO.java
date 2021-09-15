/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Areas;
import entidades.Clave;
import entidades.Examen;
import entidades.Fecha;
import entidades.Modalidad;
import entidades.Postulante;
import entidades.Respuesta;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExamenDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static ExamenDAO instancia;

    public static ExamenDAO getInstancia() {
        if (instancia == null) {
            instancia = new ExamenDAO();
        }
        return instancia;
    }

    public void insertar(Examen examen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call insertarExamen(?,?,?,?,?)");
            ps.setString(1, examen.getIdExamen());
            ps.setString(2, examen.getSemestre());
            ps.setString(3, examen.getFecha().toStringFormatSql());
            ps.setString(4, examen.getArea().getIdArea());
            ps.setString(5, examen.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public boolean exists(String id) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call mostrarexamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                if (idExamen.equals(id)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return false;
    }

    public Examen buscarExamen(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Examen exa = null;
        try {
            ps = cnn.prepareCall("call buscarexamen(?)");
            ps.setString(1, idExamen);
            rs = ps.executeQuery();
            if (rs.next()) {
                String semestre = rs.getString("semestre");
                String fechaSql = rs.getString("fecha");
                System.out.println("Desde el dao " + fechaSql);
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                System.out.println("Año dao: " + añoF);
                int mes = Integer.parseInt(fechaArray[1]);
                System.out.println("Mes dao: " + mes);
                int dia = Integer.parseInt(fechaArray[2]);
                System.out.println("Dia dao: " + dia);
                Fecha fecha = new Fecha(dia, mes, añoF);
                System.out.println("La cague?" + fecha.toStringFormatSql());
                String idArea = rs.getString("idArea");
                Areas areas = AreasDAO.getInstancia().buscarArea(idArea);
                String idModalidad = rs.getString("idModalidad");
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);

                exa = new Examen(idExamen, semestre, fecha, areas, modalidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return exa;
    }

    public Examen buscarExamen(String semestre, String idCarrera, String idModalidad) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Examen exa = null;
        try {
            ps = cnn.prepareCall("call buscarExamenPorSemestreYCarreraYModalidad(?,?,?)");
            ps.setString(1, semestre);
            ps.setString(2, idCarrera);
            ps.setString(3, idModalidad);
            rs = ps.executeQuery();
            if (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String fechaSql = rs.getString("fecha");
                String idArea = rs.getString("idArea");
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(dia, mes, añoF);

                Areas areas = AreasDAO.getInstancia().buscarArea(idArea);
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);

                exa = new Examen(idExamen, semestre, fecha, areas, modalidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return exa;
    }

    public void actualizar(Examen examen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarExamen(?,?, ?, ?, ?)");
            ps.setString(1, examen.getIdExamen());
            ps.setString(2, examen.getSemestre());
            ps.setString(3, examen.getFecha().toStringFormatSql());
            ps.setString(4, examen.getArea().getIdArea());
            ps.setString(5, examen.getModalidad().getIdModalidad());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public void eliminar(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarExamen(?)");
            ps.setString(1, idExamen);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public ArrayList<Examen> listarExamenes() throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Examen> lista = new ArrayList<Examen>();
        try {
            ps = cnn.prepareCall("call mostrarExamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String idArea = rs.getString("idArea");
                String idModalidad = rs.getString("idModalidad");
                String fechaSql = rs.getString("fecha");
                Areas area = AreasDAO.getInstancia().buscarArea(idArea);
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(dia, mes, añoF);

                Examen ex = new Examen(idExamen, semestre, fecha, area, modalidad);
                lista.add(ex);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return lista;
    }

    public ArrayList<Examen> listarExamenesDeUnaModalidadYArea(String idModalidad, String idArea) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Examen> lista = new ArrayList<Examen>();
        try {
            ps = cnn.prepareCall("call mostrarExamenesDeUnaModalidadYArea(?,?)");
            ps.setString(1, idModalidad);
            ps.setString(2, idArea);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String fechaSql = rs.getString("fecha");
                Areas area = AreasDAO.getInstancia().buscarArea(idArea);
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                String fechaArray[] = fechaSql.split("-");
                int añoF = Integer.parseInt(fechaArray[0]);
                int mes = Integer.parseInt(fechaArray[1]);
                int dia = Integer.parseInt(fechaArray[2]);
                Fecha fecha = new Fecha(dia, mes, añoF);

                Examen ex = new Examen(idExamen, semestre, fecha, area, modalidad);
                lista.add(ex);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            cnn.close();
            ps.close();
        }
        return lista;
    }

    public void mostrarExamen(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Examen", "Semestre", "Fecha", "Id Area", "IdModalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarExamen()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                String semestre = rs.getString("semestre");
                String idArea = rs.getString("idArea");
                String idModalidad = rs.getString("idModalidad");
                String fecha = rs.getString("fecha");
                String fila[] = {idExamen, semestre, fecha, idArea, idModalidad};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public void RevisarExamen(Examen examen) throws SQLException {

        String idExamen = examen.getIdExamen();
        System.out.println("Reconoce el examen: " + examen.getIdExamen());
        ArrayList<Postulante> postulantes = PostulanteDAO.getInstancia().listarPostulantesPorExamen(idExamen);
        for (int i = postulantes.size() - 1; i < postulantes.size(); i++) {
            double puntaje = 0;
            int numBuenas = 0;
            int numMalas = 0;
            Postulante pos = postulantes.get(i);
            String idPostulante = pos.getIdPostulante();
            System.out.println("Reconoce el postulante: " + idPostulante);
            ArrayList<Respuesta> respuestas = RespuestaDAO.getInstancia().
                    mostrarRespuestasDePostulanteEnUnExamen(idPostulante, idExamen);
            System.out.println("Respuestas size: " + respuestas.size());
            for (int j = 0; j < respuestas.size(); j++) {
                Respuesta r = respuestas.get(j);
                System.out.println("Reconoce la respuesta: " + r.getNumero() + ", " + r.getLetra());
                Clave c = ClaveDAO.getInstancia().buscarClavePorExamenYNumero(idExamen, j + 1);
                System.out.println("Reconoce la clave: " + c.getNumero() + ", " + c.getLetra());
                if (r.getLetra() == c.getLetra()) {
                    puntaje = puntaje + c.getRangoPreguntas().getPuntajeCorrecta();
                    numBuenas++;
                } else {
                    puntaje = puntaje + c.getRangoPreguntas().getPuntajeIncorrecta();
                    numMalas++;
                }

                System.out.println("Puntaje: " + puntaje);
                System.out.println("NumBuenas: " + numBuenas);
                System.out.println("NumMalas: " + numMalas);
                cnn = Conexion.getInstancia().miConexion();
                PreparedStatement ps = null;
                try {
                    ps = cnn.prepareCall("call actualizar_postulante_examen(?,?,?,?,?,?)");
                    ps.setDouble(1, puntaje);
                    ps.setInt(2, numBuenas);
                    ps.setInt(3, numMalas);
                    ps.setInt(4, 0);
                    ps.setString(5, idPostulante);
                    ps.setString(6, idExamen);
                    ps.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("ERROR EN REVISAR EXAMEN: " + e.getMessage());
                } finally {
                    cnn.close();
                    ps.close();
                }

            }
        }
    }

    public void setOrdenDeMerito(Examen examen) throws SQLException {

        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        PreparedStatement pse = null;
        int i = 1;
        String idExamen = examen.getIdExamen();
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamenOrdenados(?)");
            ps.setString(1, idExamen);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                pse = cnn.prepareCall("call setOrdenMerito(?,?,?)");
                pse.setInt(1, i);
                pse.setString(2, idPostulante);
                pse.setString(3, idExamen);
                pse.executeUpdate();
                i++;
            }

        } catch (SQLException ex) {
            System.out.println("ERROR EN EL SET: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
            pse.close();
        }

    }

    public void setOrdenDeMerito(Examen examen, String idCarrera) throws SQLException {

        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        PreparedStatement pse = null;
        int i = 1;
        String idExamen = examen.getIdExamen();
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamenOrdenadosDeUnaCarrera(?,?)");
            ps.setString(1, idExamen);
            ps.setString(2, idCarrera);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                pse = cnn.prepareCall("call setOrdenMerito(?,?,?)");
                pse.setInt(1, i);
                pse.setString(2, idPostulante);
                pse.setString(3, idExamen);
                pse.executeUpdate();
                i++;
            }

        } catch (SQLException ex) {
            System.out.println("ERROR EN EL SET: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
            pse.close();
        }

    }

    public void mostrarResultadoDeExamen(DefaultTableModel modelo, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"Postulante", "Carrera", "Puntaje", "Numero de Buenas", "Numero de Malas"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamen(?)");
            ps.setString(1, idExamen);

            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                Postulante pos = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                String nombre = pos.getApellido_paterno() + " " + pos.getApellido_materno() + ", " + " " + pos.getNombres();
                String carrera = pos.getCarrera().getNombreCarrera();
                double puntaje = rs.getDouble("puntaje");
                int numBuenas = rs.getInt("numBuenas");
                int numMalas = rs.getInt("numMalas");

                Object fila[] = {nombre, carrera, String.format("%.2f", puntaje), numBuenas, numMalas};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public void mostrarResultadoDeExamenOrden(DefaultTableModel modelo, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"Postulante", "Carrera", "Puntaje", "Oden de Merito"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarResultadosDeUnExamenOrdenados(?)");
            ps.setString(1, idExamen);

            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                Postulante pos = PostulanteDAO.getInstancia().buscarPostulante(idPostulante);
                String nombre = pos.getApellido_paterno() + " " + pos.getApellido_materno() + ", " + " " + pos.getNombres();
                String carrera = pos.getCarrera().getNombreCarrera();
                double puntaje = rs.getDouble("puntaje");
                int ordenMerito = rs.getInt("ordenMerito");
                Object fila[] = {nombre, carrera, String.format("%.2f", puntaje), ordenMerito};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }

    public void mostrarPostulantesPorExamenDeUnaCarrera(DefaultTableModel modelo, String idExamen, String idCarrera) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"idPostulante", "Nombre", "DNI", "Puntaje", "Oden de Merito", "Carrera"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarPostulantesPorExamenDeUnaCarrera(?, ?)");
            ps.setString(1, idExamen);
            ps.setString(2, idCarrera);

            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                String nombre = rs.getString("NombrePostulante");
                String apPaterno = rs.getString("apellido_paterno");
                String apMaterno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String carrera = rs.getString("nombreCarrera");
                double puntaje = rs.getDouble("puntaje");
                int ordenMerito = rs.getInt("ordenMerito");
                Object fila[] = {idPostulante, apPaterno + " " + apMaterno + ", " + nombre, dni, String.format("%.2f", puntaje), ordenMerito, carrera};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
    }
}
