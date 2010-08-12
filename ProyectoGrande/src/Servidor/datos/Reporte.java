/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.datos;

/**
 *
 * @author Diego
 */
public class Reporte {

    private String nombre;
    private String numero;

    public Reporte(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
