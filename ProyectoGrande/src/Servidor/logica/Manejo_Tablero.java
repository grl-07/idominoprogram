/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor.logica;
import Cliente.logica.*;
import Cliente.datos.PiedraEnTablero;

/**
 *
 * @author Blacky G
 */
public class Manejo_Tablero {



    public static boolean ValidacionCruz (PiedraEnTablero Piedra,String PuntaSeleccionada,int FilaExm,int ColumExm,String PuntaEnMesa){
    //punta en mesa: la que es necesaria para q combine con la ficha que envio
    //punta seleccionada :la que creo que combina
     //----------
      boolean SeIntrodujo = false;
      //---------------

      //----------------------------
      if ( (Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumUnoPos().equals(PuntaEnMesa)==true )||
                (Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumDosPos().equals(PuntaEnMesa)==true) ){
             System.out.println("uno de los de la mesa tiene "+PuntaEnMesa);



          //si el numero 1 es sur
           //SI LA PUNTA A EXAMINAR ES DEL TIPO QUE KIERO
          if (Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumUnoPos().equals(PuntaEnMesa)==true ){


              // los dos numeros de la piedra
              if (Piedra.getNumUnoPos().equals(PuntaSeleccionada)&&
                     (Piedra.getNumUno()==Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumUno())&&
                          Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].isNumUnoPunta()==true ){

                  System.out.println("maaachhh");
                  //se establece cual sera la nueva punta
                  Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].setNumUnoPunta(false);//se cambia la del tablero

                  Cliente.datos.TableroPermanente.PuntaActivada=2;
                  //se confirma la validacion
                  SeIntrodujo = true;
              }

              if (Piedra.getNumDosPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumDos()==Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumUno()&&
                         Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].isNumUnoPunta()==true ){
                  System.out.println("maaachhh");
                  //    Tablero[Fila][Columna]=Piedra;
                     Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].setNumUnoPunta(false);//se cambia la del tablero
                     //la punta ahora es la opuesta
         //            Piedra.setNumUnoPunta(true);
                   Cliente.datos.TableroPermanente.PuntaActivada=1;

                     //se confirma la validacion
                      SeIntrodujo = true;
              }
          }
              //------------------------

         //si el numero 2 es sur

          if (Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumDosPos().equals(PuntaEnMesa)==true ){

              // las dos de la piedra
              if (Piedra.getNumUnoPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumUno()==Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumDos()&&
                      Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].isNumDosPunta()==true){

                   Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].setNumDosPunta(false);

                  System.out.println("maaachhh");

                  Cliente.datos.TableroPermanente.PuntaActivada=2;
                  SeIntrodujo = true;
              }
              if (Piedra.getNumDosPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumDos()==Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].getNumDos()&&
                       Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].isNumDosPunta()==true){

                   Cliente.datos.TableroPermanente.Tablero[FilaExm][ColumExm].setNumDosPunta(false);

                  System.out.println("maaachhh");
                   Cliente.datos.TableroPermanente.PuntaActivada=1;
                      SeIntrodujo = true;
              }
              //------------------------
          }
      }//cruz normal arriba , vertical tambien
      return SeIntrodujo;
    }//fin del metodo


