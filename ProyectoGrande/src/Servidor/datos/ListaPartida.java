/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

import java.util.ArrayList;
import java.util.Iterator;
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

        public Iterator getIterator()
    {
        return l_partidas.iterator();
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
