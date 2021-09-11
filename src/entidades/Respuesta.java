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
public class Respuesta {
    private String idRespuesta;
    private int numero;
    private char letra;
    private Postulante postulante;
    private Examen examen;

    public Respuesta() {
    }

    public Respuesta(String idRespuesta, int numero, char letra, Postulante postulante, Examen examen) {
        this.idRespuesta = idRespuesta;
        this.numero = numero;
        this.letra = letra;
        this.postulante = postulante;
        this.examen = examen;
    }

    public String getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
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

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
    
    
}
