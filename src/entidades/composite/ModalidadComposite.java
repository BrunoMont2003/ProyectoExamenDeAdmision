/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.composite;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class ModalidadComposite extends Modalidad{
    private String idModalidad;
    private ArrayList<Modalidad> hijo = new ArrayList<Modalidad>();

    public ModalidadComposite(String idModalidad, String nombre) {
        super(nombre);
        this.idModalidad = idModalidad;
    }

    @Override
    void add(Modalidad modalidad) {
        hijo.add(modalidad);
    }

    @Override
    void remove(Modalidad modalidad) {
        hijo.remove(modalidad);
    }

    @Override
    void view() {
        System.out.println("Modalidad: "+nombre);
        System.out.println("Submodalidades: ");
        for (int i = 0; i < hijo.size(); i++) {
            hijo.get(i).view();
            
        }
    }
    
    
    
}
