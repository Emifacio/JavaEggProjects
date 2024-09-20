/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.manual;

import ejercicio02.manual.entidad.Equipo;
import ejercicio02.manual.entidad.Jugador;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author invitado
 */
public class EJERCICIO02MANUAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("nicolas");
        jugador1.setApellido("Ramirez");
        jugador1.setPosicion("Delantero");
        jugador1.setNumero(9);
        jugadores.add(jugador1);
        
        Jugador jugador2 = new Jugador();
        jugador2.setNombre("francisco");
        jugador2.setApellido("gomez");
        jugador2.setPosicion("defensor");
        jugador2.setNumero(2);
        jugadores.add(jugador2);
        
        Jugador jugador3 = new Jugador();
        jugador3.setNombre("roberto");
        jugador3.setApellido("gimenez");
        jugador3.setPosicion("arquero");
        jugador3.setNumero(1);
        jugadores.add(jugador3);
        
        Equipo equipo = new Equipo();
        equipo.setJugadores(jugadores);
        equipo.mostrarListaJugadores();
        
        
        
    }
    
        
}