public static boolean ValidacionGeneral(PiedraEnTablero Piedra,String PosicionCadena){

     boolean Valida = false;
     int val = 0,lados=0;
    //desglosando la cadena para fila y columna
      String[] Cadena = new String [1];
      Cadena = PosicionCadena.split("-");
      int Fila = Integer.valueOf(Cadena[0]);
      int Columna = Integer.valueOf(Cadena[1]);
      System.out.println("AFila  " + Fila);
 System.out.println("Acolumna "+Columna);

  //----------------------------------------------------
 System.out.println("comienzo");
       if  (Cliente.datos.TableroPermanente.Tablero[Fila-1][Columna].isHayPieza()==false)
               lados=lados + 1;
         System.out.println("primero");
       if (Cliente.datos.TableroPermanente.Tablero[Fila+1][Columna].isHayPieza()==false)
               lados=lados + 1;
         System.out.println("segundo");
      if  (Cliente.datos.TableroPermanente.Tablero[Fila][Columna-1].isHayPieza()==false)
               lados=lados + 1;
         System.out.println("tercero");
      if  (Cliente.datos.TableroPermanente.Tablero[Fila][Columna+1].isHayPieza()==false)
               lados=lados + 1;
       //si los cuatro son vacios la pieza que pongo tiene como punta las do

      if  (lados == 4){

          Cliente.datos.TableroPermanente.PuntaActivada=3;
          if (Cliente.datos.TableroPermanente.SepusoPrimeraPieza==false)
          {
              Cliente.datos.TableroPermanente.SepusoPrimeraPieza = true;
          }
       else
          {
              lados = 8; //un numero cualqueira

          }

      }     //Piedra.setNumDosPunta(true);
   //----------------------------------------------------

  if ((lados!=4)&&(lados!=8)){

      //verifica si es vertical
      if ( (Piedra.getNumUnoPos().equals("norte")) || (Piedra.getNumDosPos().equals("norte"))  ){

         //cuando la pieza esta verticalmente enzima de ella
         if  (ValidacionCruz(Piedra,"norte",Fila-1,Columna,"sur")==true) val=1;

          if  (ValidacionCruz(Piedra,"norte",Fila,Columna-1,"este")==true) val=1;

          if  (ValidacionCruz(Piedra,"norte",Fila,Columna+1,"oeste")==true) val=1;

         if (ValidacionCruz (Piedra,"sur",Fila,Columna+1,"oeste")==true) val=1;

         if (ValidacionCruz (Piedra,"sur",Fila,Columna-1,"este")==true) val=1;

         //cuando la pieza esta verticalmente debajo de ella
         if (ValidacionCruz (Piedra,"sur",Fila+1,Columna,"norte")==true) val=1;

      }
     //cuando las dos piezas (mesa y selec) estan horizontales

      if ( (Piedra.getNumUnoPos().equals("este")) || (Piedra.getNumDosPos().equals("este"))  ){
         if  (ValidacionCruz(Piedra,"este",Fila,Columna+1,"oeste")==true)val=1;

           if  (ValidacionCruz(Piedra,"este",Fila,Columna+1,"norte")==true)val=1;

         if  (ValidacionCruz(Piedra,"este",Fila,Columna+1,"sur")==true)val=1;


         if  (ValidacionCruz(Piedra,"oeste",Fila,Columna-1,"este")==true)val=1;

          if  (ValidacionCruz(Piedra,"oeste",Fila,Columna-1,"norte")==true)val=1;

         if  (ValidacionCruz(Piedra,"oeste",Fila,Columna-1,"sur")==true)val=1;


      }
    }

      if (Cliente.datos.TableroPermanente.Tablero[Fila][Columna].isHayPieza()==true) val = 0;//para que no sobreescriba

      if ((val==0)&&(lados!=4)) Valida=false;

      if ((val ==1)||(lados==4)) Valida=true;//si entra


      return Valida;

}


  public static void insertarPiedraBotonEnTablero (PiedraEnTablero Piedra,String PosString){


        //DESGLOSE DE POSICION (lo hace bien :)

      String[] Cadena = new String [1];

      Cadena = PosString.split("-");
      int Fila = Integer.valueOf(Cadena[0]);
      int Columna = Integer.valueOf(Cadena[1]);


      Cliente.datos.TableroPermanente.Tablero[Fila][Columna]=Piedra;

  }

public static PiedraEnTablero ReubicacionPuntas (PiedraEnTablero PiedraTemp){

         if (Cliente.datos.TableroPermanente.PuntaActivada==3){
                PiedraTemp.setNumUnoPunta(true);
                PiedraTemp.setNumDosPunta(true);
            }
            if (Cliente.datos.TableroPermanente.PuntaActivada==2){
                PiedraTemp.setNumDosPunta(true);
            }
            if (Cliente.datos.TableroPermanente.PuntaActivada==1){
                PiedraTemp.setNumUnoPunta(true);
            }

  return PiedraTemp;
}

public static int ConversionPosicionCadenaA(String CadenaA ,int opcion){

          //DESGLOSE DE POSICION (lo hace bien :)

      String[] Cadena = new String [1];
      int resul=0;

      Cadena = CadenaA.split("-");

      if (opcion ==1)
      resul = Integer.valueOf(Cadena[0]);
      if (opcion==2)
      resul= Integer.valueOf(Cadena[1]);

      return resul;
}


}







