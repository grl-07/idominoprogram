
package Gestion_Xml;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import Dominio.*;

/**
 *
 * @author Blacky G
 */
public class Manejo_archivo
{
    private static String nombreArchivo = "src/Gestion_Xml/Registro.xml";

    /**
     *
     * Método public static void leerArchivoXML(ListaUsuarios listaDeUsuarios): Este método
     * permite leer un archivo XML que contiene los datos de los usuarios a través de jdom
     */

    //lista usuario se modifica
    public static void leerArchivoXML(ListaJugador listaDeJugadores)
    {
        try
        {
            SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            // se crea el documento en momoria
            Document doc = builder.build(nombreArchivo);

            /* Se obtiene la raíz del archivo (la etiqueta inicial) */
            Element raiz = doc.getRootElement();

            /* Se puede obtener el atributo de la raíz (de la etiqueta) */
            System.out.println(raiz.getAttributeValue("tipo"));

            /* Se obtienen todos los hijos cuya etiqueta esa "usuario"  */
            /* y se asignan esos hijos a un List                        */
            List l_Jugadores = raiz.getChildren("Jugadores");

            System.out.println("Formada por:" + l_Jugadores.size() + "Jugadores");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = l_Jugadores.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

//--------------------------------------
                /* Se obtiene el nombre, apellido y cargo de cada una de las etiquetas  */
                /* hijas de usuario, es decir, nombre, apellido y cargo                 */
                Element nombre = e.getChild("nombre");
                Element apellido = e.getChild("apellido");
                Element fecha_nac = e.getChild("fecha_nac");
                Element score = e.getChild("score");
                Element cont_ingreso = e.getChild("cont_ingreso");
                Element partidas_creadas = e.getChild("partidas_creadas");
                Element partidas_ganadas = e.getChild("partidas_ganadas");
                Element nick_name = e.getChild("nickname");
                Element password = e.getChild("password");
                Element avatar = e.getChild("avatar");
 //public Jugador(String nombre, String apellido,/*Calendar*/ String fecha_nac, int score, int cont_ingreso,
   // int partidas_creadas, int partidas_ganadas, String nickname, String password, String avatar)
    
                /* Se crea un nodo nuevo con la información y se agrega a la lista de usuarios */
      Jugador Gamer = new Jugador( nombre.getText(),apellido.getText(),fecha_nac.getText(), Integer.parseInt(score.getText()),
            Integer.parseInt(cont_ingreso.getText()),Integer.parseInt(partidas_creadas.getText()),
            Integer.parseInt(partidas_ganadas.getText()),nick_name.getText(),password.getText(),avatar.getText()  );
                        
                listaDeJugadores.agregarElemento(Gamer);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * Método public static void guardarArchivoXML(ListaUsuarios listaDeUsuarios): Este método
     * permite guardar la lista de usuarios en un archivo XML. El procesamiento se hace con jdom
     */
    public static void guardarArchivoXML(ListaJugador listaDeJugadores)
    {
        Jugador nodoAuxiliar;

        /* Se crea una raiz de la estructura */
        Element root = new Element("Jugadores");

        /* Es posible agregar atributos a la estructura inicial */
        root.setAttribute("tipo","lista de Jugadores");

        Iterator iterador = listaDeJugadores.getIterator();

        while (iterador.hasNext())
        {
            /* Se crea la etiqueta "usuario" */
            Element Jugadores = new Element("Jugadores");

            nodoAuxiliar = (Jugador) iterador.next();

            /* Se crean las etiquetas nombre, apellido y cargo */

                Element nombre = new Element ("nombre");
                Element apellido = new Element("apellido");
                Element fecha_nac = new Element("fecha_nac");
                Element score = new Element("score");
                Element cont_ingreso = new Element("cont_ingreso");
                Element partidas_creadas = new Element("partidas_creadas");
                Element partidas_ganadas = new Element("partidas_ganadas");
                Element nick_name =new Element("nickname");
                Element password = new Element("password");
                Element avatar =new Element("avatar");

            //------------------------------------------------------------

            /* Se inicializa cada etiqueta con sus valores de la lista */
            nombre.setText(nodoAuxiliar.getNombre());
            apellido.setText(nodoAuxiliar.getApellido());
            fecha_nac.setText(nodoAuxiliar.getFecha_nac());
            score.setText( String.valueOf(nodoAuxiliar.getScore()) );
            cont_ingreso.setText( String.valueOf(nodoAuxiliar.getCont_ingreso()) );
            partidas_creadas.setText( String.valueOf(nodoAuxiliar.getPartidas_creadas()) );
            partidas_ganadas.setText( String.valueOf(nodoAuxiliar.getPartidas_ganadas()) );
            nick_name.setText(nodoAuxiliar.getNickname());
            password.setText(nodoAuxiliar.getPassword());
            avatar.setText(nodoAuxiliar.getAvatar());

           
            /* Se añaden las etiquetas a la etiqueta principal (usuario)    */
            /* estableciendo que un usuario tiene nombre, apellido y cargo  */
            Jugadores.addContent(nombre);
            Jugadores.addContent(apellido);
            Jugadores.addContent(fecha_nac);
            Jugadores.addContent(score);
            Jugadores.addContent(cont_ingreso);
            Jugadores.addContent(partidas_creadas);
            Jugadores.addContent(partidas_ganadas);
            Jugadores.addContent(nick_name);
            Jugadores.addContent(password);
            Jugadores.addContent(avatar);

            /* Se añade el nuevo usuario a la estructura XML */
            root.addContent(Jugadores);
        }

        /* Se crea un documento nuevo */
        Document doc = new Document(root);

        try
        {
            /* Se genera un flujo de salida de datos XML */
            XMLOutputter out = new XMLOutputter();

            /* Se asocia el flujo de salida con el archivo donde se guardaran los datos */
            FileOutputStream file = new FileOutputStream(nombreArchivo);

            /* Se manda el documento generado hacia el archivo XML */
            out.output(doc,file);

            /* Se limpia el buffer ocupado por el objeto file y se manda a cerrar el archivo */
            file.flush();
            file.close();

            /* En este caso se manda a imprimir el archivo por la consola   */
            /* ESTE PROCESO NO ES OBLIGATORIO PARA PROCESAR EL XML          */
            out.output(doc,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

