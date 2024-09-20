package libreria.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

/**
 *
 * @author Emiliano
 */
public class ClienteService {

    ClienteDAO cdao = new ClienteDAO();
    List<Cliente> cliente = new ArrayList<>();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void consultarCliente() {
        System.out.println("Ingrese el ID del cliente a consultar: ");
        Integer id = leer.nextInt();
        Cliente c1 = cdao.consultarCliente(id);
        System.out.println(c1);
    }

    public void crearCliente() {
        Cliente c1 = new Cliente();
        System.out.println("Usted esta creando un nuevo Cliente en el programa...");
        System.out.println("Ingrese el nombre del nuevo cliente: ");
        String nombreEdit = leer.next();
        c1.setNombre(nombreEdit);
        System.out.println("Ingrese el apellido: ");
        String apellido = leer.next();
        c1.setApellido(apellido);
        System.out.println("Ingrese el dni: ");
        Long dni = leer.nextLong();
        c1.setDni(dni);
        System.out.println("Ingrese el telefono: ");
        String telefono = leer.next();
        c1.setTelefono(telefono);
        cdao.crearCliente(c1);
        System.out.println("Se ha creado un nuevo cliente.");
    }

    public void listarCliente() {
        cliente.add((Cliente) cdao.consultarClientes());
        for (Cliente cliente1 : cliente) {
            System.out.println(cliente1);
         }
 }

    public void modificarCliente() {
        System.out.println("Ingrese el ID del cliente que desea modificar: ");
        Integer id = leer.nextInt();
        Cliente c1 = cdao.consultarCliente(id);
        System.out.println("Ingrese el nuevo nombre:  ");
        String nuevoNombre = leer.next();
        c1.setNombre(nuevoNombre);
        cdao.modificarCliente(c1);
        System.out.println("Se ha realizado la modificacion.");
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el ID del cliente a eliminar: ");
        Integer id = leer.nextInt();
        Cliente c1 = cdao.consultarCliente(id);
        cdao.eliminarCliente(c1);
        System.out.println("Se ha eliminado el cliente seleccionado.");

    }
}
