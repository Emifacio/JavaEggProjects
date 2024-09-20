/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadextra5;

import java.util.Date;
import utilidadextra5.PersonaService.PersonaServicio;

/**
 *
 * @author invitado
 */
public class UtilidadExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Método calcularEdad que calcule la edad del usuario utilizando el 
atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna 
true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.*/
        
        PersonaServicio ps = new PersonaServicio();
        
        Date nac = ps.fechaNacimiento();
        System.out.println(nac);
        
        Date act = ps.fechaActual();
        System.out.println(act);
        
        /*Método calcularEdad que calcule la edad del usuario utilizando el 
atributo de fecha de nacimiento y la fecha actual.*/
        System.out.println("La diferencia es de: " + ps.diferencia(act, nac) + " años.");
    }
}
    

