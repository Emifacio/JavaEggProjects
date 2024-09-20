package entidades;

import java.util.Date;

/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */

/**
 *
 * @author tinap
 */
public class Alquiler {
    private String nombre;
    private long dni;
    private Date alquiler;
    private Date devolucion;
    private int amarre;
    private Barco bote;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, Date alquiler, Date devolucion, int amarre, Barco bote) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.amarre = amarre;
        this.bote = bote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBote() {
        return bote;
    }

    public void setBote(Barco bote) {
        this.bote = bote;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", alquiler=" + alquiler + ", devolucion=" + devolucion + ", amarre=" + amarre + ", bote=" + bote + '}';
    }
    
    
}
