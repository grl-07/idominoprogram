/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente.logica;

import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author Diego
 */
public class ComunicacionCliente {

    public static String peticionServidor(String peticion, int IDpeticion)
    {
        ClienteSocket cliente = new ClienteSocket();
        if (IDpeticion == 1)
            return cliente.ejecutarPeticion(peticion, "localhost", 7687);
        if (IDpeticion == 2)
            return cliente.ejecutarPeticion(peticion, "localhost", 7687);
        if (IDpeticion == 100)
            return cliente.ejecutarPeticion(peticion, "localhost", 7687);
        return "hola";
    }

}
