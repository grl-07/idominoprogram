/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente.logica;

import Cliente.datos.Lista_Pieza;
import Cliente.datos.Pieza;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author Diego
 */
public class ComunicacionCliente {
public static String ip= "";

    public static String peticionServidor(String peticion, int IDpeticion)
    {
        ClienteSocket cliente = new ClienteSocket();
        ip= "localhost";

        if (IDpeticion == 1)
            return cliente.ejecutarPeticion(peticion, ip, 7687);
        if (IDpeticion == 2)
            return cliente.ejecutarPeticion(peticion, ip, 7687);
        if (IDpeticion == 100)
            return cliente.ejecutarPeticion(peticion, ip, 7687);
        return "hola";
     }

    public static Lista_Pieza obtenerLista (String piezas)
    {
        Lista_Pieza lista = new Lista_Pieza();
        Pieza nueva;

        String [] arg = piezas.split(":");
        int i, longitud;
        longitud = arg.length;
        System.out.println(arg);
        for (i = 0; i < longitud; i++)
        {
            String [] ficha = arg[i].split("-");

            nueva = new Pieza (Integer.parseInt(ficha[0]), Integer.parseInt(ficha[1]),Integer.parseInt(ficha[2]),ficha[3],ficha[4],ficha[5],ficha[6]);
            lista.agregarPieza(nueva);
        }
        return lista;
    }

}
