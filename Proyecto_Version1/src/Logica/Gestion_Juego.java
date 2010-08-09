package logica;
import Dominio.*;
import ve.edu.ucab.server.logica.LogicaServidor;


public class Gestion_Juego implements LogicaServidor
{
        public String realizarOperacion(String cadena)
        {
            String[] pedazo_de_cadena = cadena.split(":");
            Visita_Jugador_Temporal j_visita = new Visita_Jugador_Temporal(0,"");

            // pasa el primer digito de la cadena recibida a un numero
            j_visita.setId(Integer.parseInt(pedazo_de_cadena[0]));
            // pasa la segunda parte que es el nombre;
            j_visita.setNombre(pedazo_de_cadena[1]);
        return realizarReserva(j_visita);
        }

        public String realizarReserva(Visita_Jugador_Temporal j_visita)
        {
            String resultado = "TRUE";
            System.out.println("La reserva " + j_visita.getNombre() + " se ha efectuado");
        return resultado;
        }
}