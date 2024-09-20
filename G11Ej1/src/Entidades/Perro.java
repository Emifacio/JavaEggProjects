/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *    * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases.
     * Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con atributos:
     * nombre, apellido, edad, documento y Perro.
 * @author invitado
 */
public class Perro {
    String nombre;
    String raza;
    String tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + '}';
    }
   
    
    
}
