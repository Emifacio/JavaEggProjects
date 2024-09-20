package Entities;

import Enum.Mazo;
import java.util.*;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente. Las operaciones que podrá realizar la
 * baraja son:
 *
 *
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 *
 *
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas.
 *
 *
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 *
 *
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
 * número de cartas. En caso de que haya menos cartas que las pedidas, no
 * devolveremos nada, pero debemos indicárselo al usuario.
 *
 *
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
 * salido ninguna indicárselo al usuario
 *
 *
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
 * saca una carta y luego se llama al método, este no mostrara esa primera
 * carta.
 *
 */
public class Baraja {

    private Mazo mazo1;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Mazo> mazoarray = new ArrayList();
    public ArrayList<Mazo> mazoarrayRemovidas = new ArrayList();

    public ArrayList barajar() {
        mazoarray.addAll(Arrays.asList(Mazo.values()));
        Collections.shuffle(mazoarray);
        return mazoarray;
    }

    public void mostrarMezclados() {
        System.out.println(barajar());
    }

    /**
     * • siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas.
     */
    public void siguienteCarta() {
        Iterator it = mazoarray.iterator();
        if (it.hasNext()) {
            System.out.println("La siguiente carta es: " + it.next().toString());
            mazoarrayRemovidas.add(mazoarray.get(0));
            mazoarray.remove(0);

        } else {
            System.out.println("No quedan mas cartas");
        }

    }
    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    public void cartasDisposibles() {
        System.out.println("La cantidad de cartas que quedan en el mazo es de: " + mazoarray.size());
    }

    /**
     * • darCartas(): dado un número de cartas que nos pidan, le devolveremos
     * ese número de cartas. En caso de que haya menos cartas que las pedidas,
     * no devolveremos nada, pero debemos indicárselo al usuario.
     */
    public void darCartas() {
        System.out.println("Indique la cantidad de cartas a dar");
        int cantidad = leer.nextInt();
        if (mazoarray.size() >= cantidad) {
            for (int i = 0; i <= cantidad; i++) {
                mazoarrayRemovidas.add(mazoarray.get(0));
                mazoarray.remove(0);
            }
        } else{
            System.out.println("No se han repartido cartas por que ha pedido mas de las restantes, quedan: " + mazoarray.size());
        }
    }
    
    // • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
    // salido ninguna indicárselo al usuario
    public void cartasMonton(){
        if (!mazoarrayRemovidas.isEmpty()) {
            System.out.println("Las cartas que ya salieron son: " + mazoarrayRemovidas.toString());
        } else {
            System.out.println("No ha removido ninguna carta del mazo");
        }
    }
    
    // * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
    // * saca una carta y luego se llama al método, este no mostrara esa primera
    // * carta.
    public void mostrarBaraja(){
        System.out.println("Las cartas que quedan en el mazo son: " + mazoarray.toString()); 
    }
    
}