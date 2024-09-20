package libreria.servicio;


import java.util.Date;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;



/**
 *
 * @author Emiliano
 */
public class PrestamoService {
    Scanner leer;
    LibroService ls;
    LibroDAO ldao;


    public PrestamoService() {
        this.ldao = new LibroDAO();
        this.ls = new LibroService();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearPrestamo(){
        ls.listarLibros();
        System.out.println("--------------------------------------");
        System.out.println("Indique el ISBN del libro que desea pedir prestado: ");
        System.out.println("--------------------------------------");
        Long ISBN= leer.nextLong();
        Libro l1=ldao.buscar(ISBN);
        Date fecha = new Date();
        System.out.println("--------------------------------------");
        System.out.println("Ingrese su numero de cliente: ");
        System.out.println("--------------------------------------");
        Integer idCliente= leer.nextInt();
              }
    
    public void consultarPrestamo(){
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el ID del prestamo que desea consultar: ");   
        System.out.println("--------------------------------------");
        Integer idPrestamo= leer.nextInt();
  }
    
    public void devolverPrestamo(){
       System.out.println("--------------------------------------");
        System.out.println("Ingrese el ID del prestamo que desea devolver: ");   
      System.out.println("--------------------------------------");
        Integer idPrestamo= leer.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("Se ha registrado su devolución. Muchas gracias.");    
        System.out.println("--------------------------------------");
    }
    
    public void modificarPrestamo(){
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el ID del prestamo que desea modificar: ");
        System.out.println("--------------------------------------");
        Integer IdPrestamo= leer.nextInt();
      
    }
    public void eliminarPrestamo(){
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el ID del prestamo que desea eliminar: ");
        System.out.println("--------------------------------------");
        Integer idElimina= leer.nextInt();
        System.out.println("---------------------------------");
        System.out.println("El prestamo indicado ha sido eliminado.");
        System.out.println("---------------------------------");
    }

}
    
    
    

