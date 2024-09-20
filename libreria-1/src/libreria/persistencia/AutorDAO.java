/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.persistence.TypedQuery;
import libreria.entidades.Autor;

/**
 *
 * @author Emiliano
 */
public class AutorDAO extends DAO<Autor> {

    public Autor buscarPorID(Integer id) {

        Autor autor = em.find(Autor.class, id);

        return autor;

    }

//    public Autor autorVacioLLeno(Autor autor) {
//        // Verificar si el autor existe en la base de datos
//      
//           try {
//            Autor resultado =(Autor)em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").
//           setParameter("nombre", autor.getNombre()).getSingleResult();
// 
//            
//            return resultado;
//        } catch (Exception e) {
//
//           
//                // El autor no existe en la base de datos, puedes crearlo
//                
//                
//                return null;
//                
//            }
//    }
        
            
    

@Override
        public void guardar(Autor objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void eliminar(Autor objeto) {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public void editar(Autor objeto) {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void listaAutor (){
          List<Autor> autores = em.createQuery("SELECT a FROM Autor a") .getResultList();
          autores.forEach((autore) -> {
              System.out.println(autore);
       });
    }
   public List <Autor>buscarPornombre(String nombre){
  List<Autor> autores = em.createQuery("SELECT p FROM Autor p WHERE p.nombre LIKE :nombre")
            .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
 
 return autores;
}
}
