/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//import Cliente.presentacion.VentanaCrearPartida;

package Cliente.datos;
import Cliente.presentacion.VentanaCrearPartida.*;

/**
 *
 * @author Blacky G
 */
public class TableroPermanente {


  public static PiedraEnTablero[][] Tablero = new PiedraEnTablero[8][12];
//  public static PiedraEnTablero PiedraTemporal = new PiedraEnTablero();
  public static int PuntaActivada = 0;
  public static boolean SepusoPrimeraPieza = false;


  

public static boolean ValidacionCruz (PiedraEnTablero Piedra,String PuntaSeleccionada,int FilaExm,int ColumExm,String PuntaEnMesa){
    //punta en mesa: la que es necesaria para q combine con la ficha que envio
    //punta seleccionada :la que creo que combina
     //----------
      boolean SeIntrodujo = false;
      //---------------

      //----------------------------
      if ( (Tablero[FilaExm][ColumExm].getNumUnoPos().equals(PuntaEnMesa)==true )||
                (Tablero[FilaExm][ColumExm].getNumDosPos().equals(PuntaEnMesa)==true) ){
             System.out.println("uno de los de la mesa tiene "+PuntaEnMesa);

 

          //si el numero 1 es sur
           //SI LA PUNTA A EXAMINAR ES DEL TIPO QUE KIERO
          if (Tablero[FilaExm][ColumExm].getNumUnoPos().equals(PuntaEnMesa)==true ){
                   

              // los dos numeros de la piedra
              if (Piedra.getNumUnoPos().equals(PuntaSeleccionada)&&
                     (Piedra.getNumUno()==Tablero[FilaExm][ColumExm].getNumUno())&&
                          Tablero[FilaExm][ColumExm].isNumUnoPunta()==true ){
          
                  System.out.println("maaachhh");
                  //se establece cual sera la nueva punta
                  Tablero[FilaExm][ColumExm].setNumUnoPunta(false);//se cambia la del tablero
         
                  PuntaActivada=2;
                  //se confirma la validacion
                  SeIntrodujo = true;
              }

              if (Piedra.getNumDosPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumDos()==Tablero[FilaExm][ColumExm].getNumUno()&&
                         Tablero[FilaExm][ColumExm].isNumUnoPunta()==true ){
                  System.out.println("maaachhh");
                  //    Tablero[Fila][Columna]=Piedra;
                     Tablero[FilaExm][ColumExm].setNumUnoPunta(false);//se cambia la del tablero
                     //la punta ahora es la opuesta
         //            Piedra.setNumUnoPunta(true);
                   PuntaActivada=1;

                     //se confirma la validacion
                      SeIntrodujo = true;
              }
          }
              //------------------------

         //si el numero 2 es sur
               
          if (Tablero[FilaExm][ColumExm].getNumDosPos().equals(PuntaEnMesa)==true ){
                
              // las dos de la piedra
              if (Piedra.getNumUnoPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumUno()==Tablero[FilaExm][ColumExm].getNumDos()&&
                       Tablero[FilaExm][ColumExm].isNumDosPunta()==true){

                   Tablero[FilaExm][ColumExm].setNumDosPunta(false);

                  System.out.println("maaachhh");
                
                  PuntaActivada=2;
                  SeIntrodujo = true;
              }
              if (Piedra.getNumDosPos().equals(PuntaSeleccionada)&&
                      Piedra.getNumDos()==Tablero[FilaExm][ColumExm].getNumDos()&&
                       Tablero[FilaExm][ColumExm].isNumDosPunta()==true){

                   Tablero[FilaExm][ColumExm].setNumDosPunta(false);

                  System.out.println("maaachhh");
                   PuntaActivada=1;
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
       if  (Tablero[Fila-1][Columna].isHayPieza()==false) 
               lados=lados + 1;
         System.out.println("primero");
       if (Tablero[Fila+1][Columna].isHayPieza()==false) 
               lados=lados + 1;
         System.out.println("segundo");
      if  (Tablero[Fila][Columna-1].isHayPieza()==false)
               lados=lados + 1;
         System.out.println("tercero");
      if  (Tablero[Fila][Columna+1].isHayPieza()==false)
               lados=lados + 1;
       //si los cuatro son vacios la pieza que pongo tiene como punta las do
       
      if  (lados == 4){

          PuntaActivada=3;
          if (SepusoPrimeraPieza==false) 
          {
              SepusoPrimeraPieza = true;
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

      if (Tablero[Fila][Columna].isHayPieza()==true) val = 0;//para que no sobreescriba

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
  

      Tablero[Fila][Columna]=Piedra;

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

}



