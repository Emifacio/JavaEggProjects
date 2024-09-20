/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.del.manual.entidades;

/**
 *
 * @author invitado
 */
public class Persona {
     public String nombre;
     public String apellido;
     public Dni  dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
     
     
     
     public Dni getDni(){
     
     return dni;
     }

    public void setDni(Dni dni) {
        this.dni = dni;
    }
     
     
}
