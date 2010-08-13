
package Servidor.datos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

/**
 *
 * @author Blacky G
 */
public class Manejo_archivo
{
    private static String nombreArchivo = "src/Servidor/datos/Registro.xml";
    /**
     *
     * Método public static void leerArchivoXML(ListaUsuarios listaDeUsuarios): Este método
     * permite leer un archivo XML que contiene los datos de los usuarios a través de jdom
     */
    public static boolean esArchivoVacio(){
        boolean prueba = false;
        try{
        SAXBuilder builder = new SAXBuilder();

            /* Se crea un documento nuevo con el nombre del archivo */
            // se crea el documento en momoria
        Document doc = builder.build(nombreArchivo);
        prueba = doc.hasRootElement();
        return false;
        }
        catch (Exception e)
        {
            System.out.println("entro true");
            return true;
        }
        
    }

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

            /* Se obtienen todos los hijos cuya etiqueta esa "Jugador"  */
            /* y se asignan esos hijos a un List                        */
            List l_Jugadores = raiz.getChildren("Jugador");

            System.out.println("Formada por:" + l_Jugadores.size() + "  Jugadores");
            System.out.println("------------------");

            /* Se genera un iterador para recorrer el List que se generó */
            Iterator i = l_Jugadores.iterator();

            /* Se recorre el List */
            while (i.hasNext())
            {
                /* Se obtiene cada uno y se asigna a un objeto de tipo Element */
                Element e = (Element) i.next();

//-----------------------------------------------
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
 //------------------Sacando de lista partida y convirtiendola
                //crea una lista temporal para captar la lista y se llenada
                String piezas_cadena_jugador1;
                String piezas_cadena_jugador2;
                String piezas_cadena_pote;
                ListaPartida Lista_Partida_Enviar = new ListaPartida();

             //  obtengo todos las etiquets del jugador que tienen ese nombre
                List l_partidas = e.getChildren("Partida");

                Iterator z = l_partidas.iterator();

                while (z.hasNext()){

             //      Pieza l_pieza_temporal = new Pieza();

                   //obtengo cada partida de ese jugador
                   Element y = (Element)z.next();

                   Element creador_e = y.getChild("creador");
                   Element id_partida_e = y.getChild("id_partida");
                   Element fecha_inicio_e = y.getChild("fecha_inicio");
                   Element fecha_actual_e = y.getChild("fecha_actual");
                   Element piezas_jugador1 = y.getChild("Piezas_jugador1");
                   Element piezas_jugador2 = y.getChild("Piezas_jugador2");
                   Element piezas_pote = y.getChild("Piezas_pote");

                   //ahora paso los elementos a cadena para trabajarlos
                   //la cadena esta en formato x1-y1:x2-y2:x3-y3.....
                   piezas_cadena_jugador1 = piezas_jugador1.getText();
                   piezas_cadena_jugador2 = piezas_jugador2.getText();
                   piezas_cadena_pote = piezas_pote.getText();

                   //CONTRUYENDO LA PARTIDA
            Partida Partida_temp = new Partida ( creador_e.getText(),Integer.parseInt(id_partida_e.getText())/*
                fecha_inicio_e.getText(),fecha_actual_e.getText(),
                Conversor_cadena_partida(piezas_cadena_jugador1),Conversor_cadena_partida(piezas_cadena_jugador2),
                Conversor_cadena_partida(piezas_cadena_pote) */ );
            Partida_temp.setJugador1( Conversor_cadena_partida(piezas_cadena_jugador1));
             Partida_temp.setJugador1( Conversor_cadena_partida(piezas_cadena_jugador2));
              Partida_temp.setJugador1( Conversor_cadena_partida(piezas_cadena_pote));

                Lista_Partida_Enviar.agregarPartida(Partida_temp);

                }// WHILE DEL LAS PARTIDAS */

//---------------------------------------------------------------
       /* Se crea un nodo nuevo con la información y se agrega a la lista de jugadores            */
      Jugador Gamer = new Jugador( nombre.getText(),apellido.getText(),fecha_nac.getText(), Integer.parseInt(score.getText()),
            Integer.parseInt(cont_ingreso.getText()),Integer.parseInt(partidas_creadas.getText()),
            Integer.parseInt(partidas_ganadas.getText()),nick_name.getText(),password.getText(),avatar.getText());
       Gamer.setMis_partidas(Lista_Partida_Enviar);
                listaDeJugadores.agregarElemento(Gamer);
            } // WHILE DE JUGADOR

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


