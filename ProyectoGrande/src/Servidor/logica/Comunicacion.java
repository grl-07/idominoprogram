/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.logica;

import Cliente.logica.SesionAbierta;
import Servidor.datos.Jugador;
import Servidor.datos.ListaJugador;
import Servidor.datos.Lista_Pieza;
import Servidor.datos.ListaPartida;
import Servidor.datos.Partida;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author Blacky G
 */
// declarando los objetos con las clases de dominio
public class Comunicacion {

  //se carga el sistema con todos los jugadores

 //luego cargar desde archivo xml
 // ListaJugador Registro_Jugadores = new ListaJugador();
 // static ListaJugador listaDeJugador;// = new ListaJugador();
 // Jugador Sesion_Jugador;
  
  
        public static String crearUsuario(String nickname, String clave, String nombre, String apellido, String fecha, String avatar)
        {
            Calendar fn = Calendar.getInstance(); //Pasar string a fecha
            Jugador registro = new Jugador(nombre, apellido,fecha, 0, 1, 0, 0, nickname,clave,avatar);

            //toma todo desde la carga que esta en datos xml_cargados
            Servidor.datos.DatosXml_Cargados.getListaDeJugador().agregarElemento(registro);
            Servidor.datos.Manejo_archivo.guardarJugadorXML(Servidor.datos.DatosXml_Cargados.getListaDeJugador(),null);
          return "TRUE";
        }


  //  public static ListaJugador getListaDeJugador() {
 //       return listaDeJugador;
 //   }

    

   public static void setLista()
   {
       //Calendar fn = Calendar.getInstance();
       //Jugador registro = new Jugador ("nombre", "apellido", "cedula", "fn", 0, 0, 0, 0, "nick", "clave", "avatar");
       if (Servidor.datos.Manejo_archivo.esArchivoVacio() == false){
          // listaDeJugador = new ListaJugador();
           Servidor.datos.Manejo_archivo.leerArchivoXML(Servidor.datos.DatosXml_Cargados.getListaDeJugador());
       }
  //     else
    //       listaDeJugador = new ListaJugador();
   }

  public static void imprimirLista()
   {
       Servidor.datos.DatosXml_Cargados.getListaDeJugador().imprimirListaJugador();
  }

  // public static ListaJugador getLista()
  // {
  //     return listaDeJugador;
  // }

   public static String nuevaPartida(String nick, String inicio)
   {
       Calendar begin = Calendar.getInstance();
       /*String[] fecha = inicio.split("/");
       int dia = Integer.parseInt(fecha[0]);
       int mes = Integer.parseInt(fecha[1]);
       int ano = Integer.parseInt(fecha[2]);
       begin.set
       System.out.println(ano);*/

       int numPartida = Servidor.datos.DatosXml_Cargados.getListaDeJugador().buscar_jugador_nick(nick).getPartidas_creadas();
       numPartida++;
       System.out.println("numPartida: " + numPartida);

       //aumenta el numeor de partidas creadas
       Servidor.datos.DatosXml_Cargados.getListaDeJugador().buscar_jugador_nick(nick).setPartidas_creadas(numPartida);

       //crea la partida en una variable nueva
       Partida nueva_partida = new Partida(nick, numPartida);

       //le inserta la fecha de inicio
       nueva_partida.setFecha_inicio(inicio);

       //reparte las piezas a cada elemento en la partida (pote , makina , jugador)
       Lista_Pieza repartio = nueva_partida.repartirPieza();

       //retorna la lista de piezas de la makina
       Lista_Pieza pc = nueva_partida.obtenerPiezasRestantes(1);

       //retorna la lista de piezas del pote
       Lista_Pieza pote = nueva_partida.obtenerPiezasRestantes(0);

       //se crea una lista nueva
     //  ListaPartida  L_partida = new ListaPartida();
     //  L_partida.agregarPartida(nueva);


       //se agrega la partida creada al jugador perteneciente al nick en la lista principal
        Servidor.datos.DatosXml_Cargados.getListaDeJugador().buscar_jugador_nick(nick)
             .getMis_partidas().agregarPartida(nueva_partida);
      // listaDeJugador.imprimirListaJugador();
  //   Servidor.datos.Manejo_archivo.guardarJugadorXML(listaDeJugador,L_partida);

      //se devuelven las piezas del jugador
      return nueva_partida.listaDePiezas();


   }


   public static String obtenerNickJugador(String nombre){
       return Servidor.datos.DatosXml_Cargados.getListaDeJugador().buscar_jugador_nombre(nombre).getNickname();
   }


 //  public static String CargarPartida ( String nick ){
 //      Servidor.datos.Manejo_archivo.leerArchivoXML(listaDeJugador);
 //      Iterator x = listaDeJugador.buscar_jugador_nick(SesionAbierta.getNick_sesion()  ).getMis_partidas().getIterator();
 //         Partida p =  (Partida) x.next();

 //         return p.listaDePiezas();

//   }



   // Sesion_Jugador = Registro_Jugadores.buscar_jugador(null, null);



 // Jugador Sesion_Abierta = new Jugador();



}
