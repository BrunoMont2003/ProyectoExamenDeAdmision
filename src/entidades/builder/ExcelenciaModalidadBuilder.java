/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.builder;


/**
 *
 * @author Frecuencia 7
 */
public class ExcelenciaModalidadBuilder extends ModalidadBuilder{
      @Override
    public void builIdModalidad() {
        modalidad.setIdModalidad("MODD-02");
    }

    @Override
    public void builnombreModalidad() {
       modalidad.setNombreM("EXCELENCIA");              
    }
}
