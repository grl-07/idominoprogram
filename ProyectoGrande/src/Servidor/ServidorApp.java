/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;


//import Dominio.ListaJugador;
import Servidor.datos.Jugador;
import Servidor.logica.Comunicacion;
import ve.edu.ucab.server.logica.Servidor;

/**
 *
 * @author Diego
 */
public class ServidorApp {

    public static void main(String[] args)
    {
    Comunicacion.setLista();
    String[] parametros = {"7687", "Servidor.logica.Gestion_Juego"};
    Servidor.main(parametros);
}


}
