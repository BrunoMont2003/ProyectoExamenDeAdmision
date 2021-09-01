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
public class Aula {
    private String idAula;
    private int nAula;
    private int capacidad;
    private int numeroAusentes;
    private Areas areas;

    public Aula() {
    }

    public Aula(String idAula, int nAula, int capacidad, int numeroAusentes, Areas areas) {
        this.idAula = idAula;
        this.nAula = nAula;
        this.capacidad = capacidad;
        this.numeroAusentes = numeroAusentes;
        this.areas = areas;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public int getnAula() {
        return nAula;
    }

    public void setnAula(int nAula) {
        this.nAula = nAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroAusentes() {
        return numeroAusentes;
    }

    public void setNumeroAusentes(int numeroAusentes) {
        this.numeroAusentes = numeroAusentes;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }
    
    
    
}
