/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author Emiliano
 */
public class EditorialDAO extends DAO<Editorial> {

    public void cargarEditorial(Editorial editorial) {

        super.guardar(editorial);

    }

    @Override
    public void eliminar(Editorial objeto) {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Editorial objeto) {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    public Editorial buscar(Integer id) {
        Editorial e1 = em.find(Editorial.class, id);
        return e1;

    }
}