    public static void guardarJugadorXML(ListaJugador listaDeJugadores ,ListaPartida L_p)
    {
        Jugador nodoAuxiliar;
        Partida nodoAuxiliar_partida;

        /* Se crea una raiz de la estructura */
        Element root = new Element("Jugadores");

        /* Es posible agregar atributos a la estructura inicial */
        root.setAttribute("tipo","lista de Jugadores");

        Iterator iterador = listaDeJugadores.getIterator();

        while (iterador.hasNext())
        {
            /* Se crea la etiqueta "Jugadores" */
            Element Jugadores = new Element("Jugador");

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

   //---------------MANEJO LISTA PARTIDA----DENTRO DEL WHILE DEL JUGADOR-------

            //CREA LA ETIQUE PARTIDA PERO NOOO SE LLENA
        //    Element Partidas = new Element("Lista_Partidas");
     if (L_p!=null ){
     Iterator iterador_partidas = L_p.getIterator();

       //     while (iterador_partidas.hasNext())
     //   {
            // Se crea la etiqueta "Partida"
            Element Partida = new Element("Partida");

            nodoAuxiliar_partida = (Partida) iterador_partidas.next();
      //    nodoAuxiliar_partida =  nodoAuxiliar.getMis_partidas().;
            //Se crean las etiquetas  dentro para introducir lista pieza

                Element id_partida = new Element ("id_partida");
                Element creador = new Element ("creador");
                Element fecha_inicio = new Element("fecha_inicio");
                Element fecha_actual = new Element("fecha_actual");
                Element Piezas_jugador1 = new Element ("Piezas_jugador1");
                Element Piezas_jugador2 = new Element ("Piezas_jugador2");
                Element Piezas_pote = new Element ("Piezas_pote");


            //  Se agrega la informacion a las etiquetas creadas
            id_partida.setText(String.valueOf(nodoAuxiliar_partida.getId_partida()) );
            creador.setText(nodoAuxiliar_partida.getCreador());
            fecha_inicio.setText( nodoAuxiliar_partida.getFecha_inicio());
            fecha_actual.setText(nodoAuxiliar_partida.getFecha_actual() );
            Piezas_jugador1.setText(nodoAuxiliar_partida.getJugador1().ObtenerPiezasCadena() );
            Piezas_jugador2.setText(nodoAuxiliar_partida.getJugador2().ObtenerPiezasCadena() );
            Piezas_pote.setText(nodoAuxiliar_partida.getPote().ObtenerPiezasCadena() );

            //introduciendo en la sub etiqueta "partida" de lista partida
            Partida.addContent(creador);
            Partida.addContent(id_partida);
            Partida.addContent(fecha_inicio);
            Partida.addContent(fecha_actual);
            Partida.addContent(Piezas_jugador1);
            Partida.addContent(Piezas_jugador2);
            Partida.addContent(Piezas_pote);

            //Partida.addContent(Partida);
            
            // }del while de partidas  */
            Jugadores.addContent(Partida);

 //----------------------------------------------------------------------------
            }
           
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
        } //del while jugadores

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

    
  
    


    public static Lista_Pieza Conversor_cadena_partida (String cad){

        Lista_Pieza l_pieza = new Lista_Pieza();
        Pieza pieza_temporal = new Pieza();
        String [] cadena;
        int h;
        cadena = cad.split(":");
        String [] a;
        int borrar;
        //---------------------
        for (h=0;h<cadena.length;h++){
                // x1-y1
            a = (cadena[h]).split("-");

            pieza_temporal.setPintaSuperior(Integer.parseInt(a[0]) );
            pieza_temporal.setPintaSuperior(Integer.parseInt(a[1]) );
            l_pieza.agregarPieza(pieza_temporal);

        }
        return l_pieza;

    }  

}

