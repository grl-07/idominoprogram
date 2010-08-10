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
  
 public static void obtenerDatos(JTextField nombre, JTextField apellido, JTextField cedula, JDateChooser fechaNaci, JTextField nickname, JPasswordField password, JLabel avatar)
    {

     Jugador registro = null;

            

            String name = nombre.getText();
            String last = apellido.getText();
            String ci = cedula.getText();
            Calendar fn = fechaNaci.getCalendar();
            String nick = nickname.getText();
            registro = new Jugador (name, last, ci, fn, 0, 0, 0, 0, nick, "password", "avatar");
            listaDeJugador.agregarElemento(registro);
            listaDeJugador.imprimirListaJugador();
            System.out.println("Si estoy Guardando");
            
    }
  // Sesion_Jugador = Registro_Jugadores.buscar_jugador(null, null);



 // Jugador Sesion_Abierta = new Jugador();



}
