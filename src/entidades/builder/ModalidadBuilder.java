/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.builder;

import entidades.Modalidad;


public abstract class ModalidadBuilder {
    
    protected Modalidad modalidad;
    
    public Modalidad getModalidad(){
        return modalidad;
    }
    
    public void crearModalidad(){
        modalidad = new Modalidad();
    }
    
    public abstract void builIdModalidad();
    
    public abstract void builnombreModalidad();
    
}
