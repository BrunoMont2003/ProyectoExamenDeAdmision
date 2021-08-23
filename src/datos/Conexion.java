/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    private static Conexion instancia;
    public static Conexion getInstancia(){
        if(instancia==null)
            instancia= new Conexion();
        return instancia;
    }
       
     
    public Connection miConexion(){
    Connection cn = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, "Error no se puede puede establecer la conexion "  + e.getMessage());
    }
    try{
        String url = "jdbc:mysql://localhost:3306/bduniversidad?useSSL=false";
        String user = "root";
        String password = "1234";
        cn = DriverManager.getConnection(url, user, password);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Error no se puede puede establecer la conexion" + e.getMessage());
    }
    return cn;
}
}
