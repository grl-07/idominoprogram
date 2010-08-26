package Servidor.logica;

import Servidor.datos.Pieza;
import Servidor.datos.Jugador;
//import Servidor.logica.Comunicacion;
import java.util.Calendar;
import ve.edu.ucab.server.logica.LogicaServidor;
import Servidor.datos.DatosXml_Cargados;
import Servidor.datos.ListaPartida;
import Servidor.datos.Partida;
import java.util.Iterator;

public class Gestion_Juego implements LogicaServidor
{
        public String realizarOperacion(String cadena)
        {
            String[] datos = cadena.split(":");
            String pedido = datos[0];
            int opcion = Integer.parseInt(pedido);
            if (opcion == 1)
                return ingresoSistema(datos);  //Hacer un Case
            if (opcion == 2)
                return crearPartida(datos);
            if (opcion == 3)
                return registroUsuario(datos);
             if (opcion == 4)
                return guardarPartida(datos);
            if (opcion==5) 
            {
               // System.out.println(cadena);
                System.out.println("El cliente envia " + cadena);
              //  ServidorJugando.IntroducirEnvio(cadena);
               //de prueba
                return "FALSE:x1-y1:2-2:imagenArriba-imagenAbajo-imagenIzquierda-imagenDerecha:pintaS25";
            }
            if (opcion == 7)
                return agarrarPote(datos);

            
        return "FALSE";
        }

        Jugador elJugador, elJugador1;
                
        Calendar fecha;



        public String registroUsuario(String[] datos)
        {
            String nickname = datos[1];
            String clave = datos[2];
            String nombre = datos[3];
            String apellido = datos[4];
            String fechaNac = datos[5];
            String iDavatar = datos[6];


            //el problma al guardar esta aqui

          //  System.out.println("IMPRIMIR EN REGISTRO: "+nickname+clave+nombre+apellido+fechaNac+iDavatar);
            //imprime la lista de usuarios que estan cargados
         //   Comunicacion.imprimirLista();

            return Comunicacion.crearUsuario(nickname, clave, nombre, apellido, fechaNac, iDavatar);
        }

        public String guardarPartida(String[] datos)
        {
            String nickname = datos[1];
            String IDpartida = datos[2];

            return "TRUE";
        }


        public String enviarJugada(String[] datos)
        {
            String nickname = datos[1];
            String IDpartida = datos[2];
            String ficha = datos[3];

            //FALTA HACERRRRRRRRRRRRRR!!!!!!!!!!!!!!!!!!!!!

            return "TRUE";

        }
        

        public String ingresoSistema(String[] datos)
        {
            String nombre = datos[1];
            String clave = datos[2];
            //ListaJugador control = Comunicacion.getLista();
           // elJugador = new Jugador("nombre","apellido","cedula", fecha ,/*score*/3,/*ingreso*/2,/*creadas*/1,/*ganadas*/10,"stewie","1234","avatar");
            

           //ListaJugador control = Lista_Grande.Devolverlista();
            //control.agregarElemento(elJugador);

            //if (control != null)
            //{
               Jugador ingreso = Servidor.datos.DatosXml_Cargados.listaDeJugador.buscar_jugador(nombre, clave);
               
               if (ingreso != null)
               {
                   System.out.println("entro en el ingreso");
                   return "TRUE:"+ ingreso.getNombre() + ":" + ingreso.getApellido()+ ":" + ingreso.getAvatar();
               }
           //}

           return "FALSE";
        }


         public String agarrarPote(String [] datos)
        {
            String nickname = datos [1];

            System.out.println("voy a imprimir en agarrar pote");

            //Comunicacion.getListaPote(nickname).imprimirPiezas
             ListaPartida partidas = DatosXml_Cargados.listaDeJugador.buscar_jugador_nick(nickname).getMis_partidas() ;
             Iterator iteradorPartida = partidas.getIterator();
             Partida PartJugador = (Partida)iteradorPartida.next();
             Pieza PiezaDelPote = PartJugador.getPote().obtenerPiezaindice(0);

             
             if (PartJugador.getPote().ListaVacia()==true) return "null";
             if (PartJugador.getPote().ListaVacia()==false) {
                 
                PartJugador.getPote().quitarPieza(PiezaDelPote);
                PartJugador.getJugador1().agregarPieza(PiezaDelPote);

                Servidor.datos.Manejo_archivo.guardarJugadorXML(Servidor.datos.DatosXml_Cargados.listaDeJugador,partidas);

            }
                 
            return (PiezaDelPote.PiezaEnCadena());
        }



        public String crearPartida(String[] datos)
        {
            String nick = datos[1];
            String fecha_a = datos[2];
            return Comunicacion.nuevaPartida(nick, fecha_a); //Falta hacer fecha
        }

   //     public String obtenerNick (String [] datos)
   //     {
   //         String nombre = datos[1];
   //         return Comunicacion.obtenerNickJugador(nombre);
   //     }


}