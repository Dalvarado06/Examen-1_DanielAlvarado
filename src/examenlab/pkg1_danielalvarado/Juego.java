/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

import java.awt.Color;

public class Juego extends Articulo{
    
    private int edicionJuego;
    private String casaElaboracion;
    private String pais;

    public Juego() {
        super();
    }

    public Juego(int edicionJuego, String casaElaboracion, String pais, String titulo, Color color, String descripcion, String editorial, double size, double puntuacion, String registro) {
        super(titulo, color, descripcion, editorial, size, puntuacion, registro);
        this.edicionJuego = edicionJuego;
        this.casaElaboracion = casaElaboracion;
        this.pais = pais;
    }

    public int getEdicionJuego() {
        return edicionJuego;
    }

    public void setEdicionJuego(int edicionJuego) {
        this.edicionJuego = edicionJuego;
    }

    public String getCasaElaboracion() {
        return casaElaboracion;
    }

    public void setCasaElaboracion(String casaElaboracion) {
        this.casaElaboracion = casaElaboracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return ""+super.toString();
    }
    
    
}
