/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej04;

import Servicio.PeliculasServicio;

/**
 *
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
* Para esto, tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
* Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos 
* y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
 * @author invitado
 */
public class G10Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      PeliculasServicio a = new PeliculasServicio();
      a.creaPelicula();
      System.out.println(" ");
      a.mostrarPelicula();
      System.out.println(" ");
     a.masDeUnaHora();
     System.out.println(" ");
     a.OrdenaDuracion();
     System.out.println(" ");
     a.OrdenaDuracionMenMay();
     System.out.println(" ");
     a.OrdenaTitulo();
        System.out.println(" ");
     a.OrdenaDirector();
     
    }
    
}
