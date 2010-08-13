package Servidor.datos;

import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mi PC
 */
public class Usuario {
    protected  String nombre;
    protected  String apellido;
    //protected  Calendar  fechaNaci; //fecha de nacimiento
    protected String fecha_nac;
    protected  int score;
    protected  int Cont_ingreso;
    protected  int partidas_creadas;
    protected  int partidas_ganadas;


    //CONSTRUCTOR DE LA CLASS USUARIO
    public Usuario (String nombre,String apellido, /*calendar*/String fecha_nac, int score, int cont_ingreso, int partidas_creadas, int partidas_ganadas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        //this.fechaNaci= fecha_nac;
        this.fecha_nac = fecha_nac;
        this.score= score;
        this.Cont_ingreso= cont_ingreso;
        this.partidas_creadas= partidas_creadas;
        this.partidas_ganadas= partidas_ganadas;
        //System.out.println(this.partidas_ganadas);
    }


    // METODOS GETTER
    public String getApellido() {
        return apellido;
    }


    public /*Calendar*/ String getFecha_nac() {
        //return fechaNaci;
        return fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    // METODOS SETTER
    public void setCont_ingreso(int Cont_ingreso) {
        this.Cont_ingreso = 0; //Cont_ingreso;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setFecha_nac(/*Calendar fecha_nac*/ String fecha_nac) {
        //this.fechaNaci = fecha_nac;
        this.fecha_nac = fecha_nac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidas_creadas(int partidas_creadas) {
        this.partidas_creadas = partidas_creadas;  //partidas_creadas;
    }

    public void setPartidas_ganadas(int partidas_ganadas) {
        this.partidas_ganadas = partidas_ganadas;  //partidas_ganadas;
    }

    public void setScore(int score) {
        this.score = score; //score;
    }


}

