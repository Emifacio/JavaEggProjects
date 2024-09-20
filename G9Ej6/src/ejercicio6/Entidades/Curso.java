/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Entidades;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Curso {

    public Scanner leer = new Scanner(System.in);

    public void curso() {

    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, boolean mananaTarde, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.mananaTarde = mananaTarde;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    String nombreCurso;

    public boolean isMananaTarde() {
        return mananaTarde;
    }

    public void setMananaTarde(boolean mananaTarde) {
        this.mananaTarde = mananaTarde;
    }

    public Curso(boolean mananaTarde) {
        this.mananaTarde = mananaTarde;
    }
    int cantidadHorasPorDia;
    int cantidadDiasPorSemana;
    boolean mananaTarde;
    int precioPorHora;
    String[] alumnos;

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "leer=" + leer + ", nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + "precioPorHora=" + precioPorHora +'}';
    }


}