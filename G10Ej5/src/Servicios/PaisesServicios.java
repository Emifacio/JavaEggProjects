package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * 5. Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author invitado
 */
public class PaisesServicios {

    HashSet<String> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPaises() {
        String decision;
        do {
            System.out.println("Ingrese un pais: ");
            paises.add(leer.next());
            System.out.println("Desea continuar ingresando?");
            decision = leer.next();
        } while (!"n".equalsIgnoreCase(decision));
    }

    public void mostrarPaises() {
        System.out.println("Mostrando los paises....");
        for (String aux : paises) {
            System.out.println(aux);

        }
    }
    public TreeSet<String>ordenarPaises() {
       TreeSet<String> countries = new TreeSet<>();
        System.out.println("....Ordenando los paises alfabeticamente.... ");
        for (String aux : paises) {
            
            countries.add(aux);
        }
        System.out.println("Presione cualquier tecla y enter para continuar....");
        String tecla = leer.next();
        //System.out.println("Mostrando los paises ordenados alfabeticamente.....");
        
        return countries;
    }

 public void mostrarCountries(TreeSet<String>countries) {
        System.out.println("Mostrando los paises....");
       for (String aux : countries) {
            System.out.println(aux);

        }
    }
    public void pedirPais() {
        String resp;
        boolean encontrado = false;

        System.out.println("Ingrese el pais que quiere buscar: ");
        resp = leer.next();
        Iterator<String> recorrido = paises.iterator();
        while (recorrido.hasNext()) {
            if (recorrido.next().equalsIgnoreCase(resp)) {
                recorrido.remove();
                encontrado = true;
                System.out.println("se ha eliminado el pais:" + resp);
                System.out.println("La lista de paises se ha actualizado de la siguiente manera: ");
                mostrarPaises();
            }
        }

    }

}
