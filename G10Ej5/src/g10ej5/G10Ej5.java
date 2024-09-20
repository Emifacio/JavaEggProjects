/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10ej5;

import Servicios.PaisesServicios;

/**
 *
 * @author invitado
 */
public class G10Ej5 {

    /**Falta que ordene alfabeticamente.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PaisesServicios ps = new PaisesServicios();
         
         ps.cargarPaises();
         
       
         System.out.println(" ");
         ps.mostrarCountries(ps.ordenarPaises());
         System.out.println(" ");
         ps.pedirPais();
         
         
         
         
        
    }
    
}
