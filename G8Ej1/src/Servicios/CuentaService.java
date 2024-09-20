/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;


/**
 *Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
* ------------------------------------------------------------------------------------------------
* ------------------------------------------------------------------------------------------------
* ------------------------------------------------------------------------------------------------
* ------------------------------------------------------------------------------------------------
* ------------------------------------------------------------------------------------------------* 
* private Scanner scanner = new Scanner(System.in);
    private CuentaBancaria cuenta;
    
//    private int numeroCuenta;
//    private long dniCliente;
//    private double saldoActual;
    
    /* a) Método para crear cuenta pidiéndole los datos al usuario.*/
    /*public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
        
        System.out.println("Ingrese el saldo actual:");
        double saldoActual = scanner.nextDouble();
        
        this.cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        
        return this.cuenta;
    }
    
    /* b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.*/
    /*public void ingresar(double monto) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
        System.out.printf("Se ha ingresado $%.2f a la cuenta.\n", monto);
        this.consultarSaldo();
    }

    /* c) Método retirar(double): recibe una cantidad de dinero a retirar y se 
    le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a 
    retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    /*public void retirar(double monto) {
        if (monto > cuenta.getSaldoActual()) {
            System.out.printf("Saldo insuficiente. No se puede retirar $%.2f. Retirará $%.2f.\n", monto, cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
        }
        this.consultarSaldo();
    }
    
    /* d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.*/
    /*public void extraccionRapida() {
        double monto = 0.20 * cuenta.getSaldoActual();
        System.out.println("Usted va a retirar $" + monto);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        this.consultarSaldo();
    }
    
    /* e) Método consultarSaldo: permitirá consultar el saldo disponible en la 
    cuenta.*/
    /*public void consultarSaldo() {
        System.out.println("Su saldo actual es de $" + cuenta.getSaldoActual() + ".");
        System.out.println("");
    }
    
    /* f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.*/
    /*public void consultarDatos() {
        System.out.println(cuenta.toString());
    }
}
*//*
 * @author invitado
 */
public class CuentaService {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Cuenta cuenta;
    //Método para crear cuenta pidiéndole los datos al usuario.
    //aca yo quise crear el método crearCuenta() directamente pero no se hace asi...*/
 
    public Cuenta crearCuenta(){
        //Siempre que comienzo un método en el cual el usuario me ingresa datos por consola, debo:
        // 1) Verificar que tenga el Scanner, creado e importado.
        //2) Verificar que tenga el objeto de la clase  creado e importado. 
        //3) comenzar el método con un "sout".
        System.out.println("Ingrese el numero de  cuenta: ");
        int numeroCuenta= leer.nextInt();
        
        System.out.println("Ingrese el dni del cliente: ");
    double dniCliente= leer.nextDouble();
      
    System.out.println("Ingrese el saldo actual: ");
    int saldoActual= leer.nextInt();
    //(this. cuenta) //debe importarse la clase del objeto|| debe crearse fuera del metodo el objeto de la clase.
    //new Cuenta es la clase trayendo los atributos del objeto como parametros
    //representados por las variables leidas por consola las cuales cargan el objeto 
    //que se retorna como el objeto cargado de la clase.
    
    this.cuenta = new Cuenta(numeroCuenta, dniCliente, saldoActual);
  
    return this.cuenta;
    }
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    
        public void  ingresar() {
        System.out.println("Usted va a ingresar dinero. Indique por favor la cantidad: ");
        double ingresar = leer.nextDouble();
        cuenta.setSaldoActual((int) (cuenta.getSaldoActual()+ingresar));
            System.out.println("Su ingreso ha sido realizado con exito, su saldo actual es de $ " + cuenta.getSaldoActual());
         }
    
        
    /*Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    public void  retirar() {
        System.out.println("\nUsted va retirar dinero. Si la suma requerida supera al saldo solo se extraera el saldo: ");
    double retirar = leer.nextDouble();
    
   
        if (cuenta.getSaldoActual()< retirar) {
            System.out.println("Su extraccion finalizo con exito, usted retira: "+ cuenta.getSaldoActual() + "su saldo actual es $0 ");
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Su extraccion finalizo con exito usted ha retirado $" + retirar);
            cuenta.setSaldoActual((int) (cuenta.getSaldoActual()- retirar));
            System.out.println("Su saldo actual es de $ " + cuenta.getSaldoActual() );
        }
        System.out.println("----------------------------------------");
    }
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida() { 
        System.out.println("Bienvenido a la extraccion rapida, usted retirara un 20% de su saldo.\n"); 
        double ret= cuenta.getSaldoActual()*0.2;
        System.out.println("su extraccion rapida sera de $" + ret);
        System.out.println("------Extrayendo------");
        
        double sald = cuenta.getSaldoActual()*(0.8);
        
        cuenta.setSaldoActual((int)sald);
        System.out.println("Su saldo actual es de $ " + cuenta.getSaldoActual() );
        
    }
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println(cuenta.getSaldoActual());
    }
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() { 
        System.out.println(cuenta.toString());
    }
}
    
    

