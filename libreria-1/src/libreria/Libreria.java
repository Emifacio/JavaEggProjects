/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import libreria.servicio.AutorService;
import libreria.servicio.EditorialService;
import libreria.servicio.LibroService;



/**
 *
 * @author Emiliano
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
as.crearAutor();
//ls.showMenu();
//ls.menu();
//ls.crearLibro();

  }

}
