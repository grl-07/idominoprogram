/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dominio;
import java.util.Calendar;

/**
 *
 * @author Mi PC
 */
public class Partida {
    private int id_partida;
    private Calendar fecha_inicio;
    private Calendar fecha_actual;

    public Partida(int id_partida, Calendar fecha_inicio, Calendar fecha_actual)
    {
        this.id_partida = id_partida;
        this.fecha_inicio = fecha_inicio;
        this.fecha_actual = fecha_actual;
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


}

