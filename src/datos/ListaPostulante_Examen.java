/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Examen;
import entidades.Postulante_Examen;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class ListaPostulante_Examen {

    private ArrayList<Postulante_Examen> L;

    public ListaPostulante_Examen() {
        L = new ArrayList<Postulante_Examen>();
    }

    public void agregar(Postulante_Examen e) {
        L.add(e);
    }

    // el indexOf busca usando el equals de las clases
    public int buscar(Examen e) {
        return L.indexOf(e);
    }

    public void eliminar(int i) {
        L.remove(i);
    }

    public Postulante_Examen getElemento(int i) {
        return L.get(i);
    }

    public int getN() {
        return L.size();
    }

    public void inserta(int i, Postulante_Examen e) {
        L.add(i, e);
    }

    public void reemplaza(int i, Postulante_Examen e) {
        L.set(i, e);
    }

    public ArrayList<Postulante_Examen> getL() {
        return L;
    }

    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[L.size()][4];
        String titulos[] = {"ID EXAMEN", "Numero De Buenas", "Número de Malas", "Orden de Mérito"};

        for (int i = 0; i < L.size(); i++) {
            Postulante_Examen x = L.get(i);
            datos[i][0] = x.getExamen().getIdExamen();
            datos[i][1] = x.getNumBuenas();
            datos[i][2] = x.getNumMalas();
            datos[i][3] = x.getOrdenMerito();
        }
        modelo.setDataVector(datos, titulos);
    }
}
