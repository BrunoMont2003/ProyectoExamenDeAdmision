/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Carreras {

    private String codigoCarrera;
    private String nombreCarrera;
    private Facultad facultad;

    public Carreras() {
    }

    public Carreras(String codigoCarrera, String nombreCarrera, Facultad facultad) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.facultad = facultad;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public int getNumVacantes(String idModalidad) {
        int numVacantes = 0;
        switch (idModalidad) {
            case "MODD-01":
                switch (getCodigoCarrera()) {
                    case "CBIO-01":
                        numVacantes = 13;
                        break;
                    case "CBIO-02":
                        numVacantes = 11;
                        break;
                    case "CBIO-03":
                        numVacantes = 13;
                        break;
                    case "CBIO-04":
                        numVacantes = 19;
                        break;
                    case "CBIO-05":
                        numVacantes = 24;
                        break;
                    case "CBIO-06":
                        numVacantes = 22;
                        break;
                    case "EDCC-01":
                        numVacantes = 10;
                        break;
                    case "EDCC-02":
                        numVacantes = 10;
                        break;
                    case "EDCC-03":
                        numVacantes = 60;
                        break;
                    case "EDCC-04":
                        numVacantes = 11;
                        break;
                    case "SLUD-01":
                        numVacantes = 25;
                        break;
                    case "SLUD-02":
                        numVacantes = 5;
                        break;
                    case "SLUD-03":
                        numVacantes = 17;
                        break;
                    case "CCSC-01":
                        numVacantes = 11;
                        break;
                    case "CCSC-02":
                        numVacantes = 11;
                        break;
                    case "CCSC-03":
                        numVacantes = 5;
                        break;
                    case "CCSC-04":
                        numVacantes = 13;
                        break;
                    case "CCSC-05":
                        numVacantes = 18;
                        break;
                    case "CCSC-06":
                        numVacantes = 12;
                        break;
                    case "CFSM-01":
                        numVacantes = 14;
                        break;
                    case "CFSM-02":
                        numVacantes = 13;
                        break;
                    case "CFSM-03":
                        numVacantes = 14;
                        break;
                    case "CFSM-04":
                        numVacantes = 16;
                        break;
                    case "CCEE-01":
                        numVacantes = 25;
                        break;
                    case "CCEE-02":
                        numVacantes = 25;
                        break;
                    case "CCEE-03":
                        numVacantes = 25;
                        break;
                    case "DOCP-01":
                        numVacantes = 25;
                        break;
                    case "DOCP-02":
                        numVacantes = 9;
                        break;
                    case "INGN-01":
                        numVacantes = 24;
                        break;
                    case "INGN-02":
                        numVacantes = 13;
                        break;
                    case "INGN-03":
                        numVacantes = 11;
                        break;
                    case "INGN-04":
                        numVacantes = 11;
                        break;
                    case "INGN-05":
                        numVacantes = 10;
                        break;
                    case "INGN-06":
                        numVacantes = 8;
                        break;
                    case "INGN-07":
                        numVacantes = 8;
                        break;
                    case "INGN-08":
                        numVacantes = 10;
                        break;
                    case "CCAG-01":
                        numVacantes = 12;
                        break;
                    case "CCAG-02":
                        numVacantes = 11;
                        break;
                    case "CCAG-03":
                        numVacantes = 11;
                        break;
                    case "CCAG-04":
                        numVacantes = 11;
                        break;
                    default:
                        break;
                }
                break;
            case "MODD-02":
                switch (getCodigoCarrera()) {
                    case "CBIO-01":
                        numVacantes = 5;
                        break;
                    case "CBIO-02":
                        numVacantes = 5;
                        break;
                    case "CBIO-03":
                        numVacantes = 5;
                        break;
                    case "CBIO-04":
                        numVacantes = 5;
                        break;
                    case "CBIO-05":
                        numVacantes = 5;
                        break;
                    case "CBIO-06":
                        numVacantes = 5;
                        break;
                    case "EDCC-01":
                        numVacantes = 5;
                        break;
                    case "EDCC-02":
                        numVacantes = 5;
                        break;
                    case "EDCC-03":
                        numVacantes = 5;
                        break;
                    case "EDCC-04":
                        numVacantes = 5;
                        break;
                    case "SLUD-01":
                        numVacantes = 5;
                        break;
                    case "SLUD-02":
                        numVacantes = 2;
                        break;
                    case "SLUD-03":
                        numVacantes = 5;
                        break;
                    case "CCSC-01":
                        numVacantes = 5;
                        break;
                    case "CCSC-02":
                        numVacantes = 5;
                        break;
                    case "CCSC-03":
                        numVacantes = 5;
                        break;
                    case "CCSC-04":
                        numVacantes = 5;
                        break;
                    case "CCSC-05":
                        numVacantes = 5;
                        break;
                    case "CCSC-06":
                        numVacantes = 5;
                        break;
                    case "CFSM-01":
                        numVacantes = 5;
                        break;
                    case "CFSM-02":
                        numVacantes = 5;
                        break;
                    case "CFSM-03":
                        numVacantes = 5;
                        break;
                    case "CFSM-04":
                        numVacantes = 5;
                        break;
                    case "CCEE-01":
                        numVacantes = 6;
                        break;
                    case "CCEE-02":
                        numVacantes = 5;
                        break;
                    case "CCEE-03":
                        numVacantes = 5;
                        break;
                    case "DOCP-01":
                        numVacantes = 5;
                        break;
                    case "DOCP-02":
                        numVacantes = 5;
                        break;
                    case "INGN-01":
                        numVacantes = 5;
                        break;
                    case "INGN-02":
                        numVacantes = 5;
                        break;
                    case "INGN-03":
                        numVacantes = 5;
                        break;
                    case "INGN-04":
                        numVacantes = 5;
                        break;
                    case "INGN-05":
                        numVacantes = 5;
                        break;
                    case "INGN-06":
                        numVacantes = 5;
                        break;
                    case "INGN-07":
                        numVacantes = 5;
                        break;
                    case "INGN-08":
                        numVacantes = 5;
                        break;
                    case "CCAG-01":
                        numVacantes = 5;
                        break;
                    case "CCAG-02":
                        numVacantes = 5;
                        break;
                    case "CCAG-03":
                        numVacantes = 5;
                        break;
                    case "CCAG-04":
                        numVacantes = 5;
                        break;
                    default:
                        break;
                }
                break;
            case "MODD-03":
                switch (getCodigoCarrera()) {
                    case "CBIO-01":
                        numVacantes = 1;
                        break;
                    case "CBIO-02":
                        numVacantes = 1;
                        break;
                    case "CBIO-03":
                        numVacantes = 1;
                        break;
                    case "CBIO-04":
                        numVacantes = 2;
                        break;
                    case "CBIO-05":
                        numVacantes = 2;
                        break;
                    case "CBIO-06":
                        numVacantes = 2;
                        break;
                    case "EDCC-01":
                        numVacantes = 0;
                        break;
                    case "EDCC-02":
                        numVacantes = 0;
                        break;
                    case "EDCC-03":
                        numVacantes = 5;
                        break;
                    case "EDCC-04":
                        numVacantes = 1;
                        break;
                    case "SLUD-01":
                        numVacantes = 2;
                        break;
                    case "SLUD-02":
                        numVacantes = 0;
                        break;
                    case "SLUD-03":
                        numVacantes = 1;
                        break;
                    case "CCSC-01":
                        numVacantes = 1;
                        break;
                    case "CCSC-02":
                        numVacantes = 1;
                        break;
                    case "CCSC-03":
                        numVacantes = 0;
                        break;
                    case "CCSC-04":
                        numVacantes = 1;
                        break;
                    case "CCSC-05":
                        numVacantes = 0;
                        break;
                    case "CCSC-06":
                        numVacantes = 1;
                        break;
                    case "CFSM-01":
                        numVacantes = 1;
                        break;
                    case "CFSM-02":
                        numVacantes = 1;
                        break;
                    case "CFSM-03":
                        numVacantes = 1;
                        break;
                    case "CFSM-04":
                        numVacantes = 1;
                        break;
                    case "CCEE-01":
                        numVacantes = 2;
                        break;
                    case "CCEE-02":
                        numVacantes = 2;
                        break;
                    case "CCEE-03":
                        numVacantes = 2;
                        break;
                    case "DOCP-01":
                        numVacantes = 2;
                        break;
                    case "DOCP-02":
                        numVacantes = 1;
                        break;
                    case "INGN-01":
                        numVacantes = 2;
                        break;
                    case "INGN-02":
                        numVacantes = 1;
                        break;
                    case "INGN-03":
                        numVacantes = 1;
                        break;
                    case "INGN-04":
                        numVacantes = 1;
                        break;
                    case "INGN-05":
                        numVacantes = 1;
                        break;
                    case "INGN-06":
                        numVacantes = 1;
                        break;
                    case "INGN-07":
                        numVacantes = 1;
                        break;
                    case "INGN-08":
                        numVacantes = 1;
                        break;
                    case "CCAG-01":
                        numVacantes = 1;
                        break;
                    case "CCAG-02":
                        numVacantes = 1;
                        break;
                    case "CCAG-03":
                        numVacantes = 1;
                        break;
                    case "CCAG-04":
                        numVacantes = 1;
                        break;
                    default:
                        break;
                }
                break;
            case "MODD-04":
                switch (getCodigoCarrera()) {
                    case "CBIO-01":
                        numVacantes = 10;
                        break;
                    case "CBIO-02":
                        numVacantes = 8;
                        break;
                    case "CBIO-03":
                        numVacantes = 10;
                        break;
                    case "CBIO-04":
                        numVacantes = 14;
                        break;
                    case "CBIO-05":
                        numVacantes = 18;
                        break;
                    case "CBIO-06":
                        numVacantes = 16;
                        break;
                    case "EDCC-01":
                        numVacantes = 7;
                        break;
                    case "EDCC-02":
                        numVacantes = 7;
                        break;
                    case "EDCC-03":
                        numVacantes = 44;
                        break;
                    case "EDCC-04":
                        numVacantes = 8;
                        break;
                    case "SLUD-01":
                        numVacantes = 18;
                        break;
                    case "SLUD-02":
                        numVacantes = 3;
                        break;
                    case "SLUD-03":
                        numVacantes = 14;
                        break;
                    case "CCSC-01":
                        numVacantes = 8;
                        break;
                    case "CCSC-02":
                        numVacantes = 8;
                        break;
                    case "CCSC-03":
                        numVacantes = 4;
                        break;
                    case "CCSC-04":
                        numVacantes = 9;
                        break;
                    case "CCSC-05":
                        numVacantes = 6;
                        break;
                    case "CCSC-06":
                        numVacantes = 8;
                        break;
                    case "CFSM-01":
                        numVacantes = 10;
                        break;
                    case "CFSM-02":
                        numVacantes = 9;
                        break;
                    case "CFSM-03":
                        numVacantes = 10;
                        break;
                    case "CFSM-04":
                        numVacantes = 12;
                        break;
                    case "CCEE-01":
                        numVacantes = 18;
                        break;
                    case "CCEE-02":
                        numVacantes = 18;
                        break;
                    case "CCEE-03":
                        numVacantes = 18;
                        break;
                    case "DOCP-01":
                        numVacantes = 18;
                        break;
                    case "DOCP-02":
                        numVacantes = 7;
                        break;
                    case "INGN-01":
                        numVacantes = 18;
                        break;
                    case "INGN-02":
                        numVacantes = 9;
                        break;
                    case "INGN-03":
                        numVacantes = 8;
                        break;
                    case "INGN-04":
                        numVacantes = 8;
                        break;
                    case "INGN-05":
                        numVacantes = 7;
                        break;
                    case "INGN-06":
                        numVacantes = 6;
                        break;
                    case "INGN-07":
                        numVacantes = 6;
                        break;
                    case "INGN-08":
                        numVacantes = 7;
                        break;
                    case "CCAG-01":
                        numVacantes = 9;
                        break;
                    case "CCAG-02":
                        numVacantes = 8;
                        break;
                    case "CCAG-03":
                        numVacantes = 8;
                        break;
                    case "CCAG-04":
                        numVacantes = 8;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return numVacantes;
    }
}
