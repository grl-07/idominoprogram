/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

import java.util.*;

/**
 *
 * @author Diego
 */
public class ListaReporte {

     public List <Reporte> miListaReporte;

     public ListaReporte()
    {
        miListaReporte = new ArrayList();

    }


    private Object[] Seleccion(ArrayList <Jugador> arr1 , int n, int control)
    {
        int i,j,min,k,min2;
        int cambio;
        min = 0;
        min2 = 0;
         Object [] arr = arr1.toArray();
         Jugador user2 = null;
         for (i=0;i < n ;i++)
            {
                Jugador user1 = (Jugador)arr[i];
                if (control == 1)
                  min = user1.getPartidas_ganadas();
                else if (control == 2)
                  min = user1.getPartidas_creadas();
                else if (control == 3)
                  min = user1.getCont_ingreso();
                k=0;
                cambio=0;
                for (j=i+1;j<n;j++)
                {
                    user2 = (Jugador)arr[j];
                    if (control == 1)
                      min2 = user2.getPartidas_ganadas();    
                    else if (control == 2)
                      min2 = user2.getPartidas_creadas();
                    else if (control == 3)
                      min2 = user2.getCont_ingreso();
                    if (min2 > min)
                    {
                        min = min2;
                        k=j;
                        cambio=1;
                        break;
                    }
                }
                if (cambio == 1)
                {
                    arr[k] = arr[i];
                    arr[i] = user2;
                    
                }

            }
        for(i=0 ; i<arr.length ; i++)
        {
            Jugador Usuario = (Jugador) arr[i];
            //Usuario.partidas_creadas  );
            System.out.println("Nombre : " + Usuario.getNickname());
            if (control == 1)
               System.out.println("GANADASS : " + Usuario.getPartidas_ganadas());
            else if (control == 2)
               System.out.println("CREADASS : " + Usuario.getPartidas_creadas());
            else if (control == 3)
               System.out.println("INGRESOOOSS : " + Usuario.getCont_ingreso());
            

            System.out.println();
        }
         return (Object[]) arr;
    }


    public Jugador BuscarMayor(ListaJugador jugadores)
    {
        return jugadores.buscar_mayor();
    }


    private void OrganizarReporte(ListaJugador jugadores, int opcion)
    {
        int i;

        Object [] arreglo;

        arreglo = jugadores.Devolver_lista_completa();

        ArrayList <Jugador>  lista = new ArrayList();
        
        for(i=0 ; i<arreglo.length ; i++)
        {
            Jugador Usuario = (Jugador) arreglo[i];
            
            lista.add(Usuario);
            //Usuario.partidas_creadas  );
            //System.out.println("GANADASS : " + Usuario.getPartidas_ganadas());
            
            //System.out.println();
        }
      arreglo = Seleccion(lista, arreglo.length, opcion);

    }   //<>

     public boolean ObtenerDatosReporte(ListaJugador jugadores, int opcion)
        {

         System.out.println("Reporte");
         if (opcion == 1)
            OrganizarReporte(jugadores,opcion);
         if (opcion == 2)
            OrganizarReporte(jugadores,opcion);
         if (opcion == 3)
            OrganizarReporte(jugadores,opcion);
        /*
         * Se hace un recorrido del arreglo de tipo Object y se imprime
         * la información de la casilla i
         */
        
            return true;
       }
        

}
