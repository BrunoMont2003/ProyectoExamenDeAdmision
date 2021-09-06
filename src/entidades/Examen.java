/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;



/**
 *
 * @author bruno
 */
public class Examen {
    private String idExamen;
    private String semestre;
    private Fecha fecha;
    private Areas area;
    private Modalidad modalidad;

    public Examen() {
    }

    public Examen(String idExamen, String semestre, Fecha fecha, Areas area, Modalidad modalidad) {
        this.idExamen = idExamen;
        this.semestre = semestre;
        this.fecha = fecha;
        this.area = area;
        this.modalidad = modalidad;
    }

    public String getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(String idExamen) {
        this.idExamen = idExamen;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Examen{" + "idExamen=" + idExamen + ", semestre=" + semestre + ", fecha=" + fecha.toStringFormatSql() + ", " + area.toString() + ", " + modalidad.toString() + '}';
    }
    
    
    
}
