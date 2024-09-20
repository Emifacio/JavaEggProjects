package practica.servicios;

import java.util.Scanner;
import practica.entidades.CuentaBancaria;

public class CuentaBancariaServicio {
    private Scanner scanner = new Scanner(System.in);
    private CuentaBancaria cuenta;
    
//    private int numeroCuenta;
//    private long dniCliente;
//    private double saldoActual;
    
    /* a) Método para crear cuenta pidiéndole los datos al usuario.*/
    public CuentaBancaria crearCuenta() {
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
    public void ingresar(double monto) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
        System.out.printf("Se ha ingresado $%.2f a la cuenta.\n", monto);
        this.consultarSaldo();
    }

    /* c) Método retirar(double): recibe una cantidad de dinero a retirar y se 
    le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a 
    retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    public void retirar(double monto) {
        if (monto > cuenta.getSaldoActual()) {
            System.out.printf("Saldo insuficiente. No se puede retirar $%.2f. Retirará $%.2f.\n", monto, cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
        }
        this.consultarSaldo();
    }
    
    /* d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.*/
    public void extraccionRapida() {
        double monto = 0.20 * cuenta.getSaldoActual();
        System.out.println("Usted va a retirar $" + monto);
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        this.consultarSaldo();
    }
    
    /* e) Método consultarSaldo: permitirá consultar el saldo disponible en la 
    cuenta.*/
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de $" + cuenta.getSaldoActual() + ".");
        System.out.println("");
    }
    
    /* f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.*/
    public void consultarDatos() {
        System.out.println(cuenta.toString());
    }
}
