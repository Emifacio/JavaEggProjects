/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author invitado
 */
public class G10Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.

        ArrayList<String> razaDePerros = new ArrayList<>();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("Ingrese el tipo de raza : ");
            String tipoRaza = leer.next();

            razaDePerros.add(tipoRaza);

            System.out.println("Desea seguir ingresando razas?: ");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
        System.out.println(razaDePerros.toString());
    }
}
