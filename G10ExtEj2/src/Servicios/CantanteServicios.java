/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 * @author invitado
 */
public class CantanteServicios {
    
    public CantanteServicios() {
    }
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<CantanteFamoso>lcf= new ArrayList<CantanteFamoso>();


  
    
    public  CantanteFamoso crearCantante(){
        
        System.out.println("Ingrese el nombre del cantante:"); 
        String cantante1= leer.next();
        cf.setNombre(cantante1);
        System.out.println("Ingrese el nombre del disco mas popular del cantante");
        String discoPopular1= leer.next();
        cf.setDiscoConMasVentas(discoPopular1);
        lcf.add(cf);      
        
        return CantanteFamoso();
        
                }
        public void agregaCantante(CantanteFamoso cf1){
            lcf.add(cf);            
            
        }
       
}
