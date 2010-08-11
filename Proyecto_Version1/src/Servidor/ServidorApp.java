/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;

import Dominio.Jugador;
import Dominio.ListaJugador;
import Logica.Comunicacion;
import ve.edu.ucab.server.logica.Servidor;

/**
 *
 * @author Diego
 */
public class ServidorApp {

    public static void main(String[] args)
    {
     Jugador elJugador = new Jugador("nombre","apellido","fecha" ,/*score*/3,/*ingreso*/2,/*creadas*/1,/*ganadas*/10,"nickname","clave","avatar");
    Comunicacion.getListaDeJugador().agregarElemento(elJugador);
    String[] parametros = {"7687", "Logica.Gestion_Juego"};
    Servidor.main(parametros);
}


}
