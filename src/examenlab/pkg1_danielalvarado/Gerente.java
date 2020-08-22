/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab.pkg1_danielalvarado;

public class Gerente extends Persona {
    
    private String nombreUsuario;
    private String password;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String nombreUsuario, String password, String cargo, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.cargo = cargo;
    }

    public Gerente(String nombreUsuario, String password, String cargo, String identificacion, String nombre, int edad, String sexo, String estadoCivil, double altura, double peso) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.cargo = cargo;
    }

    

    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return ""+ super.toString();
    }
    
    
}
