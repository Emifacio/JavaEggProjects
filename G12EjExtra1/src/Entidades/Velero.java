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
final class Velero extends Barco {

        public Velero() {
        }

        public Velero(String matricula, Integer eslora, Integer añoFabricacion, Integer cantidadMastiles) {
            super(matricula, eslora, añoFabricacion);
           cantidadMastiles=0;
        }
        
    }

       