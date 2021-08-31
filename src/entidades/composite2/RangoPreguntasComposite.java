/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.composite2;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class RangoPreguntasComposite extends RangoPreguntas {

    private ArrayList<RangoPreguntas> hijo = new ArrayList<RangoPreguntas>();

    private String idRangoPreguntas;
    private String nombre;
    private double puntajeCorrecta;
    private double puntajeIncorrecta;

    public RangoPreguntasComposite(String idRangoPreguntas, String nombre, double puntajeCorrecta, double puntajeIncorrecta) {
        this.idRangoPreguntas = idRangoPreguntas;
        this.nombre = nombre;
        this.puntajeCorrecta = puntajeCorrecta;
        this.puntajeIncorrecta = puntajeIncorrecta;
    }

    public ArrayList<RangoPreguntas> getHijo() {
        return hijo;
    }

    public void setHijo(ArrayList<RangoPreguntas> hijo) {
        this.hijo = hijo;
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
    
    

    @Override
    void add(RangoPreguntas r) {
        hijo.add(r);

    }

    @Override
    void remove(RangoPreguntas r) {
        hijo.remove(r);

    }

    @Override
    void view() {
        System.out.println("Rango de Preguntas: " + nombre);
        System.out.println("Claves: ");
        for (int i = 0; i < hijo.size(); i++) {
            hijo.get(i).view();

        }
    }

}
