package guia12ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Guia12Ejercicio1 {

    public static void main(String[] args) {
        List<Animal> array = new ArrayList();
        //Animal a = new Animal();
        Animal perro = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        Animal gato = new Gato("Kazumi", "Carnivora", 1, "Naranja");
        Animal caballo = new Caballo("Trueno", "Pasto", 10, "Azabache");
        
        array.add(perro);
        array.add(gato);
        array.add(caballo);
        
        for (Animal aux : array) {
            aux.Alimentarse();
        }
        
        
    }

}
