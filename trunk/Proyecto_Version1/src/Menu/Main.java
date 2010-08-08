package Menu;
import Dominio.ListaPieza;
import Dominio.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mi PC
 */
public class Main {

    public static void main(String[] args) {

        Jugador elJugador;
                
      elJugador = new Jugador("nanhh","jj","df","kj",3,3,1,1,"hjk","ew","dsd");
      System.out.println(elJugador);

      ListaPieza miListaPieza = new ListaPieza();
      miListaPieza.Shuffle();




 }

  
}
