
package entidades;

public class ResponsableAula{
    private String idResponsable;
    private String nombres;
    private String apellidos;
    private String dni;
    private Aula aula = new Aula();

    public ResponsableAula(String idResponsable, String nombres, String apellidos, String dni) {
        this.idResponsable = idResponsable;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    

    public ResponsableAula(String idResponsable, String nombres, String apellidos, String dni, Aula aula) {
        this.idResponsable = idResponsable;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.aula = aula;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public ResponsableAula() {
    }

    public String getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(String idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ResponsableAula{" + "idResponsable=" + idResponsable + ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }
    
}
