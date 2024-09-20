/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author invitado
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> listaAlumno = new ArrayList<>();

    public Alumno creAlumno() {
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        ArrayList<Integer> notas = new ArrayList<>();
        System.out.println("Ingrese las 3 notas del alumno: ");
        int suma=0;
        for (int i = 0; i < 3; i++) {
            int nuevaNota=leer.nextInt();
            
            notas.add(nuevaNota);
         }
        return new Alumno(nombre, notas);
    }

    public void addAlu(Alumno a) {
        listaAlumno.add(a);
    }

    public void fabricaAlumno(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Alumno alumnoCreado = creAlumno();
            addAlu(alumnoCreado);
            System.out.println(alumnoCreado.toString());
            System.out.println(" ");
            System.out.println("----------------------------------------");
            System.out.println(" ");
        }
    }

    public void mostrAlu() {
        System.out.println("Los alumnos ingresados son: ");
        for (Alumno aux : listaAlumno) {
            System.out.println(aux.toString());
        }
        System.out.println(listaAlumno.size());
    }
    
    public void notaFinal (){
        
for (int i = 0; i < listaAlumno.size(); i++) {
    ArrayList<Integer> listaNotas = listaAlumno.get(i).getNotas();
    int sumaAlumno = 0;
    
    for (int j = 0; j < listaNotas.size(); j++) {
        sumaAlumno += listaNotas.get(j);
    }
  double notaFinal= sumaAlumno/3; //cantidad de notas;
    System.out.println("La nota final del alumno " + listaAlumno.get(i).getNombre() + " es: " + notaFinal);
}
    }
}

 


//     public ArrayList<Integer> getNotas() {
//         for (Alumno aux: listaAlumno) {
//             ArrayList<Integer> notas = alumno.getNotas();
//             
//         }
//      return getNotas();
//     }
//     public double notaFinal() {
//        int suma = 0;
//        for (int nota : {
//            suma += nota;
//        }
//        return (double) suma / notas.size();
//    }

    
    
    
    
    
    
    
    
    
//public void notaf(){
//    double notaf = 0;
//    Alumno alumnoCreado =creAlumno();
//   
//    ArrayList<Integer> suma;
//        suma = alumnoCreado.getNotas();
//        
//}
//}

//double precioTotal = 0;
//
//
//    precioTotal += objeto.getPrecio();
//}
//
//System.out.println(precioTotal);




//      public double notaFinal() {
//        // Buscar al alumno en la lista de Alumnos
//        Alumno alumno = null;
       
       
//            if (a.getNombre().equals(nombreAlumno)) {
//                alumno = a;
//                break;
//            }
//        }
//        // Si el alumno no está en la lista, devolver -1
//        if (alumno == null) {
//            System.out.println("El alumno " + nombreAlumno + " no está en la lista.");
//            
//        }
//        // Calcular el promedio de notas del alumno
//        ArrayList<Integer> notas = alumno.getNotas();
//        double sum = 0;
//        for (Integer nota : notas) {
//            sum += nota;
//        }
//        double promedio = sum / notas.size();
//        // Devolver el promedio de notas del alumno
//        return
//    }

