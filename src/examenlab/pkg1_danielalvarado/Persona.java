/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;
import java.util.ArrayList;

public class Persona {
    private String identificacion;
    private String nombre;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private double altura;
    private double peso;
    private ArrayList<Mensaje> buzon = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String identificacion, String nombre, int edad, String sexo, String estadoCivil, double altura, double peso) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Mensaje> getBuzon() {
        return buzon;
    }

    public void setBuzon(ArrayList<Mensaje> buzon) {
        this.buzon = buzon;
    }

    @Override
    public String toString() {
        return  "" + nombre;
    }
    
    
    
}
