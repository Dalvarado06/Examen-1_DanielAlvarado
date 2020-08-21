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

    public Gerente(String nombreUsuario, String password, String cargo, String nombre, int edad, String sexo, String estadoCivil, double altura, double peso) {
        super(estadoCivil, nombre, edad, sexo, estadoCivil, altura, peso);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.cargo = cargo;
    }

    Gerente(String text, String text0, String text1, String sexo, String estadoC, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return "Gerente{" + "nombreUsuario=" + nombreUsuario + ", password=" + password + ", cargo=" + cargo + '}';
    }
    
    
}
