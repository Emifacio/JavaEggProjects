package nespresso.servicios;

import java.util.Scanner;
import nespresso.entidades.Cafetera;

public class CafeteraServicio {
    private Scanner scanner = new Scanner(System.in);
    private Cafetera cafetera;
    
    public Cafetera crearCafetera() {
        System.out.println("¿Cuál es la capacidad máxima de la cafetera?");
        int capacidadMaxima = scanner.nextInt();
        
        cafetera = new Cafetera(capacidadMaxima, 0);
        return cafetera;
    }
    
    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la 
    capacidad máxima. */
    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());        
        System.out.println(cafetera.toString());
    }
    
    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método 
    recibe el tamaño de la taza y simula la acción de servir la taza con la 
    capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
    la taza, se sirve lo que quede. El método le informará al usuario si se 
    llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.*/
    public void servirTaza(int cantidad) {
        if (cafetera.getCantidadActual() < cantidad) {
            System.out.println("La taza no se llenó.");
            System.out.println("En la taza hay " + cafetera.getCantidadActual() + " ml.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("La taza se llenó.");
            System.out.println("En la taza hay " + cantidad + " ml.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidad);
        }
        System.out.println(cafetera.toString());
    }
    
    /*Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println(cafetera.toString());
    }
    
    /*Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
    método lo recibe y se añade a la cafetera la cantidad de café indicada.*/
    public void agregarCafe(int cantidad) {
        if (cantidad + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        }
        System.out.println(cafetera.toString());
    }
}
