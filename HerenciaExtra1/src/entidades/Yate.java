package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tinap
 */
public class Yate extends Barco{
    
    protected int camarotes;
    protected int cv;

    public Yate() {
    }

    public Yate(int camarotes, int cv) {
        this.camarotes = camarotes;
        this.cv = cv;
    }

    public Yate(int camarotes, int cv, String matricula, Double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.camarotes = camarotes;
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarotes=" + camarotes + ", cv=" + cv + '}';
    }
    
    
}
