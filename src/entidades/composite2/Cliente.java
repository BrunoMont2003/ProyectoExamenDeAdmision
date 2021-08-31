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
public class Cliente {
    public static void main(String[] args) {
        RangoPreguntasComposite conocimientos = new RangoPreguntasComposite("RANGO-001", "Conocimientos", 4.079, -1.021);
        conocimientos.add(new RangoPreguntasLeaf("CLA-0001", 1, 'a'));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0002", 2, 'b'));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0003", 3, 'b'));
        conocimientos.add(new RangoPreguntasLeaf("CLA-0003", 4, 'b'));
        
        conocimientos.view();
    }
}
