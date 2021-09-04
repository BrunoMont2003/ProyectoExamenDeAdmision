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
public class Clave {
    private String idClave;
    private int numero;
    private char letra;
    private Examen examen;
    private RangoPreguntas rangoPreguntas;

    public Clave() {
    }

    public Clave(String idClave, int numero, char letra, Examen examen, RangoPreguntas rangoPreguntas) {
        this.idClave = idClave;
        this.numero = numero;
        this.letra = letra;
        this.examen = examen;
        this.rangoPreguntas = rangoPreguntas;
    }

    public String getIdClave() {
        return idClave;
    }

    public void setIdClave(String idClave) {
        this.idClave = idClave;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public RangoPreguntas getRangoPreguntas() {
        return rangoPreguntas;
    }

    public void setRangoPreguntas(RangoPreguntas rangoPreguntas) {
        this.rangoPreguntas = rangoPreguntas;
    }
    
    
}
