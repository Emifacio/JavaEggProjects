/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import g8ej3.Entidades.Persona;
import java.util.Scanner;
import javax.swing.event.InternalFrameListener;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 *
 * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 *
 * b) Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
 *
 * c) Método calcularIMC    calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2  . Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un  1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un
 * 1.//metodo compareTo
 *
 * @author invitado
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona persona) {

        persona = new Persona();
        /*
      this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
         */
        System.out.println("Ingrese un nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();

        System.out.println("Ingrese con H, M o O su sexo:");
        char sexo;
        sexo = leer.next().charAt(0);

        if (sexo == ('H') || sexo == ('M') || sexo == ('O')) {
            System.out.println("Se ha asignado tu sexo");
        } else {
            while ((sexo.equalsIgnoreCase( ! 'H')& sexo.equalsIgnoreCase (!'M') &sexo.equalsIgnoreCase( ! 'O'));
            { System.out.println("Dato incorrecto. intenta nuevamente");
                sexo = leer.next().charAt(0);
            }

        }
