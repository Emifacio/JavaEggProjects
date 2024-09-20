/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.del.manual;

import ejercicio01.del.manual.entidades.Dni;
import ejercicio01.del.manual.entidades.Persona;

/**
 *
 * @author invitado
 */
public class EJERCICIO01DELMANUAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni dni = new Dni();
        Dni dni2 = new Dni();
        dni2.setSerie("LC");
        dni2.setNumero(18326598);
        dni.setSerie("LC");
        dni.setNumero(30555222);
        Persona persona = new Persona();
        persona.setNombre("Alberto");
        persona.setApellido("Rodriguez");
        persona.setDni(dni);
        Persona persona2 = new Persona();
        persona2.setNombre("Nicolas");
        persona2.setApellido("Martinez");
        persona2.setDni(dni2);
        
        System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Tipo: " + persona.dni.serie + " Numero: " + persona.dni.numero);
        System.out.println("Nombre: " + persona2.getNombre() + " Apellido: " + persona2.getApellido() + " Tipo: " + persona2.dni.getSerie() + " Numero: " + persona2.dni.numero);
    }
    
}
