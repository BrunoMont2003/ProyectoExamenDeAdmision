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
public class RangoPreguntas {
    private String idRangoPreguntas;
    private String nombre;
    private double puntajeCorrecta;
    private double puntajeIncorrecta;

    public RangoPreguntas() {
    }

    public RangoPreguntas(String idRangoPreguntas, String nombre, double puntajeCorrecta, double puntajeIncorrecta) {
        this.idRangoPreguntas = idRangoPreguntas;
        this.nombre = nombre;
        this.puntajeCorrecta = puntajeCorrecta;
        this.puntajeIncorrecta = puntajeIncorrecta;
    }

    public String getIdRangoPreguntas() {
        return idRangoPreguntas;
    }

    public void setIdRangoPreguntas(String idRangoPreguntas) {
        this.idRangoPreguntas = idRangoPreguntas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntajeCorrecta() {
        return puntajeCorrecta;
    }

    public void setPuntajeCorrecta(double puntajeCorrecta) {
        this.puntajeCorrecta = puntajeCorrecta;
    }

    public double getPuntajeIncorrecta() {
        return puntajeIncorrecta;
    }

    public void setPuntajeIncorrecta(double puntajeIncorrecta) {
        this.puntajeIncorrecta = puntajeIncorrecta;
    }
    
    
    
    
}
