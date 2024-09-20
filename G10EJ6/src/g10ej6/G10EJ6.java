/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej6;

import Servicio.TiendaServicio;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author invitado Ingreso el producto y se termina el programa...
 */
public class G10EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiendaServicio ts = new TiendaServicio();
        int opcion;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Bienvenido!");
            System.out.println("1 - Introducir Producto");
            System.out.println("2 - Modificar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            opcion = leer.nextInt();
            while (opcion>5||opcion<1) {                
                System.out.println("El numero ingresado no es correcto ingrese nuevamente...");
                opcion = leer.nextInt();
           }
            switch (opcion) {
                case 1:
                    ts.cargarTienda();
                    break;
                case 2:
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.eliminarProducto();
                    break;
                case 4:
                    ts.mostrarProductos();
                    break;
            }
            
        } while ( opcion!=5);

    }
    
}
