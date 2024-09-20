/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 * Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de
 * alquiler, fecha de devolución.
 *
 * @author invitado
 */
public final class Alquiler {

    private String nombre;
    private String dni;
    private Date fechaDeAlquiler;
    private Date fechaDevolucion;

    public Alquiler(String nombre, String dni, Date fechaDeAlquiler, Date fechaDevolucion) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDevolucion=" + fechaDevolucion + '}';
    }

}
