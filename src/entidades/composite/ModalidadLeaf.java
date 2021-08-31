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
public class ModalidadLeaf extends Modalidad{
    private String idSubmodalidad;

    public ModalidadLeaf(String idSubmodalidad, String nombre) {
        super(nombre);
        this.idSubmodalidad = idSubmodalidad;
        
    }

    @Override
    void add(Modalidad modalidad) {
        System.out.println("No se puede agregar la hoja");
    }

    @Override
    void remove(Modalidad modalidad) {
        System.out.println("No se puede quitar la hoja");
    }

    @Override
    void view() {
        System.out.println("-"+" "+nombre);
    }

    
    
}
