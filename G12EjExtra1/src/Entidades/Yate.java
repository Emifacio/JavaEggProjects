/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author invitado
 */
class Yate extends Barco {

        public Yate() {
        }
    

        public Yate(String matricula, Integer eslora, Integer añoFabricacion, Integer potencia, Integer camarotes) {
            super(matricula, eslora, añoFabricacion);
            potencia=0;
            camarotes=0;
            
        }
    
}