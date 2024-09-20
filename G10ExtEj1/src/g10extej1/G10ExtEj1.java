/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10extej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class G10ExtEj1 {

    /**
     * 1. Diseñar un programa que lea una serie de valores numéricos enteros
     * desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura
     * de números termina cuando se introduzca el valor -99. Este valor no se
     * guarda en el ArrayList. A continuación, el programa mostrará por pantalla
     * el número de valores que se han leído, su suma y su media (promedio).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numero = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i = 0;
        int choice;
        Integer suma = 0;

        do {

            System.out.println("ingrese un numero");
            Integer number = leer.nextInt();
            if (number!= -99) {
                

                numero.add(number);
                suma += number;
                i++;
               
          
                System.out.println("Desea ingresar otro numero? ");
                System.out.println("1-Si");
                System.out.println("0-No");

                choice = leer.nextInt();
                }else{choice=0;
                
                }
                 while (choice != 0 && choice != 1) {
                    System.out.println("El valor ingresado no corresponde a ninguna opcion posible, intente nuevamente. ");
                    choice = leer.nextInt();
                }
                //leer.next();
            
            }
            while (choice != 0);
        
              System.out.println(numero.toString());
            System.out.println("La suma de los numero cargados es: " + suma);
            System.out.println("El promedio de los elementos ingresados es: " + suma / i);
        
        }
        }
        


    
