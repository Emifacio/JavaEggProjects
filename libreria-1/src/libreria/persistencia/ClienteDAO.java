package libreria.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Cliente;

/**
 *
 * @author Emiliano
 */
public class ClienteDAO extends DAO<Cliente> {

    public ClienteDAO() {
}

    public void crearCliente(Cliente cliente) {
        super.guardar(cliente);
    }

    public Cliente consultarCliente(Integer id) {
        conectar();
        Cliente cliente = em.find(Cliente.class, id);
        desconectar();
        return cliente;
    }

    public List<Cliente> consultarClientes() {
        conectar();
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
        desconectar();
        return query.getResultList();
    }

    public void modificarCliente(Cliente cliente) {
        super.editar(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        super.eliminar(cliente);
    }
}
