/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

import java.awt.Color;

public class Figura extends Articulo{
    
    private String descripcionFigura;
    private String instrucciones;
    private int garantia;

    public Figura() {
        super();
    }

    public Figura(String descripcionFigura, String instrucciones, int garantia, String titulo, Color color, String descripcion, String editorial, double size, double puntuacion, String registro) {
        super(titulo, color, descripcion, editorial, size, puntuacion, registro);
        this.descripcionFigura = descripcionFigura;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }
    
    
    

    public String getDescripcionFigura() {
        return descripcionFigura;
    }

    public void setDescripcionFigura(String descripcionFigura) {
        this.descripcionFigura = descripcionFigura;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Figura{" + "descripcionFigura=" + descripcionFigura + ", instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }
    
    
}
