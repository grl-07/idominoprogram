/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

import Dominio.Jugador;
import Dominio.ListaJugador;
import Logica.Comunicacion;
import java.util.Calendar;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author Diego
 */
public class ClienteTest
{
    public static void main(String[] args)
    {
         ClienteSocket cliente = new ClienteSocket();
        //Comunicacion.setLista();
        //String resultado = cliente.ejecutarPeticion("1:nickname:clave", "localhost", 7687);
        //String resultado = cliente.ejecutarPeticion("2:nick:17/09/1988", "localhost", 7687);
        String resultado = cliente.ejecutarPeticion("3:DemonStok:teamojuan:Diego:vierma:17/09/1988:C&D", "localhost", 7687);
        //String resultado = cliente.ejecutarPeticion("4:nickname:IDpartida", "localhost", 7687);
        //String resultado = cliente.ejecutarPeticion("5:nickname:IDpartida:----", "localhost", 7687);
        //String resultado = cliente.ejecutarPeticion("6:nickname:IDpartida", "localhost", 7687);
        //String resultado = cliente.ejecutarPeticion("7:nickname:IDpartida", "localhost", 7687);

        System.out.println(resultado);

    }
}


