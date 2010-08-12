package Menu;
//import Cliente.ClienteTest;
//import Dominio.Lista_Pieza;
import Dominio.*;
import Gestion_Xml.*;

//import Logica.Comunicacion;
///import Servidor.ServidorApp;
//import java.util.Calendar;
//import ve.edu.ucab.cliente.ClienteSocket;

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


      Jugador elJugador = new Jugador("nanhh","jj","kj",3,3,1,1,"hjk","ew","dsd");
      ListaJugador hola2 = new ListaJugador();
      boolean x;
      x = hola2.agregarElemento(elJugador);
     try{
      //Manejo_archivo.guardarArchivoXML(hola2);
      System.out.println("hola");
        }
      catch(Exception e)
      {
          System.out.println("se tiro 3");
      }

      ListaJugador Arch = new ListaJugador();

      try{
          Manejo_archivo.leerArchivoXML(Arch);
          Arch.imprimirListaJugador();
        }
      catch(Exception e){
          System.out.println("se tiro 3");
      }

      
    }

  
}
