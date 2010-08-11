package Menu;
import Cliente.ClienteTest;
import Dominio.Lista_Pieza;
import Dominio.*;
import Logica.Comunicacion;
import Servidor.ServidorApp;
import java.util.Calendar;
import ve.edu.ucab.cliente.ClienteSocket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mi PC
 */
public class Main {

    public static void main(String[] args)
    {

        Jugador elJugador, elJugador1;
                
         //Calendar fecha,fecha1;
         //fecha = Calendar.getInstance();
         //fecha1 = Calendar.getInstance();

      ClienteSocket cliente = new ClienteSocket();
      //  elJugador = new Jugador("nombre","apellido","cedula", "fecha" ,/*score*/3,/*ingreso*/2,/*creadas*/1,/*ganadas*/10,"nickname","clave","avatar");
     // System.out.println(elJugador);
      //elJugador = new Jugador("nanhh","jj","df","kj",3,3,1,1,"hjk","ew","dsd");
      //System.out.println(elJugador);



//      ListaJugador hola2 = new ListaJugador();
     // Comunicacion.getListaDeJugador().agregarElemento(elJugador);
      
  //    elJugador1 = new Jugador ("nombre1","apellido1","cedula1", "fecha1" ,/*score*/4,/*ingreso*/1,/*creadas*/3,/*ganadas*/6,"nickname1","clave1","avatar1");

  //    System.out.println("lista jugador: ");
   //   hola2.agregarElemento(elJugador1);
      //hola2.imprimirListaJugador();
      

      /*Lista_Pieza miListaPieza = new Lista_Pieza();
      miListaPieza.Shuffle();

      Partida hola = new Partida("Diego",1);
      hola.repartirPieza();

       ListaReporte hola1 = new ListaReporte();
       hola1.ObtenerDatosReporte(hola2,1);
       hola1.ObtenerDatosReporte(hola2,2);
       hola1.ObtenerDatosReporte(hola2,3);
      
       hola1.BuscarMayor(hola2);*/
       //Comunicacion.setLista(hola2);
      // Comunicacion.getListaDeJugador().imprimirListaJugador();
       String resultado = cliente.ejecutarPeticion("1:nickname:clave", "localhost", 7687);
       System.out.println(resultado);
    }

  
}
