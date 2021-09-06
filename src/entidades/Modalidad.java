/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Modalidad {
   private String idModalidad;
   private String nombreM;

    public Modalidad() {
    }

    public Modalidad(String idModalidad, String nombreM) {
        this.idModalidad = idModalidad;
        this.nombreM = nombreM;
    }

    public String getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(String idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    @Override
    public String toString() {
        return "Modalidad{" + "idModalidad=" + idModalidad + ", nombreM=" + nombreM + '}';
    }
  
   
   
   
   
}
