/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author bruno
 */
public class Postulante_Examen {
    private Examen examen;
    private double puntaje;
    private int numBuenas;
    private int numMalas;
    private int ordenMerito;

    public Postulante_Examen() {
    }

    public Postulante_Examen(Examen examen) {
        this.examen = examen;
    }

    public Postulante_Examen(Examen examen, double puntaje, int numBuenas, int numMalas, int ordenMerito) {
        this.examen = examen;
        this.puntaje = puntaje;
        this.numBuenas = numBuenas;
        this.numMalas = numMalas;
        this.ordenMerito = ordenMerito;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNumBuenas() {
        return numBuenas;
    }

    public void setNumBuenas(int numBuenas) {
        this.numBuenas = numBuenas;
    }

    public int getNumMalas() {
        return numMalas;
    }

    public void setNumMalas(int numMalas) {
        this.numMalas = numMalas;
    }

    public int getOrdenMerito() {
        return ordenMerito;
    }

    public void setOrdenMerito(int ordenMerito) {
        this.ordenMerito = ordenMerito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.examen);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Postulante_Examen other = (Postulante_Examen) obj;
        if (!Objects.equals(this.examen, other.examen)) {
            return false;
        }
        return true;
    }
    
    
}
