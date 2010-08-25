/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente.datos;

/**
 *
 * @author Blacky G
 */
public class PiedraEnTablero {

    private int numUno;
    private int numDos;
    private String numUnoPos;
    private String numDosPos;
    private boolean numUnoPunta;
    private boolean numDosPunta;
    private boolean HayPieza;

    public PiedraEnTablero() {
        this.numUno = 0;
        this.numDos = 0;
        this.numUnoPos = "";
        this.numDosPos = "";
        this.numUnoPunta = false;
        this.numDosPunta = false;

        this.HayPieza = false;

        
    }

    public boolean isHayPieza() {
        return HayPieza;
    }

    public void setHayPieza(boolean HayPieza) {
        this.HayPieza = HayPieza;
    }

    public int getNumDos() {
        return numDos;
    }

    public void setNumDos(int numDos) {
        this.numDos = numDos;
    }

    public String getNumDosPos() {
        return numDosPos;
    }

    public void setNumDosPos(String numDosPos) {
        this.numDosPos = numDosPos;
    }

    public int getNumUno() {
        return numUno;
    }

    public void setNumUno(int numUno) {
        this.numUno = numUno;
    }

    public String getNumUnoPos() {
        return numUnoPos;
    }

    public void setNumUnoPos(String numUnoPos) {
        this.numUnoPos = numUnoPos;
    }

    public boolean isNumDosPunta() {
        return numDosPunta;
    }

    public void setNumDosPunta(boolean numDosPunta) {
        this.numDosPunta = numDosPunta;
    }

    public boolean isNumUnoPunta() {
        return numUnoPunta;
    }

    public void setNumUnoPunta(boolean numUnoPunta) {
        this.numUnoPunta = numUnoPunta;
    }

    

public void InsertarPiedraCadenaRuta (String rutaImagen){

      String[] Cadena = new String[1];
      String NombreImagen,numeros;
      char x;
      Cadena = rutaImagen.split("png");
      NombreImagen = Cadena[0];

      System.out.println("Luego del split" + NombreImagen);
      //agarra el numero
       // x = rutaImagen.charAt(NombreImagen.length() - 3);

       if (rutaImagen.contains("S")==true){

           this.numUno = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 3));
           this.numDos =  Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 2));
           this.numUnoPos = "norte";
           this.numDosPos = "sur";
           this.HayPieza = true;
       }
       if  (rutaImagen.contains("In")==true){
           this.numUno = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 3));
           this.numDos = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 2));
           this.numUnoPos = "sur";
           this.numDosPos = "norte";
           this.HayPieza = true;
       }
        if  (rutaImagen.contains("D")==true){
           this.numUno = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 3));
           this.numDos = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 2));
           this.numUnoPos = "este";
           this.numDosPos = "oeste";
           this.HayPieza = true;
       }
        if  (rutaImagen.contains("Iz")==true){
           this.numUno = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 3));
           this.numDos = Integer.valueOf(""+rutaImagen.charAt(NombreImagen.length() - 2));
           this.numUnoPos = "oeste";
           this.numDosPos = "este";
           this.HayPieza = true;
       }


}

}
