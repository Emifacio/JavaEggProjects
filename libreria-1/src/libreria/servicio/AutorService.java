/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.*;
import libreria.persistencia.*;
/**
 *Esta clase tiene la responsabilidad de llevar adelante las funcionalidades 
 * necesarias para administrar editoriales (consulta, creación, modificación y eliminación)
 * @author Emiliano
 */
public class AutorService {
    
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        AutorDAO adao = new AutorDAO();
        
        public void consultarAutor() {
            System.out.println("Ingrese ID de autor a consultar");
            Integer id = input.nextInt();
           Autor a1 = adao.buscarPorID(id);
            System.out.println(a1.toString());
      }
        
public void crearAutor () { 

   Autor a1 = new Autor () ;
    System.out.println("Creando un nuevo autor en la base de datos...");
    System.out.println("Ingrese el Nombre: ");
    String nombreAutor = input.next();
       a1.setNombre(nombreAutor);
    a1.setAlta(Boolean.TRUE);
    adao.guardar(a1);
  
  
}

public void modificarAutor () { 
    
    System.out.println("Ingrese el Id del autor que desea modificar: ");
   Integer id = input.nextInt();
    Autor a1= adao.buscarPorID(id);
    System.out.println("Ingrese el nuevo nombre: ");
    String nuevoNombre = input.next();
    a1.setNombre(nuevoNombre);
    adao.editar(a1);
}
public void eliminarAutor() { 
    
    System.out.println("Ingrese el ID del autor a eliminar: ");
    Integer id= input.nextInt();
    Autor a1= adao.buscarPorID(id);
    adao.eliminar(a1);

}
public void listaAutores (){
   
  adao.listaAutor();
}
    public  void buscarPorNombre(){
        System.out.println("Ingrese el nombre del autor a buscar : ");
   String nombreAutor= input.next();
   List <Autor> a1= adao.buscarPornombre(nombreAutor);
        for (Autor autor : a1) {
            System.out.println(a1);
        }
   System.out.println(a1);
    }

   
   }

