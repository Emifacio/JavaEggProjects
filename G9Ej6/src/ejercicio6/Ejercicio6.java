/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.Entidades.Curso;
import ejercicio6.cursoService.CursoService;

/**
 *
 * @author invitado
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs1 = new CursoService();
        Curso curso1 = cs1.crearCurso();
        Curso curso2 = cs1.crearCurso();
        
        // TODO code application logic here
    }
    
}
