/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

import java.awt.Color;

public class Articulo {
    
    private String titulo;
    private Color color;
    private String descripcion;
    private String editorial;
    private double size;
    private double puntuacion;
    private String registro;

    public Articulo() {
    }

    public Articulo(String titulo, Color color, String descripcion, String editorial, double size, double puntuacion, String registro) {
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.size = size;
        this.puntuacion = puntuacion;
        this.registro = registro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return ""+titulo;
    }
    
    
}
