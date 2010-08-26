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
         if (IDpeticion == 3) //pote
            return cliente.ejecutarPeticion(peticion, ip, 7687);
        if (IDpeticion == 4) // guardar
            return cliente.ejecutarPeticion(peticion, ip, 7687);
        if (IDpeticion == 100)
            return cliente.ejecutarPeticion(peticion, ip, 7687);
      
     //al enviar una jugada
        if (IDpeticion == 555){

            String[] Cadena = new String [5];
            Cadena = cliente.ejecutarPeticion(peticion, ip, 7687).split(":");


            String[] CadCorta = new String [3];
            CadCorta[0]=Cadena[0];//si es true

            
           if ( CadCorta[0].equals("TRUE")) {
                CadCorta[1]=Cadena[2];
                CadCorta[2]=Cadena[4];
                return (CadCorta[1]+":"+CadCorta[2]); 
           
            }  
            else return ("FALSE:");
            
        }

     return "cualquier cosa";
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

     public static Pieza obtenerPieza(String piezaPote)
    {
        int longitud, i;
        Pieza nueva;


        String [] arg = piezaPote.split("-");
        nueva = new Pieza (Integer.parseInt(arg[0]), Integer.parseInt(arg[1]),Integer.parseInt(arg[2]),arg[3],arg[4],arg[5],arg[6]);
        System.out.println("imrpimiendo la ficha que se agarra del pote");
        System.out.println(nueva.getPintaSuperior() + "---" + nueva.getPintainferior());

        return nueva;

    }
}
