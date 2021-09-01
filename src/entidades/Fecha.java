/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.*;

/**
 *
 * @author Zoraida Vidal
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int... fecha) {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dd, mm, aa;
        dd = fechaActual.get(Calendar.DAY_OF_MONTH);
        mm = fechaActual.get(Calendar.MONTH) + 1;
        aa = fechaActual.get(Calendar.YEAR);
        dia = fecha.length > 0 ? fecha[0] : dd;
        mes = fecha.length > 1 ? fecha[1] : mm;
        año = fecha.length > 2 ? fecha[2] : aa;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esBisiesto() {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }

    public boolean esValida() {
        int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean añoValido, mesValido, diaValido;
        añoValido = año >= 1900;
        mesValido = mes >= 1 && mes <= 12;
        if (mesValido) {
            switch (mes) {
                case 2:
                    if (esBisiesto()) {
                        diaValido = dia >= 1 && dia <= 29;
                    } else {
                        diaValido = dia >= 1 && dia <= diasPorMes[mes];
                    }
                    break;
                default:
                    diaValido = dia >= 1 && dia <= diasPorMes[mes];
            }
        } else {
            diaValido = false;
        }
        return diaValido && mesValido && añoValido;
    }

    public boolean esAntesQue(Fecha fecha) {
        int dia1 = fecha.getDia();
        int mes1 = fecha.getMes();
        int año1 = fecha.getAño();

        if (año < año1) {
//            System.out.println(año + "<" + año1);
            return true;
        } else if (año == año1) {
            if (mes < mes1) {
//                System.out.println(mes + "<" + mes1);
                return true;
            } else if (mes == mes1) {
                if (dia < dia1) {
//                    System.out.println(dia + "<" + dia1);
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return (getDia() <= 9 ? "0" + getDia() : getDia()) + "/"
                + (getMes() <= 9 ? "0" + getMes() : getMes()) + "/" + getAño();
    }
    public String toStringFormatSql() {
        return (getAño() + "-"
                + (getMes() <= 9 ? "0" + getMes() : getMes())+ "-"
                + (getDia() <= 9 ? "0" + getDia() : getDia()) 
                ) ;
    }
//    public static void main(String[] args) {
//        Fecha f = new Fecha(11,05,1995);
//        System.out.println(f.toStringFormatSql());
//        System.out.println(f.toString());
//    }

}
