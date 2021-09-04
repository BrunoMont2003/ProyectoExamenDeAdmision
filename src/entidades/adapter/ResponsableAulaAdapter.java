
package entidades.adapter;

import entidades.Persona;
import entidades.ResponsableAula;

public class ResponsableAulaAdapter extends Persona{

    private ResponsableAula responsableAula;

    public ResponsableAulaAdapter() {
        responsableAula = new ResponsableAula();
    }

    public ResponsableAula getResponsableAula() {
        return responsableAula;
    }

    public void setResponsableAula(ResponsableAula responsableAula) {
        this.responsableAula = responsableAula;
    }
    
    @Override
    public String Apellidos_Nombres() {
        return "NOMBRE: "+responsableAula.getApellidos() +" - " + responsableAula.getNombres();
    }

    @Override
    public String identificación() {
        return "ID:"+responsableAula.getIdResponsable()+"\nDNI: "+ responsableAula.getDni();
    }

    @Override
    public String funcion() {
        return "FUNCIÓN: RESPONSABLE DE AULA";
    }
    
}
