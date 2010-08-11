/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Dominio.*;
import java.util.Calendar;
/**
 *
 * @author Diego
 */
public class Lista_Grande {

    //Calendar fecha;

    public static ListaJugador Devolverlista()
    {
        ListaJugador x = new ListaJugador();

        Jugador Gamer = new Jugador ("GARRY","BRUNO","fecha" ,2,2,3,3,"NICK_ELMIO","MICLAVE","AVATAAR");

        x.agregarElemento(Gamer);
        return x;
    }



}
