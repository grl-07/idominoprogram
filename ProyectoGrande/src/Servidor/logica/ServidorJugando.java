/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.logica;

//import Cliente.datos.PiedraEnTablero;

import Servidor.datos.PiedraEnTablero;


/**
 *
 * @author Blacky G
 */
public class ServidorJugando {


    public static void IntroducirEnvio (String MensajeLLegada){

     //   5:nickname:x-y;posX-posY:imageSeleccionada
                //si no es punto y coma modificar aqui
      

          String[] Mensaje = new String [2];
          String[] Datos = new String [2];
          String[] Datos2 = new String [2];
          String[] Cadena = new String [1];
          PiedraEnTablero PiedraTemporal = new PiedraEnTablero();

          Mensaje = MensajeLLegada.split(";");

         Datos = Mensaje[1].split(":");

          PiedraTemporal.InsertarPiedraCadenaRuta(Datos[1]);

          Datos2 = Mensaje[0].split(":");

          //----------desgloseee de cadena posicion

         Cadena = Datos2[1].split("-");
         int Fila = Integer.valueOf(Cadena[0]);
         int Columna = Integer.valueOf(Cadena[1]);

     //    Servidor.datos.TableroPermanente.Tablero[Fila][Columna].InsertarPiedraCadenaRuta(Datos[2]);




          
    }
    
}
