/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

import java.util.*;

/**
 *
 * @author Blacky G
 */
public class ListaPartida1 {
      private List <Partida> l_partidas;

      public ListaPartida1()
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

    public Iterator getIterator()
    {
        return l_partidas.iterator();
    }



}
