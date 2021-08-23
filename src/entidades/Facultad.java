/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Facultad {
    private String idFacultad;
    private String nombreFacultad;
    private Areas areas;

    public Facultad() {
    }

    public Facultad(String idFacultad, String nombreFacultad, Areas areas) {
        this.idFacultad = idFacultad;
        this.nombreFacultad = nombreFacultad;
        this.areas = areas;
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }
    
    
}
