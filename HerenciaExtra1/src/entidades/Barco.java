package entidades;

/*
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */

/**
 *
 * @author tinap
 */
public class Barco {
    protected String matricula;
    protected Double eslora;
    protected int anioFab;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, int anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", año de fabricacion=" + anioFab + '}';
    }
    
    
}
