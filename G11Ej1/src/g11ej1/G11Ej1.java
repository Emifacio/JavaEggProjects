/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11ej1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author invitado
 */
public class G11Ej1 {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases.
     * Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos:
     * nombre, apellido, edad, documento y Perro.
     *Ahora deberemos en el main crear dos Personas y dos Perros. 
     * Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, 
     * mostrar desde la clase Persona, la información del Perro y de la Persona.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Chiquito", "doberman", "grande");
              
        Perro perro2 = new Perro("filomena", "caniche", "chico");
        
        Persona persona1 = new Persona("Gabriel", "Facio", Integer.SIZE, Integer.SIZE, perro1);
        Persona persona2 = new Persona("Nicolas", "Aponte", Integer.SIZE, Integer.SIZE, perro2);
        
        System.out.println(persona1);
        System.out.println(persona2);
       
   
        
        
        
        
    }
    
}
