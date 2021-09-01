
package datos;

import entidades.Aula;
import entidades.ResponsableAula;
import entidades.adapter.ResponsableAulaAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ResponsableAulaDAO {
    private Connection cnn = null;
    private ResultSet rs = null;
    
    private static ResponsableAulaDAO instancia;
    
    public static ResponsableAulaDAO getInstancia() {
        if (instancia == null) {
            instancia = new ResponsableAulaDAO();
        }
        return instancia;
    }
    
    public void insertar(ResponsableAulaAdapter responsable) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_Responsable(?,?,?,?,?)");
            ps.setString(1, responsable.getResponsableAula().getIdResponsable());
            ps.setString(2, responsable.getResponsableAula().getApellidos());
            ps.setString(3, responsable.getResponsableAula().getNombres());
            ps.setString(4, responsable.getResponsableAula().getDni());
            ps.setString(5, responsable.getResponsableAula().getAula().getIdAula());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public ResponsableAulaAdapter buscarResponsable(String idResponsable) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        ResponsableAulaAdapter resp = null;
        try {
            ps = cnn.prepareStatement("call buscar_Responsable(?)");
            ps.setString(1, idResponsable);
            rs = ps.executeQuery();
            if (rs.next()) {
                String apellidosResp = rs.getString("apellidosResp");
                String nombresResp = rs.getString("nombreResp");
                String dniResp = rs.getString("dniResp");
                String idAula = rs.getString("idAula");
                Aula aula = new Aula();
                aula = AulaDAO.getInstancia().buscarAula(idAula);
                ResponsableAula a= new ResponsableAula(idResponsable, nombresResp, apellidosResp, dniResp, aula);
                ResponsableAulaAdapter f = new ResponsableAulaAdapter();
                f.setResponsableAula(a);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
        return resp;
    }
    
    public void actualizar(ResponsableAulaAdapter responsable) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call modificar_Responsable(?,?,?,?,?)");
            ps.setString(1, responsable.getResponsableAula().getIdResponsable());
            ps.setString(2, responsable.getResponsableAula().getApellidos());
            ps.setString(3, responsable.getResponsableAula().getNombres());
            ps.setString(4, responsable.getResponsableAula().getDni());
            ps.setString(5, responsable.getResponsableAula().getAula().getIdAula());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {

            ps.close();
            cnn.close();
        }
    }
    
    public void eliminar(String idResponsable) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call eliminar_Responsable(?)");
            ps.setString(1, idResponsable);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostrarResponsable(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Resposable-Aula", "Apellidos","Nombres" , "DNI", "ID-Aula"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrar_Responsables()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idResponsable = rs.getString("idResponsable");
                String apellidosResp = rs.getString("apellidosResp");
                String nombresResp = rs.getString("nombresResp");
                String dniResp = rs.getString("dniResp");
                String idAula = rs.getString("idAula");
                String fila[] = {idResponsable, apellidosResp, nombresResp, dniResp, idAula};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
    
    public void mostraResponsableporNombre(String nombre, DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Resposable-Aula", "Apellidos","Nombres" , "DNI"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);

        try {
            ps = cnn.prepareStatement("call buscarResponsable_PorNombre(?)");
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idResponsable = rs.getString("idResponsable");
                String apellidosResp = rs.getString("apellidosResp");
                String nombresResp = rs.getString("nombresResp");
                String dniResp = rs.getString("dniResp");
                String idAula = rs.getString("idAula");
                String fila[] = {idResponsable, apellidosResp, nombresResp, dniResp, idAula};
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
