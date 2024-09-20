/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Peliculas;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * • Ordenar laspelículas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 *
 * @author invitado
 */
public class PeliculasServicio {

    Scanner leer;
    ArrayList<Peliculas> listaPelicula;

    public PeliculasServicio() {
    }

    public PeliculasServicio(Scanner leer, ArrayList<Peliculas> listaPelicula) {
        this.leer = leer;
        this.listaPelicula = listaPelicula;
    }
    public Peliculas peliculaNueva;

//    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos 
//* y guardándolos en el objeto Pelicula.
    public Peliculas creaPelicula() {
        peliculaNueva = new Peliculas();
        listaPelicula = new ArrayList<>();
        leer = new Scanner(System.in).useDelimiter("\n");
        String opcion;
        do {
            System.out.println("Ingrese el nombre de la pelicula: ");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director de la pelicula: ");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula en horas: ");
            double duracionHoras = leer.nextDouble();
            Peliculas pelicula = new Peliculas(titulo, director, duracionHoras);
            listaPelicula.add(pelicula);
            System.out.println("Desea seguir ingresando peliculas?S/N: ");
            opcion = leer.next();
            } while (opcion.equalsIgnoreCase("S"));

        return peliculaNueva;
    }

    public void mostrarPelicula() {
        System.out.println("Las peliculas ingresadas son: ");
        for (Peliculas aux : listaPelicula) {
            System.out.println(aux.toString());
        }
        System.out.println(listaPelicula.size());
    }

    public void masDeUnaHora() {
        System.out.println("............Buscando en el sistema.......");
        for (int i = 0; i < listaPelicula.size(); i++) {
            Double duracionHoras = listaPelicula.get(i).getDuracionHoras();
            if (duracionHoras > 1) {
                System.out.println("[" + listaPelicula.get(i) + "] dura:" + listaPelicula.get(i).getDuracionHoras() + "Hs.");
            }
        }
        System.out.println("........Busqueda finalizada........");
    }

       public  void OrdenaDuracion(){
           
           Collections.sort (listaPelicula, Comparadores.duracionMayAmen );
              //  System.out.println(listaPelicula.toString());
           for (Peliculas aux : listaPelicula) {
               System.out.println(aux);
           }
             
       }
          public  void OrdenaTitulo(){
           
           Collections.sort (listaPelicula, Comparadores.alfabeticaTitulos );
         //  System.out.println(listaPelicula.toString());
           for (Peliculas aux : listaPelicula) {
               System.out.println(aux);
           }
       }
     
     
   public  void OrdenaDirector(){
           
           Collections.sort (listaPelicula, Comparadores.alfabeticaDirector );
         //  System.out.println(listaPelicula.toString());
           for (Peliculas aux : listaPelicula) {
               System.out.println(aux);
           }
       }

    public  void OrdenaDuracionMenMay(){
           
           Collections.sort (listaPelicula, Comparadores.duracionMenMay );
              //  System.out.println(listaPelicula.toString());
           for (Peliculas aux : listaPelicula) {
               System.out.println(aux);
           }
    }
}
    
    

