/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;


/**
 * Esta clase tiene la responsabilidad de llevar adelante las funcionalidades
 * necesarias para administrar autores (consulta, creación, modificación y
 * eliminación).
 *
 *
 *
 * @author Emiliano
 */
public class LibroService {

    public LibroService() {
    }

    Scanner input = new Scanner(System.in).useDelimiter("\n");
   AutorService as = new AutorService();
    EditorialService es = new EditorialService();
    LibroDAO ldo=new LibroDAO();


    public Libro consultarLibro(Long id) throws NullPointerException {
        Libro l1 = ldo.buscar(id);
        return l1;
    }

    public void crearLibro() throws NullPointerException, Exception {
        Libro libro1 = new Libro();
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Creando un nuevo libro en la base de datos...");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el Titulo: ");
        System.out.println("--------------------------------------");
        String nombreLibro = input.next();
        libro1.setTitulo(nombreLibro);
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el año de publicación: ");
        System.out.println("--------------------------------------");
        Integer anioLibro = input.nextInt();
        libro1.setAnio(anioLibro);
        System.out.println("--------------------------------------");
        System.out.println("Ingrese la cantidad de Ejemplares de la edición: ");
        System.out.println("--------------------------------------");
        Integer cantEjemp = input.nextInt();
        libro1.setEjemplares(cantEjemp);
        libro1.setAlta(Boolean.TRUE);
       // libro1.setAutor(as.crearAutor());
        libro1.setEditoria(es.crearEditorial());
        ldo.crearLibro(libro1);
        System.out.println("--------------------------------------");
        System.out.println("El nuevo ingreso se ha registrado correctamente...");
        System.out.println("--------------------------------------");
    }

    public void libroPrestado(Libro libro){
        libro.setEjemplares_prestados(libro.getEjemplares_prestados()+1);
        libro.setEjemplares_restantes(libro.getEjemplares_restantes()-1);
        Date fechaPrestamo= new Date();
        ldo.editar(libro);
    }
    
    public void libroDevuelto(Libro libro){
           libro.setEjemplares_prestados(libro.getEjemplares_prestados()-1);
        libro.setEjemplares_restantes(libro.getEjemplares_restantes()+1);
         Date fechaDevolucion= new Date();
               ldo.editar(libro);
    }
    public void modificarTituloLibro() throws NullPointerException, Exception {
        System.out.println("--------------------------------------");
        System.out.println("Indique el ISBN del libro a modificar.");
        System.out.println("--------------------------------------");
        Long ISBN = input.nextLong();
        Libro l1 = ldo.buscar(ISBN);
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el nuevo Titulo: ");
        System.out.println("--------------------------------------");
        String nuevoTitulo = input.next();
        l1.setTitulo(nuevoTitulo);
        ldo.editar(l1);
    }

    public void eliminarLibro() throws NullPointerException, Exception {
        System.out.println("--------------------------------------");
        System.out.println("Indique el ISBN del libro a eliminar.");
        System.out.println("--------------------------------------");
        Long ISBN = input.nextLong();
        Libro l1 = ldo.buscar(ISBN);
        ldo.eliminar(l1);
    }

    public void buscarLibroPorNomAut() throws NullPointerException {
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el autor para buscar sus libros: ");
        System.out.println("--------------------------------------");
        String nombreAutor = input.next();
        List<Libro> libro;
        libro = ldo.buscarLibroPorNombreDeAutor(nombreAutor);
        for (Libro libro1 : libro) {
            System.out.println(libro1);
        }
    }

    public void buscarPorEditorial() throws Exception {
        ldo.listarTodos();
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el nombre de la Editorial");
        System.out.println("--------------------------------------");
        String nombre = input.next();
        List<Libro> libros = ldo.listarTodos();
        for (Libro libro : libros) {
            if (libro.getEditoria().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(libro);
            }
        }
    }
     public void listarLibros(){
 
            List<Libro>listaLibros = ldo.listarTodos();
            System.out.println(listaLibros);
      
     }

    public void showMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("===============");
        System.out.println("     MENU      ");
        System.out.println("===============");
        System.out.println("Bienvenido al sistema de consulta y modificacion de libros en la DB. Elija una opcion: ");
        System.out.println("1- Ingrese un nuevo libro");
        System.out.println("2- Modifique  el titulo de un libro por ISBN");
        System.out.println("3- Elimine un libro de la base de datos por ISBN");
        System.out.println("4- Busque un libro por nombre de autor");
        System.out.println("5- Busque un libro por editorial ");
        System.out.println("6- Pida prestado un libro.");
        System.out.println("7- Devuelva un libro.");
        System.out.println("8 - Salir");
        System.out.println("Ingrese un valor y luego presione la tecla enter.");
        System.out.println("");
        System.out.println("");
    }

    public void menu() throws NullPointerException, Exception {
        LibroService ls = new LibroService();
        Scanner leer = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    ls.crearLibro();
                    break;
                case 2:
                    ls.modificarTituloLibro();
                    break;
                case 3:
                    ls.eliminarLibro();
                    break;
                case 4:
                    ls.buscarLibroPorNomAut();
                    break;
                case 5:
                   ls.buscarPorEditorial();
                    break;
                case 6:
                   // ps.crearPrestamo();
                case 7:
                 //   ps.devolverPrestamo();
                case 8:
                    System.out.println("----------------");
                    System.out.println("Saliendo del menu");
                    System.out.println("----------------");
                   
                    
            }
        } while (choice != 8);
        System.out.println("---------------------------------------------");
        System.out.println("Muchas gracias por utilizar el sistema de base de datos de Libros.");
        System.out.println("---------------------------------------------");
    }
}
