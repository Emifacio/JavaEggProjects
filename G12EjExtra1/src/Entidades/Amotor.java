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
class Amotor extends Barco {

    public Amotor() {
    }

    public Amotor(String matricula, Integer eslora, Integer añoFabricacion, Integer potencia) {
        super(matricula, eslora, añoFabricacion);
        potencia=0;
    }
    

}
        