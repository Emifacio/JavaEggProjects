/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8ej3.Entidades;

/**
 /*Realizar una clase llamada Persona en el paquete de entidades que tengan
     * los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
     * ‘O’ para otro), peso y altura. 
     * Si desea añadir algún otro atributo, puede hacerlo. 
     * Agregar constructores, getters y setters.
 * @author invitado
         */
public class Persona {
    String nombre;
    int edad;
    char sexo;
    int peso;
    int altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
}
