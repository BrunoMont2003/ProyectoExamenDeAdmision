/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.composite2;

/**
 *
 * @author bruno
 */
public class RangoPreguntasLeaf extends RangoPreguntas {

    private String idClave;
    private int numero;
    private char letra;


    public RangoPreguntasLeaf(String idClave, int numero,char letra) {
        this.idClave = idClave;
        this.numero = numero;
        this.letra = letra;
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

    
   
    @Override
    void add(RangoPreguntas r) {
        System.out.println("No se puede agregar la hoja");

    }

    @Override
    void remove(RangoPreguntas r) {
        System.out.println("No se puede quitar la hoja");

    }

    @Override
    void view() {
        System.out.println("-" + " " + idClave);

    }

}
