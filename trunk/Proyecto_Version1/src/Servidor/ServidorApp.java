/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;

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
    String[] parametros = {"7687", "Logica.Gestion_Juego"};
    Servidor.main(parametros);
}


}
