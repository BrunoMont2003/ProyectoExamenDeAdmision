/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
//GAAAAaa
//GAAA3333
import entidades.Areas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AreasDAO {

    private Connection cnn = null;
    private ResultSet rs = null;

    private static AreasDAO instancia;

    public static AreasDAO getInstancia() {
        if (instancia == null) {
            instancia = new AreasDAO();
        }
        return instancia;
    }
    
     public void insertar(Areas areas) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement("call insertar_areaU(?,?)");
            ps.setString(1, areas.getIdArea());
            ps.setString(2, areas.getNombreArea());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL " + e.getMessage());
        } finally {
            ps.close();
            cnn.close();
        }
    }
     
     public void mostrarAreas(DefaultTableModel modelo) throws SQLException {
        cnn = Conexion.getInstancia().miConexion();
        PreparedStatement ps = null;
        String titulos[] = {"ID Area", "Nombre Area"};
        modelo.getDataVector().removeAllElements();
        modelo.setColumnIdentifiers(titulos);
        try {
            ps = cnn.prepareStatement("call mostrarAreas()");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idArea = rs.getString("idArea");
                String nombreArea = rs.getString("nombreArea");
                String fila[] = {idArea, nombreArea};
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
