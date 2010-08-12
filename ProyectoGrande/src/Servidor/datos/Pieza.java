package Servidor.datos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_A112
 */
public class Pieza {

    private int pintaSuperior;
    private int pintainferior;

    public Pieza(int pintaSuperior, int pintainferior) {
        this.pintaSuperior = pintaSuperior;
        this.pintainferior = pintainferior;
    }

    public Pieza()
    {
        this.pintaSuperior = pintaSuperior;
        this.pintainferior = pintainferior;
    }

    public int getPintaSuperior() {
        return pintaSuperior;
    }

    public void setPintaSuperior(int pintaSuperior) {
        this.pintaSuperior = pintaSuperior;
    }

    public int getPintainferior() {
        return pintainferior;
    }

    public void setPintainferior(int pintainferior) {
        this.pintainferior = pintainferior;
    }




}
