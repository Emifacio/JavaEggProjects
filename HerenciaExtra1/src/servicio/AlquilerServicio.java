/*
 Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package servicio;

import entidades.AMotor;
import entidades.Alquiler;
import entidades.Barco;
import entidades.Velero;
import entidades.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        //crear objeto barco para agregar el tipo en el parametro
        //Barco b1 = n
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.next();
        System.out.println("Ingrese su numero de dni");
        long dni = leer.nextLong();
        Date inicio = new Date();

        System.out.println("Ingrese la fecha de devolucion");
        System.out.println("Año:");
        int anio = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Día:");
        int dia = leer.nextInt();
        Date devolucion = new Date(anio - 1900, mes-1, dia);
        //System.out.println(devolucion);
        int amarre = (int)(Math.random()*10+1);

        return new Alquiler(nombre, dni, inicio, devolucion, amarre, crearBarco());
    }

    public Barco crearBarco() {

        System.out.println("Ingresar matricula");
        String matricula = leer.next();
        System.out.println("Ingresar eslora");
        Double eslora = leer.nextDouble();
        System.out.println("Ingresar año de fabricacion");
        int anioFab = leer.nextInt();
        System.out.println("Ingrese el tipo de barco");
        System.out.println("1-Velero");
        System.out.println("2-Barco a motor");
        System.out.println("3-Yate");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                int mastiles = crearVelero();
                return new Velero(mastiles, matricula, eslora, anioFab);
            case 2:
                int potencia = crearAMotor();
                return new AMotor(potencia, matricula, eslora, anioFab);
            case 3:
                potencia = crearAMotor();
                int camarotes = crearCamarotes();
                return new Yate(camarotes, potencia, matricula, eslora, anioFab);
            default:
                System.out.println("Opcion incorrecta");
        }
        return null;
    }

    public int crearVelero() {
        System.out.println("Ingrese la cantidad de mástiles");
        int mastiles = leer.nextInt();
        return mastiles;
    }

    public int crearAMotor() {
        System.out.println("Ingrese la potencia en CV");
        int cv = leer.nextInt();
        return cv;
    }

    public int crearCamarotes() {
        System.out.println("Ingrese la cantidad de camarotes");
        int camarotes = leer.nextInt();
        return camarotes;
    }

    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
    */
    public void calcularAlquiler(Alquiler a1){
       
        int ocupacion;
      
        if (a1.getAlquiler().getMonth()==a1.getDevolucion().getMonth()) {
            ocupacion= a1.getAlquiler().getDate()-a1.getDevolucion().getDate();
        }else {
            int dias = (a1.getDevolucion().getMonth()-a1.getAlquiler().getMonth())*30;
            ocupacion = (dias-a1.getAlquiler().getDate())+a1.getDevolucion().getDate();
        }
        
        System.out.println("La cantidad de dias alquilados es: "+ocupacion);
        
      Double valor = 0d;
        
       if ( a1.getBote() instanceof Velero) {
            Velero vele = (Velero) a1.getBote();
             valor = (vele.getEslora()*10)+vele.getMastiles();
        }else if (a1.getBote() instanceof AMotor) {
            AMotor motor = (AMotor) a1.getBote();
            valor = (motor.getEslora()*10)+motor.getCv();
        }else if (a1.getBote() instanceof Yate) {
           Yate yates = (Yate) a1.getBote();
           System.out.println(yates.getCamarotes());
            valor = (yates.getEslora()*10)+yates.getCv()+yates.getCamarotes();
        }
           
       Double dinero= (valor*ocupacion)+1000;
       
        System.out.println("El valor del alquiler sera de: "+ dinero);
       
        
    }
    
}
