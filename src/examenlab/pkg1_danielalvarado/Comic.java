/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

import java.awt.Color;

public class Comic extends Articulo{
    
    private int numVolumen;
    private String descripcionProducto;
    private int estado;

    public Comic() {
    }

    public Comic(String titulo, Color color, String descripcion, String editorial, double size, double puntuacion, String registro) {
        super(titulo, color, descripcion, editorial, size, puntuacion, registro);
    }
    
    

    public Comic(int numVolumen, String descripcionProducto, int estado, String titulo, Color color, String descripcion, String editorial, double size, double puntuacion, String registro) {
        super(titulo, color, descripcion, editorial, size, puntuacion, registro);
        this.numVolumen = numVolumen;
        this.descripcionProducto = descripcionProducto;
        this.estado = estado;
    }

   
    

    public int getNumVolumen() {
        return numVolumen;
    }

    public void setNumVolumen(int numVolumen) {
        this.numVolumen = numVolumen;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if(estado <= 10){
            this.estado = estado;
        }
    }
    
    
    @Override
    public String toString() {
        return ""+super.toString();
    }

    
    
    
}
