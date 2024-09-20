package libreria.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Prestamo;

/**
 *
 * @author Emiliano
 */
public class PrestamoDAO extends DAO<Prestamo> {

    public void crearPrestamo(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    public Prestamo consultarPrestamo(int id) {
        conectar();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectar();
        return prestamo;
    }

    public List<Prestamo> consultarPrestamos() {
        conectar();
        TypedQuery<Prestamo> query = em.createQuery("SELECT p FROM Prestamo p", Prestamo.class);
        desconectar();
        return query.getResultList();

    }

    public void modificarPrestamo(Prestamo prestamo) {
        super.editar(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        super.eliminar(prestamo);
    }
}
