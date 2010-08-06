/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Blacky G
 */
public class ListaPartida {
      private List <Partida> l_partidas;

      public ListaPartida()
     {
        l_partidas = new ArrayList <Partida>();
     }

    public void agregarPartida(Partida laPartida)
     {
        l_partidas.add(laPartida);
     }

    public void eliminarPartida(Partida laPartida)
    {
        l_partidas.remove(laPartida);
    }
    

}
