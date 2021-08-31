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
public abstract class RangoPreguntas {

    public RangoPreguntas() {
    }
    
    abstract void add(RangoPreguntas r);
    abstract void remove(RangoPreguntas r);
    abstract void view();
}
