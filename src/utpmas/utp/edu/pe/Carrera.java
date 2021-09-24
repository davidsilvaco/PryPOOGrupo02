/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Carrera {
    //variables
    private String codigocarrera;
    private String nombrecarrera;
    //contructor
    public Carrera(String codigocarrera, String nombrecarrera) {
        this.codigocarrera = codigocarrera;
        this.nombrecarrera = nombrecarrera;
    }
    //Getters and Setters
    public String getCodigocarrera() {
        return codigocarrera;
    }
    public void setCodigocarrera(String codigocarrera) {
        this.codigocarrera = codigocarrera;
    }
    public String getNombrecarrera() {
        return nombrecarrera;
    }
    public void setNombrecarrera(String nombrecarrera) {
        this.nombrecarrera = nombrecarrera;
    }

    @Override
    public String toString() {
        return "Carrera [codigocarrera=" + codigocarrera + ", nombrecarrera=" + nombrecarrera + "]";
    }
    
        
}
