/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente.datos;
import Servidor.datos.*;
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

 /*   public void llenar()
    {
      //  int control = 0;
      //  for (int i = 0; i <= 6; i++){
       //     for (int j = control; j <= 6; j++)
         //   {
      //Lista_Pieza a = new Lista_Pieza();
        System.out.println("SIMPSON ENTRANDO A OBTENER PIEZAS PRE CARGADAS");
      miListaPieza = Lectura_piezas_precargadas.Obtener_piezas_precargadas(miListaPieza);
       
              // miListaPieza.add(a);
               //System.out.println("pieza: " + i + "-" + j);
            //}
           // control++;

       // }
    } */


    



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
