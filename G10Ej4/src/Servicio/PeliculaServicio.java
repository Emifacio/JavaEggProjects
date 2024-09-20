/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * *En el servicio deberemos tener un bucle que crea un objeto 
* Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
* • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author invitado
 */
public class PeliculaServicio {
    
    Scanner leer;
    ArrayList<Pelicula> listaPelicula;
    Pelicula peliculaCreada; 
    

    
    public Pelicula creaPelicula(){
        leer=new Scanner(System.in).useDelimiter("\n");
        peliculaCreada =new Pelicula(titulo, director, 0);
        listaPelicula = new ArrayList<>();
        do { 
             System.out.println("Ingrese el nombre de la pelicula: ");
        String titulo = leer.next();
        peliculaCreada.
            System.out.println("Ingrese el nombre del director de la pelicula: ");
        String director = leer.next();
        
        ArrayList <Double> listaDuracionHoras= new ArrayList<>();
        System.out.println("Ingrese la duracion de la pelicula en horas: ");
        double duracionHoras = leer.nextDouble();
        listaDuracionHoras.add(duracionHoras);
        System.out.println("Desea seguir ingresando peliculas?: ");
            String opcion = leer.next();
            System.out.println(listaPelicula);
            if (opcion.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
       
    return new Pelicula();
     }
    public void addPelicula (Pelicula pelicula){
        listaPelicula.add(pelicula);
        
    }
    public void mostrarPelicula () {
        System.out.println("Las peliculas ingresadas son: ");
          for (Pelicula aux : listaPelicula) {
            System.out.println(aux.toString());
        }
        System.out.println(listaPelicula.size());
    }
//     public void masDeUnaHora (){
//        
//for (int i = 0; i < listaPelicula.size(); i++) {
//    Pelicula listaPeliculas = listaPelicula.get(i);
//            for (int j = 0; j < listaPeliculas.(); j++) {
//        
//    }
//  double notaFinal= sumaAlumno/listaAlumno.size();
//    System.out.println("La nota final del alumno " + listaAlumno.get(i).getNombre() + " es: " + notaFinal);
//}
//    }
    }
    
       


