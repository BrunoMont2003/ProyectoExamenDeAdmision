/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.composite2;

import entidades.Areas;
import entidades.Examen;
import entidades.Fecha;
import entidades.Modalidad;
import entidades.builder.DireccionSistemas;
import entidades.builder.OrdinarioModalidadBuilder;

/**
 *
 * @author bruno
 */
public class Cliente {
    public static void main(String[] args) {
        //creando el objeto examen para poder tenerlo de parámetro en CLAVE
        Fecha f = new Fecha(27,05,2021);
        Areas ar = new Areas("AREA_A","Ciencias De La Vidad Y La Salud");
        //para modalidad se implementó el patrón builder
        DireccionSistemas m = new DireccionSistemas();
        m.setBuilder(new OrdinarioModalidadBuilder());
        m.construirModalidad();
        Modalidad modalidad = new Modalidad(m.getModalidad().getIdModalidad(), m.getModalidad().getNombreM());
        
        Examen ex = new Examen("EX-0001", "2021", f, ar, modalidad);
 
        RangoPreguntasComposite conocimientos = new RangoPreguntasComposite("RANGO-001", "Conocimientos", 4.079, -1.021);
        conocimientos.add(new RangoPreguntasLeaf("CLA-0001", 1, 'a',ex));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0002", 2, 'b',ex));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0003", 3, 'b',ex));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0003", 4, 'b',ex));
        
        conocimientos.view();
    }
}
