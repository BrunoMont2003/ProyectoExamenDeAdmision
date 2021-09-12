/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Aula;
import entidades.Carreras;
import entidades.Examen;
import entidades.Modalidad;
import entidades.Postulante;
import entidades.Postulante_Examen;
import java.sql.*;
import java.util.ArrayList;
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
            ps = cnn.prepareCall("call insertar_postulante(?,?,?,?,?,?,?,?)");
            ps.setString(1, postulante.getIdPostulante());
            ps.setString(2, postulante.getNombres());
            ps.setString(3, postulante.getApellido_paterno());
            ps.setString(4, postulante.getApellido_materno());
            ps.setString(5, postulante.getDni());
            ps.setString(6, postulante.getCarrera().getCodigoCarrera());
            ps.setString(7, postulante.getAula().getIdAula());
            ps.setString(8, postulante.getModalidad().getIdModalidad());
            ps.executeUpdate();

            ListaPostulante_Examen examenes = postulante.getL();
            for (int i = 0; i < examenes.getN(); i++) {
                ps = cnn.prepareCall("call insertarPostulanteExamenBase(?,?)");

                ps.setString(1, postulante.getIdPostulante());
                ps.setString(2, examenes.getElemento(i).getExamen().getIdExamen());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public ListaPostulante_Examen buscarExamenes(String idPostulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;

        ListaPostulante_Examen lista = new ListaPostulante_Examen();
        try {
            ps = cnn.prepareCall("call mostrarExamenesDeUnPostulante(?)");
            ps.setString(1, idPostulante);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idExamen");
                Examen examen = ExamenDAO.getInstancia().buscarExamen(idExamen);
                Postulante_Examen pe = new Postulante_Examen(examen);
                lista.agregar(pe);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        return lista;
    }

    public Postulante buscarPostulante(String idPostulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Postulante pos = null;
        try {
            ps = cnn.prepareCall("call buscarpostulante(?)");
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

                ListaPostulante_Examen examenes = PostulanteDAO.getInstancia().buscarExamenes(idPostulante);
                pos.setL(examenes);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return pos;
    }

    public boolean exists(String id) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call mostrarPostulantes()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idExamen = rs.getString("idPostulante");
                if (idExamen.equals(id)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return false;
    }

    public void actualizar(Postulante postulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call modificarPostulante(?,?,?,?,?,?,?,?)");
            ps.setString(1, postulante.getIdPostulante());
            ps.setString(2, postulante.getNombres());
            ps.setString(3, postulante.getApellido_paterno());
            ps.setString(4, postulante.getApellido_materno());
            ps.setString(5, postulante.getDni());
            ps.setString(6, postulante.getCarrera().getCodigoCarrera());
            ps.setString(7, postulante.getAula().getIdAula());
            ps.setString(8, postulante.getModalidad().getIdModalidad());
            ps.executeUpdate();

            ListaPostulante_Examen examenes = postulante.getL();

            ListaPostulante_Examen examenesEnBD = PostulanteDAO.getInstancia().buscarExamenes(postulante.getIdPostulante());

            if (examenesEnBD.getL().isEmpty() && examenes.getL().isEmpty()) {
                System.out.println("examenesEnBD.getL().isEmpty() && examenes.getL().isEmpty() " + examenesEnBD.getN() + " && " + examenes.getN());
                ps = cnn.prepareCall("call insertarPostulanteExamenBase(?,?)");
                ps.setString(1, postulante.getIdPostulante());
                ps.setString(2, examenes.getElemento(0).getExamen().getIdExamen());
                ps.executeUpdate();

            } else {
                for (int i = 0; i < examenes.getN(); i++) {
                    //ELIMINAR TODOS LOS EXAMENES
                    PostulanteDAO.getInstancia().eliminarExamen(postulante.getL().getElemento(i).getExamen().getIdExamen());
                    ps = cnn.prepareCall("call insertarPostulanteExamenBase(?,?)");
                    ps.setString(1, postulante.getIdPostulante());
                    ps.setString(2, examenes.getElemento(i).getExamen().getIdExamen());
                    ps.executeUpdate();
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public ArrayList<Postulante> listarPostulantes() throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Postulante> lista = new ArrayList<>();

        try {
            ps = cnn.prepareCall("call mostrarPostulantes()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                String nombres = rs.getString("nombrePostulante");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String idCarrera = rs.getString("idCarrera");
                Carreras carrera = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);
                String idAula = rs.getString("idAula");
                Aula aula = AulaDAO.getInstancia().buscarAula(idAula);
                String idModalidad = rs.getString("idModalidad");
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                Postulante postulante = new Postulante(idPostulante, nombres, apellido_paterno, apellido_materno, dni, carrera, aula, modalidad);
                lista.add(postulante);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return lista;
    }

    public ArrayList<Postulante> listarPostulantesPorExamen(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ArrayList<Postulante> lista = new ArrayList<>();

        try {
            ps = cnn.prepareCall("call mostrarPostulantesPorExamen(?)");
            ps.setString(1, idExamen);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idPostulante = rs.getString("idPostulante");
                String nombres = rs.getString("nombrePostulante");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String dni = rs.getString("dni");
                String idCarrera = rs.getString("idCarrera");
                Carreras carrera = CarrerasDAO.getInstancia().buscarCarreras(idCarrera);
                String idAula = rs.getString("idAula");
                Aula aula = AulaDAO.getInstancia().buscarAula(idAula);
                String idModalidad = rs.getString("idModalidad");
                Modalidad modalidad = ModalidadDAO.getInstancia().buscarModalidad(idModalidad);
                Postulante postulante = new Postulante(idPostulante, nombres, apellido_paterno, apellido_materno, dni, carrera, aula, modalidad);
                lista.add(postulante);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR dx: " + ex.getMessage());
        } finally {
            cnn.close();
            ps.close();
        }
        return lista;
    }

    public void eliminar(String idPostulante) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarPostulante(?)");
            ps.setString(1, idPostulante);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }

    public void eliminarExamen(String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareCall("call eliminarExamenDeUnPostulante(?)");
            ps.setString(1, idExamen);
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
        String titulos[] = {"ID Postulante", "Nombres", "Apellido Paterno", "Apellido Materno", "DNI", "ID Carrera", "ID AULA", "ID Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarPostulantes()");
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

    public void mostrarPostulantesPorExamen(DefaultTableModel modelo, String idExamen) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Postulante", "Nombres", "Apellido Paterno", "Apellido Materno", "DNI", "ID Carrera", "ID AULA", "ID Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareCall("call mostrarPostulantesPorExamen(?)");
            ps.setString(1, idExamen);

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


    public void mostrarExamenes(String idPostulante, DefaultTableModel modelo) throws SQLException {
        try {

            Object datos[][] = new Object[buscarExamenes(idPostulante).getN()][5];
            String titulos[] = {"ID Examen", "Semestre", "Fecha", "Area", "Modalidad"};
            for (int i = 0; i < buscarExamenes(idPostulante).getN(); i++) {
                Postulante_Examen x = buscarExamenes(idPostulante).getElemento(i);
                datos[i][0] = x.getExamen().getIdExamen();
                datos[i][1] = x.getExamen().getSemestre();
                datos[i][2] = x.getExamen().getFecha().toStringFormatSql();
                datos[i][3] = x.getExamen().getArea().getNombreArea();
                datos[i][4] = x.getExamen().getModalidad().getNombreM();
            }
            modelo.setDataVector(datos, titulos);
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void mostraPostulantePorCarrera(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Postulante", "Nombres", "Apellido Paterno", "Apellido Materno", "DNI", "ID Carrera", "ID AULA", "ID Modalidad"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareCall("call buscar_postulante(?)");
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
