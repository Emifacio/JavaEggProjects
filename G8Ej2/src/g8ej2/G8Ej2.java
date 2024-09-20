/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8ej2;

import g8ej2.Entities.Nespresso;
import g8ej2.Service.NespressoService;

/**
 *
 * @author invitado
 */
public class G8Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NespressoService ns = new NespressoService();
        Nespresso cn = ns.crearCafetera();
        ns.capacidadMaxima(1000);
        ns.llenarCafetera();
        ns.servirTaza(0);
        ns.vaciarCafetera();
        ns.agregarCafe(0);
        
        
        
        
        
        
    }
    
}
