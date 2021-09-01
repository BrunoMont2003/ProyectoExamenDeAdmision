/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.builder;

import entidades.Modalidad;

/**
 *
 * @author Frecuencia 7
 */
public class DireccionSistemas {
    private ModalidadBuilder builder;
    
    public void setBuilder(ModalidadBuilder builder){
        this.builder = builder;
    }
    
    public Modalidad getModalidad(){
        return builder.getModalidad();
    }
    
    public void construirModalidad(){
        builder.crearModalidad();
        builder.builIdModalidad();
        builder.builnombreModalidad();
    }
}
