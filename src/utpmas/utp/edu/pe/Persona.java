/*
 * Interface de Persona
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utpmas.utp.edu.pe;

import java.util.Date;

/**
 *
 * @author DAVID SILVA C
 */
public abstract class Persona {
    //atributos
    private String nombres;
    private String apellidos;
    private String dni;
    private char genero;
    private String fechanacimiento;
    
    //constantes
    
    //contructores
    
    //metodos abstractos
    
    //getters and setters

    public String getNombres() {
        return nombres;
    }

    public Persona(String nombres, String apellidos, String dni, char genero, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.genero = genero;
        this.fechanacimiento = fechanacimiento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

 
    
    
    
}
