/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * *Se necesita una aplicación para una tienda en la cual queremos almacenar
 * los distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author invitado
 */
public class TiendaServicio {

    HashMap<String, Double> tienda = new HashMap<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarTienda() {
        System.out.println("Ingrese el nombre del producto: ");
        String producto = leer.next();
        System.out.println("ingrese el precio del producto: ");
        Double precio = leer.nextDouble();
        tienda.put(producto, precio);

    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto que desea modificar: ");
        String producto = leer.next();
        System.out.println("Ingrese el precio: ");
        Double precio = leer.nextDouble();
        tienda.put(producto, precio);

    }
//problema con el while del menu

    public void eliminarProducto() {
        System.out.println("Ingrese el producto que desea eliminar: ");
        String producto = leer.next();
        if (tienda.containsKey(producto)) {
            tienda.remove(producto);
            System.out.println("El producto fue eliminado....");
        } else {
            System.out.println("El producto no existe....");
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> aux : tienda.entrySet()) {
            System.out.println("Producto:" + aux.getKey());
            System.out.println("Precio:" + aux.getValue());
            System.out.println("----------------------");
        }
    }
    
}

   
            
        
        
       
        //    System.out.println (
        //
        //"Gracias por utilizar el software de almacenamiento de productos de Destreza Desing&Company.");

