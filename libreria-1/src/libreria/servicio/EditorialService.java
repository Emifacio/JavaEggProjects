/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicio;

import java.util.Scanner;
import libreria.entidades.*;
import libreria.persistencia.*;

/**
 * Esta clase tiene la responsabilidad de llevar adelante las funcionalidades
 * necesarias para administrar libros (consulta, creación, modificación y
 * eliminación).
 *
 * @author Emiliano
 */
public class EditorialService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    EditorialDAO edao = new EditorialDAO();

    public void consultarEditorial() {
        System.out.println("Ingrese el ID de la Editorial a consultar: ");
        Integer id = input.nextInt();
        Editorial e1 = edao.buscar(id);
        System.out.println(e1.toString());
    }

    public Editorial crearEditorial() {
        Editorial e1 = new Editorial();
        System.out.println("Usted esta creando una nueva editorial en la base de datos...");
        System.out.println("Ingrese el nombre de la nueva editorial: ");
        String nombreEdit = input.next();
        e1.setNombre(nombreEdit);
        e1.setAlta(Boolean.TRUE);
        edao.cargarEditorial(e1);
        System.out.println("Se ha creado la nueva editorial en la base de datos.");
        return e1;
    }

    public void modificarEditorial() {
        System.out.println("Ingrese el ID de la editorial que desea modificar: ");
        Integer id = input.nextInt();
        Editorial e1 = edao.buscar(id);
        System.out.println("Ingrese el nuevo nombre de la editorial: ");
        String nuevoNombre = input.next();
        e1.setNombre(nuevoNombre);
        edao.editar(e1);
        System.out.println("Se ha realizado la modificacion.");
    }

    public void eliminarEditorial() {
        System.out.println("Ingrese el ID de la editorial a eliminar: ");
        Integer id = input.nextInt();
        Editorial e1 = edao.buscar(id);
        edao.eliminar(e1);
        System.out.println("Se ha eliminado la editorial seleccionada.");

    }

    
}
