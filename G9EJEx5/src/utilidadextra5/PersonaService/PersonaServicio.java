/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
mplemente la clase Persona en el paquete entidades. Una persona tiene 
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de
la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el 
atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna 
true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 * and open the template in the editor.
 */
package utilidadextra5.PersonaService;

import java.util.Date;
import java.util.Scanner;
import utilidadextra5.Entidades.Persona;

/**
 *
 * @author invitado
 */

//Crear una clase PersonaService,en el paquete servicio
public class PersonaServicio {

  public Persona persona; 
  private Date fechaNacimiento = new Date();
  private String name;
  Scanner leer = new Scanner(System.in).useDelimiter("\n");

/*con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de
la persona a crear. Retornar el objeto Persona creado.*/

public Persona crearPersona(String name, Date fechaNacimiento) {

this.name = name;
this.fechaNacimiento = fechaNacimiento;  
return null;
}

 public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String name1 = sc.nextLine();

        System.out.print("Ingrese la fecha de nacimiento: ");
        Date fechaNacimiento1= fechaNacimiento();
         
        return persona;
       
    }

         public Date fechaNacimiento(){
        
        System.out.println("Ingrese año, mes y día de su nacimiento");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() -1;
        int dia = leer.nextInt();
        Date nacimiento = new Date(anio, mes, dia);
        
        return nacimiento;
        
}
         public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
         public int diferencia(Date fechaActual, Date nacimiento){
        int diferencia = fechaActual.getYear() - nacimiento.getYear();
        return diferencia;
        
    }
         /*Método menorQue recibe como parámetro una Persona y una edad. Retorna 
true si la persona es menor que la edad consultada o false en caso contrario.*/
         public boolean menorQue(Persona persona, Date edad ) { 
            
    Date nacimiento = persona.getFechaNacimiento();
    
    nacimiento= fechaNacimiento();
    Date diferencia = edad.getTime() -nacimiento;
    
    return edadEnAnios < 0;
             
             return menorQue();
         }
}