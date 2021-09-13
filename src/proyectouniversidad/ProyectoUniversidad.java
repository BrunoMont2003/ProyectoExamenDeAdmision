package proyectouniversidad;

import presentacion.FrmPrincipal;
import presentacion.FrmInicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casa
 */
public class ProyectoUniversidad {

    
    public static void main(String[] args) {
        FrmInicio pre= new FrmInicio();
        pre.setVisible(true);
        FrmPrincipal iniciar= new FrmPrincipal();
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(40);
                pre.porcentaje.setText(Integer.toString(i)+"%");
                pre.barra.setValue(i);
               
                
                if(i==100){
                    pre.setVisible(false);
                    iniciar.setVisible(true);
                }
            }
        }catch (Exception e){
        }
    }
    
}
