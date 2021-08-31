/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.composite;

/**
 *
 * @author bruno
 */
public abstract class Modalidad {
    protected String nombre;
    public Modalidad(String nombre){
        this.nombre = nombre;
    }
    abstract void add(Modalidad modalidad);
    abstract void remove(Modalidad modalidad);
    abstract void view();
    
}
