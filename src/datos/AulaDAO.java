/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Areas;
import entidades.Aula;
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
public class AulaDAO {
    private Connection cnn = null;
    private ResultSet rs = null;

    private static AulaDAO instancia;

    public static AulaDAO getInstancia() {
        if (instancia == null) {
            instancia = new AulaDAO();
        }
        return instancia;
    }

    public void insertar(Aula aula) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_aula(?,?,?,?,?)");
            ps.setString(1, aula.getIdAula());
            ps.setString(2, String.valueOf(aula.getnAula()));
            ps.setString(3, String.valueOf(aula.getCapacidad()));
            ps.setString(4, String.valueOf(aula.getNumeroAusentes()));
            ps.setString(5, aula.getAreas().getIdArea());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
   public Aula buscarAula(String idAula) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        Aula aula = null;
        try {
            ps = cnn.prepareStatement("call buscarAula(?)");
            ps.setString(1, idAula);
            rs = ps.executeQuery();
            if (rs.next()) {
                String idAul = rs.getString("idAula");
                int numeroAula = Integer.parseInt(rs.getString("numeroAula"));
                int capacidad = Integer.parseInt(rs.getString("capacidad"));
                int numeroAusentes = Integer.parseInt(rs.getString("numeroAusentes"));
                String idArea = rs.getString("idArea");
                Areas areas = AreasDAO.getInstancia().buscarArea(idArea);
                aula= new Aula(idAul,numeroAula,capacidad,numeroAusentes, areas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return aula;
    }
   
     public void actualizar(Aula aula) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificarAula(?,?,?,?,?)");
            ps.setString(1, aula.getIdAula());
            ps.setString(2, String.valueOf(aula.getnAula()));
            ps.setString(3, String.valueOf(aula.getCapacidad()));
            ps.setString(4, String.valueOf(aula.getNumeroAusentes()));
            ps.setString(5, aula.getAreas().getIdArea());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {

            ps.close();
            cnn.close();

        }
    }
     
     public void eliminar(String idAula) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminarAula(?)");
            ps.setString(1, idAula);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    
    public void mostrarAula(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"IDAULA", "NUMEROAULA","CAPACIDAD","NUMEROAUSENTES", "IDAREA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarAulas()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idAula = rs.getString("idAula");
                int numeroAula=Integer.parseInt(rs.getString("numeroAula"));
                int capacidad=Integer.parseInt(rs.getString("capacidad"));
                int nAusentes=Integer.parseInt(rs.getString("numeroAusentes"));
                String idArea = rs.getString("idArea");
                String fila[] = {idAula,String.valueOf(numeroAula) ,String.valueOf(capacidad),String.valueOf( nAusentes), idArea};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostrarAulaPorArea(String id, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"IDAULA", "NUMEROAULA","CAPACIDAD","NUMEROAUSENTES", "IDAREA"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("call buscar_aula(?)");
            ps.setString(1, id + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idAula = rs.getString("idAula");
                int numeroAula=Integer.parseInt(rs.getString("numeroAula"));
                int capacidad=Integer.parseInt(rs.getString("capacidad"));
                int nAusentes=Integer.parseInt(rs.getString("numeroAusentes"));
                String idArea = rs.getString("idArea");
                String fila[] = {idAula,String.valueOf(numeroAula) ,String.valueOf(capacidad),String.valueOf( nAusentes), idArea};
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
