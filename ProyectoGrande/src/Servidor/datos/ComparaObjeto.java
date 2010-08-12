package Servidor.datos;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mi PC
 */
public class ComparaObjeto implements Comparator  {
  /*
     * Se implementa el método compare de la interfaz Comparator, que recibe como
     * parámetro dos objetos de tipo Object (los objetos que serán comparados)
     */
    public int compare(Object primerObjeto, Object segundoObjeto)
    {
        /*
         * Se genera una comparación entre los apellidos de los objetos
         */
        //int resultado = ((Nodo)primerObjeto).getApellido().compareTo(((Nodo)segundoObjeto).getApellido());

        Jugador primerObjetoNodo = (Jugador) primerObjeto;
        Jugador segundoObjetoNodo = (Jugador) segundoObjeto;

        String atributoClavePrimerObjeto = primerObjetoNodo.getNickname();
        String atributoClaveSegundoObjeto = segundoObjetoNodo.getNickname();

        int resultado = atributoClavePrimerObjeto.compareTo(atributoClaveSegundoObjeto);



        /*
         * Si resultado es igual a cero, es porque se trata del mismo objeto
         */
        if (resultado == 0)
            return 0;
        /*
         * Si el apellido del primer objeto es mayor que el apellido del segundo, se
         * devuelve -1, con lo cual el primer objeto será ingresado en la colección
         * antes que el segundo
         */
        if (resultado <= 0)
            return -1;
        /*
         * Si el apellido del primer objeto es menor que el apellido del segundo, se
         * devuelve 1, con lo cual el primer objeto será ingresado en la colección
         * después que el segundo
         */
        return 1;
    }
}


