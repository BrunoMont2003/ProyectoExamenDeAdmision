/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Carreras {
    private String codigoCarrera;
    private String nombreCarrera;

    public Carreras() {
    }

    public Carreras(String codigoCarrera, String nombreCarrera) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    
}
