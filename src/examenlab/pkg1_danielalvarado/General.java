/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

public class General extends Persona {
    
    private String ocupacion;
    private String horario;
    private int semanasTrabajando;
    private double sueldo;

    public General() {
        super();
    }

    public General(String ocupacion, String horario, int semanasTrabajando, double sueldo, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanasTrabajando = semanasTrabajando;
        this.sueldo = sueldo;
    }

    public General(String ocupacion, String horario, int semanasTrabajando, double sueldo, String identificacion, String nombre, int edad, String sexo, String estadoCivil, double altura, double peso) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanasTrabajando = semanasTrabajando;
        this.sueldo = sueldo;
    }

    

    

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanasTrabajando() {
        return semanasTrabajando;
    }

    public void setSemanasTrabajando(int semanasTrabajando) {
        this.semanasTrabajando = semanasTrabajando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    @Override
    public String toString() {
        return ""+super.toString();
    }
    
    
}
