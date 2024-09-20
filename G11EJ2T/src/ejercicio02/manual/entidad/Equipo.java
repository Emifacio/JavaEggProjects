/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.manual.entidad;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author invitado
 */
public class Equipo {
    private List<Jugador> jugadores;
    
    public List<Jugador> getJgadores(){
    return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
     
   public void mostrarListaJugadores(){
   
   for(Jugador aux : jugadores){
   
       System.out.println(aux.getNombre());
       System.out.println(aux.getApellido());
       System.out.println(aux.getPosicion());
       System.out.println(aux.getNumero());
   }
   
   }
    
    
}
