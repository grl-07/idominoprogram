/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mi PC
 */
public class Partida {
    private int id_partida;
    private String creador;
    private String fecha_inicio;
    private String fecha_actual;
    private Lista_Pieza jugador1;
    private Lista_Pieza jugador2;
    private Lista_Pieza pote;


    public Partida(String creador, int id_partida/*, Calendar fecha_inicio, Calendar fecha_actual*/)
    {
        this.id_partida = id_partida;
        this.fecha_inicio = fecha_inicio;
        this.fecha_actual = fecha_actual;
        jugador1 = new Lista_Pieza();
        jugador2 = new Lista_Pieza();
        pote = new Lista_Pieza();
        this.creador = creador;
    }


    

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Lista_Pieza getJugador1() {
        return jugador1;
    }

    public void setJugador1(Lista_Pieza jugador1) {
        this.jugador1 = jugador1;
    }

    public Lista_Pieza getJugador2() {
        return jugador2;
    }

    public void setJugador2(Lista_Pieza jugador2) {
        this.jugador2 = jugador2;
    }

    public Lista_Pieza getPote() {
        return pote;
    }

    public void setPote(Lista_Pieza pote) {
        this.pote = pote;
    }


    public String getFecha_actual() {
        return fecha_actual;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public int getId_partida() {
        return id_partida;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setId_partida(int id_partida) {
        this.id_partida = id_partida;
    }

    public Lista_Pieza repartirPieza()
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
        /*pote.imprimirColeccion();
        System.out.println("jugador1");
        jugador1.imprimirColeccion();
        System.out.println("jugador2");
        jugador2.imprimirColeccion();*/

        return jugador1;
    }
    
    public Lista_Pieza obtenerPiezasRestantes(int control)
    {
        if (control == 1)
          return jugador2;
        return pote;
    }


    public String listaDePiezas()
    {
        Pieza pieza = jugador1.obtenerPieza();
        String lista = "";
        int i = 0;
        while (i < jugador1.dimension())
        {
            pieza = jugador1.obtenerPiezaindice(i);
            if (lista == "")
                lista = pieza.getPintaSuperior() + "-" + pieza.getPintainferior();
            else
                lista = lista + ":" + pieza.getPintaSuperior() + "-" + pieza.getPintainferior();
            i++;
        }
        return lista;
    }




}

