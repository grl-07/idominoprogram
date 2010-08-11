/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Dominio.*;
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
  static ListaJugador listaDeJugador = new ListaJugador();
  Jugador Sesion_Jugador;
  static int numPartida = 1;
  
 public static void obtenerDatos(JTextField nombre, JTextField apellido,JDateChooser fechaNaci, JTextField nickname, JPasswordField password, JLabel avatar)
    {

     Jugador registro = null;

            

            String name = nombre.getText();
            String last = apellido.getText();
            Calendar fn = fechaNaci.getCalendar();
            String nick = nickname.getText();
            registro = new Jugador (name, last,"fn", 0, 0, 0, 0, nick, "clave", "avatar");
            listaDeJugador.agregarElemento(registro);
            listaDeJugador.imprimirListaJugador();
            System.out.println("Si estoy Guardando");
            
    }


        public String crearUsuario(String nickname, String clave, String nombre, String apellido, String fecha, String avatar)
        {
            Calendar fn = Calendar.getInstance(); //Pasar string a fecha
            Jugador registro = new Jugador(nombre, apellido,fecha, 0, 0, 0, 0, nickname,clave,avatar); ;
            listaDeJugador.agregarElemento(registro);

          return "false";
        }


    public static ListaJugador getListaDeJugador() {
        return listaDeJugador;
    }

    

   public static void setLista(ListaJugador nueva)
   {
       //Calendar fn = Calendar.getInstance();
       //Jugador registro = new Jugador ("nombre", "apellido", "cedula", "fn", 0, 0, 0, 0, "nick", "clave", "avatar");
       listaDeJugador = nueva;
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
       
       Partida nueva = new Partida(nick, numPartida);
       numPartida++;
       Lista_Pieza repartio = nueva.repartirPieza();

       Lista_Pieza pc = nueva.obtenerPiezasRestantes(1);
       Lista_Pieza pote = nueva.obtenerPiezasRestantes(0);
       pc.imprimirColeccion();
       pote.imprimirColeccion();
       return nueva.listaDePiezas();
   }



   // Sesion_Jugador = Registro_Jugadores.buscar_jugador(null, null);



 // Jugador Sesion_Abierta = new Jugador();



}
