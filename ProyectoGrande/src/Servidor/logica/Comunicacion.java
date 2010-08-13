/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.logica;

import Servidor.datos.Jugador;
import Servidor.datos.ListaJugador;
import Servidor.datos.Lista_Pieza;
import Servidor.datos.Partida;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import javax.swing.*;
/**
 *
 * @author Blacky G
 */
// declarando los objetos con las clases de dominio
public class Comunicacion {

  //se carga el sistema con todos los jugadores

 //luego cargar desde archivo xml
  ListaJugador Registro_Jugadores = new ListaJugador();
  static ListaJugador listaDeJugador;// = new ListaJugador();
  Jugador Sesion_Jugador;
  
  
        public static String crearUsuario(String nickname, String clave, String nombre, String apellido, String fecha, String avatar)
        {
            Calendar fn = Calendar.getInstance(); //Pasar string a fecha
            Jugador registro = new Jugador(nombre, apellido,fecha, 0, 1, 0, 0, nickname,clave,avatar); ;
            listaDeJugador.agregarElemento(registro);
            Servidor.datos.Manejo_archivo.guardarArchivoXML(listaDeJugador);
          return "TRUE";
        }


    public static ListaJugador getListaDeJugador() {
        return listaDeJugador;
    }

    

   public static void setLista()
   {
       //Calendar fn = Calendar.getInstance();
       //Jugador registro = new Jugador ("nombre", "apellido", "cedula", "fn", 0, 0, 0, 0, "nick", "clave", "avatar");
       if (Servidor.datos.Manejo_archivo.esArchivoVacio() == false){
           listaDeJugador = new ListaJugador();
           Servidor.datos.Manejo_archivo.leerArchivoXML(listaDeJugador);
       }
       else
           listaDeJugador = new ListaJugador();
   }

   public static void imprimirLista()
   {
       listaDeJugador.imprimirListaJugador();
   }

   public static ListaJugador getLista()
   {
       return listaDeJugador;
   }

   public static String nuevaPartida(String nick, String inicio)
   {
       Calendar begin = Calendar.getInstance();
       /*String[] fecha = inicio.split("/");
       int dia = Integer.parseInt(fecha[0]);
       int mes = Integer.parseInt(fecha[1]);
       int ano = Integer.parseInt(fecha[2]);
       begin.set
       System.out.println(ano);*/

       int numPartida = listaDeJugador.buscar_jugador_nick(nick).getPartidas_creadas();
       numPartida++;
       System.out.println("numPartida: " + numPartida);
       listaDeJugador.buscar_jugador_nick(nick).setPartidas_creadas(numPartida);
       Partida nueva = new Partida(nick, numPartida);
       
       Lista_Pieza repartio = nueva.repartirPieza();

       Lista_Pieza pc = nueva.obtenerPiezasRestantes(1);
       Lista_Pieza pote = nueva.obtenerPiezasRestantes(0);
      // pc.imprimirColeccion();
      // pote.imprimirColeccion();
       listaDeJugador.imprimirListaJugador();
       Servidor.datos.Manejo_archivo.guardarArchivoXML(listaDeJugador);
       return nueva.listaDePiezas();
   }

   public static String obtenerNickJugador(String nombre){
       return listaDeJugador.buscar_jugador_nombre(nombre).getNickname();
   }



   // Sesion_Jugador = Registro_Jugadores.buscar_jugador(null, null);



 // Jugador Sesion_Abierta = new Jugador();



}
