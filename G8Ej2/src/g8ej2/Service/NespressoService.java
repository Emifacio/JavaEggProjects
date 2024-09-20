/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8ej2.Service;

import g8ej2.Entities.Nespresso;
import java.util.Scanner;

/**
 *Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
* y simula la acción de servir la taza con la capacidad indicada. 
* Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
* El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, 
* el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 * @author invitado
 */
public class NespressoService {

        public NespressoService() {
        }
    
        //llamo al metodo Scanner y creo un objeto de la clase Nespresso
    
        public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
         public Nespresso cafetera = new Nespresso();
    
        //armo un metodo que me retorne la cafetera creada.. habra que ver si quiere que le pase los parametros.
        public Nespresso crearCafetera(){
        this.cafetera = new Nespresso();
        
        return cafetera;
        }
    
    

        public void capacidadMaxima(int max){
           
        cafetera.setCapacidadMaxima(max);
        System.out.println("Se ha establecido por defecto la capacidad maxima de la cafetera en " + max + "ml.");
        }
    
   
        public void llenarCafetera (){ 
        System.out.println("Usted esta llenando la cafetera....");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------"); 
        System.out.println("Cafetera llena.");
        }
    
    
    
        public void servirTaza(int taza){
        System.out.println("Ingrese el tamaño de la taza: ");
        taza = leer.nextInt();
        if (taza>cafetera.getCantidadActual()) { 
            System.out.println("La cantidad actual no alcanza a llenar la taza.");
            System.out.println("-----------Sirviendo taza--------------");
            System.out.println("La taza ha sido llenada " + cafetera.getCantidadActual() + "ml.");
            cafetera.setCantidadActual(0);
                    } else {
            System.out.println("......sirviendo taza....... ");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Su taza esta servida, que disfrute su cafe");
           System.out.println("---------------------------------------");
            System.out.println("La cantidad de cafe que queda disponible es: " + cafetera.getCantidadActual());
        }
        }
    
    
    
    public void vaciarCafetera (){ 
        System.out.println("Se vaciara la cafetera");
        cafetera.setCantidadActual(0);
        System.out.println("---------------------------------------"); 
        System.out.println("---------------------------------------"); 
        System.out.println("Cafetera vacia.");
        }
    
    
    
     public void agregarCafe(int agregar){
         System.out.println("Ingrese la cantidad de cafe para llenar su cafetera: ");
         agregar= leer.nextInt();
         
         if ((cafetera.getCantidadActual()+ agregar)>cafetera.getCapacidadMaxima()) { 
             System.out.println("Agregando cafe....");
             System.out.println("---------------------------------------"); 
             System.out.println("---------------------------------------"); 
         System.out.println("La cafetera se ha llenado.");
         } else {
                       System.out.println("Agregando cafe....");
             System.out.println("---------------------------------------"); 
             System.out.println("---------------------------------------"); 
             System.out.println("Se ha agregado la cantidad de cafe solicitada.");
             cafetera.setCantidadActual(agregar + cafetera.getCantidadActual());
             System.out.println("La cafetera ahora dispone de: " + cafetera.getCantidadActual() + "ml.");
         }
     }
}