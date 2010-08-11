package Logica;
import Dominio.*;
import java.util.Calendar;
import ve.edu.ucab.server.logica.LogicaServidor;


public class Gestion_Juego implements LogicaServidor
{
        public String realizarOperacion(String cadena)
        {
//            Comunicacion.setLista();
            String[] datos = cadena.split(":");
            String pedido = datos[0];
            int opcion = Integer.parseInt(pedido);
            if (opcion == 1){
                //System.out.println("entro al opcion");
                return ingresoSistema(datos);}  //Hacer un Case
            if (opcion == 2){
                //System.out.println("entro al opcion");
                return crearPartida(datos);}
            return "False";
        }

        Jugador elJugador, elJugador1;
                
        Calendar fecha;

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
               Jugador ingreso = Comunicacion.getListaDeJugador().buscar_jugador(nombre, clave);
               
               if (ingreso != null)
               {
                   System.out.println("entro en el ingreso");
                   return "TRUE:"+ ingreso.getNombre() + ":" + ingreso.getApellido()+ ":" + ingreso.getAvatar();
               }
           //}

           return "FALSE";
        }
        
        public String crearPartida(String[] datos)
        {
            String nick = datos[1];
            String fecha = datos[2];
            return Comunicacion.nuevaPartida(nick, fecha); //Falta hacer fecha
        }


}