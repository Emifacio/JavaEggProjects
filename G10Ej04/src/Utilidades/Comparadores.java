/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author invitado
 */
public class Comparadores {

// * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
// * • Ordenar laspelículas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
    public static Comparator<Peliculas> duracionMayAmen = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDuracionHoras().compareTo(o2.getDuracionHoras());
        }
    };
     public static Comparator<Peliculas> duracionMenMay = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o2.getDuracionHoras().compareTo(o1.getDuracionHoras());
        }
    };
    public static Comparator<Peliculas> alfabeticaTitulos = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
// * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
        }
    };
      public static Comparator<Peliculas> alfabeticaDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
        };
// * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
}