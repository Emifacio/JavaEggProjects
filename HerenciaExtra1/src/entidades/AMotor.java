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
public class AMotor extends Barco{
    protected int cv;

    public AMotor() {
    }

    public AMotor(int cv) {
        this.cv = cv;
    }

    public AMotor(int cv, String matricula, Double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "AMotor{" + "cv=" + cv + '}';
    }
    
}
