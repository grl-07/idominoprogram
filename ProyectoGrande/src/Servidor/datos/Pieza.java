package Servidor.datos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_A112
 */
public class Pieza {

    private int ID;
    private int pintaSuperior;
    private int pintainferior;
    private String imagenpintaD;
    private String imagenpintaIz;
    private String imagenpintaS;
    private String imagenpintaIn;
    private String imagenActualSelect;
    private int indiceImagen;

    public Pieza() {
        this.ID = 0;
        this.pintaSuperior = 0;
        this.pintainferior = 0;
        this.imagenpintaD = "";
        this.imagenpintaIz = "";
        this.imagenpintaS = "";
        this.imagenpintaIn = "";
        this.imagenActualSelect = "";
        this.indiceImagen = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImagenActualSelect() {
        return imagenActualSelect;
    }

    public void setImagenActualSelect(String imagenActualSelect) {
        this.imagenActualSelect = imagenActualSelect;
    }

    public String getImagenpintaD() {
        return imagenpintaD;
    }

    public void setImagenpintaD(String imagenpintaD) {
        this.imagenpintaD = imagenpintaD;
    }

    public String getImagenpintaIn() {
        return imagenpintaIn;
    }

    public void setImagenpintaIn(String imagenpintaIn) {
        this.imagenpintaIn = imagenpintaIn;
    }

    public String getImagenpintaIz() {
        return imagenpintaIz;
    }

    public void setImagenpintaIz(String imagenpintaIz) {
        this.imagenpintaIz = imagenpintaIz;
    }

    public String getImagenpintaS() {
        return imagenpintaS;
    }

    public void setImagenpintaS(String imagenpintaS) {
        this.imagenpintaS = imagenpintaS;
    }

    public int getIndiceImagen() {
        return indiceImagen;
    }

    public void setIndiceImagen(int indiceImagen) {
        this.indiceImagen = indiceImagen;
    }

    public int getPintaSuperior() {
        return pintaSuperior;
    }

    public void setPintaSuperior(int pintaSuperior) {
        this.pintaSuperior = pintaSuperior;
    }

    public int getPintainferior() {
        return pintainferior;
    }

    public void setPintainferior(int pintainferior) {
        this.pintainferior = pintainferior;
    }









}
