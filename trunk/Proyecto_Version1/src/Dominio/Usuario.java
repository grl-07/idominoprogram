package Dominio;

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
    protected  String cedula;
    Calendar  fechaNaci; //fecha de nacimiento
    protected  int score;
    protected  int Cont_ingreso;
    protected  int partidas_creadas;
    protected  int partidas_ganadas;


    //CONSTRUCTOR DE LA CLASS USUARIO
    public Usuario (String nombre,String apellido, String cedula, Calendar fecha_nac, int score, int cont_ingreso, int partidas_creadas, int partidas_ganadas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNaci= fecha_nac;
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

    public String getCedula() {
        return cedula;
    }

    public Calendar getFecha_nac() {
        return fechaNaci;
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

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFecha_nac(Calendar fecha_nac) {
        this.fechaNaci = fecha_nac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidas_creadas(int partidas_creadas) {
        this.partidas_creadas = 0;  //partidas_creadas;
    }

    public void setPartidas_ganadas(int partidas_ganadas) {
        this.partidas_ganadas = 0;  //partidas_ganadas;
    }

    public void setScore(int score) {
        this.score = 0; //score;
    }


}
