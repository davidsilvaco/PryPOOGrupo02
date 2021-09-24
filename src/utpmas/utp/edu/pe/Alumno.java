/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * * and open the template in the editor.
 */
package utpmas.utp.edu.pe;

/**
 *
 * @author DAVID
 */
public class Alumno extends Persona implements Constantes{
    //Variables
    private String codigoalumno;
    private String correoalumno;
    //Constantes
    
    //Construnctores

    public Alumno(String nombres, String apellidos, String dni, char genero, String fechanacimiento,
            String codigoalumno, String correoalumno) {
        super(nombres, apellidos, dni, genero, fechanacimiento);
        this.codigoalumno = codigoalumno;
        this.correoalumno = correoalumno;
    }
    public Alumno(String nombres, String apellidos, String dni, char genero, String fechanacimiento,
            String codigoalumno) {
        super(nombres, apellidos, dni, genero, fechanacimiento);
        this.codigoalumno = codigoalumno;
        this.correoalumno = codigoalumno + DOMINIO_CORREO;
    }

    
    //Getters And Stters
    public String getCodigoalumno() {
        return codigoalumno;
    }



    public void setCodigoalumno(String codigoalumno) {
        this.codigoalumno = codigoalumno;
    }

    public String getCorreoalumno() {
        return correoalumno;
    }

    public void setCorreoalumno(String correoalumno) {
        this.correoalumno = correoalumno;
    }    
    //metodos


    @Override
    public String toString() {
        return "Persona [codigoalumno=" + codigoalumno + "apellidos=" + this.getApellidos()
        + ", nombres=" + this.getNombres() + ", dni=" + this.getDni()  + ", genero=" 
        + this.getGenero() + ", fechanacimiento=" + this.getFechanacimiento() +", fechanacimiento=" +correoalumno+ "]";
    }
    
    
    
}
