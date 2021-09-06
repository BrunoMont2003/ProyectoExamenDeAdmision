/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Areas {
    private String idArea;
    private String nombreArea;

    public Areas() {
    }

    
    public Areas(String idArea, String nombreArea) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    
     @Override
    public String toString() {
        return "Areas{" + "idArea=" + idArea + ", nombreArea=" + nombreArea + '}';
    }
    
}
