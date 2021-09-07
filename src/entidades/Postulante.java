/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import datos.ListaPostulante_Examen;

public class Postulante {

    private String idPostulante;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String dni;
    private Carreras carrera;
    private Aula aula;
    private Modalidad modalidad;
    private ListaPostulante_Examen L;

    public Postulante() {
        L= new ListaPostulante_Examen();
    }

    public Postulante(String idPostulante, String nombres, String apellido_paterno, String apellido_materno, String dni, Carreras carrera, Aula aula, Modalidad modalidad) {
        this.idPostulante = idPostulante;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.dni = dni;
        this.carrera = carrera;
        this.aula = aula;
        this.modalidad = modalidad;
         L= new ListaPostulante_Examen();
    }

  


    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

  

    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }

    public ListaPostulante_Examen getL() {
        return L;
    }

    public void setL(ListaPostulante_Examen L) {
        this.L = L;
    }
    

}
