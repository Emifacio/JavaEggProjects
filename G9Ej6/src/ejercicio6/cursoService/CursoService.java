/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.cursoService;

import ejercicio6.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class CursoService {
  public Scanner leer = new Scanner (System.in); 
  private Curso curso;
    
    /**
     *
     * @return
     */
    public Curso crearCurso(){
    
    
    System.out.println("Ingrese el nombre del curso: ");
    String nombreCurso = leer.next();
    
    System.out.println("Ingrese la cantidad de dias por semana: ");
    int cantidadDiasPorSemana = leer.nextInt();
    
    System.out.println("Ingrese M para turno mañana y T para turno tarde");
    String mananaTarde = leer.next();
    
    System.out.println("Ingrese el Precio por Hora: ");
    int precioPorHora = leer.nextInt();
    
    System.out.println("Ingrese la cantidad de horas por dia: ");
    int cantidadHorasPorDia = leer.nextInt();
    
    String [] alumnos = cargarAlumnos();
    

    
    return new crearCurso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String mananaTarde, int precioPorHora, String[] alumnos);     
  } 
    //    public void crearCurso(){
     //   Curso c1 = new Curso();
      //  System.out.println("Ingrese el nombre del curso");
       // c1.setNombreCurso(leer.next());
    //}
 
      
public String [] cargarAlumnos () {
    String[] cargarAlu = new String[5];
  for (int i = 0; i < 5; i++){
      System.out.println("Ingrese el nombre del alumno: ");
      
            cargarAlu[i] = leer.next();
            
  }
  return cargarAlu;
}
  
  
  
  }

    

