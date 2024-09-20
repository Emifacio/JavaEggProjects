/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;


/**
 *
 * @author Emiliano
 */

public class LibroDAO extends DAO<Libro> {

    public void crearLibro(Libro libro) throws NullPointerException {
        super.guardar(libro);
    }

    @Override
    public void eliminar(Libro objeto) throws NullPointerException {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Libro objeto) throws NullPointerException {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }
    

    public Libro buscar(Long id) throws NullPointerException {
        Libro libro = em.find(Libro.class, id);
        return libro;
    }

    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarLibroPorNombreDeAutor(String nombreAutor) throws NullPointerException {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombreAutor")
                .setParameter("nombreAutor", "%" + nombreAutor + "%")
                .getResultList();
        desconectar();
        return libros;
//public List<Libro> buscarEditorial(String editorial){
//   
//       conectar();
//       List<Libro> libro = em.createQuery("select a from Libro a where a.editorial.nombre like '"+ editorial + "'" ).getResultList();
//              
//       desconectar();
//       return libro;
    }
}