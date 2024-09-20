package nespresso;

import java.util.Scanner;
import nespresso.entidades.Cafetera;
import nespresso.servicios.CafeteraServicio;

public class Nespresso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio cs1 = new CafeteraServicio();
        Cafetera cafetera1 = cs1.crearCafetera();
        System.out.println("");
        System.out.println("Llenamos la cafetera:");
        cs1.llenarCafetera();
        System.out.println("");
        
        System.out.println("¿De cuánto es la taza que quiere llenar?");
        int cantidad = scanner.nextInt();
        cs1.servirTaza(cantidad);
        System.out.println("");

        System.out.println("Vaciamos la cafetera:");
        cs1.vaciarCafetera();
        System.out.println("");
        
        System.out.println("¿Cuánto quiere cargar en la cafetera?");
        cantidad = scanner.nextInt();
        cs1.agregarCafe(cantidad);
        System.out.println("");

    }
    
}
