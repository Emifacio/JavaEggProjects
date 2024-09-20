/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;

import entidades.Alquiler;
import servicio.AlquilerServicio;

/**
 *
 * @author tinap
 */
public class HerenciaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlquilerServicio serv = new AlquilerServicio();
        Alquiler a1 = serv.crearAlquiler();
        serv.calcularAlquiler(a1);
        
    }
    
}
