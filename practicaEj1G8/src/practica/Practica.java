/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import practica.entidades.CuentaBancaria;
import practica.servicios.CuentaBancariaServicio;

/**
 *
 * @author facundo.rozada
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cbs1 = new CuentaBancariaServicio();
        
        CuentaBancaria cb1 = cbs1.crearCuenta();
        
        cbs1.ingresar(500);
        
        cbs1.retirar(700);
        
        cbs1.extraccionRapida();
        
        cbs1.consultarDatos();
    }
    
}
