/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USUARIO
 */
public class Error {
    private String idError;
    private String descripcion;
    private Clave clave=new Clave();

    public Error() {
    }

    public Error(String idError, String descripcion) {
        this.idError = idError;
        this.descripcion = descripcion;
    }

    public Error(String idError, String descripcion, Clave clave) {
        this.idError = idError;
        this.descripcion = descripcion;
        this.clave = clave;
    }

    public String getIdError() {
        return idError;
    }

    public void setIdError(String idError) {
        this.idError = idError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Clave getClave() {
        return clave;
    }

    public void setClave(Clave clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Error{" + "idError=" + idError + ", descripcion=" + descripcion + ", clave=" + clave + '}';
    }
    
    
    
}
