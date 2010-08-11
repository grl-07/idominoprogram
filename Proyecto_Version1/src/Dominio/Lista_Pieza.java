/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;
import java.util.*;
/**
 *
 * @author Diego
 */
public class Lista_Pieza {

    public List <Pieza> miListaPieza;



  /*  public ListaPieza(List<Pieza> miListaPieza) {
        this.miListaPieza = miListaPieza;
    }*/



    public Lista_Pieza()
    {
        miListaPieza = new ArrayList();

    }

    public void llenar()
    {
        int control = 0;
        for (int i = 0; i <= 6; i++){
            for (int j = control; j <= 6; j++)
            {
               Pieza a = new Pieza(i,j);
               miListaPieza.add(a);
               //System.out.println("pieza: " + i + "-" + j);
            }
            control++;

        }
    }


    public void imprimirColeccion()
    {
        int i;
        Pieza registro;

        /*
         * Se define un arreglo de tipo Object (la clase genérica Java)
         */
        Object [] arreglo;

        /*
         * Se convierte la colección pasada como parámetro a un array, que
         * es asignado al arreglo de tipo Object
         */
        arreglo = miListaPieza.toArray();

        System.out.println("Piezas");

        /*
         * Se hace un recorrido del arreglo de tipo Object y se imprime
         * la información de la casilla i
         */
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Pieza) arreglo[i];
            System.out.println("Pinta superior: " + registro.getPintaSuperior());
            System.out.println("Pinta inferior: " + registro.getPintainferior());
            System.out.println();
        }

        System.out.println("\n\n");
    }




    public void imprimirPiezas()
    {
        int i;
        Pieza registro;

        /*
         * Se define un arreglo de tipo Object (la clase genérica Java)
         */
        Object [] arreglo;

        /*
         * Se convierte la colección pasada como parámetro a un array, que
         * es asignado al arreglo de tipo Object
         */
        arreglo = miListaPieza.toArray();

        System.out.println("Piezas");

        /*
         * Se hace un recorrido del arreglo de tipo Object y se imprime
         * la información de la casilla i
         */
        for(i=0 ; i<arreglo.length ; i++)
        {
            registro = (Pieza) arreglo[i];
            System.out.println("Pinta superior: " + registro.getPintaSuperior());
            System.out.println("Pinta inferior: " + registro.getPintainferior());
            System.out.println();
        }

        System.out.println("\n\n");
    }



    public boolean agregarPieza(Pieza objeto)
    {
        return miListaPieza.add(objeto);
    }

    public Pieza obtenerPieza()
    {
        if (miListaPieza != null)
            return miListaPieza.get(0);
        return null;
    }

    public boolean quitarPieza(Pieza objeto)
    {
        return miListaPieza.remove(objeto);
    }

    public List<Pieza> getMiListaPieza() {
        return miListaPieza;
    }

    public void setMiListaPieza(List<Pieza> miListaPieza) {
        this.miListaPieza = miListaPieza;
    }


    public boolean ListaVacia()
    {
        if (miListaPieza.isEmpty())
                return true;
        return false;
    }

    public void Shuffle()
    {
        Collections.shuffle(miListaPieza);
        //imprimirColeccion();



    }

    public int dimension()
    {
        return miListaPieza.size();
    }

    public Pieza obtenerPiezaindice(int indice)
    {
        Pieza pieza = null;
        Iterator iterador = miListaPieza.iterator();
        int cont = 0;
        while (iterador.hasNext())
        {
            pieza = (Pieza) iterador.next();
            if (cont == indice)
                break;
            cont++;
        }
        return pieza;
    }




}
