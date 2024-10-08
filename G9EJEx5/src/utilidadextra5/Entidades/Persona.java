/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadextra5.Entidades;

import java.util.Date;

/**
 *mplemente la clase Persona en el paquete entidades. Una persona tiene 
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
 * @author invitado
 */

//Implemente la clase Persona en el paquete entidades.
public class Persona {

//constructor vacío
    public Persona() {
    }
    
    //Una persona tiene nombre y una fecha de nacimiento (Tipo Date)
    String nombre;
    Date fechaNacimiento;
//constructor parametrizado
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    

   
    
    
    
    
}
    
    
    
  //*onstructor vacío, 
//constructor parametrizado, get y set. Crear una clase PersonaService,
//en el paquete servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de
//la persona a crear. Retornar el objeto Persona creado. */ 
    
 
