/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al
 * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
 * buscará el perro en la lista. Si el perro está en la lista, se eliminará el
 * perro que ingresó el usuario y se mostrará la lista ordenada. Si el perro no
 * se encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 *
 * @author invitado
 */
public class G10EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

//Continuando el ejercicio anterior, después de mostrar los perros, 
//* al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, 
//* se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario
//* y se mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//* y se mostrará la lista ordenada.
        Iterator<String> it = razaDePerros.iterator();
        int contador = 0;
        System.out.println("Ingrese la raza que desea eliminar: ");
        String palabra = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(palabra)) {
                it.remove();
                contador += 1;
                break;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontró esa raza");
        }
        System.out.println(razaDePerros);
    }
}
