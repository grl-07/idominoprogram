/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Blacky G
 */
public class Lectura_piezas_precargadas {



public static List <Pieza> Obtener_piezas_precargadas(List <Pieza> l_piedras) {


        //se crea la variable temporal que tendra todas las piezas base
        List <Pieza> Lista_temporal_piezas = new ArrayList();


        String nombreArchivoPiezas = "src/Servidor/datos/Piezas_precargadas.xml";

        try
        {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            // se crea el documento en momoria
            Document doc = builder.build(nombreArchivoPiezas);


            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement();

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "Jugador"  */
            /* y se asignan esos hijos a un List                        */
            List l_piezas = raiz.getChildren("pieza");


            System.out.println("Formada por:" + l_piezas.size() + "  piezas");
            System.out.println("------------------");



            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = l_piezas.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
               
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

//-----------------------------------------------
                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element id = e.getChild("ID");
                Element V_superior = e.getChild("Valor_Superior");
                Element V_inferior = e.getChild("Valor_Inferior");
                Element imagen_arriba = e.getChild("imagen_arriba");
                Element imagen_abajo = e.getChild("imagen_abajo");
                Element imagen_derecha = e.getChild("imagen_derecha");
                Element imagen_izquierda = e.getChild("imagen_izquierda");


             //   Pieza l_pieza_temporal = new Pieza();

//---------------------------------------------------------------
       /* Se crea un nodo nuevo con la información y se agrega a la lista de jugadores
        */
              Pieza P_armado = new Pieza();

       //insertando las cosas extraidas en P_armado
                P_armado.setID(Integer.parseInt(id.getText()) );
                P_armado.setPintaSuperior ( Integer.parseInt( V_superior.getText() ) );
                P_armado.setPintainferior ( Integer.parseInt(V_inferior.getText() ) );
                P_armado.setImagenpintaS( imagen_arriba.getText() );
                P_armado.setImagenpintaIn( imagen_abajo.getText() ) ;
                P_armado.setImagenpintaD( imagen_derecha.getText() ) ;
                P_armado.setImagenpintaIz( imagen_izquierda.getText() );

                
           

            Lista_temporal_piezas.add(P_armado);

            } // WHile de piezas

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

      return Lista_temporal_piezas;
    }


}
