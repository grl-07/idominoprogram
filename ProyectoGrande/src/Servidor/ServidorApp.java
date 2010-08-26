
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;


//import Dominio.ListaJugador;
import Servidor.datos.PiedraEnTablero;
import Servidor.datos.Jugador;
import Servidor.datos.PiedraEnTablero;
import Servidor.datos.*;
import Servidor.logica.Comunicacion;
import ve.edu.ucab.server.logica.Servidor;

/**
 *
 * @author Diego
 */
public class ServidorApp {


    public static void main(String[] args)
    {

         /*      for (int f = 0; f < 8; f++){
                 for (int g=0;g<12;g++){
             //    Servidor.datos.TableroPermanete.  //   Tablero[f][g]=new PiedraEnTablero();
                         Servidor.datos.   //TableroPermanente.TableroTablero[f][g]=new PiedraEnTablero();
              }
             }*/

    Comunicacion.setLista();
    String[] parametros = {"7687", "Servidor.logica.Gestion_Juego"};
    Servidor.main(parametros);
}


}
