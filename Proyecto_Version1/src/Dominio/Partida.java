/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Mi PC
 */
public class Partida {
    private int id_partida;
    private Calendar fecha_inicio;
    private Calendar fecha_actual;
    private Lista_Pieza jugador1;
    private Lista_Pieza jugador2;
    private Lista_Pieza pote;


    public Partida(int id_partida/*, Calendar fecha_inicio, Calendar fecha_actual*/)
    {
        this.id_partida = id_partida;
        this.fecha_inicio = fecha_inicio;
        this.fecha_actual = fecha_actual;
        jugador1 = new Lista_Pieza();
        jugador2 = new Lista_Pieza();
        pote = new Lista_Pieza();
    }

    public Calendar getFecha_actual() {
        return fecha_actual;
    }

    public Calendar getFecha_inicio() {
        return fecha_inicio;
    }

    public int getId_partida() {
        return id_partida;
    }

    public void setFecha_actual(Calendar fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public void setFecha_inicio(Calendar fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setId_partida(int id_partida) {
        this.id_partida = id_partida;
    }

    public boolean repartirPieza()
    {
        int i=0;
        Lista_Pieza Piezas = new Lista_Pieza();
        Piezas.llenar();
        Piezas.Shuffle();
        Pieza agregada;
        for (i=0; i<=13; i++)
        {
            if (i < 7)
            {
                agregada = Piezas.obtenerPieza();
                jugador1.agregarPieza(agregada);
                Piezas.quitarPieza(agregada);

            }
            else
            {
                agregada = Piezas.obtenerPieza();
                jugador2.agregarPieza(agregada);
                Piezas.quitarPieza(agregada);
            }
                //<>
        }
        pote = Piezas;
        pote.imprimirColeccion();
        System.out.println("jugador1");
        jugador1.imprimirColeccion();
        System.out.println("jugador2");
        jugador2.imprimirColeccion();

        return (false);


    }




}

