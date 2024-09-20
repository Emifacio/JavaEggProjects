/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext3;

import Entidades.Camping;
import Entidades.Hotel5;

import Entidades.Residencias;

/**
 *
 * @author Carolina Hernández
 */
public class HerExt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear  alojamientos
        Hotel5 holidayinn = new Hotel5(100,5,20,"A","Pepito",40,2,4,2,100000.0); /*hab, camas, pisos,gym,
nom resto, cap resto, cant salones, suites, cant limo , precio hab*/
      
        Camping camping1 = new Camping(100, 2, true);
        Residencias residencia1 = new Residencias(60, false, true); //habitaciones descuento campo
    }

} 
