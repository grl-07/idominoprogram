/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

import java.util.Calendar;

/**
 *
 * @author Mi PC
 */
public class Jugador extends Usuario
{

    private String nickname;
    private String password;
    private String avatar;
    private ListaPartida mis_partidas;

    //constructor clase jugador
    public Jugador(String nombre, String apellido,/*Calendar*/ String fecha_nac, int score, int cont_ingreso,
    int partidas_creadas, int partidas_ganadas, String nickname, String password, String avatar  /*,ListaPartida partidas*/ )
    {

        super(nombre,apellido,fecha_nac,score,cont_ingreso,partidas_creadas,partidas_ganadas);
        this.nickname = nickname;
        this.password = password;
        this.avatar = avatar;
      //  this.mis_partidas = null;
    }
/*
    public ListaPartida getMis_partidas() {
        return mis_partidas;
    }

    public void setMis_partidas(ListaPartida mis_partidas) {
        this.mis_partidas = mis_partidas;
    } */

    

    public String getAvatar() {
        return avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public int getCont_ingreso() {
        return Cont_ingreso;
    }

    public int getPartidas_creadas() {
        return partidas_creadas;
    }

    public int getPartidas_ganadas() {
        return partidas_ganadas;
    }

    public int getScore() {
        return score;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }


  
    @Override
        public String toString()
    {
        String cadena;

                cadena = "El nombre es: " + nombre + "\n" +
                "El apellido es: " + apellido + "\n" +
               //"F Nacimiento "+ fecha_nac+ "\n"+
                "F Nacimiento "+ "fechaNaci "+ "\n"+

                "Escore: "+ score+ "\n"+
                "cont_ingreso: "+ Cont_ingreso+ "\n"+
                "Partidas creadas "+partidas_creadas+"\n" +
                "Partidas Ganadas "+partidas_ganadas+"\n" +
                "nicmane "+ this.nickname+"\n"+
                "clave "+ this.password+"\n"+
                "Avatar "+ this.avatar+"\n";

        return cadena;

    }





}
