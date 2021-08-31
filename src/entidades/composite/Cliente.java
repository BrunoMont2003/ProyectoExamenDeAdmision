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
public class Cliente {
    public static void main(String[] args) {
        ModalidadComposite raiz = new ModalidadComposite("Mod-001", "Ordinario");
        raiz.add(new ModalidadLeaf("SUB-001", "QUINTO"));
        raiz.view();
        
        ModalidadLeaf excelencia = new ModalidadLeaf("SUB-002", "Excelencia");
        ModalidadLeaf deportistas = new ModalidadLeaf("SUB-003", "Deportistas");
        ModalidadLeaf discapacitados = new ModalidadLeaf("SUB-004", "Discapacitados");
        ModalidadComposite extraordinario = new ModalidadComposite("Mod-002", "Extraordinario");
        extraordinario.add(excelencia);
        extraordinario.add(deportistas);
        extraordinario.add(discapacitados);
        extraordinario.view();
    }
}
