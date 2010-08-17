/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

/**
 *
 * @author Blacky G
 */
public class DatosXml_Cargados {

    // DESDE AQUI SE OBTENDRAN Y MODIFICARAN LOS DATOS DEL JUEGO

     //luego cargar desde archivo xml
     //ListaJugador Registro_Jugadores = new ListaJugador();
    static ListaJugador listaDeJugador;

    public DatosXml_Cargados() {

        listaDeJugador = new ListaJugador();

    }
   
    public static ListaJugador getListaDeJugador() {
        return listaDeJugador;
    }

    public static void setListaDeJugador(ListaJugador listaDeJugador) {
        DatosXml_Cargados.listaDeJugador = listaDeJugador;
    }
    // Jugador Sesion_Jugador;

     public static void imprimirLista()
   {
       listaDeJugador.imprimirListaJugador();
   }
}
