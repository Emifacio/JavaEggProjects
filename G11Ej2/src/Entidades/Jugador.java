/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador), 
 * nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
*si está mojado o no el jugador). El número de jugadores será decidido por el usuario, 
* pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
*Métodos:
*   • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() 
* y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, 
* el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
 * @author invitado
 */
public class Jugador {
    Integer id;
    String nombre;
    String mojado;
   
    
    
}
